package creational.FactoryDesign;

public class FactoryDesignPattern {

	public OS getInstance(String type) {
		if (type.equals("Android")) {
			return new Android();

		} else if (type.equals("IOS")) {
			return new IOS();
		}

		else {
			return new Windows();
		}
	}

}
