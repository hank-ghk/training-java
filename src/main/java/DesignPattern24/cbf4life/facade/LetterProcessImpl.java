package DesignPattern24.cbf4life.facade;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* д�ŵľ���ʵ����
*/
public class LetterProcessImpl implements LetterProcess {
	// д��
	public void writeContext(String context) {
		System.out.println("��д�ŵ�����...." + context);
	}

	// ���ŷ�����д��Ҫ����Ϣ
	public void fillEnvelope(String address) {
		System.out.println("��д�ռ��˵�ַ������...." + address);
	}

	// ���ŷŵ��ŷ��У������
	public void letterInotoEnvelope() {
		System.out.println("���ŷŵ��ŷ���....");
	}

	// ���������У��ʵ�
	public void sendLetter() {
		System.out.println("�ʵ��ż�...");
	}

}