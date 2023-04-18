package DesignPattern24.cbf4life.builder;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* Ҫʲô˳��ĳ�����˵���Ҹ��������
*/
public abstract class CarBuilder {
	// ����һ��ģ�ͣ���Ҫ����һ��˳��Ҫ��������װ˳��
	public abstract void setSequence(ArrayList<String> sequence);

	// �������˳��󣬾Ϳ���ֱ���õ��������ģ��
	public abstract CarModel getCarModel();
}