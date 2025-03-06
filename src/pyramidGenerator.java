
public class PyramidGenerator {

	public void generate(char character, int height) {
		for (int i = 1; i <= height; i++) {

			StringBuilder space = getSpace(height, i);
			StringBuilder characterString = getCharacter(character, i);

			System.out.println(space.toString() + characterString.toString() + space.toString());
		}
	}

	public StringBuilder getSpace(int height, int currentRow) {
		StringBuilder str = new StringBuilder();
		int spaceCount = height - currentRow;
		for (int i = 0; i < spaceCount; i++) {
			str.append(" ");
		}
		return str;
	}

	public StringBuilder getCharacter(char character, int currentRow) {
		StringBuilder str = new StringBuilder(character);
		int charCount = currentRow * 2 - 1;
		for (int i = 1; i <= charCount; i++) {
			str.append(character);
		}
		return str;
	}

}

/*
 * ....#.... ...###... ..#####.. .#######. #########
 * 
 */
