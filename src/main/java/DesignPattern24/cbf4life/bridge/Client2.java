package DesignPattern24.cbf4life.bridge;


import com.cbf4life.bridge.abstraction.HouseCorp;
import com.cbf4life.bridge.implementor.House;
import com.cbf4life.bridge.implementor.IPod;
import com.cbf4life.bridge.implementor.ShanZhaiCorp;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��Ҫ�������Լ��Ĺ�˾��
*/
public class Client2 {
	public static void main(String[] args) {
		House house = new House();
		System.out.println("-------���ز���˾������������е�-------");
		// ���ҵ��ҵĹ�˾
		HouseCorp houseCorp = new HouseCorp(house);
		// ������ô��Ǯ
		houseCorp.makeMoney();
		System.out.println("\n");
		// ɽկ��˾�����Ĳ�Ʒ�ܶ࣬������ֻҪָ����Ʒ�ͳ���
		System.out.println("-------ɽկ��˾���������е�-------");
		//ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();
	}
}