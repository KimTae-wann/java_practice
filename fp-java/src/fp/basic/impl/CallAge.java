package fp.basic.impl;

import fp.basic.CallSomething;

public class CallAge extends CallSomething{

	@Override
	public int call(String message) {
		return Integer.parseInt(message);
	}
}
