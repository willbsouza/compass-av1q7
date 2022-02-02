import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {

		Perguntas pergunta = new Perguntas();
		Respostas resposta = new Respostas();
		Integer acertos = 0;
		Integer erros = 0;
		String nomeUsuario;
		Scanner scan = new Scanner(System.in);
		String[] respostasUsuario = new String[10];
		
		System.out.println("Antes de iniciar o Quiz, digite seu nome:");
		nomeUsuario = scan.nextLine();
		
		System.out.printf("%nOk, %s. Vamos começar!%n%n", nomeUsuario);

		for (int i = 0; i < 10; i++) {

			do {
				System.out.println(pergunta.fazerPergunta(i));
				respostasUsuario[i] = scan.nextLine().substring(0, 1);
			} while (!respostasUsuario[i].equalsIgnoreCase("a") 
					&& !respostasUsuario[i].equalsIgnoreCase("b")
					&& !respostasUsuario[i].equalsIgnoreCase("c") 
					&& !respostasUsuario[i].equalsIgnoreCase("d")
					&& !respostasUsuario[i].equalsIgnoreCase("e"));

			if (respostasUsuario[i].equalsIgnoreCase(resposta.verificarResposta(i))) {
				System.out.println("Parabéns, você acertou.\n");
				acertos++;
			} else {
				System.out.println("Que pena, você errou.\n");
				erros++;
			}
		}
		System.out.println("Usuário " + nomeUsuario);
		System.out.println("Acertos: " + acertos);
		System.out.println("Erros: " + erros);
	}
}
