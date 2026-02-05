package fp.basic.impl;

import fp.basic.PrintSomething;

public class PrintNameWithNull implements PrintSomething{

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
}
