package bridge;

public class RedfinedAbstraction extends Abstraction {

	public RedfinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void execute() {
		super.execute();
		getImp().doAnything();
	}

}
