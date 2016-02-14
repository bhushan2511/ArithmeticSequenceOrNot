package Arithmetic;
import java.util.Collections;
import java.util.HashSet;

public class FindingArithmetic {
	
	
	public static boolean findingArithmetic(int[] a)
	{
		int max=0;
		int min=0;
		int summation=0;
		int sumThruFormula=0;
		HashSet<Integer> numSet= new HashSet<Integer> ();
		
		
		//O(n) complexity, if i assume that there is not duplicate then I can skip this step
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
				summation+=num;
			}
		}
		
	    max = Collections.max(numSet);
	    min = Collections.min(numSet);
	    sumThruFormula=((max+min)*(a.length))/2;
	    
	    
	    //O(n) complexity
	    if(summation!=sumThruFormula)
	    {
	    		return false;	    	
	    }
	    
	    return true;	    
	    
	}

}
