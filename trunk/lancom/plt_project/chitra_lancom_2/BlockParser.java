// $ANTLR 3.0.1 /home/sambuddho/plt_project/chitra_lancom_2/Block.g 2008-04-22 01:36:00

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

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class BlockParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "NUMBER", "NM", "STRING", "ID", "COMMA", "CHAR", "ICMP_MESSAGE_TYPE", "DOT", "LETTER", "DIGIT", "EscapeSequence", "LINE_COMMENT", "EQUAL", "WHITESPACE", "'prog'", "'endprog'", "';'", "'if'", "'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'echo'", "'?'", "':'", "'||'", "'&&'", "'|'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'~'", "'*='", "'/='", "'+='", "'-='", "'topology_type_t'", "'host_type_t'", "'host_group_type_t'", "'serv_group_type_t'", "'role_type_t'", "'policy_type_t'", "'route_type_t'", "'interface_type_t'", "'ipaddr_t'", "'int_type_t'", "'char_type_t'", "'inbound'", "'outbound'", "'allow'", "'deny'", "'udp'", "'tcp'", "'ifname'", "'card_id'", "'netmask'", "'host_group'", "'{'", "'}'", "'DNS'", "'GATEWAY'", "'dns'", "'gateway'", "'host'", "'gw'", "'net'", "'service_set'"
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
    public static final String[] ruleNames = new String[] {
        "invalidRule", "prog", "statement_list", "statement", "statement_expr", 
        "condition_statement", "iteration_statement", "print_statement", 
        "expression", "assignment_expr", "conditional_expr", "logicalOR_expr", 
        "logicalAND_expr", "bitwiseOR_expr", "bitwiseAND_expr", "equality_expr", 
        "relational_expr", "expr", "term", "unary_expr", "postfix_expression", 
        "assignment_operator", "factor", "literal", "declr_stmt", "object_values", 
        "type_name", "role", "policy", "topology", "int_value", "char_value", 
        "direction", "verdict", "proto", "icmp_cntrl_message", "port", "object_name", 
        "interface_name", "ip_addr", "nmask", "host", "host_set", "dns_set", 
        "gateway", "host_group", "interface", "route", "serv_descr", "serv_group", 
        "serv_listen_port", "host_name"
    };

    public int ruleLevel = 0;
    public BlockParser(TokenStream input, int port) {
            super(input, port);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }

    }
    public BlockParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT);
    }
    public BlockParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
    }

    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/sambuddho/plt_project/chitra_lancom_2/Block.g"; }


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
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:45:1: prog : 'prog' ( statement_list )+ 'endprog' ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule("prog");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(45, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:46:2: ( 'prog' ( statement_list )+ 'endprog' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:46:4: 'prog' ( statement_list )+ 'endprog'
            {
            dbg.location(46,4);
            match(input,22,FOLLOW_22_in_prog80); 
            dbg.location(46,11);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:46:11: ( statement_list )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER||(LA1_0>=STRING && LA1_0<=ID)||LA1_0==CHAR||(LA1_0>=24 && LA1_0<=26)||LA1_0==30||LA1_0==32||LA1_0==45||(LA1_0>=50 && LA1_0<=62)||LA1_0==67||LA1_0==70||LA1_0==77||(LA1_0>=79 && LA1_0<=80)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:46:11: statement_list
            	    {
            	    dbg.location(46,11);
            	    pushFollow(FOLLOW_statement_list_in_prog82);
            	    statement_list();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(46,27);
            match(input,23,FOLLOW_23_in_prog85); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(47, 3);

        }
        finally {
            dbg.exitRule("prog");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end prog


    // $ANTLR start statement_list
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:49:2: statement_list : ( statement | declr_stmt );
    public final void statement_list() throws RecognitionException {
        try { dbg.enterRule("statement_list");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(49, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:50:3: ( statement | declr_stmt )
            int alt2=2;
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==NUMBER||(LA2_0>=STRING && LA2_0<=ID)||LA2_0==CHAR||(LA2_0>=24 && LA2_0<=26)||LA2_0==30||LA2_0==32||LA2_0==45||(LA2_0>=61 && LA2_0<=62)||LA2_0==67||LA2_0==70||LA2_0==77||(LA2_0>=79 && LA2_0<=80)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=50 && LA2_0<=60)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("49:2: statement_list : ( statement | declr_stmt );", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:50:5: statement
                    {
                    dbg.location(50,5);
                    pushFollow(FOLLOW_statement_in_statement_list102);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:51:6: declr_stmt
                    {
                    dbg.location(51,6);
                    pushFollow(FOLLOW_declr_stmt_in_statement_list109);
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
        dbg.location(52, 3);

        }
        finally {
            dbg.exitRule("statement_list");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end statement_list


    // $ANTLR start statement
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:54:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final void statement() throws RecognitionException {
        try { dbg.enterRule("statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(54, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:55:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt3=4;
            try { dbg.enterDecision(3);

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
            case 61:
            case 62:
            case 67:
            case 70:
            case 77:
            case 79:
            case 80:
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
                    new NoViableAltException("54:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:55:5: condition_statement
                    {
                    dbg.location(55,5);
                    pushFollow(FOLLOW_condition_statement_in_statement124);
                    condition_statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:56:5: iteration_statement
                    {
                    dbg.location(56,5);
                    pushFollow(FOLLOW_iteration_statement_in_statement130);
                    iteration_statement();
                    _fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:57:5: statement_expr
                    {
                    dbg.location(57,5);
                    pushFollow(FOLLOW_statement_expr_in_statement136);
                    statement_expr();
                    _fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:58:5: print_statement
                    {
                    dbg.location(58,5);
                    pushFollow(FOLLOW_print_statement_in_statement142);
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
        dbg.location(59, 3);

        }
        finally {
            dbg.exitRule("statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end statement


    // $ANTLR start statement_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:61:2: statement_expr : ( ';' | expression ';' );
    public final void statement_expr() throws RecognitionException {
        try { dbg.enterRule("statement_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(61, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:62:3: ( ';' | expression ';' )
            int alt4=2;
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==NUMBER||(LA4_0>=STRING && LA4_0<=ID)||LA4_0==CHAR||LA4_0==26||LA4_0==45||(LA4_0>=61 && LA4_0<=62)||LA4_0==67||LA4_0==70||LA4_0==77||(LA4_0>=79 && LA4_0<=80)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("61:2: statement_expr : ( ';' | expression ';' );", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:62:5: ';'
                    {
                    dbg.location(62,5);
                    match(input,24,FOLLOW_24_in_statement_expr158); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:63:5: expression ';'
                    {
                    dbg.location(63,5);
                    pushFollow(FOLLOW_expression_in_statement_expr164);
                    expression();
                    _fsp--;

                    dbg.location(63,16);
                    match(input,24,FOLLOW_24_in_statement_expr166); 

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
        dbg.location(64, 3);

        }
        finally {
            dbg.exitRule("statement_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end statement_expr


    // $ANTLR start condition_statement
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:68:2: condition_statement : 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' ;
    public final void condition_statement() throws RecognitionException {
        try { dbg.enterRule("condition_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(68, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:69:3: ( 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:69:5: 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif'
            {
            dbg.location(69,5);
            match(input,25,FOLLOW_25_in_condition_statement184); 
            dbg.location(69,10);
            match(input,26,FOLLOW_26_in_condition_statement186); 
            dbg.location(69,14);
            pushFollow(FOLLOW_equality_expr_in_condition_statement188);
            equality_expr();
            _fsp--;

            dbg.location(69,28);
            match(input,27,FOLLOW_27_in_condition_statement190); 
            dbg.location(69,32);
            pushFollow(FOLLOW_statement_list_in_condition_statement192);
            statement_list();
            _fsp--;

            dbg.location(69,47);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:69:47: ( 'else' statement_list )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:69:48: 'else' statement_list
                    {
                    dbg.location(69,48);
                    match(input,28,FOLLOW_28_in_condition_statement195); 
                    dbg.location(69,55);
                    pushFollow(FOLLOW_statement_list_in_condition_statement197);
                    statement_list();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(69,72);
            match(input,29,FOLLOW_29_in_condition_statement201); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(70, 3);

        }
        finally {
            dbg.exitRule("condition_statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end condition_statement


    // $ANTLR start iteration_statement
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:72:2: iteration_statement : 'while' '(' equality_expr ')' statement_list 'endwhile' ;
    public final void iteration_statement() throws RecognitionException {
        try { dbg.enterRule("iteration_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(72, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:73:3: ( 'while' '(' equality_expr ')' statement_list 'endwhile' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:73:5: 'while' '(' equality_expr ')' statement_list 'endwhile'
            {
            dbg.location(73,5);
            match(input,30,FOLLOW_30_in_iteration_statement217); 
            dbg.location(73,13);
            match(input,26,FOLLOW_26_in_iteration_statement219); 
            dbg.location(73,17);
            pushFollow(FOLLOW_equality_expr_in_iteration_statement221);
            equality_expr();
            _fsp--;

            dbg.location(73,31);
            match(input,27,FOLLOW_27_in_iteration_statement223); 
            dbg.location(73,35);
            pushFollow(FOLLOW_statement_list_in_iteration_statement225);
            statement_list();
            _fsp--;

            dbg.location(73,50);
            match(input,31,FOLLOW_31_in_iteration_statement227); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(74, 3);

        }
        finally {
            dbg.exitRule("iteration_statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end iteration_statement


    // $ANTLR start print_statement
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:76:2: print_statement : 'echo' STRING ';' ;
    public final void print_statement() throws RecognitionException {
        Token STRING1=null;

        try { dbg.enterRule("print_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(76, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:77:3: ( 'echo' STRING ';' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:77:5: 'echo' STRING ';'
            {
            dbg.location(77,5);
            match(input,32,FOLLOW_32_in_print_statement243); 
            dbg.location(77,12);
            STRING1=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement245); 
            dbg.location(77,20);
            System.out.println(STRING1);
            dbg.location(77,50);
            match(input,24,FOLLOW_24_in_print_statement249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(78, 3);

        }
        finally {
            dbg.exitRule("print_statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end print_statement


    // $ANTLR start expression
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:80:2: expression : assignment_expr ;
    public final void expression() throws RecognitionException {
        try { dbg.enterRule("expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(80, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:81:3: ( assignment_expr )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:81:5: assignment_expr
            {
            dbg.location(81,5);
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
        dbg.location(82, 4);

        }
        finally {
            dbg.exitRule("expression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end expression


    // $ANTLR start assignment_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:86:3: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );
    public final void assignment_expr() throws RecognitionException {
        object_name_return var = null;

        assignment_operator_return op = null;

        Symbol e = null;


        try { dbg.enterRule("assignment_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(86, 3);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:87:4: (var= object_name op= assignment_operator assignment_expr | e= conditional_expr )
            int alt6=2;
            try { dbg.enterDecision(6);

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
                        new NoViableAltException("86:3: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 6, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA6_0==NUMBER||LA6_0==STRING||LA6_0==CHAR||LA6_0==26||LA6_0==45||(LA6_0>=61 && LA6_0<=62)||LA6_0==67||LA6_0==70||LA6_0==77||(LA6_0>=79 && LA6_0<=80)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("86:3: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:87:7: var= object_name op= assignment_operator assignment_expr
                    {
                    dbg.location(87,10);
                    pushFollow(FOLLOW_object_name_in_assignment_expr292);
                    var=object_name();
                    _fsp--;

                    dbg.location(87,25);
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr296);
                    op=assignment_operator();
                    _fsp--;

                    dbg.location(88,4);

                    	 		Symbol s = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			Assignment ans = new Assignment(s, input.toString(op.start,op.stop));
                    			map.put(input.toString(var.start,var.stop), ans);
                    			System.out.println("here");
                    	 	
                    dbg.location(94,4);
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr307);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:96:6: e= conditional_expr
                    {
                    dbg.location(96,7);
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr320);
                    e=conditional_expr();
                    _fsp--;

                    dbg.location(97,4);

                     			//Put these values in assignment map
                     			System.out.println("Cond expr: " + e);
                     			
                     			Set entries = map.entrySet();
                    			Iterator iter = entries.iterator();
                    			System.out.println("Symbol Val: " + e.getValue());
                    			while(iter.hasNext() && e != null)
                    			{
                    				Map.Entry entry = (Map.Entry)iter.next();
                    				String key = (String)entry.getKey();
                    				Symbol s = new Symbol(key, e.getType(), e.lookupValue());
                    				System.out.println(s.getValue());
                    				//-- COMMENT: Somehow this statement is not reflecting a change in the symbol value
                    				currentScope.setSymbolValue(key, s);
                    				System.out.println("Symbol table: " + s.getType() + " " + s.getValue());
                    			}
                    			currentScope.printSymbols();
                     		

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
        dbg.location(117, 3);

        }
        finally {
            dbg.exitRule("assignment_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end assignment_expr


    // $ANTLR start conditional_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:121:2: conditional_expr returns [Symbol sym] : e= logicalOR_expr ( '?' expression ':' conditional_expr )? ;
    public final Symbol conditional_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("conditional_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(121, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:122:3: (e= logicalOR_expr ( '?' expression ':' conditional_expr )? )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:122:5: e= logicalOR_expr ( '?' expression ':' conditional_expr )?
            {
            dbg.location(122,6);
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr354);
            e=logicalOR_expr();
            _fsp--;

            dbg.location(122,22);
             sym = e;
            dbg.location(123,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:123:3: ( '?' expression ':' conditional_expr )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:123:5: '?' expression ':' conditional_expr
                    {
                    dbg.location(123,5);
                    match(input,33,FOLLOW_33_in_conditional_expr362); 
                    dbg.location(123,9);
                    pushFollow(FOLLOW_expression_in_conditional_expr364);
                    expression();
                    _fsp--;

                    dbg.location(123,20);
                    match(input,34,FOLLOW_34_in_conditional_expr366); 
                    dbg.location(123,24);
                    pushFollow(FOLLOW_conditional_expr_in_conditional_expr368);
                    conditional_expr();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(124, 3);

        }
        finally {
            dbg.exitRule("conditional_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end conditional_expr


    // $ANTLR start logicalOR_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:126:2: logicalOR_expr returns [Symbol sym] : e= logicalAND_expr ( '||' logicalAND_expr )* ;
    public final Symbol logicalOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("logicalOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(126, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:127:3: (e= logicalAND_expr ( '||' logicalAND_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:127:5: e= logicalAND_expr ( '||' logicalAND_expr )*
            {
            dbg.location(127,6);
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr392);
            e=logicalAND_expr();
            _fsp--;

            dbg.location(127,24);
             sym = e;
            dbg.location(128,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:128:3: ( '||' logicalAND_expr )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:128:4: '||' logicalAND_expr
            	    {
            	    dbg.location(128,4);
            	    match(input,35,FOLLOW_35_in_logicalOR_expr400); 
            	    dbg.location(128,9);
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr402);
            	    logicalAND_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(129, 3);

        }
        finally {
            dbg.exitRule("logicalOR_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end logicalOR_expr


    // $ANTLR start logicalAND_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:131:2: logicalAND_expr returns [Symbol sym] : e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* ;
    public final Symbol logicalAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("logicalAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(131, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:132:3: (e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:132:5: e= bitwiseOR_expr ( '&&' bitwiseOR_expr )*
            {
            dbg.location(132,6);
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr425);
            e=bitwiseOR_expr();
            _fsp--;

            dbg.location(132,23);
             sym = e;
            dbg.location(133,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:133:3: ( '&&' bitwiseOR_expr )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==36) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:133:4: '&&' bitwiseOR_expr
            	    {
            	    dbg.location(133,4);
            	    match(input,36,FOLLOW_36_in_logicalAND_expr433); 
            	    dbg.location(133,9);
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr435);
            	    bitwiseOR_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(134, 3);

        }
        finally {
            dbg.exitRule("logicalAND_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end logicalAND_expr


    // $ANTLR start bitwiseOR_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:136:2: bitwiseOR_expr returns [Symbol sym] : e= bitwiseAND_expr ( '|' bitwiseAND_expr )* ;
    public final Symbol bitwiseOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("bitwiseOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(136, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:137:3: (e= bitwiseAND_expr ( '|' bitwiseAND_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:137:5: e= bitwiseAND_expr ( '|' bitwiseAND_expr )*
            {
            dbg.location(137,6);
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr459);
            e=bitwiseAND_expr();
            _fsp--;

            dbg.location(137,24);
             sym = e;
            dbg.location(138,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:138:3: ( '|' bitwiseAND_expr )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:138:4: '|' bitwiseAND_expr
            	    {
            	    dbg.location(138,4);
            	    match(input,37,FOLLOW_37_in_bitwiseOR_expr467); 
            	    dbg.location(138,8);
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr469);
            	    bitwiseAND_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(139, 3);

        }
        finally {
            dbg.exitRule("bitwiseOR_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end bitwiseOR_expr


    // $ANTLR start bitwiseAND_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:141:2: bitwiseAND_expr returns [Symbol sym] : e= equality_expr ( '&' equality_expr )* ;
    public final Symbol bitwiseAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("bitwiseAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(141, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:142:3: (e= equality_expr ( '&' equality_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:142:5: e= equality_expr ( '&' equality_expr )*
            {
            dbg.location(142,6);
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr492);
            e=equality_expr();
            _fsp--;

            dbg.location(142,22);
             sym = e;
            dbg.location(143,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:143:3: ( '&' equality_expr )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:143:4: '&' equality_expr
            	    {
            	    dbg.location(143,4);
            	    match(input,38,FOLLOW_38_in_bitwiseAND_expr500); 
            	    dbg.location(143,8);
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr502);
            	    equality_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(144, 3);

        }
        finally {
            dbg.exitRule("bitwiseAND_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end bitwiseAND_expr


    // $ANTLR start equality_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:146:2: equality_expr returns [Symbol sym] : e= relational_expr ( ( '==' | '!=' ) relational_expr )* ;
    public final Symbol equality_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("equality_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(146, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:147:3: (e= relational_expr ( ( '==' | '!=' ) relational_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:147:5: e= relational_expr ( ( '==' | '!=' ) relational_expr )*
            {
            dbg.location(147,6);
            pushFollow(FOLLOW_relational_expr_in_equality_expr527);
            e=relational_expr();
            _fsp--;

            dbg.location(147,24);
             sym = e;
            dbg.location(148,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:148:3: ( ( '==' | '!=' ) relational_expr )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=39 && LA12_0<=40)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:148:5: ( '==' | '!=' ) relational_expr
            	    {
            	    dbg.location(148,5);
            	    if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr536);    throw mse;
            	    }

            	    dbg.location(148,19);
            	    pushFollow(FOLLOW_relational_expr_in_equality_expr544);
            	    relational_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(149, 3);

        }
        finally {
            dbg.exitRule("equality_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end equality_expr


    // $ANTLR start relational_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:151:2: relational_expr returns [Symbol sym] : e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* ;
    public final Symbol relational_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("relational_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(151, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:152:3: (e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:152:5: e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )*
            {
            dbg.location(152,6);
            pushFollow(FOLLOW_expr_in_relational_expr568);
            e=expr();
            _fsp--;

            dbg.location(152,15);
             sym = e;
            dbg.location(153,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:153:3: ( ( '<' | '>' | '<=' | '>=' ) expr )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=41 && LA13_0<=44)) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:153:5: ( '<' | '>' | '<=' | '>=' ) expr
            	    {
            	    dbg.location(153,5);
            	    if ( (input.LA(1)>=41 && input.LA(1)<=44) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr579);    throw mse;
            	    }

            	    dbg.location(153,25);
            	    pushFollow(FOLLOW_expr_in_relational_expr589);
            	    expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(154, 3);

        }
        finally {
            dbg.exitRule("relational_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end relational_expr


    // $ANTLR start expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:157:2: expr returns [Symbol sym] : e= term ( ( PLUS | MINUS ) term )* ;
    public final Symbol expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(157, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:158:3: (e= term ( ( PLUS | MINUS ) term )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:158:5: e= term ( ( PLUS | MINUS ) term )*
            {
            dbg.location(158,6);
            pushFollow(FOLLOW_term_in_expr615);
            e=term();
            _fsp--;

            dbg.location(158,15);
            sym = e;
            dbg.location(159,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:159:3: ( ( PLUS | MINUS ) term )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=PLUS && LA14_0<=MINUS)) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:159:5: ( PLUS | MINUS ) term
            	    {
            	    dbg.location(159,5);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr626);    throw mse;
            	    }

            	    dbg.location(159,23);
            	    pushFollow(FOLLOW_term_in_expr637);
            	    term();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(160, 3);

        }
        finally {
            dbg.exitRule("expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end expr


    // $ANTLR start term
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:162:2: term returns [Symbol sym] : e= unary_expr ( ( MULT | DIV ) unary_expr )* ;
    public final Symbol term() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("term");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(162, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:163:3: (e= unary_expr ( ( MULT | DIV ) unary_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:163:5: e= unary_expr ( ( MULT | DIV ) unary_expr )*
            {
            dbg.location(163,6);
            pushFollow(FOLLOW_unary_expr_in_term663);
            e=unary_expr();
            _fsp--;

            dbg.location(163,21);
            sym = e;
            dbg.location(164,3);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:164:3: ( ( MULT | DIV ) unary_expr )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=MULT && LA15_0<=DIV)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:164:5: ( MULT | DIV ) unary_expr
            	    {
            	    dbg.location(164,5);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term674);    throw mse;
            	    }

            	    dbg.location(164,20);
            	    pushFollow(FOLLOW_unary_expr_in_term684);
            	    unary_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(165, 3);

        }
        finally {
            dbg.exitRule("term");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end term


    // $ANTLR start unary_expr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:167:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );
    public final Symbol unary_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("unary_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(167, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:168:3: (e= postfix_expression | '~' unary_expr )
            int alt16=2;
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==NUMBER||(LA16_0>=STRING && LA16_0<=ID)||LA16_0==CHAR||LA16_0==26||(LA16_0>=61 && LA16_0<=62)||LA16_0==67||LA16_0==70||LA16_0==77||(LA16_0>=79 && LA16_0<=80)) ) {
                alt16=1;
            }
            else if ( (LA16_0==45) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("167:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:168:5: e= postfix_expression
                    {
                    dbg.location(168,6);
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr710);
                    e=postfix_expression();
                    _fsp--;

                    dbg.location(168,26);
                    sym = e;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:169:5: '~' unary_expr
                    {
                    dbg.location(169,5);
                    match(input,45,FOLLOW_45_in_unary_expr718); 
                    dbg.location(169,9);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr720);
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
        dbg.location(172, 3);

        }
        finally {
            dbg.exitRule("unary_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end unary_expr


    // $ANTLR start postfix_expression
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:174:2: postfix_expression returns [Symbol sym] : e= factor ( '.' ID )* ;
    public final Symbol postfix_expression() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("postfix_expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(174, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:175:3: (e= factor ( '.' ID )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:175:5: e= factor ( '.' ID )*
            {
            dbg.location(175,6);
            pushFollow(FOLLOW_factor_in_postfix_expression747);
            e=factor();
            _fsp--;

            dbg.location(175,14);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:175:14: ( '.' ID )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==DOT) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:175:15: '.' ID
            	    {
            	    dbg.location(175,15);
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression750); 
            	    dbg.location(175,18);
            	    match(input,ID,FOLLOW_ID_in_postfix_expression751); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}

            dbg.location(175,24);
            sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(176, 3);

        }
        finally {
            dbg.exitRule("postfix_expression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end postfix_expression

    public static class assignment_operator_return extends ParserRuleReturnScope {
    };

    // $ANTLR start assignment_operator
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:178:2: assignment_operator : ( '=' | '*=' | '/=' | '+=' | '-=' );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("assignment_operator");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(178, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:179:3: ( '=' | '*=' | '/=' | '+=' | '-=' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:
            {
            dbg.location(179,3);
            if ( input.LA(1)==EQUAL||(input.LA(1)>=46 && input.LA(1)<=49) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(184, 3);

        }
        finally {
            dbg.exitRule("assignment_operator");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end assignment_operator


    // $ANTLR start factor
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:186:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );
    public final Symbol factor() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("factor");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(186, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:188:2: ( ID | e= literal | '(' expression ')' )
            int alt18=3;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt18=1;
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 61:
            case 62:
            case 67:
            case 70:
            case 77:
            case 79:
            case 80:
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
                    new NoViableAltException("186:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:188:4: ID
                    {
                    dbg.location(188,4);
                    match(input,ID,FOLLOW_ID_in_factor814); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:189:5: e= literal
                    {
                    dbg.location(189,6);
                    pushFollow(FOLLOW_literal_in_factor822);
                    e=literal();
                    _fsp--;

                    dbg.location(189,15);
                    sym = e;  currentScope.printSymbols();

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:190:5: '(' expression ')'
                    {
                    dbg.location(190,5);
                    match(input,26,FOLLOW_26_in_factor831); 
                    dbg.location(190,9);
                    pushFollow(FOLLOW_expression_in_factor833);
                    expression();
                    _fsp--;

                    dbg.location(190,20);
                    match(input,27,FOLLOW_27_in_factor835); 

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
        dbg.location(191, 3);

        }
        finally {
            dbg.exitRule("factor");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end factor


    // $ANTLR start literal
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:193:2: literal returns [Symbol sym] : e= object_values ;
    public final Symbol literal() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("literal");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(193, 2);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:194:3: (e= object_values )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:194:5: e= object_values
            {
            dbg.location(194,6);
            pushFollow(FOLLOW_object_values_in_literal857);
            e=object_values();
            _fsp--;

            dbg.location(194,21);
            sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(195, 3);

        }
        finally {
            dbg.exitRule("literal");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end literal


    // $ANTLR start declr_stmt
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:197:1: declr_stmt : type_name var= object_name ( COMMA next_var= object_name )* ';' ;
    public final void declr_stmt() throws RecognitionException {
        object_name_return var = null;

        object_name_return next_var = null;

        type_name_return type_name2 = null;


        try { dbg.enterRule("declr_stmt");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(197, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:198:2: ( type_name var= object_name ( COMMA next_var= object_name )* ';' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:199:2: type_name var= object_name ( COMMA next_var= object_name )* ';'
            {
            dbg.location(199,2);
            pushFollow(FOLLOW_type_name_in_declr_stmt872);
            type_name2=type_name();
            _fsp--;

            dbg.location(199,15);
            pushFollow(FOLLOW_object_name_in_declr_stmt876);
            var=object_name();
            _fsp--;

            dbg.location(200,2);

            		currentScope.defineSymbol(input.toString(var.start,var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            dbg.location(203,2);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:203:2: ( COMMA next_var= object_name )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:203:3: COMMA next_var= object_name
            	    {
            	    dbg.location(203,3);
            	    match(input,COMMA,FOLLOW_COMMA_in_declr_stmt883); 
            	    dbg.location(203,17);
            	    pushFollow(FOLLOW_object_name_in_declr_stmt887);
            	    next_var=object_name();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}

            dbg.location(204,2);

            		currentScope.defineSymbol(input.toString(next_var.start,next_var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            dbg.location(207,2);
            match(input,24,FOLLOW_24_in_declr_stmt896); 
            dbg.location(208,2);

            		currentScope.printSymbols();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(211, 2);

        }
        finally {
            dbg.exitRule("declr_stmt");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end declr_stmt


    // $ANTLR start object_values
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:215:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | host | role | host_group | topology | route | interface | serv_group );
    public final Symbol object_values() throws RecognitionException {
        Symbol sym = null;

        Symbol int_value3 = null;


        try { dbg.enterRule("object_values");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(215, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:216:2: ( char_value | int_value | STRING | ip_addr | host | role | host_group | topology | route | interface | serv_group )
            int alt20=11;
            try { dbg.enterDecision(20);

            try {
                isCyclicDecision = true;
                alt20 = dfa20.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:216:4: char_value
                    {
                    dbg.location(216,4);
                    pushFollow(FOLLOW_char_value_in_object_values929);
                    char_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:217:4: int_value
                    {
                    dbg.location(217,4);
                    pushFollow(FOLLOW_int_value_in_object_values934);
                    int_value3=int_value();
                    _fsp--;

                    dbg.location(218,2);
                     
                    		sym = int_value3;
                    	

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:221:4: STRING
                    {
                    dbg.location(221,4);
                    match(input,STRING,FOLLOW_STRING_in_object_values943); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:222:4: ip_addr
                    {
                    dbg.location(222,4);
                    pushFollow(FOLLOW_ip_addr_in_object_values948);
                    ip_addr();
                    _fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:224:4: host
                    {
                    dbg.location(224,4);
                    pushFollow(FOLLOW_host_in_object_values954);
                    host();
                    _fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:225:4: role
                    {
                    dbg.location(225,4);
                    pushFollow(FOLLOW_role_in_object_values959);
                    role();
                    _fsp--;


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:226:4: host_group
                    {
                    dbg.location(226,4);
                    pushFollow(FOLLOW_host_group_in_object_values964);
                    host_group();
                    _fsp--;


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:227:4: topology
                    {
                    dbg.location(227,4);
                    pushFollow(FOLLOW_topology_in_object_values969);
                    topology();
                    _fsp--;


                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:228:3: route
                    {
                    dbg.location(228,3);
                    pushFollow(FOLLOW_route_in_object_values973);
                    route();
                    _fsp--;


                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:229:3: interface
                    {
                    dbg.location(229,3);
                    pushFollow(FOLLOW_interface_in_object_values977);
                    interface();
                    _fsp--;


                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:230:4: serv_group
                    {
                    dbg.location(230,4);
                    pushFollow(FOLLOW_serv_group_in_object_values982);
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
        dbg.location(232, 2);

        }
        finally {
            dbg.exitRule("object_values");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end object_values

    public static class type_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start type_name
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:234:1: type_name : ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("type_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(234, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:235:2: ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:
            {
            dbg.location(235,2);
            if ( (input.LA(1)>=50 && input.LA(1)<=60) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(246, 2);

        }
        finally {
            dbg.exitRule("type_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end type_name


    // $ANTLR start role
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:248:1: role : policy ( COMMA policy )* ;
    public final void role() throws RecognitionException {
        try { dbg.enterRule("role");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(248, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:248:7: ( policy ( COMMA policy )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:248:9: policy ( COMMA policy )*
            {
            dbg.location(248,9);
            pushFollow(FOLLOW_policy_in_role1056);
            policy();
            _fsp--;

            dbg.location(248,16);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:248:16: ( COMMA policy )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:248:17: COMMA policy
            	    {
            	    dbg.location(248,17);
            	    match(input,COMMA,FOLLOW_COMMA_in_role1059); 
            	    dbg.location(248,23);
            	    pushFollow(FOLLOW_policy_in_role1061);
            	    policy();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(249, 2);

        }
        finally {
            dbg.exitRule("role");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end role


    // $ANTLR start policy
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:251:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );
    public final void policy() throws RecognitionException {
        try { dbg.enterRule("policy");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(251, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:251:9: ( direction verdict proto port port | direction verdict proto icmp_cntrl_message )
            int alt22=2;
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=61 && LA22_0<=62)) ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=63 && LA22_1<=64)) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2>=65 && LA22_2<=66)) ) {
                        int LA22_3 = input.LA(4);

                        if ( (LA22_3==NUMBER) ) {
                            alt22=1;
                        }
                        else if ( (LA22_3==ICMP_MESSAGE_TYPE) ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("251:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 22, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("251:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 22, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("251:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 22, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("251:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:251:11: direction verdict proto port port
                    {
                    dbg.location(251,11);
                    pushFollow(FOLLOW_direction_in_policy1074);
                    direction();
                    _fsp--;

                    dbg.location(251,21);
                    pushFollow(FOLLOW_verdict_in_policy1076);
                    verdict();
                    _fsp--;

                    dbg.location(251,29);
                    pushFollow(FOLLOW_proto_in_policy1078);
                    proto();
                    _fsp--;

                    dbg.location(251,35);
                    pushFollow(FOLLOW_port_in_policy1080);
                    port();
                    _fsp--;

                    dbg.location(251,40);
                    pushFollow(FOLLOW_port_in_policy1082);
                    port();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:252:5: direction verdict proto icmp_cntrl_message
                    {
                    dbg.location(252,5);
                    pushFollow(FOLLOW_direction_in_policy1089);
                    direction();
                    _fsp--;

                    dbg.location(252,15);
                    pushFollow(FOLLOW_verdict_in_policy1091);
                    verdict();
                    _fsp--;

                    dbg.location(252,23);
                    pushFollow(FOLLOW_proto_in_policy1093);
                    proto();
                    _fsp--;

                    dbg.location(252,29);
                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy1095);
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
        dbg.location(253, 2);

        }
        finally {
            dbg.exitRule("policy");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end policy


    // $ANTLR start topology
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:255:1: topology : ( ( host_group )+ role | ( serv_group )+ role );
    public final void topology() throws RecognitionException {
        try { dbg.enterRule("topology");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(255, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:255:9: ( ( host_group )+ role | ( serv_group )+ role )
            int alt25=2;
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==70) ) {
                alt25=1;
            }
            else if ( (LA25_0==80) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("255:1: topology : ( ( host_group )+ role | ( serv_group )+ role );", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:255:11: ( host_group )+ role
                    {
                    dbg.location(255,11);
                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:255:11: ( host_group )+
                    int cnt23=0;
                    try { dbg.enterSubRule(23);

                    loop23:
                    do {
                        int alt23=2;
                        try { dbg.enterDecision(23);

                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==70) ) {
                            alt23=1;
                        }


                        } finally {dbg.exitDecision(23);}

                        switch (alt23) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:255:12: host_group
                    	    {
                    	    dbg.location(255,12);
                    	    pushFollow(FOLLOW_host_group_in_topology1105);
                    	    host_group();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt23++;
                    } while (true);
                    } finally {dbg.exitSubRule(23);}

                    dbg.location(255,25);
                    pushFollow(FOLLOW_role_in_topology1109);
                    role();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:256:4: ( serv_group )+ role
                    {
                    dbg.location(256,4);
                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:256:4: ( serv_group )+
                    int cnt24=0;
                    try { dbg.enterSubRule(24);

                    loop24:
                    do {
                        int alt24=2;
                        try { dbg.enterDecision(24);

                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==80) ) {
                            alt24=1;
                        }


                        } finally {dbg.exitDecision(24);}

                        switch (alt24) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:256:5: serv_group
                    	    {
                    	    dbg.location(256,5);
                    	    pushFollow(FOLLOW_serv_group_in_topology1115);
                    	    serv_group();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt24++;
                    } while (true);
                    } finally {dbg.exitSubRule(24);}

                    dbg.location(256,18);
                    pushFollow(FOLLOW_role_in_topology1119);
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
        dbg.location(257, 2);

        }
        finally {
            dbg.exitRule("topology");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end topology


    // $ANTLR start int_value
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:260:1: int_value returns [Symbol sym] : e= NUMBER ;
    public final Symbol int_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try { dbg.enterRule("int_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(260, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:261:2: (e= NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:261:4: e= NUMBER
            {
            dbg.location(261,5);
            e=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_int_value1139); 
            dbg.location(262,3);

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
        dbg.location(270, 2);

        }
        finally {
            dbg.exitRule("int_value");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end int_value


    // $ANTLR start char_value
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:272:1: char_value : CHAR ;
    public final void char_value() throws RecognitionException {
        try { dbg.enterRule("char_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(272, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:273:2: ( CHAR )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:273:4: CHAR
            {
            dbg.location(273,4);
            match(input,CHAR,FOLLOW_CHAR_in_char_value1156); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(274, 2);

        }
        finally {
            dbg.exitRule("char_value");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end char_value


    // $ANTLR start direction
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:277:1: direction : ( 'inbound' | 'outbound' );
    public final void direction() throws RecognitionException {
        try { dbg.enterRule("direction");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(277, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:278:2: ( 'inbound' | 'outbound' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:
            {
            dbg.location(278,2);
            if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(280, 2);

        }
        finally {
            dbg.exitRule("direction");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end direction


    // $ANTLR start verdict
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:282:1: verdict : ( 'allow' | 'deny' );
    public final void verdict() throws RecognitionException {
        try { dbg.enterRule("verdict");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(282, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:282:9: ( 'allow' | 'deny' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:
            {
            dbg.location(282,9);
            if ( (input.LA(1)>=63 && input.LA(1)<=64) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(284, 2);

        }
        finally {
            dbg.exitRule("verdict");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end verdict


    // $ANTLR start proto
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:286:1: proto : ( 'udp' | 'tcp' );
    public final void proto() throws RecognitionException {
        try { dbg.enterRule("proto");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(286, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:286:9: ( 'udp' | 'tcp' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:
            {
            dbg.location(286,9);
            if ( (input.LA(1)>=65 && input.LA(1)<=66) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(287, 9);

        }
        finally {
            dbg.exitRule("proto");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end proto


    // $ANTLR start icmp_cntrl_message
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:289:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final void icmp_cntrl_message() throws RecognitionException {
        try { dbg.enterRule("icmp_cntrl_message");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(289, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:290:2: ( ICMP_MESSAGE_TYPE )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:290:4: ICMP_MESSAGE_TYPE
            {
            dbg.location(290,4);
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1225); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(291, 2);

        }
        finally {
            dbg.exitRule("icmp_cntrl_message");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end icmp_cntrl_message


    // $ANTLR start port
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:293:1: port : NUMBER ;
    public final void port() throws RecognitionException {
        try { dbg.enterRule("port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(293, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:293:6: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:293:8: NUMBER
            {
            dbg.location(293,8);
            match(input,NUMBER,FOLLOW_NUMBER_in_port1235); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(293, 14);

        }
        finally {
            dbg.exitRule("port");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end port

    public static class object_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start object_name
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:296:1: object_name : ID ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("object_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(296, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:297:2: ( ID )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:297:4: ID
            {
            dbg.location(297,4);
            match(input,ID,FOLLOW_ID_in_object_name1245); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(297, 6);

        }
        finally {
            dbg.exitRule("object_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end object_name


    // $ANTLR start interface_name
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:303:1: interface_name : 'ifname' ( ID ) 'card_id' NUMBER ( '/' NUMBER )? ;
    public final void interface_name() throws RecognitionException {
        try { dbg.enterRule("interface_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(303, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:304:1: ( 'ifname' ( ID ) 'card_id' NUMBER ( '/' NUMBER )? )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:304:5: 'ifname' ( ID ) 'card_id' NUMBER ( '/' NUMBER )?
            {
            dbg.location(304,5);
            match(input,67,FOLLOW_67_in_interface_name1260); 
            dbg.location(304,14);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:304:14: ( ID )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:304:15: ID
            {
            dbg.location(304,15);
            match(input,ID,FOLLOW_ID_in_interface_name1263); 

            }

            dbg.location(304,19);
            match(input,68,FOLLOW_68_in_interface_name1266); 
            dbg.location(304,30);
            match(input,NUMBER,FOLLOW_NUMBER_in_interface_name1269); 
            dbg.location(304,37);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:304:37: ( '/' NUMBER )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==DIV) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:304:38: '/' NUMBER
                    {
                    dbg.location(304,38);
                    match(input,DIV,FOLLOW_DIV_in_interface_name1272); 
                    dbg.location(304,42);
                    match(input,NUMBER,FOLLOW_NUMBER_in_interface_name1274); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(306, 2);

        }
        finally {
            dbg.exitRule("interface_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end interface_name


    // $ANTLR start ip_addr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:1: ip_addr : ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) ;
    public final void ip_addr() throws RecognitionException {
        try { dbg.enterRule("ip_addr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(308, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:9: ( ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:10: ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER )
            {
            dbg.location(308,10);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:10: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:11: NUMBER
            {
            dbg.location(308,11);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1287); 

            }

            dbg.location(308,18);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1289); 
            dbg.location(308,21);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:21: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:22: NUMBER
            {
            dbg.location(308,22);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1291); 

            }

            dbg.location(308,29);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1293); 
            dbg.location(308,32);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:32: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:33: NUMBER
            {
            dbg.location(308,33);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1295); 

            }

            dbg.location(308,40);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1297); 
            dbg.location(308,43);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:43: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:308:44: NUMBER
            {
            dbg.location(308,44);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1299); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(309, 2);

        }
        finally {
            dbg.exitRule("ip_addr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end ip_addr


    // $ANTLR start nmask
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:311:1: nmask : 'netmask' ip_addr ;
    public final void nmask() throws RecognitionException {
        try { dbg.enterRule("nmask");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(311, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:311:7: ( 'netmask' ip_addr )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:311:9: 'netmask' ip_addr
            {
            dbg.location(311,9);
            match(input,69,FOLLOW_69_in_nmask1311); 
            dbg.location(311,19);
            pushFollow(FOLLOW_ip_addr_in_nmask1313);
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
        dbg.location(311, 26);

        }
        finally {
            dbg.exitRule("nmask");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end nmask


    // $ANTLR start host
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:313:1: host : interface_name ip_addr 'netmask' ip_addr ;
    public final void host() throws RecognitionException {
        try { dbg.enterRule("host");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(313, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:313:6: ( interface_name ip_addr 'netmask' ip_addr )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:313:8: interface_name ip_addr 'netmask' ip_addr
            {
            dbg.location(313,8);
            pushFollow(FOLLOW_interface_name_in_host1321);
            interface_name();
            _fsp--;

            dbg.location(313,23);
            pushFollow(FOLLOW_ip_addr_in_host1323);
            ip_addr();
            _fsp--;

            dbg.location(313,31);
            match(input,69,FOLLOW_69_in_host1325); 
            dbg.location(313,41);
            pushFollow(FOLLOW_ip_addr_in_host1327);
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
        dbg.location(315, 2);

        }
        finally {
            dbg.exitRule("host");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end host


    // $ANTLR start host_set
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:317:1: host_set : host ( ',' host )* ;
    public final void host_set() throws RecognitionException {
        try { dbg.enterRule("host_set");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(317, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:318:2: ( host ( ',' host )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:318:3: host ( ',' host )*
            {
            dbg.location(318,3);
            pushFollow(FOLLOW_host_in_host_set1339);
            host();
            _fsp--;

            dbg.location(318,8);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:318:8: ( ',' host )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMMA) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:318:9: ',' host
            	    {
            	    dbg.location(318,9);
            	    match(input,COMMA,FOLLOW_COMMA_in_host_set1342); 
            	    dbg.location(318,13);
            	    pushFollow(FOLLOW_host_in_host_set1344);
            	    host();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(319, 2);

        }
        finally {
            dbg.exitRule("host_set");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end host_set


    // $ANTLR start dns_set
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:321:1: dns_set : ip_addr ( ',' ip_addr )* ;
    public final void dns_set() throws RecognitionException {
        try { dbg.enterRule("dns_set");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(321, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:321:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:321:11: ip_addr ( ',' ip_addr )*
            {
            dbg.location(321,11);
            pushFollow(FOLLOW_ip_addr_in_dns_set1356);
            ip_addr();
            _fsp--;

            dbg.location(321,19);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:321:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:321:20: ',' ip_addr
            	    {
            	    dbg.location(321,20);
            	    match(input,COMMA,FOLLOW_COMMA_in_dns_set1359); 
            	    dbg.location(321,25);
            	    pushFollow(FOLLOW_ip_addr_in_dns_set1362);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(321, 34);

        }
        finally {
            dbg.exitRule("dns_set");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end dns_set


    // $ANTLR start gateway
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:323:1: gateway : ip_addr ( ',' ip_addr )* ;
    public final void gateway() throws RecognitionException {
        try { dbg.enterRule("gateway");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(323, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:323:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:323:11: ip_addr ( ',' ip_addr )*
            {
            dbg.location(323,11);
            pushFollow(FOLLOW_ip_addr_in_gateway1372);
            ip_addr();
            _fsp--;

            dbg.location(323,19);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:323:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:323:20: ',' ip_addr
            	    {
            	    dbg.location(323,20);
            	    match(input,COMMA,FOLLOW_COMMA_in_gateway1375); 
            	    dbg.location(323,24);
            	    pushFollow(FOLLOW_ip_addr_in_gateway1377);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(323, 33);

        }
        finally {
            dbg.exitRule("gateway");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end gateway


    // $ANTLR start host_group
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:325:1: host_group : 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )? ;
    public final void host_group() throws RecognitionException {
        try { dbg.enterRule("host_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(325, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:326:2: ( 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )? )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:326:4: 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )?
            {
            dbg.location(326,4);
            match(input,70,FOLLOW_70_in_host_group1388); 
            dbg.location(326,18);
            match(input,71,FOLLOW_71_in_host_group1391); 
            dbg.location(326,22);
            pushFollow(FOLLOW_host_set_in_host_group1393);
            host_set();
            _fsp--;

            dbg.location(326,31);
            match(input,72,FOLLOW_72_in_host_group1395); 
            dbg.location(326,36);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:326:36: ( 'DNS' '{' dns_set '}' )?
            int alt30=2;
            try { dbg.enterSubRule(30);
            try { dbg.enterDecision(30);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==73) ) {
                alt30=1;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:326:38: 'DNS' '{' dns_set '}'
                    {
                    dbg.location(326,38);
                    match(input,73,FOLLOW_73_in_host_group1400); 
                    dbg.location(326,45);
                    match(input,71,FOLLOW_71_in_host_group1403); 
                    dbg.location(326,49);
                    pushFollow(FOLLOW_dns_set_in_host_group1405);
                    dns_set();
                    _fsp--;

                    dbg.location(326,57);
                    match(input,72,FOLLOW_72_in_host_group1407); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(30);}

            dbg.location(326,65);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:326:65: ( 'GATEWAY' '{' gateway '}' )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==74) ) {
                alt31=1;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:326:67: 'GATEWAY' '{' gateway '}'
                    {
                    dbg.location(326,67);
                    match(input,74,FOLLOW_74_in_host_group1415); 
                    dbg.location(326,77);
                    match(input,71,FOLLOW_71_in_host_group1417); 
                    dbg.location(326,81);
                    pushFollow(FOLLOW_gateway_in_host_group1419);
                    gateway();
                    _fsp--;

                    dbg.location(326,89);
                    match(input,72,FOLLOW_72_in_host_group1421); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(327, 3);

        }
        finally {
            dbg.exitRule("host_group");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end host_group


    // $ANTLR start interface
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:1: interface : interface_name ip_addr 'netmask' ip_addr ( 'dns' '{' ip_addr ( ',' ip_addr )* '}' )? ( 'gateway' '{' ip_addr ( ',' ip_addr )* '}' )? ;
    public final void interface() throws RecognitionException {
        try { dbg.enterRule("interface");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(330, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:11: ( interface_name ip_addr 'netmask' ip_addr ( 'dns' '{' ip_addr ( ',' ip_addr )* '}' )? ( 'gateway' '{' ip_addr ( ',' ip_addr )* '}' )? )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:13: interface_name ip_addr 'netmask' ip_addr ( 'dns' '{' ip_addr ( ',' ip_addr )* '}' )? ( 'gateway' '{' ip_addr ( ',' ip_addr )* '}' )?
            {
            dbg.location(330,13);
            pushFollow(FOLLOW_interface_name_in_interface1436);
            interface_name();
            _fsp--;

            dbg.location(330,28);
            pushFollow(FOLLOW_ip_addr_in_interface1438);
            ip_addr();
            _fsp--;

            dbg.location(330,36);
            match(input,69,FOLLOW_69_in_interface1440); 
            dbg.location(330,46);
            pushFollow(FOLLOW_ip_addr_in_interface1442);
            ip_addr();
            _fsp--;

            dbg.location(330,54);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:54: ( 'dns' '{' ip_addr ( ',' ip_addr )* '}' )?
            int alt33=2;
            try { dbg.enterSubRule(33);
            try { dbg.enterDecision(33);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==75) ) {
                alt33=1;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:56: 'dns' '{' ip_addr ( ',' ip_addr )* '}'
                    {
                    dbg.location(330,56);
                    match(input,75,FOLLOW_75_in_interface1446); 
                    dbg.location(330,63);
                    match(input,71,FOLLOW_71_in_interface1449); 
                    dbg.location(330,67);
                    pushFollow(FOLLOW_ip_addr_in_interface1451);
                    ip_addr();
                    _fsp--;

                    dbg.location(330,75);
                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:75: ( ',' ip_addr )*
                    try { dbg.enterSubRule(32);

                    loop32:
                    do {
                        int alt32=2;
                        try { dbg.enterDecision(32);

                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==COMMA) ) {
                            alt32=1;
                        }


                        } finally {dbg.exitDecision(32);}

                        switch (alt32) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:76: ',' ip_addr
                    	    {
                    	    dbg.location(330,76);
                    	    match(input,COMMA,FOLLOW_COMMA_in_interface1454); 
                    	    dbg.location(330,81);
                    	    pushFollow(FOLLOW_ip_addr_in_interface1457);
                    	    ip_addr();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(32);}

                    dbg.location(330,91);
                    match(input,72,FOLLOW_72_in_interface1461); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(33);}

            dbg.location(330,99);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:99: ( 'gateway' '{' ip_addr ( ',' ip_addr )* '}' )?
            int alt35=2;
            try { dbg.enterSubRule(35);
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==76) ) {
                alt35=1;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:101: 'gateway' '{' ip_addr ( ',' ip_addr )* '}'
                    {
                    dbg.location(330,101);
                    match(input,76,FOLLOW_76_in_interface1469); 
                    dbg.location(330,111);
                    match(input,71,FOLLOW_71_in_interface1471); 
                    dbg.location(330,115);
                    pushFollow(FOLLOW_ip_addr_in_interface1473);
                    ip_addr();
                    _fsp--;

                    dbg.location(330,123);
                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:123: ( ',' ip_addr )*
                    try { dbg.enterSubRule(34);

                    loop34:
                    do {
                        int alt34=2;
                        try { dbg.enterDecision(34);

                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==COMMA) ) {
                            alt34=1;
                        }


                        } finally {dbg.exitDecision(34);}

                        switch (alt34) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:330:124: ',' ip_addr
                    	    {
                    	    dbg.location(330,124);
                    	    match(input,COMMA,FOLLOW_COMMA_in_interface1476); 
                    	    dbg.location(330,129);
                    	    pushFollow(FOLLOW_ip_addr_in_interface1479);
                    	    ip_addr();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(34);}

                    dbg.location(330,139);
                    match(input,72,FOLLOW_72_in_interface1483); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(330, 146);

        }
        finally {
            dbg.exitRule("interface");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end interface


    // $ANTLR start route
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:331:1: route : ( 'host' ip_addr 'gw' ip_addr | 'net' ip_addr 'netmask' ip_addr 'gw' ip_addr );
    public final void route() throws RecognitionException {
        try { dbg.enterRule("route");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(331, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:331:7: ( 'host' ip_addr 'gw' ip_addr | 'net' ip_addr 'netmask' ip_addr 'gw' ip_addr )
            int alt36=2;
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==77) ) {
                alt36=1;
            }
            else if ( (LA36_0==79) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("331:1: route : ( 'host' ip_addr 'gw' ip_addr | 'net' ip_addr 'netmask' ip_addr 'gw' ip_addr );", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:331:9: 'host' ip_addr 'gw' ip_addr
                    {
                    dbg.location(331,9);
                    match(input,77,FOLLOW_77_in_route1494); 
                    dbg.location(331,16);
                    pushFollow(FOLLOW_ip_addr_in_route1496);
                    ip_addr();
                    _fsp--;

                    dbg.location(331,24);
                    match(input,78,FOLLOW_78_in_route1498); 
                    dbg.location(331,29);
                    pushFollow(FOLLOW_ip_addr_in_route1500);
                    ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:332:4: 'net' ip_addr 'netmask' ip_addr 'gw' ip_addr
                    {
                    dbg.location(332,4);
                    match(input,79,FOLLOW_79_in_route1505); 
                    dbg.location(332,10);
                    pushFollow(FOLLOW_ip_addr_in_route1507);
                    ip_addr();
                    _fsp--;

                    dbg.location(332,18);
                    match(input,69,FOLLOW_69_in_route1509); 
                    dbg.location(332,28);
                    pushFollow(FOLLOW_ip_addr_in_route1511);
                    ip_addr();
                    _fsp--;

                    dbg.location(332,36);
                    match(input,78,FOLLOW_78_in_route1513); 
                    dbg.location(332,41);
                    pushFollow(FOLLOW_ip_addr_in_route1515);
                    ip_addr();
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
        dbg.location(333, 2);

        }
        finally {
            dbg.exitRule("route");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end route


    // $ANTLR start serv_descr
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:335:1: serv_descr : ip_addr ( nmask )? serv_listen_port ;
    public final void serv_descr() throws RecognitionException {
        try { dbg.enterRule("serv_descr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(335, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:336:2: ( ip_addr ( nmask )? serv_listen_port )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:336:4: ip_addr ( nmask )? serv_listen_port
            {
            dbg.location(336,4);
            pushFollow(FOLLOW_ip_addr_in_serv_descr1531);
            ip_addr();
            _fsp--;

            dbg.location(336,12);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:336:12: ( nmask )?
            int alt37=2;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:336:13: nmask
                    {
                    dbg.location(336,13);
                    pushFollow(FOLLOW_nmask_in_serv_descr1534);
                    nmask();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(37);}

            dbg.location(336,21);
            pushFollow(FOLLOW_serv_listen_port_in_serv_descr1538);
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
        dbg.location(336, 37);

        }
        finally {
            dbg.exitRule("serv_descr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end serv_descr


    // $ANTLR start serv_group
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:338:1: serv_group : 'service_set' '{' serv_descr ( ',' serv_descr )* '}' ;
    public final void serv_group() throws RecognitionException {
        try { dbg.enterRule("serv_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(338, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:339:2: ( 'service_set' '{' serv_descr ( ',' serv_descr )* '}' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:339:4: 'service_set' '{' serv_descr ( ',' serv_descr )* '}'
            {
            dbg.location(339,4);
            match(input,80,FOLLOW_80_in_serv_group1547); 
            dbg.location(339,18);
            match(input,71,FOLLOW_71_in_serv_group1549); 
            dbg.location(339,22);
            pushFollow(FOLLOW_serv_descr_in_serv_group1551);
            serv_descr();
            _fsp--;

            dbg.location(339,33);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:339:33: ( ',' serv_descr )*
            try { dbg.enterSubRule(38);

            loop38:
            do {
                int alt38=2;
                try { dbg.enterDecision(38);

                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                } finally {dbg.exitDecision(38);}

                switch (alt38) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:339:34: ',' serv_descr
            	    {
            	    dbg.location(339,34);
            	    match(input,COMMA,FOLLOW_COMMA_in_serv_group1554); 
            	    dbg.location(339,38);
            	    pushFollow(FOLLOW_serv_descr_in_serv_group1556);
            	    serv_descr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);
            } finally {dbg.exitSubRule(38);}

            dbg.location(339,51);
            match(input,72,FOLLOW_72_in_serv_group1560); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(341, 2);

        }
        finally {
            dbg.exitRule("serv_group");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end serv_group


    // $ANTLR start serv_listen_port
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:343:1: serv_listen_port : ( NUMBER ) ;
    public final void serv_listen_port() throws RecognitionException {
        try { dbg.enterRule("serv_listen_port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(343, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:344:2: ( ( NUMBER ) )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:344:4: ( NUMBER )
            {
            dbg.location(344,4);
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:344:4: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:344:5: NUMBER
            {
            dbg.location(344,5);
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port1576); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(344, 12);

        }
        finally {
            dbg.exitRule("serv_listen_port");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end serv_listen_port


    // $ANTLR start host_name
    // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:346:1: host_name : ID ;
    public final void host_name() throws RecognitionException {
        try { dbg.enterRule("host_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(346, 1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:347:2: ( ID )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/chitra_lancom_2/Block.g:347:4: ID
            {
            dbg.location(347,4);
            match(input,ID,FOLLOW_ID_in_host_name1586); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(347, 6);

        }
        finally {
            dbg.exitRule("host_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end host_name


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\u0097\uffff";
    static final String DFA20_eofS =
        "\u0097\uffff";
    static final String DFA20_minS =
        "\1\10\1\uffff\1\4\1\uffff\1\13\1\uffff\2\107\1\uffff\1\10\1\uffff"+
        "\1\104\1\103\1\10\1\uffff\1\10\1\13\1\17\1\7\1\104\2\10\1\17\1\10"+
        "\1\17\2\10\1\7\1\10\1\17\1\10\2\17\4\10\2\17\4\10\1\14\1\105\2\17"+
        "\1\10\1\4\3\10\1\17\2\uffff\1\17\1\105\1\17\4\10\4\17\4\10\3\17"+
        "\5\10\1\uffff\1\17\1\10\1\14\1\10\1\17\1\14\1\10\1\103\1\4\1\17"+
        "\1\13\2\107\1\uffff\1\10\1\104\2\10\1\17\1\10\2\17\1\10\1\7\4\10"+
        "\3\17\4\10\3\17\3\10\1\17\2\14\2\10\1\4\1\10\1\4\1\105\2\17\3\10"+
        "\3\17\3\10\3\17\3\10\1\17\2\14\1\10\1\14";
    static final String DFA20_maxS =
        "\1\120\1\uffff\1\54\1\uffff\1\13\1\uffff\2\107\1\uffff\1\13\1\uffff"+
        "\1\104\1\103\1\10\1\uffff\1\10\1\13\1\17\1\10\1\104\2\10\1\17\1"+
        "\10\1\17\4\10\1\17\1\10\2\17\4\10\2\17\1\105\3\10\1\110\1\105\2"+
        "\17\1\10\1\120\3\10\1\17\2\uffff\1\17\1\105\1\17\4\10\4\17\4\10"+
        "\3\17\4\10\1\105\1\uffff\1\17\1\10\1\110\1\10\1\17\1\110\1\10\1"+
        "\103\1\112\1\17\1\13\2\107\1\uffff\1\10\1\104\2\10\1\17\1\10\2\17"+
        "\6\10\3\17\4\10\3\17\3\10\1\17\2\110\2\10\1\112\1\10\1\106\1\105"+
        "\2\17\3\10\3\17\3\10\3\17\3\10\1\17\2\110\1\10\1\110";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\6\2\uffff\1\11\1\uffff\1\2\3"+
        "\uffff\1\4\46\uffff\1\13\1\10\27\uffff\1\5\15\uffff\1\7\72\uffff";
    static final String DFA20_specialS =
        "\u0097\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\1\3\2\uffff\1\1\57\uffff\2\5\4\uffff\1\4\2\uffff"+
            "\1\6\6\uffff\1\10\1\uffff\1\10\1\7",
            "",
            "\4\12\7\uffff\1\11\10\uffff\1\12\2\uffff\1\12\5\uffff\14\12",
            "",
            "\1\13",
            "",
            "\1\14",
            "\1\15",
            "",
            "\1\16\2\uffff\1\12",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\26",
            "\1\35",
            "\1\36\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\37",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\53\74\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\73\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\4\65\7\uffff\1\65\10\uffff\1\65\2\uffff\1\65\5\uffff\14\65"+
            "\20\uffff\2\66\21\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\53",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\121\74\uffff\1\120",
            "",
            "\1\122",
            "\1\123",
            "\1\57\73\uffff\1\60",
            "\1\124",
            "\1\125",
            "\1\126\73\uffff\1\127",
            "\1\130",
            "\1\131",
            "\4\134\7\uffff\1\134\10\uffff\1\134\2\uffff\1\134\5\uffff\14"+
            "\134\20\uffff\2\66\7\uffff\1\66\2\uffff\1\132\1\133",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152\1\153",
            "\1\154",
            "\1\155",
            "\1\121",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\153",
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
            "\1\174\73\uffff\1\175",
            "\1\176\73\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\4\134\7\uffff\1\134\10\uffff\1\134\2\uffff\1\134\5\uffff\14"+
            "\134\20\uffff\2\66\7\uffff\1\66\3\uffff\1\133",
            "\1\u0082",
            "\4\134\7\uffff\1\134\10\uffff\1\134\2\uffff\1\134\5\uffff\14"+
            "\134\20\uffff\2\66\7\uffff\1\66",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\174\73\uffff\1\175",
            "\1\176\73\uffff\1\177",
            "\1\u0096",
            "\1\126\73\uffff\1\127"
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
            return "215:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | host | role | host_group | topology | route | interface | serv_group );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_22_in_prog80 = new BitSet(new long[]{0x7FFC200147002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_statement_list_in_prog82 = new BitSet(new long[]{0x7FFC200147802D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_23_in_prog85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declr_stmt_in_statement_list109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_statement_in_statement124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_expr_in_statement136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_statement_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement_expr158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement_expr164 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement_expr166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_condition_statement184 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_condition_statement186 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_equality_expr_in_condition_statement188 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_condition_statement190 = new BitSet(new long[]{0x7FFC200147002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_statement_list_in_condition_statement192 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_condition_statement195 = new BitSet(new long[]{0x7FFC200147002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_statement_list_in_condition_statement197 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_condition_statement201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_iteration_statement217 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_iteration_statement219 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement221 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_iteration_statement223 = new BitSet(new long[]{0x7FFC200147002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_statement_list_in_iteration_statement225 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_iteration_statement227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_print_statement243 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_print_statement245 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_print_statement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr292 = new BitSet(new long[]{0x0003C00000100000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr296 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr354 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_conditional_expr362 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_expression_in_conditional_expr364 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_conditional_expr366 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_conditional_expr_in_conditional_expr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr392 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_logicalOR_expr400 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr402 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr425 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_logicalAND_expr433 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr435 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr459 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_bitwiseOR_expr467 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr469 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr492 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_bitwiseAND_expr500 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr502 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr527 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr536 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr544 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr568 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr579 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_expr_in_relational_expr589 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_term_in_expr615 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr626 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_term_in_expr637 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term663 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term674 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_unary_expr_in_term684 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_unary_expr718 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression747 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression750 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression751 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_factor831 = new BitSet(new long[]{0x6000200004002D00L,0x000000000001A048L});
    public static final BitSet FOLLOW_expression_in_factor833 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_factor835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt872 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt876 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_COMMA_in_declr_stmt883 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt887 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_declr_stmt896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_role_in_object_values959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_in_object_values973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_in_object_values977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_role1056 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_role1059 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_policy_in_role1061 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_direction_in_policy1074 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_verdict_in_policy1076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_proto_in_policy1078 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_port_in_policy1080 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_port_in_policy1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1089 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_verdict_in_policy1091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_proto_in_policy1093 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_topology1105 = new BitSet(new long[]{0x6000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_role_in_topology1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_topology1115 = new BitSet(new long[]{0x6000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_role_in_topology1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_verdict0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_name1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_interface_name1260 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_interface_name1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_interface_name1266 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_interface_name1269 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DIV_in_interface_name1272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_interface_name1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1287 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1289 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1291 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1293 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1295 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1297 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_nmask1311 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_nmask1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_name_in_host1321 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_host1323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_host1325 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_host1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_host_set1339 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_host_set1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_host_in_host_set1344 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set1356 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_dns_set1359 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set1362 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ip_addr_in_gateway1372 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_gateway1375 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_gateway1377 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_70_in_host_group1388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_host_group1391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_host_set_in_host_group1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_host_group1395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_host_group1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_host_group1403 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_dns_set_in_host_group1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_host_group1407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_host_group1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_host_group1417 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_gateway_in_host_group1419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_host_group1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_name_in_interface1436 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interface1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_interface1440 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interface1442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_interface1446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_interface1449 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interface1451 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_interface1454 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interface1457 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_interface1461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_interface1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_interface1471 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interface1473 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_interface1476 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interface1479 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_interface1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_route1494 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route1496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_route1498 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_route1505 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_route1509 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_route1513 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_serv_descr1531 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000020L});
    public static final BitSet FOLLOW_nmask_in_serv_descr1534 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_descr1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_serv_group1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_serv_group1549 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_descr_in_serv_group1551 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_serv_group1554 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_descr_in_serv_group1556 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_serv_group1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name1586 = new BitSet(new long[]{0x0000000000000002L});

}