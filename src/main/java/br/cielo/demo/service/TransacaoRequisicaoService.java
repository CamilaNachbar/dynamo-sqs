package br.cielo.demo.service;

import org.springframework.stereotype.Component;

import br.cielo.demo.model.TransacaoRequisicaoPlataformaTransferencia;

@Component
public interface TransacaoRequisicaoService {

	public TransacaoRequisicaoPlataformaTransferencia createTransacao(
			TransacaoRequisicaoPlataformaTransferencia transacao);

	public void createTransacaoSort(TransacaoRequisicaoPlataformaTransferencia transacao);

}
