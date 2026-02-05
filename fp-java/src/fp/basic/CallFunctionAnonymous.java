package fp.basic;

public class CallFunctionAnonymous {

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
		CallFunctionAnonymous cf = new CallFunctionAnonymous();
		
		cf.callInterface(new PrintSomething() {
			@Override
			public void print(String message) {
				if (message == null) {
					System.out.println("출력할 내용이 없습니다.");
				} else {
					for (int i = 0; i < 5; i++) {
						System.out.println(message);
					}
				}
			}
			
		});
		
		cf.callAbstractClass(new CallSomething() {

			@Override
			public int call(String message) {
				try {
					return Integer.parseInt(message);
				}
				catch (NumberFormatException nfe) {
					return 0;
				}
			}
		});
	}
}
