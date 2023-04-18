package DesignPattern24.cbf4life.facade;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ��д�ŵĹ���
*/
public interface LetterProcess {

	// ����Ҫд�ŵ�����
	public void writeContext(String context);

	// ���д�ŷ�
	public void fillEnvelope(String address);

	// ���ŷŵ��ŷ���
	public void letterInotoEnvelope();

	// Ȼ���ʵ�
	public void sendLetter();
}