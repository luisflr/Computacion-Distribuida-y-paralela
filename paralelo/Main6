package paralela;

public class Main6 extends Thread{
	int rango;
	
	public Main6(int r) {
		this.rango = r;
	}
	
	public void run() {
		int numero = 2;
		int i = 0;
		long start = System.nanoTime();
		while (i < rango) {
			if(esPrimo(numero) != 0) {
				//System.out.print(numero +" " );
				i++;
			}
			numero++;
			
		}
		long end =System.nanoTime()- start;
		System.out.println(end);
			
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
