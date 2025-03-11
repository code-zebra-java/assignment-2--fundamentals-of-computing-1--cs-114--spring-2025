public class CountFlips {
  public static void main(String[] args) {
    // create a new instance of the coin class
    Coin myCoin = new Coin();

    //create variables to store the counts of each face
    int headsCount = 0;
    int tailsCount = 0;

    //run a for loop that counts how many times each face is flipped
    for (int i=0; i<100; i++){
      myCoin.flip();

      if (myCoin.isHeads()){
        headsCount++;
      }else{
        tailsCount++;
      }
    }

    // print the results to the user
    System.out.println("Count of Heads flipped: " + headsCount + " Count of Tails flipped: " + tailsCount);
  }
}
