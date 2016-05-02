package Print;

public class DrawTree {
	
	public int nOfLevels;
	public String sign;
	public String direction;
	
	public DrawTree(){
		
	}
	
	public DrawTree(int nOfLevels, String sign, String direction){
		this.direction=direction;
		this.nOfLevels=nOfLevels;
		this.sign=sign;
	}

	public static String drawTree(int nOfLevels, String sign, String direction) {
		String tree = "";
		for (int i = 0; i < nOfLevels; i++) {
			{
				tree += PrintLevel.printlevel(nOfLevels, i, sign, direction);
			}
		}
		return tree;

	}


	
	
}
