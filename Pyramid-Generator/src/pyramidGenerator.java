
public class pyramidGenerator {

	String character = "#";
	int pyramidHeight;

	public void generate(int height) {
		for (int i = 1; i <= height; i++) {
			String spaceCharacter = "";
			for (int j = 1; j <= height - i; j++) {
				spaceCharacter += ".";
			}
			System.out.println(character + spaceCharacter);
			character += "#";
		}
	}
}

/*
 * ....#.... ...###... ..#####.. .#######. #########
 * 
 */
