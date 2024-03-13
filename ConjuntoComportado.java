package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Bia");
		listaAprovados.add("Carlos");
		listaAprovados.add("Roberto");
		
		for(String aprovados : listaAprovados) {
			if(aprovados.contains("r")) {
				System.out.println(aprovados);
			}
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(160);
		nums.add(6);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
