package structural.CompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Price {

	private int price;
	private String name;
	List<SpareParts> components = new ArrayList<SpareParts>();

	public void showPrice() {
		// TODO Auto-generated method stub

		System.out.println(name);
		for (SpareParts parts : components) {
			System.out.println(parts.getSpareName() + " : " + parts.getPrice());
			price = price + parts.getPrice();

		}

		System.out.println("Total Price : " + price);

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addSpareParts(SpareParts p) {
		components.add(p);
	}

	public Composite(String name) {
		super();
		this.name = name;
	}

}
