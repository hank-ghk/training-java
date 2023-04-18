package DesignPattern24.cbf4life.abstactFactory;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��ζ�һ���ӿڣ�Ӧ��Ҫ�첻ͬ�Ա���ˣ���Ҫ��ͬ��������
* ���������¯��������������˺�Ů��
*/
public interface HumanFactory {
	// �����ɫ����
	public Human createYellowHuman();

	// ����һ����ɫ����
	public Human createWhiteHuman();

	// ����һ����ɫ����
	public Human createBlackHuman();
}
