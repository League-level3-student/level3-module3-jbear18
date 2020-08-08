package _01_AnimalFarm;

import java.awt.List;
import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList <Animal> farm= new ArrayList<Animal>();
		Sheep sheep= new Sheep();
		Pig pig= new Pig();
		Chicken chicken= new Chicken();
		Cow cow= new Cow();
	farm.add(cow);
	farm.add(chicken);
	farm.add(sheep);
	farm.add(pig);
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).makeNoise();
		farm.get(i).eat();
	}
	}
}
