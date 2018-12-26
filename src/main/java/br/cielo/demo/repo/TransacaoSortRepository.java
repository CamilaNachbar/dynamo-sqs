package br.cielo.demo.repo;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import br.cielo.demo.model.TransacaoRequisicaoPlataformaTransferenciaSort;

@EnableScan
public interface TransacaoSortRepository extends CrudRepository<TransacaoRequisicaoPlataformaTransferenciaSort, Long> {

	public List<TransacaoRequisicaoPlataformaTransferenciaSort> findAll();
}
