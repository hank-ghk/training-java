package DesignPattern24.cbf4life.observer.advance2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���б��۲����ߣ�ͨ�ýӿ�
*/
public interface Observable {
	// ����һ���۲���

	public void addObserver(Observer observer);

	// ɾ��һ���۲��ߣ������Ҳ������㿴��
	public void deleteObserver(Observer observer);

	// ��ȻҪ�۲죬�ҷ����ı�����ҲӦ��������������֪ͨ�۲���
	public void notifyObservers(String context);
}
