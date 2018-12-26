package br.cielo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.cielo.demo.model.TransacaoRequisicaoPlataformaTransferencia;
import br.cielo.demo.model.TransacaoRequisicaoPlataformaTransferenciaSort;
import br.cielo.demo.repo.TransacaoRepository;
import br.cielo.demo.repo.TransacaoSortRepository;

@Service
@Transactional
public class TransacaoRequisicaoServiceImpl implements TransacaoRequisicaoService {

	@Autowired
	private TransacaoRepository repository;

	@Autowired
	private TransacaoSortRepository sortRepository;

	@Override
	public TransacaoRequisicaoPlataformaTransferencia createTransacao(
			TransacaoRequisicaoPlataformaTransferencia transacao) {
		createTransacaoSort(transacao);
		return repository.save(transacao);
	}

	@Async
	public void createTransacaoSort(TransacaoRequisicaoPlataformaTransferencia transacao) {
		TransacaoRequisicaoPlataformaTransferenciaSort sort = new TransacaoRequisicaoPlataformaTransferenciaSort();
		sort.setCodigoTipoServicoPlataforma(transacao.getCodigoTipoServicoPlataforma());
		sort.setCodigoTransacaoPlataformaTransferencia(transacao.getCodigoTransacaoPlataformaTransferencia());
		sort.setDataRequisicaoTransferencia(transacao.getDataRequisicaoTransferencia());
		sort.setValorTransacaoTransferenciaOnline(transacao.getValorTransacaoTransferenciaOnline());
		sortRepository.save(sort);
	}

}
