package Number;

import java.util.ArrayList;
import java.util.Arrays;

//public class PrintCombinationsToGetTarget {
//public static void main(String[] args) {
//	Integer[] nums = {2, 4, 3, 5, 7, 8, -1};
//	ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(nums));
//    int target = 7;
//    int sum =0;
//    int n = nums.length;
////    System.out.println("I am testing");
//    for(int i = 0; i<n;i++) {
//    	int n1 = lst1.size();
//    	ArrayList<Integer> lst = new ArrayList<>(); 
//    	sum =0;
//    	for(int j = i; j<n1;j++) {
//    		int val = lst1.get(j);
////    		lst.add(lst1.get(j));
////    		sum += lst.get(j);
//    		lst.add(val);
//    		sum += val;
////    		System.out.println(sum);
//    		if(sum == target) {
//    			System.out.println(lst);
//    			for(Integer temp :lst) {
//    				lst1.remove(temp);
//    			}
//    			
//    		}
//    			
//    	}
//    }
//}
//}

////[2, 4, 3, -1]
//[2, 5]
//[4, 3]
//[7]
//[8, -1]
public class PrintCombinationsToGetTarget {
	static int sum =0;
	static {
		System.out.println("THIS IS STATIC BLOCK");
	}
    public static void main(String[] args) {
        Integer[] nums = {2, 4, 3, 5, 7, 8, -1,1,6,9};
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(nums));
        int target = 7;
        int n = lst1.size();

        // Temporary list to collect all elements to be removed later
        ArrayList<Integer> toRemove = new ArrayList<>();
        
        sum =0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            ArrayList<Integer> lst = new ArrayList<>();

            for (int j = i; j < n; j++) {
                int val = lst1.get(j);
                lst.add(val);
                sum += val;

                if (sum == target) {
                    System.out.println("I am getting printed>>"+lst);
                    toRemove.addAll(lst);
                    sum =0;
                    break; // stop at first match from index i
                }
            }
        }

        // Remove collected elements (if needed)
        lst1.removeAll(toRemove);
//        sum =0;
        ArrayList<Integer> lst2 = new ArrayList<>();
        for(Integer temp: lst1) {
        	
        	
        	lst2.add(temp);
        	sum += temp;
        	System.out.println("Sum mai hu>> "+sum);
        	if(sum == target)
     		System.out.println(lst2);
        }

        System.out.println(lst1);
    }
}
