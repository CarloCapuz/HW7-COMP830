package hw7;

public class TestAnimalCow extends TestAnimalObjectParent{
	
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Cow) {
			Cow c = (Cow) animal;
			ExpectedCow ex = new ExpectedCow();
			if (c.aboutMe().equals(ex.expectedName())) {
				if (c.diet().equals(ex.expectedFood())) {
					if (c.produces().equals(ex.expectedInfo())) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
