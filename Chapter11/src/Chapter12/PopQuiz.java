package Chapter12;

public class PopQuiz {

	public static void main(String[] args) {
		
		//String[] quiz = {"I", "Love", "Life", "And" , "Living"};
		
		String[] words = new String[5];
		words[0] = "I";
		words[1] = "Love";
		words[2] = "My";
		words[3] = "Wonderful";
		words[4] = "Life";
		
		for(int i  = 1; i < words.length; i++){
			System.out.print(words[i].length());
			
		}
		
		for(String word : words){
			System.out.println(word.length());
		}
		

	}

}
