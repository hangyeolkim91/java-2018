import java.io.*;

class Test4{

	public static void main(String[] args) throws IOException {// Exception ����, (ti)API ������ ���� �� �ִ����� üũ�ϴ� �뵵

		/*
		* System.in : Ű���带 ���� 1byte ���ڸ� �Է¹��� (ǥ���Է�?)
		* InputStreamReader : System.in���� �Է¹��� 1byte���ڸ� 2byte�� ���ڷ� ����
		* BufferedReader : ����(�޸�)�� ����
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r;
		double a,l;

		System.out.print("������? ");

		r = Integer.parseInt(br.readLine());

		a = r*r*3.14;
		l = 2*3.14*r;

		System.out.println("���� : " + a +" �ѷ�: " + l );

	}
}
