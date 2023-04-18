package DesignPattern24.cbf4life.factoryMethod2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���ȶ���Ů洣������Ƕ����ѽ
*/
public class NvWa {
	public static void main(String[] args) {
		// Ů洵�һ�����ˣ��������ʣ�����㣬����㣬ȱ�ݲ�Ʒ
		System.out.println("------------����ĵ�һ�����������ģ�����-----------------");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();
		// Ů洵ڶ������ˣ�������㣬Ȼ���ֳ��˸���Ʒ������
		System.out.println("\n\n------------����ĵڶ������������ģ�����-----------------");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();
		// ���������ˣ���λ�����յ����ã���ɫ���֣���д���ˣ�����������壩����ע��RB�˲����ڴ���
		System.out.println("\n\n------------����ĵ��������������ģ���ɫ����-----------------");

		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		yellowHuman.talk();
		
		//Ů洷����ˣ�����ɶ���־���ɶ���֣��հ�
		for(int i=0;i<10;i++){
		System.out.println("\n\n------------�������������-----------------" +		i);
		Human human = HumanFactory.createHuman();
		human.cry();
		human.laugh();
		human.talk();
		}
	}
}