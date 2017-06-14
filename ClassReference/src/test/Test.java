package test;

/**
 * クラスから別のクラスのインスタンスを参照するソースコード 
 * @author osamu
 *
 */
public class Test {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		Score score = new Score();
		student.setScore(score);
		
		score.setJapanese(100);
		
		Score score2 = student.getScore();
		
		System.out.println(score2.getJapanese());

	}

}
