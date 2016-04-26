
public class consumidor extends Thread {
	private int id;
	private buffer pilha;
	private int consumomax;
	
	public consumidor(int id, buffer pilha, int consumomax){
		this.id=id;
		this.pilha=pilha;
		this.consumomax=consumomax;
	}
	
	public void run(){
		for(int i=0; i<consumomax; i++){
			pilha.get(id);
		}
		System.out.println("Consumidor " + id + "terminado");
	}
}
