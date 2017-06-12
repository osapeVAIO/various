package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * 
 * @author osamu
 *
 */
public class BufferedReaderTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String inputString = br.readLine();
			System.out.println(inputString); 
		} 
	}

}
