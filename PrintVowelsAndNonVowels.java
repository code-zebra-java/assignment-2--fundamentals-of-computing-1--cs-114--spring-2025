import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //initialize the counters
    int aCounter = 0, eCounter = 0, iCounter = 0, oCounter = 0,
        uCounter = 0, nonVowelCounter = 0, spaceCounter = 0;

    //print a prompt to the user and accept the user input
    System.out.print("Please type in a sentence:");
    String userInput = scan.nextLine();

    //run a  for loop that sorts the different types of letter to their respective counters
    for (int i=0; i < userInput.length(); i++){
      if (userInput.charAt(i) == 'a'){
        aCounter++;
      }
      else if (userInput.charAt(i) == 'e'){
        eCounter++;
      }
      else if (userInput.charAt(i) == 'i'){
        iCounter++;
      }
      else if (userInput.charAt(i) == 'o'){
        oCounter++;
      }
      else if (userInput.charAt(i) == 'u'){
        uCounter++;
      }
      //this excludes the spaces from the nonvowel counter
      else if (userInput.charAt(i) == ' '){
        spaceCounter++;
      }
      else{
        nonVowelCounter++;
      }
    }

    //Print out the counts of each vowel and nonvowels to the user
    System.out.println("The vowel \"a\" appears in your sentence " + aCounter + " times");
    System.out.println("The vowel \"e\" appears in your sentence " + eCounter + " times");
    System.out.println("The vowel \"i\" appears in your sentence " + iCounter + " times");
    System.out.println("The vowel \"o\" appears in your sentence " + oCounter + " times");
    System.out.println("The vowel \"u\" appears in your sentence " + uCounter + " times");
    System.out.println("There are " + nonVowelCounter + " nonvowels in your sentence");

    scan.close();
  }
}
