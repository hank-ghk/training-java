package DesignPattern24.cbf4life.builder;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���տͻ���ʼʹ�����ģ��
*/
public class Client {
	public static void main(String[] args) {
		/*
		 * �ͻ�����ţ�湫˾����Ҫ����һ��ģ�ͣ�Ȼ��ţ�湫˾�͸������ϴ� ˵Ҫ����һ��ģ�ͣ�����һ��˳��Ȼ���Ҿ�������
		 */
		ArrayList<String> sequence = new ArrayList<String>(); // ���run��˳��
		sequence.add("engine boom"); // �ͻ�Ҫ��run��ʱ��ʱ���ȷ�������
		sequence.add("start"); // ��������
		sequence.add("stop"); // ����һ�ξ�ͣ����
		// Ȼ�����ǰ����˳������۳���
//		benz.setSequence(sequence);
//		benz.run();
		//Ҫһ�����۳���
		BenzBuilder benzBuilder = new BenzBuilder();
		//��˳������builder�࣬���������һ��������
		benzBuilder.setSequence(sequence);
		//�����һ�����۳�
		BenzModel benz = (BenzModel)benzBuilder.getCarModel();
		//���۳���һ�¿���
		benz.run();
		
		//����ͬ����˳������Ҫһ������
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
		bmw.run();
		
	}
}