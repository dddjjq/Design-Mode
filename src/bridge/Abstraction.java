package bridge;

public abstract class Abstraction {

	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	public void execute() {
		implementor.doSomething();
	}

	public Implementor getImp() {
		return implementor;
	}
}
