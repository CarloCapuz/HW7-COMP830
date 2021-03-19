package hw7;

public class TestAnimalTreeClimbingOctopus extends TestAnimalObjectParent{
	
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof TreeClimbingOctopus) {
			TreeClimbingOctopus t = (TreeClimbingOctopus) animal;
			if (t.movement().contentEquals("Grapling")) {
				if (t.food().equals("Birds")) {
					if (t.name().equals("Climbing octopus")) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
