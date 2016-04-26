import java.util.Scanner;

public class pec {
	int i;
	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite a capacidade produtiva do produtor: ");
		i= entrada.nextInt();
		Produtor produtor=new prod(i);
		
		
		
	}

}
