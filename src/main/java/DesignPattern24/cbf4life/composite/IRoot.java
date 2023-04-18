package DesignPattern24.cbf4life.composite;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ�����ڵ㣬��Ϊ�ܾ������
*/
public interface IRoot {
	// �õ��ܾ������Ϣ
	public String getInfo();

	// �ܾ����±�Ҫ��С������Ҫ������С���������з����ܾ������Ǹ���֦�ڵ�
	public void add(IBranch branch);

	// ��Ҫ��������Ҷ�ڵ�
	public void add(ILeaf leaf);

	// ��Ȼ�����ӣ���Ҫ��Ҫ�ܹ��������������ܾ���֪������������Щ��
	public ArrayList getSubordinateInfo();
}
