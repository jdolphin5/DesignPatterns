package CommandRemoteControl.undo;

public interface Command {
	public void execute();

	public void undo();
}
