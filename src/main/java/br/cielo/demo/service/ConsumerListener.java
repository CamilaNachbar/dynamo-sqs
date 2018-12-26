
package br.cielo.demo.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.core.support.documentation.RuntimeUse;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.cielo.demo.model.TransacaoRequisicaoPlataformaTransferencia;

@Component
public class ConsumerListener {

	@Autowired
	private TransacaoRequisicaoService transacaoService;

	@JmsListener(destination = "${cloud.aws.end-point.queue}")
	public void messageConsumer(@Headers Map<String, Object> messageAttributes, @Payload String message)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		TransacaoRequisicaoPlataformaTransferencia transacao = mapper.readValue(message,
				TransacaoRequisicaoPlataformaTransferencia.class);
		transacaoService.createTransacao(transacao);

	}
}
