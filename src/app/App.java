package app;

import java.util.Scanner;
import java.util.Arrays;

public class App {
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		scanner = new Scanner(System.in);
		System.out.println("Introduceti numarul de forme: ");
		int nrForme = Integer.parseInt(scanner.nextLine());
		FormaGeometrica[] forma = new FormaGeometrica[nrForme]; 
		int i = 0;
		while(i < nrForme) {
			System.out.println("Introduceti numele formei: Cerc sau Patrat");
			String nume = scanner.nextLine();
			System.out.println("Introduceti dimensiunea formei: ");
			double dimensiune = Double.parseDouble(scanner.nextLine());
			try {
				if(nume.contentEquals("Cerc")) {
					forma[i] = new Cerc(dimensiune);
				}else if(nume.equals("Patrat")){
					forma[i] = new Patrat(dimensiune);
				}
			}catch (DimensiuneInvalidaException die) {
				die.printStackTrace();
			} 
			i++;
		}
	
		
		for(FormaGeometrica formaGeo : forma) {
			System.out.println(formaGeo);
		}
		
		Arrays.sort(forma);
		System.out.println();
		
		for(FormaGeometrica formaGeo : forma) {
			System.out.println(formaGeo);
		}
		
	}

}
