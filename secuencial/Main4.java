package secuencial;

import java.awt.datatransfer.SystemFlavorMap;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int)(Math.random()*30)+1;
		System.out.println("Numero ingresado " + x);
		//esPrimo(10);
		for(int i = 1; i < x; i++) {
			System.out.println(nPrimos(i));
		}	
	}
	public static int esPrimo(int x) {
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
	public static long nPrimos(int x) {
		int numero = 2;
		int i = 0;
		long start = System.nanoTime();
		if(x==0) {
			System.out.println("el minimo debe ser 1");
			x=1;
		}
		while (i < x) {
			if(esPrimo(numero) != 0) {
				System.out.print(numero +" " );
				i++;
			}
			numero++;
			
		}
		System.out.println(" ");
		return System.nanoTime()- start;
			
	}

}
