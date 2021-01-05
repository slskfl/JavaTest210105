import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		boolean result=false;
		
		do {
			System.out.print(">>정수 값을 입력하시오. : ");
			int num = scan.nextInt();
			
			if (num<=0) {
				System.out.println("정수를 입력해주세요.");
				continue;
			} 
			else if (num>0) {
				for(int i=2; i<num; i++) {
					if(num%i==0) {
						result=true;
					} 
				}
				if (result) {
					System.out.println("소수가 아닙니다.");
				} else {
					System.out.println("소수입니다.");
				}
			}
		}while(true);
	}

}
