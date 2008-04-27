// $ANTLR 3.0.1 D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g 2008-04-26 23:11:09

	//import javalancom.Scope;
	//import javalancom.Symbol;
	import java.util.HashMap;
	import java.io.*;
	import java.util.Vector;
	import java.util.Set;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.zip.DataFormatException;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class BlockParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "NUMBER", "NM", "STRING", "ID", "COMMA", "CHAR", "ICMP_MESSAGE_TYPE", "DOT", "LETTER", "DIGIT", "EscapeSequence", "LINE_COMMENT", "EQUAL", "WHITESPACE", "'prog'", "'endprog'", "';'", "'ifconfig'", "'apply'", "'topology'", "'undo'", "'role'", "'policy'", "'host_group'", "'route'", "'add'", "'delete'", "'to'", "'from'", "'show'", "'numeric'", "'fw'", "'if'", "'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'echo'", "'?'", "':'", "'||'", "'&&'", "'|'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'~'", "'*='", "'/='", "'+='", "'-='", "'topology_type_t'", "'host_type_t'", "'host_group_type_t'", "'serv_group_type_t'", "'role_type_t'", "'policy_type_t'", "'route_type_t'", "'interface_type_t'", "'ipaddr_t'", "'int_type_t'", "'char_type_t'", "'{'", "'}'", "'netmask'", "'inbound'", "'outbound'", "'allow'", "'deny'", "'udp'", "'tcp'", "'ip_addr'", "'ifname'", "'dns'", "'gw'", "'host'", "'net'", "'service_set'"
    };
    public static final int COMMA=12;
    public static final int MINUS=5;
    public static final int LETTER=16;
    public static final int NUMBER=8;
    public static final int CHAR=13;
    public static final int STRING=10;
    public static final int LINE_COMMENT=19;
    public static final int ICMP_MESSAGE_TYPE=14;
    public static final int WHITESPACE=21;
    public static final int NM=9;
    public static final int DOT=15;
    public static final int EQUAL=20;
    public static final int EscapeSequence=18;
    public static final int EOF=-1;
    public static final int DIV=7;
    public static final int PLUS=4;
    public static final int DIGIT=17;
    public static final int MULT=6;
    public static final int ID=11;
    public static final String[] ruleNames = new String[] {
        "invalidRule", "prog", "statement_list", "statement", "statement_expr", 
        "config_statement", "route_oper", "set_oper", "config_display", 
        "condition_statement", "iteration_statement", "print_statement", 
        "expression", "assignment_expr", "conditional_expr", "logicalOR_expr", 
        "logicalAND_expr", "bitwiseOR_expr", "bitwiseAND_expr", "equality_expr", 
        "relational_expr", "expr", "term", "unary_expr", "postfix_expression", 
        "assignment_operator", "factor", "literal", "declr_stmt", "type_name", 
        "object_values", "role", "policy", "topology", "int_value", "char_value", 
        "direction", "verdict", "proto", "icmp_cntrl_message", "port", "object_name", 
        "ip_addr", "nmask", "host", "dns_set", "gateway", "host_group", 
        "interf", "route", "serv_group", "serv_listen_port", "host_name"
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
    public String getGrammarFileName() { return "D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g"; }

          
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:50:1: prog : 'prog' ( statement_list )+ 'endprog' ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule("prog");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(50, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:51:2: ( 'prog' ( statement_list )+ 'endprog' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:51:4: 'prog' ( statement_list )+ 'endprog'
            {
            dbg.location(51,4);
            match(input,22,FOLLOW_22_in_prog83); 
            dbg.location(51,11);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:51:11: ( statement_list )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER||(LA1_0>=STRING && LA1_0<=ID)||LA1_0==CHAR||(LA1_0>=24 && LA1_0<=26)||(LA1_0>=28 && LA1_0<=29)||(LA1_0>=31 && LA1_0<=34)||(LA1_0>=39 && LA1_0<=41)||LA1_0==45||LA1_0==47||LA1_0==60||(LA1_0>=65 && LA1_0<=75)||(LA1_0>=79 && LA1_0<=80)||(LA1_0>=85 && LA1_0<=86)||(LA1_0>=89 && LA1_0<=91)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:51:11: statement_list
            	    {
            	    dbg.location(51,11);
            	    pushFollow(FOLLOW_statement_list_in_prog85);
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

            dbg.location(51,27);
            match(input,23,FOLLOW_23_in_prog88); 

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
            dbg.exitRule("prog");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end prog


    // $ANTLR start statement_list
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:54:2: statement_list : ( statement | declr_stmt );
    public final void statement_list() throws RecognitionException {
        try { dbg.enterRule("statement_list");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(54, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:55:3: ( statement | declr_stmt )
            int alt2=2;
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==NUMBER||(LA2_0>=STRING && LA2_0<=ID)||LA2_0==CHAR||(LA2_0>=24 && LA2_0<=26)||(LA2_0>=28 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=34)||(LA2_0>=39 && LA2_0<=41)||LA2_0==45||LA2_0==47||LA2_0==60||(LA2_0>=79 && LA2_0<=80)||(LA2_0>=85 && LA2_0<=86)||(LA2_0>=89 && LA2_0<=91)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=65 && LA2_0<=75)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("54:2: statement_list : ( statement | declr_stmt );", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:55:5: statement
                    {
                    dbg.location(55,5);
                    pushFollow(FOLLOW_statement_in_statement_list104);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:56:6: declr_stmt
                    {
                    dbg.location(56,6);
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
        dbg.location(57, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:59:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final void statement() throws RecognitionException {
        try { dbg.enterRule("statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(59, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:60:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt3=4;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case 45:
                {
                alt3=2;
                }
                break;
            case NUMBER:
            case STRING:
            case ID:
            case CHAR:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
            case 34:
            case 39:
            case 41:
            case 60:
            case 79:
            case 80:
            case 85:
            case 86:
            case 89:
            case 90:
            case 91:
                {
                alt3=3;
                }
                break;
            case 47:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("59:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:60:5: condition_statement
                    {
                    dbg.location(60,5);
                    pushFollow(FOLLOW_condition_statement_in_statement126);
                    condition_statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:61:5: iteration_statement
                    {
                    dbg.location(61,5);
                    pushFollow(FOLLOW_iteration_statement_in_statement132);
                    iteration_statement();
                    _fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:62:5: statement_expr
                    {
                    dbg.location(62,5);
                    pushFollow(FOLLOW_statement_expr_in_statement138);
                    statement_expr();
                    _fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:63:5: print_statement
                    {
                    dbg.location(63,5);
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
        dbg.location(64, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );
    public final void statement_expr() throws RecognitionException {
        try { dbg.enterRule("statement_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(66, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:67:3: ( ';' | expression ';' | config_statement ';' )
            int alt4=3;
            try { dbg.enterDecision(4);

            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=PLUS && LA4_2<=DIV)||LA4_2==DOT||LA4_2==EQUAL||LA4_2==24||LA4_2==48||(LA4_2>=50 && LA4_2<=59)||(LA4_2>=61 && LA4_2<=64)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 29:
            case 31:
            case 41:
            case 60:
            case 79:
            case 80:
            case 85:
            case 86:
            case 91:
                {
                alt4=2;
                }
                break;
            case 89:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==NUMBER) ) {
                    int LA4_8 = input.LA(3);

                    if ( (LA4_8==DOT) ) {
                        int LA4_10 = input.LA(4);

                        if ( (LA4_10==NUMBER) ) {
                            int LA4_12 = input.LA(5);

                            if ( (LA4_12==DOT) ) {
                                int LA4_14 = input.LA(6);

                                if ( (LA4_14==NUMBER) ) {
                                    int LA4_16 = input.LA(7);

                                    if ( (LA4_16==DOT) ) {
                                        int LA4_18 = input.LA(8);

                                        if ( (LA4_18==NUMBER) ) {
                                            int LA4_20 = input.LA(9);

                                            if ( (LA4_20==88) ) {
                                                int LA4_22 = input.LA(10);

                                                if ( (LA4_22==NUMBER) ) {
                                                    int LA4_24 = input.LA(11);

                                                    if ( (LA4_24==DOT) ) {
                                                        int LA4_26 = input.LA(12);

                                                        if ( (LA4_26==NUMBER) ) {
                                                            int LA4_28 = input.LA(13);

                                                            if ( (LA4_28==DOT) ) {
                                                                int LA4_30 = input.LA(14);

                                                                if ( (LA4_30==NUMBER) ) {
                                                                    int LA4_32 = input.LA(15);

                                                                    if ( (LA4_32==DOT) ) {
                                                                        int LA4_34 = input.LA(16);

                                                                        if ( (LA4_34==NUMBER) ) {
                                                                            int LA4_36 = input.LA(17);

                                                                            if ( ((LA4_36>=PLUS && LA4_36<=DIV)||LA4_36==DOT||LA4_36==24||LA4_36==48||(LA4_36>=50 && LA4_36<=59)) ) {
                                                                                alt4=2;
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 36, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 34, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 30, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 28, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 24, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 22, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 20, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 18, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 16, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 14, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 12, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 10, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 8, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 90:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==NUMBER) ) {
                    int LA4_9 = input.LA(3);

                    if ( (LA4_9==DOT) ) {
                        int LA4_11 = input.LA(4);

                        if ( (LA4_11==NUMBER) ) {
                            int LA4_13 = input.LA(5);

                            if ( (LA4_13==DOT) ) {
                                int LA4_15 = input.LA(6);

                                if ( (LA4_15==NUMBER) ) {
                                    int LA4_17 = input.LA(7);

                                    if ( (LA4_17==DOT) ) {
                                        int LA4_19 = input.LA(8);

                                        if ( (LA4_19==NUMBER) ) {
                                            int LA4_21 = input.LA(9);

                                            if ( (LA4_21==78) ) {
                                                int LA4_23 = input.LA(10);

                                                if ( (LA4_23==NUMBER) ) {
                                                    int LA4_25 = input.LA(11);

                                                    if ( (LA4_25==DOT) ) {
                                                        int LA4_27 = input.LA(12);

                                                        if ( (LA4_27==NUMBER) ) {
                                                            int LA4_29 = input.LA(13);

                                                            if ( (LA4_29==DOT) ) {
                                                                int LA4_31 = input.LA(14);

                                                                if ( (LA4_31==NUMBER) ) {
                                                                    int LA4_33 = input.LA(15);

                                                                    if ( (LA4_33==DOT) ) {
                                                                        int LA4_35 = input.LA(16);

                                                                        if ( (LA4_35==NUMBER) ) {
                                                                            int LA4_37 = input.LA(17);

                                                                            if ( (LA4_37==88) ) {
                                                                                int LA4_38 = input.LA(18);

                                                                                if ( (LA4_38==NUMBER) ) {
                                                                                    int LA4_39 = input.LA(19);

                                                                                    if ( (LA4_39==DOT) ) {
                                                                                        int LA4_40 = input.LA(20);

                                                                                        if ( (LA4_40==NUMBER) ) {
                                                                                            int LA4_41 = input.LA(21);

                                                                                            if ( (LA4_41==DOT) ) {
                                                                                                int LA4_42 = input.LA(22);

                                                                                                if ( (LA4_42==NUMBER) ) {
                                                                                                    int LA4_43 = input.LA(23);

                                                                                                    if ( (LA4_43==DOT) ) {
                                                                                                        int LA4_44 = input.LA(24);

                                                                                                        if ( (LA4_44==NUMBER) ) {
                                                                                                            int LA4_45 = input.LA(25);

                                                                                                            if ( ((LA4_45>=PLUS && LA4_45<=DIV)||LA4_45==DOT||LA4_45==24||LA4_45==48||(LA4_45>=50 && LA4_45<=59)) ) {
                                                                                                                alt4=2;
                                                                                                            }
                                                                                                            else {
                                                                                                                NoViableAltException nvae =
                                                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                                                                dbg.recognitionException(nvae);
                                                                                                                throw nvae;
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            NoViableAltException nvae =
                                                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 44, input);

                                                                                                            dbg.recognitionException(nvae);
                                                                                                            throw nvae;
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        NoViableAltException nvae =
                                                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 43, input);

                                                                                                        dbg.recognitionException(nvae);
                                                                                                        throw nvae;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    NoViableAltException nvae =
                                                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                                                    dbg.recognitionException(nvae);
                                                                                                    throw nvae;
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                NoViableAltException nvae =
                                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 41, input);

                                                                                                dbg.recognitionException(nvae);
                                                                                                throw nvae;
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            NoViableAltException nvae =
                                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 40, input);

                                                                                            dbg.recognitionException(nvae);
                                                                                            throw nvae;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 39, input);

                                                                                        dbg.recognitionException(nvae);
                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 38, input);

                                                                                    dbg.recognitionException(nvae);
                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 35, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 33, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 29, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 27, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 25, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 23, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 21, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 19, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 17, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 15, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 13, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 11, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 9, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 25:
            case 26:
            case 28:
            case 32:
            case 33:
            case 34:
            case 39:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:67:5: ';'
                    {
                    dbg.location(67,5);
                    match(input,24,FOLLOW_24_in_statement_expr160); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:68:5: expression ';'
                    {
                    dbg.location(68,5);
                    pushFollow(FOLLOW_expression_in_statement_expr166);
                    expression();
                    _fsp--;

                    dbg.location(68,16);
                    match(input,24,FOLLOW_24_in_statement_expr168); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:69:28: config_statement ';'
                    {
                    dbg.location(69,28);
                    pushFollow(FOLLOW_config_statement_in_statement_expr197);
                    config_statement();
                    _fsp--;

                    dbg.location(69,45);
                    match(input,24,FOLLOW_24_in_statement_expr199); 

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
        dbg.location(70, 3);

        }
        finally {
            dbg.exitRule("statement_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end statement_expr


    // $ANTLR start config_statement
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );
    public final void config_statement() throws RecognitionException {
        object_name_return var = null;

        Symbol p2 = null;


        try { dbg.enterRule("config_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(72, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:73:3: ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display )
            int alt9=19;
            try { dbg.enterDecision(9);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt9=19;
                    }
                    break;
                case 33:
                    {
                    int LA9_10 = input.LA(3);

                    if ( ((LA9_10>=89 && LA9_10<=90)) ) {
                        alt9=2;
                    }
                    else if ( (LA9_10==ID) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 10, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA9_11 = input.LA(3);

                    if ( (LA9_11==ID) ) {
                        alt9=1;
                    }
                    else if ( ((LA9_11>=89 && LA9_11<=90)) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 11, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case 89:
            case 90:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==ID) ) {
                    alt9=3;
                }
                else if ( (LA9_4==86) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 26:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    int LA9_14 = input.LA(3);

                    if ( (LA9_14==31||LA9_14==91) ) {
                        alt9=6;
                    }
                    else if ( (LA9_14==ID) ) {
                        alt9=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 14, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case 29:
                    {
                    int LA9_15 = input.LA(3);

                    if ( (LA9_15==ID) ) {
                        alt9=10;
                    }
                    else if ( (LA9_15==29) ) {
                        alt9=11;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 15, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case 30:
                    {
                    int LA9_16 = input.LA(3);

                    if ( ((LA9_16>=79 && LA9_16<=80)) ) {
                        alt9=15;
                    }
                    else if ( (LA9_16==ID) ) {
                        alt9=14;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 16, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    int LA9_17 = input.LA(3);

                    if ( ((LA9_17>=79 && LA9_17<=80)) ) {
                        alt9=17;
                    }
                    else if ( (LA9_17==ID) ) {
                        alt9=16;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 17, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    int LA9_18 = input.LA(3);

                    if ( (LA9_18==31||LA9_18==91) ) {
                        alt9=8;
                    }
                    else if ( (LA9_18==ID) ) {
                        alt9=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 18, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case 29:
                    {
                    int LA9_19 = input.LA(3);

                    if ( (LA9_19==ID) ) {
                        alt9=12;
                    }
                    else if ( (LA9_19==29) ) {
                        alt9=13;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 19, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case 33:
                {
                int LA9_7 = input.LA(2);

                if ( (LA9_7==35) ) {
                    int LA9_20 = input.LA(3);

                    if ( (LA9_20==29) ) {
                        alt9=9;
                    }
                    else if ( (LA9_20==31) ) {
                        alt9=18;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 20, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA9_8 = input.LA(2);

                if ( (LA9_8==36) ) {
                    int LA9_21 = input.LA(3);

                    if ( (LA9_21==31) ) {
                        alt9=18;
                    }
                    else if ( (LA9_21==29) ) {
                        alt9=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 21, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt9=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("72:2: config_statement : ( route_oper object_name | route_oper route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:74:3: route_oper object_name
                    {
                    dbg.location(74,3);
                    pushFollow(FOLLOW_route_oper_in_config_statement219);
                    route_oper();
                    _fsp--;

                    dbg.location(74,14);
                    pushFollow(FOLLOW_object_name_in_config_statement221);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:75:4: route_oper route
                    {
                    dbg.location(75,4);
                    pushFollow(FOLLOW_route_oper_in_config_statement226);
                    route_oper();
                    _fsp--;

                    dbg.location(75,15);
                    pushFollow(FOLLOW_route_in_config_statement228);
                    route();
                    _fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:76:4: 'ifconfig' object_name
                    {
                    dbg.location(76,4);
                    match(input,25,FOLLOW_25_in_config_statement233); 
                    dbg.location(76,15);
                    pushFollow(FOLLOW_object_name_in_config_statement235);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:77:3: 'ifconfig' interf
                    {
                    dbg.location(77,3);
                    match(input,25,FOLLOW_25_in_config_statement239); 
                    dbg.location(77,14);
                    pushFollow(FOLLOW_interf_in_config_statement241);
                    interf();
                    _fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:78:3: 'apply' 'topology' object_name
                    {
                    dbg.location(78,3);
                    match(input,26,FOLLOW_26_in_config_statement245); 
                    dbg.location(78,11);
                    match(input,27,FOLLOW_27_in_config_statement247); 
                    dbg.location(78,22);
                    pushFollow(FOLLOW_object_name_in_config_statement249);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:79:5: 'apply' 'topology' topology
                    {
                    dbg.location(79,5);
                    match(input,26,FOLLOW_26_in_config_statement255); 
                    dbg.location(79,13);
                    match(input,27,FOLLOW_27_in_config_statement257); 
                    dbg.location(79,24);
                    pushFollow(FOLLOW_topology_in_config_statement259);
                    topology();
                    _fsp--;


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:80:5: 'undo' 'topology' object_name
                    {
                    dbg.location(80,5);
                    match(input,28,FOLLOW_28_in_config_statement265); 
                    dbg.location(80,12);
                    match(input,27,FOLLOW_27_in_config_statement267); 
                    dbg.location(80,23);
                    pushFollow(FOLLOW_object_name_in_config_statement269);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:81:5: 'undo' 'topology' topology
                    {
                    dbg.location(81,5);
                    match(input,28,FOLLOW_28_in_config_statement276); 
                    dbg.location(81,12);
                    match(input,27,FOLLOW_27_in_config_statement278); 
                    dbg.location(81,23);
                    pushFollow(FOLLOW_topology_in_config_statement280);
                    topology();
                    _fsp--;


                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:82:6: set_oper 'role' ( object_name | role ) ( object_name | policy )
                    {
                    dbg.location(82,6);
                    pushFollow(FOLLOW_set_oper_in_config_statement287);
                    set_oper();
                    _fsp--;

                    dbg.location(82,15);
                    match(input,29,FOLLOW_29_in_config_statement289); 
                    dbg.location(82,22);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:82:22: ( object_name | role )
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5);

                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==29) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("82:22: ( object_name | role )", 5, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:82:23: object_name
                            {
                            dbg.location(82,23);
                            pushFollow(FOLLOW_object_name_in_config_statement292);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:82:35: role
                            {
                            dbg.location(82,35);
                            pushFollow(FOLLOW_role_in_config_statement294);
                            role();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(82,41);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:82:41: ( object_name | policy )
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ID) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_0>=79 && LA6_0<=80)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("82:41: ( object_name | policy )", 6, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:82:42: object_name
                            {
                            dbg.location(82,42);
                            pushFollow(FOLLOW_object_name_in_config_statement298);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:82:54: policy
                            {
                            dbg.location(82,54);
                            pushFollow(FOLLOW_policy_in_config_statement300);
                            policy();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:83:6: 'apply' 'role' object_name
                    {
                    dbg.location(83,6);
                    match(input,26,FOLLOW_26_in_config_statement308); 
                    dbg.location(83,14);
                    match(input,29,FOLLOW_29_in_config_statement310); 
                    dbg.location(83,21);
                    pushFollow(FOLLOW_object_name_in_config_statement312);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:84:6: 'apply' 'role' role
                    {
                    dbg.location(84,6);
                    match(input,26,FOLLOW_26_in_config_statement319); 
                    dbg.location(84,14);
                    match(input,29,FOLLOW_29_in_config_statement321); 
                    dbg.location(84,21);
                    pushFollow(FOLLOW_role_in_config_statement323);
                    role();
                    _fsp--;


                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:85:5: 'undo' 'role' object_name
                    {
                    dbg.location(85,5);
                    match(input,28,FOLLOW_28_in_config_statement329); 
                    dbg.location(85,12);
                    match(input,29,FOLLOW_29_in_config_statement331); 
                    dbg.location(85,19);
                    pushFollow(FOLLOW_object_name_in_config_statement333);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:86:5: 'undo' 'role' role
                    {
                    dbg.location(86,5);
                    match(input,28,FOLLOW_28_in_config_statement339); 
                    dbg.location(86,12);
                    match(input,29,FOLLOW_29_in_config_statement341); 
                    dbg.location(86,19);
                    pushFollow(FOLLOW_role_in_config_statement343);
                    role();
                    _fsp--;


                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:87:5: 'apply' 'policy' var= object_name
                    {
                    dbg.location(87,5);
                    match(input,26,FOLLOW_26_in_config_statement349); 
                    dbg.location(87,13);
                    match(input,30,FOLLOW_30_in_config_statement351); 
                    dbg.location(87,25);
                    pushFollow(FOLLOW_object_name_in_config_statement355);
                    var=object_name();
                    _fsp--;

                    dbg.location(88,3);
                    
                     	  Policy p = (Policy) currentScope.lookup(input.toString(var.start,var.stop));
                     	 if(p!=null)
                     	 {
                     	  String command = "/sbin/iptables";
                     	 String verd = null;
                     	 if(p.verdict.equals("allow"))
                     	  {
                     	    verd = "ACCEPT";
                     	    }
                     	  if(p.verdict.equals(" deny "))
                     	  {
                     	    verd = "DROP";
                     	    }  
                     	   if( verd == null)
                     	      { 
                     	      System.out.println("verdict is null");
                     	      }
                     	 String arg = "  -I INPUT -p "+p.protocol+" -s " + p.ipAddress.getString()+"/"+p.netMask.getString() +"  --source-port " +p.sourcePort+" -j " +verd;
                     	  System.out.println(command+arg);
                     	  
                     	 }
                     	 else  { System.out.println(" p is null");}
                     	

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:112:5: 'apply' 'policy' p2= policy
                    {
                    dbg.location(112,5);
                    match(input,26,FOLLOW_26_in_config_statement365); 
                    dbg.location(112,13);
                    match(input,30,FOLLOW_30_in_config_statement367); 
                    dbg.location(112,24);
                    pushFollow(FOLLOW_policy_in_config_statement371);
                    p2=policy();
                    _fsp--;

                    dbg.location(113,2);
                    
                    	Policy p=(Policy)p2.lookupValue();
                    	//System.out.println(p.verdict);
                    	 String command = "/sbin/iptables";
                     	 String verd = null;
                     	 if(p.verdict.equals("allow"))
                     	  {
                     	    verd = "ACCEPT";
                     	    }
                     	  if(p.verdict.equals(" deny "))
                     	  {
                     	    verd = "DROP";
                     	    }  
                     	   if( verd == null)
                     	      { 
                     	      System.out.println("verdict is null");
                     	      }
                     	 String arg = "  -I INPUT -p "+p.protocol+" -s " + p.ipAddress.getString()+"/"+p.netMask.getString() +"  --source-port " +p.sourcePort+" -j " +verd;
                     	  System.out.println(command+arg);
                     	  
                     	 
                    	
                    	

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:136:5: 'undo' 'policy' object_name
                    {
                    dbg.location(136,5);
                    match(input,28,FOLLOW_28_in_config_statement380); 
                    dbg.location(136,12);
                    match(input,30,FOLLOW_30_in_config_statement382); 
                    dbg.location(136,21);
                    pushFollow(FOLLOW_object_name_in_config_statement384);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:137:5: 'undo' 'policy' policy
                    {
                    dbg.location(137,5);
                    match(input,28,FOLLOW_28_in_config_statement390); 
                    dbg.location(137,12);
                    match(input,30,FOLLOW_30_in_config_statement392); 
                    dbg.location(137,21);
                    pushFollow(FOLLOW_policy_in_config_statement394);
                    policy();
                    _fsp--;


                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:138:5: set_oper 'host_group' ( object_name | host_group ) ( object_name | host )
                    {
                    dbg.location(138,5);
                    pushFollow(FOLLOW_set_oper_in_config_statement400);
                    set_oper();
                    _fsp--;

                    dbg.location(138,14);
                    match(input,31,FOLLOW_31_in_config_statement402); 
                    dbg.location(138,27);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:138:27: ( object_name | host_group )
                    int alt7=2;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ID) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==31) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("138:27: ( object_name | host_group )", 7, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:138:28: object_name
                            {
                            dbg.location(138,28);
                            pushFollow(FOLLOW_object_name_in_config_statement405);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:138:41: host_group
                            {
                            dbg.location(138,41);
                            pushFollow(FOLLOW_host_group_in_config_statement408);
                            host_group();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(138,53);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:138:53: ( object_name | host )
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ID) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==85) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("138:53: ( object_name | host )", 8, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:138:54: object_name
                            {
                            dbg.location(138,54);
                            pushFollow(FOLLOW_object_name_in_config_statement412);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:138:66: host
                            {
                            dbg.location(138,66);
                            pushFollow(FOLLOW_host_in_config_statement414);
                            host();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:140:3: config_display
                    {
                    dbg.location(140,3);
                    pushFollow(FOLLOW_config_display_in_config_statement421);
                    config_display();
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
        dbg.location(141, 3);

        }
        finally {
            dbg.exitRule("config_statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end config_statement


    // $ANTLR start route_oper
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:143:2: route_oper : ( | 'route' 'add' | 'route' 'delete' );
    public final void route_oper() throws RecognitionException {
        try { dbg.enterRule("route_oper");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(143, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:144:3: ( | 'route' 'add' | 'route' 'delete' )
            int alt10=3;
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||(LA10_0>=89 && LA10_0<=90)) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==34) ) {
                    alt10=3;
                }
                else if ( (LA10_2==33) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("143:2: route_oper : ( | 'route' 'add' | 'route' 'delete' );", 10, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("143:2: route_oper : ( | 'route' 'add' | 'route' 'delete' );", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:145:2: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:145:3: 'route' 'add'
                    {
                    dbg.location(145,3);
                    match(input,32,FOLLOW_32_in_route_oper441); 
                    dbg.location(145,11);
                    match(input,33,FOLLOW_33_in_route_oper443); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:146:4: 'route' 'delete'
                    {
                    dbg.location(146,4);
                    match(input,32,FOLLOW_32_in_route_oper448); 
                    dbg.location(146,12);
                    match(input,34,FOLLOW_34_in_route_oper450); 

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
        dbg.location(147, 3);

        }
        finally {
            dbg.exitRule("route_oper");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end route_oper


    // $ANTLR start set_oper
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:149:1: set_oper : ( 'add' 'to' | 'delete' 'from' );
    public final void set_oper() throws RecognitionException {
        try { dbg.enterRule("set_oper");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(149, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:150:2: ( 'add' 'to' | 'delete' 'from' )
            int alt11=2;
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("149:1: set_oper : ( 'add' 'to' | 'delete' 'from' );", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:151:2: 'add' 'to'
                    {
                    dbg.location(151,2);
                    match(input,33,FOLLOW_33_in_set_oper465); 
                    dbg.location(151,8);
                    match(input,35,FOLLOW_35_in_set_oper467); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:152:4: 'delete' 'from'
                    {
                    dbg.location(152,4);
                    match(input,34,FOLLOW_34_in_set_oper472); 
                    dbg.location(152,13);
                    match(input,36,FOLLOW_36_in_set_oper474); 

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
        dbg.location(153, 2);

        }
        finally {
            dbg.exitRule("set_oper");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end set_oper


    // $ANTLR start config_display
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:155:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );
    public final void config_display() throws RecognitionException {
        try { dbg.enterRule("config_display");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(155, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:156:3: ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' )
            int alt12=4;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==37) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==38) ) {
                        alt12=1;
                    }
                    else if ( (LA12_3==24) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("155:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("155:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA12_0==39) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==37) ) {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4==38) ) {
                        alt12=3;
                    }
                    else if ( (LA12_4==24) ) {
                        alt12=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("155:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("155:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("155:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:157:4: 'route' 'show' 'numeric'
                    {
                    dbg.location(157,4);
                    match(input,32,FOLLOW_32_in_config_display493); 
                    dbg.location(157,12);
                    match(input,37,FOLLOW_37_in_config_display495); 
                    dbg.location(157,19);
                    match(input,38,FOLLOW_38_in_config_display497); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:158:4: 'route' 'show'
                    {
                    dbg.location(158,4);
                    match(input,32,FOLLOW_32_in_config_display502); 
                    dbg.location(158,12);
                    match(input,37,FOLLOW_37_in_config_display504); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:159:4: 'fw' 'show' 'numeric'
                    {
                    dbg.location(159,4);
                    match(input,39,FOLLOW_39_in_config_display510); 
                    dbg.location(159,9);
                    match(input,37,FOLLOW_37_in_config_display512); 
                    dbg.location(159,16);
                    match(input,38,FOLLOW_38_in_config_display514); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:160:3: 'fw' 'show'
                    {
                    dbg.location(160,3);
                    match(input,39,FOLLOW_39_in_config_display518); 
                    dbg.location(160,8);
                    match(input,37,FOLLOW_37_in_config_display520); 

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
        dbg.location(161, 2);

        }
        finally {
            dbg.exitRule("config_display");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end config_display


    // $ANTLR start condition_statement
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:165:2: condition_statement : 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' ;
    public final void condition_statement() throws RecognitionException {
        try { dbg.enterRule("condition_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(165, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:166:3: ( 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:166:5: 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif'
            {
            dbg.location(166,5);
            match(input,40,FOLLOW_40_in_condition_statement542); 
            dbg.location(166,10);
            match(input,41,FOLLOW_41_in_condition_statement544); 
            dbg.location(166,14);
            pushFollow(FOLLOW_equality_expr_in_condition_statement546);
            equality_expr();
            _fsp--;

            dbg.location(166,28);
            match(input,42,FOLLOW_42_in_condition_statement548); 
            dbg.location(166,32);
            pushFollow(FOLLOW_statement_list_in_condition_statement550);
            statement_list();
            _fsp--;

            dbg.location(166,47);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:166:47: ( 'else' statement_list )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:166:48: 'else' statement_list
                    {
                    dbg.location(166,48);
                    match(input,43,FOLLOW_43_in_condition_statement553); 
                    dbg.location(166,55);
                    pushFollow(FOLLOW_statement_list_in_condition_statement555);
                    statement_list();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(166,72);
            match(input,44,FOLLOW_44_in_condition_statement559); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(167, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:169:2: iteration_statement : 'while' '(' equality_expr ')' statement_list 'endwhile' ;
    public final void iteration_statement() throws RecognitionException {
        try { dbg.enterRule("iteration_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(169, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:170:3: ( 'while' '(' equality_expr ')' statement_list 'endwhile' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:170:5: 'while' '(' equality_expr ')' statement_list 'endwhile'
            {
            dbg.location(170,5);
            match(input,45,FOLLOW_45_in_iteration_statement575); 
            dbg.location(170,13);
            match(input,41,FOLLOW_41_in_iteration_statement577); 
            dbg.location(170,17);
            pushFollow(FOLLOW_equality_expr_in_iteration_statement579);
            equality_expr();
            _fsp--;

            dbg.location(170,31);
            match(input,42,FOLLOW_42_in_iteration_statement581); 
            dbg.location(170,35);
            pushFollow(FOLLOW_statement_list_in_iteration_statement583);
            statement_list();
            _fsp--;

            dbg.location(170,50);
            match(input,46,FOLLOW_46_in_iteration_statement585); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(171, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:173:2: print_statement : 'echo' STRING ';' ;
    public final void print_statement() throws RecognitionException {
        Token STRING1=null;

        try { dbg.enterRule("print_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(173, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:174:3: ( 'echo' STRING ';' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:174:5: 'echo' STRING ';'
            {
            dbg.location(174,5);
            match(input,47,FOLLOW_47_in_print_statement601); 
            dbg.location(174,12);
            STRING1=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement603); 
            dbg.location(174,20);
            System.out.println(STRING1);
            dbg.location(174,50);
            match(input,24,FOLLOW_24_in_print_statement607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(175, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:177:2: expression : assignment_expr ;
    public final void expression() throws RecognitionException {
        try { dbg.enterRule("expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(177, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:178:3: ( assignment_expr )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:178:5: assignment_expr
            {
            dbg.location(178,5);
            pushFollow(FOLLOW_assignment_expr_in_expression623);
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
        dbg.location(179, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:181:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );
    public final void assignment_expr() throws RecognitionException {
        object_name_return var = null;

        assignment_operator_return op = null;

        Symbol e = null;


        try { dbg.enterRule("assignment_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(181, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:182:4: (var= object_name op= assignment_operator assignment_expr | e= conditional_expr )
            int alt14=2;
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EQUAL||(LA14_1>=61 && LA14_1<=64)) ) {
                    alt14=1;
                }
                else if ( ((LA14_1>=PLUS && LA14_1<=DIV)||LA14_1==DOT||LA14_1==24||LA14_1==42||(LA14_1>=48 && LA14_1<=59)) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("181:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 14, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA14_0==NUMBER||LA14_0==STRING||LA14_0==CHAR||LA14_0==29||LA14_0==31||LA14_0==41||LA14_0==60||(LA14_0>=79 && LA14_0<=80)||(LA14_0>=85 && LA14_0<=86)||(LA14_0>=89 && LA14_0<=91)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("181:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:182:7: var= object_name op= assignment_operator assignment_expr
                    {
                    dbg.location(182,10);
                    pushFollow(FOLLOW_object_name_in_assignment_expr644);
                    var=object_name();
                    _fsp--;

                    dbg.location(182,25);
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr648);
                    op=assignment_operator();
                    _fsp--;

                    dbg.location(183,4);
                    
                    	 		Symbol s = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			Assignment ans = new Assignment(s, input.toString(op.start,op.stop));
                    			map.put(input.toString(var.start,var.stop), ans);
                    			System.out.println("here");
                    		//	currentScope.printSymbols();
                    	 	
                    dbg.location(190,4);
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr659);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:192:6: e= conditional_expr
                    {
                    dbg.location(192,7);
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr672);
                    e=conditional_expr();
                    _fsp--;

                    dbg.location(193,4);
                    
                     			//Put these values in assignment map
                     			//System.out.println("Cond expr: " + e);
                     			//Policy p;
                     			Set entries = map.entrySet();
                    			Iterator iter = entries.iterator();
                    			//p = (Policy)( e );
                    			//System.out.println(e.getString());
                    			//System.out.println("Symbol Val: " + e.pol[0]);
                    			while(iter.hasNext() && e != null)
                    			{
                    				Map.Entry entry = (Map.Entry)iter.next();
                    				String key = (String)entry.getKey();
                    				System.out.println(" going to search for symbol with name : "+key);
                    				Symbol s = new Symbol(key, e.getType(), e.lookupValue());
                    				//System.out.println(s.getString());
                    				//-- COMMENT: Somehow this statement is not reflecting a change in the symbol value
                    				if (currentScope.setSymbolValue(key, s) == -1)	
                    				    {
                    				     System.out.println(" problem setting symbol : ");
                    				    }
                    				
                    				System.out.println("Symbol table:  " + s.getName()+" "+ s.getType() + " " + s.getString());
                    				
                    				
                    				//Interface t = (Interface)currentScope.lookup("i");
                    			// 	Interface u = (Interface)currentScope.lookup("j");
                    			 	//Interface v = (Interface)currentScope.lookup("k");
                    			 	
                    			 	//if( t == null){
                    				// System.out.println("NULL");}
                    				 
                    			//	 if( u == null){
                    			//	 System.out.println("NULL");}
                    				 
                    				// if( v == null){
                    				// System.out.println("NULL");}
                    				
                    				//if(t != null){ 
                    			//	System.out.println(" "+t.getString());
                    			//	}
                    			//	if(u != null){ 
                    			//	System.out.println(" "+u.getString());
                    			//	}
                    			//	if(v != null){ 
                    			//	System.out.println(" "+v.getString());
                    			//	}
                    				//System.out.println(" current symbol table");				
                    			//	currentScope.printSymbols();
                    			}
                    		//	currentScope.printSymbols();
                     		

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
        dbg.location(246, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:250:2: conditional_expr returns [Symbol sym] : e= logicalOR_expr ( '?' expression ':' conditional_expr )? ;
    public final Symbol conditional_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("conditional_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(250, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:251:3: (e= logicalOR_expr ( '?' expression ':' conditional_expr )? )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:251:5: e= logicalOR_expr ( '?' expression ':' conditional_expr )?
            {
            dbg.location(251,6);
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr706);
            e=logicalOR_expr();
            _fsp--;

            dbg.location(251,22);
             sym = e;
            dbg.location(252,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:252:3: ( '?' expression ':' conditional_expr )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:252:5: '?' expression ':' conditional_expr
                    {
                    dbg.location(252,5);
                    match(input,48,FOLLOW_48_in_conditional_expr714); 
                    dbg.location(252,9);
                    pushFollow(FOLLOW_expression_in_conditional_expr716);
                    expression();
                    _fsp--;

                    dbg.location(252,20);
                    match(input,49,FOLLOW_49_in_conditional_expr718); 
                    dbg.location(252,24);
                    pushFollow(FOLLOW_conditional_expr_in_conditional_expr720);
                    conditional_expr();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(253, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:255:2: logicalOR_expr returns [Symbol sym] : e= logicalAND_expr ( '||' logicalAND_expr )* ;
    public final Symbol logicalOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("logicalOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(255, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:256:3: (e= logicalAND_expr ( '||' logicalAND_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:256:5: e= logicalAND_expr ( '||' logicalAND_expr )*
            {
            dbg.location(256,6);
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr744);
            e=logicalAND_expr();
            _fsp--;

            dbg.location(256,24);
             sym = e;
            dbg.location(257,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:257:3: ( '||' logicalAND_expr )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==50) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:257:4: '||' logicalAND_expr
            	    {
            	    dbg.location(257,4);
            	    match(input,50,FOLLOW_50_in_logicalOR_expr752); 
            	    dbg.location(257,9);
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr754);
            	    logicalAND_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(258, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:260:2: logicalAND_expr returns [Symbol sym] : e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* ;
    public final Symbol logicalAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("logicalAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(260, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:261:3: (e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:261:5: e= bitwiseOR_expr ( '&&' bitwiseOR_expr )*
            {
            dbg.location(261,6);
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr777);
            e=bitwiseOR_expr();
            _fsp--;

            dbg.location(261,23);
             sym = e;
            dbg.location(262,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:262:3: ( '&&' bitwiseOR_expr )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==51) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:262:4: '&&' bitwiseOR_expr
            	    {
            	    dbg.location(262,4);
            	    match(input,51,FOLLOW_51_in_logicalAND_expr785); 
            	    dbg.location(262,9);
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr787);
            	    bitwiseOR_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(263, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:265:2: bitwiseOR_expr returns [Symbol sym] : e= bitwiseAND_expr ( '|' bitwiseAND_expr )* ;
    public final Symbol bitwiseOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("bitwiseOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(265, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:266:3: (e= bitwiseAND_expr ( '|' bitwiseAND_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:266:5: e= bitwiseAND_expr ( '|' bitwiseAND_expr )*
            {
            dbg.location(266,6);
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr811);
            e=bitwiseAND_expr();
            _fsp--;

            dbg.location(266,24);
             sym = e;
            dbg.location(267,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:267:3: ( '|' bitwiseAND_expr )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==52) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:267:4: '|' bitwiseAND_expr
            	    {
            	    dbg.location(267,4);
            	    match(input,52,FOLLOW_52_in_bitwiseOR_expr819); 
            	    dbg.location(267,8);
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr821);
            	    bitwiseAND_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(268, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:270:2: bitwiseAND_expr returns [Symbol sym] : e= equality_expr ( '&' equality_expr )* ;
    public final Symbol bitwiseAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("bitwiseAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(270, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:271:3: (e= equality_expr ( '&' equality_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:271:5: e= equality_expr ( '&' equality_expr )*
            {
            dbg.location(271,6);
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr844);
            e=equality_expr();
            _fsp--;

            dbg.location(271,22);
             sym = e;
            dbg.location(272,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:272:3: ( '&' equality_expr )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==53) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:272:4: '&' equality_expr
            	    {
            	    dbg.location(272,4);
            	    match(input,53,FOLLOW_53_in_bitwiseAND_expr852); 
            	    dbg.location(272,8);
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr854);
            	    equality_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(273, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:275:2: equality_expr returns [Symbol sym] : e= relational_expr ( ( '==' | '!=' ) relational_expr )* ;
    public final Symbol equality_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("equality_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(275, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:276:3: (e= relational_expr ( ( '==' | '!=' ) relational_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:276:5: e= relational_expr ( ( '==' | '!=' ) relational_expr )*
            {
            dbg.location(276,6);
            pushFollow(FOLLOW_relational_expr_in_equality_expr879);
            e=relational_expr();
            _fsp--;

            dbg.location(276,24);
             sym = e;
            dbg.location(277,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:277:3: ( ( '==' | '!=' ) relational_expr )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=54 && LA20_0<=55)) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:277:5: ( '==' | '!=' ) relational_expr
            	    {
            	    dbg.location(277,5);
            	    if ( (input.LA(1)>=54 && input.LA(1)<=55) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr888);    throw mse;
            	    }

            	    dbg.location(277,19);
            	    pushFollow(FOLLOW_relational_expr_in_equality_expr896);
            	    relational_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(278, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:280:2: relational_expr returns [Symbol sym] : e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* ;
    public final Symbol relational_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("relational_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(280, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:281:3: (e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:281:5: e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )*
            {
            dbg.location(281,6);
            pushFollow(FOLLOW_expr_in_relational_expr920);
            e=expr();
            _fsp--;

            dbg.location(281,15);
             sym = e;
            dbg.location(282,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:282:3: ( ( '<' | '>' | '<=' | '>=' ) expr )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=56 && LA21_0<=59)) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:282:5: ( '<' | '>' | '<=' | '>=' ) expr
            	    {
            	    dbg.location(282,5);
            	    if ( (input.LA(1)>=56 && input.LA(1)<=59) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr931);    throw mse;
            	    }

            	    dbg.location(282,25);
            	    pushFollow(FOLLOW_expr_in_relational_expr941);
            	    expr();
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
        dbg.location(283, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:286:2: expr returns [Symbol sym] : e= term ( ( PLUS | MINUS ) term )* ;
    public final Symbol expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(286, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:287:3: (e= term ( ( PLUS | MINUS ) term )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:287:5: e= term ( ( PLUS | MINUS ) term )*
            {
            dbg.location(287,6);
            pushFollow(FOLLOW_term_in_expr967);
            e=term();
            _fsp--;

            dbg.location(287,15);
            sym = e;
            dbg.location(288,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:288:3: ( ( PLUS | MINUS ) term )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=PLUS && LA22_0<=MINUS)) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:288:5: ( PLUS | MINUS ) term
            	    {
            	    dbg.location(288,5);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr978);    throw mse;
            	    }

            	    dbg.location(288,23);
            	    pushFollow(FOLLOW_term_in_expr989);
            	    term();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(289, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:291:2: term returns [Symbol sym] : e= unary_expr ( ( MULT | DIV ) unary_expr )* ;
    public final Symbol term() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("term");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(291, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:292:3: (e= unary_expr ( ( MULT | DIV ) unary_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:292:5: e= unary_expr ( ( MULT | DIV ) unary_expr )*
            {
            dbg.location(292,6);
            pushFollow(FOLLOW_unary_expr_in_term1015);
            e=unary_expr();
            _fsp--;

            dbg.location(292,21);
            sym = e;
            dbg.location(293,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:293:3: ( ( MULT | DIV ) unary_expr )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=MULT && LA23_0<=DIV)) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:293:5: ( MULT | DIV ) unary_expr
            	    {
            	    dbg.location(293,5);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term1026);    throw mse;
            	    }

            	    dbg.location(293,20);
            	    pushFollow(FOLLOW_unary_expr_in_term1036);
            	    unary_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(294, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:296:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );
    public final Symbol unary_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("unary_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(296, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:297:3: (e= postfix_expression | '~' unary_expr )
            int alt24=2;
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==NUMBER||(LA24_0>=STRING && LA24_0<=ID)||LA24_0==CHAR||LA24_0==29||LA24_0==31||LA24_0==41||(LA24_0>=79 && LA24_0<=80)||(LA24_0>=85 && LA24_0<=86)||(LA24_0>=89 && LA24_0<=91)) ) {
                alt24=1;
            }
            else if ( (LA24_0==60) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("296:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:297:5: e= postfix_expression
                    {
                    dbg.location(297,6);
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr1062);
                    e=postfix_expression();
                    _fsp--;

                    dbg.location(297,26);
                    sym = e;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:298:5: '~' unary_expr
                    {
                    dbg.location(298,5);
                    match(input,60,FOLLOW_60_in_unary_expr1070); 
                    dbg.location(298,9);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr1072);
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
        dbg.location(301, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:303:2: postfix_expression returns [Symbol sym] : e= factor ( '.' ID )* ;
    public final Symbol postfix_expression() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("postfix_expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(303, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:304:3: (e= factor ( '.' ID )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:304:5: e= factor ( '.' ID )*
            {
            dbg.location(304,6);
            pushFollow(FOLLOW_factor_in_postfix_expression1099);
            e=factor();
            _fsp--;

            dbg.location(304,14);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:304:14: ( '.' ID )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==DOT) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:304:15: '.' ID
            	    {
            	    dbg.location(304,15);
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression1102); 
            	    dbg.location(304,18);
            	    match(input,ID,FOLLOW_ID_in_postfix_expression1103); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}

            dbg.location(304,24);
            sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(305, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:307:2: assignment_operator : ( '=' | '*=' | '/=' | '+=' | '-=' );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("assignment_operator");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(307, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:308:3: ( '=' | '*=' | '/=' | '+=' | '-=' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(308,3);
            if ( input.LA(1)==EQUAL||(input.LA(1)>=61 && input.LA(1)<=64) ) {
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
        dbg.location(313, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:315:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );
    public final Symbol factor() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("factor");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(315, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:317:2: ( ID | e= literal | '(' expression ')' )
            int alt26=3;
            try { dbg.enterDecision(26);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt26=1;
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 29:
            case 31:
            case 79:
            case 80:
            case 85:
            case 86:
            case 89:
            case 90:
            case 91:
                {
                alt26=2;
                }
                break;
            case 41:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("315:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:317:4: ID
                    {
                    dbg.location(317,4);
                    match(input,ID,FOLLOW_ID_in_factor1166); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:318:5: e= literal
                    {
                    dbg.location(318,6);
                    pushFollow(FOLLOW_literal_in_factor1174);
                    e=literal();
                    _fsp--;

                    dbg.location(318,16);
                    sym = e;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:319:5: '(' expression ')'
                    {
                    dbg.location(319,5);
                    match(input,41,FOLLOW_41_in_factor1183); 
                    dbg.location(319,9);
                    pushFollow(FOLLOW_expression_in_factor1185);
                    expression();
                    _fsp--;

                    dbg.location(319,20);
                    match(input,42,FOLLOW_42_in_factor1187); 

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
        dbg.location(320, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:322:2: literal returns [Symbol sym] : e= object_values ;
    public final Symbol literal() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("literal");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(322, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:323:3: (e= object_values )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:323:5: e= object_values
            {
            dbg.location(323,6);
            pushFollow(FOLLOW_object_values_in_literal1209);
            e=object_values();
            _fsp--;

            dbg.location(323,21);
            sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(324, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:326:1: declr_stmt : type_name var_name= object_name ( COMMA next_var= object_name )* ';' ;
    public final void declr_stmt() throws RecognitionException {
        object_name_return var_name = null;

        object_name_return next_var = null;

        type_name_return type_name2 = null;


        try { dbg.enterRule("declr_stmt");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(326, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:327:2: ( type_name var_name= object_name ( COMMA next_var= object_name )* ';' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:328:2: type_name var_name= object_name ( COMMA next_var= object_name )* ';'
            {
            dbg.location(328,2);
            int count_com = 0;
            dbg.location(329,2);
            pushFollow(FOLLOW_type_name_in_declr_stmt1227);
            type_name2=type_name();
            _fsp--;

            dbg.location(329,20);
            pushFollow(FOLLOW_object_name_in_declr_stmt1231);
            var_name=object_name();
            _fsp--;

            dbg.location(330,2);
            
            		System.out.println(" type : " + input.toString(type_name2.start,type_name2.stop) +" var : "+ input.toString(var_name.start,var_name.stop));
            		currentScope.defineSymbol(input.toString(var_name.start,var_name.stop), input.toString(type_name2.start,type_name2.stop));
            	
            dbg.location(334,2);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:334:2: ( COMMA next_var= object_name )*
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

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:334:3: COMMA next_var= object_name
            	    {
            	    dbg.location(334,3);
            	    match(input,COMMA,FOLLOW_COMMA_in_declr_stmt1238); 
            	    dbg.location(334,9);
            	    count_com++;
            	    dbg.location(334,32);
            	    pushFollow(FOLLOW_object_name_in_declr_stmt1244);
            	    next_var=object_name();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}

            dbg.location(335,2);
            
            	//	System.out.println(" commas : "+ count_com);
            		
            		if(count_com > 0)			
                          		 currentScope.defineSymbol(input.toString(next_var.start,next_var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            dbg.location(341,2);
            match(input,24,FOLLOW_24_in_declr_stmt1254); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(342, 3);

        }
        finally {
            dbg.exitRule("declr_stmt");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end declr_stmt

    public static class type_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start type_name
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:347:1: type_name : ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("type_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(347, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:348:2: ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(348,2);
            if ( (input.LA(1)>=65 && input.LA(1)<=75) ) {
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
        dbg.location(359, 2);

        }
        finally {
            dbg.exitRule("type_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end type_name


    // $ANTLR start object_values
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:361:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | interf | route );
    public final Symbol object_values() throws RecognitionException {
        Symbol sym = null;

        Symbol int_value3 = null;

        ip_addr_return ip_addr4 = null;

        Symbol policy5 = null;

        Symbol host6 = null;

        Symbol role7 = null;

        Symbol host_group8 = null;

        Symbol interf9 = null;

        Symbol route10 = null;


        try { dbg.enterRule("object_values");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(361, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:362:2: ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | interf | route )
            int alt28=12;
            try { dbg.enterDecision(28);

            try {
                isCyclicDecision = true;
                alt28 = dfa28.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:362:4: char_value
                    {
                    dbg.location(362,4);
                    pushFollow(FOLLOW_char_value_in_object_values1350);
                    char_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:363:4: int_value
                    {
                    dbg.location(363,4);
                    pushFollow(FOLLOW_int_value_in_object_values1355);
                    int_value3=int_value();
                    _fsp--;

                    dbg.location(364,2);
                     
                    		sym = int_value3;
                    	

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:367:4: STRING
                    {
                    dbg.location(367,4);
                    match(input,STRING,FOLLOW_STRING_in_object_values1364); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:368:4: ip_addr
                    {
                    dbg.location(368,4);
                    pushFollow(FOLLOW_ip_addr_in_object_values1369);
                    ip_addr4=ip_addr();
                    _fsp--;

                    dbg.location(369,2);
                    
                    	  sym = ip_addr4.sym;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:372:4: policy
                    {
                    dbg.location(372,4);
                    pushFollow(FOLLOW_policy_in_object_values1377);
                    policy5=policy();
                    _fsp--;

                    dbg.location(372,13);
                     sym = policy5;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:373:4: host
                    {
                    dbg.location(373,4);
                    pushFollow(FOLLOW_host_in_object_values1386);
                    host6=host();
                    _fsp--;

                    dbg.location(373,11);
                    
                    	sym = host6 ; 
                    	

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:376:4: role
                    {
                    dbg.location(376,4);
                    pushFollow(FOLLOW_role_in_object_values1395);
                    role7=role();
                    _fsp--;

                    dbg.location(376,9);
                    sym =role7;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:377:4: host_group
                    {
                    dbg.location(377,4);
                    pushFollow(FOLLOW_host_group_in_object_values1403);
                    host_group8=host_group();
                    _fsp--;

                    dbg.location(377,15);
                     sym = host_group8;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:378:4: topology
                    {
                    dbg.location(378,4);
                    pushFollow(FOLLOW_topology_in_object_values1411);
                    topology();
                    _fsp--;


                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:379:4: serv_group
                    {
                    dbg.location(379,4);
                    pushFollow(FOLLOW_serv_group_in_object_values1416);
                    serv_group();
                    _fsp--;


                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:380:4: interf
                    {
                    dbg.location(380,4);
                    pushFollow(FOLLOW_interf_in_object_values1421);
                    interf9=interf();
                    _fsp--;

                    dbg.location(380,11);
                     sym = interf9;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:381:4: route
                    {
                    dbg.location(381,4);
                    pushFollow(FOLLOW_route_in_object_values1428);
                    route10=route();
                    _fsp--;

                    dbg.location(381,10);
                    sym = route10;

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
        dbg.location(383, 2);

        }
        finally {
            dbg.exitRule("object_values");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end object_values


    // $ANTLR start role
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:387:1: role returns [Symbol sym] : 'role' '{' ( (p_i= policy ) | (var= object_name ) ) ( COMMA ( (p_j= policy ) | (var2= object_name ) ) )* '}' ;
    public final Symbol role() throws RecognitionException {
        Symbol sym = null;

        Symbol p_i = null;

        object_name_return var = null;

        Symbol p_j = null;

        object_name_return var2 = null;


        try { dbg.enterRule("role");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(387, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:387:27: ( 'role' '{' ( (p_i= policy ) | (var= object_name ) ) ( COMMA ( (p_j= policy ) | (var2= object_name ) ) )* '}' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:388:2: 'role' '{' ( (p_i= policy ) | (var= object_name ) ) ( COMMA ( (p_j= policy ) | (var2= object_name ) ) )* '}'
            {
            dbg.location(388,2);
             
            	      Vector <Policy> policies;
            	      policies = new Vector <Policy>() ;	     
            	 
            dbg.location(392,2);
            match(input,29,FOLLOW_29_in_role1453); 
            dbg.location(392,9);
            match(input,76,FOLLOW_76_in_role1455); 
            dbg.location(392,13);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:392:13: ( (p_i= policy ) | (var= object_name ) )
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=79 && LA29_0<=80)) ) {
                alt29=1;
            }
            else if ( (LA29_0==ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("392:13: ( (p_i= policy ) | (var= object_name ) )", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:392:14: (p_i= policy )
                    {
                    dbg.location(392,14);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:392:14: (p_i= policy )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:392:15: p_i= policy
                    {
                    dbg.location(392,18);
                    pushFollow(FOLLOW_policy_in_role1461);
                    p_i=policy();
                    _fsp--;

                    dbg.location(392,26);
                    policies.add((Policy)p_i.lookupValue());

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:392:70: (var= object_name )
                    {
                    dbg.location(392,70);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:392:70: (var= object_name )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:392:71: var= object_name
                    {
                    dbg.location(392,74);
                    pushFollow(FOLLOW_object_name_in_role1469);
                    var=object_name();
                    _fsp--;

                    dbg.location(392,86);
                    
                    		  Symbol s2 = currentScope.getSymbol(input.toString(var.start,var.stop));
                    		  String st=s2.getType();
                    		  try{
                    		  if((st.equals("policy_type_t")!=true)){
                    		  throw(new DataFormatException("rule:role"));
                    	//	  System.out.println("added"+p3.verdict);
                    		  }}catch(DataFormatException dfe)
                    		  {
                    		  System.out.println(dfe);
                    		  }
                    		  Policy p3=(Policy)s2.lookupValue();
                    		  policies.add(p3);
                    		  System.out.println("Daaldiya");
                    		  

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}

            dbg.location(409,6);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:6: ( COMMA ( (p_j= policy ) | (var2= object_name ) ) )*
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=2;
                try { dbg.enterDecision(31);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==COMMA) ) {
                    alt31=1;
                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:7: COMMA ( (p_j= policy ) | (var2= object_name ) )
            	    {
            	    dbg.location(409,7);
            	    match(input,COMMA,FOLLOW_COMMA_in_role1488); 
            	    dbg.location(409,13);
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:13: ( (p_j= policy ) | (var2= object_name ) )
            	    int alt30=2;
            	    try { dbg.enterSubRule(30);
            	    try { dbg.enterDecision(30);

            	    int LA30_0 = input.LA(1);

            	    if ( ((LA30_0>=79 && LA30_0<=80)) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==ID) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("409:13: ( (p_j= policy ) | (var2= object_name ) )", 30, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(30);}

            	    switch (alt30) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:14: (p_j= policy )
            	            {
            	            dbg.location(409,14);
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:14: (p_j= policy )
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:15: p_j= policy
            	            {
            	            dbg.location(409,18);
            	            pushFollow(FOLLOW_policy_in_role1494);
            	            p_j=policy();
            	            _fsp--;

            	            dbg.location(409,26);
            	            policies.add((Policy)p_j.lookupValue());

            	            }


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:70: (var2= object_name )
            	            {
            	            dbg.location(409,70);
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:70: (var2= object_name )
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:71: var2= object_name
            	            {
            	            dbg.location(409,75);
            	            pushFollow(FOLLOW_object_name_in_role1502);
            	            var2=object_name();
            	            _fsp--;

            	            dbg.location(410,6);
            	            
            	            		   Symbol s3 = currentScope.getSymbol(input.toString(var2.start,var2.stop));
            	            		  String st=s3.getType();
            	            		  try{
            	            		  if((st.equals("policy_type_t")!=true)){
            	            		  throw(new DataFormatException("rule:role"));
            	            	//	  System.out.println("added"+p3.verdict);
            	            		  }}catch(DataFormatException dfe)
            	            		  {
            	            		  System.out.println(dfe);
            	            		  }
            	            		  Policy p4=(Policy)s3.lookupValue();
            	            		  policies.add(p4);
            	            		  System.out.println("Daaldiya");
            	            		   
            	            		   

            	            }


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(30);}


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);
            } finally {dbg.exitSubRule(31);}

            dbg.location(425,13);
            match(input,77,FOLLOW_77_in_role1516); 
            dbg.location(426,2);
            
            	Role role = new Role (policies);
            	Symbol s = new Symbol ("role_group_type_t","role_group_type_t",role);
            	sym = s;  		
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(432, 2);

        }
        finally {
            dbg.exitRule("role");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end role


    // $ANTLR start policy
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:435:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) );
    public final Symbol policy() throws RecognitionException {
        Symbol sym = null;

        direction_return dir = null;

        verdict_return verd = null;

        proto_return protocol = null;

        ip_addr_return src_ip = null;

        object_name_return ip_obj = null;

        ip_addr_return netmask_ip = null;

        object_name_return netmask_ip_obj = null;

        port_return sport = null;

        icmp_cntrl_message_return icmp_mesg = null;

        ip_addr_return src_netmask = null;


        try { dbg.enterRule("policy");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(435, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:435:29: (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) )
            int alt37=2;
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=79 && LA37_0<=80)) ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1>=81 && LA37_1<=82)) ) {
                    int LA37_2 = input.LA(3);

                    if ( ((LA37_2>=83 && LA37_2<=84)) ) {
                        alt37=1;
                    }
                    else if ( (LA37_2==ICMP_MESSAGE_TYPE) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("435:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) );", 37, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("435:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) );", 37, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("435:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) );", 37, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:436:4: dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )?
                    {
                    dbg.location(436,4);
                    int src_port = 0;
                      	 boolean ip_object_used , netmask_object_used ;
                      	 ip_object_used = false;
                      	 netmask_object_used = false;
                      	
                    dbg.location(441,7);
                    pushFollow(FOLLOW_direction_in_policy1547);
                    dir=direction();
                    _fsp--;

                    dbg.location(441,22);
                    pushFollow(FOLLOW_verdict_in_policy1551);
                    verd=verdict();
                    _fsp--;

                    dbg.location(441,39);
                    pushFollow(FOLLOW_proto_in_policy1555);
                    protocol=proto();
                    _fsp--;

                    dbg.location(441,46);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:441:46: (src_ip= ip_addr | (ip_obj= object_name ) )
                    int alt32=2;
                    try { dbg.enterSubRule(32);
                    try { dbg.enterDecision(32);

                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==NUMBER) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==ID) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("441:46: (src_ip= ip_addr | (ip_obj= object_name ) )", 32, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(32);}

                    switch (alt32) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:441:47: src_ip= ip_addr
                            {
                            dbg.location(441,53);
                            pushFollow(FOLLOW_ip_addr_in_policy1560);
                            src_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:441:62: (ip_obj= object_name )
                            {
                            dbg.location(441,62);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:441:62: (ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:441:63: ip_obj= object_name
                            {
                            dbg.location(441,69);
                            pushFollow(FOLLOW_object_name_in_policy1565);
                            ip_obj=object_name();
                            _fsp--;

                            dbg.location(441,82);
                            System.out.println(" object name:"+input.toString(ip_obj.start,ip_obj.stop));ip_object_used = true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(32);}

                    dbg.location(442,5);
                    match(input,78,FOLLOW_78_in_policy1575); 
                    dbg.location(442,15);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:442:15: (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) )
                    int alt33=2;
                    try { dbg.enterSubRule(33);
                    try { dbg.enterDecision(33);

                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==NUMBER) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==ID) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("442:15: (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) )", 33, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(33);}

                    switch (alt33) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:442:16: netmask_ip= ip_addr
                            {
                            dbg.location(442,26);
                            pushFollow(FOLLOW_ip_addr_in_policy1580);
                            netmask_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:442:35: (netmask_ip_obj= object_name )
                            {
                            dbg.location(442,35);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:442:35: (netmask_ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:442:36: netmask_ip_obj= object_name
                            {
                            dbg.location(442,51);
                            pushFollow(FOLLOW_object_name_in_policy1587);
                            netmask_ip_obj=object_name();
                            _fsp--;

                            dbg.location(442,65);
                            netmask_object_used = true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(33);}

                    dbg.location(442,97);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:442:97: (sport= port )?
                    int alt34=2;
                    try { dbg.enterSubRule(34);
                    try { dbg.enterDecision(34);

                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==NUMBER) ) {
                        alt34=1;
                    }
                    } finally {dbg.exitDecision(34);}

                    switch (alt34) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:442:98: sport= port
                            {
                            dbg.location(442,103);
                            pushFollow(FOLLOW_port_in_policy1596);
                            sport=port();
                            _fsp--;

                            dbg.location(442,110);
                            src_port++;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(34);}

                    dbg.location(443,1);
                    
                    	Ipaddress sip =null, snetmask=null;
                    	if(ip_object_used == true && netmask_object_used ==false)
                    	{
                    	  Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	   sip = (Ipaddress) s.lookupValue();
                    	   snetmask = new Ipaddress(input.toString(netmask_ip.start,netmask_ip.stop));
                    	  }
                    	else if (ip_object_used == false  && netmask_object_used ==true)
                    	{
                          	  Symbol s = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
                          	   sip = new Ipaddress (input.toString(src_ip.start,src_ip.stop));
                    	   snetmask = (Ipaddress) s.lookupValue();
                    	}
                    	else if(ip_object_used ==true && netmask_object_used ==true)
                    	{
                    	  Symbol s_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	   sip = (Ipaddress) s_ip.lookupValue();
                      	  Symbol s_nmask = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
                    	   snetmask = (Ipaddress) s_nmask.lookupValue();
                    	}
                    	else{
                    	sip = new Ipaddress(input.toString(src_ip.start,src_ip.stop));
                    	snetmask = new Ipaddress(input.toString(netmask_ip.start,netmask_ip.stop));
                    	}
                    
                    
                    	if(sip != null)
                    	 {
                    	   System.out.println( " source ip for policy :  "+ sip.getString());
                    	   }
                    	 if(snetmask == null)
                    	  {
                    	   System.out.println("XXX");
                    	   }  
                    	 if(snetmask != null)
                    	 {
                    	  System.out.println(" source netmask for policy :"+snetmask.getString());
                    	 }  
                    
                    
                    	Policy pl;
                                              if(src_port>0){
                    	 pl = new Policy(input.toString(dir.start,dir.stop),input.toString(verd.start,verd.stop), input.toString(protocol.start,protocol.stop), sip.getString(),snetmask.getString(),input.toString(sport.start,sport.stop));
                    	}
                    	 else{
                     	  pl = new Policy(input.toString(dir.start,dir.stop),input.toString(verd.start,verd.stop), input.toString(protocol.start,protocol.stop), sip.getString(),snetmask.getString(),"0");		
                     	  }
                     	  
                     	   	  
                                              Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
                    	sym = s;
                    //	currentScope.printSymbols();


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:499:2: dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) )
                    {
                    dbg.location(499,2);
                    int src_port = 0;
                      	 boolean ip_object_used , netmask_object_used ;
                      	 ip_object_used = false;
                      	 netmask_object_used = false;
                      	
                    dbg.location(505,5);
                    pushFollow(FOLLOW_direction_in_policy1623);
                    dir=direction();
                    _fsp--;

                    dbg.location(505,20);
                    pushFollow(FOLLOW_verdict_in_policy1627);
                    verd=verdict();
                    _fsp--;

                    dbg.location(505,38);
                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy1631);
                    icmp_mesg=icmp_cntrl_message();
                    _fsp--;

                    dbg.location(505,59);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:505:59: (src_ip= ip_addr | (ip_obj= object_name ) )
                    int alt35=2;
                    try { dbg.enterSubRule(35);
                    try { dbg.enterDecision(35);

                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==NUMBER) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==ID) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("505:59: (src_ip= ip_addr | (ip_obj= object_name ) )", 35, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(35);}

                    switch (alt35) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:505:60: src_ip= ip_addr
                            {
                            dbg.location(505,66);
                            pushFollow(FOLLOW_ip_addr_in_policy1637);
                            src_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:505:77: (ip_obj= object_name )
                            {
                            dbg.location(505,77);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:505:77: (ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:505:78: ip_obj= object_name
                            {
                            dbg.location(505,84);
                            pushFollow(FOLLOW_object_name_in_policy1644);
                            ip_obj=object_name();
                            _fsp--;

                            dbg.location(505,97);
                            ip_object_used = true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(35);}

                    dbg.location(506,6);
                    match(input,78,FOLLOW_78_in_policy1656); 
                    dbg.location(506,16);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:506:16: (src_netmask= ip_addr | (netmask_ip_obj= object_name ) )
                    int alt36=2;
                    try { dbg.enterSubRule(36);
                    try { dbg.enterDecision(36);

                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NUMBER) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==ID) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("506:16: (src_netmask= ip_addr | (netmask_ip_obj= object_name ) )", 36, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(36);}

                    switch (alt36) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:506:17: src_netmask= ip_addr
                            {
                            dbg.location(506,28);
                            pushFollow(FOLLOW_ip_addr_in_policy1661);
                            src_netmask=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:506:39: (netmask_ip_obj= object_name )
                            {
                            dbg.location(506,39);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:506:39: (netmask_ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:506:40: netmask_ip_obj= object_name
                            {
                            dbg.location(506,56);
                            pushFollow(FOLLOW_object_name_in_policy1671);
                            netmask_ip_obj=object_name();
                            _fsp--;

                            dbg.location(506,70);
                            netmask_object_used = true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(36);}

                    dbg.location(507,2);
                    
                    	
                    //	Policy pl;
                    
                    	Ipaddress sip =null , snetmask=null;
                    	if(ip_object_used == true && netmask_object_used ==false)
                    	{
                    	  Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	   sip = (Ipaddress) s.lookupValue();
                    	  }
                    	else if (ip_object_used == false  && netmask_object_used ==true)
                    	{
                          	  Symbol s = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
                    	   snetmask = (Ipaddress) s.lookupValue();
                    	}
                    	else if(ip_object_used ==true && netmask_object_used ==true)
                    	{
                    	  Symbol s_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	   sip = (Ipaddress) s_ip.lookupValue();
                      	  Symbol s_nmask = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
                    	   snetmask = (Ipaddress) s_nmask.lookupValue();
                    	}
                    	else{
                    	sip = new Ipaddress(input.toString(src_ip.start,src_ip.stop));
                    	snetmask = new Ipaddress(input.toString(netmask_ip.start,netmask_ip.stop));
                    	}
                    
                    	if(sip != null)
                    	 {
                    	   System.out.println( " source ip for policy :  "+ sip.getString());
                    	   }
                    	 if(snetmask != null)
                    	 {
                    	  System.out.println(" source netmask for policy :"+snetmask.getString());
                    	 }  
                    	   
                    	Policy p2 = new Policy(input.toString(dir.start,dir.stop),input.toString(verd.start,verd.stop), input.toString(icmp_mesg.start,icmp_mesg.stop), sip.getString(),snetmask.getString());
                    	
                                              Symbol s = new Symbol("policy_icmp","policy_type_t",p2);
                    	sym = s;
                    //	currentScope.printSymbols();
                    	

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
        dbg.location(565, 2);

        }
        finally {
            dbg.exitRule("policy");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end policy


    // $ANTLR start topology
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:568:1: topology : ( ( host_group )+ role | ( serv_group )+ role );
    public final void topology() throws RecognitionException {
        try { dbg.enterRule("topology");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(568, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:568:9: ( ( host_group )+ role | ( serv_group )+ role )
            int alt40=2;
            try { dbg.enterDecision(40);

            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            else if ( (LA40_0==91) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("568:1: topology : ( ( host_group )+ role | ( serv_group )+ role );", 40, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(40);}

            switch (alt40) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:568:11: ( host_group )+ role
                    {
                    dbg.location(568,11);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:568:11: ( host_group )+
                    int cnt38=0;
                    try { dbg.enterSubRule(38);

                    loop38:
                    do {
                        int alt38=2;
                        try { dbg.enterDecision(38);

                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==31) ) {
                            alt38=1;
                        }


                        } finally {dbg.exitDecision(38);}

                        switch (alt38) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:568:12: host_group
                    	    {
                    	    dbg.location(568,12);
                    	    pushFollow(FOLLOW_host_group_in_topology1693);
                    	    host_group();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt38++;
                    } while (true);
                    } finally {dbg.exitSubRule(38);}

                    dbg.location(568,25);
                    pushFollow(FOLLOW_role_in_topology1697);
                    role();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:569:4: ( serv_group )+ role
                    {
                    dbg.location(569,4);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:569:4: ( serv_group )+
                    int cnt39=0;
                    try { dbg.enterSubRule(39);

                    loop39:
                    do {
                        int alt39=2;
                        try { dbg.enterDecision(39);

                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==91) ) {
                            alt39=1;
                        }


                        } finally {dbg.exitDecision(39);}

                        switch (alt39) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:569:5: serv_group
                    	    {
                    	    dbg.location(569,5);
                    	    pushFollow(FOLLOW_serv_group_in_topology1703);
                    	    serv_group();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt39++;
                    } while (true);
                    } finally {dbg.exitSubRule(39);}

                    dbg.location(569,18);
                    pushFollow(FOLLOW_role_in_topology1707);
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
        dbg.location(570, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:573:1: int_value returns [Symbol sym] : e= NUMBER ;
    public final Symbol int_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try { dbg.enterRule("int_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(573, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:574:2: (e= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:574:4: e= NUMBER
            {
            dbg.location(574,5);
            e=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_int_value1727); 
            dbg.location(575,3);
            
            			Integer v = Integer.parseInt(e.getText());
            			IntType temp = new IntType(v);
            			Symbol s = new Symbol("literal", "int_type_t", temp);
            			sym = s;
            		//	return sym;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(599, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:601:1: char_value : CHAR ;
    public final void char_value() throws RecognitionException {
        try { dbg.enterRule("char_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(601, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:602:2: ( CHAR )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:602:11: CHAR
            {
            dbg.location(602,11);
            match(input,CHAR,FOLLOW_CHAR_in_char_value1752); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(611, 2);

        }
        finally {
            dbg.exitRule("char_value");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end char_value

    public static class direction_return extends ParserRuleReturnScope {
    };

    // $ANTLR start direction
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:614:1: direction : ( 'inbound' | 'outbound' );
    public final direction_return direction() throws RecognitionException {
        direction_return retval = new direction_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("direction");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(614, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:615:2: ( 'inbound' | 'outbound' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(615,2);
            if ( (input.LA(1)>=79 && input.LA(1)<=80) ) {
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

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(617, 2);

        }
        finally {
            dbg.exitRule("direction");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end direction

    public static class verdict_return extends ParserRuleReturnScope {
    };

    // $ANTLR start verdict
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:619:1: verdict : ( 'allow' | 'deny' );
    public final verdict_return verdict() throws RecognitionException {
        verdict_return retval = new verdict_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("verdict");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(619, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:619:9: ( 'allow' | 'deny' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(619,9);
            if ( (input.LA(1)>=81 && input.LA(1)<=82) ) {
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

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(621, 2);

        }
        finally {
            dbg.exitRule("verdict");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end verdict

    public static class proto_return extends ParserRuleReturnScope {
    };

    // $ANTLR start proto
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:623:1: proto : ( 'udp' | 'tcp' );
    public final proto_return proto() throws RecognitionException {
        proto_return retval = new proto_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("proto");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(623, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:623:9: ( 'udp' | 'tcp' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(623,9);
            if ( (input.LA(1)>=83 && input.LA(1)<=84) ) {
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

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(624, 10);

        }
        finally {
            dbg.exitRule("proto");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end proto

    public static class icmp_cntrl_message_return extends ParserRuleReturnScope {
    };

    // $ANTLR start icmp_cntrl_message
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:626:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final icmp_cntrl_message_return icmp_cntrl_message() throws RecognitionException {
        icmp_cntrl_message_return retval = new icmp_cntrl_message_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("icmp_cntrl_message");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(626, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:627:2: ( ICMP_MESSAGE_TYPE )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:627:4: ICMP_MESSAGE_TYPE
            {
            dbg.location(627,4);
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1833); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(628, 2);

        }
        finally {
            dbg.exitRule("icmp_cntrl_message");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end icmp_cntrl_message

    public static class port_return extends ParserRuleReturnScope {
    };

    // $ANTLR start port
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:630:1: port : NUMBER ;
    public final port_return port() throws RecognitionException {
        port_return retval = new port_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(630, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:630:6: ( NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:630:8: NUMBER
            {
            dbg.location(630,8);
            match(input,NUMBER,FOLLOW_NUMBER_in_port1843); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(630, 14);

        }
        finally {
            dbg.exitRule("port");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end port

    public static class object_name_return extends ParserRuleReturnScope {
        public String obj_name;
    };

    // $ANTLR start object_name
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:633:1: object_name returns [String obj_name] : ID ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        Token ID11=null;

        try { dbg.enterRule("object_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(633, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:634:2: ( ID )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:634:5: ID
            {
            dbg.location(634,5);
            ID11=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_object_name1858); 
            dbg.location(635,2);
             retval.obj_name = new String (ID11.getText());
            	   
            	

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(638, 2);

        }
        finally {
            dbg.exitRule("object_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end object_name

    public static class ip_addr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start ip_addr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:1: ip_addr returns [Symbol sym] : (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) ;
    public final ip_addr_return ip_addr() throws RecognitionException {
        ip_addr_return retval = new ip_addr_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token c=null;
        Token d=null;

        try { dbg.enterRule("ip_addr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(662, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:32: ( (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:35: (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER )
            {
            dbg.location(662,35);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:35: (a= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:36: a= NUMBER
            {
            dbg.location(662,37);
            a=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1895); 

            }

            dbg.location(662,45);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1897); 
            dbg.location(662,48);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:48: (b= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:49: b= NUMBER
            {
            dbg.location(662,50);
            b=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1901); 

            }

            dbg.location(662,58);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1903); 
            dbg.location(662,61);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:61: (c= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:62: c= NUMBER
            {
            dbg.location(662,63);
            c=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1907); 

            }

            dbg.location(662,71);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1909); 
            dbg.location(662,74);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:74: (d= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:75: d= NUMBER
            {
            dbg.location(662,76);
            d=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1913); 

            }

            dbg.location(663,2);
            
            			
            		Ipaddress ip = new Ipaddress(a.getText()+"."+b.getText()+"."+c.getText()+"."+d.getText());
            	//	System.out.println (" ip address being sent : "+ip.getString());
            		Symbol s = new Symbol("ip_addr_string", "ipaddr_t", ip);
            		retval.sym = s;
            //		return retval.sym;
            	
            	

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(673, 2);

        }
        finally {
            dbg.exitRule("ip_addr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end ip_addr


    // $ANTLR start nmask
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:678:1: nmask : 'netmask' ip_addr ;
    public final void nmask() throws RecognitionException {
        try { dbg.enterRule("nmask");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(678, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:678:7: ( 'netmask' ip_addr )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:678:9: 'netmask' ip_addr
            {
            dbg.location(678,9);
            match(input,78,FOLLOW_78_in_nmask1933); 
            dbg.location(678,19);
            pushFollow(FOLLOW_ip_addr_in_nmask1935);
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
        dbg.location(678, 26);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:691:1: host returns [Symbol sym] : 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) ;
    public final Symbol host() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return ip_string = null;

        object_name_return ip_obj = null;

        ip_addr_return netmask_string = null;

        object_name_return netmask_ip_obj = null;


        try { dbg.enterRule("host");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(691, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:691:26: ( 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:2: 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            {
            dbg.location(692,2);
            boolean ip_object_used =false, netmask_object_used = false;
            dbg.location(693,3);
            match(input,85,FOLLOW_85_in_host1956); 
            dbg.location(693,13);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:693:13: (ip_string= ip_addr | (ip_obj= object_name ) )
            int alt41=2;
            try { dbg.enterSubRule(41);
            try { dbg.enterDecision(41);

            int LA41_0 = input.LA(1);

            if ( (LA41_0==NUMBER) ) {
                alt41=1;
            }
            else if ( (LA41_0==ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("693:13: (ip_string= ip_addr | (ip_obj= object_name ) )", 41, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:693:14: ip_string= ip_addr
                    {
                    dbg.location(693,23);
                    pushFollow(FOLLOW_ip_addr_in_host1961);
                    ip_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:693:32: (ip_obj= object_name )
                    {
                    dbg.location(693,32);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:693:32: (ip_obj= object_name )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:693:33: ip_obj= object_name
                    {
                    dbg.location(693,39);
                    pushFollow(FOLLOW_object_name_in_host1966);
                    ip_obj=object_name();
                    _fsp--;

                    dbg.location(693,52);
                    ip_object_used=true; System.out.println (" found object name :"+input.toString(ip_obj.start,ip_obj.stop));

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(41);}

            dbg.location(693,136);
            match(input,78,FOLLOW_78_in_host1973); 
            dbg.location(693,146);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:693:146: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            int alt42=2;
            try { dbg.enterSubRule(42);
            try { dbg.enterDecision(42);

            int LA42_0 = input.LA(1);

            if ( (LA42_0==NUMBER) ) {
                alt42=1;
            }
            else if ( (LA42_0==ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("693:146: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )", 42, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(42);}

            switch (alt42) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:693:147: netmask_string= ip_addr
                    {
                    dbg.location(693,161);
                    pushFollow(FOLLOW_ip_addr_in_host1978);
                    netmask_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:694:21: (netmask_ip_obj= object_name )
                    {
                    dbg.location(694,21);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:694:21: (netmask_ip_obj= object_name )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:694:22: netmask_ip_obj= object_name
                    {
                    dbg.location(694,37);
                    pushFollow(FOLLOW_object_name_in_host2008);
                    netmask_ip_obj=object_name();
                    _fsp--;

                    dbg.location(694,51);
                    netmask_object_used = true;

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(42);}

            dbg.location(695,1);
            
            	Host h;
            	if(ip_object_used == true && netmask_object_used ==false)
            	{
            	  Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
            	  Ipaddress ip = (Ipaddress) s.lookupValue();
            	  System.out.println(" >> "+ip.getString());
            	  h = new Host	( ip.getString(),input.toString(netmask_string.start,netmask_string.stop));
            	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            	 sym = s_ret;
            	}
            	else if (ip_object_used == false  && netmask_object_used ==true)
            	{
                  	  Symbol s = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
            	  Ipaddress ip = (Ipaddress) s.lookupValue();
            	  h = new Host	( input.toString(ip_string.start,ip_string.stop),ip.getString());
            	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            	  sym = s_ret;
            	}
            	else if(ip_object_used ==true && netmask_object_used ==true)
            	{
            	  Symbol s_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
            	  Ipaddress ip = (Ipaddress) s_ip.lookupValue();
            	 
              	  Symbol s_nmask = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
            	  Ipaddress nmask = (Ipaddress) s_nmask.lookupValue();
            	 
            	  h = new Host	( ip.getString(),nmask.getString());
            	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            	 sym = s_ret;
            	
            	}
            	else{
            	h = new Host (input.toString(ip_string.start,ip_string.stop),input.toString(netmask_string.start,netmask_string.stop)); //usure about the text error
            	Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            	sym = s_ret;
            	}
            //	return sym;
            


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(738, 2);

        }
        finally {
            dbg.exitRule("host");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end host


    // $ANTLR start dns_set
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:744:1: dns_set : ip_addr ( ',' ip_addr )* ;
    public final void dns_set() throws RecognitionException {
        try { dbg.enterRule("dns_set");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(744, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:744:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:744:11: ip_addr ( ',' ip_addr )*
            {
            dbg.location(744,11);
            pushFollow(FOLLOW_ip_addr_in_dns_set2031);
            ip_addr();
            _fsp--;

            dbg.location(744,19);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:744:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:744:20: ',' ip_addr
            	    {
            	    dbg.location(744,20);
            	    match(input,COMMA,FOLLOW_COMMA_in_dns_set2034); 
            	    dbg.location(744,25);
            	    pushFollow(FOLLOW_ip_addr_in_dns_set2037);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(744, 34);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:746:1: gateway : ip_addr ( ',' ip_addr )* ;
    public final void gateway() throws RecognitionException {
        try { dbg.enterRule("gateway");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(746, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:746:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:746:11: ip_addr ( ',' ip_addr )*
            {
            dbg.location(746,11);
            pushFollow(FOLLOW_ip_addr_in_gateway2047);
            ip_addr();
            _fsp--;

            dbg.location(746,19);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:746:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(44);

            loop44:
            do {
                int alt44=2;
                try { dbg.enterDecision(44);

                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                } finally {dbg.exitDecision(44);}

                switch (alt44) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:746:20: ',' ip_addr
            	    {
            	    dbg.location(746,20);
            	    match(input,COMMA,FOLLOW_COMMA_in_gateway2050); 
            	    dbg.location(746,24);
            	    pushFollow(FOLLOW_ip_addr_in_gateway2052);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);
            } finally {dbg.exitSubRule(44);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(746, 33);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:750:1: host_group returns [Symbol sym] : 'host_group' '{' i= host ( ',' j= host )* '}' ;
    public final Symbol host_group() throws RecognitionException {
        Symbol sym = null;

        Symbol i = null;

        Symbol j = null;


        try { dbg.enterRule("host_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(750, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:751:2: ( 'host_group' '{' i= host ( ',' j= host )* '}' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:752:2: 'host_group' '{' i= host ( ',' j= host )* '}'
            {
            dbg.location(752,2);
            
            	Vector <Host> hosts;
            	hosts = new Vector <Host> ();
            	
            dbg.location(756,2);
            match(input,31,FOLLOW_31_in_host_group2074); 
            dbg.location(756,16);
            match(input,76,FOLLOW_76_in_host_group2077); 
            dbg.location(756,21);
            pushFollow(FOLLOW_host_in_host_group2081);
            i=host();
            _fsp--;

            dbg.location(756,28);
            hosts.add((Host)i.lookupValue()); 
            dbg.location(756,66);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:756:66: ( ',' j= host )*
            try { dbg.enterSubRule(45);

            loop45:
            do {
                int alt45=2;
                try { dbg.enterDecision(45);

                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                } finally {dbg.exitDecision(45);}

                switch (alt45) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:756:67: ',' j= host
            	    {
            	    dbg.location(756,67);
            	    match(input,COMMA,FOLLOW_COMMA_in_host_group2088); 
            	    dbg.location(756,72);
            	    pushFollow(FOLLOW_host_in_host_group2092);
            	    j=host();
            	    _fsp--;

            	    dbg.location(756,78);
            	    hosts.add((Host)j.lookupValue());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);
            } finally {dbg.exitSubRule(45);}

            dbg.location(756,117);
            match(input,77,FOLLOW_77_in_host_group2099); 
            dbg.location(757,2);
            
            	Hostgroup hgroup = new Hostgroup (hosts);
            	Symbol s = new Symbol ("host_group_type_t","host_group_type_t",hgroup);
            	sym = s;  		
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(762, 2);

        }
        finally {
            dbg.exitRule("host_group");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end host_group


    // $ANTLR start interf
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:764:1: interf returns [Symbol sym] : 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' 'gw' gw_ip= ip_addr ;
    public final Symbol interf() throws RecognitionException {
        Symbol sym = null;

        Token interface_name=null;
        ip_addr_return interface_ip = null;

        ip_addr_return interface_netmask = null;

        ip_addr_return i = null;

        ip_addr_return j = null;

        ip_addr_return gw_ip = null;


        try { dbg.enterRule("interf");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(764, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:765:2: ( 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' 'gw' gw_ip= ip_addr )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:765:4: 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' 'gw' gw_ip= ip_addr
            {
            dbg.location(765,4);
             
            	     Vector <Ipaddress> dns_ip;
            	       dns_ip = new Vector <Ipaddress>() ;	     
            	         
            dbg.location(769,3);
            match(input,86,FOLLOW_86_in_interf2130); 
            dbg.location(769,12);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:769:12: (interface_name= ID )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:769:13: interface_name= ID
            {
            dbg.location(769,27);
            interface_name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_interf2135); 

            }

            dbg.location(769,44);
            pushFollow(FOLLOW_ip_addr_in_interf2141);
            interface_ip=ip_addr();
            _fsp--;

            dbg.location(769,54);
            match(input,78,FOLLOW_78_in_interf2143); 
            dbg.location(769,81);
            pushFollow(FOLLOW_ip_addr_in_interf2148);
            interface_netmask=ip_addr();
            _fsp--;

            dbg.location(770,3);
            match(input,87,FOLLOW_87_in_interf2153); 
            dbg.location(770,10);
            match(input,76,FOLLOW_76_in_interf2156); 
            dbg.location(770,15);
            pushFollow(FOLLOW_ip_addr_in_interf2160);
            i=ip_addr();
            _fsp--;

            dbg.location(770,24);
            dns_ip.add(new Ipaddress(input.toString(i.start,i.stop)));
            dbg.location(770,63);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:770:63: ( ',' j= ip_addr )*
            try { dbg.enterSubRule(46);

            loop46:
            do {
                int alt46=2;
                try { dbg.enterDecision(46);

                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                } finally {dbg.exitDecision(46);}

                switch (alt46) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:770:65: ',' j= ip_addr
            	    {
            	    dbg.location(770,65);
            	    match(input,COMMA,FOLLOW_COMMA_in_interf2167); 
            	    dbg.location(770,71);
            	    pushFollow(FOLLOW_ip_addr_in_interf2172);
            	    j=ip_addr();
            	    _fsp--;

            	    dbg.location(770,79);
            	    dns_ip.add(new Ipaddress(input.toString(j.start,j.stop)));

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);
            } finally {dbg.exitSubRule(46);}

            dbg.location(770,120);
            match(input,77,FOLLOW_77_in_interf2178); 
            dbg.location(771,4);
            match(input,88,FOLLOW_88_in_interf2186); 
            dbg.location(771,15);
            pushFollow(FOLLOW_ip_addr_in_interf2191);
            gw_ip=ip_addr();
            _fsp--;

            dbg.location(772,2);
            
            	Interface iface = new Interface (interface_name.getText(),input.toString(interface_ip.start,interface_ip.stop),input.toString(interface_netmask.start,interface_netmask.stop),input.toString(gw_ip.start,gw_ip.stop), dns_ip);
            	Symbol s = new Symbol("interface_descriptor", "interface_type_t", iface);
            	sym = s;  
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(776, 4);

        }
        finally {
            dbg.exitRule("interf");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end interf


    // $ANTLR start route
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:778:1: route returns [Symbol sym] : ( 'host' dst= ip_addr 'gw' gw= ip_addr | 'net' dst= ip_addr 'netmask' netmask_ip= ip_addr 'gw' gw= ip_addr );
    public final Symbol route() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return dst = null;

        ip_addr_return gw = null;

        ip_addr_return netmask_ip = null;


        try { dbg.enterRule("route");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(778, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:778:28: ( 'host' dst= ip_addr 'gw' gw= ip_addr | 'net' dst= ip_addr 'netmask' netmask_ip= ip_addr 'gw' gw= ip_addr )
            int alt47=2;
            try { dbg.enterDecision(47);

            int LA47_0 = input.LA(1);

            if ( (LA47_0==89) ) {
                alt47=1;
            }
            else if ( (LA47_0==90) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("778:1: route returns [Symbol sym] : ( 'host' dst= ip_addr 'gw' gw= ip_addr | 'net' dst= ip_addr 'netmask' netmask_ip= ip_addr 'gw' gw= ip_addr );", 47, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(47);}

            switch (alt47) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:778:30: 'host' dst= ip_addr 'gw' gw= ip_addr
                    {
                    dbg.location(778,30);
                    match(input,89,FOLLOW_89_in_route2212); 
                    dbg.location(778,40);
                    pushFollow(FOLLOW_ip_addr_in_route2216);
                    dst=ip_addr();
                    _fsp--;

                    dbg.location(778,49);
                    match(input,88,FOLLOW_88_in_route2218); 
                    dbg.location(778,56);
                    pushFollow(FOLLOW_ip_addr_in_route2222);
                    gw=ip_addr();
                    _fsp--;

                    dbg.location(779,2);
                    
                    	  Route rh = new Route (input.toString(dst.start,dst.stop), input.toString(gw.start,gw.stop));
                    	  Symbol s = new Symbol("host_route_string", "route_type_t", rh);
                    	  sym = s;
                    	  
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:786:4: 'net' dst= ip_addr 'netmask' netmask_ip= ip_addr 'gw' gw= ip_addr
                    {
                    dbg.location(786,4);
                    match(input,90,FOLLOW_90_in_route2234); 
                    dbg.location(786,13);
                    pushFollow(FOLLOW_ip_addr_in_route2238);
                    dst=ip_addr();
                    _fsp--;

                    dbg.location(786,22);
                    match(input,78,FOLLOW_78_in_route2240); 
                    dbg.location(786,42);
                    pushFollow(FOLLOW_ip_addr_in_route2244);
                    netmask_ip=ip_addr();
                    _fsp--;

                    dbg.location(786,51);
                    match(input,88,FOLLOW_88_in_route2246); 
                    dbg.location(786,58);
                    pushFollow(FOLLOW_ip_addr_in_route2251);
                    gw=ip_addr();
                    _fsp--;

                    dbg.location(787,2);
                    
                    	 Route rn = new Route (input.toString(dst.start,dst.stop),input.toString(netmask_ip.start,netmask_ip.stop),input.toString(gw.start,gw.stop));
                       	  Symbol s = new Symbol("net_route_string", "route_type_t", rn);
                    	  sym = s;
                    	  
                    	

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
        dbg.location(793, 2);

        }
        finally {
            dbg.exitRule("route");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end route


    // $ANTLR start serv_group
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:807:1: serv_group : 'service_set' '{' ip_addr ( 'netmask' ip_addr )? serv_listen_port ( ',' ip_addr ( nmask )? serv_listen_port )* '}' ;
    public final void serv_group() throws RecognitionException {
        try { dbg.enterRule("serv_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(807, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:808:2: ( 'service_set' '{' ip_addr ( 'netmask' ip_addr )? serv_listen_port ( ',' ip_addr ( nmask )? serv_listen_port )* '}' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:808:4: 'service_set' '{' ip_addr ( 'netmask' ip_addr )? serv_listen_port ( ',' ip_addr ( nmask )? serv_listen_port )* '}'
            {
            dbg.location(808,4);
            match(input,91,FOLLOW_91_in_serv_group2277); 
            dbg.location(808,18);
            match(input,76,FOLLOW_76_in_serv_group2279); 
            dbg.location(808,22);
            pushFollow(FOLLOW_ip_addr_in_serv_group2281);
            ip_addr();
            _fsp--;

            dbg.location(808,30);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:808:30: ( 'netmask' ip_addr )?
            int alt48=2;
            try { dbg.enterSubRule(48);
            try { dbg.enterDecision(48);

            int LA48_0 = input.LA(1);

            if ( (LA48_0==78) ) {
                alt48=1;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:808:31: 'netmask' ip_addr
                    {
                    dbg.location(808,31);
                    match(input,78,FOLLOW_78_in_serv_group2284); 
                    dbg.location(808,41);
                    pushFollow(FOLLOW_ip_addr_in_serv_group2286);
                    ip_addr();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(48);}

            dbg.location(808,51);
            pushFollow(FOLLOW_serv_listen_port_in_serv_group2290);
            serv_listen_port();
            _fsp--;

            dbg.location(808,69);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:808:69: ( ',' ip_addr ( nmask )? serv_listen_port )*
            try { dbg.enterSubRule(50);

            loop50:
            do {
                int alt50=2;
                try { dbg.enterDecision(50);

                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                } finally {dbg.exitDecision(50);}

                switch (alt50) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:808:70: ',' ip_addr ( nmask )? serv_listen_port
            	    {
            	    dbg.location(808,70);
            	    match(input,COMMA,FOLLOW_COMMA_in_serv_group2294); 
            	    dbg.location(808,74);
            	    pushFollow(FOLLOW_ip_addr_in_serv_group2296);
            	    ip_addr();
            	    _fsp--;

            	    dbg.location(808,82);
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:808:82: ( nmask )?
            	    int alt49=2;
            	    try { dbg.enterSubRule(49);
            	    try { dbg.enterDecision(49);

            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==78) ) {
            	        alt49=1;
            	    }
            	    } finally {dbg.exitDecision(49);}

            	    switch (alt49) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:808:83: nmask
            	            {
            	            dbg.location(808,83);
            	            pushFollow(FOLLOW_nmask_in_serv_group2299);
            	            nmask();
            	            _fsp--;


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(49);}

            	    dbg.location(808,91);
            	    pushFollow(FOLLOW_serv_listen_port_in_serv_group2303);
            	    serv_listen_port();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);
            } finally {dbg.exitSubRule(50);}

            dbg.location(808,111);
            match(input,77,FOLLOW_77_in_serv_group2308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(813, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:815:1: serv_listen_port : ( NUMBER ) ;
    public final void serv_listen_port() throws RecognitionException {
        try { dbg.enterRule("serv_listen_port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(815, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:816:2: ( ( NUMBER ) )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:816:4: ( NUMBER )
            {
            dbg.location(816,4);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:816:4: ( NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:816:5: NUMBER
            {
            dbg.location(816,5);
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port2328); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(816, 12);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:818:1: host_name : ID ;
    public final void host_name() throws RecognitionException {
        try { dbg.enterRule("host_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(818, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:819:2: ( ID )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:819:4: ID
            {
            dbg.location(819,4);
            match(input,ID,FOLLOW_ID_in_host_name2338); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(819, 6);

        }
        finally {
            dbg.exitRule("host_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end host_name


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\133\uffff";
    static final String DFA28_eofS =
        "\133\uffff";
    static final String DFA28_minS =
        "\1\10\1\uffff\1\4\4\uffff\2\114\2\uffff\1\10\1\uffff\1\125\1\10"+
        "\1\uffff\1\10\2\17\1\116\3\10\3\17\1\14\3\10\1\125\1\4\3\17\1\10"+
        "\2\uffff\3\10\1\17\1\116\1\10\1\116\1\17\3\10\1\14\1\10\2\17\1\14"+
        "\1\17\1\10\1\4\1\14\3\10\1\17\1\uffff\3\17\4\10\1\17\1\116\2\17"+
        "\3\10\1\17\1\14\4\10\1\14\1\17\1\10\1\17\1\10\1\17\2\10";
    static final String DFA28_maxS =
        "\1\133\1\uffff\1\73\4\uffff\2\114\2\uffff\1\13\1\uffff\1\125\1\10"+
        "\1\uffff\1\13\2\17\1\116\2\10\1\13\3\17\1\115\3\10\1\125\1\73\3"+
        "\17\1\13\2\uffff\3\10\1\17\3\116\1\17\1\10\1\13\1\10\1\115\1\10"+
        "\2\17\1\115\1\17\1\10\1\133\1\115\3\10\1\17\1\uffff\3\17\4\10\1"+
        "\17\1\116\2\17\3\10\1\17\1\115\2\10\1\116\1\10\1\115\1\17\1\10\1"+
        "\17\1\10\1\17\2\10";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\5\1\6\1\7\2\uffff\1\13\1\14\1\uffff\1"+
        "\2\2\uffff\1\4\24\uffff\1\10\1\11\30\uffff\1\12\34\uffff";
    static final String DFA28_specialS =
        "\133\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\1\uffff\1\3\2\uffff\1\1\17\uffff\1\6\1\uffff\1\7\57\uffff"+
            "\2\4\4\uffff\1\5\1\11\2\uffff\2\12\1\10",
            "",
            "\4\14\7\uffff\1\13\10\uffff\1\14\21\uffff\1\14\5\uffff\14\14",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\16",
            "",
            "",
            "\1\17\2\uffff\1\14",
            "",
            "\1\20",
            "\1\21",
            "",
            "\1\22\2\uffff\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31\2\uffff\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36\100\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\4\44\7\uffff\1\44\10\uffff\1\44\4\uffff\1\45\1\uffff\1\45\12"+
            "\uffff\1\44\5\uffff\14\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51\2\uffff\1\52",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\61\105\uffff\1\60",
            "\1\26",
            "\1\62",
            "\1\63",
            "\1\64\2\uffff\1\65",
            "\1\66",
            "\1\67\100\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\36\100\uffff\1\37",
            "\1\74",
            "\1\75",
            "\4\76\7\uffff\1\76\10\uffff\1\76\4\uffff\1\45\14\uffff\1\76"+
            "\5\uffff\14\76\37\uffff\1\45",
            "\1\36\100\uffff\1\37",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\57",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\36\100\uffff\1\37",
            "\1\61",
            "\1\121",
            "\1\123\105\uffff\1\122",
            "\1\124",
            "\1\67\100\uffff\1\70",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\123"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "361:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | interf | route );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_22_in_prog83 = new BitSet(new long[]{0x1000A387B7002D00L,0x000000000E618FFEL});
    public static final BitSet FOLLOW_statement_list_in_prog85 = new BitSet(new long[]{0x1000A387B7802D00L,0x000000000E618FFEL});
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
    public static final BitSet FOLLOW_config_statement_in_statement_expr197 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement_expr199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_oper_in_config_statement219 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_oper_in_config_statement226 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_route_in_config_statement228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement233 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_interf_in_config_statement241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement245 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement247 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement255 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement257 = new BitSet(new long[]{0x0000000080000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_topology_in_config_statement259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement265 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement267 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement276 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement278 = new BitSet(new long[]{0x0000000080000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_topology_in_config_statement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement287 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement289 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement292 = new BitSet(new long[]{0x0000000000000800L,0x0000000000018000L});
    public static final BitSet FOLLOW_role_in_config_statement294 = new BitSet(new long[]{0x0000000000000800L,0x0000000000018000L});
    public static final BitSet FOLLOW_object_name_in_config_statement298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement308 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement310 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement319 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement321 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_role_in_config_statement323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement329 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement331 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement339 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement341 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_role_in_config_statement343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement349 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement351 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement365 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_policy_in_config_statement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement380 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement382 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement390 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_policy_in_config_statement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement400 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_config_statement402 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement405 = new BitSet(new long[]{0x0000000000000800L,0x0000000000200000L});
    public static final BitSet FOLLOW_host_group_in_config_statement408 = new BitSet(new long[]{0x0000000000000800L,0x0000000000200000L});
    public static final BitSet FOLLOW_object_name_in_config_statement412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_config_statement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_display_in_config_statement421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_route_oper441 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_route_oper443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_route_oper448 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_route_oper450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_set_oper465 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_set_oper467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_set_oper472 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_set_oper474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_config_display493 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display495 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_config_display497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_config_display502 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_config_display510 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display512 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_config_display514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_config_display518 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_condition_statement542 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_condition_statement544 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_equality_expr_in_condition_statement546 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_condition_statement548 = new BitSet(new long[]{0x1000A387B7002D00L,0x000000000E618FFEL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement550 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_condition_statement553 = new BitSet(new long[]{0x1000A387B7002D00L,0x000000000E618FFEL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement555 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_condition_statement559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_iteration_statement575 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_iteration_statement577 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement579 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_iteration_statement581 = new BitSet(new long[]{0x1000A387B7002D00L,0x000000000E618FFEL});
    public static final BitSet FOLLOW_statement_list_in_iteration_statement583 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_iteration_statement585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_print_statement601 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_print_statement603 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_print_statement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr644 = new BitSet(new long[]{0xE000000000100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr648 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr706 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_conditional_expr714 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_expression_in_conditional_expr716 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_conditional_expr718 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_conditional_expr_in_conditional_expr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr744 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_logicalOR_expr752 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr754 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr777 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_logicalAND_expr785 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr787 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr811 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_bitwiseOR_expr819 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr821 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr844 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_bitwiseAND_expr852 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr854 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr879 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr888 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr896 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr920 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr931 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_expr_in_relational_expr941 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_term_in_expr967 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr978 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_term_in_expr989 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term1015 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term1026 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_unary_expr_in_term1036 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_unary_expr1070 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression1099 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1102 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression1103 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_factor1183 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_expression_in_factor1185 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_factor1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt1227 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1231 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_COMMA_in_declr_stmt1238 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1244 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_declr_stmt1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_object_values1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_role_in_object_values1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interf_in_object_values1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_in_object_values1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_role1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_role1455 = new BitSet(new long[]{0x0000000000000800L,0x0000000000018000L});
    public static final BitSet FOLLOW_policy_in_role1461 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_object_name_in_role1469 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_role1488 = new BitSet(new long[]{0x0000000000000800L,0x0000000000018000L});
    public static final BitSet FOLLOW_policy_in_role1494 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_object_name_in_role1502 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_role1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_verdict_in_policy1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_proto_in_policy1555 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_policy1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_policy1575 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1580 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_object_name_in_policy1587 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_port_in_policy1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_verdict_in_policy1627 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy1631 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_policy1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_policy1656 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_policy1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_topology1693 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_role_in_topology1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_topology1703 = new BitSet(new long[]{0x0000000020000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_role_in_topology1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_verdict0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_name1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1895 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1897 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1901 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1903 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1907 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1909 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_nmask1933 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_nmask1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_host1956 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_host1961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_host1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_host1973 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_host1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_host2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2031 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_dns_set2034 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2037 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2047 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_gateway2050 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2052 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_31_in_host_group2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_host_group2077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_host_in_host_group2081 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_host_group2088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_host_in_host_group2092 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_host_group2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_interf2130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_interf2135 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_interf2143 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_interf2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_interf2156 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2160 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_interf2167 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2172 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_interf2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_interf2186 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_route2212 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route2216 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_route2218 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_route2234 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route2238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_route2240 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route2244 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_route2246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_route2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_serv_group2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_serv_group2279 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group2281 = new BitSet(new long[]{0x0000000000000100L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_serv_group2284 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group2286 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group2290 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_serv_group2294 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group2296 = new BitSet(new long[]{0x0000000000000100L,0x0000000000004000L});
    public static final BitSet FOLLOW_nmask_in_serv_group2299 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group2303 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_serv_group2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name2338 = new BitSet(new long[]{0x0000000000000002L});

}