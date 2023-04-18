package DesignPattern24.cbf4life.composite.advance;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��Щ�±���С�������Ǿ���ȷ�������
*/
public interface IBranch {

	// �ܹ�����С��(��Ҷ�ڵ㣩�����Ǿ�����֦�ڵ㣩
	public void addSubordinate(ICorp corp);

	// �һ�Ҫ�ܹ������������Ϣ
	public ArrayList<ICorp> getSubordinate();
	/*
	 * ������Ӧ����һ������delSubordinate(ICorp corp)��ɾ������ �����������û���õ��Ͳ�д������
	 */
}
