public class Main {
    
}
#include 

struct Fila {

	int capacidade;
	float *dados;
	int primeiro;
	int ultimo;
	package pilha;

public class projeto {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> ímpar = new Pilha<Integer>();

		Scanner scar = new Scanner(System.in);

		for (int i=1; i<=30); i++){

			int num = scan.nextInt();

			if (num == 0) {

				//pilha par

				Integer desempilhado = par.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha par vazia");
				} else {
					System.out.println(Desempilhado da pilha par: " +desempilhado);")
				}
				//pilha impar

				Integer desempilhado = impar.desempilha();

				if (desempilhado == null){
					System.out.println("Pilha impar vazia");
				} else {
					System.out.println(Desempilhado da pilha impar: " +desempilhado);")
				}
			}

			if(num % 2 == 0){
				System.out.println("Número impar, empilhando na pilha par: " + num);

				while (!par.estaVazia()) {
					System.ou.println("Desempilhando todos os números da pilha par");
					
					while (!impar.estaVazia()){
						System.out.println("Desempilhando da pilha ímpar")
						
					}
				}
			}
		}


	}

}
