package fp.basic.impl;

import fp.basic.CallSomething;

public class CallAgeWithNumberFormatEx extends CallSomething{

	@Override
	public int call(String message) {
		try {
			return Integer.parseInt(message);
		}
		catch (NumberFormatException nfe) {
			return 0;
		}
	}
}
