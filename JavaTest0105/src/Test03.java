import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int sum=0;
		int num;
		int count=0;
		
		do {
			System.out.print(">>정수값을 입력해주세요 : ");
			num = scan.nextInt();
			if(num>0) {
				sum+=num;
				count++;
			} else if(num<0) {
				System.out.println("정수를 입력해주세요.");
				continue;
			} else if (num==0) {
				break;
			}
		}while(true);
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/count);
		
	}

}
