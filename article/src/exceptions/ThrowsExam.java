package exceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import market.encapsulation.customer.*;

// 이렇게 하지말라는 것을 알려주기 위함임. 예외처리 위임하지 마라
public class ThrowsExam {

	/**
	 * createNewInstance("클래스 절대 경로");
	 * 	==> 클래스 경로의 Instance가 반환
	 * @param classPath
	 * @return
	 */
	public static Object createNewInstance(String classPath) {
		Class clazz = null;
		try {
			clazz = Class.forName(classPath);			
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println(classPath + ": 존재하지 않는 클래스입니다.");
		}
		
		if (clazz != null) {
			Constructor constructor = null;
			try {
				// 생성자 호출
				constructor = clazz.getConstructor(int.class, int.class, int.class);
			}
			catch (NoSuchMethodException nsme) {
				System.out.println("생성자를 찾을 수 없습니다.");
			}
			
			if (constructor != null) {
				try {
					Object instance = constructor.newInstance(100, 100, 100);
					return instance;
				} catch (InstantiationException e) {
					System.out.println("인스턴스 생성을 실패했습니다.");
				} catch (IllegalAccessException e) {
					System.out.println("접근권한이 없습니다.");
				} catch (IllegalArgumentException e) {
					System.out.println("생성 파라미터가 잘못되었습니다.");
				} catch (InvocationTargetException e) {
					System.out.println("생성자를 실행할 때 에러가 발생했습니다.");
				}
			}
			
		}
		return null;
	}
	
//	public static Object createNewInstance2(String classPath) throws ClassNotFoundException, 
//																	NoSuchMethodException,
//																	InstantiationException,
//																	IllegalAccessException,
//																	IllegalArgumentException,
//																	InvocationTargetException{
//		Class clazz = null;
//		clazz = Class.forName(classPath);			
//		if (clazz != null) {
//		Constructor constructor = null;
//		if (constructor != null) {
//			Object instance = constructor.newInstance("리플렉션", 100);
//			return instance;
//		}
//		return null;
//	}
	
	public static void main(String[] args) {
		Customer cust = (Customer) createNewInstance("market.encapsulation.customer.Customer");
		System.out.println(cust.getCustomerNum());
	}
}
