import java.util.Scanner;
class Problem4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ��ǰ ����?");
		int n = sc.nextInt();
		int price = 15800;
		double totalPrice = 0 ;

		if( n >=10 ){
			totalPrice = price * n * 0.9;
		}else if ( n >= 20){
			totalPrice = price * n * 0.85;
		}else if( n >= 30 ){
			totalPrice = price * n * 0.8;
		}else{
			totalPrice = price * n*1.0;
		}

		

		System.out.println( "���� ���� : " + n + " �Ǹ� �� �ݾ� : " + totalPrice);
	}
}
