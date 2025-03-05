
public class Main {

	public static void main(String[] args) {

		PyramidGenerator pyramid = new PyramidGenerator();
		pyramid.generate(4);
		System.out.println();
		pyramid.generateReversed(4);
	}

}
