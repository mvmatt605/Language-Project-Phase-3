
public class RelNode extends Node{
	@Override
	public int eval(){
	OpNode op = (OpNode) children().get(1);
		if (op.op.equals("<")) {
            return children().get(0).eval() < children().get(2).eval() ? 1 : 0;
        } else if (op.op.equals(">")) {
            return children().get(0).eval() > children().get(2).eval() ? 1 : 0;
        } else if (op.op.equals("<=")) {
            return children().get(0).eval() <= children().get(2).eval() ? 1 : 0;
        } else if (op.op.equals(">=")) {
            return children().get(0).eval() >= children().get(2).eval() ? 1 : 0;
        } else if (op.op.equals("==")) {
            return children().get(0).eval() == children().get(2).eval() ? 1 : 0;
        } else if (op.op.equals("!=")) {
            return children().get(0).eval() != children().get(2).eval() ? 1 : 0;
	}
//		switch(OpNode.op){
//			case "<":
//				return children().get(0).eval() < children().get(1).eval() ? 1 : 0;
//			case ">":
//				return children().get(0).eval() > children().get(1).eval() ? 1 : 0;
//			case "<=":
  //                              return children().get(0).eval() <= children().get(1).eval() ? 1 : 0;
//			case ">=":
  //                              return children().get(0).eval() >= children().get(1).eval() ? 1 : 0;
//			case "==":
  //                              return children().get(0).eval() == children().get(1).eval() ? 1 : 0;
//			case "!=":
  //                              return children().get(0).eval() != children().get(1).eval() ? 1 : 0;
//		}

	return 0;
}
}
