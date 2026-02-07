package fp.basic.stream.advanced.utils;

public abstract class ArrayUtil {
	
	
	public static String getValue(String[] array, int index ) {
		if (index >= 0 && array.length > index) {
			String value = array[index];
			if (value != null) {
				value = value.replace("\"", "");
			}
			return value;
		}
		return null;
	}
}
