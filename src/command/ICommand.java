package command;

/**
 * 命令抽象
 *
 */
public interface ICommand {
	void setReceiver(IReceiver... iReceivers);

	void execute();
}
