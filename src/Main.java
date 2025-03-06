import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		PyramidGenerator pyramid = new PyramidGenerator();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose your character for pyramid: ");
		char character = scanner.next().charAt(0);

		System.out.println("Enter the pyramid height: ");
		int height = scanner.nextInt();

		scanner.close();

		pyramid.generate(character, height);

//		System.out.println(pyramid.getRow(3));
//		System.out.println(pyramid.getSpace(4,3));
	}

}
