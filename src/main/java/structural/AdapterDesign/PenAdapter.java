package structural.AdapterDesign;

public class PenAdapter implements Pen {

	PilotPen pilotPen = new PilotPen();

	public void write() {
		// TODO Auto-generated method stub
		pilotPen.writePilotPen();

	}

}
