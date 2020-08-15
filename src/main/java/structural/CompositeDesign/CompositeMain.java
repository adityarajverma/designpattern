package structural.CompositeDesign;

public class CompositeMain {

	public static void main(String args[]) {

		SpareParts mouse = new SpareParts("mouse", 100);
		SpareParts speaker = new SpareParts("speaker", 1000);
		SpareParts keyboard = new SpareParts("keyboard", 500);
		SpareParts monitor = new SpareParts("monitor", 10000);
		SpareParts cpu = new SpareParts("cpu", 6000);
		SpareParts ram = new SpareParts("ram", 5000);

		Composite cabinet = new Composite("Cabinet");
		Composite sound = new Composite("Sound");
		Composite display = new Composite("Display");
		Composite motherBoard = new Composite("Mother Board");

		cabinet.addSpareParts(mouse);
		cabinet.addSpareParts(keyboard);
		cabinet.addSpareParts(cpu);
		sound.addSpareParts(cpu);
		display.addSpareParts(monitor);
		motherBoard.addSpareParts(ram);
		motherBoard.addSpareParts(cpu);

		cabinet.showPrice();

	}

}
