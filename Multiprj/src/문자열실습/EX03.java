package ���ڿ��ǽ�;

public class EX03 {
	
	// format�̿�

	public static void main(String[] args) {
		String[] name = {"��ö��", "�̸���", "�̿���"};
		int[] score = {87, 42, 95};
		String str = "";
		for(int i=0; i<name.length; i++) {
			String sc = String.format("%s/%s",name[i],score[i]);
			if(i != name.length-1) str += sc+","; 
			else str+= sc;
		}
		System.out.println(str);
	}
}
