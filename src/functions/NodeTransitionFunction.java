package functions;

import java.math.*;  // for BigInteger

public class NodeTransitionFunction {

	public NodeTransitionFunction(Integer exp, Integer KVal) {
		// CONSTUCTOR: Sets the class to calculate f(x) = (x ^ exp) mod KVal 

		// TODO
	}
	

	
	
	public Integer apply(Integer val) {
		// PRE: -
		// POST: Implements f(val)
		
		// TODO
		
		return null;
	}

	public BigInteger apply(BigInteger val) {
		// PRE: -
		// POST: Implements f(val), with val as a BigInteger

		// TODO
		
		return null;
	}


	
	public static void main(String[] args) {
		NodeTransitionFunction f = new NodeTransitionFunction(3, 33);
		
		System.out.println(f.apply(5));
	}
	
}
