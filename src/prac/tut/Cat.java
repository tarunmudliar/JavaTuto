package prac.tut;

public class Cat extends Animal {

	
	    public static void testClassMethod() {
	        System.out.println("The static method in Cat");
	    }
	    public void testInstanceMethod() {
	        System.out.println("The instance method in Cat");
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		//Implicit casting
        Animal myAnimal = myCat;
        //OverRiding methods 
        myAnimal.testInstanceMethod();
        myCat.testInstanceMethod();
        //Hiding methods
        myCat.testClassMethod();
        myAnimal.testClassMethod();
        
        
        Animal a = new Animal();
        a.testInstanceMethod();
        
		
		
	}

}
