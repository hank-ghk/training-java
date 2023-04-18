package DesignPattern24.cbf4life.factoryMethod3;
import java.util.HashMap;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
*/
@SuppressWarnings("all")
public class HumanFactory {
	// ����һ��MAP,��ʼ������Human���󶼷�������

	private static HashMap<String, Human> humans = new HashMap<String, Human>();

	// ��һ�����䣬�������ȥ���˾ͳ��������̫�Ƚ���
	public static Human createHuman(Class c) {
		Human human = null; // ����һ�����͵�����
		try {
			// ���MAP���У���ֱ�Ӵ�ȡ�������ó�ʼ����
			if (humans.containsKey(c.getSimpleName())) {
				human = humans.get(c.getSimpleName());
			} else {
				human = (Human) Class.forName(c.getName()).newInstance();
				// �ŵ�MAP��
				humans.put(c.getSimpleName(), human);
			}
		} catch (InstantiationException e) {// ��Ҫ�ǲ�˵��������ɫ�Ļ���û������Ҫ�׵ĺڣ���˵���˲źÿ�
			System.out.println("����ָ�����ֵ���ɫ");
		} catch (IllegalAccessException e) { // һ����������������⣬�ǾͿ��������ˣ�����...
			System.out.println("���ֶ������");
		} catch (ClassNotFoundException e) { // �����˵�����֣��ҵ������������ȥ����
			System.out.println("�쵰����ָ���������Ҳ�����");
		}
		return human;
	}
}