package abstractfactory;

public class TclFactory implements IFactory {

	@Override
	public void createTv() {
		System.out.println("TCL Tv");
	}

	@Override
	public void createFrig() {
		System.out.println("TCL Frig");
	}

}
