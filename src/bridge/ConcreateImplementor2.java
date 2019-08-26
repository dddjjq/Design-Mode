package bridge;

public class ConcreateImplementor2 implements Implementor {

	@Override
	public void doSomething() {
		System.out.println("implementor2 do something");
	}

	@Override
	public void doAnything() {
		System.out.println("implementor2 do anything");
	}

}
