package br.cielo.demo;

import java.util.concurrent.Executor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.amazon.sqs.javamessaging.ProviderConfiguration;
import com.amazon.sqs.javamessaging.SQSConnectionFactory;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "br.cielo.demo.*")
@EnableJms
public class PocTransacoesApplication {

	private SQSConnectionFactory connectionFactory;

	public static void main(String[] args) {
		SpringApplication.run(PocTransacoesApplication.class, args);
	}

	@PostConstruct
	public void init() {
		connectionFactory = createSQSConnectionFactory();
	}

	@Value("${cloud.aws.region.static}")
	private String region;

	@Value("${amazon.aws.accesskey}")
	private String accessKey;

	@Value("${amazon.aws.secretkey}")
	private String secretKey;
	
	private SQSConnectionFactory createSQSConnectionFactory() {
		final AmazonSQS sqs = AmazonSQSAsyncClientBuilder.standard().withRegion(region)
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretKey)))
				.build();
		return new SQSConnectionFactory(new ProviderConfiguration(), sqs);
	}

	@Bean
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
		final DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		return factory;
	}

	@Bean
	public JmsTemplate defaultJmsTemplate() {
		return new JmsTemplate(connectionFactory);
	}

	@Bean
	public Executor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("GithubLookup-");
		executor.initialize();
		return executor;
	}

}
