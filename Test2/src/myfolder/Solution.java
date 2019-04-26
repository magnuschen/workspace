package myfolder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {



    // Complete the oddNumbers function below.
    public static List<Integer> oddNumbers(int l, int r) {
    	List<Integer> result = new ArrayList<Integer>();
    	for(int i=l; i<=r;i++) {
    		if(i%2 !=0) {
    			result.add(i);
    		}
    	}
    	return result;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> result = oddNumbers(1,10);
        System.out.println(result.toString());
    }
}
