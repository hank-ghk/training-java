package DesignPattern24.cbf4life.bridge;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��Ҫ�������Լ��Ĺ�˾��
*/
public class Client {
	public static void main(String[] args) {
		System.out.println("-------���ز���˾������������е�-------");
		// ���ҵ��ҵĹ�˾
		HouseCorp houseCorp = new HouseCorp();
		// ������ô��Ǯ
		houseCorp.makeMoney();
		System.out.println("\n");
		System.out.println("-------��װ��˾���������е�-------");
		ClothesCorp clothesCorp = new ClothesCorp();
		clothesCorp.makeMoney();
		System.out.println("-------ɽկ��˾���������е�-------");
		IPodCorp iPodCorp = new IPodCorp();
		iPodCorp.makeMoney();
	}
}
