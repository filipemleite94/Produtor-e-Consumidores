
public class prod extends Thread {
	private buffer pilha;
	private int producao;
	
	public prod(buffer pilha, int producao){
		this.pilha=pilha;
		this.producao=producao;
	}
	public void run(){
		for(int i=0; i<producao; i++){
			pilha.set(i);
		}
		System.out.println("Abastecimento concluido");
	}
}