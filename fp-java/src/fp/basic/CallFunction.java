package fp.basic;

import fp.basic.impl.CallAge;
import fp.basic.impl.PrintName;

public class CallFunction {
	
	public void callInterface(PrintSomething ps) {
		String something = "hello ";
		ps.print(something);
	}
	
	public void callAbstractClass(CallSomething cs) {
		String something = "44";
		int result = cs.call(something);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		CallFunction cf = new CallFunction();
		cf.callInterface(new PrintName());
		cf.callAbstractClass(new CallAge());
	}
}
