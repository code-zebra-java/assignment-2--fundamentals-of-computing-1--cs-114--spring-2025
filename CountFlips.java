public class CountFlips {
  public static void main(String[] args) {
    Coin myCoin = new Coin();

    int headsCount = 0;
    int tailsCount = 0;

    for (int i=0; i<100; i++){
      myCoin.flip();

      if (myCoin.isHeads()){
        headsCount++;
      }else{
        tailsCount++;
      }
    }

    System.out.println("Count of Heads flipped: " + headsCount + " Count of Tails flipped: " + tailsCount);
    System.out.println();
  }
}
