package DesignPattern24.cbf4life.interpreter2;

//import sun.org.mozilla.javascript.internal.Context;
import org.mozilla.javascript.Context;
public class TerminalExpression extends Expression {
	// 通常终结符表达式只有一个，但是有多个对象
	public Object interpreter(Context ctx) {
		return null;
	}
}