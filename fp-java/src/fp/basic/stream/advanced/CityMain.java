package fp.basic.stream.advanced;

import java.util.List;
import java.util.Optional;

public class CityMain {

	public static void main(String[] args) {
		List<City> cities = City.loadCityData();
		
		// Stream으로 안받는 이유 -> Stream은 정제 되어서 다시 사용하려고 하면
		// 문제가 생긴다. 그리고 stream을 계속 명시해주는 것이 더 직관적이긴함
		
		
		// stateId == 3907 인 City의 CountryName
		cities.stream()
		.filter(city -> city.getStateId() == 3907)
		.map(city -> city.getCountryName())
		.distinct()
		.forEach(System.out::println);
		
		
		// countryName == "South Korea"인 city의 _native 출력
		cities.stream()	// Stream<City>
		.filter(city -> city.getCountryName().equals("South Korea")) // Stream<City>
		.forEach(city -> System.out.println(city.get_native()) );
		
		// countryName == "South Korea"인 city의 countryName 출력
		cities.stream()	// Stream<City>
		.filter(city -> city.getCountryName().equals("South Korea")) // Stream<City>
		.map(city -> city.getCountryName()) // 반환 시키는 타입이 R이 된다 그럼 Stream<String>이 되겠지.
		.forEach(countryName -> System.out.println(countryName));
		
		// countryName == "South Korea"인 _native의 길이가 3이상인 City의 _native를 출력
		System.out.println("====");
		cities.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.filter(city -> city.get_native().length() >= 3)
		.forEach(city -> System.out.println(city.get_native()));
		
		/* 
		 * 결과
		동래구
		강서구
		금정구
		기장군
		해운대구
		사하구
		사상구
		수영구
		영도구
		 */
		
		// .skip 이나 .limit 같은 slicing 기법은 잘 쓰이지 않지만 특수한경우(데이터를 한정적으로 뽑아낼 때) 
		// 위의 결과에서 기장군 ~ 사하구 까지 뽑아내고 싶으면 아래같이 하면됨
		System.out.println("====");
		cities.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.filter(city -> city.get_native().length() >= 3)
		.skip(3)	// skip(n) -> n개 건너뜀
		.limit(3)	// limit(n) -> n개 만 뽑아옴
		.forEach(city -> System.out.println(city.get_native()));
		
		// _native의 값이 한글로만 이루어진 값 중 4글자 이상인 것의 name을 중복없이 조회한다.
		System.out.println("====");
		cities.stream()
//		.filter(city -> city.get_native().matches("^[가-힣]+$"))
//		.filter(city -> city.get_native().length() >= 4)
		.filter(city -> city.get_native().matches("^[가-힣]{4,}$"))
		.map(city -> city.getCountryName())
		.distinct()
		.forEach(System.out::println);
		
		
		// 애월읍의 stateName을 출력한다.
		System.out.println("====");
		Optional<City> opCities1 = cities.stream()	// Stream<City>
									.filter(city -> city.getName().equals("Gaigeturi")) // Stream<City>
									.findFirst(); // Optional<City>
		System.out.println(opCities1.isPresent());
		System.out.println(opCities1.orElse(null).getStateName());
		
		
		System.out.println("====");
		Optional<City> opCities2 = cities.stream()
									.filter(city -> city.getName().equals("asdasdasd"))
									.findFirst();
		
		System.out.println(opCities2.isPresent());
		//System.out.println(opCities2.orElse(null).getStateName()); // NullPointerException

		// Optional Case1
		City city = opCities2.orElse(null);
		if (city != null) {
			System.out.println(city.getCountryName());
		}
		
		// Optional Case2
		if (opCities2.isPresent()) {
			System.out.println(opCities2.get().getCountryName());
		}
		
		// Optional Case3
		City city2 = opCities2.orElse(new City(""));
		System.out.println(city2.getCountryName());
	}
}
