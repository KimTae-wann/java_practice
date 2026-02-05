package fp.basic;

public class CallFunctionLambda {

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
		CallFunctionLambda cf = new CallFunctionLambda();
		
		cf.callInterface( (String message) -> {
			if (message == null) {
				System.out.println("출력할 내용이 없습니다.");
			} else {
				for (int i = 0; i < 5; i++) {
					System.out.println(message);
				}
			}
		});
		
		// 람다식은 extends를 지원하지않음. 무조건 메서드 1개를 가진 interface만 가능
		// 힙 영역에 인스턴스를 실제로 생성하냐 안하냐
		//cf.callAbstractClass();
		
		PrintSomething funtion = (String message) -> {
			if (message == null) {
				System.out.println("파라미터 잘못 됨");
			} else {
				System.out.println(message.repeat(5));
			}
		};
		
		cf.callInterface(funtion);
		
		cf.callInterface( (String message) -> System.out.println(message));
		// 점심시간에 알아보면 될듯
		cf.callInterface( (String message) -> message.length());
	}
}
