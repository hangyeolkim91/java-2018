package com.class5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * int a;
		 * double b;
		 * a = 10;
		 * 
		 * b = a;  ���� ( �Ͻ��� ����ȯ )
		 * 
		 * b = (double) a; (������ ����ȯ)
		 * 
		 * a = b;        (x)
		 * a = (int) b;  (o)
		 * ---------------------------------------
		 * �θ�(b) - �ڽ�(a)
		 * 
		 * �θ� = �ڽ�;         (o)   UPCAST
		 * �θ� = (�θ�) �ڽ�;  (o)
		 * 
		 * �ڽ� = �θ�;         (x)   DOWNCAST
		 * �ڽ� = (�ڽ�) �θ�;  (o)
		 * 
		 */
		
/*		String a = "";
		Object b;
		b =a;
		Integer c = (Integer) b;
		c.byteValue();
		
		�� �ڵ�� java.lang.ClassCastException�� �߻� ��Ű�� �����Ϸ��� ������ �߻���Ű�� ����
*/
		
		/*
		 *  Calendar : ���� �ý����� ��¥ �� �ð��� ����
		 *  
		 */
		Calendar now = Calendar.getInstance();
		
		//Calendar now1 = new GregorianCalendar();
		
		
		
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1;
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y +"-"+ m+"-"+d);
		System.out.println(w);
		
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println(y +"-"+ m+"-"+d + " " + week[w-1]);
		
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println("ù�� : "+ startDay);
		System.out.println("���� : "+ endDay);
		
		System.out.printf("%tF\n", now);
		System.out.printf("%tT\n", now);
		
		System.out.printf("%1$tF %1$tT\n", now);
		
		now.set(2019,10-1,10);
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y +"-"+ m+"-"+d + " " + week[w-1]);
		
	}

}