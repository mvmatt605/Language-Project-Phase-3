public class INTNode extends Node{

	private int value;

	public INTNode (String n){
		value = Integer.parseInt(n);
	}

//	@Override
//	public int getValue(){
//		return value;
//	}

	@Override
	public int eval(){
		return value;
	}
}
