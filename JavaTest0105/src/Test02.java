import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		boolean result=false;
		
		do {
			System.out.print(">>���� ���� �Է��Ͻÿ�. : ");
			int num = scan.nextInt();
			
			if (num<=0) {
				System.out.println("������ �Է����ּ���.");
				continue;
			} 
			else if (num>0) {
				for(int i=2; i<num; i++) {
					if(num%i==0) {
						result=true;
					} 
				}
				if (result) {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				} else {
					System.out.println("�Ҽ��Դϴ�.");
				}
			}
		}while(true);
	}

}
