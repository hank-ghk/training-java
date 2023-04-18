package DesignPattern24.cbf4life.multiton;
import java.util.ArrayList;
import java.util.Random;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �й�����ʷ��һ�㶼��һ������һ���ʵۣ��������ʵ۵Ļ�����ȻҪPK��һ���ʵ۳�����
* ��������ˣ��������һ��ʱ�䣬�й������������ʵ���ô�죿����������ľ��֮���
* ��Ӣ�ڱ���²�������ۼ�λ�����������۵��ϻʵۺ��ַ��ˣ���Ȼ���ǰ����ϸ���Ӣ����Ϊ̫�ϻʣ�
* Ҳ��������һ�����µ�ʱ���ڣ��й���Ȼ�������ʵۣ�
*
*/

@SuppressWarnings("all")
public class Emperor {
	private static int maxNumOfEmperor = 2; // ���ֻ���������ʵ�
	private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor); // �ʵ۽�ʲô����
	private static ArrayList emperorList = new ArrayList(maxNumOfEmperor); // װ�ʵ۵��б�
	private static int countNumOfEmperor = 0; // ���ڱ�����Ƶ����Ǹ��ʵ�
	// �Ȱ�2���ʵ۲�������
	static {
		// �����еĻʵ۶���������
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("��" + (i + 1) + "��"));
		}
	}

	// ����ô��ʵ��ˣ����������ƾ�һ���ʵ�(new һ���ʵۣ�
	private Emperor() {
		// ���׺͵���Լ���㣬Ŀ�ľ��ǲ���������ڶ����ʵ�
	}

	private Emperor(String info) {
		emperorInfoList.add(info);
	}

	public static Emperor getInstance() {
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor); // �������һ���ʵۣ�ֻҪ�Ǹ���������ͳ�
		return (Emperor) emperorList.get(countNumOfEmperor);
	}

	public static Emperor getInstance(int param) {
		return (Emperor) emperorList.get(param);
	}

	// �ʵ۽�ʲô����ѽ
	public static void emperorInfo() {
		System.out.println(emperorInfoList.get(countNumOfEmperor));
	}
}