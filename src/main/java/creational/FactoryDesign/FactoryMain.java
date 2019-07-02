package creational.FactoryDesign;

public class FactoryMain {

	public static void main(String args[])

	{

		FactoryDesignPattern factory = new FactoryDesignPattern();
		OS obj = factory.getInstance("Android");
		obj.spec();

	}

}
