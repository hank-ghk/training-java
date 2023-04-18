package DesignPattern24.cbf4life.state.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���ݵ�ʵ����
*/
public class Lift implements ILift {
	// �����Źر�
	public void close() {
		System.out.println("�����Źر�...");
	}

	// �����ſ���
	public void open() {
		System.out.println("�����ſ���...");
	}

	// ���ݿ�ʼ������
	public void run() {
		System.out.println("��������������...");
	}

	// ����ֹͣ
	public void stop() {
		System.out.println("����ֹͣ��...");
	}
}
