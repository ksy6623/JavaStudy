package ch15_inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * class Name 	: FileInOut
 * Author 	  	: 202-15
 * Created Date : 2025. 2. 13.
 * Version 		: 1.0
 * Purpose 		: java 기초
 * Description  : 파일 바이트 In Out
 */
public class FileInOut {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		String fileNm = "delay.txt";
		// System.lineSeparator() <-- or \\
		System.out.println(path + System.lineSeparator()+fileNm);
		File textFile = new File(path + "\\"+fileNm );
		try {
			//true는 파일이 있으면 append, false는 다시 씀
			FileOutputStream fos = new FileOutputStream(textFile,false);
			fos.write("팽수 늦음\n".getBytes());
			fos.write("동길 늦음\n".getBytes()); // input, outputStream은 1byte 처리함
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일 읽기
		try {
			FileInputStream fis = new FileInputStream(textFile);
			byte[] date = new byte[fis.available()]; // 파일을 바이트 단위로 가져오기
			while(true) {
				int x = fis.read(date);
				if(x == -1) { // 파일을 끈까지 읽었다는 뜻 -1
					break;
				}
				String result = new String(date); // byte배열을 String으로 변환
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
