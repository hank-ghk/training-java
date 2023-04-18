package DesignPattern24.cbf4life.state.advance;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ģ����ݵĶ���
*/
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
