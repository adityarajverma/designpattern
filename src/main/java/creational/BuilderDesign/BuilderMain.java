package creational.BuilderDesign;

public class BuilderMain {

	public static void main(String args[]) {

		PhoneBuilder p = new PhoneBuilder();
		Phone phone = p.setCompany("Nokia").setOs("Android").setRamSize("4gb").setStorageSize("64gb").getPhone();
		System.out.println(phone);

	}

}
