package Number;

import java.util.HashSet;
import java.util.Set;
/*
 * Find first duplicate number in array..
 * */
public class FirstDupicateNumber {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	int arr[] = {6,5,3,2,5,1,2,4};
	for(int temp:arr) {
		if(set.add(temp)) {}else {
			System.out.println("first duplicate element is"+temp);
			break;
		}
	}
}
}
