package DesignPattern24.cbf4life.builder;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
ҳ
* ������ţ�湫˾�����£���Ҫɶ���Ǹ�ɶ
*/
public class Client2 {
	public static void main(String[] args) {
		Director director = new Director();
		// 1W��A���͵ı��۳�
		for (int i = 0; i < 10; i++) {
			director.getABenzModel().run();
		}
		// 100W��B���͵ı��۳�
		for (int i = 0; i < 10; i++) {
			director.getBBenzModel().run();
		}
		// 1000W��C���͵ı���
		for (int i = 0; i < 10; i++) {
			director.getCBMWModel().run();
		}
	}
}