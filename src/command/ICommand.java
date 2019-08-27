package command;

/**
 * 命令抽象
 *
 */
public interface ICommand<T extends IReceiver> {
	void setReceiver(T... iReceivers);

	void execute();
}
