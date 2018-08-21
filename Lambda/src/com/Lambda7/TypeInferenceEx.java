package com.Lambda7;

public class TypeInferenceEx {
	
	public static void main(String[] args) {
		
		//StrLngthLmbd strLngthLmbd = (s) -> s.length();
		
		//	System.out.println(strLngthLmbd.getLength(" Hello Lambda"));
		
		printLambda((s) -> s.length());
	}
	
	public static void printLambda(StrLngthLmbd l) {
		System.out.println(l.getLength(" Hello Lambda What"));
		
	}
	public interface StrLngthLmbd {

		public int getLength(String s);
	}

}
