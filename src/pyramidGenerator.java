

public class PyramidGenerator {

	public void generate(int height) {
		for (int i = 1; i <= height; i++) {

			String character = "#";
			String spaceCharacter = "";

			for (int j = 0; j < height - i; j++) {
				spaceCharacter += ".";
			}

			int columnCount = 1;
			while (columnCount < i * 2 - 1) {
				character += "#";
				columnCount++;
			}

			System.out.println(spaceCharacter + character + spaceCharacter);

		}
	}

	public void generateReversed(int row) {
		for (int i = 0; i < row; i++) {
			System.out.println();
			for (int j = 0; j < row; j++) {
				System.out.print("#");
			}
		}
	}
}

/*
 * ....#.... ...###... ..#####.. .#######. #########
 * 
 */
