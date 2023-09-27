package ch08.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyMain {

	public static void main(String[] args) throws IOException {
		FileInputStream fio = new FileInputStream("C:/javatest10/images.jpg"); 
		FileOutputStream fos = new FileOutputStream("C:/javatest10/kdj.jpg"); 
		while(true) {
			int data = fio.read();
			if(data == -1) break;
			fos.write(data);
		}
		
		System.out.println("복사완료했습니다.");
		fio.close();
		fos.close();
		System.out.println("The End");
	}
}
