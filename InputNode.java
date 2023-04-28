import java.util.Scanner;

public class InputNode extends Node{

	private Scanner scanner;

	public InputNode(){
		scanner = new Scanner(System.in);
	}

	@Override
	public int eval(){
		int value = scanner.nextInt();
		Node child = getChild(0);
		String name = child.getName();
		IDNode.ram.put(name, value);
		return 0;
	}
}

