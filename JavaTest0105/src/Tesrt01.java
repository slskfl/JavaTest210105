import java.util.Scanner;

public class Tesrt01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print(">>���� ���� �Է��Ͻÿ�. : ");
			int num = scan.nextInt();
			int count=0;
			
			if (num<=0) {
				System.out.println("������ �Է����ּ���.");
				continue;
			} 
			else if (num>0) {
				System.out.print(num+"�� ��� : "  );
				for ( int i=1; i<=num; i++) {
					if(num%i==0) {
						System.out.print(i+" ");
						count++;
					}
				}
			}
			System.out.println();
			System.out.println(num+"�� ��� ���� : " + count);
		}while(true);
		
		
	}

}
