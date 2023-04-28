public class ExpNode extends Node {
    @Override
    public int eval() {
        if (children().size() == 1) {
            // if there is only one child, evaluate and return it
            return children().get(0).eval();
        } else {
            // evaluate the first child
            int result = children().get(0).eval();
            // loop through remaining children two at a time
            for (int i = 1; i < children().size(); i += 2) {
                // the first child of each pair is an OpNode
                OpNode op = (OpNode) children().get(i);
                // evaluate the second child of the pair to get a value
                int value = children().get(i + 1).eval();
                // update the result according to the operator and value
                if (op.op.equals("+")) {
                    result += value;
                } else if (op.op.equals("-")) {
                    result -= value;
                } else if (op.op.equals("*")) {
                    result *= value;
                } else if (op.op.equals("/")) {
                    result /= value;
                } else {
                    throw new IllegalArgumentException("Unknown operator: " + op.op);
                }
            }
            // return the final result
            return result;
        }
    }
}
