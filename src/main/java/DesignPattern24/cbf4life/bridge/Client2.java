package DesignPattern24.cbf4life.bridge;


import DesignPattern24.cbf4life.bridge.abstraction.HouseCorp;
import DesignPattern24.cbf4life.bridge.implementor.House;
import DesignPattern24.cbf4life.bridge.implementor.IPod;
import DesignPattern24.cbf4life.bridge.implementor.ShanZhaiCorp;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* 我要关心我自己的公司了
*/
public class Client2 {
	public static void main(String[] args) {
		House house = new House();
		System.out.println("-------房地产公司是这个样子运行的-------");
		// 先找到我的公司
		HouseCorp houseCorp = new HouseCorp(house);
		// 看我怎么挣钱
		houseCorp.makeMoney();
		System.out.println("\n");
		// 山寨公司生产的产品很多，不过我只要指定产品就成了
		System.out.println("-------山寨公司是这样运行的-------");
		//ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();
	}
}