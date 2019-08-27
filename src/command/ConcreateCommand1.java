package command;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcreateCommand1 implements ICommand {

	private ArrayList<IReceiver> mIReceivers;

	public ConcreateCommand1() {
		mIReceivers = new ArrayList<>();
	}

	@Override
	public void setReceiver(IReceiver... iReceivers) {
		mIReceivers.addAll(Arrays.asList(iReceivers));
	}

	@Override
	public void execute() {
		for (IReceiver iReceiver : mIReceivers) {
			iReceiver.doSomething();
		}
	}

}
