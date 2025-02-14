package ch15_inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * class Name 	: FileBasic
 * Author 	  	: 202-15
 * Created Date : 2025. 2. 13.
 * Version 		: 1.0
 * Purpose 		: java 기초
 * Description  : 파일 입출력 (문자 단위)
 */
public class FileBasic {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		// 현재 경로
		System.out.println(path);
		FileReader reder = null;
		FileWriter writer =null;
		
		// 파일을 문자 단위로 읽기 위한
		try {
		reder = new FileReader(path + "/delay.txt");
		writer = new FileWriter(path + "/delay_backup.txt");
		char [] data = new char[16];
		while(true) {
			int x = reder.read(data);
			if(x == -1) {
				System.out.println("파일 끝에 도달");
				break;
			}
			writer.write(data, 0 , x); // data 배열의 0번째 인덱스부터 x만큼 파일에 쓰겠다.
		}
		writer.flush(); // 남아 있는 게 없도록 비움
		System.out.println("파일 쓰기 완료");
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
		if(writer != null) writer.close(); // 꼭 쓰고 닫아줘야함.
		if(reder != null) reder.close();
		}catch (IOException e) {
			e.printStackTrace();		
			}
		}
	}
}