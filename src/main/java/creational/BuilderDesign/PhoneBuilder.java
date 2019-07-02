package creational.BuilderDesign;

public class PhoneBuilder {

	private String os;
	private String ramSize;
	private String storageSize;
	private String company;
	private String processor;

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setRamSize(String ramSize) {
		this.ramSize = ramSize;
		return this;
	}

	public PhoneBuilder setStorageSize(String storageSize) {
		this.storageSize = storageSize;
		return this;
	}

	public PhoneBuilder setCompany(String company) {
		this.company = company;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public Phone getPhone() {
		return new Phone(os, ramSize, storageSize, company, processor);
	}

}
