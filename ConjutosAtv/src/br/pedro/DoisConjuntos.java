package br.pedro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DoisConjuntos {

	public static void main(String[] args) {
		Set<Integer> conjuntosdenumeros1 = new HashSet<>(Arrays.asList(25, 21, 22, 23, 26, 20));
		Set<Integer> conjuntosdenumeros2 = new HashSet<>(Arrays.asList(25, 31, 32, 33, 36, 20));
		Set<Integer> uniao = new HashSet<>(conjuntosdenumeros1);
		Set<Integer> diferen�a = new HashSet<>(conjuntosdenumeros1);
		Set<Integer> interse�ao = new HashSet<>(conjuntosdenumeros1);
		
		uniao.addAll(conjuntosdenumeros2);
		System.out.println(uniao);
		diferen�a.removeAll(conjuntosdenumeros2);
		System.out.println(diferen�a);
		interse�ao.retainAll(conjuntosdenumeros2);
		System.out.println(interse�ao);
	

	}

}
