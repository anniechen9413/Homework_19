package HW1;

public class student {
	int score =90;
	
	//每休息一個小時 score就會減1
	public void play(int hours) {
		score -= hours;
	}
	
	//
	public void study(int hours) {
		score += hours;
	}
	
		
	//創建兩個student物件
	public static void main(String[]args) {
		
		student annie = new  student();
		annie.play(3);
		annie.study(5);
		
		System.out.println(annie.score);
		
	}
}


//課堂		student david=new student();
//  		student james=new student();
		
//			System.out.println(david.score);
//			System.out.println(james.score);
//			
//			david.play(2);
//			david.study(6);
			
//			james.play(5);
//			james.study(2);
			
//			System.out.println("=========");
			
//			System.out.println(david.score);
//			System.out.println(james.score);

//			david=james;
			
			

