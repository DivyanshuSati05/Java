import java.util.Scanner;
public class Bonus_program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		int vowelcount = 0;
		
		String lowercase = sentence.toLowerCase();
		
		for (int i = 0; i < lowercase.length(); i++) {
            char ch = lowercase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;
            }
        }
		
		 String[] words = sentence.trim().split("\\s+");
	        int wordcount = words.length;
	        
	        System.out.println("Number of vowles: "+ vowelcount);
	        System.out.println("Number of words: "+ wordcount);
	        
	        sc.close();

		

	}

}
