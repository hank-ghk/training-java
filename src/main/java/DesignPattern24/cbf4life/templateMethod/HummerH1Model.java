package DesignPattern24.cbf4life.templateMethod;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* 悍马车是每个越野者的最爱，其中H1最接近军用系列
*/
public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true; //是否要响喇叭
	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H1引擎声音是这样在...");
	}

	@Override
	public void start() {
		System.out.println("悍马H1发动...");

	}

	@Override
	public void stop() {
		System.out.println("悍马H1停车...");
	}
	
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	// 要不要响喇叭，是有客户的来决定的
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
}