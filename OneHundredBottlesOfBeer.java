
public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {

    //run a for loop that prints each verse of the “One Hundred Bottles of Beer” song.
    for (int i=100; i > 0; i--){
      System.out.println(i + " bottles of beer on the wall \n" + i + 
      " bottles of beer \nIf one of those bottles should happen to fall \n"+ 
       (i-1) + " bottles of beer on the wall \n");
    }
  }
}
