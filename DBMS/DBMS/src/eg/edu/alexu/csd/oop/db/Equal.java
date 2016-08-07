package eg.edu.alexu.csd.oop.db;

public class Equal implements Command {
	@Override
	public boolean execute(String a, String b, char operation) {
		return a.equals(b);
	}
}
