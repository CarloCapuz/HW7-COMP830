package hw7;

public class AnimalClassTester {
	
	TestAnimalObjectParent testAnimalObjectParent;
	
	public void setTestAnimalObjectParent(TestAnimalObjectParent testAnimalObjectParent) {
		this.testAnimalObjectParent = testAnimalObjectParent;
	}
	
	public void resetTestAnimalObjectParent() {
		this.testAnimalObjectParent = null;
	}
	
	public boolean testAnimalObject(Object animal) {
		return this.testAnimalObjectParent.testAnimalObject(animal);
	}

}
