package Arithmetic;
import java.util.Collections;
import java.util.HashSet;

public class FindingArithmetic {
	
	
	public static boolean findingArithmetic(int[] a)
	{
		int max=0;
		int min=0;
		int arithmeticMean=0;
		HashSet<Integer> numSet= new HashSet<Integer> ();
		
		
		//O(n) complexity
		for(int num:a)
		{
			//I used hashset because in case of duplicate elements in the array it will return false
			if(numSet.contains(num) )
			{
				return false;
			}
			else
			{
				numSet.add(num);
			}
		}
		
	    max = Collections.max(numSet);
	    min = Collections.min(numSet);
	    arithmeticMean=(max-min)/(a.length-1);
	    
	    
	    //O(n) complexity
	    for(int num:a)
	    {
	    	int divisorOf = (num -1) % arithmeticMean;
	    	if(divisorOf!=0)
	    		return false;	    	
	    }
	    
	    return true;	    
	    
	}

}
