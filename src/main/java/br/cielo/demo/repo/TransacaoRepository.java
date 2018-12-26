package br.cielo.demo.repo;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import br.cielo.demo.model.TransacaoRequisicaoPlataformaTransferencia;

@EnableScan
public interface TransacaoRepository extends CrudRepository<TransacaoRequisicaoPlataformaTransferencia, Long> {

	public List<TransacaoRequisicaoPlataformaTransferencia> findAll();

}
