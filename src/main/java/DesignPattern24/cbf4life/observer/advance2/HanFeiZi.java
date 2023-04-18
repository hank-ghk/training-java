package DesignPattern24.cbf4life.observer.advance2;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �����ӣ���˹��ʦ�ܣ���������Ҫ����
*/
public class HanFeiZi implements Observable {
	// ������䳤���飬������еĹ۲���
	private ArrayList<Observer> observerList = new ArrayList<Observer>();

	// ���ӹ۲���
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	// ɾ���۲���
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	// ֪ͨ���еĹ۲���
	public void notifyObservers(String context) {
		for (Observer observer : observerList) {
			observer.update(context);
		}
	}

	// ������Ҫ�Է���
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		// ֪ͨ���еĹ۲���
		this.notifyObservers("�������ڳԷ�");
	}

	// �����ӿ�ʼ������,�Ŵ���ûɶ���֣������뵽�ľ���ô��
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.notifyObservers("������������");
	}
}
