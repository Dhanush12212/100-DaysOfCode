import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
      Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
      Arrays.sort(coins, Comparator.reverseOrder());
      
      int countofCoins = 0;
      int amount = 4251;
      ArrayList<Integer> ans = new ArrayList<>();

      for(int i=0; i<coins.length; i++) {
        if(coins[i] <= amount) {
          while(coins[i] <= amount) {
            countofCoins ++;
            ans.add(coins[i]);
            amount = amount - coins[i];
          }
        }
      }

      System.out.println("The No. of coins used: "+ countofCoins);

      for(int i=0; i<ans.size(); i++) {
        System.out.print(ans.get(i)+ " ");
      }

    } 
}