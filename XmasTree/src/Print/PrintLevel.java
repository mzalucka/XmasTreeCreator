package Print;

public class PrintLevel {
	
	public static String printlevel(int nOfLevels, int currentlevel, String sign, String direction) {

		String level = "";

		switch (direction) {
		case "g": {
			level += add(nOfLevels - currentlevel - 1, " ");
			level += add(2 * currentlevel + 1, sign);
			break;
		}

		case "l": {
			if (currentlevel > nOfLevels / 2) {
				level += add(nOfLevels - currentlevel, sign);
			} else {
				level += add(currentlevel + 1, sign);
			}
			break;
		}

		case "r": {
			if (currentlevel > nOfLevels / 2) {
				level += add(currentlevel, " ");
				level += add(nOfLevels - currentlevel, sign);
			} else {
				level += add(nOfLevels - currentlevel - 1, " ");
				level += add(currentlevel + 1, sign);
			}
			break;
		}

		case "d": {
			level += add(currentlevel, " ");
			level += add(2 * nOfLevels - 1 - 2 * currentlevel, sign);
			break;
		}

		default:
			System.out.println("Poda³eœ z³y znak !");
			System.exit(0);
			;
		}

		if (currentlevel + 1 != nOfLevels) {
			level += "\n";
		}

		return level;
	}

	public static StringBuilder add(int length, String sign) {
		StringBuilder stringbuilder = new StringBuilder();

		for (int i = 0; i < length; i++) {
			stringbuilder.append(sign);
		}

		return stringbuilder;
	}
}
