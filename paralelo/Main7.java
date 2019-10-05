package paralela;

public class Main7 extends Thread{
	int rango;
	long end;
	
	public Main7(int r) {
		this.rango = r;
	}
	
	public void run() {
		int numero = 2;
		int i = 0;
		long start = System.nanoTime();
		while (i < rango) {
			if(esPrimo(numero) != 0) {
				i++;
			}
			numero++;
			
		}
		this.end = System.nanoTime()- start;
			
	}
	
	public long tiempo() {
		return this.end;
	}
	
	public int esPrimo(int x) {
		int i;
		int contador = 0;
		for(i = 1; i <= x; i++) {
			if(x % i == 0) contador++;
		}
		if(contador > 2) { 
			return 0;
		}
		return x;
	}
}
