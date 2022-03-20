package ��Ӵ������ǽ�;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Type {
	
	private String[] mp;
	private String electro;
	private String cloth;
	private Numb[] numb;	
	
	public Type() {
		String[] mp = new String[3];
		for(int i=0; i<mp.length; i++) {
			mp[i] = new String();
		}
		electro = "";
		cloth = "";
		numb = new Numb[3];		
	}
		
	public String[] getMp() {
		return mp;
	}

	public void setMp(String[] mp) {
		this.mp = mp;
	}

	public String getElectro() {
		return electro;
	}

	public void setElectro(String electro) {
		this.electro = electro;
	}

	public String getCloth() {
		return cloth;
	}

	public void setCloth(String cloth) {
		this.cloth = cloth;
	}


	public Type(String[] mp, String electro, String cloth) {
		this.mp = mp;
		this.cloth = cloth;
		this.electro = electro;
	}

	public void save() throws IOException {
		File file = new File("C:\\education\\workspace\\Multiprj\\res\\gift.txt");
		FileOutputStream fi = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fi);
		
		for (int i = 0; i < mp.length; i++) {
			ps.printf("��ǰ: %s", mp[i]);
			ps.printf("��ǰ����: %d\n", numb[i].getMpnumb());
			ps.printf("���ڱ��: %s, ��: %s\n", this.electro, this.cloth);
			ps.printf("���ڱ�ⰹ��: %d, �ʰ���: %d ", numb[i].getElenumb(), numb[i].getClothnumb());
		}
		ps.close();
		fi.close();
	}

}
