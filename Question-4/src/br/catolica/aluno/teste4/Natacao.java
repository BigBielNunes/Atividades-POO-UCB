package br.catolica.aluno.teste4;

public class Natacao extends ComplexoEsportivo{
	
	private double tamanhoPiscina;
	private String temperaturaAgua;
	
	public Natacao(String nome,int qntPessoas, int qntDiasSemana, int qtnProfessor, String tipoUniforme, double mensalidade, double tamanhoPiscina, String temperaturaAgua) {
		super(nome,qntPessoas, qntDiasSemana, qtnProfessor, tipoUniforme, mensalidade );
		this.tamanhoPiscina = tamanhoPiscina;
		this.temperaturaAgua = temperaturaAgua;
	}

	public double getTamanhoPiscina() {
		return tamanhoPiscina;
	}

	public void setTamanhoPiscina(double tamanhoPiscina) {
		this.tamanhoPiscina = tamanhoPiscina;
	}

	public String getTemperaturaAgua() {
		return temperaturaAgua;
	}

	public void setTemperaturaAgua(String temperaturaAgua) {
		this.temperaturaAgua = temperaturaAgua;
	}
	
	public String toString() {
		return "Nome: " + getNome()
				+"\nQuantidade de pessoas suportadas: " + getQntPessoas()
				+"\nQuantidade de dias na semana: " + getQntDiasSemana()
				+"\nQuantidade de Professores: " + getQtnProfessor()
				+"\nTipo de Uniforme: " + getTipoUniforme()
				+"\nMensalidade custa: " + getMensalidade()
				+"\nTamanho da piscina em metros: "+ getTamanhoPiscina()
				+"\nTemperatura da agua em graus: "+ getTemperaturaAgua();
	}
		
}
