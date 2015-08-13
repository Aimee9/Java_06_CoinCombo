import java.util.Arrays;
public class CoinCombinations {
  public static void main(String[] args) {}

    public static Integer[] numberOfCoins( Integer userInput) {

      Integer[] coins = { 0,0,0,0 };
      //Integer[] bank = { 10,10,10 };


    // do{
    //   //System.out.println(userInput);
    //
    //   if((userInput / 25 > 0) && (coins[0] < 3)) {
    //     coins[0] = userInput / 25;
    //     userInput = userInput % 25;
    //     //System.out.println(userInput);
    //   } else if (userInput / 10 > 0) {
    //     coins[1] = userInput / 10;
    //     userInput = userInput % 10;
    //
    //   } else if(userInput / 5 > 0) {
    //     coins[2] = userInput / 5;
    //     userInput = userInput % 5;
    //
    //   } else  {
    //     //System.out.println(userInput);
    //     coins[3] = userInput / 1;
    //     userInput = userInput % 1;
    //
    //     //System.out.println(userInput);
    //   }
    //
    // } while(userInput > 0);

    do{
      //System.out.println(userInput);

      if((userInput / 25 > 0) && (coins[0] < 3)) {
        if ( userInput > 75 ) {
          userInput = userInput - 75;
          coins[0] = 3;
        } else {
          coins[0] = userInput / 25;
          userInput = userInput % 25;
        }



        //System.out.println(userInput);
      } else if ((userInput / 10 > 0) && (coins[1] < 3)) {
        //System.out.println(userInput);
        if ( userInput > 30 ) {
          userInput = userInput - 30;
          coins[1] = 3;
        } else {
        coins[1] = userInput / 10;
        userInput = userInput % 10;
        System.out.println(userInput);
        }

      } else if((userInput / 5 > 0) && (coins[2] < 3)) {
        if ( userInput > 15 ) {
          userInput = userInput - 15;
          coins[2] = 3;
        } else {
        coins[2] = userInput / 5;
        userInput = userInput % 5;
        }

      } else  {

        coins[3] = userInput / 1;
        userInput = userInput % 1;


      }

    } while(userInput > 0);
    //System.out.println(coins[1]);

    return coins;
}

}
