import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Test6 {

	public static void main(String[] args) throws IOException {
		
		// �غ�(w)�� ����(h)�� �Է¹޾� �ﰢ���� ����(a)���ϱ�
		// �غ�? 10
		// ����? 20
		// ���� : 15
		
		double w , h, a;

		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
		
		System.out.print("�غ� ?");
		w = Double.parseDouble(br.readLine());
		System.out.print("���� ?");
		h = Double.parseDouble(br.readLine());

		a = w * h / 2;
		/* ����ȯ
		* int w, h;
		* a = w * h / 2.0;
		* a = [(double) w ] * h / 2;
		*      w�� double�� �ٲ�
		*/

		System.out.println("���� : " + a);
	}
}