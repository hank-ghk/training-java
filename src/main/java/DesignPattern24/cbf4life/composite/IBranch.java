package DesignPattern24.cbf4life.composite;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��֦�ڵ㣬Ҳ���Ǹ������ž�����鳤�Ľ�ɫ
*/
public interface IBranch {
	// �����Ϣ
	public String getInfo();

	// �������ݽڵ㣬�����з����µ��з�һ��
	public void add(IBranch branch);

	// ����Ҷ�ӽڵ�
	public void add(ILeaf leaf);

	// ����¼���Ϣ
	public ArrayList getSubordinateInfo();
}
