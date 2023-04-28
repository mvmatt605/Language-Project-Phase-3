public class LoopNode extends Node{
	@Override
	public int eval(){
		while (children().get(0).eval() == 1){
			children().get(1).eval();
		}
		return 0;
	}
} 
