import org.junit.*;
import static org.junit.Assert.*;

public class CoinCombinationsUnitTest {

  @Test
  public void coinCombo_forOnePenny() {
    CoinCombinations coins = new CoinCombinations();
    Integer[] result = {0,0,0,1};
    assertEquals(result, coins.numberOfCoins(1));
  }

  @Test
  public void coinCombo_forOneNickel() {
    CoinCombinations coins = new CoinCombinations();
    Integer[] result = {0,0,1,0};
    assertEquals(result, coins.numberOfCoins(5));
  }

  @Test
  public void coinCombo_forNickelandPenny() {
    CoinCombinations coins = new CoinCombinations();
    Integer[] result = {0,0,1,1};
    assertEquals(result, coins.numberOfCoins(6));
  }
  @Test
  public void coinCombo_forOneDime() {
    CoinCombinations coins = new CoinCombinations();
    Integer[] result = {0,1,0,0};
    assertEquals(result, coins.numberOfCoins(10));
  }

  @Test
  public void coinCombo_forDimeNickelPenny() {
    CoinCombinations coins = new CoinCombinations();
    Integer[] result = {0,1,1,1};
    assertEquals(result, coins.numberOfCoins(16));
  }

  @Test
  public void coinCombo_forOneOfEach() {
    CoinCombinations coins = new CoinCombinations();
    Integer[] result = {1,1,1,1};
    assertEquals(result, coins.numberOfCoins(41));
  }
}
