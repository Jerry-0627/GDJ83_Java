package com.jerry.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();
		birth.set(2000, 5, 27);
		long b = birth.getTimeInMillis();
		System.out.println(birth.getTime());

		long c = ca.getTimeInMillis();
		System.out.println(c);
		int i = 1000 * 60 * 60 * 24;
		System.out.println(b / i);

		b = b + i * 100L;
		birth.setTimeInMillis(b);
		System.out.println(birth.getTime());

		String n = "1995-03-12";
		String[] a = n.split("-");
		ca.set(Integer.parseInt(a[0]), Integer.parseInt(a[1]) - 1, Integer.parseInt(a[2]));
		System.out.println(ca.getTime());

		//

		ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분");
		String s = sd.format(ca.getTime());
		System.out.println(s);

		String id = UUID.randomUUID().toString();
		System.out.println(id);
		System.out.println(id);

	}
}
