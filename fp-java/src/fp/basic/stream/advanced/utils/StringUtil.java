package fp.basic.stream.advanced.utils;

public abstract class StringUtil {

	public static int toInt(String str) {
		if (str == null) {
			return 0;
		}
		
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			return 0;
		}
	}
}
