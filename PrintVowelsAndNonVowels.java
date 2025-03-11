import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //initialize the counters
    int a_Counter = 0, e_Counter = 0, i_Counter = 0, o_Counter = 0,
        u_Counter = 0, nonVowelCounter = 0, spaceCounter = 0;

    //print a prompt to the user and accept the user input
    System.out.print("Please type in a sentence:");
    String userInput = scan.nextLine();

    //run a  for loop that sorts the different types of letter to their respective counters
    for (int i=0; i < userInput.length(); i++){
      if (userInput.charAt(i) == 'a'){
        a_Counter++;
      }
      else if (userInput.charAt(i) == 'e'){
        e_Counter++;
      }
      else if (userInput.charAt(i) == 'i'){
        i_Counter++;
      }
      else if (userInput.charAt(i) == 'o'){
        o_Counter++;
      }
      else if (userInput.charAt(i) == 'u'){
        u_Counter++;
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
    System.out.println("The vowel \"a\" appears in your sentence " + a_Counter + " times");
    System.out.println("The vowel \"e\" appears in your sentence " + e_Counter + " times");
    System.out.println("The vowel \"i\" appears in your sentence " + i_Counter + " times");
    System.out.println("The vowel \"o\" appears in your sentence " + o_Counter + " times");
    System.out.println("The vowel \"u\" appears in your sentence " + u_Counter + " times");
    System.out.println("There are " + nonVowelCounter + " nonvowels in your sentence");

    scan.close();
  }
}
