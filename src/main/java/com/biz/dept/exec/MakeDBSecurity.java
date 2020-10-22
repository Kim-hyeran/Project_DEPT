package com.biz.dept.exec;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/*
 * jasypt ��Ű���� StandardPBEStringEncryptor Ŭ������ ����Ͽ�
 * DB ���ӿ� username�� password�� ��ȣȭ�Ͽ�
 * ���ڿ��� ����
 */
public class MakeDBSecurity {
	public static void main(String[] args) {
		
		String propsFile = "./src/main/webapp/WEB-INF/spring/db.connect.properties";
		
		StandardPBEStringEncryptor pbe = new StandardPBEStringEncryptor();
		Scanner scan = new Scanner(System.in);
		
		Map<String,String> envList = System.getenv();
		String saltPassword = envList.get("BIZ.NET");
		
		if(saltPassword == null) {
			System.out.println("BIZ.NET ȯ�溯�� �������� �����ϴ�. Ȯ���ϼ���");
			return;
		}
		System.out.printf("BIZ.NET ȯ�溯�� : %s\n", saltPassword);
		
		System.out.print("DB UserName >> ");
		String userName = scan.nextLine();
		
		System.out.print("DB Password >> ");
		String password = scan.nextLine();
		
		// ��ȣȭ�� ���ؼ� PBE.. ��ü �� ����
		pbe.setAlgorithm("PBEWithMD5AndDES");
		
		// salt : ��ȣȭ�� �� �� ����� key���ڿ�
		/* salt���� �Ϲ� ���ڿ��� ����ϸ�
		 * �ҽ��ڵ忡 ���ڿ��� ����Ǿ� ���� ������ ��ȣȭ�ϴ� �뵵��
		 * ����ϴ� �� ���ڰ� �߻��� �� �ִ�.
		 * 
		 * ���ڿ��� �ٷ� ������� �ʰ�
		 * �ý���(��ǻ�Ϳü��)�� ȯ�溯���� �����صΰ�
		 * ȯ�溯���� ������ salt ��й�ȣ�� ����Ѵ�.
		 * 
		 * BIZ.COM �̶�� ���ڿ��� ����Ǿ
		 * ��Ʈ��ũ�� ���ؼ� salt��ȣ�� �����ϱⰡ �ſ� ���������.
		 * 
		 * ���� ��ȣȭ�ϴ� ȿ���� ���� �谡��ų �� �ִ�.
		 * 
		 */
		pbe.setPassword(saltPassword);
		
		String encUserName = pbe.encrypt(userName);
		String encPassword = pbe.encrypt(password);
		
		String saveUserName = String.format("oracle.username=ENC(%s)", encUserName);
		String savePassword = String.format("oracle.password=ENC(%s)", encPassword);
		
		try {
			PrintWriter out = new PrintWriter(propsFile);
			out.println(saveUserName);
			out.println(savePassword);
			
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan.close();
		System.out.println("DB ���� �Ӽ� ���� �����Ϸ� :)");
	}
}

