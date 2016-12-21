// https://www.hackerrank.com/challenges/ctci-array-left-rotation
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLeftRotation {
	static int[] rotateLeft(int[] a, int n, int k){
		int[] ans = new int[n];
		for (int i = 0; i < ans.length; i++) {
			int x = (i <= n - k - 1) ? 0 : n;
			ans[i] = a[i + k - x];
		}
		return ans;
		
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] ans = ArrayLeftRotation.rotateLeft(a, n, k);
        String sep = "";
        for (int i = 0; i < ans.length; i++) {
			System.out.print(sep + ans[i]);
			sep = " ";
		}
        	
    }
}
