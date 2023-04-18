package DesignPattern24.cbf4life.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
	// ������������
	public static void main(String[] args) throws IOException {
		String expStr = getExpStr();
		// ��ֵ
		HashMap<String, Integer> var = getValue(expStr);
		Calculator cal = new Calculator(expStr);
		System.out.println("������Ϊ��" + expStr + "=" + cal.run(var));
	}

	// ��ñ��ʽ
	public static String getExpStr() throws IOException {
		System.out.print("��������ʽ��");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	// ���ֵӳ��
	public static HashMap<String, Integer> getValue(String exprStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// �����м�������Ҫ����
		for (char ch : exprStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				if (!map.containsKey(String.valueOf(ch))) { // ����ظ�����������
					System.out.print("������" + ch + "��ֵ:");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		return map;

	}
}