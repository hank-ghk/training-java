package DesignPattern24.cbf4life.factoryMethod;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��ɫ���֣��ǵ���ѧѧӢ���ʦ˵black man�������˵���˼��������û������˵��
*/
public class BlackHuman implements Human {
	public void cry() {
		System.out.println("���˻��");

	}

	public void laugh() {
		System.out.println("���˻�Ц");
	}

	public void talk() {
		System.out.println("���˿���˵����һ����������");
	}
}