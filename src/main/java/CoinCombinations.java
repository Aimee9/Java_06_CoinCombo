import java.util.Arrays;
public class CoinCombinations {
  public static void main(String[] args) {}

    public static Integer[] numberOfCoins( Integer userInput) {

      Integer[] coins = { 0,0,0,0 };

    do{
      //System.out.println(userInput);

      if(userInput / 25 > 0) {
        coins[0] = userInput / 25;
        userInput = userInput % 25;
        //System.out.println(userInput);
      } else if (userInput / 10 > 0) {
        coins[1] = userInput / 10;
        userInput = userInput % 10;

      } else if(userInput / 5 > 0) {
        coins[2] = userInput / 5;
        userInput = userInput % 5;

      } else  {
        //System.out.println(userInput);
        coins[3] = userInput / 1;
        userInput = userInput % 1;

        //System.out.println(userInput);
      }

    } while(userInput > 0);

    return coins;
}

}
