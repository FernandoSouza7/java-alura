
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você é maior de 18 anos");
		}else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é maior de idade. Porém, está acompanhado por duas ou mais pessoa. Sendo assim, pode entrar.");
			}else {
				System.out.println("Você é menor de idade. Entrada proibida.");
			}
		}
	}
}
