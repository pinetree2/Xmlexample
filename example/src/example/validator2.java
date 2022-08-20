package example;
import java.io.*;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

/**
 * Class Name : XSDCheck Description :
 * @author ��������
 * @since 2012.11.29
 * @version 1.0
 */

public class validator2 {

	public static void main(String[] args) {
		// 1. W3C XML Schema language ��ü�� �����ϱ� ���� API ������ Entry-point �Դϴ�.
		SchemaFactory factory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");

		String xsd = "D:\\xmlFolder\\student.xsd"; // xsd ������ġ
		String xml = "D:\\xmlFolder\\student.xml"; // ��ȿ���� �˻��� xml ������ġ

		File schemaLocation;
		Schema schema;
		Validator validator;
		try {
			// 2. ���ǵ� xsd ������ �ҷ��ɴϴ�.
			schemaLocation = new File(xsd);
			schema = factory.newSchema(schemaLocation);
			// 3. ������ ��Ű���� ��ȿ�� �˻� ������ ����ϴ�.
			validator = schema.newValidator();

			// 4. xml ������ �ҷ��ɴϴ�.
			Source source = new StreamSource(xml);

			// 5. �ش� xml �� ��ȿ���� �˻��մϴ�.
			validator.validate(source);

			System.out.println(xml + " is valid."); // ��ȿ�� �˻� ����

		} catch (IOException e) {
			System.out.println(xml + " is not found "); // ������ ã�� �� �����ϴ�.
			System.out.println(e.getMessage()); // ������ ���ο� ���Ͽ� �����մϴ�.
		} catch (SAXException e) {
			System.out.println(xml + " is not valid because "); // ��ȿ�� �˻� ����
			System.out.println(e.getMessage()); // ������ ���ο� ���Ͽ� �����մϴ�.
		}
	}
}