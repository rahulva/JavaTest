package com.test.interview.sia;

public class Shipping {
	public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
    	  // large 5 tiems
        // small 1 item
        int maxNoOfItemsInLarge =availableLargePackages * 5;
        int maxNoOItemsInSmall = availableSmallPackages;
        int totalAvailableSlots = maxNoOfItemsInLarge +maxNoOItemsInSmall;
        
        
        int count;
//        if((maxNoOfItemsInLarge-items)>-1) {
//        	count++;
//        } else if()
        
//        int minimim =1;
//        if(items<=(maxNoOfItemsInLarge/2)) {
//        	minimim = 1;
//		} else if (items <= maxNoOfItemsInLarge){
//        	minimim = 2;	
//        } else if(items <=maxNoOItemsInSmall) {
//        	minimim = 1;	
//        }
        
        int reminingVal =(items %10);
        
        count =2+reminingVal;
        
        
        
        return reminingVal;
        
    }

	public static void main(String[] args) {
		System.out.println(minimalNumberOfPackages(16, 2, 10));
	}
}