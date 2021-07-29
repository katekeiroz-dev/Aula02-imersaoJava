import java.util.Scanner;



public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int anoNascimento; 
		int idade;
		
		System.out.println("informe o seu ano de nascimento");
		anoNascimento = leitor.nextInt();
		
		idade = 2021 - anoNascimento;
		
		System.out.println("Voce tera " + idade + "anos no dia 31 de dezembro deste ano !");
		leitor.close();
		

	}

}
