package abstractfactory;

public class HaierFactory implements IFactory {

	@Override
	public void createTv() {
		System.out.println("Haier Tv");
	}

	@Override
	public void createFrig() {
		System.out.println("Haier Frig");
	}

}
