
public class buffer {
	boolean vazia;
	int valor;
	
	public synchronized void set(int valor){
		while (vazia==false){
			System.out.println("O produtor esta esperando");
			wait();
		}
		this.valor=valor;
		System.out.println("O produtor colocou : " + this.valor);
		vazia=false;
		notifyAll();
	}
	
	public synchronized int get(int id){
		while(vazia == true){
			System.out.println("O consumidor " + id + " esta esperando");
		}
		vazia=true;
		System.out.println("O consumidor " + id + " consumiu " + valor);
		notifyAll();
		return valor;
	}
}
