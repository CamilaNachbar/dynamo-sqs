package br.cielo.demo.dto;

import java.io.Serializable;
import java.util.Date;

public class TransacaoRequisicaoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2732776791729109412L;

	private Long correlationId;
	private String codigoTransacaoParceiro;
	private Long codigoBandeoira;
	private Long valorTransacao;
	private Long codigoParceiro;
	private Date dataHoraRequisicao;
	private Long codigoTipoServico;
	private Long codigoServicoPlataforma;
	private Long codigoTipoPrecificacao;
	private Long codigotipoCartao;

	public Long getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(Long correlationId) {
		this.correlationId = correlationId;
	}

	public String getCodigoTransacaoParceiro() {
		return codigoTransacaoParceiro;
	}

	public void setCodigoTransacaoParceiro(String codigoTransacaoParceiro) {
		this.codigoTransacaoParceiro = codigoTransacaoParceiro;
	}

	public Long getCodigoBandeoira() {
		return codigoBandeoira;
	}

	public void setCodigoBandeoira(Long codigoBandeoira) {
		this.codigoBandeoira = codigoBandeoira;
	}

	public Long getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(Long valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	public Long getCodigoParceiro() {
		return codigoParceiro;
	}

	public void setCodigoParceiro(Long codigoParceiro) {
		this.codigoParceiro = codigoParceiro;
	}

	public Date getDataHoraRequisicao() {
		return dataHoraRequisicao;
	}

	public void setDataHoraRequisicao(Date dataHoraRequisicao) {
		this.dataHoraRequisicao = dataHoraRequisicao;
	}

	public Long getCodigoTipoServico() {
		return codigoTipoServico;
	}

	public void setCodigoTipoServico(Long codigoTipoServico) {
		this.codigoTipoServico = codigoTipoServico;
	}

	public Long getCodigoServicoPlataforma() {
		return codigoServicoPlataforma;
	}

	public void setCodigoServicoPlataforma(Long codigoServicoPlataforma) {
		this.codigoServicoPlataforma = codigoServicoPlataforma;
	}

	public Long getCodigoTipoPrecificacao() {
		return codigoTipoPrecificacao;
	}

	public void setCodigoTipoPrecificacao(Long codigoTipoPrecificacao) {
		this.codigoTipoPrecificacao = codigoTipoPrecificacao;
	}

	public Long getCodigotipoCartao() {
		return codigotipoCartao;
	}

	public void setCodigotipoCartao(Long codigotipoCartao) {
		this.codigotipoCartao = codigotipoCartao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}