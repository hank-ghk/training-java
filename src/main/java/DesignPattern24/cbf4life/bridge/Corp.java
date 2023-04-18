package DesignPattern24.cbf4life.bridge;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ����˾�ĳ�����
*/
public abstract class Corp {

	/*
	 * �ǹ�˾��Ӧ���������ѣ��¹���ʲô�����˾��������ҵ��˾ ��ÿ����˾�������Ķ�������һ����������ʵ���������
	 */
	protected abstract void produce();

	/*
	 * �в�Ʒ�ˣ��ǿ϶�Ҫ����ѽ���������㹫˾��ô����
	 */
	protected abstract void sell();

	// ��˾�Ǹ�ʲô�ģ�׬Ǯ��ѽ����׬Ǯɵ�ӲŸ�
	public void makeMoney() {
		// ÿ����˾����һ����������
		this.produce();
		// Ȼ������
		this.sell();
	}
}