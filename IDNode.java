import java.util.HashMap;

public class IDNode extends Node {

	public static HashMap<String, Integer> ram = new HashMap<String, Integer>();

	private String variableName;

	public IDNode(String image){
		variableName = image;
	}

	@Override
	public String getName(){
		return variableName;
	}

	@Override
	public int eval(){
		return ram.get(variableName);
	}
}
