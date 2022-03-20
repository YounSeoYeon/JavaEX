package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stprac3 {

	public static void main(String[] args) throws IOException {
		
		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		
		// 1. srcFile의 입력스트림객체 하나를 만든다. 이름은 srcFis로 한다.
		FileInputStream srcFis = new FileInputStream(srcFile);
		// 3. "res/data-copy.txt"파일을 조작하기 위한 File 객체를 만든다. 이름은 copyFile로 한다.
		File copyFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\data-copy.txt");
		// 4. copyFile의 출력스트림 객체를 만든다. 이름은 copyFos로 한다.
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		
		int x;
		boolean done = false;
		
		while(!done)
		{
			x = srcFis.read();
			
			if(x<0) 
				break;
			
//			if(x>'5') // 5 → 53
//				continue;
			
			if(x=='0')
				copyFos.write('?');
			else if(x==' ')
				copyFos.write('★');
			else
			copyFos.write(x);
			
			if(x==' ')
			copyFos.write('\n');
			
			/*
			{if(x<0)
				break;
			if(x==' ')
				copyFos.write('\n');
			else copyFos.write(x);}*/
			}
			
		// 2. srcFis 객체를 닫는다.
		srcFis.close();		
		// 5. copyFos를 닫는다.
		copyFos.close();
		
		System.out.println("작업완료");
		System.out.printf("%d",'5'+1);
	}

}
