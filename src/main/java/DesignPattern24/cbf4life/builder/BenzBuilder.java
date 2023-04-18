package DesignPattern24.cbf4life.builder;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ������ʩ�����ˣ����ǰ���һ����˳������һ�����۳�
*/
public class BenzBuilder extends CarBuilder {
	private BenzModel benz = new BenzModel();

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}
}
