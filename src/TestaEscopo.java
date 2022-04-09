
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 25;
		int quantidadePessoas = 3;
		
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Faça o melhor com o que tem em mãos");

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Entrada proibida.");
		}
	}
}
