package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ingredientes {
	private Map<String, Integer> ingredientesHeladera = new HashMap<String, Integer>();
	private Map<String, Integer> ingredientesReceta = new HashMap<String, Integer>();
	private List<String> ingredientesFaltantes = new ArrayList<String>();
	private String path;

	public Ingredientes(String path) {
		this.path = path;
	}

	public void receta() {
		obtenerResultados();
		guardarResultados();
	}

	private void obtenerResultados() {
		int cantIngredientesHeladera = 0, cantIngredientesNecesarios = 0, i = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File(path + ".in"));
			cantIngredientesHeladera = sc.nextInt();
			cantIngredientesNecesarios = sc.nextInt();
			for (i = 0; i < cantIngredientesHeladera; i++) {
				ingredientesHeladera.put(sc.next(), i);
			}
			for (i = 0; i < cantIngredientesNecesarios; i++) {
				ingredientesReceta.put(sc.next(), i);
			}
			for (String s : ingredientesReceta.keySet()) {
				if (!ingredientesHeladera.containsKey(s)) {
					ingredientesFaltantes.add(s);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void guardarResultados() {
		try {
			PrintWriter pw = new PrintWriter(new File("output.out"));
			pw.println(ingredientesFaltantes.size());
			for (String s : ingredientesFaltantes)
				pw.print(s + " ");
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
