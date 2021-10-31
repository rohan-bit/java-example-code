/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int leastPriceSoFar = prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i] >= leastPriceSoFar){
                maxProfit = Math.max(maxProfit,prices[i]-leastPriceSoFar);
            }
            leastPriceSoFar = Math.min(leastPriceSoFar,prices[i]);
        }
        return maxProfit;
    }
}


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
	}
}