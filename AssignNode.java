public class AssignNode extends Node {

	@Override
	public int eval(){
		String name = getChild(0).getName();
		int value = getChild(1).eval();
		IDNode.ram.put(name, value);
		return 0;
	}
}

