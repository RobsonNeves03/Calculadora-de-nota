public class Encapsulamento {
	private String nomeAluno;
	private int nota1;
	private int nota2;
	private int nota3;
	public int notaf;
	private String turma;

	public void setnomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}// Define o nome do aluno

	public String getnomeAluno() {
		return nomeAluno;
	}// Mostra o nome do aluno

	public void setturma(String turma) {
		this.turma = turma;
	}// Define a turma

	public String getturma() {
		return turma;
	}// Mostra a turma

	public void setnota1(int nota1) {
		this.nota1 = nota1;
	}// Define a 1ª nota

	public int getnota1() {
		return nota1;
	}// Mostra a 1ª nota

	public void setnota2(int nota2) {
		this.nota2 = nota2;
	}// Define a 2ª nota

	public int getnota2() {
		return nota2;
	}// Mostra a 2ª nota

	public void setnota3(int nota3) {
		this.nota3 = nota3;
	}// Define a 3ª nota

	public int getnota3() {
		return nota3;
	}// Mostra a 3ª nota

}