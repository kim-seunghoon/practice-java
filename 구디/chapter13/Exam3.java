package chapter13;

import java.util.Random;
import java.util.TreeSet;

public class Exam3 {

	public static void main(String[] args) {
	
		
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size() < 6) {
			set.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(set);
		System.out.println("--------------------");
		TreeSet<Integer> set2 = new TreeSet<>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while (set2.size() < 6) {
			set2.add(rand.nextInt(45) +1);
		}
		System.out.println(set2);
	}

}
