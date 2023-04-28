public class IfElseNode extends Node{
	@Override
	public int eval(){
		if(children().get(0).eval() == 1){
			children().get(1).eval();
		} else if (children().get(2) != null){
			children().get(2).eval();
		}
		return 0;
	}
}
