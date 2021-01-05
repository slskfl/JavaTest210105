import java.util.Scanner;

public class Tesrt01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print(">>정수 값을 입력하시오. : ");
			int num = scan.nextInt();
			int count=0;
			
			if (num<=0) {
				System.out.println("정수를 입력해주세요.");
				continue;
			} 
			else if (num>0) {
				System.out.print(num+"의 약수 : "  );
				for ( int i=1; i<=num; i++) {
					if(num%i==0) {
						System.out.print(i+" ");
						count++;
					}
				}
			}
			System.out.println();
			System.out.println(num+"의 약수 개수 : " + count);
		}while(true);
		
		
	}

}
