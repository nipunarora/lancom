
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.Token;

public class Main {
  public static void main(String [] args){
    try{
      if(args.length > 0){
	ANTLRFileStream fs = new ANTLRFileStream(args[0]);
	htmlLexer lex = new htmlLexer(fs);
	TokenRewriteStream tokens = new TokenRewriteStream(lex);
	htmlParser grammar = new htmlParser(tokens);
	TreeAdaptor adaptor = new htmlTreeAdaptor();
	grammar.setTreeAdaptor(adaptor);
	htmlParser.html_doc_return ret = grammar.html_doc();
	CommonTree tree = (CommonTree)ret.getTree();
	printTree(tree,2);
      }else{
	System.out.println("Usage: java -classpath \"...\" Main file.html");
      }
    }catch (Exception e){
      e.printStackTrace();
    }
  }
  public static void printTree(CommonTree t, int indent) {
    if ( t != null ) {
      StringBuffer sb = new StringBuffer(indent);
      for ( int i = 0; i < indent; i++ )
	sb = sb.append("   ");
      for ( int i = 0; i < t.getChildCount(); i++ ) {
	System.out.println(sb.toString() + t.getChild(i).toString());
	printTree((CommonTree)t.getChild(i), indent+1);
      }
    }
  }
}
