package structural.CompositeDesign;

public class SpareParts implements Price {

	private String spareName;
	private int price;

	public String getSpareName() {
		return spareName;
	}

	public void setSpareName(String spareName) {
		this.spareName = spareName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(spareName + " : " + price);

	}

	public SpareParts(String spareName, int price) {
		super();
		this.spareName = spareName;
		this.price = price;
	}

}
