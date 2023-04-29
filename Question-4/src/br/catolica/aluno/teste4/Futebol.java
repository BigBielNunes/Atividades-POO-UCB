package br.catolica.aluno.teste4;

public class Futebol extends ComplexoEsportivo{
	
	private String tipoQuadra;
	
	public Futebol(String nome,int qntPessoas, int qntDiasSemana, int qtnProfessor, String tipoUniforme,
			double mensalidade,String tipoQuadra) {
		super(nome,qntPessoas,qntDiasSemana,qtnProfessor,tipoUniforme,mensalidade);
		this.tipoQuadra = tipoQuadra;
	}

	public String getTipoQuadra() {
		return tipoQuadra;
	}

	public void setTipoQuadra(String tipoQuadra) {
		this.tipoQuadra = tipoQuadra;
	}
	
	public String toString() {
		return "Nome: " + getNome()
				+"\nTipo: " + getTipoQuadra()
				+"\nQuantidade de pessoas suportadas: " + getQntPessoas()
				+"\nQuantidade de dias na semana: " + getQntDiasSemana()
				+"\nQuantidade de Professores: " + getQtnProfessor()
				+"\nTipo de Uniforme: " + getTipoUniforme()
				+"\nMensalidade custa: " + getMensalidade();
	}
}
