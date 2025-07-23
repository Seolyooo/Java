package sub3;

import java.io.FileOutputStream;
import java.util.Properties;

/*
 * 2025/07/23
 * 설유진
 * 프로퍼티스 자료구조 실습
 *  
 */

public class PropertiesTest {

	public static void main(String[] args) {
		//프로퍼티 : 키-값이 모두 문자열이 자료구조
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");

		System.out.println(prop);
		
		//직렬화
		String path = "C:\\Users\\GGG\\Desktop\\fruit.properties";

		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			
			fos.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}

}
