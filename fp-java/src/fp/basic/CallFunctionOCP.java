package fp.basic;

import fp.basic.impl.CallAgeWithNumberFormatEx;
import fp.basic.impl.PrintNameWithNull;

public class CallFunctionOCP {
	
	public void callInterface(PrintSomething ps) {
		String something = null;
		ps.print(something);
	}
	
	public void callAbstractClass(CallSomething cs) {
		String something = "asdsda";
		int result = cs.call(something);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		CallFunctionOCP cf = new CallFunctionOCP();
		cf.callInterface(new PrintNameWithNull());
		cf.callAbstractClass(new CallAgeWithNumberFormatEx());
	}
}
