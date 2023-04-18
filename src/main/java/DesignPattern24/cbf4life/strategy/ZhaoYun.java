package DesignPattern24.cbf4life.strategy;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
*/
public class ZhaoYun {
/**
* ���Ƴ����ˣ�����������������Ľ��������β����
*/
	public static void main(String[] args) {
		Context context;
		// �ոյ������ʱ����һ��
		System.out.println("-----------�ոյ������ʱ����һ��-------------");
		context = new Context(new BackDoor()); // �õ����
		context.operate(); // ��ִ��
		System.out.println("\n\n\n\n\n\n\n\n");
		// �����ֲ�˼���ˣ���ڶ�����
		System.out.println("-----------�����ֲ�˼���ˣ���ڶ�����-------------");
		context = new Context(new GivenGreenLight());
		context.operate(); // ִ���˵ڶ���������
		System.out.println("\n\n\n\n\n\n\n\n");
		// ��Ȩ��С��׷�ˣ�զ�죿�������
		System.out.println("-----------��Ȩ��С��׷�ˣ�զ�죿�������-------------");
		context = new Context(new BlockEnemy());
		context.operate(); // ������˱�
		System.out.println("\n\n\n\n\n\n\n\n");
		/*
		 * �������ˣ�����ʵ�ʲ�֪�����Ǹ�����ѽ����ֻ֪�����һ�����ң�����֪����BackDoor�����ƣ�զ�죿
		 * �ƺ��������ģʽ�Ѿ��Ѽ�ı����д������
		 * 
		 * ��BackDoor��GivenGreenLight��BlockEnemyֻ��һ�����룬��д��first��second��
		 * third��û�˻�˵���!
		 * 
		 * ����ģʽ�ĺô����ǣ������˸��ھ۵���ϵ�����ѽ��ȱ�������Ǹ����һ�ȥ�ٲ��
		 */

	}
}