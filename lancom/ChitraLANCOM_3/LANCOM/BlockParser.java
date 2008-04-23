// $ANTLR 3.0.1 C:\\Antlr\\LANCOM\\Block.g 2008-04-15 22:04:40

	//import javalancom.Scope;
	//import javalancom.Symbol;
	import java.util.HashMap;
	import java.util.Set;
	import java.util.Iterator;
	import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BlockParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "NUMBER", "NM", "STRING", "ID", "COMMA", "CHAR", "ICMP_MESSAGE_TYPE", "DOT", "LETTER", "DIGIT", "EscapeSequence", "LINE_COMMENT", "EQUAL", "WHITESPACE", "'prog'", "'endprog'", "';'", "'if'", "'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'echo'", "'?'", "':'", "'||'", "'&&'", "'|'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'~'", "'*='", "'/='", "'+='", "'-='", "'topology_type_t'", "'host_type_t'", "'host_group_type_t'", "'serv_group_type_t'", "'role_type_t'", "'policy_type_t'", "'ipaddr_t'", "'int_type_t'", "'char_type_t'", "'inbound'", "'outbound'", "'allow'", "'deny'", "'udp'", "'tcp'", "'ifname'", "'card_id'", "'netmask'", "'host_group'", "'{'", "'}'", "'DNS'", "'GATEWAY'", "'service_set'"
    };
    public static final int LINE_COMMENT=19;
    public static final int LETTER=16;
    public static final int NUMBER=8;
    public static final int CHAR=13;
    public static final int WHITESPACE=21;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int ID=11;
    public static final int EOF=-1;
    public static final int COMMA=12;
    public static final int EQUAL=20;
    public static final int PLUS=4;
    public static final int DIGIT=17;
    public static final int DIV=7;
    public static final int NM=9;
    public static final int DOT=15;
    public static final int EscapeSequence=18;
    public static final int ICMP_MESSAGE_TYPE=14;
    public static final int STRING=10;

        public BlockParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Antlr\\LANCOM\\Block.g"; }

    
    	Scope globalScope = new Scope(null);
    	Scope currentScope = globalScope;
    	Map<String, Assignment> map = new HashMap<String, Assignment>(); 
    
        	public static void main(String[] args) throws Exception 
        	{
            	BlockLexer lex = new BlockLexer(new ANTLRFileStream(args[0]));
    	       	CommonTokenStream tokens = new CommonTokenStream(lex);
    
            	BlockParser parser = new BlockParser(tokens);
    
    	        try 
    	        {
    	            parser.role();
            	} 
            	catch (RecognitionException e)  
            	{
    	            e.printStackTrace();
            	}
        	}



    // $ANTLR start prog
    // C:\\Antlr\\LANCOM\\Block.g:46:1: prog : 'prog' ( statement_list )+ 'endprog' ;
    public final void prog() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:47:2: ( 'prog' ( statement_list )+ 'endprog' )
            // C:\\Antlr\\LANCOM\\Block.g:47:4: 'prog' ( statement_list )+ 'endprog'
            {
            match(input,22,FOLLOW_22_in_prog83); 
            // C:\\Antlr\\LANCOM\\Block.g:47:11: ( statement_list )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER||(LA1_0>=STRING && LA1_0<=ID)||LA1_0==CHAR||(LA1_0>=24 && LA1_0<=26)||LA1_0==30||LA1_0==32||LA1_0==45||(LA1_0>=50 && LA1_0<=60)||LA1_0==65||LA1_0==68||LA1_0==73) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:47:11: statement_list
            	    {
            	    pushFollow(FOLLOW_statement_list_in_prog85);
            	    statement_list();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match(input,23,FOLLOW_23_in_prog88); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end prog


    // $ANTLR start statement_list
    // C:\\Antlr\\LANCOM\\Block.g:50:2: statement_list : ( statement | declr_stmt );
    public final void statement_list() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:51:3: ( statement | declr_stmt )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NUMBER||(LA2_0>=STRING && LA2_0<=ID)||LA2_0==CHAR||(LA2_0>=24 && LA2_0<=26)||LA2_0==30||LA2_0==32||LA2_0==45||(LA2_0>=59 && LA2_0<=60)||LA2_0==65||LA2_0==68||LA2_0==73) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=50 && LA2_0<=58)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("50:2: statement_list : ( statement | declr_stmt );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:51:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_statement_list104);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:52:6: declr_stmt
                    {
                    pushFollow(FOLLOW_declr_stmt_in_statement_list111);
                    declr_stmt();
                    _fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end statement_list


    // $ANTLR start statement
    // C:\\Antlr\\LANCOM\\Block.g:55:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final void statement() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:56:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case NUMBER:
            case STRING:
            case ID:
            case CHAR:
            case 24:
            case 26:
            case 45:
            case 59:
            case 60:
            case 65:
            case 68:
            case 73:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("55:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:56:5: condition_statement
                    {
                    pushFollow(FOLLOW_condition_statement_in_statement126);
                    condition_statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:57:5: iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement132);
                    iteration_statement();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Antlr\\LANCOM\\Block.g:58:5: statement_expr
                    {
                    pushFollow(FOLLOW_statement_expr_in_statement138);
                    statement_expr();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Antlr\\LANCOM\\Block.g:59:5: print_statement
                    {
                    pushFollow(FOLLOW_print_statement_in_statement144);
                    print_statement();
                    _fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end statement


    // $ANTLR start statement_expr
    // C:\\Antlr\\LANCOM\\Block.g:62:2: statement_expr : ( ';' | expression ';' );
    public final void statement_expr() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:63:3: ( ';' | expression ';' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==NUMBER||(LA4_0>=STRING && LA4_0<=ID)||LA4_0==CHAR||LA4_0==26||LA4_0==45||(LA4_0>=59 && LA4_0<=60)||LA4_0==65||LA4_0==68||LA4_0==73) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("62:2: statement_expr : ( ';' | expression ';' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:63:5: ';'
                    {
                    match(input,24,FOLLOW_24_in_statement_expr160); 

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:64:5: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement_expr166);
                    expression();
                    _fsp--;

                    match(input,24,FOLLOW_24_in_statement_expr168); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end statement_expr


    // $ANTLR start condition_statement
    // C:\\Antlr\\LANCOM\\Block.g:67:2: condition_statement : 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' ;
    public final void condition_statement() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:68:3: ( 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' )
            // C:\\Antlr\\LANCOM\\Block.g:68:5: 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif'
            {
            match(input,25,FOLLOW_25_in_condition_statement184); 
            match(input,26,FOLLOW_26_in_condition_statement186); 
            pushFollow(FOLLOW_equality_expr_in_condition_statement188);
            equality_expr();
            _fsp--;

            match(input,27,FOLLOW_27_in_condition_statement190); 
            pushFollow(FOLLOW_statement_list_in_condition_statement192);
            statement_list();
            _fsp--;

            // C:\\Antlr\\LANCOM\\Block.g:68:47: ( 'else' statement_list )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:68:48: 'else' statement_list
                    {
                    match(input,28,FOLLOW_28_in_condition_statement195); 
                    pushFollow(FOLLOW_statement_list_in_condition_statement197);
                    statement_list();
                    _fsp--;


                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_condition_statement201); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end condition_statement


    // $ANTLR start iteration_statement
    // C:\\Antlr\\LANCOM\\Block.g:71:2: iteration_statement : 'while' '(' equality_expr ')' statement_list 'endwhile' ;
    public final void iteration_statement() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:72:3: ( 'while' '(' equality_expr ')' statement_list 'endwhile' )
            // C:\\Antlr\\LANCOM\\Block.g:72:5: 'while' '(' equality_expr ')' statement_list 'endwhile'
            {
            match(input,30,FOLLOW_30_in_iteration_statement217); 
            match(input,26,FOLLOW_26_in_iteration_statement219); 
            pushFollow(FOLLOW_equality_expr_in_iteration_statement221);
            equality_expr();
            _fsp--;

            match(input,27,FOLLOW_27_in_iteration_statement223); 
            pushFollow(FOLLOW_statement_list_in_iteration_statement225);
            statement_list();
            _fsp--;

            match(input,31,FOLLOW_31_in_iteration_statement227); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end iteration_statement


    // $ANTLR start print_statement
    // C:\\Antlr\\LANCOM\\Block.g:75:2: print_statement : 'echo' STRING ';' ;
    public final void print_statement() throws RecognitionException {
        Token STRING1=null;

        try {
            // C:\\Antlr\\LANCOM\\Block.g:76:3: ( 'echo' STRING ';' )
            // C:\\Antlr\\LANCOM\\Block.g:76:5: 'echo' STRING ';'
            {
            match(input,32,FOLLOW_32_in_print_statement243); 
            STRING1=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement245); 
            System.out.println(STRING1);
            match(input,24,FOLLOW_24_in_print_statement249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end print_statement


    // $ANTLR start expression
    // C:\\Antlr\\LANCOM\\Block.g:79:2: expression : assignment_expr ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:80:3: ( assignment_expr )
            // C:\\Antlr\\LANCOM\\Block.g:80:5: assignment_expr
            {
            pushFollow(FOLLOW_assignment_expr_in_expression265);
            assignment_expr();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end expression


    // $ANTLR start assignment_expr
    // C:\\Antlr\\LANCOM\\Block.g:83:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );
    public final void assignment_expr() throws RecognitionException {
        object_name_return var = null;

        assignment_operator_return op = null;

        conditional_expr_return e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:84:4: (var= object_name op= assignment_operator assignment_expr | e= conditional_expr )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=PLUS && LA6_1<=DIV)||LA6_1==DOT||LA6_1==24||LA6_1==27||(LA6_1>=33 && LA6_1<=44)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EQUAL||(LA6_1>=46 && LA6_1<=49)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("83:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==NUMBER||LA6_0==STRING||LA6_0==CHAR||LA6_0==26||LA6_0==45||(LA6_0>=59 && LA6_0<=60)||LA6_0==65||LA6_0==68||LA6_0==73) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("83:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:84:7: var= object_name op= assignment_operator assignment_expr
                    {
                    pushFollow(FOLLOW_object_name_in_assignment_expr286);
                    var=object_name();
                    _fsp--;

                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr290);
                    op=assignment_operator();
                    _fsp--;

                    
                    	 		Symbol s = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			Assignment ans = new Assignment(s, input.toString(op.start,op.stop));
                    			map.put(input.toString(var.start,var.stop), ans);
                    			System.out.println("here");
                    	 	
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr301);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:93:6: e= conditional_expr
                    {
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr314);
                    e=conditional_expr();
                    _fsp--;

                    
                     			//Put these values in assignment map
                     			System.out.println("Cond expr: " + e.sym);
                     			
                     			Set entries = map.entrySet();
                    			Iterator iter = entries.iterator();
                    			System.out.println("Symbol Val: " + e.sym.getValue());
                    			while(iter.hasNext() && e.sym != null)
                    			{
                    				Map.Entry entry = (Map.Entry)iter.next();
                    				String key = (String)entry.getKey();
                    				Symbol s = new Symbol(key, e.sym.getType(), e.sym.lookupValue());
                    				System.out.println(s.getValue());
                    				currentScope.setSymbolValue(key, s);
                    				System.out.println("Symbol table: " + s.getType() + " " + s.getValue());
                    			}
                    			currentScope.printSymbols();
                    	/*
                    			Set entries = map.entrySet();
                    			Iterator iter = entries.iterator();
                    			System.out.println(e.sym);
                    			Symbol s  = e.sym;
                    			System.out.println("value of e: " + (e.sym).name);
                    			IntType temp = (IntType)s.lookupValue();
                    			System.out.println(temp.getValue());
                    			System.out.println("value of e: " + input.toString(e.start,e.stop));
                    			while(iter.hasNext())
                    			{
                    				Map.Entry entry = (Map.Entry)iter.next();
                    				String key = (String)entry.getKey();
                    				Assignment a = map.get(key);
                    				a.assignValue(temp.getValue());
                    				map.put(key, a);
                    			}
                    		*/			
                     		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end assignment_expr

    public static class conditional_expr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start conditional_expr
    // C:\\Antlr\\LANCOM\\Block.g:135:2: conditional_expr returns [Symbol sym] : e= logicalOR_expr ( '?' expression ':' conditional_expr )? ;
    public final conditional_expr_return conditional_expr() throws RecognitionException {
        conditional_expr_return retval = new conditional_expr_return();
        retval.start = input.LT(1);

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:136:3: (e= logicalOR_expr ( '?' expression ':' conditional_expr )? )
            // C:\\Antlr\\LANCOM\\Block.g:136:5: e= logicalOR_expr ( '?' expression ':' conditional_expr )?
            {
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr348);
            e=logicalOR_expr();
            _fsp--;

             retval.sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:137:3: ( '?' expression ':' conditional_expr )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:137:5: '?' expression ':' conditional_expr
                    {
                    match(input,33,FOLLOW_33_in_conditional_expr356); 
                    pushFollow(FOLLOW_expression_in_conditional_expr358);
                    expression();
                    _fsp--;

                    match(input,34,FOLLOW_34_in_conditional_expr360); 
                    pushFollow(FOLLOW_conditional_expr_in_conditional_expr362);
                    conditional_expr();
                    _fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end conditional_expr


    // $ANTLR start logicalOR_expr
    // C:\\Antlr\\LANCOM\\Block.g:140:2: logicalOR_expr returns [Symbol sym] : e= logicalAND_expr ( '||' logicalAND_expr )* ;
    public final Symbol logicalOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:141:3: (e= logicalAND_expr ( '||' logicalAND_expr )* )
            // C:\\Antlr\\LANCOM\\Block.g:141:5: e= logicalAND_expr ( '||' logicalAND_expr )*
            {
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr386);
            e=logicalAND_expr();
            _fsp--;

             sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:142:3: ( '||' logicalAND_expr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:142:4: '||' logicalAND_expr
            	    {
            	    match(input,35,FOLLOW_35_in_logicalOR_expr394); 
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr396);
            	    logicalAND_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end logicalOR_expr


    // $ANTLR start logicalAND_expr
    // C:\\Antlr\\LANCOM\\Block.g:145:2: logicalAND_expr returns [Symbol sym] : e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* ;
    public final Symbol logicalAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:146:3: (e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* )
            // C:\\Antlr\\LANCOM\\Block.g:146:5: e= bitwiseOR_expr ( '&&' bitwiseOR_expr )*
            {
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr419);
            e=bitwiseOR_expr();
            _fsp--;

             sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:147:3: ( '&&' bitwiseOR_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:147:4: '&&' bitwiseOR_expr
            	    {
            	    match(input,36,FOLLOW_36_in_logicalAND_expr427); 
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr429);
            	    bitwiseOR_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end logicalAND_expr


    // $ANTLR start bitwiseOR_expr
    // C:\\Antlr\\LANCOM\\Block.g:150:2: bitwiseOR_expr returns [Symbol sym] : e= bitwiseAND_expr ( '|' bitwiseAND_expr )* ;
    public final Symbol bitwiseOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:151:3: (e= bitwiseAND_expr ( '|' bitwiseAND_expr )* )
            // C:\\Antlr\\LANCOM\\Block.g:151:5: e= bitwiseAND_expr ( '|' bitwiseAND_expr )*
            {
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr453);
            e=bitwiseAND_expr();
            _fsp--;

             sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:152:3: ( '|' bitwiseAND_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:152:4: '|' bitwiseAND_expr
            	    {
            	    match(input,37,FOLLOW_37_in_bitwiseOR_expr461); 
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr463);
            	    bitwiseAND_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end bitwiseOR_expr


    // $ANTLR start bitwiseAND_expr
    // C:\\Antlr\\LANCOM\\Block.g:155:2: bitwiseAND_expr returns [Symbol sym] : e= equality_expr ( '&' equality_expr )* ;
    public final Symbol bitwiseAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:156:3: (e= equality_expr ( '&' equality_expr )* )
            // C:\\Antlr\\LANCOM\\Block.g:156:5: e= equality_expr ( '&' equality_expr )*
            {
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr486);
            e=equality_expr();
            _fsp--;

             sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:157:3: ( '&' equality_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:157:4: '&' equality_expr
            	    {
            	    match(input,38,FOLLOW_38_in_bitwiseAND_expr494); 
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr496);
            	    equality_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end bitwiseAND_expr


    // $ANTLR start equality_expr
    // C:\\Antlr\\LANCOM\\Block.g:160:2: equality_expr returns [Symbol sym] : e= relational_expr ( ( '==' | '!=' ) relational_expr )* ;
    public final Symbol equality_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:161:3: (e= relational_expr ( ( '==' | '!=' ) relational_expr )* )
            // C:\\Antlr\\LANCOM\\Block.g:161:5: e= relational_expr ( ( '==' | '!=' ) relational_expr )*
            {
            pushFollow(FOLLOW_relational_expr_in_equality_expr521);
            e=relational_expr();
            _fsp--;

             sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:162:3: ( ( '==' | '!=' ) relational_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=39 && LA12_0<=40)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:162:5: ( '==' | '!=' ) relational_expr
            	    {
            	    if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr530);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expr_in_equality_expr538);
            	    relational_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end equality_expr


    // $ANTLR start relational_expr
    // C:\\Antlr\\LANCOM\\Block.g:165:2: relational_expr returns [Symbol sym] : e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* ;
    public final Symbol relational_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:166:3: (e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* )
            // C:\\Antlr\\LANCOM\\Block.g:166:5: e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )*
            {
            pushFollow(FOLLOW_expr_in_relational_expr562);
            e=expr();
            _fsp--;

             sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:167:3: ( ( '<' | '>' | '<=' | '>=' ) expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=41 && LA13_0<=44)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:167:5: ( '<' | '>' | '<=' | '>=' ) expr
            	    {
            	    if ( (input.LA(1)>=41 && input.LA(1)<=44) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr573);    throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_in_relational_expr583);
            	    expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end relational_expr


    // $ANTLR start expr
    // C:\\Antlr\\LANCOM\\Block.g:171:2: expr returns [Symbol sym] : e= term ( ( PLUS | MINUS ) term )* ;
    public final Symbol expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:172:3: (e= term ( ( PLUS | MINUS ) term )* )
            // C:\\Antlr\\LANCOM\\Block.g:172:5: e= term ( ( PLUS | MINUS ) term )*
            {
            pushFollow(FOLLOW_term_in_expr609);
            e=term();
            _fsp--;

            sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:173:3: ( ( PLUS | MINUS ) term )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=PLUS && LA14_0<=MINUS)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:173:5: ( PLUS | MINUS ) term
            	    {
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr620);    throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr631);
            	    term();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end expr


    // $ANTLR start term
    // C:\\Antlr\\LANCOM\\Block.g:176:2: term returns [Symbol sym] : e= unary_expr ( ( MULT | DIV ) unary_expr )* ;
    public final Symbol term() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:177:3: (e= unary_expr ( ( MULT | DIV ) unary_expr )* )
            // C:\\Antlr\\LANCOM\\Block.g:177:5: e= unary_expr ( ( MULT | DIV ) unary_expr )*
            {
            pushFollow(FOLLOW_unary_expr_in_term657);
            e=unary_expr();
            _fsp--;

            sym = e;
            // C:\\Antlr\\LANCOM\\Block.g:178:3: ( ( MULT | DIV ) unary_expr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=MULT && LA15_0<=DIV)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:178:5: ( MULT | DIV ) unary_expr
            	    {
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term668);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unary_expr_in_term678);
            	    unary_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end term


    // $ANTLR start unary_expr
    // C:\\Antlr\\LANCOM\\Block.g:181:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );
    public final Symbol unary_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:182:3: (e= postfix_expression | '~' unary_expr )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NUMBER||(LA16_0>=STRING && LA16_0<=ID)||LA16_0==CHAR||LA16_0==26||(LA16_0>=59 && LA16_0<=60)||LA16_0==65||LA16_0==68||LA16_0==73) ) {
                alt16=1;
            }
            else if ( (LA16_0==45) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("181:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:182:5: e= postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr704);
                    e=postfix_expression();
                    _fsp--;

                    sym = e;

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:183:5: '~' unary_expr
                    {
                    match(input,45,FOLLOW_45_in_unary_expr712); 
                    pushFollow(FOLLOW_unary_expr_in_unary_expr714);
                    unary_expr();
                    _fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end unary_expr


    // $ANTLR start postfix_expression
    // C:\\Antlr\\LANCOM\\Block.g:188:2: postfix_expression returns [Symbol sym] : e= factor ( '.' ID )* ;
    public final Symbol postfix_expression() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:189:3: (e= factor ( '.' ID )* )
            // C:\\Antlr\\LANCOM\\Block.g:189:5: e= factor ( '.' ID )*
            {
            pushFollow(FOLLOW_factor_in_postfix_expression741);
            e=factor();
            _fsp--;

            // C:\\Antlr\\LANCOM\\Block.g:189:14: ( '.' ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==DOT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:189:15: '.' ID
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression744); 
            	    match(input,ID,FOLLOW_ID_in_postfix_expression745); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end postfix_expression

    public static class assignment_operator_return extends ParserRuleReturnScope {
    };

    // $ANTLR start assignment_operator
    // C:\\Antlr\\LANCOM\\Block.g:192:2: assignment_operator : ( '=' | '*=' | '/=' | '+=' | '-=' );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Antlr\\LANCOM\\Block.g:193:3: ( '=' | '*=' | '/=' | '+=' | '-=' )
            // C:\\Antlr\\LANCOM\\Block.g:
            {
            if ( input.LA(1)==EQUAL||(input.LA(1)>=46 && input.LA(1)<=49) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment_operator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignment_operator


    // $ANTLR start factor
    // C:\\Antlr\\LANCOM\\Block.g:200:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );
    public final Symbol factor() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:202:2: ( ID | e= literal | '(' expression ')' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt18=1;
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 59:
            case 60:
            case 65:
            case 68:
            case 73:
                {
                alt18=2;
                }
                break;
            case 26:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("200:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:202:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor808); 

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:203:5: e= literal
                    {
                    pushFollow(FOLLOW_literal_in_factor816);
                    e=literal();
                    _fsp--;

                    sym = e;

                    }
                    break;
                case 3 :
                    // C:\\Antlr\\LANCOM\\Block.g:204:5: '(' expression ')'
                    {
                    match(input,26,FOLLOW_26_in_factor825); 
                    pushFollow(FOLLOW_expression_in_factor827);
                    expression();
                    _fsp--;

                    match(input,27,FOLLOW_27_in_factor829); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end factor


    // $ANTLR start literal
    // C:\\Antlr\\LANCOM\\Block.g:207:2: literal returns [Symbol sym] : e= object_values ;
    public final Symbol literal() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:208:3: (e= object_values )
            // C:\\Antlr\\LANCOM\\Block.g:208:5: e= object_values
            {
            pushFollow(FOLLOW_object_values_in_literal851);
            e=object_values();
            _fsp--;

            sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end literal


    // $ANTLR start declr_stmt
    // C:\\Antlr\\LANCOM\\Block.g:211:1: declr_stmt : type_name var= object_name ( COMMA next_var= object_name )* ';' ;
    public final void declr_stmt() throws RecognitionException {
        object_name_return var = null;

        object_name_return next_var = null;

        type_name_return type_name2 = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:212:2: ( type_name var= object_name ( COMMA next_var= object_name )* ';' )
            // C:\\Antlr\\LANCOM\\Block.g:213:2: type_name var= object_name ( COMMA next_var= object_name )* ';'
            {
            pushFollow(FOLLOW_type_name_in_declr_stmt866);
            type_name2=type_name();
            _fsp--;

            pushFollow(FOLLOW_object_name_in_declr_stmt870);
            var=object_name();
            _fsp--;

            
            		currentScope.defineSymbol(input.toString(var.start,var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            // C:\\Antlr\\LANCOM\\Block.g:217:2: ( COMMA next_var= object_name )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:217:3: COMMA next_var= object_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_declr_stmt877); 
            	    pushFollow(FOLLOW_object_name_in_declr_stmt881);
            	    next_var=object_name();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            
            		currentScope.defineSymbol(input.toString(next_var.start,next_var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            match(input,24,FOLLOW_24_in_declr_stmt890); 
            
            		currentScope.printSymbols();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end declr_stmt


    // $ANTLR start object_values
    // C:\\Antlr\\LANCOM\\Block.g:229:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | host | role | host_group | topology | serv_group );
    public final Symbol object_values() throws RecognitionException {
        Symbol sym = null;

        Symbol int_value3 = null;


        try {
            // C:\\Antlr\\LANCOM\\Block.g:230:2: ( char_value | int_value | STRING | ip_addr | host | role | host_group | topology | serv_group )
            int alt20=9;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:230:4: char_value
                    {
                    pushFollow(FOLLOW_char_value_in_object_values923);
                    char_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:231:4: int_value
                    {
                    pushFollow(FOLLOW_int_value_in_object_values928);
                    int_value3=int_value();
                    _fsp--;

                     
                    		sym = int_value3;
                    	

                    }
                    break;
                case 3 :
                    // C:\\Antlr\\LANCOM\\Block.g:235:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_object_values937); 

                    }
                    break;
                case 4 :
                    // C:\\Antlr\\LANCOM\\Block.g:236:4: ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_object_values942);
                    ip_addr();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Antlr\\LANCOM\\Block.g:238:4: host
                    {
                    pushFollow(FOLLOW_host_in_object_values948);
                    host();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Antlr\\LANCOM\\Block.g:239:4: role
                    {
                    pushFollow(FOLLOW_role_in_object_values953);
                    role();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Antlr\\LANCOM\\Block.g:240:4: host_group
                    {
                    pushFollow(FOLLOW_host_group_in_object_values958);
                    host_group();
                    _fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Antlr\\LANCOM\\Block.g:241:4: topology
                    {
                    pushFollow(FOLLOW_topology_in_object_values963);
                    topology();
                    _fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Antlr\\LANCOM\\Block.g:242:4: serv_group
                    {
                    pushFollow(FOLLOW_serv_group_in_object_values968);
                    serv_group();
                    _fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end object_values

    public static class type_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start type_name
    // C:\\Antlr\\LANCOM\\Block.g:246:1: type_name : ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        try {
            // C:\\Antlr\\LANCOM\\Block.g:247:2: ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:
            {
            if ( (input.LA(1)>=50 && input.LA(1)<=58) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_type_name0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end type_name


    // $ANTLR start role
    // C:\\Antlr\\LANCOM\\Block.g:258:1: role : policy ( COMMA policy )* ;
    public final void role() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:258:7: ( policy ( COMMA policy )* )
            // C:\\Antlr\\LANCOM\\Block.g:258:9: policy ( COMMA policy )*
            {
            pushFollow(FOLLOW_policy_in_role1032);
            policy();
            _fsp--;

            // C:\\Antlr\\LANCOM\\Block.g:258:16: ( COMMA policy )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:258:17: COMMA policy
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_role1035); 
            	    pushFollow(FOLLOW_policy_in_role1037);
            	    policy();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end role


    // $ANTLR start policy
    // C:\\Antlr\\LANCOM\\Block.g:261:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );
    public final void policy() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:261:9: ( direction verdict proto port port | direction verdict proto icmp_cntrl_message )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=59 && LA22_0<=60)) ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=61 && LA22_1<=62)) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2>=63 && LA22_2<=64)) ) {
                        int LA22_3 = input.LA(4);

                        if ( (LA22_3==NUMBER) ) {
                            alt22=1;
                        }
                        else if ( (LA22_3==ICMP_MESSAGE_TYPE) ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("261:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 22, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("261:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("261:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("261:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:261:11: direction verdict proto port port
                    {
                    pushFollow(FOLLOW_direction_in_policy1050);
                    direction();
                    _fsp--;

                    pushFollow(FOLLOW_verdict_in_policy1052);
                    verdict();
                    _fsp--;

                    pushFollow(FOLLOW_proto_in_policy1054);
                    proto();
                    _fsp--;

                    pushFollow(FOLLOW_port_in_policy1056);
                    port();
                    _fsp--;

                    pushFollow(FOLLOW_port_in_policy1058);
                    port();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:262:5: direction verdict proto icmp_cntrl_message
                    {
                    pushFollow(FOLLOW_direction_in_policy1065);
                    direction();
                    _fsp--;

                    pushFollow(FOLLOW_verdict_in_policy1067);
                    verdict();
                    _fsp--;

                    pushFollow(FOLLOW_proto_in_policy1069);
                    proto();
                    _fsp--;

                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy1071);
                    icmp_cntrl_message();
                    _fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end policy


    // $ANTLR start topology
    // C:\\Antlr\\LANCOM\\Block.g:265:1: topology : ( ( host_group )+ role | ( serv_group )+ role );
    public final void topology() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:265:9: ( ( host_group )+ role | ( serv_group )+ role )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==68) ) {
                alt25=1;
            }
            else if ( (LA25_0==73) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("265:1: topology : ( ( host_group )+ role | ( serv_group )+ role );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:265:11: ( host_group )+ role
                    {
                    // C:\\Antlr\\LANCOM\\Block.g:265:11: ( host_group )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==68) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Antlr\\LANCOM\\Block.g:265:12: host_group
                    	    {
                    	    pushFollow(FOLLOW_host_group_in_topology1081);
                    	    host_group();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    pushFollow(FOLLOW_role_in_topology1085);
                    role();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:266:4: ( serv_group )+ role
                    {
                    // C:\\Antlr\\LANCOM\\Block.g:266:4: ( serv_group )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==73) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\Antlr\\LANCOM\\Block.g:266:5: serv_group
                    	    {
                    	    pushFollow(FOLLOW_serv_group_in_topology1091);
                    	    serv_group();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    pushFollow(FOLLOW_role_in_topology1095);
                    role();
                    _fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end topology


    // $ANTLR start int_value
    // C:\\Antlr\\LANCOM\\Block.g:270:1: int_value returns [Symbol sym] : e= NUMBER ;
    public final Symbol int_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try {
            // C:\\Antlr\\LANCOM\\Block.g:271:2: (e= NUMBER )
            // C:\\Antlr\\LANCOM\\Block.g:271:4: e= NUMBER
            {
            e=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_int_value1115); 
            
            			Integer v = Integer.parseInt(e.getText());
            			IntType temp = new IntType(v);
            			Symbol s = new Symbol("literal", "int_type_t", temp);
            			sym = s;
            			return sym;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sym;
    }
    // $ANTLR end int_value


    // $ANTLR start char_value
    // C:\\Antlr\\LANCOM\\Block.g:282:1: char_value : CHAR ;
    public final void char_value() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:283:2: ( CHAR )
            // C:\\Antlr\\LANCOM\\Block.g:283:4: CHAR
            {
            match(input,CHAR,FOLLOW_CHAR_in_char_value1132); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end char_value


    // $ANTLR start direction
    // C:\\Antlr\\LANCOM\\Block.g:287:1: direction : ( 'inbound' | 'outbound' );
    public final void direction() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:288:2: ( 'inbound' | 'outbound' )
            // C:\\Antlr\\LANCOM\\Block.g:
            {
            if ( (input.LA(1)>=59 && input.LA(1)<=60) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_direction0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end direction


    // $ANTLR start verdict
    // C:\\Antlr\\LANCOM\\Block.g:292:1: verdict : ( 'allow' | 'deny' );
    public final void verdict() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:292:9: ( 'allow' | 'deny' )
            // C:\\Antlr\\LANCOM\\Block.g:
            {
            if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_verdict0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end verdict


    // $ANTLR start proto
    // C:\\Antlr\\LANCOM\\Block.g:296:1: proto : ( 'udp' | 'tcp' );
    public final void proto() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:296:9: ( 'udp' | 'tcp' )
            // C:\\Antlr\\LANCOM\\Block.g:
            {
            if ( (input.LA(1)>=63 && input.LA(1)<=64) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_proto0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end proto


    // $ANTLR start icmp_cntrl_message
    // C:\\Antlr\\LANCOM\\Block.g:299:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final void icmp_cntrl_message() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:300:2: ( ICMP_MESSAGE_TYPE )
            // C:\\Antlr\\LANCOM\\Block.g:300:4: ICMP_MESSAGE_TYPE
            {
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1202); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end icmp_cntrl_message


    // $ANTLR start port
    // C:\\Antlr\\LANCOM\\Block.g:303:1: port : NUMBER ;
    public final void port() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:303:6: ( NUMBER )
            // C:\\Antlr\\LANCOM\\Block.g:303:8: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_port1212); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end port

    public static class object_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start object_name
    // C:\\Antlr\\LANCOM\\Block.g:306:1: object_name : ID ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        try {
            // C:\\Antlr\\LANCOM\\Block.g:307:2: ( ID )
            // C:\\Antlr\\LANCOM\\Block.g:307:4: ID
            {
            match(input,ID,FOLLOW_ID_in_object_name1222); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end object_name


    // $ANTLR start interface_name
    // C:\\Antlr\\LANCOM\\Block.g:313:1: interface_name : 'ifname' ( ID ) 'card_id' NUMBER ( '/' NUMBER )? ;
    public final void interface_name() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:314:1: ( 'ifname' ( ID ) 'card_id' NUMBER ( '/' NUMBER )? )
            // C:\\Antlr\\LANCOM\\Block.g:314:5: 'ifname' ( ID ) 'card_id' NUMBER ( '/' NUMBER )?
            {
            match(input,65,FOLLOW_65_in_interface_name1237); 
            // C:\\Antlr\\LANCOM\\Block.g:314:14: ( ID )
            // C:\\Antlr\\LANCOM\\Block.g:314:15: ID
            {
            match(input,ID,FOLLOW_ID_in_interface_name1240); 

            }

            match(input,66,FOLLOW_66_in_interface_name1243); 
            match(input,NUMBER,FOLLOW_NUMBER_in_interface_name1246); 
            // C:\\Antlr\\LANCOM\\Block.g:314:37: ( '/' NUMBER )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DIV) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:314:38: '/' NUMBER
                    {
                    match(input,DIV,FOLLOW_DIV_in_interface_name1249); 
                    match(input,NUMBER,FOLLOW_NUMBER_in_interface_name1251); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end interface_name


    // $ANTLR start ip_addr
    // C:\\Antlr\\LANCOM\\Block.g:318:1: ip_addr : ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) ;
    public final void ip_addr() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:318:9: ( ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) )
            // C:\\Antlr\\LANCOM\\Block.g:318:10: ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER )
            {
            // C:\\Antlr\\LANCOM\\Block.g:318:10: ( NUMBER )
            // C:\\Antlr\\LANCOM\\Block.g:318:11: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1264); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr1266); 
            // C:\\Antlr\\LANCOM\\Block.g:318:21: ( NUMBER )
            // C:\\Antlr\\LANCOM\\Block.g:318:22: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1268); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr1270); 
            // C:\\Antlr\\LANCOM\\Block.g:318:32: ( NUMBER )
            // C:\\Antlr\\LANCOM\\Block.g:318:33: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1272); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr1274); 
            // C:\\Antlr\\LANCOM\\Block.g:318:43: ( NUMBER )
            // C:\\Antlr\\LANCOM\\Block.g:318:44: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1276); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ip_addr


    // $ANTLR start nmask
    // C:\\Antlr\\LANCOM\\Block.g:321:1: nmask : 'netmask' ip_addr ;
    public final void nmask() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:321:7: ( 'netmask' ip_addr )
            // C:\\Antlr\\LANCOM\\Block.g:321:9: 'netmask' ip_addr
            {
            match(input,67,FOLLOW_67_in_nmask1288); 
            pushFollow(FOLLOW_ip_addr_in_nmask1290);
            ip_addr();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end nmask


    // $ANTLR start host
    // C:\\Antlr\\LANCOM\\Block.g:323:1: host : interface_name ip_addr 'netmask' ip_addr ;
    public final void host() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:323:6: ( interface_name ip_addr 'netmask' ip_addr )
            // C:\\Antlr\\LANCOM\\Block.g:323:8: interface_name ip_addr 'netmask' ip_addr
            {
            pushFollow(FOLLOW_interface_name_in_host1298);
            interface_name();
            _fsp--;

            pushFollow(FOLLOW_ip_addr_in_host1300);
            ip_addr();
            _fsp--;

            match(input,67,FOLLOW_67_in_host1302); 
            pushFollow(FOLLOW_ip_addr_in_host1304);
            ip_addr();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end host


    // $ANTLR start host_set
    // C:\\Antlr\\LANCOM\\Block.g:327:1: host_set : host ( ',' host )* ;
    public final void host_set() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:328:2: ( host ( ',' host )* )
            // C:\\Antlr\\LANCOM\\Block.g:328:3: host ( ',' host )*
            {
            pushFollow(FOLLOW_host_in_host_set1316);
            host();
            _fsp--;

            // C:\\Antlr\\LANCOM\\Block.g:328:8: ( ',' host )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMMA) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:328:9: ',' host
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_host_set1319); 
            	    pushFollow(FOLLOW_host_in_host_set1321);
            	    host();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end host_set


    // $ANTLR start dns_set
    // C:\\Antlr\\LANCOM\\Block.g:331:1: dns_set : ip_addr ( ',' ip_addr )* ;
    public final void dns_set() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:331:9: ( ip_addr ( ',' ip_addr )* )
            // C:\\Antlr\\LANCOM\\Block.g:331:11: ip_addr ( ',' ip_addr )*
            {
            pushFollow(FOLLOW_ip_addr_in_dns_set1333);
            ip_addr();
            _fsp--;

            // C:\\Antlr\\LANCOM\\Block.g:331:19: ( ',' ip_addr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:331:20: ',' ip_addr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_dns_set1336); 
            	    pushFollow(FOLLOW_ip_addr_in_dns_set1339);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dns_set


    // $ANTLR start gateway
    // C:\\Antlr\\LANCOM\\Block.g:333:1: gateway : ip_addr ( ',' ip_addr )* ;
    public final void gateway() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:333:9: ( ip_addr ( ',' ip_addr )* )
            // C:\\Antlr\\LANCOM\\Block.g:333:11: ip_addr ( ',' ip_addr )*
            {
            pushFollow(FOLLOW_ip_addr_in_gateway1349);
            ip_addr();
            _fsp--;

            // C:\\Antlr\\LANCOM\\Block.g:333:19: ( ',' ip_addr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:333:20: ',' ip_addr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_gateway1352); 
            	    pushFollow(FOLLOW_ip_addr_in_gateway1354);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end gateway


    // $ANTLR start host_group
    // C:\\Antlr\\LANCOM\\Block.g:335:1: host_group : 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )? ;
    public final void host_group() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:336:2: ( 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )? )
            // C:\\Antlr\\LANCOM\\Block.g:336:4: 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )?
            {
            match(input,68,FOLLOW_68_in_host_group1365); 
            match(input,69,FOLLOW_69_in_host_group1368); 
            pushFollow(FOLLOW_host_set_in_host_group1370);
            host_set();
            _fsp--;

            match(input,70,FOLLOW_70_in_host_group1372); 
            // C:\\Antlr\\LANCOM\\Block.g:336:36: ( 'DNS' '{' dns_set '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==71) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:336:38: 'DNS' '{' dns_set '}'
                    {
                    match(input,71,FOLLOW_71_in_host_group1377); 
                    match(input,69,FOLLOW_69_in_host_group1380); 
                    pushFollow(FOLLOW_dns_set_in_host_group1382);
                    dns_set();
                    _fsp--;

                    match(input,70,FOLLOW_70_in_host_group1384); 

                    }
                    break;

            }

            // C:\\Antlr\\LANCOM\\Block.g:336:65: ( 'GATEWAY' '{' gateway '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==72) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:336:67: 'GATEWAY' '{' gateway '}'
                    {
                    match(input,72,FOLLOW_72_in_host_group1392); 
                    match(input,69,FOLLOW_69_in_host_group1394); 
                    pushFollow(FOLLOW_gateway_in_host_group1396);
                    gateway();
                    _fsp--;

                    match(input,70,FOLLOW_70_in_host_group1398); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end host_group


    // $ANTLR start serv_descr
    // C:\\Antlr\\LANCOM\\Block.g:339:1: serv_descr : ip_addr ( nmask )? serv_listen_port ;
    public final void serv_descr() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:340:2: ( ip_addr ( nmask )? serv_listen_port )
            // C:\\Antlr\\LANCOM\\Block.g:340:4: ip_addr ( nmask )? serv_listen_port
            {
            pushFollow(FOLLOW_ip_addr_in_serv_descr1418);
            ip_addr();
            _fsp--;

            // C:\\Antlr\\LANCOM\\Block.g:340:12: ( nmask )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==67) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:340:13: nmask
                    {
                    pushFollow(FOLLOW_nmask_in_serv_descr1421);
                    nmask();
                    _fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_serv_listen_port_in_serv_descr1425);
            serv_listen_port();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end serv_descr


    // $ANTLR start serv_group
    // C:\\Antlr\\LANCOM\\Block.g:342:1: serv_group : 'service_set' '{' serv_descr ( ',' serv_descr )* '}' ;
    public final void serv_group() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:343:2: ( 'service_set' '{' serv_descr ( ',' serv_descr )* '}' )
            // C:\\Antlr\\LANCOM\\Block.g:343:4: 'service_set' '{' serv_descr ( ',' serv_descr )* '}'
            {
            match(input,73,FOLLOW_73_in_serv_group1434); 
            match(input,69,FOLLOW_69_in_serv_group1436); 
            pushFollow(FOLLOW_serv_descr_in_serv_group1438);
            serv_descr();
            _fsp--;

            // C:\\Antlr\\LANCOM\\Block.g:343:33: ( ',' serv_descr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:343:34: ',' serv_descr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_serv_group1441); 
            	    pushFollow(FOLLOW_serv_descr_in_serv_group1443);
            	    serv_descr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match(input,70,FOLLOW_70_in_serv_group1447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end serv_group


    // $ANTLR start serv_listen_port
    // C:\\Antlr\\LANCOM\\Block.g:347:1: serv_listen_port : ( NUMBER ) ;
    public final void serv_listen_port() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:348:2: ( ( NUMBER ) )
            // C:\\Antlr\\LANCOM\\Block.g:348:4: ( NUMBER )
            {
            // C:\\Antlr\\LANCOM\\Block.g:348:4: ( NUMBER )
            // C:\\Antlr\\LANCOM\\Block.g:348:5: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port1463); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end serv_listen_port


    // $ANTLR start host_name
    // C:\\Antlr\\LANCOM\\Block.g:350:1: host_name : ID ;
    public final void host_name() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:351:2: ( ID )
            // C:\\Antlr\\LANCOM\\Block.g:351:4: ID
            {
            match(input,ID,FOLLOW_ID_in_host_name1473); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end host_name


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\u0082\uffff";
    static final String DFA20_eofS =
        "\u0082\uffff";
    static final String DFA20_minS =
        "\1\10\1\uffff\1\4\3\uffff\2\105\1\10\1\uffff\1\101\1\10\1\uffff"+
        "\1\13\1\17\1\102\2\10\1\17\1\7\2\10\2\17\3\10\1\17\3\10\1\14\2\17"+
        "\1\10\1\4\2\10\1\17\2\uffff\1\103\1\17\3\10\3\17\3\10\2\17\4\10"+
        "\1\17\1\10\1\14\1\10\1\17\1\14\1\10\1\101\1\4\1\17\1\13\2\105\1"+
        "\uffff\1\10\1\102\2\10\1\17\1\10\2\17\1\10\1\7\4\10\3\17\4\10\3"+
        "\17\3\10\1\17\2\14\2\10\1\4\1\10\1\4\1\103\2\17\3\10\3\17\3\10\3"+
        "\17\3\10\1\17\2\14\1\10\1\14";
    static final String DFA20_maxS =
        "\1\111\1\uffff\1\54\3\uffff\2\105\1\13\1\uffff\1\101\1\10\1\uffff"+
        "\1\13\1\17\1\102\2\10\1\17\3\10\2\17\3\10\1\17\1\103\2\10\1\106"+
        "\2\17\1\10\1\111\2\10\1\17\2\uffff\1\103\1\17\3\10\3\17\3\10\2\17"+
        "\3\10\1\103\1\17\1\10\1\106\1\10\1\17\1\106\1\10\1\101\1\110\1\17"+
        "\1\13\2\105\1\uffff\1\10\1\102\2\10\1\17\1\10\2\17\6\10\3\17\4\10"+
        "\3\17\3\10\1\17\2\106\2\10\1\110\1\10\1\104\1\103\2\17\3\10\3\17"+
        "\3\10\3\17\3\10\1\17\2\106\1\10\1\106";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\5\1\6\3\uffff\1\2\2\uffff\1\4\32\uffff"+
        "\1\11\1\10\36\uffff\1\7\72\uffff";
    static final String DFA20_specialS =
        "\u0082\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\1\3\2\uffff\1\1\55\uffff\2\5\4\uffff\1\4\2\uffff"+
            "\1\6\4\uffff\1\7",
            "",
            "\4\11\7\uffff\1\10\10\uffff\1\11\2\uffff\1\11\5\uffff\14\11",
            "",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\14\2\uffff\1\11",
            "",
            "\1\15",
            "\1\16",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\26",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\72\uffff\1\36",
            "\1\40",
            "\1\41",
            "\1\42\71\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\4\47\7\uffff\1\47\10\uffff\1\47\2\uffff\1\47\5\uffff\14\47"+
            "\16\uffff\2\50\14\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\37",
            "\1\71",
            "\1\72",
            "\1\74\72\uffff\1\73",
            "\1\75",
            "\1\76",
            "\1\42\71\uffff\1\43",
            "\1\77",
            "\1\100",
            "\1\101\71\uffff\1\102",
            "\1\103",
            "\1\104",
            "\4\107\7\uffff\1\107\10\uffff\1\107\2\uffff\1\107\5\uffff\14"+
            "\107\16\uffff\2\50\7\uffff\1\50\2\uffff\1\105\1\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125\1\126",
            "\1\127",
            "\1\130",
            "\1\74",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\126",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147\71\uffff\1\150",
            "\1\151\71\uffff\1\152",
            "\1\153",
            "\1\154",
            "\4\107\7\uffff\1\107\10\uffff\1\107\2\uffff\1\107\5\uffff\14"+
            "\107\16\uffff\2\50\7\uffff\1\50\3\uffff\1\106",
            "\1\155",
            "\4\107\7\uffff\1\107\10\uffff\1\107\2\uffff\1\107\5\uffff\14"+
            "\107\16\uffff\2\50\7\uffff\1\50",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\147\71\uffff\1\150",
            "\1\151\71\uffff\1\152",
            "\1\u0081",
            "\1\101\71\uffff\1\102"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "229:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | host | role | host_group | topology | serv_group );";
        }
    }
 

    public static final BitSet FOLLOW_22_in_prog83 = new BitSet(new long[]{0x1FFC200147002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_statement_list_in_prog85 = new BitSet(new long[]{0x1FFC200147802D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_23_in_prog88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declr_stmt_in_statement_list111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_statement_in_statement126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_expr_in_statement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_statement_in_statement144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement_expr160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement_expr166 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement_expr168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_condition_statement184 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_condition_statement186 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_equality_expr_in_condition_statement188 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_condition_statement190 = new BitSet(new long[]{0x1FFC200147002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_statement_list_in_condition_statement192 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_condition_statement195 = new BitSet(new long[]{0x1FFC200147002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_statement_list_in_condition_statement197 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_condition_statement201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_iteration_statement217 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_iteration_statement219 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement221 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_iteration_statement223 = new BitSet(new long[]{0x1FFC200147002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_statement_list_in_iteration_statement225 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_iteration_statement227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_print_statement243 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_print_statement245 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_print_statement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr286 = new BitSet(new long[]{0x0003C00000100000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr290 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr348 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_conditional_expr356 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_expression_in_conditional_expr358 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_conditional_expr360 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_conditional_expr_in_conditional_expr362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr386 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_logicalOR_expr394 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr396 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr419 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_logicalAND_expr427 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr429 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr453 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_bitwiseOR_expr461 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr463 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr486 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_bitwiseAND_expr494 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr496 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr521 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr530 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr538 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr562 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr573 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_expr_in_relational_expr583 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_term_in_expr609 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr620 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_term_in_expr631 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term657 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term668 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_unary_expr_in_term678 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_unary_expr712 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression741 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression744 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression745 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_factor825 = new BitSet(new long[]{0x1800200004002D00L,0x0000000000000212L});
    public static final BitSet FOLLOW_expression_in_factor827 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_factor829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt866 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt870 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_COMMA_in_declr_stmt877 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt881 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_declr_stmt890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_role_in_object_values953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_role1032 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_role1035 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_policy_in_role1037 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_direction_in_policy1050 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_verdict_in_policy1052 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_proto_in_policy1054 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_port_in_policy1056 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_port_in_policy1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1065 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_verdict_in_policy1067 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_proto_in_policy1069 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_topology1081 = new BitSet(new long[]{0x1800000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_role_in_topology1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_topology1091 = new BitSet(new long[]{0x1800000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_role_in_topology1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_verdict0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_name1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_interface_name1237 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_interface_name1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_interface_name1243 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_interface_name1246 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DIV_in_interface_name1249 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_interface_name1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1264 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1266 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1268 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1270 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1272 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1274 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_nmask1288 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_nmask1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_name_in_host1298 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_host1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_host1302 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_host1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_host_set1316 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_host_set1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_host_set1321 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set1333 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_dns_set1336 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set1339 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ip_addr_in_gateway1349 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_gateway1352 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_gateway1354 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_68_in_host_group1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_host_group1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_host_set_in_host_group1370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_host_group1372 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_host_group1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_host_group1380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_dns_set_in_host_group1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_host_group1384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_host_group1392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_host_group1394 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_gateway_in_host_group1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_host_group1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_serv_descr1418 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_nmask_in_serv_descr1421 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_descr1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_serv_group1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_serv_group1436 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_descr_in_serv_group1438 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_serv_group1441 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_descr_in_serv_group1443 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_serv_group1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name1473 = new BitSet(new long[]{0x0000000000000002L});

}