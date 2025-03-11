public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    //create a variable that stores the given suffix
    String suffix;

    //run a for loop to print the verses of the "12 Days of Christmas" song
    for (int i=1; i < 13; i++){
      //use a switch statement to determine the suffix depending on the integer value
      switch (i){
        case 1:
        suffix = "st";
        break;

        case 2:
        suffix = "nd";
        break;

        case 3:
        suffix = "rd";
        break;

        default: 
        suffix = "th";
      }

      //print to the terminal the first sentence of every verse with the correct day and suffix
      System.out.println("On the " + i + suffix + " day of Christmas, my true love gave to me");

      //use a switch statement to print the items given depending on the day
      //avoid break statements to enable fallthrough
      switch (i){
        case 12:
        System.out.println("Twelve drummers drumming, ");
        case 11:
        System.out.println("Eleven pipers piping, ");
        case 10:
        System.out.println("Ten lords a-leaping, ");
        case 9:
        System.out.println("Nine ladies dancing, ");
        case 8:
        System.out.println("Eight maids a-milking, ");
        case 7:
        System.out.println("Seven swans a-swimming, ");
        case 6:
        System.out.println("Six geese a-laying, ");
        case 5:
        System.out.println("Five golden rings,");
        case 4:
        System.out.println("Four calling birds, ");
        case 3:
        System.out.println("Three French hens, ");
        case 2:
        System.out.println("Two turtle doves, and");
        default: System.out.println("A partridge in a pear tree.\n");
      }
    }
  }
}
