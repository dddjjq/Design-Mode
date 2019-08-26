package bridge;

public class Client {
	public static void main(String[] args) {
		Implementor concreateImplementor1 = new ConcreateImplementor1();
		Implementor concreateImplementor2 = new ConcreateImplementor2();
		Abstraction abstraction1 = new RedfinedAbstraction(concreateImplementor1);
		Abstraction abstraction2 = new RedfinedAbstraction(concreateImplementor2);
		abstraction1.execute();
		abstraction2.execute();
	}
}
