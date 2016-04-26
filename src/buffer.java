
public class buffer {
	boolean vazia=true;
	int valor;
	
	public synchronized void set (int valor){
		while (vazia==false){
			try{
				System.out.println("O produtor esta esperando");
				wait();
			}catch (Exception e){}
		}
		this.valor=valor;
		System.out.println("O produtor colocou : " + this.valor);
		vazia=false;
		notifyAll();
	}
	
	public synchronized int get (int id){
		while(vazia == true){
			try{
				System.out.println("O consumidor " + id + " esta esperando");
				wait();
			}catch (Exception e){};
		}
		System.out.println("O consumidor " + id + " consumiu " + valor);
		vazia=true;
		notifyAll();
		return valor;
	}
}
