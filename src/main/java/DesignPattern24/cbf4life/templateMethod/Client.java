package DesignPattern24.cbf4life.templateMethod;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �ͻ���ʼʹ�����ģ��
*/
public class Client {
	public static void main(String[] args) {
		// �ͻ�����H1�ͺţ���ȥ������
		HummerModel h1 = new HummerH1Model();
		h1.run(); // �����������ˣ�
		// �ͻ���H2�ͺţ���ȥ��ˣ��
		HummerModel h2 = new HummerH2Model();
		h2.run();
		
		//�ͻ�����H1�ͺţ���ȥ������
		HummerH1Model h11 = new HummerH1Model();
		h11.setAlarm(true);
		h11.run(); //�����������ˣ�
		
	}
}
