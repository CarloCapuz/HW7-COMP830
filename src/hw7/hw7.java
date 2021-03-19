package hw7;

public class hw7 {

	public static void main(String[] args) {
		AnimalClassTester qa = new AnimalClassTester();
		
		Object[] animalObjects = { new Tyrannosaur(),  new Penguin(), new Cow()};
		TestAnimalObjectParent[] animalObjectTests = { new TestAnimalTyrannosaur(),  new TestAnimalPenguin(), new TestAnimalCow()};
				
		for(int i=0; i < animalObjectTests.length; i++) {
			
			Object animalObject = animalObjects[i];
			
			qa.setTestAnimalObjectParent(animalObjectTests[i]);

			if (qa.testAnimalObject(animalObject)) {
				System.out.println(getClassName(animalObject)+" class passes");
			} else {
				System.out.println(">>>>"+getClassName(animalObject)+" class Failed!<<<<");
			}
			
			qa.resetTestAnimalObjectParent();
		}
	}

	public static String getClassName(Object obj) {
		String className = obj.getClass() + "";
		return className.substring(className.lastIndexOf(".") + 1, className.length());
	}

}
