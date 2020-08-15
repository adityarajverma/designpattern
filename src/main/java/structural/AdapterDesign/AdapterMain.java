package structural.AdapterDesign;

public class AdapterMain {

	public static void main(String args[]) {

		Pen pen = new PenAdapter();
		AssignmentWork work = new AssignmentWork();
		work.setP(pen);
		work.write();
	}

}
