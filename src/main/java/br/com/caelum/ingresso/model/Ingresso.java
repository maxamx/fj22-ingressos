package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.caelum.ingresso.model.descontos.Desconto;

public class Ingresso {

	private Sessao sessao;
	private BigDecimal preco;

	public Ingresso(Sessao sessao, BigDecimal preco) {
		this.sessao = sessao;
		this.preco = preco;
	}

	/**
	 * @deprecated hibernate only
	 */
	public Ingresso() {
	}

	public Ingresso(Sessao sessao, Desconto tipoDeDesconto) {
		this.sessao= sessao;
		this.preco = tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco());
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public BigDecimal getPreco() {
		return (preco!=null?preco.setScale(2, RoundingMode.HALF_UP):new BigDecimal("0").setScale(2,RoundingMode.HALF_UP));
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
