package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Score score = new Score();
		student.setScore(score);
		
		score.setJapanese(100);
		
		Score score2 = student.getScore();
		
		System.out.println(score2.getJapanese());

	}

}
