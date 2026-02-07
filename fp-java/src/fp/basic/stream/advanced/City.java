package fp.basic.stream.advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import fp.basic.stream.advanced.utils.ArrayUtil;
import fp.basic.stream.advanced.utils.StringUtil;

public class City {

	// line - 9 -> Array Index
	private int id;					
	private String name;
	private int stateId;
	private String stateCode;
	private String stateName;
	private int countryId;
	private String countryCode;
	private String countryName;
	private String latitude;
	private String longitude;
	private String _native;
	private String type;
	private int level;
	private int parentId;
	private int population;
	private String timezone;
	private String wikiDataId;
	
	public static List<City> loadCityData() {
		Path path = Paths.get("C:\\\\Users\\\\xodhk\\\\Downloads\\\\java-stream-countries-states-cities-database-master\\\\java-stream-countries-states-cities-database-master\\\\csv", "cities.csv");
		try {
			return Files.lines(path)
					.skip(1) // Stream<String>
					.parallel() // 병렬
					.map(City::new) // Stream<City>
					.toList(); // List<City>
			
		}
		catch (IOException e) {
			return null;
		}
	}
	
	public City(String cityLineString) {
		cityLineString = cityLineString.replace(",", ";");
		String[] values = cityLineString.split(";");
		this.id = StringUtil.toInt(ArrayUtil.getValue(values, 0));
		this.stateId = StringUtil.toInt(ArrayUtil.getValue(values, 2));
		this.countryId = StringUtil.toInt(ArrayUtil.getValue(values, 5));
		this.level = StringUtil.toInt(ArrayUtil.getValue(values, 12));
		this.parentId = StringUtil.toInt(ArrayUtil.getValue(values, 13));
		this.population = StringUtil.toInt(ArrayUtil.getValue(values, 14));
		this.name = ArrayUtil.getValue(values, 1);
		this.stateCode = ArrayUtil.getValue(values, 3);
		this.stateName = ArrayUtil.getValue(values, 4);
		this.countryCode = ArrayUtil.getValue(values, 6);
		this.countryName = ArrayUtil.getValue(values, 7);
		this.latitude = ArrayUtil.getValue(values, 8);
		this.longitude = ArrayUtil.getValue(values, 9);
		this._native = ArrayUtil.getValue(values, 10);
		this.type = ArrayUtil.getValue(values, 11);
		this.timezone = ArrayUtil.getValue(values, 15);
		this.wikiDataId = ArrayUtil.getValue(values, 16);
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getStateId() {
		return stateId;
	}
	public String getStateCode() {
		return stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public int getCountryId() {
		return countryId;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public String getLatitude() {
		return latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public String get_native() {
		return _native;
	}
	public String getType() {
		return type;
	}
	public int getLevel() {
		return level;
	}
	public int getParentId() {
		return parentId;
	}
	public int getPopulation() {
		return population;
	}
	public String getTimezone() {
		return timezone;
	}
	public String getWikiDataId() {
		return wikiDataId;
	}
	
	

}
