import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int sum=0;
		int num;
		int count=0;
		
		do {
			System.out.print(">>�������� �Է����ּ��� : ");
			num = scan.nextInt();
			if(num>0) {
				sum+=num;
				count++;
			} else if(num<0) {
				System.out.println("������ �Է����ּ���.");
				continue;
			} else if (num==0) {
				break;
			}
		}while(true);
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/count);
		
	}

}
