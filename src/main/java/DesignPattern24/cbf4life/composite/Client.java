package DesignPattern24.cbf4life.composite;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* Client����������װ�������������һ��
*/
@SuppressWarnings("all")
public class Client {
	public static void main(String[] args) {
		// ���Ȳ�����һ�����ڵ�
		IRoot ceo = new Root("��������", "�ܾ���", 100000);
		// �����������ž���Ҳ������֦�ڵ�
		IBranch developDep = new Branch("����ȳ��", "�з����ž���", 10000);
		IBranch salesDep = new Branch("�������", "���۲��ž���", 20000);
		IBranch financeDep = new Branch("��������", "���񲿾���", 30000);
		// �ٰ�����С�鳤��������
		IBranch firstDevGroup = new Branch("����ؿб", "����һ���鳤", 5000);

		IBranch secondDevGroup = new Branch("�����", "���������鳤", 6000);
		// ʣ�µļ�ʱ������ЩС����,����·�˼ף�·����
		ILeaf a = new Leaf("a", "������Ա", 2000);
		ILeaf b = new Leaf("b", "������Ա", 2000);
		ILeaf c = new Leaf("c", "������Ա", 2000);
		ILeaf d = new Leaf("d", "������Ա", 2000);
		ILeaf e = new Leaf("e", "������Ա", 2000);
		ILeaf f = new Leaf("f", "������Ա", 2000);
		ILeaf g = new Leaf("g", "������Ա", 2000);
		ILeaf h = new Leaf("h", "������Ա", 5000);
		ILeaf i = new Leaf("i", "������Ա", 4000);
		ILeaf j = new Leaf("j", "������Ա", 5000);
		ILeaf k = new Leaf("k", "CEO����", 8000);
		ILeaf zhengLaoLiu = new Leaf("֣����", "�з�������", 20000);
		// �ò������˶����������ˣ�Ȼ��������ô��װ�����
		// �����Ƕ����ܾ��������������ž���
		ceo.add(developDep);
		ceo.add(salesDep);
		ceo.add(financeDep);
		// �ܾ����»���һ������
		ceo.add(k);
		// �����з������µĽṹ
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		// �з��������»���һ������
		developDep.add(zhengLaoLiu);
		// ����������������С������ʲô
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		secondDevGroup.add(d);
		secondDevGroup.add(e);
		secondDevGroup.add(f);
		// �ٿ����۲��µ���Ա���
		salesDep.add(h);
		salesDep.add(i);
		// ���һ������
		financeDep.add(j);

		// ��״�ṹд��ϣ�Ȼ�����Ǵ�ӡ����
		System.out.println(ceo.getInfo());
		// ��ӡ������������
		getAllSubordinateInfo(ceo.getSubordinateInfo());
	}

	// �������е���֦�ڵ㣬��ӡ����Ϣ
	private static void getAllSubordinateInfo(ArrayList subordinateList) {
		int length = subordinateList.size();
		for (int m = 0; m < length; m++) { // ����һ��ArrayList���ȣ���Ҫ��forѭ����ÿ�μ���
			Object s = subordinateList.get(m);
			if (s instanceof Leaf) { // �Ǹ�Ҷ�ӽڵ㣬Ҳ����Ա��
				ILeaf employee = (ILeaf) s;
				System.out.println(((Leaf) s).getInfo());
			} else {
				IBranch branch = (IBranch) s;
				System.out.println(branch.getInfo());
				// �ٵݹ����
				getAllSubordinateInfo(branch.getSubordinateInfo());
			}
		}
	}
}