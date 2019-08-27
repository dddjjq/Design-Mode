package command;

public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		ICommand iCommand1 = new ConcreateCommand1();
		ICommand iCommand2 = new ConcreateCommand2();
		iCommand1.setReceiver(new ConcreateReceiver1(), new ConcreateReceiver2());
		iCommand2.setReceiver(new ConcreateReceiver2());
		System.out.println("-----Command1 execute-----");
		invoker.setCommand(iCommand1);
		invoker.action();
		System.out.println("-----Command2 execute-----");
		invoker.setCommand(iCommand2);
		invoker.action();
	}
}
