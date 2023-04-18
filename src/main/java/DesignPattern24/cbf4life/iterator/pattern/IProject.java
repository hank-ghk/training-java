package DesignPattern24.cbf4life.iterator.pattern;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ���ӿڣ����е���Ŀ����һ���ӿ�
*/
public interface IProject {
	// ������Ŀ
	public void add(String name, int num, int cost);

	// ���ϰ����￴���ľ�����Ŀ��Ϣ
	public String getProjectInfo();

	// ���һ�����Ա������Ķ���
	public IProjectIterator iterator();
}
