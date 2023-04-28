import java.util.LinkedList;

public abstract class Node{

	private LinkedList<Node> children;

	public void addChild(Node n){
		if (children == null)
			children = new LinkedList<Node>();
		children.add(n);
	}

	public Node getChild(int i){
		return children.get(i);
	}

	public LinkedList<Node> children(){
		return children;
	}

	public String getName(){
		return "Node";
	}

	public abstract int eval();
}

