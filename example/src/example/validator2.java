package example;
import java.io.*;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

/**
 * Class Name : XSDCheck Description :
 * @author 젊은광대
 * @since 2012.11.29
 * @version 1.0
 */

public class validator2 {

	public static void main(String[] args) {
		// 1. W3C XML Schema language 객체를 생성하기 위한 API 검증용 Entry-point 입니다.
		SchemaFactory factory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");

		String xsd = "D:\\xmlFolder\\student.xsd"; // xsd 파일위치
		String xml = "D:\\xmlFolder\\student.xml"; // 유효성을 검사할 xml 파일위치

		File schemaLocation;
		Schema schema;
		Validator validator;
		try {
			// 2. 정의된 xsd 파일을 불러옵니다.
			schemaLocation = new File(xsd);
			schema = factory.newSchema(schemaLocation);
			// 3. 가져온 스키마로 유효성 검사 도구를 만듭니다.
			validator = schema.newValidator();

			// 4. xml 파일을 불러옵니다.
			Source source = new StreamSource(xml);

			// 5. 해당 xml 을 유효성을 검사합니다.
			validator.validate(source);

			System.out.println(xml + " is valid."); // 유효성 검사 성공

		} catch (IOException e) {
			System.out.println(xml + " is not found "); // 파일을 찾을 수 없습니다.
			System.out.println(e.getMessage()); // 실패한 원인에 대하여 설명합니다.
		} catch (SAXException e) {
			System.out.println(xml + " is not valid because "); // 유효성 검사 실패
			System.out.println(e.getMessage()); // 실패한 원인에 대하여 설명합니다.
		}
	}
}