/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int majorityElement(int[] nums) {
      int c=0;
      int val = nums[0];
      for(int x:nums){
          if(val == x){
              ++c;
          }
          else
          {
              --c;
              if(c==0)
              {
                  val = x;
                  c=1;
              }
          }
      }
     return val;
        
	}    
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new  int[n];
		for(int i=0;i<n;i++)
			{
				arr[i]= sc.nextInt();
			}
		System.out.println(n);
		System.out.println(majorityElement(arr));
		
	}
}