package com.morsch.certification.interfaces.lambdas;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal fish = new Animal(false, true);
		Animal kangaru = new Animal(true, false);
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(kangaru);
		animals.add(fish);
		
		printSkills(animals, a -> a.canHop());

	}
	
	public static void printSkills(List<Animal> animals, Skills skills) {
		for (Animal animal : animals) {
			
			System.out.println(skills.test(animal));
			
		}
	}

}
