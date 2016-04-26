import java.util.Scanner;

public class pec {
	static int i, p, max;
	static Scanner entrada = new Scanner(System.in);
	static buffer pilha= new buffer();
	static consumidor[] Consumidor;
	
	public static void main(String[] args) {
		System.out.print("Digite a capacidade produtiva do produtor: ");
		i= entrada.nextInt();
		prod produtor = new prod(pilha, i);
		System.out.print("Digite o numero de consumidores: ");
		max=entrada.nextInt(); 
		while(max<1){
			System.out.println("\nTente de novo, crie pelo menos um consumidor: ");
			max=entrada.nextInt();
		}
		Consumidor = new consumidor[max];
		System.out.println("Digite a capacidade de consumo de cada consumidor: ");
		for( i=0; i<max;){
			i++;
			System.out.print("Capacidade do consumidor "+ i + ": ");
			p= entrada.nextInt();
			if(p<0){
				System.out.println("\nErro, digite um valor válido");
				i--;
				continue;
			}
			else
				Consumidor[i-1] = new consumidor(i,pilha, p);
		}
		produtor.start();
		for(i=0; i<max; i++){
			Consumidor[i].start();
		}
	}
}
