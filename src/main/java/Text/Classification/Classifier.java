package Text.Classification;

public class Classifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App textToArff = new App();
		try {
			System.out.println(textToArff.TextToArff());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
