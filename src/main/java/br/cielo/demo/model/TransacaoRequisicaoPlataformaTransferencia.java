package br.cielo.demo.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "transacao-req")
public class TransacaoRequisicaoPlataformaTransferencia {

	@DynamoDBHashKey(attributeName = "codigo-transacao")
	private Long codigoTransacaoPlataformaTransferencia;

	@DynamoDBAttribute(attributeName = "codigo-correlacional")
	private Long codigoCorrelacionalTransacaoPlataformaTransferencia;

	@DynamoDBAttribute(attributeName = "valor-transacao")
	private Long valorTransacaoTransferenciaOnline;

	@DynamoDBAttribute(attributeName = "codigo-transacao-parceiro")
	private String codigoTransacaoParceiro;

	@DynamoDBAttribute(attributeName = "codigo-bandeira")
	private Long codigoBandeira;

	@DynamoDBAttribute(attributeName = "codigo-tipo-servico")
	private Long codigoTipoServicoPlataforma;

	@DynamoDBAttribute(attributeName = "codigo-servico")
	private Long codigoServicoPlataforma;

	@DynamoDBAttribute(attributeName = "codigo-parceiro")
	private Long codigoParceiroPlataformaTransferenciaOnline;

	@DynamoDBAttribute(attributeName = "data-requisicao")
	private String dataRequisicaoTransferencia;

	public Long getCodigoTransacaoPlataformaTransferencia() {
		return codigoTransacaoPlataformaTransferencia;
	}

	public void setCodigoTransacaoPlataformaTransferencia(Long codigoTransacaoPlataformaTransferencia) {
		this.codigoTransacaoPlataformaTransferencia = codigoTransacaoPlataformaTransferencia;
	}

	public Long getCodigoCorrelacionalTransacaoPlataformaTransferencia() {
		return codigoCorrelacionalTransacaoPlataformaTransferencia;
	}

	public void setCodigoCorrelacionalTransacaoPlataformaTransferencia(
			Long codigoCorrelacionalTransacaoPlataformaTransferencia) {
		this.codigoCorrelacionalTransacaoPlataformaTransferencia = codigoCorrelacionalTransacaoPlataformaTransferencia;
	}

	public Long getValorTransacaoTransferenciaOnline() {
		return valorTransacaoTransferenciaOnline;
	}

	public void setValorTransacaoTransferenciaOnline(Long valorTransacaoTransferenciaOnline) {
		this.valorTransacaoTransferenciaOnline = valorTransacaoTransferenciaOnline;
	}

	public String getCodigoTransacaoParceiro() {
		return codigoTransacaoParceiro;
	}

	public void setCodigoTransacaoParceiro(String codigoTransacaoParceiro) {
		this.codigoTransacaoParceiro = codigoTransacaoParceiro;
	}

	public Long getCodigoBandeira() {
		return codigoBandeira;
	}

	public void setCodigoBandeira(Long codigoBandeira) {
		this.codigoBandeira = codigoBandeira;
	}

	public Long getCodigoTipoServicoPlataforma() {
		return codigoTipoServicoPlataforma;
	}

	public void setCodigoTipoServicoPlataforma(Long codigoTipoServicoPlataforma) {
		this.codigoTipoServicoPlataforma = codigoTipoServicoPlataforma;
	}

	public Long getCodigoServicoPlataforma() {
		return codigoServicoPlataforma;
	}

	public void setCodigoServicoPlataforma(Long codigoServicoPlataforma) {
		this.codigoServicoPlataforma = codigoServicoPlataforma;
	}

	public Long getCodigoParceiroPlataformaTransferenciaOnline() {
		return codigoParceiroPlataformaTransferenciaOnline;
	}

	public void setCodigoParceiroPlataformaTransferenciaOnline(Long codigoParceiroPlataformaTransferenciaOnline) {
		this.codigoParceiroPlataformaTransferenciaOnline = codigoParceiroPlataformaTransferenciaOnline;
	}

	public String getDataRequisicaoTransferencia() {
		return dataRequisicaoTransferencia;
	}

	public void setDataRequisicaoTransferencia(String dataRequisicaoTransferencia) {
		this.dataRequisicaoTransferencia = dataRequisicaoTransferencia;
	}

}
