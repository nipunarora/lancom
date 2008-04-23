import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.Token;

public final class HtmlTreeAdaptor extends CommonTreeAdaptor {
  public Object create(Token payload) {
    return new HtmlAST(payload);
  }
};
