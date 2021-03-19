package hw7;

public class TestAnimalTyrannosaur extends TestAnimalObjectParent{
	
	public boolean testAnimalObject(Object animal) {

		if (animal instanceof Tyrannosaur) {
			Tyrannosaur t = (Tyrannosaur) animal;
			if (t.getName().contentEquals("Tyrannosaurus Rex")) {
				if (t.roar().equals("Roarrrr!")) {
					if (t.myFood().equals("other dinosaurs")) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
}
