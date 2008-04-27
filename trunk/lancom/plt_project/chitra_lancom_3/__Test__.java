import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        BlockLexer lex = new BlockLexer(new ANTLRFileStream("D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        BlockParser g = new BlockParser(tokens, 22093);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}