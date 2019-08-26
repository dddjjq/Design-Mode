package abstractfactory;

public class Client {
	public static void main(String[] args) {
		IFactory tclFactory = new TclFactory();
		IFactory haierFactory = new HaierFactory();
		tclFactory.createTv();
		haierFactory.createTv();
		tclFactory.createFrig();
		haierFactory.createFrig();
	}
}
