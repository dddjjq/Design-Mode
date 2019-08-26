package bridge;

public class ConcreateImplementor1 implements Implementor {

	@Override
	public void doSomething() {
		System.out.println("implementor1 do something");
	}

	@Override
	public void doAnything() {
		System.out.println("implementor1 do anything");
	}

}
