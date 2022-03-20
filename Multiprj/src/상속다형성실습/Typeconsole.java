package »ó¼Ó´ÙÇü¼º½Ç½À;

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
		System.out.println("¼±¹°À» ÀÔ·ÂÇÏ¼¼¿ä : ");
		String[] mp = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("¸íÇ° > ");
			mp[i] = sc.nextLine();
			System.out.println("°¹¼ö > ");
			String mpnumb = sc.nextLine();
		}
		System.out.println("ÀüÀÚ±â±â > ");
		String electro = sc.nextLine();
		System.out.println("°¹¼ö > ");
		String elenumb = sc.nextLine();
		System.out.println("¿Ê > ");
		String cloth = sc.nextLine();
		System.out.println("°¹¼ö > ");
		String clothnumb = sc.nextLine();
		
		type.setMp(mp);
//		numb.setMpnumb(Integer.parseInt(mpnumb));	
		type.setElectro(electro);
		numb.setElenumb(Integer.parseInt(elenumb));
		type.setCloth(cloth);
		numb.setClothnumb(Integer.parseInt(clothnumb));
		
	}

	public void print() {	
		System.out.printf("¸íÇ° > %s, °¹¼ö > %d\n",type.getMp(),numb.getMpnumb());
		System.out.printf("ÀüÀÚ±â±â > %s, °¹¼ö > %d\n",type.getElectro(),numb.getElenumb());
		System.out.printf("¿Ê > %s, °¹¼ö > %d\n",type.getCloth(),numb.getClothnumb());
	}

}
