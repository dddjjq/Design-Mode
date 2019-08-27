package command;

/**
 * 中间类，负责连接客户与实现
 * 
 * @author dingyl
 *
 */
public class Invoker {

	private ICommand iCommand;

	public void setCommand(ICommand iCommand) {
		this.iCommand = iCommand;
	}

	// 执行
	public void action() {
		iCommand.execute();
	}
}
