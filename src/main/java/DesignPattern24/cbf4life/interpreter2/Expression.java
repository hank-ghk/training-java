package DesignPattern24.cbf4life.interpreter2;

//import sun.org.mozilla.javascript.internal.Context;
import org.mozilla.javascript.Context;

public abstract class Expression {
	// 每个表达式必须有一个解析任务
	public abstract Object interpreter(Context ctx);
}
