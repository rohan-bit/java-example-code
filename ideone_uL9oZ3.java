/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	 public static int mySqrt(int x) {
        int l = 0;
        int r = x;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid*1l*mid > x){
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return r;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(mySqrt(n));
		
	}
}