import java.util.*;
import java.io.*;
class Solution {
    public int maxProfit(int[] prices) {
        int minValue=Integer.MAX_VALUE,profit=0;
            for(int i=0;i<prices.length;i++){
               if(minValue>prices[i]){
                   minValue=prices[i];
               } 
                if((prices[i]-minValue)>profit){
                    profit=prices[i]-minValue;
                }
            }
        return profit;
    }
}
