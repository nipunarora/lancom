import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class htmlAST extends CommonTree {
  public String text; 
	
  public htmlAST(Token t) {
    super(t);
    text = (t != null? "NODE:" : "[]");
  }

  public String toString() {
    return text + super.toString();
  }
}
