package org.pojo;

import java.util.List;
import java.util.Vector;

public class AnbuMainClass {
	public static void main(String[] args) {
		List<AnbuManoj>li=new Vector<AnbuManoj>();
		AnbuManoj m=new AnbuManoj();
		m.setEmpId(1);
		m.setEmpName("Damodhara");
		li.add(m);
		AnbuManoj m1=new AnbuManoj();
		m1.setEmpId(2);
		m1.setEmpName("Rajkumar");
		li.add(m1);
		AnbuManoj m2=new AnbuManoj();
		m2.setEmpId(3);
		m2.setEmpName("Dhinesh");
		li.add(m2);
		AnbuManoj m3=new AnbuManoj();
		m3.setEmpId(4);
		m3.setEmpName("Jeeva");
		li.add(m3);
		for(AnbuManoj x:li) {
			System.out.println(x.getEmpId());
			System.out.println(x.getEmpName());
		}
	}
}
