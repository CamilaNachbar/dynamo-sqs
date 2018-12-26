package br.cielo.demo.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "transacao-sort")
public class TransacaoRequisicaoPlataformaTransferenciaSort {

	@DynamoDBHashKey(attributeName = "codigo-transacao")
	private Long codigoTransacaoPlataformaTransferencia;

	@DynamoDBAttribute(attributeName = "valor-transacao")
	private Long valorTransacaoTransferenciaOnline;

	@DynamoDBAttribute(attributeName = "codigo-tipo-servico")
	private Long codigoTipoServicoPlataforma;

	@DynamoDBAttribute(attributeName = "data-requisicao")
	private String dataRequisicaoTransferencia;

	public Long getCodigoTransacaoPlataformaTransferencia() {
		return codigoTransacaoPlataformaTransferencia;
	}

	public void setCodigoTransacaoPlataformaTransferencia(Long codigoTransacaoPlataformaTransferencia) {
		this.codigoTransacaoPlataformaTransferencia = codigoTransacaoPlataformaTransferencia;
	}

	public Long getValorTransacaoTransferenciaOnline() {
		return valorTransacaoTransferenciaOnline;
	}

	public void setValorTransacaoTransferenciaOnline(Long valorTransacaoTransferenciaOnline) {
		this.valorTransacaoTransferenciaOnline = valorTransacaoTransferenciaOnline;
	}

	public Long getCodigoTipoServicoPlataforma() {
		return codigoTipoServicoPlataforma;
	}

	public void setCodigoTipoServicoPlataforma(Long codigoTipoServicoPlataforma) {
		this.codigoTipoServicoPlataforma = codigoTipoServicoPlataforma;
	}

	public String getDataRequisicaoTransferencia() {
		return dataRequisicaoTransferencia;
	}

	public void setDataRequisicaoTransferencia(String dataRequisicaoTransferencia) {
		this.dataRequisicaoTransferencia = dataRequisicaoTransferencia;
	}

}
