public class OutputNode extends Node{

	@Override
	public int eval(){
		Node child = getChild(0);
		int value = getChild(0).eval();
		System.out.println(value);
		return 0;
	}
}

