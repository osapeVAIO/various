
/**
 * 
 * @author osamu
 *
 */
public class ClassForName {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName(args[0]).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
