package DesignPattern24.cbf4life.composite.perfect;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��װ������νṹ����չʾ����
�������ģʽ
�� 166 ҳ
*/
@SuppressWarnings("all")
public class Client {
	public static void main(String[] args) {
		// ��������װһ����֯�ṹ����
		Branch ceo = compositeCorpTree();
		// ���Ȱ�CEO����Ϣ��ӡ������
		System.out.println(ceo.getInfo());
		// Ȼ��������Ա����Ϣ
		System.out.println(getTreeInfo(ceo));
	}

	// ����������װ����
	public static Branch compositeCorpTree() {
		// ���Ȳ����ܾ���CEO
		Branch root = new Branch("��������", "�ܾ���", 100000);
		// ���������ž����������
		Branch developDep = new Branch("����ȳ��", "�з����ž���", 10000);
		Branch salesDep = new Branch("�������", "���۲��ž���", 20000);
		Branch financeDep = new Branch("��������", "���񲿾���", 30000);
		// �ٰ�����С�鳤��������
		Branch firstDevGroup = new Branch("����ؿб", "����һ���鳤", 5000);
		Branch secondDevGroup = new Branch("�����", "���������鳤", 6000);
		// �����е�С������������
		Leaf a = new Leaf("a", "������Ա", 2000);
		Leaf b = new Leaf("b", "������Ա", 2000);
		Leaf c = new Leaf("c", "������Ա", 2000);
		Leaf d = new Leaf("d", "������Ա", 2000);
		Leaf e = new Leaf("e", "������Ա", 2000);
		Leaf f = new Leaf("f", "������Ա", 2000);
		Leaf g = new Leaf("g", "������Ա", 2000);
		Leaf h = new Leaf("h", "������Ա", 5000);
		Leaf i = new Leaf("i", "������Ա", 4000);
		Leaf j = new Leaf("j", "������Ա", 5000);
		Leaf k = new Leaf("k", "CEO����", 8000);
		Leaf zhengLaoLiu = new Leaf("֣����", "�з���������", 20000);
		// ��ʼ��װ
		// CEO�����������ž����һ������

		root.addSubordinate(k);
		root.addSubordinate(developDep);
		root.addSubordinate(salesDep);
		root.addSubordinate(financeDep);
		// �з�������
		developDep.addSubordinate(zhengLaoLiu);
		developDep.addSubordinate(firstDevGroup);
		developDep.addSubordinate(secondDevGroup);
		// ����������������С������ʲô
		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);
		secondDevGroup.addSubordinate(d);
		secondDevGroup.addSubordinate(e);
		secondDevGroup.addSubordinate(f);
		// �ٿ����۲��µ���Ա���
		salesDep.addSubordinate(h);
		salesDep.addSubordinate(i);
		// ���һ������
		financeDep.addSubordinate(j);
		return root;
	}

	// ����������,ֻҪ���Ҹ��ڵ㣬�Ҿ��ܱ��������еĽڵ�
	public static String getTreeInfo(Branch root) {
		ArrayList<Corp> subordinateList = root.getSubordinate();
		String info = "";
		for (Corp s : subordinateList) {
			if (s instanceof Leaf) { // ��Ա����ֱ�ӻ����Ϣ
				info = info + s.getInfo() + "\n";
			} else { // �Ǹ�СͷĿ
				info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
			}
		}
		return info;

	}
}
