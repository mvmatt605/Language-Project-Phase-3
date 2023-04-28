public class BlockNode extends Node{
	@Override
	public int eval(){
	for(Node child : children())
		child.eval();
	return 0;
	}
}

