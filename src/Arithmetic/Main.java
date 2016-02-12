package Arithmetic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,3,5,7,9};
		int[] b ={1,3,3,6,9};
		boolean arithmeticSeq=false;
		
		arithmeticSeq = FindingArithmetic.findingArithmetic(b);
		if(arithmeticSeq)
			System.out.println("Given array is Arithmetic sequence");
		else
			System.out.println("Given array is not Arithmetic sequence");
	}

}
