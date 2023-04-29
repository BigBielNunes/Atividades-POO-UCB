package br.catolica.aluno.teste4;

public class Volei extends ComplexoEsportivo {
		
		private String tipoQuadra;
		private double alturaRede;

		public Volei(String nome,int qntPessoas, int qntDiasSemana, int qtnProfessor, String tipoUniforme, double mensalidade,String tipoQuadra,double alturaRede) {
			super(nome,qntPessoas, qntDiasSemana, qtnProfessor, tipoUniforme, mensalidade);
			this.alturaRede = alturaRede;
		}

		public String getTipoQuadra() {
			return tipoQuadra;
		}

		public void setTipoQuadra(String tipoQuadra) {
			this.tipoQuadra = tipoQuadra;
		}

		public double getAlturaRede() {
			return alturaRede;
		}

		public void setAlturaRede(double alturaRede) {
			this.alturaRede = alturaRede;
		}
		
		public String toString() {
			return "Nome: " + getNome()
					+"\nTipo: " + getTipoQuadra()
					+"\nQuantidade de pessoas suportadas: " + getQntPessoas()
					+"\nQuantidade de dias na semana: " + getQntDiasSemana()
					+"\nQuantidade de Professores: " + getQtnProfessor()
					+"\nTipo de Uniforme: " + getTipoUniforme()
					+"\nMensalidade custa: " + getMensalidade()
					+"\nAltura da rede em metros: "+ getAlturaRede();
		}
}