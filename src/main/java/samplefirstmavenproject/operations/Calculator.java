package samplefirstmavenproject.operations;

public class Calculator {

	public int add(int i, int j) {
		// TODO Auto-generated method stub
	// return i+j;	
		
		if(i<0 && j<0)
			return 0;
		
		return i+j;
		
	}
	
	public int divide(int a, int b) {
		
		if(b==0)
			return 0;
		
		return a/b;
	}

}
