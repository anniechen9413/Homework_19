package HW2;

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//int*2



public class HW2_3 {
		public static void main(String[]args) {
			int mul=1;
			int i=1;
			while(i<=10) {
				mul*=1;
				i++;
			}
			System.out.println("1-10的連乘積是"+mul);
	
		}
}
