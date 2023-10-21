package HW2;

//請設計一隻JAVA程式 計算1-1000的偶數和(2+4+6+8....1000)
// int*2
// for if

public class HW2 {
	public static void main(String[]args) {
		int sum=0;
		for(int i=2 ;i<=1000;i++) {
			if(i%2==0){
				sum += i;
			}
		}
		System.out.println("1~1000的偶數和:"+sum);
	}
	
}
	
			