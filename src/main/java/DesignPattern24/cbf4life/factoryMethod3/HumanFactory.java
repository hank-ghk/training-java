package DesignPattern24.cbf4life.factoryMethod3;
import java.util.HashMap;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
*/
@SuppressWarnings("all")
public class HumanFactory {
	// 定义一个MAP,初始化过的Human对象都放在这里

	private static HashMap<String, Human> humans = new HashMap<String, Human>();

	// 定一个烤箱，泥巴塞进去，人就出来，这个太先进了
	public static Human createHuman(Class c) {
		Human human = null; // 定义一个类型的人类
		try {
			// 如果MAP中有，则直接从取出，不用初始化了
			if (humans.containsKey(c.getSimpleName())) {
				human = humans.get(c.getSimpleName());
			} else {
				human = (Human) Class.forName(c.getName()).newInstance();
				// 放到MAP中
				humans.put(c.getSimpleName(), human);
			}
		} catch (InstantiationException e) {// 你要是不说个人种颜色的话，没法烤，要白的黑，你说话了才好烤
			System.out.println("必须指定人种的颜色");
		} catch (IllegalAccessException e) { // 一定定义的人种有问题，那就烤不出来了，这是...
			System.out.println("人种定义错误！");
		} catch (ClassNotFoundException e) { // 你随便说个人种，我到哪里给你制造去？！
			System.out.println("混蛋，你指定的人种找不到！");
		}
		return human;
	}
}