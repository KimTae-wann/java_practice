package fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.basic.stream.object.Dish;
import fp.basic.stream.object.DishList;
import fp.basic.stream.object.DishType;
import fp.basic.stream.object.FoodType;

public class StreamBasic {

	
	public static void main(String[] args) {
		
		printDishUseFor();
		
		printDishUseStream();
		
		printEvenNumbers();
		
		System.out.println(makeString()); 
		
		List<Dish> result = getHealthyDishes();
		System.out.println(result);
//		result.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));
//		System.out.println(result); // 수정 불가능
		
		List<Dish> result2 = getHealthyDishes2();
		result2.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));
		System.out.println(result2); // 수정 가능
		
	}
	
	private static void printDishUseFor() {
		System.out.println("for Loop under 500 calories");
		List<Dish> dishList = DishList.makeDishList();
		for (Dish dish : dishList) {
			if (dish.getCalories() < 500) {
				System.out.println(dish);
			}
		}
	}

	private static void printDishUseStream() {
		System.out.println("List Loop under 500 calories");
		List<Dish> dishList = DishList.makeDishList();	
		dishList.forEach(dish -> {
			if (dish.getCalories() < 500) {
				System.out.println(dish);
			}
		});

		// Stream only use as List or Set. why?
		// why iterate twice? : X
		System.out.println("Stream Loop under 500 calories\n FoodType equals MEAT");
		Stream<Dish> dishStream= dishList.stream();
		dishStream
			.filter(dish -> dish.getCalories() < 500)
			.peek(dish -> {  // use as debug for current stream status
				System.out.println("name :" + dish.getName());
				System.out.println("calories : " + dish.getCalories());
				System.out.println("foodtype : " + dish.getFoodType());
				System.out.println("dishtype : " + dish.getDishType() + "\n");
			})
			.filter(dish -> dish.getFoodType() == FoodType.MEAT)
			.forEach(dish -> System.out.println(dish));
	}
	
	private static void printEvenNumbers() {
		List<Integer> numbers = Arrays.asList(1, 1, 1, 23, 5, 4342, 4544,  2, 432, 54, 3211, 32, 8, 32, 213, 5, 12, 123, 126);
		
		// 1. numbers에 있는 값을 전부 2를 곱해서 짝수로 만들어 출력
		System.out.println("\nfirst");
		numbers.stream()
		.map(num -> num * 2)
		.forEach(System.out::println);
		
		// 2. nubmers에 있는 값에서 중복된 숫자는 모두 제거하고 나머지 숫자에 전부 2를 곱해서 짝수로 만들어 출력
		System.out.println("\nsecond");
		numbers.stream()
		.distinct()
		.map(num -> num * 2)
		.forEach(System.out::println);
	}
	
	private static String makeString() {
		// 모든 VEGETABLES 메뉴의 이름들을 ","로 연결한 문자열을 반환한다.
		
		List<Dish> dishList = DishList.makeDishList();
		String dishesName = dishList.stream()
									.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES)
									.map(Dish::getName)
									.collect(Collectors.joining(", "));
		return dishesName;
	}
	
	private static List<Dish> getHealthyDishes() {
		List<Dish> dishList = DishList.makeDishList();
		List<Dish> returnList = dishList.stream()
										.filter(dish -> dish.getCalories() < 400)
										.toList(); // 수정 불가능한 리스트 반환
		return returnList;
	}
	
	private static List<Dish> getHealthyDishes2() {
		List<Dish> dishList = DishList.makeDishList();
		List<Dish> returnList = dishList.stream()
										.filter(dish -> dish.getCalories() < 400)
										.collect(Collectors.toList()); // 수정 가능한 리스트 반환
		return returnList;
	}
}
