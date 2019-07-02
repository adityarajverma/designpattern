package creational.BuilderDesign;

public class Phone {

	private String os;
	private String ramSize;
	private String storageSize;
	private String company;
	private String processor;

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(String storageSize) {
		this.storageSize = storageSize;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public Phone(String os, String ramSize, String storageSize, String company, String processor) {
		super();
		this.os = os;
		this.ramSize = ramSize;
		this.storageSize = storageSize;
		this.company = company;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ramSize=" + ramSize + ", storageSize=" + storageSize + ", company=" + company
				+ ", processor=" + processor + "]";
	}

}
