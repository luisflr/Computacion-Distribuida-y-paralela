package paralela;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Simulacion {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int tamaño=1000;
		long tiempo;
		
		ArrayList<Main7> nPrimos = new ArrayList<Main7>();
		Main7 hilo;
		
		FileOutputStream os = new FileOutputStream("TiemposHilo.txt");
		PrintStream ps = new PrintStream(os);
		
		for(int i = 1; i <= tamaño; i++) {
			hilo = new Main7(i);
			nPrimos.add(hilo);
		}
		
		for(int j =0; j< nPrimos.size();j++ ) {
			nPrimos.get(j).start();
		}
		
		for(int j = 0; j < nPrimos.size(); j++) {
			if(!nPrimos.get(j).isAlive()) {
				System.out.println(nPrimos.get(j).tiempo());
				ps.println(nPrimos.get(j).tiempo());
			}
		}
		
	}
		
}
