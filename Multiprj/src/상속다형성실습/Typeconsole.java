package ��Ӵ������ǽ�;

import java.util.Scanner;

public class Typeconsole {
	
	private Type type;
	private Numb numb;
	
	public Typeconsole() {
		numb = new Numb();
	}

	public void setType(Type type) {		
		this.type = type;
	}
		

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String[] mp = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("��ǰ > ");
			mp[i] = sc.nextLine();
			System.out.println("���� > ");
			String mpnumb = sc.nextLine();
		}
		System.out.println("���ڱ�� > ");
		String electro = sc.nextLine();
		System.out.println("���� > ");
		String elenumb = sc.nextLine();
		System.out.println("�� > ");
		String cloth = sc.nextLine();
		System.out.println("���� > ");
		String clothnumb = sc.nextLine();
		
		type.setMp(mp);
//		numb.setMpnumb(Integer.parseInt(mpnumb));	
		type.setElectro(electro);
		numb.setElenumb(Integer.parseInt(elenumb));
		type.setCloth(cloth);
		numb.setClothnumb(Integer.parseInt(clothnumb));
		
	}

	public void print() {	
		System.out.printf("��ǰ > %s, ���� > %d\n",type.getMp(),numb.getMpnumb());
		System.out.printf("���ڱ�� > %s, ���� > %d\n",type.getElectro(),numb.getElenumb());
		System.out.printf("�� > %s, ���� > %d\n",type.getCloth(),numb.getClothnumb());
	}

}
