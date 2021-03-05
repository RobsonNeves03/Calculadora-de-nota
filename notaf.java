import javax.swing.JOptionPane;

public class notaf {

	public static void main(String[] args) {
		Encapsulamento a1 = new Encapsulamento();
		a1.setnomeAluno(JOptionPane.showInputDialog(null, "Digite o nome do aluno:"));
		a1.setturma(JOptionPane.showInputDialog(null, "Digite a turma do aluno:"));
		a1.setnota1(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do 1º bimestre:")));
		a1.setnota2(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do 2º bimestre:")));
		a1.setnota3(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do 3º bimestre:")));
		int notaf = (a1.getnota1()+a1.getnota2()+a1.getnota3())/3;

		System.out.println("Aluno: " + a1.getnomeAluno());
		System.out.println("Turma: " + a1.getturma());
		System.out.println("Nota do primeiro bimestre: " + a1.getnota1());
		System.out.println("Nota do segundo bimestre: " + a1.getnota2());
		System.out.println("Nota do terceiro bimestre: " + a1.getnota3());
		System.out.println("Nota final: " + notaf);
		if(notaf >= 6) {
			System.out.println("Aprovado");
		}
		else if(notaf >= 4 && notaf <= 5.9) {
			System.out.println("Recuperação");
		}
		else if(notaf < 4) {
			System.out.println("Reprovado");
		}
	}

}