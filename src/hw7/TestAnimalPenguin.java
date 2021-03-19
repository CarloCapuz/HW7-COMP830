package hw7;

public class TestAnimalPenguin extends TestAnimalObjectParent{
	
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Penguin) {
			Penguin p = (Penguin) animal;
			if (p.flightless().equals("penguin")) {
				if (p.IEat().equals("mostly fish")) {
					if (p.movement().equalsIgnoreCase("waddle and swim")) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
