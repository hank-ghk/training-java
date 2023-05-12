package DesignPattern24.cbf4life.builder;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
页
* 这里是牛叉公司的天下，他要啥我们给啥
*/
public class Client2 {
	public static void main(String[] args) {
		Director director = new Director();
		// 1W辆A类型的奔驰车
		for (int i = 0; i < 10; i++) {
			director.getABenzModel().run();
		}
		// 100W辆B类型的奔驰车
		for (int i = 0; i < 10; i++) {
			director.getBBenzModel().run();
		}
		// 1000W量C类型的宝马车
		for (int i = 0; i < 10; i++) {
			director.getCBMWModel().run();
		}
	}
}