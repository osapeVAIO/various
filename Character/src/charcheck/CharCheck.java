package charcheck;

public class CharCheck {

	public static void main(String[] args) {
		for(int i = 0xFF41; i < 0xFF5A ; i++) {
			char x = (char)i;
			System.out.println(x);
			
			String str = "Hello ";
			str = str.replaceAll(" ", "");
		}
		
		for(int i = 0x20; i < 0x90 ; i++) {
			char x = (char)i;
			System.out.printf("%d %c \r\n",i,x);
		}
		
	}

}

class MyException extends Exception {
	@Override
	public String getMessage() {
		return "MSG";
	}
}
