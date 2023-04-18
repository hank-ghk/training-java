package DesignPattern24.cbf4life.singleton1;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �й�����ʷ��һ�㶼��һ������һ���ʵۣ��������ʵ۵Ļ�����ȻҪPK��һ���ʵ۳���
*/
public class Emperor {
	private static Emperor emperor = null; // ����һ���ʵ۷������Ȼ�������ʵ�����

	private Emperor() {
		// ���׺͵���Լ���㣬Ŀ�ľ��ǲ���������ڶ����ʵ�
	}

	public static Emperor getInstance() {

		if (emperor == null) { // ����ʵۻ�û�ж��壬�ǾͶ�һ��
			emperor = new Emperor();
		}
		return emperor;
	}

	// �ʵ۽�ʲô����ѽ
	public static void emperorInfo() {
		System.out.println("�Ҿ��ǻʵ�ĳĳĳ....");
	}
}