
// Exercicio 6

package Herança;

import java.text.NumberFormat;

public class Vendedor extends Pessoa2{
	private double valorDeVendas;
	private double comissao;
	private double vencimento;
	
	public Vendedor (String nome, int matricula, Double valorDeVendas, Double comissao) {
		super(nome, matricula);
		this.valorDeVendas=valorDeVendas;
		this.comissao=comissao;
		
		
	}

	public double getValorDeVendas() {
		return valorDeVendas;
	}

	public void setValorDeVendas(double valorDeVendas) {
		this.valorDeVendas = valorDeVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getVencimento() {
		return vencimento;
	}

	public void setVencimento(double vencimento) {
		this.vencimento = vencimento;
	}
	
	public double calcularVencimento(double valorDeVendas, double comissao) {
		vencimento=valorDeVendas*comissao;
		System.out.println("O vencimento do vendedor(a)"+nome+" é de:"+this.formatarMoeda());
		return vencimento;
	}
	public String formatarMoeda(){
		NumberFormat nf =NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(vencimento);
		return formatoMoeda;
		}
}
