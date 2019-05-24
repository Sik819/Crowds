package functions;

import java.math.*;  // for BigInteger

public class NodeTransitionFunction {
	private Integer kVal;
	private Integer exp;
	
	public NodeTransitionFunction(Integer exp, Integer KVal) {
		// CONSTUCTOR: Sets the class to calculate f(x) = (x ^ exp) mod KVal 

		// TODO
		this.exp = exp;
		this.kVal = KVal;
	
	}
	

	
	
	public Integer apply(Integer val) {
		// PRE: -
		// POST: Implements f(val)
		
		// TODO
		Integer xPowExp = 1;
		Integer fx = 0;
		for(int i = 0; i < exp/2 ;i++) xPowExp*=val;
		fx = xPowExp%kVal;
		fx *= fx;
		if(exp%2!=0) fx *= val%kVal;
		fx %= kVal;  //Identity.. (ab) mod p = ((a mod p)(b mod p)) mod p
		return fx;
	}

	public BigInteger apply(BigInteger val) {
		// PRE: -
		// POST: Implements f(val), with val as a BigInteger

		// TODO
		
		return null;
	}


	
	public static void main(String[] args) {
		NodeTransitionFunction f = new NodeTransitionFunction(7, 33);
	}
	
}
