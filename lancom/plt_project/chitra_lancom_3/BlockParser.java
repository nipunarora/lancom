// $ANTLR 3.0.1 D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g 2008-05-09 05:06:56

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "NUMBER", "NM", "STRING", "ID", "CHAR", "ICMP_MESSAGE_TYPE", "DOT", "LETTER", "DIGIT", "EscapeSequence", "LINE_COMMENT", "EQUAL", "WHITESPACE", "'prog'", "'endprog'", "';'", "'ifconfig'", "'undo'", "'topology'", "'context'", "'apply'", "'policy'", "'host_group'", "'route'", "'add'", "'delete'", "'to'", "'from'", "'show'", "'numeric'", "'fw'", "'if'", "'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'echo'", "'?'", "':'", "'||'", "'&&'", "'|'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'~'", "'*='", "'/='", "'+='", "'-='", "','", "'topology_type_t'", "'host_type_t'", "'host_group_type_t'", "'serv_group_type_t'", "'context_type_t'", "'policy_type_t'", "'route_type_t'", "'interface_type_t'", "'ipaddr_t'", "'int_type_t'", "'char_type_t'", "'{'", "'}'", "'dst'", "'netmask'", "'all'", "'src'", "'serv_group'", "'inbound'", "'outbound'", "'allow'", "'deny'", "'udp'", "'tcp'", "'ip_addr'", "'ifname'", "'dns'", "'defgw'", "'host'", "'gw'", "'net'", "'service_group'", "', '"
    };
    public static final int MINUS=5;
    public static final int LETTER=15;
    public static final int NUMBER=8;
    public static final int CHAR=12;
    public static final int STRING=10;
    public static final int LINE_COMMENT=18;
    public static final int ICMP_MESSAGE_TYPE=13;
    public static final int WHITESPACE=20;
    public static final int NM=9;
    public static final int DOT=14;
    public static final int EQUAL=19;
    public static final int EscapeSequence=17;
    public static final int EOF=-1;
    public static final int DIV=7;
    public static final int PLUS=4;
    public static final int DIGIT=16;
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
        "object_values", "context", "policy", "topology", "int_value", "char_value", 
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
    	//OStype osType= new OStype("linux");
    	
    //	public static char OS ;
    	
        	public static void main(String[] args) throws Exception 
        	{
        	
            	BlockLexer lex = new BlockLexer(new ANTLRFileStream(args[0]));
    	       	CommonTokenStream tokens = new CommonTokenStream(lex);
    
            	BlockParser parser = new BlockParser(tokens);
    
    	        try 
    	        {
    	            parser.prog();
            	} 
            	catch (RecognitionException e)  
            	{
    	            e.printStackTrace();
            	}
        	}



    // $ANTLR start prog
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:55:1: prog : 'prog' ( statement_list )+ 'endprog' ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule("prog");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(55, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:56:2: ( 'prog' ( statement_list )+ 'endprog' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:56:4: 'prog' ( statement_list )+ 'endprog'
            {
            dbg.location(56,4);
            match(input,21,FOLLOW_21_in_prog84); 
            dbg.location(56,11);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:56:11: ( statement_list )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER||(LA1_0>=STRING && LA1_0<=CHAR)||(LA1_0>=23 && LA1_0<=25)||(LA1_0>=27 && LA1_0<=28)||(LA1_0>=30 && LA1_0<=33)||(LA1_0>=38 && LA1_0<=40)||LA1_0==44||LA1_0==46||LA1_0==59||(LA1_0>=65 && LA1_0<=75)||(LA1_0>=82 && LA1_0<=84)||(LA1_0>=89 && LA1_0<=90)||LA1_0==93||(LA1_0>=95 && LA1_0<=96)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:56:11: statement_list
            	    {
            	    dbg.location(56,11);
            	    pushFollow(FOLLOW_statement_list_in_prog86);
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

            dbg.location(56,27);
            match(input,22,FOLLOW_22_in_prog89); 

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
            dbg.exitRule("prog");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end prog


    // $ANTLR start statement_list
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:59:2: statement_list : ( statement | declr_stmt );
    public final void statement_list() throws RecognitionException {
        try { dbg.enterRule("statement_list");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(59, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:60:3: ( statement | declr_stmt )
            int alt2=2;
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==NUMBER||(LA2_0>=STRING && LA2_0<=CHAR)||(LA2_0>=23 && LA2_0<=25)||(LA2_0>=27 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=33)||(LA2_0>=38 && LA2_0<=40)||LA2_0==44||LA2_0==46||LA2_0==59||(LA2_0>=82 && LA2_0<=84)||(LA2_0>=89 && LA2_0<=90)||LA2_0==93||(LA2_0>=95 && LA2_0<=96)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=65 && LA2_0<=75)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("59:2: statement_list : ( statement | declr_stmt );", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:60:5: statement
                    {
                    dbg.location(60,5);
                    pushFollow(FOLLOW_statement_in_statement_list105);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:61:6: declr_stmt
                    {
                    dbg.location(61,6);
                    pushFollow(FOLLOW_declr_stmt_in_statement_list112);
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
        dbg.location(62, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:64:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final void statement() throws RecognitionException {
        try { dbg.enterRule("statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(64, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:65:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt3=4;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case NUMBER:
            case STRING:
            case ID:
            case CHAR:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case 30:
            case 31:
            case 32:
            case 33:
            case 38:
            case 40:
            case 59:
            case 82:
            case 83:
            case 84:
            case 89:
            case 90:
            case 93:
            case 95:
            case 96:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("64:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:65:5: condition_statement
                    {
                    dbg.location(65,5);
                    pushFollow(FOLLOW_condition_statement_in_statement127);
                    condition_statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:66:5: iteration_statement
                    {
                    dbg.location(66,5);
                    pushFollow(FOLLOW_iteration_statement_in_statement133);
                    iteration_statement();
                    _fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:67:5: statement_expr
                    {
                    dbg.location(67,5);
                    pushFollow(FOLLOW_statement_expr_in_statement139);
                    statement_expr();
                    _fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:68:5: print_statement
                    {
                    dbg.location(68,5);
                    pushFollow(FOLLOW_print_statement_in_statement145);
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
        dbg.location(69, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );
    public final void statement_expr() throws RecognitionException {
        try { dbg.enterRule("statement_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(71, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:72:3: ( ';' | expression ';' | config_statement ';' )
            int alt4=3;
            try { dbg.enterDecision(4);

            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=PLUS && LA4_2<=DIV)||LA4_2==DOT||LA4_2==EQUAL||LA4_2==23||LA4_2==47||(LA4_2>=49 && LA4_2<=58)||(LA4_2>=60 && LA4_2<=63)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 27:
            case 30:
            case 40:
            case 59:
            case 82:
            case 83:
            case 84:
            case 89:
            case 90:
            case 96:
                {
                alt4=2;
                }
                break;
            case 93:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==NUMBER) ) {
                    int LA4_8 = input.LA(3);

                    if ( (LA4_8==DOT) ) {
                        int LA4_12 = input.LA(4);

                        if ( (LA4_12==NUMBER) ) {
                            int LA4_16 = input.LA(5);

                            if ( (LA4_16==DOT) ) {
                                int LA4_22 = input.LA(6);

                                if ( (LA4_22==NUMBER) ) {
                                    int LA4_27 = input.LA(7);

                                    if ( (LA4_27==DOT) ) {
                                        int LA4_33 = input.LA(8);

                                        if ( (LA4_33==NUMBER) ) {
                                            int LA4_38 = input.LA(9);

                                            if ( (LA4_38==94) ) {
                                                int LA4_13 = input.LA(10);

                                                if ( (LA4_13==NUMBER) ) {
                                                    int LA4_17 = input.LA(11);

                                                    if ( (LA4_17==DOT) ) {
                                                        int LA4_23 = input.LA(12);

                                                        if ( (LA4_23==NUMBER) ) {
                                                            int LA4_28 = input.LA(13);

                                                            if ( (LA4_28==DOT) ) {
                                                                int LA4_34 = input.LA(14);

                                                                if ( (LA4_34==NUMBER) ) {
                                                                    int LA4_39 = input.LA(15);

                                                                    if ( (LA4_39==DOT) ) {
                                                                        int LA4_43 = input.LA(16);

                                                                        if ( (LA4_43==NUMBER) ) {
                                                                            int LA4_46 = input.LA(17);

                                                                            if ( ((LA4_46>=PLUS && LA4_46<=DIV)||LA4_46==DOT||LA4_46==23||LA4_46==47||(LA4_46>=49 && LA4_46<=58)) ) {
                                                                                alt4=2;
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 46, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 43, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 39, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 34, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 28, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 23, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 17, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else if ( (LA4_13==ID) ) {
                                                    int LA4_18 = input.LA(11);

                                                    if ( ((LA4_18>=PLUS && LA4_18<=DIV)||LA4_18==DOT||LA4_18==23||LA4_18==47||(LA4_18>=49 && LA4_18<=58)) ) {
                                                        alt4=2;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 18, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 13, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 38, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 33, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 27, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 22, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 16, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 12, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 8, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA4_4==ID) ) {
                    int LA4_9 = input.LA(3);

                    if ( (LA4_9==94) ) {
                        int LA4_13 = input.LA(4);

                        if ( (LA4_13==NUMBER) ) {
                            int LA4_17 = input.LA(5);

                            if ( (LA4_17==DOT) ) {
                                int LA4_23 = input.LA(6);

                                if ( (LA4_23==NUMBER) ) {
                                    int LA4_28 = input.LA(7);

                                    if ( (LA4_28==DOT) ) {
                                        int LA4_34 = input.LA(8);

                                        if ( (LA4_34==NUMBER) ) {
                                            int LA4_39 = input.LA(9);

                                            if ( (LA4_39==DOT) ) {
                                                int LA4_43 = input.LA(10);

                                                if ( (LA4_43==NUMBER) ) {
                                                    int LA4_46 = input.LA(11);

                                                    if ( ((LA4_46>=PLUS && LA4_46<=DIV)||LA4_46==DOT||LA4_46==23||LA4_46==47||(LA4_46>=49 && LA4_46<=58)) ) {
                                                        alt4=2;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 46, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 43, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 39, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 34, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 28, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 23, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 17, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                        }
                        else if ( (LA4_13==ID) ) {
                            int LA4_18 = input.LA(5);

                            if ( ((LA4_18>=PLUS && LA4_18<=DIV)||LA4_18==DOT||LA4_18==23||LA4_18==47||(LA4_18>=49 && LA4_18<=58)) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 18, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 13, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 9, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 95:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==NUMBER) ) {
                    int LA4_10 = input.LA(3);

                    if ( (LA4_10==DOT) ) {
                        int LA4_14 = input.LA(4);

                        if ( (LA4_14==NUMBER) ) {
                            int LA4_19 = input.LA(5);

                            if ( (LA4_19==DOT) ) {
                                int LA4_24 = input.LA(6);

                                if ( (LA4_24==NUMBER) ) {
                                    int LA4_29 = input.LA(7);

                                    if ( (LA4_29==DOT) ) {
                                        int LA4_35 = input.LA(8);

                                        if ( (LA4_35==NUMBER) ) {
                                            int LA4_40 = input.LA(9);

                                            if ( (LA4_40==79) ) {
                                                int LA4_15 = input.LA(10);

                                                if ( (LA4_15==NUMBER) ) {
                                                    int LA4_20 = input.LA(11);

                                                    if ( (LA4_20==DOT) ) {
                                                        int LA4_25 = input.LA(12);

                                                        if ( (LA4_25==NUMBER) ) {
                                                            int LA4_30 = input.LA(13);

                                                            if ( (LA4_30==DOT) ) {
                                                                int LA4_36 = input.LA(14);

                                                                if ( (LA4_36==NUMBER) ) {
                                                                    int LA4_41 = input.LA(15);

                                                                    if ( (LA4_41==DOT) ) {
                                                                        int LA4_44 = input.LA(16);

                                                                        if ( (LA4_44==NUMBER) ) {
                                                                            int LA4_47 = input.LA(17);

                                                                            if ( (LA4_47==94) ) {
                                                                                int LA4_26 = input.LA(18);

                                                                                if ( (LA4_26==NUMBER) ) {
                                                                                    int LA4_31 = input.LA(19);

                                                                                    if ( (LA4_31==DOT) ) {
                                                                                        int LA4_37 = input.LA(20);

                                                                                        if ( (LA4_37==NUMBER) ) {
                                                                                            int LA4_42 = input.LA(21);

                                                                                            if ( (LA4_42==DOT) ) {
                                                                                                int LA4_45 = input.LA(22);

                                                                                                if ( (LA4_45==NUMBER) ) {
                                                                                                    int LA4_48 = input.LA(23);

                                                                                                    if ( (LA4_48==DOT) ) {
                                                                                                        int LA4_49 = input.LA(24);

                                                                                                        if ( (LA4_49==NUMBER) ) {
                                                                                                            int LA4_50 = input.LA(25);

                                                                                                            if ( ((LA4_50>=PLUS && LA4_50<=DIV)||LA4_50==DOT||LA4_50==23||LA4_50==47||(LA4_50>=49 && LA4_50<=58)) ) {
                                                                                                                alt4=2;
                                                                                                            }
                                                                                                            else {
                                                                                                                NoViableAltException nvae =
                                                                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                                                dbg.recognitionException(nvae);
                                                                                                                throw nvae;
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            NoViableAltException nvae =
                                                                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                                            dbg.recognitionException(nvae);
                                                                                                            throw nvae;
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        NoViableAltException nvae =
                                                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                                        dbg.recognitionException(nvae);
                                                                                                        throw nvae;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    NoViableAltException nvae =
                                                                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                                                    dbg.recognitionException(nvae);
                                                                                                    throw nvae;
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                NoViableAltException nvae =
                                                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                                                dbg.recognitionException(nvae);
                                                                                                throw nvae;
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            NoViableAltException nvae =
                                                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                                            dbg.recognitionException(nvae);
                                                                                            throw nvae;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                                                                        dbg.recognitionException(nvae);
                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else if ( (LA4_26==ID) ) {
                                                                                    int LA4_32 = input.LA(19);

                                                                                    if ( ((LA4_32>=PLUS && LA4_32<=DIV)||LA4_32==DOT||LA4_32==23||LA4_32==47||(LA4_32>=49 && LA4_32<=58)) ) {
                                                                                        alt4=2;
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                                        dbg.recognitionException(nvae);
                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                                                    dbg.recognitionException(nvae);
                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 47, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 44, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 41, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 36, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 30, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 25, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 20, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else if ( (LA4_15==ID) ) {
                                                    int LA4_21 = input.LA(11);

                                                    if ( (LA4_21==94) ) {
                                                        int LA4_26 = input.LA(12);

                                                        if ( (LA4_26==NUMBER) ) {
                                                            int LA4_31 = input.LA(13);

                                                            if ( (LA4_31==DOT) ) {
                                                                int LA4_37 = input.LA(14);

                                                                if ( (LA4_37==NUMBER) ) {
                                                                    int LA4_42 = input.LA(15);

                                                                    if ( (LA4_42==DOT) ) {
                                                                        int LA4_45 = input.LA(16);

                                                                        if ( (LA4_45==NUMBER) ) {
                                                                            int LA4_48 = input.LA(17);

                                                                            if ( (LA4_48==DOT) ) {
                                                                                int LA4_49 = input.LA(18);

                                                                                if ( (LA4_49==NUMBER) ) {
                                                                                    int LA4_50 = input.LA(19);

                                                                                    if ( ((LA4_50>=PLUS && LA4_50<=DIV)||LA4_50==DOT||LA4_50==23||LA4_50==47||(LA4_50>=49 && LA4_50<=58)) ) {
                                                                                        alt4=2;
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                        dbg.recognitionException(nvae);
                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                    dbg.recognitionException(nvae);
                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else if ( (LA4_26==ID) ) {
                                                            int LA4_32 = input.LA(13);

                                                            if ( ((LA4_32>=PLUS && LA4_32<=DIV)||LA4_32==DOT||LA4_32==23||LA4_32==47||(LA4_32>=49 && LA4_32<=58)) ) {
                                                                alt4=2;
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 21, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 15, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 40, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 35, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 29, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 24, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 19, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 14, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 10, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA4_5==ID) ) {
                    int LA4_11 = input.LA(3);

                    if ( (LA4_11==79) ) {
                        int LA4_15 = input.LA(4);

                        if ( (LA4_15==NUMBER) ) {
                            int LA4_20 = input.LA(5);

                            if ( (LA4_20==DOT) ) {
                                int LA4_25 = input.LA(6);

                                if ( (LA4_25==NUMBER) ) {
                                    int LA4_30 = input.LA(7);

                                    if ( (LA4_30==DOT) ) {
                                        int LA4_36 = input.LA(8);

                                        if ( (LA4_36==NUMBER) ) {
                                            int LA4_41 = input.LA(9);

                                            if ( (LA4_41==DOT) ) {
                                                int LA4_44 = input.LA(10);

                                                if ( (LA4_44==NUMBER) ) {
                                                    int LA4_47 = input.LA(11);

                                                    if ( (LA4_47==94) ) {
                                                        int LA4_26 = input.LA(12);

                                                        if ( (LA4_26==NUMBER) ) {
                                                            int LA4_31 = input.LA(13);

                                                            if ( (LA4_31==DOT) ) {
                                                                int LA4_37 = input.LA(14);

                                                                if ( (LA4_37==NUMBER) ) {
                                                                    int LA4_42 = input.LA(15);

                                                                    if ( (LA4_42==DOT) ) {
                                                                        int LA4_45 = input.LA(16);

                                                                        if ( (LA4_45==NUMBER) ) {
                                                                            int LA4_48 = input.LA(17);

                                                                            if ( (LA4_48==DOT) ) {
                                                                                int LA4_49 = input.LA(18);

                                                                                if ( (LA4_49==NUMBER) ) {
                                                                                    int LA4_50 = input.LA(19);

                                                                                    if ( ((LA4_50>=PLUS && LA4_50<=DIV)||LA4_50==DOT||LA4_50==23||LA4_50==47||(LA4_50>=49 && LA4_50<=58)) ) {
                                                                                        alt4=2;
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                        dbg.recognitionException(nvae);
                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                    dbg.recognitionException(nvae);
                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else if ( (LA4_26==ID) ) {
                                                            int LA4_32 = input.LA(13);

                                                            if ( ((LA4_32>=PLUS && LA4_32<=DIV)||LA4_32==DOT||LA4_32==23||LA4_32==47||(LA4_32>=49 && LA4_32<=58)) ) {
                                                                alt4=2;
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 47, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 44, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 41, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 36, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 30, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 25, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 20, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                        }
                        else if ( (LA4_15==ID) ) {
                            int LA4_21 = input.LA(5);

                            if ( (LA4_21==94) ) {
                                int LA4_26 = input.LA(6);

                                if ( (LA4_26==NUMBER) ) {
                                    int LA4_31 = input.LA(7);

                                    if ( (LA4_31==DOT) ) {
                                        int LA4_37 = input.LA(8);

                                        if ( (LA4_37==NUMBER) ) {
                                            int LA4_42 = input.LA(9);

                                            if ( (LA4_42==DOT) ) {
                                                int LA4_45 = input.LA(10);

                                                if ( (LA4_45==NUMBER) ) {
                                                    int LA4_48 = input.LA(11);

                                                    if ( (LA4_48==DOT) ) {
                                                        int LA4_49 = input.LA(12);

                                                        if ( (LA4_49==NUMBER) ) {
                                                            int LA4_50 = input.LA(13);

                                                            if ( ((LA4_50>=PLUS && LA4_50<=DIV)||LA4_50==DOT||LA4_50==23||LA4_50==47||(LA4_50>=49 && LA4_50<=58)) ) {
                                                                alt4=2;
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                }
                                else if ( (LA4_26==ID) ) {
                                    int LA4_32 = input.LA(7);

                                    if ( ((LA4_32>=PLUS && LA4_32<=DIV)||LA4_32==DOT||LA4_32==23||LA4_32==47||(LA4_32>=49 && LA4_32<=58)) ) {
                                        alt4=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 21, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 15, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 11, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 24:
            case 25:
            case 28:
            case 31:
            case 32:
            case 33:
            case 38:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("71:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:72:5: ';'
                    {
                    dbg.location(72,5);
                    match(input,23,FOLLOW_23_in_statement_expr161); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:73:5: expression ';'
                    {
                    dbg.location(73,5);
                    pushFollow(FOLLOW_expression_in_statement_expr167);
                    expression();
                    _fsp--;

                    dbg.location(73,16);
                    match(input,23,FOLLOW_23_in_statement_expr169); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:74:28: config_statement ';'
                    {
                    dbg.location(74,28);
                    pushFollow(FOLLOW_config_statement_in_statement_expr198);
                    config_statement();
                    _fsp--;

                    dbg.location(74,45);
                    match(input,23,FOLLOW_23_in_statement_expr200); 

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
        dbg.location(75, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );
    public final void config_statement() throws RecognitionException {
        String route_cmd = null;

        object_name_return robj = null;

        String route_cmd2 = null;

        Symbol robj2 = null;

        object_name_return interf_object_name = null;

        Symbol interf_sym = null;

        object_name_return var = null;

        Symbol policy_sym = null;


        try { dbg.enterRule("config_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(77, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:78:3: (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display )
            int alt11=11;
            try { dbg.enterDecision(11);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt11=11;
                    }
                    break;
                case 33:
                    {
                    int LA11_10 = input.LA(3);

                    if ( (LA11_10==93||LA11_10==95) ) {
                        alt11=2;
                    }
                    else if ( (LA11_10==ID) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 10, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA11_11 = input.LA(3);

                    if ( (LA11_11==93||LA11_11==95) ) {
                        alt11=2;
                    }
                    else if ( (LA11_11==ID) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 11, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case 93:
            case 95:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                int LA11_5 = input.LA(2);

                if ( (LA11_5==27) ) {
                    int LA11_12 = input.LA(3);

                    if ( (LA11_12==ID) ) {
                        alt11=7;
                    }
                    else if ( (LA11_12==27) ) {
                        alt11=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 12, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA11_5==26) ) {
                    int LA11_13 = input.LA(3);

                    if ( (LA11_13==30||LA11_13==82) ) {
                        alt11=5;
                    }
                    else if ( (LA11_13==ID) ) {
                        alt11=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 13, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA11_6 = input.LA(2);

                if ( (LA11_6==34) ) {
                    int LA11_14 = input.LA(3);

                    if ( (LA11_14==27) ) {
                        alt11=6;
                    }
                    else if ( (LA11_14==30) ) {
                        alt11=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 14, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA11_7 = input.LA(2);

                if ( (LA11_7==35) ) {
                    int LA11_15 = input.LA(3);

                    if ( (LA11_15==30) ) {
                        alt11=10;
                    }
                    else if ( (LA11_15==27) ) {
                        alt11=6;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 15, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt11=9;
                }
                break;
            case 38:
                {
                alt11=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("77:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'undo' 'context' object_name | 'undo' 'context' context | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:79:5: route_cmd= route_oper robj= object_name
                    {
                    dbg.location(79,14);
                    pushFollow(FOLLOW_route_oper_in_config_statement224);
                    route_cmd=route_oper();
                    _fsp--;

                    dbg.location(79,30);
                    pushFollow(FOLLOW_object_name_in_config_statement228);
                    robj=object_name();
                    _fsp--;

                    dbg.location(80,5);
                    
                     	  Symbol s = currentScope.getSymbol(input.toString(robj.start,robj.stop));
                     	   try{
                     	 if (s.type.equals("route_type_t")!=true)
                     	 {
                     	   throw (new DataFormatException(" route:route object"));
                     	 }
                     	 }
                     	 catch (DataFormatException dfe)
                     	 {
                     	    System.out.println(dfe);
                     	  } 
                     	   Route route = (Route) currentScope.lookup(input.toString(robj.start,robj.stop));
                     	   if (route != null)
                     	   {
                     	   route.configure("route.xml",route_cmd);
                     	   }
                     	  
                     	  

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:99:4: route_cmd2= route_oper robj2= route
                    {
                    dbg.location(99,14);
                    pushFollow(FOLLOW_route_oper_in_config_statement241);
                    route_cmd2=route_oper();
                    _fsp--;

                    dbg.location(99,31);
                    pushFollow(FOLLOW_route_in_config_statement245);
                    robj2=route();
                    _fsp--;

                    dbg.location(100,4);
                    
                     	Route r=(Route)robj2.lookupValue();
                     	if(r!=null)
                     	{
                     	r.configure("route.xml",route_cmd2);
                     	}
                     	

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:108:3: 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) )
                    {
                    dbg.location(108,3);
                    Interface ifc=null;
                    dbg.location(109,3);
                    match(input,24,FOLLOW_24_in_config_statement262); 
                    dbg.location(109,15);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:109:15: ( (interf_object_name= object_name ) | (interf_sym= interf ) )
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5);

                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==90) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("109:15: ( (interf_object_name= object_name ) | (interf_sym= interf ) )", 5, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:109:16: (interf_object_name= object_name )
                            {
                            dbg.location(109,16);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:109:16: (interf_object_name= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:109:17: interf_object_name= object_name
                            {
                            dbg.location(109,35);
                            pushFollow(FOLLOW_object_name_in_config_statement269);
                            interf_object_name=object_name();
                            _fsp--;


                            }

                            dbg.location(109,49);
                            //interf_obj_name=object_name 
                            	
                            	 Symbol s = (Symbol) currentScope.getSymbol(input.toString(interf_object_name.start,interf_object_name.stop));
                             	  try{
                             	 if (s.type.equals("interface_type_t")!=true)
                             	 {
                             	   throw (new DataFormatException(" ifconfig:inteface:interface object"));
                             	 }
                             	 }
                             	 catch (DataFormatException dfe)
                             	 {
                             	    System.out.println(dfe);
                             	  }
                             	  ifc = (Interface) s.lookupValue();
                             	  
                            	

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:125:5: (interf_sym= interf )
                            {
                            dbg.location(125,5);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:125:5: (interf_sym= interf )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:125:6: interf_sym= interf
                            {
                            dbg.location(125,17);
                            pushFollow(FOLLOW_interf_in_config_statement284);
                            interf_sym=interf();
                            _fsp--;


                            }

                            dbg.location(125,26);
                            
                            	   ifc = (Interface)interf_sym.lookupValue();
                            	   

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(128,5);
                    	
                    	  
                     	  ifc.configure("interface.xml","InterfConfig");	
                    	

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:217:5: 'undo' 'topology' object_name
                    {
                    dbg.location(217,5);
                    match(input,25,FOLLOW_25_in_config_statement303); 
                    dbg.location(217,12);
                    match(input,26,FOLLOW_26_in_config_statement305); 
                    dbg.location(217,23);
                    pushFollow(FOLLOW_object_name_in_config_statement307);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:218:5: 'undo' 'topology' topology
                    {
                    dbg.location(218,5);
                    match(input,25,FOLLOW_25_in_config_statement314); 
                    dbg.location(218,12);
                    match(input,26,FOLLOW_26_in_config_statement316); 
                    dbg.location(218,23);
                    pushFollow(FOLLOW_topology_in_config_statement318);
                    topology();
                    _fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:219:6: set_oper 'context' ( object_name | context ) ( object_name | policy )
                    {
                    dbg.location(219,6);
                    pushFollow(FOLLOW_set_oper_in_config_statement325);
                    set_oper();
                    _fsp--;

                    dbg.location(219,15);
                    match(input,27,FOLLOW_27_in_config_statement327); 
                    dbg.location(219,25);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:219:25: ( object_name | context )
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==27) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("219:25: ( object_name | context )", 6, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:219:26: object_name
                            {
                            dbg.location(219,26);
                            pushFollow(FOLLOW_object_name_in_config_statement330);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:219:38: context
                            {
                            dbg.location(219,38);
                            pushFollow(FOLLOW_context_in_config_statement332);
                            context();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(219,47);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:219:47: ( object_name | policy )
                    int alt7=2;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ID) ) {
                        alt7=1;
                    }
                    else if ( ((LA7_0>=83 && LA7_0<=84)) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("219:47: ( object_name | policy )", 7, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:219:48: object_name
                            {
                            dbg.location(219,48);
                            pushFollow(FOLLOW_object_name_in_config_statement336);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:219:60: policy
                            {
                            dbg.location(219,60);
                            pushFollow(FOLLOW_policy_in_config_statement338);
                            policy();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:285:5: 'undo' 'context' object_name
                    {
                    dbg.location(285,5);
                    match(input,25,FOLLOW_25_in_config_statement353); 
                    dbg.location(285,12);
                    match(input,27,FOLLOW_27_in_config_statement355); 
                    dbg.location(285,22);
                    pushFollow(FOLLOW_object_name_in_config_statement357);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:286:5: 'undo' 'context' context
                    {
                    dbg.location(286,5);
                    match(input,25,FOLLOW_25_in_config_statement363); 
                    dbg.location(286,12);
                    match(input,27,FOLLOW_27_in_config_statement365); 
                    dbg.location(286,22);
                    pushFollow(FOLLOW_context_in_config_statement367);
                    context();
                    _fsp--;


                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:288:4: 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) )
                    {
                    dbg.location(288,4);
                     Policy p=null;
                    dbg.location(289,4);
                    match(input,28,FOLLOW_28_in_config_statement381); 
                    dbg.location(289,12);
                    match(input,29,FOLLOW_29_in_config_statement383); 
                    dbg.location(289,21);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:289:21: ( (var= object_name ) | (policy_sym= policy ) )
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ID) ) {
                        alt8=1;
                    }
                    else if ( ((LA8_0>=83 && LA8_0<=84)) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("289:21: ( (var= object_name ) | (policy_sym= policy ) )", 8, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:289:22: (var= object_name )
                            {
                            dbg.location(289,22);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:289:22: (var= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:289:23: var= object_name
                            {
                            dbg.location(289,26);
                            pushFollow(FOLLOW_object_name_in_config_statement389);
                            var=object_name();
                            _fsp--;


                            }

                            dbg.location(290,3);
                            
                            		   Symbol s = (Symbol) currentScope.getSymbol(input.toString(var.start,var.stop));
                             	  	try{
                             		     if (s.type.equals("policy_type_t")!=true)
                             		      {
                             	 	       throw (new DataFormatException(" apply:policy:policy object"));
                             		      }
                             	 	   }
                             		 catch (DataFormatException dfe)
                             	 	{
                             	    	  System.out.println(dfe);
                             	  	}	
                            		 p = (Policy) currentScope.lookup(input.toString(var.start,var.stop));
                            				
                            		

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:307:3: (policy_sym= policy )
                            {
                            dbg.location(307,3);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:307:3: (policy_sym= policy )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:307:4: policy_sym= policy
                            {
                            dbg.location(307,15);
                            pushFollow(FOLLOW_policy_in_config_statement412);
                            policy_sym=policy();
                            _fsp--;


                            }

                            dbg.location(308,3);
                            
                            		p = (Policy)policy_sym.lookupValue();
                            		
                            		

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(313,4);
                    
                     	 	   p.configure("fw.xml","AddPolicy");
                     	 	

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:460:5: set_oper 'host_group' ( object_name | host_group ) ( object_name | host )
                    {
                    dbg.location(460,5);
                    pushFollow(FOLLOW_set_oper_in_config_statement458);
                    set_oper();
                    _fsp--;

                    dbg.location(460,14);
                    match(input,30,FOLLOW_30_in_config_statement460); 
                    dbg.location(460,27);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:460:27: ( object_name | host_group )
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ID) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==30) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("460:27: ( object_name | host_group )", 9, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:460:28: object_name
                            {
                            dbg.location(460,28);
                            pushFollow(FOLLOW_object_name_in_config_statement463);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:460:41: host_group
                            {
                            dbg.location(460,41);
                            pushFollow(FOLLOW_host_group_in_config_statement466);
                            host_group();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(460,53);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:460:53: ( object_name | host )
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==89) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("460:53: ( object_name | host )", 10, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:460:54: object_name
                            {
                            dbg.location(460,54);
                            pushFollow(FOLLOW_object_name_in_config_statement470);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:460:66: host
                            {
                            dbg.location(460,66);
                            pushFollow(FOLLOW_host_in_config_statement472);
                            host();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:462:3: config_display
                    {
                    dbg.location(462,3);
                    pushFollow(FOLLOW_config_display_in_config_statement479);
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
        dbg.location(463, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:465:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );
    public final String route_oper() throws RecognitionException {
        String route_cmd = null;

        Token cmd=null;
        Token sub_cmd=null;

        try { dbg.enterRule("route_oper");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(465, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:466:3: ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' )
            int alt12=3;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID||LA12_0==93||LA12_0==95) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==33) ) {
                    alt12=3;
                }
                else if ( (LA12_2==32) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("465:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );", 12, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("465:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:467:2: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:467:3: cmd= 'route' sub_cmd= 'add'
                    {
                    dbg.location(467,6);
                    cmd=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_route_oper505); 
                    dbg.location(467,22);
                    sub_cmd=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_route_oper509); 
                    dbg.location(467,29);
                     route_cmd = "RouteAdd";

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:468:4: cmd= 'route' sub_cmd= 'delete'
                    {
                    dbg.location(468,7);
                    cmd=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_route_oper518); 
                    dbg.location(468,23);
                    sub_cmd=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_route_oper522); 
                    dbg.location(468,33);
                     route_cmd = "RouteDelete";

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
        dbg.location(469, 3);

        }
        finally {
            dbg.exitRule("route_oper");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return route_cmd;
    }
    // $ANTLR end route_oper


    // $ANTLR start set_oper
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:471:1: set_oper : ( 'add' 'to' | 'delete' 'from' );
    public final void set_oper() throws RecognitionException {
        try { dbg.enterRule("set_oper");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(471, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:472:2: ( 'add' 'to' | 'delete' 'from' )
            int alt13=2;
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("471:1: set_oper : ( 'add' 'to' | 'delete' 'from' );", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:473:2: 'add' 'to'
                    {
                    dbg.location(473,2);
                    match(input,32,FOLLOW_32_in_set_oper539); 
                    dbg.location(473,8);
                    match(input,34,FOLLOW_34_in_set_oper541); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:474:4: 'delete' 'from'
                    {
                    dbg.location(474,4);
                    match(input,33,FOLLOW_33_in_set_oper546); 
                    dbg.location(474,13);
                    match(input,35,FOLLOW_35_in_set_oper548); 

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
        dbg.location(475, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:477:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );
    public final void config_display() throws RecognitionException {
        try { dbg.enterRule("config_display");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(477, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:478:3: ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' )
            int alt14=4;
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==36) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==37) ) {
                        alt14=1;
                    }
                    else if ( (LA14_3==23) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("477:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 14, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("477:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 14, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA14_0==38) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==36) ) {
                    int LA14_4 = input.LA(3);

                    if ( (LA14_4==37) ) {
                        alt14=3;
                    }
                    else if ( (LA14_4==23) ) {
                        alt14=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("477:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 14, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("477:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 14, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("477:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:479:4: 'route' 'show' 'numeric'
                    {
                    dbg.location(479,4);
                    match(input,31,FOLLOW_31_in_config_display567); 
                    dbg.location(479,12);
                    match(input,36,FOLLOW_36_in_config_display569); 
                    dbg.location(479,19);
                    match(input,37,FOLLOW_37_in_config_display571); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:480:4: 'route' 'show'
                    {
                    dbg.location(480,4);
                    match(input,31,FOLLOW_31_in_config_display576); 
                    dbg.location(480,12);
                    match(input,36,FOLLOW_36_in_config_display578); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:481:4: 'fw' 'show' 'numeric'
                    {
                    dbg.location(481,4);
                    match(input,38,FOLLOW_38_in_config_display584); 
                    dbg.location(481,9);
                    match(input,36,FOLLOW_36_in_config_display586); 
                    dbg.location(481,16);
                    match(input,37,FOLLOW_37_in_config_display588); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:482:3: 'fw' 'show'
                    {
                    dbg.location(482,3);
                    match(input,38,FOLLOW_38_in_config_display592); 
                    dbg.location(482,8);
                    match(input,36,FOLLOW_36_in_config_display594); 

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
        dbg.location(483, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:487:2: condition_statement : 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' ;
    public final void condition_statement() throws RecognitionException {
        try { dbg.enterRule("condition_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(487, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:488:3: ( 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:488:5: 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif'
            {
            dbg.location(488,5);
            match(input,39,FOLLOW_39_in_condition_statement616); 
            dbg.location(488,10);
            match(input,40,FOLLOW_40_in_condition_statement618); 
            dbg.location(488,14);
            pushFollow(FOLLOW_equality_expr_in_condition_statement620);
            equality_expr();
            _fsp--;

            dbg.location(488,28);
            match(input,41,FOLLOW_41_in_condition_statement622); 
            dbg.location(488,32);
            pushFollow(FOLLOW_statement_list_in_condition_statement624);
            statement_list();
            _fsp--;

            dbg.location(488,47);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:488:47: ( 'else' statement_list )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:488:48: 'else' statement_list
                    {
                    dbg.location(488,48);
                    match(input,42,FOLLOW_42_in_condition_statement627); 
                    dbg.location(488,55);
                    pushFollow(FOLLOW_statement_list_in_condition_statement629);
                    statement_list();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(488,72);
            match(input,43,FOLLOW_43_in_condition_statement633); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(489, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:491:2: iteration_statement : 'while' '(' equality_expr ')' statement_list 'endwhile' ;
    public final void iteration_statement() throws RecognitionException {
        try { dbg.enterRule("iteration_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(491, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:492:3: ( 'while' '(' equality_expr ')' statement_list 'endwhile' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:492:5: 'while' '(' equality_expr ')' statement_list 'endwhile'
            {
            dbg.location(492,5);
            match(input,44,FOLLOW_44_in_iteration_statement649); 
            dbg.location(492,13);
            match(input,40,FOLLOW_40_in_iteration_statement651); 
            dbg.location(492,17);
            pushFollow(FOLLOW_equality_expr_in_iteration_statement653);
            equality_expr();
            _fsp--;

            dbg.location(492,31);
            match(input,41,FOLLOW_41_in_iteration_statement655); 
            dbg.location(492,35);
            pushFollow(FOLLOW_statement_list_in_iteration_statement657);
            statement_list();
            _fsp--;

            dbg.location(492,50);
            match(input,45,FOLLOW_45_in_iteration_statement659); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(493, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:495:2: print_statement : 'echo' STRING ';' ;
    public final void print_statement() throws RecognitionException {
        Token STRING1=null;

        try { dbg.enterRule("print_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(495, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:496:3: ( 'echo' STRING ';' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:496:5: 'echo' STRING ';'
            {
            dbg.location(496,5);
            match(input,46,FOLLOW_46_in_print_statement675); 
            dbg.location(496,12);
            STRING1=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement677); 
            dbg.location(496,20);
            System.out.println(STRING1);
            dbg.location(496,50);
            match(input,23,FOLLOW_23_in_print_statement681); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(497, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:499:2: expression : assignment_expr ;
    public final void expression() throws RecognitionException {
        try { dbg.enterRule("expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(499, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:500:3: ( assignment_expr )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:500:5: assignment_expr
            {
            dbg.location(500,5);
            pushFollow(FOLLOW_assignment_expr_in_expression697);
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
        dbg.location(501, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:503:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );
    public final void assignment_expr() throws RecognitionException {
        object_name_return var = null;

        assignment_operator_return op = null;

        Symbol e = null;


        try { dbg.enterRule("assignment_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(503, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:504:4: (var= object_name op= assignment_operator assignment_expr | e= conditional_expr )
            int alt16=2;
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=PLUS && LA16_1<=DIV)||LA16_1==DOT||LA16_1==23||LA16_1==41||(LA16_1>=47 && LA16_1<=58)) ) {
                    alt16=2;
                }
                else if ( (LA16_1==EQUAL||(LA16_1>=60 && LA16_1<=63)) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("503:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 16, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA16_0==NUMBER||LA16_0==STRING||LA16_0==CHAR||LA16_0==27||LA16_0==30||LA16_0==40||LA16_0==59||(LA16_0>=82 && LA16_0<=84)||(LA16_0>=89 && LA16_0<=90)||LA16_0==93||(LA16_0>=95 && LA16_0<=96)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("503:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:504:7: var= object_name op= assignment_operator assignment_expr
                    {
                    dbg.location(504,10);
                    pushFollow(FOLLOW_object_name_in_assignment_expr718);
                    var=object_name();
                    _fsp--;

                    dbg.location(504,25);
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr722);
                    op=assignment_operator();
                    _fsp--;

                    dbg.location(505,4);
                    
                    	 		Symbol s = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			Assignment ans = new Assignment(s, input.toString(op.start,op.stop));
                    			map.put(input.toString(var.start,var.stop), ans);
                    			System.out.println("here");
                    		//	currentScope.printSymbols();
                    	 	
                    dbg.location(512,4);
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr733);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:514:6: e= conditional_expr
                    {
                    dbg.location(514,7);
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr746);
                    e=conditional_expr();
                    _fsp--;

                    dbg.location(515,4);
                    
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
                    			map.clear();
                     		

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
        dbg.location(569, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:573:2: conditional_expr returns [Symbol sym] : e= logicalOR_expr ( '?' expression ':' conditional_expr )? ;
    public final Symbol conditional_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("conditional_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(573, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:574:3: (e= logicalOR_expr ( '?' expression ':' conditional_expr )? )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:574:5: e= logicalOR_expr ( '?' expression ':' conditional_expr )?
            {
            dbg.location(574,6);
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr780);
            e=logicalOR_expr();
            _fsp--;

            dbg.location(574,22);
             sym = e;
            dbg.location(575,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:575:3: ( '?' expression ':' conditional_expr )?
            int alt17=2;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:575:5: '?' expression ':' conditional_expr
                    {
                    dbg.location(575,5);
                    match(input,47,FOLLOW_47_in_conditional_expr788); 
                    dbg.location(575,9);
                    pushFollow(FOLLOW_expression_in_conditional_expr790);
                    expression();
                    _fsp--;

                    dbg.location(575,20);
                    match(input,48,FOLLOW_48_in_conditional_expr792); 
                    dbg.location(575,24);
                    pushFollow(FOLLOW_conditional_expr_in_conditional_expr794);
                    conditional_expr();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(576, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:578:2: logicalOR_expr returns [Symbol sym] : e= logicalAND_expr ( '||' logicalAND_expr )* ;
    public final Symbol logicalOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("logicalOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(578, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:579:3: (e= logicalAND_expr ( '||' logicalAND_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:579:5: e= logicalAND_expr ( '||' logicalAND_expr )*
            {
            dbg.location(579,6);
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr818);
            e=logicalAND_expr();
            _fsp--;

            dbg.location(579,24);
             sym = e;
            dbg.location(580,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:580:3: ( '||' logicalAND_expr )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==49) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:580:4: '||' logicalAND_expr
            	    {
            	    dbg.location(580,4);
            	    match(input,49,FOLLOW_49_in_logicalOR_expr826); 
            	    dbg.location(580,9);
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr828);
            	    logicalAND_expr();
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
        dbg.location(581, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:583:2: logicalAND_expr returns [Symbol sym] : e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* ;
    public final Symbol logicalAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("logicalAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(583, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:584:3: (e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:584:5: e= bitwiseOR_expr ( '&&' bitwiseOR_expr )*
            {
            dbg.location(584,6);
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr851);
            e=bitwiseOR_expr();
            _fsp--;

            dbg.location(584,23);
             sym = e;
            dbg.location(585,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:585:3: ( '&&' bitwiseOR_expr )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==50) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:585:4: '&&' bitwiseOR_expr
            	    {
            	    dbg.location(585,4);
            	    match(input,50,FOLLOW_50_in_logicalAND_expr859); 
            	    dbg.location(585,9);
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr861);
            	    bitwiseOR_expr();
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
        dbg.location(586, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:588:2: bitwiseOR_expr returns [Symbol sym] : e= bitwiseAND_expr ( '|' bitwiseAND_expr )* ;
    public final Symbol bitwiseOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("bitwiseOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(588, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:589:3: (e= bitwiseAND_expr ( '|' bitwiseAND_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:589:5: e= bitwiseAND_expr ( '|' bitwiseAND_expr )*
            {
            dbg.location(589,6);
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr885);
            e=bitwiseAND_expr();
            _fsp--;

            dbg.location(589,24);
             sym = e;
            dbg.location(590,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:590:3: ( '|' bitwiseAND_expr )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==51) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:590:4: '|' bitwiseAND_expr
            	    {
            	    dbg.location(590,4);
            	    match(input,51,FOLLOW_51_in_bitwiseOR_expr893); 
            	    dbg.location(590,8);
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr895);
            	    bitwiseAND_expr();
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
        dbg.location(591, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:593:2: bitwiseAND_expr returns [Symbol sym] : e= equality_expr ( '&' equality_expr )* ;
    public final Symbol bitwiseAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("bitwiseAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(593, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:594:3: (e= equality_expr ( '&' equality_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:594:5: e= equality_expr ( '&' equality_expr )*
            {
            dbg.location(594,6);
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr918);
            e=equality_expr();
            _fsp--;

            dbg.location(594,22);
             sym = e;
            dbg.location(595,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:595:3: ( '&' equality_expr )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==52) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:595:4: '&' equality_expr
            	    {
            	    dbg.location(595,4);
            	    match(input,52,FOLLOW_52_in_bitwiseAND_expr926); 
            	    dbg.location(595,8);
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr928);
            	    equality_expr();
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
        dbg.location(596, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:598:2: equality_expr returns [Symbol sym] : e= relational_expr ( ( '==' | '!=' ) relational_expr )* ;
    public final Symbol equality_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("equality_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(598, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:599:3: (e= relational_expr ( ( '==' | '!=' ) relational_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:599:5: e= relational_expr ( ( '==' | '!=' ) relational_expr )*
            {
            dbg.location(599,6);
            pushFollow(FOLLOW_relational_expr_in_equality_expr953);
            e=relational_expr();
            _fsp--;

            dbg.location(599,24);
             sym = e;
            dbg.location(600,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:600:3: ( ( '==' | '!=' ) relational_expr )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=53 && LA22_0<=54)) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:600:5: ( '==' | '!=' ) relational_expr
            	    {
            	    dbg.location(600,5);
            	    if ( (input.LA(1)>=53 && input.LA(1)<=54) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr962);    throw mse;
            	    }

            	    dbg.location(600,19);
            	    pushFollow(FOLLOW_relational_expr_in_equality_expr970);
            	    relational_expr();
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
        dbg.location(601, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:603:2: relational_expr returns [Symbol sym] : e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* ;
    public final Symbol relational_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("relational_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(603, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:604:3: (e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:604:5: e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )*
            {
            dbg.location(604,6);
            pushFollow(FOLLOW_expr_in_relational_expr994);
            e=expr();
            _fsp--;

            dbg.location(604,15);
             sym = e;
            dbg.location(605,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:605:3: ( ( '<' | '>' | '<=' | '>=' ) expr )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=55 && LA23_0<=58)) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:605:5: ( '<' | '>' | '<=' | '>=' ) expr
            	    {
            	    dbg.location(605,5);
            	    if ( (input.LA(1)>=55 && input.LA(1)<=58) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr1005);    throw mse;
            	    }

            	    dbg.location(605,25);
            	    pushFollow(FOLLOW_expr_in_relational_expr1015);
            	    expr();
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
        dbg.location(606, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:609:2: expr returns [Symbol sym] : e= term ( ( PLUS | MINUS ) term )* ;
    public final Symbol expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(609, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:610:3: (e= term ( ( PLUS | MINUS ) term )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:610:5: e= term ( ( PLUS | MINUS ) term )*
            {
            dbg.location(610,6);
            pushFollow(FOLLOW_term_in_expr1041);
            e=term();
            _fsp--;

            dbg.location(610,15);
            sym = e;
            dbg.location(611,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:611:3: ( ( PLUS | MINUS ) term )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24);

                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=PLUS && LA24_0<=MINUS)) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:611:5: ( PLUS | MINUS ) term
            	    {
            	    dbg.location(611,5);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr1052);    throw mse;
            	    }

            	    dbg.location(611,23);
            	    pushFollow(FOLLOW_term_in_expr1063);
            	    term();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(612, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:614:2: term returns [Symbol sym] : e= unary_expr ( ( MULT | DIV ) unary_expr )* ;
    public final Symbol term() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("term");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(614, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:615:3: (e= unary_expr ( ( MULT | DIV ) unary_expr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:615:5: e= unary_expr ( ( MULT | DIV ) unary_expr )*
            {
            dbg.location(615,6);
            pushFollow(FOLLOW_unary_expr_in_term1089);
            e=unary_expr();
            _fsp--;

            dbg.location(615,21);
            sym = e;
            dbg.location(616,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:616:3: ( ( MULT | DIV ) unary_expr )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=MULT && LA25_0<=DIV)) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:616:5: ( MULT | DIV ) unary_expr
            	    {
            	    dbg.location(616,5);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term1100);    throw mse;
            	    }

            	    dbg.location(616,20);
            	    pushFollow(FOLLOW_unary_expr_in_term1110);
            	    unary_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(617, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:619:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );
    public final Symbol unary_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("unary_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(619, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:620:3: (e= postfix_expression | '~' unary_expr )
            int alt26=2;
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==NUMBER||(LA26_0>=STRING && LA26_0<=CHAR)||LA26_0==27||LA26_0==30||LA26_0==40||(LA26_0>=82 && LA26_0<=84)||(LA26_0>=89 && LA26_0<=90)||LA26_0==93||(LA26_0>=95 && LA26_0<=96)) ) {
                alt26=1;
            }
            else if ( (LA26_0==59) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("619:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:620:5: e= postfix_expression
                    {
                    dbg.location(620,6);
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr1136);
                    e=postfix_expression();
                    _fsp--;

                    dbg.location(620,26);
                    sym = e;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:621:5: '~' unary_expr
                    {
                    dbg.location(621,5);
                    match(input,59,FOLLOW_59_in_unary_expr1144); 
                    dbg.location(621,9);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr1146);
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
        dbg.location(624, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:626:2: postfix_expression returns [Symbol sym] : e= factor ( '.' ID )* ;
    public final Symbol postfix_expression() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("postfix_expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(626, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:627:3: (e= factor ( '.' ID )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:627:5: e= factor ( '.' ID )*
            {
            dbg.location(627,6);
            pushFollow(FOLLOW_factor_in_postfix_expression1173);
            e=factor();
            _fsp--;

            dbg.location(627,14);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:627:14: ( '.' ID )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==DOT) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:627:15: '.' ID
            	    {
            	    dbg.location(627,15);
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression1176); 
            	    dbg.location(627,18);
            	    match(input,ID,FOLLOW_ID_in_postfix_expression1177); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}

            dbg.location(627,24);
            sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(628, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:630:2: assignment_operator : ( '=' | '*=' | '/=' | '+=' | '-=' );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("assignment_operator");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(630, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:631:3: ( '=' | '*=' | '/=' | '+=' | '-=' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(631,3);
            if ( input.LA(1)==EQUAL||(input.LA(1)>=60 && input.LA(1)<=63) ) {
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
        dbg.location(636, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:638:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );
    public final Symbol factor() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("factor");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(638, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:640:2: ( ID | e= literal | '(' expression ')' )
            int alt28=3;
            try { dbg.enterDecision(28);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt28=1;
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 27:
            case 30:
            case 82:
            case 83:
            case 84:
            case 89:
            case 90:
            case 93:
            case 95:
            case 96:
                {
                alt28=2;
                }
                break;
            case 40:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("638:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:640:4: ID
                    {
                    dbg.location(640,4);
                    match(input,ID,FOLLOW_ID_in_factor1240); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:641:5: e= literal
                    {
                    dbg.location(641,6);
                    pushFollow(FOLLOW_literal_in_factor1248);
                    e=literal();
                    _fsp--;

                    dbg.location(641,16);
                    sym = e;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:642:5: '(' expression ')'
                    {
                    dbg.location(642,5);
                    match(input,40,FOLLOW_40_in_factor1257); 
                    dbg.location(642,9);
                    pushFollow(FOLLOW_expression_in_factor1259);
                    expression();
                    _fsp--;

                    dbg.location(642,20);
                    match(input,41,FOLLOW_41_in_factor1261); 

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
        dbg.location(643, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:645:2: literal returns [Symbol sym] : e= object_values ;
    public final Symbol literal() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("literal");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(645, 2);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:646:3: (e= object_values )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:646:5: e= object_values
            {
            dbg.location(646,6);
            pushFollow(FOLLOW_object_values_in_literal1283);
            e=object_values();
            _fsp--;

            dbg.location(646,21);
            sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(647, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:649:1: declr_stmt : type_name var_name= object_name ( ',' next_var= object_name )* ';' ;
    public final void declr_stmt() throws RecognitionException {
        object_name_return var_name = null;

        object_name_return next_var = null;

        type_name_return type_name2 = null;


        try { dbg.enterRule("declr_stmt");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(649, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:650:2: ( type_name var_name= object_name ( ',' next_var= object_name )* ';' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:651:2: type_name var_name= object_name ( ',' next_var= object_name )* ';'
            {
            dbg.location(651,2);
            int count_com = 0;
            dbg.location(652,2);
            pushFollow(FOLLOW_type_name_in_declr_stmt1301);
            type_name2=type_name();
            _fsp--;

            dbg.location(652,20);
            pushFollow(FOLLOW_object_name_in_declr_stmt1305);
            var_name=object_name();
            _fsp--;

            dbg.location(653,2);
            
            		System.out.println(" type : " + input.toString(type_name2.start,type_name2.stop) +" var : "+ input.toString(var_name.start,var_name.stop));
            		currentScope.defineSymbol(input.toString(var_name.start,var_name.stop), input.toString(type_name2.start,type_name2.stop));
            	
            dbg.location(657,2);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:657:2: ( ',' next_var= object_name )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==64) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:657:3: ',' next_var= object_name
            	    {
            	    dbg.location(657,3);
            	    match(input,64,FOLLOW_64_in_declr_stmt1312); 
            	    dbg.location(657,7);
            	    count_com++;
            	    dbg.location(657,30);
            	    pushFollow(FOLLOW_object_name_in_declr_stmt1318);
            	    next_var=object_name();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}

            dbg.location(658,2);
            
            	//	System.out.println(" commas : "+ count_com);
            		
            		if(count_com > 0)			
                          		 currentScope.defineSymbol(input.toString(next_var.start,next_var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            dbg.location(664,2);
            match(input,23,FOLLOW_23_in_declr_stmt1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(665, 3);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:670:1: type_name : ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'context_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("type_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(670, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:671:2: ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'context_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(671,2);
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
        dbg.location(682, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:684:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );
    public final Symbol object_values() throws RecognitionException {
        Symbol sym = null;

        Symbol int_value3 = null;

        ip_addr_return ip_addr4 = null;

        Symbol policy5 = null;

        Symbol host6 = null;

        Symbol context7 = null;

        Symbol host_group8 = null;

        Symbol topology9 = null;

        Symbol serv_group10 = null;

        Symbol interf11 = null;

        Symbol route12 = null;


        try { dbg.enterRule("object_values");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(684, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:685:2: ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route )
            int alt30=12;
            try { dbg.enterDecision(30);

            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt30=1;
                }
                break;
            case NUMBER:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==DOT) ) {
                    int LA30_12 = input.LA(3);

                    if ( (LA30_12==ID) ) {
                        alt30=2;
                    }
                    else if ( (LA30_12==NUMBER) ) {
                        alt30=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("684:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 30, 12, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( ((LA30_2>=PLUS && LA30_2<=DIV)||LA30_2==23||LA30_2==41||(LA30_2>=47 && LA30_2<=58)) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("684:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 30, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                alt30=3;
                }
                break;
            case 83:
            case 84:
                {
                alt30=5;
                }
                break;
            case 89:
                {
                alt30=6;
                }
                break;
            case 27:
                {
                alt30=7;
                }
                break;
            case 30:
                {
                int LA30_7 = input.LA(2);

                if ( (LA30_7==76) ) {
                    alt30=8;
                }
                else if ( (LA30_7==ID||LA30_7==30) ) {
                    alt30=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("684:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 30, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 82:
                {
                alt30=9;
                }
                break;
            case 96:
                {
                alt30=10;
                }
                break;
            case 90:
                {
                alt30=11;
                }
                break;
            case 93:
            case 95:
                {
                alt30=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("684:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:685:4: char_value
                    {
                    dbg.location(685,4);
                    pushFollow(FOLLOW_char_value_in_object_values1424);
                    char_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:686:4: int_value
                    {
                    dbg.location(686,4);
                    pushFollow(FOLLOW_int_value_in_object_values1429);
                    int_value3=int_value();
                    _fsp--;

                    dbg.location(687,2);
                     
                    		sym = int_value3;
                    	

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:690:4: STRING
                    {
                    dbg.location(690,4);
                    match(input,STRING,FOLLOW_STRING_in_object_values1438); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:691:4: ip_addr
                    {
                    dbg.location(691,4);
                    pushFollow(FOLLOW_ip_addr_in_object_values1443);
                    ip_addr4=ip_addr();
                    _fsp--;

                    dbg.location(692,2);
                    
                    	  sym = ip_addr4.sym;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:695:4: policy
                    {
                    dbg.location(695,4);
                    pushFollow(FOLLOW_policy_in_object_values1451);
                    policy5=policy();
                    _fsp--;

                    dbg.location(695,13);
                     sym = policy5;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:696:4: host
                    {
                    dbg.location(696,4);
                    pushFollow(FOLLOW_host_in_object_values1460);
                    host6=host();
                    _fsp--;

                    dbg.location(696,11);
                    
                    	sym = host6 ; 
                    	

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:699:4: context
                    {
                    dbg.location(699,4);
                    pushFollow(FOLLOW_context_in_object_values1469);
                    context7=context();
                    _fsp--;

                    dbg.location(699,12);
                    sym =context7;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:700:4: host_group
                    {
                    dbg.location(700,4);
                    pushFollow(FOLLOW_host_group_in_object_values1477);
                    host_group8=host_group();
                    _fsp--;

                    dbg.location(700,15);
                     sym = host_group8;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:701:4: topology
                    {
                    dbg.location(701,4);
                    pushFollow(FOLLOW_topology_in_object_values1485);
                    topology9=topology();
                    _fsp--;

                    dbg.location(701,13);
                    sym = topology9;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:702:4: serv_group
                    {
                    dbg.location(702,4);
                    pushFollow(FOLLOW_serv_group_in_object_values1492);
                    serv_group10=serv_group();
                    _fsp--;

                    dbg.location(702,15);
                    sym = serv_group10;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:703:4: interf
                    {
                    dbg.location(703,4);
                    pushFollow(FOLLOW_interf_in_object_values1499);
                    interf11=interf();
                    _fsp--;

                    dbg.location(703,11);
                     sym = interf11;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:704:4: route
                    {
                    dbg.location(704,4);
                    pushFollow(FOLLOW_route_in_object_values1506);
                    route12=route();
                    _fsp--;

                    dbg.location(704,10);
                    sym = route12;

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
        dbg.location(706, 2);

        }
        finally {
            dbg.exitRule("object_values");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end object_values


    // $ANTLR start context
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:710:1: context returns [Symbol sym] : 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}' ;
    public final Symbol context() throws RecognitionException {
        Symbol sym = null;

        Symbol p_i = null;

        object_name_return var = null;

        Symbol p_j = null;

        object_name_return var2 = null;


        try { dbg.enterRule("context");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(710, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:710:29: ( 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:711:2: 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}'
            {
            dbg.location(711,2);
             
            	      Vector <Policy> policies;
            	      policies = new Vector <Policy>() ;	     
            	 
            dbg.location(715,2);
            match(input,27,FOLLOW_27_in_context1530); 
            dbg.location(715,12);
            match(input,76,FOLLOW_76_in_context1532); 
            dbg.location(715,16);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:715:16: ( (p_i= policy ) | (var= object_name ) )
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=83 && LA31_0<=84)) ) {
                alt31=1;
            }
            else if ( (LA31_0==ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("715:16: ( (p_i= policy ) | (var= object_name ) )", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:715:17: (p_i= policy )
                    {
                    dbg.location(715,17);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:715:17: (p_i= policy )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:715:18: p_i= policy
                    {
                    dbg.location(715,21);
                    pushFollow(FOLLOW_policy_in_context1538);
                    p_i=policy();
                    _fsp--;

                    dbg.location(715,29);
                    policies.add((Policy)p_i.lookupValue());

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:715:73: (var= object_name )
                    {
                    dbg.location(715,73);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:715:73: (var= object_name )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:715:74: var= object_name
                    {
                    dbg.location(715,77);
                    pushFollow(FOLLOW_object_name_in_context1546);
                    var=object_name();
                    _fsp--;

                    dbg.location(715,89);
                    
                    		  Symbol s2 = currentScope.getSymbol(input.toString(var.start,var.stop));
                    		  String st=s2.getType();
                    		  try{
                    		  if((st.equals("policy_type_t")!=true)){
                    		  throw(new DataFormatException("rule:context"));
                    	//	  System.out.println("added"+p3.verdict);
                    		  }}catch(DataFormatException dfe)
                    		  {
                    		  System.out.println(dfe);
                    		  }
                    		  Policy p3=(Policy)s2.lookupValue();
                    		  policies.add(p3);
                    		  
                    		  

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}

            dbg.location(732,5);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:5: ( ',' ( (p_j= policy ) | (var2= object_name ) ) )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=2;
                try { dbg.enterDecision(33);

                int LA33_0 = input.LA(1);

                if ( (LA33_0==64) ) {
                    alt33=1;
                }


                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:8: ',' ( (p_j= policy ) | (var2= object_name ) )
            	    {
            	    dbg.location(732,8);
            	    match(input,64,FOLLOW_64_in_context1565); 
            	    dbg.location(732,13);
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:13: ( (p_j= policy ) | (var2= object_name ) )
            	    int alt32=2;
            	    try { dbg.enterSubRule(32);
            	    try { dbg.enterDecision(32);

            	    int LA32_0 = input.LA(1);

            	    if ( ((LA32_0>=83 && LA32_0<=84)) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==ID) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("732:13: ( (p_j= policy ) | (var2= object_name ) )", 32, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(32);}

            	    switch (alt32) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:14: (p_j= policy )
            	            {
            	            dbg.location(732,14);
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:14: (p_j= policy )
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:15: p_j= policy
            	            {
            	            dbg.location(732,18);
            	            pushFollow(FOLLOW_policy_in_context1572);
            	            p_j=policy();
            	            _fsp--;

            	            dbg.location(732,26);
            	            policies.add((Policy)p_j.lookupValue());

            	            }


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:70: (var2= object_name )
            	            {
            	            dbg.location(732,70);
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:70: (var2= object_name )
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:732:71: var2= object_name
            	            {
            	            dbg.location(732,75);
            	            pushFollow(FOLLOW_object_name_in_context1580);
            	            var2=object_name();
            	            _fsp--;

            	            dbg.location(733,6);
            	            
            	            		   Symbol s3 = currentScope.getSymbol(input.toString(var2.start,var2.stop));
            	            		  String st=s3.getType();
            	            		  try{
            	            		  if((st.equals("policy_type_t")!=true)){
            	            		  throw(new DataFormatException("rule:context"));
            	            	//	  System.out.println("added"+p3.verdict);
            	            		  }}catch(DataFormatException dfe)
            	            		  {
            	            		  System.out.println(dfe);
            	            		  }
            	            		  Policy p4=(Policy)s3.lookupValue();
            	            		  policies.add(p4);
            	            		  
            	            		   
            	            		   

            	            }


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(32);}


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}

            dbg.location(748,13);
            match(input,77,FOLLOW_77_in_context1594); 
            dbg.location(749,2);
            
            	Context context = new Context (policies);
            	Symbol s = new Symbol ("context_type_t","context_type_t",context);
            	sym = s;  		
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(755, 2);

        }
        finally {
            dbg.exitRule("context");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end context


    // $ANTLR start policy
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:759:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );
    public final Symbol policy() throws RecognitionException {
        Symbol sym = null;

        direction_return dir = null;

        verdict_return verd = null;

        proto_return protocol = null;

        ip_addr_return dst_ip = null;

        object_name_return dip_obj = null;

        ip_addr_return dnetmask_ip = null;

        object_name_return dnetmask_ip_obj = null;

        port_return dport = null;

        ip_addr_return src_ip = null;

        object_name_return sip_obj = null;

        ip_addr_return snetmask_ip = null;

        object_name_return snetmask_ip_obj = null;

        port_return sport = null;

        icmp_cntrl_message_return icmp_mesg = null;


        try { dbg.enterRule("policy");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(759, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:759:29: (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? )
            int alt48=2;
            try { dbg.enterDecision(48);

            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=83 && LA48_0<=84)) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==85) ) {
                    int LA48_2 = input.LA(3);

                    if ( ((LA48_2>=87 && LA48_2<=88)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_2==ICMP_MESSAGE_TYPE) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("759:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 48, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA48_1==86) ) {
                    int LA48_3 = input.LA(3);

                    if ( ((LA48_3>=87 && LA48_3<=88)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==ICMP_MESSAGE_TYPE) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("759:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 48, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("759:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 48, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("759:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 48, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:760:4: dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )?
                    {
                    dbg.location(760,4);
                    
                      	 String sp;
                      	 sp ="0";
                      	 String dp;
                      	 dp ="0";
                      	 Ipaddress dip;
                      	 dip  = new Ipaddress("0.0.0.0") ;
                      	 Ipaddress dnetmask ;
                      	 dnetmask = new Ipaddress("0.0.0.0");
                      	 Ipaddress sip ;
                      	 sip = new Ipaddress("0.0.0.0");
                      	 Ipaddress snetmask;
                      	 snetmask = new Ipaddress("0.0.0.0");
                      	
                    dbg.location(774,7);
                    pushFollow(FOLLOW_direction_in_policy1627);
                    dir=direction();
                    _fsp--;

                    dbg.location(774,22);
                    pushFollow(FOLLOW_verdict_in_policy1631);
                    verd=verdict();
                    _fsp--;

                    dbg.location(774,39);
                    pushFollow(FOLLOW_proto_in_policy1635);
                    protocol=proto();
                    _fsp--;

                    dbg.location(775,4);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:775:4: ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )?
                    int alt37=2;
                    try { dbg.enterSubRule(37);
                    try { dbg.enterDecision(37);

                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==78) ) {
                        alt37=1;
                    }
                    } finally {dbg.exitDecision(37);}

                    switch (alt37) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:775:5: 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) )
                            {
                            dbg.location(775,5);
                            match(input,78,FOLLOW_78_in_policy1642); 
                            dbg.location(776,6);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:776:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )
                            int alt34=2;
                            try { dbg.enterSubRule(34);
                            try { dbg.enterDecision(34);

                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==NUMBER) ) {
                                alt34=1;
                            }
                            else if ( (LA34_0==ID) ) {
                                alt34=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("776:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )", 34, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(34);}

                            switch (alt34) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:776:7: (dst_ip= ip_addr )
                                    {
                                    dbg.location(776,7);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:776:7: (dst_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:776:8: dst_ip= ip_addr
                                    {
                                    dbg.location(776,15);
                                    pushFollow(FOLLOW_ip_addr_in_policy1656);
                                    dst_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(776,25);
                                     dip = new Ipaddress(input.toString(dst_ip.start,dst_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:777:6: (dip_obj= object_name )
                                    {
                                    dbg.location(777,6);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:777:6: (dip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:777:7: dip_obj= object_name
                                    {
                                    dbg.location(777,15);
                                    pushFollow(FOLLOW_object_name_in_policy1676);
                                    dip_obj=object_name();
                                    _fsp--;

                                    dbg.location(778,7);
                                     Symbol s = currentScope.getSymbol(input.toString(dip_obj.start,dip_obj.stop));   
                                      	   
                                      	   if ( s == null)
                                      	   {
                                      	    System.out.println ("object : "+input.toString(dip_obj.start,dip_obj.stop)+"  not found");
                                      	    } 
                                      	    
                                      	   try{  /* Check fot type exceptions in ip_address */
                                    	  if(s.getType().equals ("ipaddr_t") != true) 
                                    	  { throw (new DataFormatException("policy : tcp/udp:destip"));}
                                    	  }
                                    	  catch (DataFormatException dfe)
                                    	  {
                                    	   System.out.println(dfe);
                                    	   }
                                      	   	
                                      	   dip = (Ipaddress) s.lookupValue(); 

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(34);}

                            dbg.location(796,5);
                            match(input,79,FOLLOW_79_in_policy1697); 
                            dbg.location(796,15);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:796:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
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
                                    new NoViableAltException("796:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )", 35, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(35);}

                            switch (alt35) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:796:16: (dnetmask_ip= ip_addr )
                                    {
                                    dbg.location(796,16);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:796:16: (dnetmask_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:796:17: dnetmask_ip= ip_addr
                                    {
                                    dbg.location(796,28);
                                    pushFollow(FOLLOW_ip_addr_in_policy1703);
                                    dnetmask_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(796,37);
                                    dnetmask = new Ipaddress(input.toString(dnetmask_ip.start,dnetmask_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:6: (dnetmask_ip_obj= object_name )
                                    {
                                    dbg.location(797,6);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:6: (dnetmask_ip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:7: dnetmask_ip_obj= object_name
                                    {
                                    dbg.location(797,23);
                                    pushFollow(FOLLOW_object_name_in_policy1719);
                                    dnetmask_ip_obj=object_name();
                                    _fsp--;

                                    dbg.location(798,6);
                                    Symbol s = currentScope.getSymbol(input.toString(dnetmask_ip_obj.start,dnetmask_ip_obj.stop));  
                                      	  
                                      	  if ( s == null)
                                      	   {
                                      	    System.out.println ("object : "+ input.toString(dnetmask_ip_obj.start,dnetmask_ip_obj.stop)+"  not found");
                                      	    } 
                                      	    
                                      	   try{  /* Check fot type exceptions in ip_address */
                                    	  if(s.getType().equals ("ipaddr_t") != true) 
                                    	  { throw (new DataFormatException("policy : tcp/udp:dest_netmask"));}
                                    	  }
                                    	  catch (DataFormatException dfe)
                                    	  {
                                    	   System.out.println(dfe);
                                    	   }
                                      	  
                                      	  
                                      	   dnetmask = (Ipaddress) s.lookupValue();
                                      	  
                                      	  
                                      	  

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(35);}

                            dbg.location(820,8);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:820:8: ( (dport= port ) | ( 'all' ) )
                            int alt36=2;
                            try { dbg.enterSubRule(36);
                            try { dbg.enterDecision(36);

                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==NUMBER) ) {
                                alt36=1;
                            }
                            else if ( (LA36_0==80) ) {
                                alt36=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("820:8: ( (dport= port ) | ( 'all' ) )", 36, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(36);}

                            switch (alt36) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:820:9: (dport= port )
                                    {
                                    dbg.location(820,9);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:820:9: (dport= port )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:820:10: dport= port
                                    {
                                    dbg.location(820,15);
                                    pushFollow(FOLLOW_port_in_policy1748);
                                    dport=port();
                                    _fsp--;

                                    dbg.location(820,21);
                                    dp = new String(input.toString(dport.start,dport.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:820:57: ( 'all' )
                                    {
                                    dbg.location(820,57);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:820:57: ( 'all' )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:820:58: 'all'
                                    {
                                    dbg.location(820,58);
                                    match(input,80,FOLLOW_80_in_policy1757); 

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(36);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(823,4);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:823:4: ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )?
                    int alt41=2;
                    try { dbg.enterSubRule(41);
                    try { dbg.enterDecision(41);

                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==81) ) {
                        alt41=1;
                    }
                    } finally {dbg.exitDecision(41);}

                    switch (alt41) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:823:5: 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) )
                            {
                            dbg.location(823,5);
                            match(input,81,FOLLOW_81_in_policy1781); 
                            dbg.location(824,4);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:824:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )
                            int alt38=2;
                            try { dbg.enterSubRule(38);
                            try { dbg.enterDecision(38);

                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==NUMBER) ) {
                                alt38=1;
                            }
                            else if ( (LA38_0==ID) ) {
                                alt38=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("824:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )", 38, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(38);}

                            switch (alt38) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:824:5: (src_ip= ip_addr )
                                    {
                                    dbg.location(824,5);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:824:5: (src_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:824:6: src_ip= ip_addr
                                    {
                                    dbg.location(824,13);
                                    pushFollow(FOLLOW_ip_addr_in_policy1792);
                                    src_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(824,23);
                                     sip = new Ipaddress(input.toString(src_ip.start,src_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:825:6: (sip_obj= object_name )
                                    {
                                    dbg.location(825,6);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:825:6: (sip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:825:7: sip_obj= object_name
                                    {
                                    dbg.location(825,15);
                                    pushFollow(FOLLOW_object_name_in_policy1812);
                                    sip_obj=object_name();
                                    _fsp--;

                                    dbg.location(826,7);
                                     Symbol s = currentScope.getSymbol(input.toString(sip_obj.start,sip_obj.stop));   
                                      	   
                                      	   if ( s == null)
                                      	   {
                                      	    System.out.println ("object : "+input.toString(sip_obj.start,sip_obj.stop)+"  not found");
                                      	    } 
                                      	    
                                      	   try{  /* Check fot type exceptions in ip_address */
                                    	  if(s.getType().equals ("ipaddr_t") != true) 
                                    	  { throw (new DataFormatException("policy : tcp/udp:srcip"));}
                                    	  }
                                    	  catch (DataFormatException dfe)
                                    	  {
                                    	   System.out.println(dfe);
                                    	   }
                                      	   
                                      	   sip = (Ipaddress) s.lookupValue(); 

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(38);}

                            dbg.location(844,5);
                            match(input,79,FOLLOW_79_in_policy1833); 
                            dbg.location(844,15);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:844:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
                            int alt39=2;
                            try { dbg.enterSubRule(39);
                            try { dbg.enterDecision(39);

                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==NUMBER) ) {
                                alt39=1;
                            }
                            else if ( (LA39_0==ID) ) {
                                alt39=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("844:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )", 39, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(39);}

                            switch (alt39) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:844:16: (snetmask_ip= ip_addr )
                                    {
                                    dbg.location(844,16);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:844:16: (snetmask_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:844:17: snetmask_ip= ip_addr
                                    {
                                    dbg.location(844,28);
                                    pushFollow(FOLLOW_ip_addr_in_policy1839);
                                    snetmask_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(844,37);
                                    snetmask = new Ipaddress(input.toString(snetmask_ip.start,snetmask_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:845:6: (snetmask_ip_obj= object_name )
                                    {
                                    dbg.location(845,6);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:845:6: (snetmask_ip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:845:7: snetmask_ip_obj= object_name
                                    {
                                    dbg.location(845,23);
                                    pushFollow(FOLLOW_object_name_in_policy1855);
                                    snetmask_ip_obj=object_name();
                                    _fsp--;

                                    dbg.location(846,6);
                                    Symbol s = currentScope.getSymbol(input.toString(snetmask_ip_obj.start,snetmask_ip_obj.stop));  
                                      	  
                                      	  if ( s == null)
                                      	   {
                                      	    System.out.println ("object : "+input.toString(snetmask_ip_obj.start,snetmask_ip_obj.stop)+"  not found");
                                      	    } 
                                      	    
                                      	   try{  /* Check fot type exceptions in ip_address */
                                    	  if(s.getType().equals ("ipaddr_t") != true) 
                                    	  { throw (new DataFormatException("policy : tcp/udp:snetmask"));}
                                    	  }
                                    	  catch (DataFormatException dfe)
                                    	  {
                                    	   System.out.println(dfe);
                                    	   }
                                      	  snetmask = (Ipaddress) s.lookupValue();

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(39);}

                            dbg.location(863,6);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:863:6: ( (sport= port ) | ( 'all' ) )
                            int alt40=2;
                            try { dbg.enterSubRule(40);
                            try { dbg.enterDecision(40);

                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==NUMBER) ) {
                                alt40=1;
                            }
                            else if ( (LA40_0==80) ) {
                                alt40=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("863:6: ( (sport= port ) | ( 'all' ) )", 40, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(40);}

                            switch (alt40) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:863:7: (sport= port )
                                    {
                                    dbg.location(863,7);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:863:7: (sport= port )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:863:8: sport= port
                                    {
                                    dbg.location(863,13);
                                    pushFollow(FOLLOW_port_in_policy1880);
                                    sport=port();
                                    _fsp--;

                                    dbg.location(863,19);
                                    sp = new String(input.toString(sport.start,sport.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:863:55: ( 'all' )
                                    {
                                    dbg.location(863,55);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:863:55: ( 'all' )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:863:56: 'all'
                                    {
                                    dbg.location(863,56);
                                    match(input,80,FOLLOW_80_in_policy1889); 

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(40);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(41);}

                    dbg.location(866,1);
                    
                    	System.out.println (input.toString(dir.start,dir.stop)+input.toString(verd.start,verd.stop)+input.toString(protocol.start,protocol.stop)+sip.getString()+snetmask.getString()+
                    	                                      sp+dip.getString()+ dnetmask.getString()+dp);
                    	
                    	Policy pl = new Policy(input.toString(dir.start,dir.stop),input.toString(verd.start,verd.stop), input.toString(protocol.start,protocol.stop), sip.getString(),snetmask.getString(),
                    		              sp,dip.getString(),dnetmask.getString(),dp);		
                    
                    	 Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
                    	sym = s;
                    
                    	
                    //	currentScope.printSymbols();


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:881:2: dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )?
                    {
                    dbg.location(881,2);
                    
                    	 String sp;
                      	 sp ="0";
                      	 String dp;
                      	 dp ="0";
                      	 Ipaddress dip;
                      	 dip  = new Ipaddress("0.0.0.0");
                      	 Ipaddress dnetmask ;
                      	 dnetmask = new Ipaddress("0.0.0.0");
                      	 Ipaddress sip ;
                      	 sip = new Ipaddress("0.0.0.0" );
                      	 Ipaddress snetmask;
                      	 snetmask = new Ipaddress("0.0.0.0");
                    	
                    dbg.location(896,5);
                    pushFollow(FOLLOW_direction_in_policy1925);
                    dir=direction();
                    _fsp--;

                    dbg.location(896,20);
                    pushFollow(FOLLOW_verdict_in_policy1929);
                    verd=verdict();
                    _fsp--;

                    dbg.location(896,38);
                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy1933);
                    icmp_mesg=icmp_cntrl_message();
                    _fsp--;

                    dbg.location(897,2);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:897:2: ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )?
                    int alt44=2;
                    try { dbg.enterSubRule(44);
                    try { dbg.enterDecision(44);

                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==78) ) {
                        alt44=1;
                    }
                    } finally {dbg.exitDecision(44);}

                    switch (alt44) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:897:3: 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
                            {
                            dbg.location(897,3);
                            match(input,78,FOLLOW_78_in_policy1939); 
                            dbg.location(898,6);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:898:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )
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
                                    new NoViableAltException("898:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )", 42, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(42);}

                            switch (alt42) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:898:7: (dst_ip= ip_addr )
                                    {
                                    dbg.location(898,7);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:898:7: (dst_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:898:8: dst_ip= ip_addr
                                    {
                                    dbg.location(898,15);
                                    pushFollow(FOLLOW_ip_addr_in_policy1953);
                                    dst_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(898,25);
                                     dip = new Ipaddress(input.toString(dst_ip.start,dst_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:899:6: (dip_obj= object_name )
                                    {
                                    dbg.location(899,6);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:899:6: (dip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:899:7: dip_obj= object_name
                                    {
                                    dbg.location(899,15);
                                    pushFollow(FOLLOW_object_name_in_policy1973);
                                    dip_obj=object_name();
                                    _fsp--;

                                    dbg.location(900,7);
                                     Symbol s = currentScope.getSymbol(input.toString(dip_obj.start,dip_obj.stop)); 
                                      	   
                                      	   if ( s == null)
                                      	   {
                                      	    System.out.println ("object : input.toString(dip_obj.start,dip_obj.stop)  not found");
                                      	    } 
                                      	    
                                      	   try{  /* Check fot type exceptions in ip_address */
                                    	  if(s.getType().equals ("ipaddr_t") != true) 
                                    	  { throw (new DataFormatException("policy : icmp:destip"));}
                                    	  }
                                    	  catch (DataFormatException dfe)
                                    	  {
                                    	   System.out.println(dfe);
                                    	   }
                                      	   
                                      	   
                                      	     dip = (Ipaddress) s.lookupValue(); 

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(42);}

                            dbg.location(919,5);
                            match(input,79,FOLLOW_79_in_policy1994); 
                            dbg.location(919,15);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:919:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
                            int alt43=2;
                            try { dbg.enterSubRule(43);
                            try { dbg.enterDecision(43);

                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==NUMBER) ) {
                                alt43=1;
                            }
                            else if ( (LA43_0==ID) ) {
                                alt43=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("919:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )", 43, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(43);}

                            switch (alt43) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:919:16: (dnetmask_ip= ip_addr )
                                    {
                                    dbg.location(919,16);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:919:16: (dnetmask_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:919:17: dnetmask_ip= ip_addr
                                    {
                                    dbg.location(919,28);
                                    pushFollow(FOLLOW_ip_addr_in_policy2000);
                                    dnetmask_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(919,37);
                                    dnetmask = new Ipaddress(input.toString(dnetmask_ip.start,dnetmask_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:920:6: (dnetmask_ip_obj= object_name )
                                    {
                                    dbg.location(920,6);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:920:6: (dnetmask_ip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:920:7: dnetmask_ip_obj= object_name
                                    {
                                    dbg.location(920,23);
                                    pushFollow(FOLLOW_object_name_in_policy2016);
                                    dnetmask_ip_obj=object_name();
                                    _fsp--;

                                    dbg.location(921,6);
                                    Symbol s = currentScope.getSymbol(input.toString(dnetmask_ip_obj.start,dnetmask_ip_obj.stop)); 
                                      	  
                                      	  if ( s == null)
                                      	   {
                                      	    System.out.println ("object : $dnetmask_obj.text  not found");
                                      	    } 
                                      	    
                                      	   try{  /* Check fot type exceptions in ip_address */
                                    	  if(s.getType().equals ("ipaddr_t") != true) 
                                    	  { throw (new DataFormatException("policy : icmp:dnetmask"));}
                                    	  }
                                    	  catch (DataFormatException dfe)
                                    	  {
                                    	   System.out.println(dfe);
                                    	   }
                                      	  
                                      	    dnetmask = (Ipaddress) s.lookupValue();

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(43);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(44);}

                    dbg.location(940,4);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:940:4: ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )?
                    int alt47=2;
                    try { dbg.enterSubRule(47);
                    try { dbg.enterDecision(47);

                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==81) ) {
                        alt47=1;
                    }
                    } finally {dbg.exitDecision(47);}

                    switch (alt47) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:940:5: 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
                            {
                            dbg.location(940,5);
                            match(input,81,FOLLOW_81_in_policy2049); 
                            dbg.location(941,4);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:941:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )
                            int alt45=2;
                            try { dbg.enterSubRule(45);
                            try { dbg.enterDecision(45);

                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==NUMBER) ) {
                                alt45=1;
                            }
                            else if ( (LA45_0==ID) ) {
                                alt45=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("941:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )", 45, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(45);}

                            switch (alt45) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:941:5: (src_ip= ip_addr )
                                    {
                                    dbg.location(941,5);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:941:5: (src_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:941:6: src_ip= ip_addr
                                    {
                                    dbg.location(941,13);
                                    pushFollow(FOLLOW_ip_addr_in_policy2060);
                                    src_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(941,23);
                                     sip = new Ipaddress(input.toString(src_ip.start,src_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:942:6: (sip_obj= object_name )
                                    {
                                    dbg.location(942,6);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:942:6: (sip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:942:7: sip_obj= object_name
                                    {
                                    dbg.location(942,15);
                                    pushFollow(FOLLOW_object_name_in_policy2080);
                                    sip_obj=object_name();
                                    _fsp--;

                                    dbg.location(943,7);
                                     Symbol s = currentScope.getSymbol(input.toString(sip_obj.start,sip_obj.stop));  
                                      	   
                                      	   if ( s == null)
                                      	   {
                                      	    System.out.println ("object : $src_obj.text  not found");
                                      	    } 
                                      	    
                                      	   try{  /* Check fot type exceptions in ip_address */
                                    	  if(s.getType().equals ("ipaddr_t") != true) 
                                    	  { throw (new DataFormatException("policy : icmp:srcip"));}
                                    	  }
                                    	  catch (DataFormatException dfe)
                                    	  {
                                    	   System.out.println(dfe);
                                    	   }
                                      	   
                                      	   
                                      	    sip = (Ipaddress) s.lookupValue(); 

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(45);}

                            dbg.location(962,5);
                            match(input,79,FOLLOW_79_in_policy2101); 
                            dbg.location(962,15);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
                            int alt46=2;
                            try { dbg.enterSubRule(46);
                            try { dbg.enterDecision(46);

                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==NUMBER) ) {
                                alt46=1;
                            }
                            else if ( (LA46_0==ID) ) {
                                alt46=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("962:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )", 46, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(46);}

                            switch (alt46) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:16: (snetmask_ip= ip_addr )
                                    {
                                    dbg.location(962,16);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:16: (snetmask_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:17: snetmask_ip= ip_addr
                                    {
                                    dbg.location(962,28);
                                    pushFollow(FOLLOW_ip_addr_in_policy2107);
                                    snetmask_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(962,37);
                                    dnetmask = new Ipaddress(input.toString(snetmask_ip.start,snetmask_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:963:6: (snetmask_ip_obj= object_name )
                                    {
                                    dbg.location(963,6);
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:963:6: (snetmask_ip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:963:7: snetmask_ip_obj= object_name
                                    {
                                    dbg.location(963,23);
                                    pushFollow(FOLLOW_object_name_in_policy2123);
                                    snetmask_ip_obj=object_name();
                                    _fsp--;

                                    dbg.location(964,6);
                                    Symbol s = currentScope.getSymbol(input.toString(snetmask_ip_obj.start,snetmask_ip_obj.stop)); 
                                      	  
                                      	  if ( s == null)
                                      	   {
                                      	    System.out.println ("object : "+ input.toString(snetmask_ip_obj.start,snetmask_ip_obj.stop)+"  not found");
                                      	    } 
                                      	    
                                      	   try{  /* Check fot type exceptions in ip_address */
                                    	  if(s.getType().equals ("ipaddr_t") != true) 
                                    	  { throw (new DataFormatException("policy : icmp:snetmask"));}
                                    	  }
                                    	  catch (DataFormatException dfe)
                                    	  {
                                    	   System.out.println(dfe);
                                    	   }
                                      	  
                                      	  
                                      	    snetmask = (Ipaddress) s.lookupValue();

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(46);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(47);}

                    dbg.location(985,2);
                    
                    	
                    	Policy pl = new Policy(input.toString(dir.start,dir.stop),input.toString(verd.start,verd.stop), input.toString(icmp_mesg.start,icmp_mesg.stop), dip.getString(),dnetmask.getString(),
                    		               sip.getString(),snetmask.getString());		
                    
                    	 Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
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
        dbg.location(996, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:999:1: topology returns [Symbol sym] : ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) );
    public final Symbol topology() throws RecognitionException {
        Symbol sym = null;

        Symbol host_group_sym = null;

        object_name_return host_group_obj = null;

        Symbol cxt_sym = null;

        object_name_return cxt_obj = null;

        Symbol serv_group_sym = null;

        object_name_return serv_group_obj = null;


        try { dbg.enterRule("topology");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(999, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1001:2: ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) )
            int alt53=2;
            try { dbg.enterDecision(53);

            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            else if ( (LA53_0==82) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("999:1: topology returns [Symbol sym] : ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) );", 53, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(53);}

            switch (alt53) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1003:2: ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    {
                    dbg.location(1003,2);
                    
                    	Hostgroup hg;
                    	Servicegroup sg;
                    	Context cxt;
                    	hg = null;
                    	sg = null;
                    	cxt =null;
                    	
                    	
                    dbg.location(1013,2);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1013:2: ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1013:3: ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    {
                    dbg.location(1013,3);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1013:3: ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1013:4: 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )
                    {
                    dbg.location(1013,4);
                    match(input,30,FOLLOW_30_in_topology2183); 
                    dbg.location(1013,17);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1013:17: ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )
                    int alt49=2;
                    try { dbg.enterSubRule(49);
                    try { dbg.enterDecision(49);

                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==30) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==ID) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1013:17: ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )", 49, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(49);}

                    switch (alt49) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1013:18: (host_group_sym= host_group )
                            {
                            dbg.location(1013,18);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1013:18: (host_group_sym= host_group )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1013:19: host_group_sym= host_group
                            {
                            dbg.location(1013,33);
                            pushFollow(FOLLOW_host_group_in_topology2189);
                            host_group_sym=host_group();
                            _fsp--;

                            dbg.location(1013,45);
                            hg = (Hostgroup)host_group_sym.lookupValue();

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1014:3: (host_group_obj= object_name )
                            {
                            dbg.location(1014,3);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1014:3: (host_group_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1014:5: host_group_obj= object_name
                            {
                            dbg.location(1014,19);
                            pushFollow(FOLLOW_object_name_in_topology2201);
                            host_group_obj=object_name();
                            _fsp--;

                            dbg.location(1015,2);
                            Symbol s  = currentScope.getSymbol (input.toString(host_group_obj.start,host_group_obj.stop)); 
                            	
                            	try{
                            	  if(s.getType().equals ("host_group_type_t") != true) 
                            	  { throw (new DataFormatException("rule : host"));}
                            	  }
                            	  catch (DataFormatException dfe)
                            	  {
                            	   System.out.println(dfe);
                            	    }
                            	    
                            	hg = (Hostgroup) s.lookupValue(); 

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(49);}


                    }

                    dbg.location(1030,3);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1030:3: ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1030:4: 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    {
                    dbg.location(1030,4);
                    match(input,27,FOLLOW_27_in_topology2219); 
                    dbg.location(1030,14);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1030:14: ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    int alt50=2;
                    try { dbg.enterSubRule(50);
                    try { dbg.enterDecision(50);

                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==27) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==ID) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1030:14: ( (cxt_sym= context ) | (cxt_obj= object_name ) )", 50, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(50);}

                    switch (alt50) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1030:15: (cxt_sym= context )
                            {
                            dbg.location(1030,15);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1030:15: (cxt_sym= context )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1030:16: cxt_sym= context
                            {
                            dbg.location(1030,23);
                            pushFollow(FOLLOW_context_in_topology2225);
                            cxt_sym=context();
                            _fsp--;

                            dbg.location(1030,32);
                            cxt = (Context) cxt_sym.lookupValue(); 

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1032:3: (cxt_obj= object_name )
                            {
                            dbg.location(1032,3);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1032:3: (cxt_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1032:5: cxt_obj= object_name
                            {
                            dbg.location(1032,13);
                            pushFollow(FOLLOW_object_name_in_topology2243);
                            cxt_obj=object_name();
                            _fsp--;

                            dbg.location(1032,27);
                            Symbol s = (Symbol)currentScope.getSymbol (input.toString(cxt_obj.start,cxt_obj.stop));
                            	 
                            	 try{
                            	  if(s.getType().equals ("context_type_t") != true) 
                            	  { throw (new DataFormatException("rule : topology: host:context"));}
                            	  }
                            	  catch (DataFormatException dfe)
                            	  {
                            	   System.out.println(dfe);
                            	    }
                            	 
                            	 cxt = (Context) s.lookupValue(); 

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(50);}


                    }

                    dbg.location(1044,2);
                    
                    	 if(hg == null)
                    	 {
                    	  System.out.println("hg is null");	
                    	 }
                    	  if(cxt == null)
                    	 {
                    	  System.out.println("cxt  is null");	
                    	 }
                    	 Topology topology = new Topology(hg,cxt);
                    	 Symbol s = new Symbol("topology_host_group_context","topology_type_t",topology);
                    	 sym = s;	
                    	

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1059:3: ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    {
                    dbg.location(1059,3);
                    
                    	Hostgroup hg;
                    	Servicegroup sg;
                    	Context cxt;
                    	hg = null;
                    	sg = null;
                    	cxt = null;
                    	
                    dbg.location(1068,3);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1068:3: ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1070:3: ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    {
                    dbg.location(1070,3);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1070:3: ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1070:4: 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )
                    {
                    dbg.location(1070,4);
                    match(input,82,FOLLOW_82_in_topology2280); 
                    dbg.location(1070,17);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1070:17: ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )
                    int alt51=2;
                    try { dbg.enterSubRule(51);
                    try { dbg.enterDecision(51);

                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==96) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==ID) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1070:17: ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )", 51, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(51);}

                    switch (alt51) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1070:18: (serv_group_sym= serv_group )
                            {
                            dbg.location(1070,18);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1070:18: (serv_group_sym= serv_group )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1070:19: serv_group_sym= serv_group
                            {
                            dbg.location(1070,33);
                            pushFollow(FOLLOW_serv_group_in_topology2286);
                            serv_group_sym=serv_group();
                            _fsp--;

                            dbg.location(1070,45);
                            sg = (Servicegroup)serv_group_sym.lookupValue();

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1071:4: (serv_group_obj= object_name )
                            {
                            dbg.location(1071,4);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1071:4: (serv_group_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1071:6: serv_group_obj= object_name
                            {
                            dbg.location(1071,20);
                            pushFollow(FOLLOW_object_name_in_topology2299);
                            serv_group_obj=object_name();
                            _fsp--;

                            dbg.location(1072,2);
                            Symbol s  = currentScope.getSymbol (input.toString(serv_group_obj.start,serv_group_obj.stop)); 
                            	
                            	try{
                            	  if(s.getType().equals ("serv_group_type_t") != true) 
                            	  { throw (new DataFormatException("rule : topology : servgroup:context"));}
                            	  }
                            	  catch (DataFormatException dfe)
                            	  {
                            	   System.out.println(dfe);
                            	    }
                            	
                            	sg = (Servicegroup) s.lookupValue(); 

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(51);}


                    }

                    dbg.location(1085,3);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1085:3: ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1085:4: 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    {
                    dbg.location(1085,4);
                    match(input,27,FOLLOW_27_in_topology2315); 
                    dbg.location(1085,14);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1085:14: ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    int alt52=2;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52);

                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==27) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==ID) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1085:14: ( (cxt_sym= context ) | (cxt_obj= object_name ) )", 52, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1085:15: (cxt_sym= context )
                            {
                            dbg.location(1085,15);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1085:15: (cxt_sym= context )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1085:16: cxt_sym= context
                            {
                            dbg.location(1085,23);
                            pushFollow(FOLLOW_context_in_topology2321);
                            cxt_sym=context();
                            _fsp--;

                            dbg.location(1085,32);
                            cxt = (Context) cxt_sym.lookupValue(); 

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1086:3: (cxt_obj= object_name )
                            {
                            dbg.location(1086,3);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1086:3: (cxt_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1086:5: cxt_obj= object_name
                            {
                            dbg.location(1086,13);
                            pushFollow(FOLLOW_object_name_in_topology2336);
                            cxt_obj=object_name();
                            _fsp--;

                            dbg.location(1086,27);
                            Symbol s = (Symbol)currentScope.getSymbol (input.toString(cxt_obj.start,cxt_obj.stop));
                            	 
                            	 try{
                            	  if(s.getType().equals ("context_type_t") != true) 
                            	  { throw (new DataFormatException("rule : topology:servgroup:context"));}
                            	  }
                            	  catch (DataFormatException dfe)
                            	  {
                            	   System.out.println(dfe);
                            	    }
                            	 
                            	 cxt = (Context) s.lookupValue(); 

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}


                    }


                    }

                    dbg.location(1099,3);
                    
                    	 Topology topology = new Topology(sg,cxt);
                    	 Symbol s = new Symbol("topology_serv_group_context","topology_type_t",topology);
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
        dbg.location(1104, 2);

        }
        finally {
            dbg.exitRule("topology");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end topology


    // $ANTLR start int_value
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1108:1: int_value returns [Symbol sym] : e= NUMBER ;
    public final Symbol int_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try { dbg.enterRule("int_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1108, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1109:2: (e= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1109:4: e= NUMBER
            {
            dbg.location(1109,5);
            e=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_int_value2370); 
            dbg.location(1110,3);
            
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
        dbg.location(1134, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1136:1: char_value : CHAR ;
    public final void char_value() throws RecognitionException {
        try { dbg.enterRule("char_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1136, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1137:2: ( CHAR )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1137:11: CHAR
            {
            dbg.location(1137,11);
            match(input,CHAR,FOLLOW_CHAR_in_char_value2395); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1146, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1149:1: direction : ( 'inbound' | 'outbound' );
    public final direction_return direction() throws RecognitionException {
        direction_return retval = new direction_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("direction");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1149, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1150:2: ( 'inbound' | 'outbound' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(1150,2);
            if ( (input.LA(1)>=83 && input.LA(1)<=84) ) {
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
        dbg.location(1152, 2);

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
        public String verd;
    };

    // $ANTLR start verdict
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1154:1: verdict returns [String verd] : ( 'allow' | 'deny' );
    public final verdict_return verdict() throws RecognitionException {
        verdict_return retval = new verdict_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("verdict");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1154, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1154:31: ( 'allow' | 'deny' )
            int alt54=2;
            try { dbg.enterDecision(54);

            int LA54_0 = input.LA(1);

            if ( (LA54_0==85) ) {
                alt54=1;
            }
            else if ( (LA54_0==86) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1154:1: verdict returns [String verd] : ( 'allow' | 'deny' );", 54, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(54);}

            switch (alt54) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1154:34: 'allow'
                    {
                    dbg.location(1154,34);
                    match(input,85,FOLLOW_85_in_verdict2441); 
                    dbg.location(1154,42);
                     retval.verd = new String("allow"); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1155:5: 'deny'
                    {
                    dbg.location(1155,5);
                    match(input,86,FOLLOW_86_in_verdict2449); 
                    dbg.location(1155,12);
                    retval.verd = new String ("deny");

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1156, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1158:1: proto : ( 'udp' | 'tcp' );
    public final proto_return proto() throws RecognitionException {
        proto_return retval = new proto_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("proto");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1158, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1158:9: ( 'udp' | 'tcp' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            dbg.location(1158,9);
            if ( (input.LA(1)>=87 && input.LA(1)<=88) ) {
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
        dbg.location(1159, 10);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1161:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final icmp_cntrl_message_return icmp_cntrl_message() throws RecognitionException {
        icmp_cntrl_message_return retval = new icmp_cntrl_message_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("icmp_cntrl_message");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1161, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1162:2: ( ICMP_MESSAGE_TYPE )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1162:4: ICMP_MESSAGE_TYPE
            {
            dbg.location(1162,4);
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message2481); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1163, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1165:1: port : NUMBER ;
    public final port_return port() throws RecognitionException {
        port_return retval = new port_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1165, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1165:6: ( NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1165:8: NUMBER
            {
            dbg.location(1165,8);
            match(input,NUMBER,FOLLOW_NUMBER_in_port2491); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1165, 14);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1168:1: object_name returns [String obj_name] : ID ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        Token ID13=null;

        try { dbg.enterRule("object_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1168, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1169:2: ( ID )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1169:5: ID
            {
            dbg.location(1169,5);
            ID13=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_object_name2506); 
            dbg.location(1170,2);
             retval.obj_name = new String (ID13.getText());
            	   
            	

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1173, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:1: ip_addr returns [Symbol sym] : (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) ;
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
        dbg.location(1197, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:32: ( (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:35: (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER )
            {
            dbg.location(1197,35);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:35: (a= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:36: a= NUMBER
            {
            dbg.location(1197,37);
            a=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2543); 

            }

            dbg.location(1197,45);
            match(input,DOT,FOLLOW_DOT_in_ip_addr2545); 
            dbg.location(1197,48);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:48: (b= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:49: b= NUMBER
            {
            dbg.location(1197,50);
            b=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2549); 

            }

            dbg.location(1197,58);
            match(input,DOT,FOLLOW_DOT_in_ip_addr2551); 
            dbg.location(1197,61);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:61: (c= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:62: c= NUMBER
            {
            dbg.location(1197,63);
            c=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2555); 

            }

            dbg.location(1197,71);
            match(input,DOT,FOLLOW_DOT_in_ip_addr2557); 
            dbg.location(1197,74);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:74: (d= NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:75: d= NUMBER
            {
            dbg.location(1197,76);
            d=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2561); 

            }

            dbg.location(1198,2);
            
            			
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
        dbg.location(1208, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1213:1: nmask : 'netmask' ip_addr ;
    public final void nmask() throws RecognitionException {
        try { dbg.enterRule("nmask");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1213, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1213:7: ( 'netmask' ip_addr )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1213:9: 'netmask' ip_addr
            {
            dbg.location(1213,9);
            match(input,79,FOLLOW_79_in_nmask2581); 
            dbg.location(1213,19);
            pushFollow(FOLLOW_ip_addr_in_nmask2583);
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
        dbg.location(1213, 26);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1227:1: host returns [Symbol sym] : 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) ;
    public final Symbol host() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return ip_string = null;

        object_name_return ip_obj = null;

        ip_addr_return netmask_string = null;

        object_name_return netmask_ip_obj = null;


        try { dbg.enterRule("host");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1227, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1227:26: ( 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1228:2: 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            {
            dbg.location(1228,2);
            boolean ip_object_used =false, netmask_object_used = false;
            dbg.location(1229,3);
            match(input,89,FOLLOW_89_in_host2605); 
            dbg.location(1229,13);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1229:13: (ip_string= ip_addr | (ip_obj= object_name ) )
            int alt55=2;
            try { dbg.enterSubRule(55);
            try { dbg.enterDecision(55);

            int LA55_0 = input.LA(1);

            if ( (LA55_0==NUMBER) ) {
                alt55=1;
            }
            else if ( (LA55_0==ID) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1229:13: (ip_string= ip_addr | (ip_obj= object_name ) )", 55, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1229:14: ip_string= ip_addr
                    {
                    dbg.location(1229,23);
                    pushFollow(FOLLOW_ip_addr_in_host2610);
                    ip_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1229:32: (ip_obj= object_name )
                    {
                    dbg.location(1229,32);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1229:32: (ip_obj= object_name )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1229:33: ip_obj= object_name
                    {
                    dbg.location(1229,39);
                    pushFollow(FOLLOW_object_name_in_host2615);
                    ip_obj=object_name();
                    _fsp--;

                    dbg.location(1229,52);
                    ip_object_used=true; 

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(55);}

            dbg.location(1229,79);
            match(input,79,FOLLOW_79_in_host2622); 
            dbg.location(1229,89);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1229:89: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            int alt56=2;
            try { dbg.enterSubRule(56);
            try { dbg.enterDecision(56);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==NUMBER) ) {
                alt56=1;
            }
            else if ( (LA56_0==ID) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1229:89: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )", 56, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1229:90: netmask_string= ip_addr
                    {
                    dbg.location(1229,104);
                    pushFollow(FOLLOW_ip_addr_in_host2627);
                    netmask_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1230:21: (netmask_ip_obj= object_name )
                    {
                    dbg.location(1230,21);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1230:21: (netmask_ip_obj= object_name )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1230:22: netmask_ip_obj= object_name
                    {
                    dbg.location(1230,37);
                    pushFollow(FOLLOW_object_name_in_host2657);
                    netmask_ip_obj=object_name();
                    _fsp--;

                    dbg.location(1230,51);
                    netmask_object_used = true;

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(56);}

            dbg.location(1231,1);
            
            	Host h;
            	if(ip_object_used == true && netmask_object_used ==false)
            	{
            	  Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
            	 
            	 /* Check for type error  in ipaddres*/
            	 try{
            	  if(s.getType().equals ("ipaddr_t") != true) 
            	  { throw (new DataFormatException("rule : host"));}
            	  }
            	  catch (DataFormatException dfe)
            	  {
            	   System.out.println(dfe);
            	    
            	   }
            	   
            	  Ipaddress ip = (Ipaddress) s.lookupValue();
            	  h = new Host	( ip.getString(),input.toString(netmask_string.start,netmask_string.stop));
            	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            	 sym = s_ret;
            	}
            	else if (ip_object_used == false  && netmask_object_used ==true)
            	{
                  	  Symbol s = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
                  	  
                  	  /* Check for type error in netmask  */
                  	   try{
            	  if(s.getType().equals ("ipaddr_t") != true) 
            	  { throw (new DataFormatException("rule : host"));}
            	  }
            	  catch (DataFormatException dfe)
            	  {
            	   System.out.println(dfe);
            	   }
                  	  
            	  Ipaddress ip = (Ipaddress) s.lookupValue();
            	  h = new Host	( input.toString(ip_string.start,ip_string.stop),ip.getString());
            	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            	  sym = s_ret;
            	}
            	else if(ip_object_used ==true && netmask_object_used ==true)
            	{
            	
            	  Symbol s_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
            	
            	 try{  /* Check fot type exceptions in ip_address */
            	  if(s_ip.getType().equals ("ipaddr_t") != true) 
            	  { throw (new DataFormatException("rule : host"));}
            	  }
            	  catch (DataFormatException dfe)
            	  {
            	   System.out.println(dfe);
            	   }
            	
            	
            	  Ipaddress ip = (Ipaddress) s_ip.lookupValue();
            	 
              	  Symbol s_nmask = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
            	
            	 try{  /* Check for type exception in netmask  */
            	  if(s_nmask.getType().equals ("ipaddr_t") != true) 
            	  { throw (new DataFormatException("rule : host"));}
            	  }
            	  catch (DataFormatException dfe)
            	  {
            	   System.out.println(dfe);
            	   }
            	  
            	  
            	  Ipaddress nmask = (Ipaddress) s_nmask.lookupValue();
            	  h = new Host	( ip.getString(),nmask.getString());
            	  Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            	 sym = s_ret;
            	
            	}
            	else{
            	h = new Host (input.toString(ip_string.start,ip_string.stop),input.toString(netmask_string.start,netmask_string.stop)); //usure about the text error
            	Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            	
            	/* Check for type exceptions */
            	  
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
        dbg.location(1317, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1324:1: dns_set : ip_addr ( ',' ip_addr )* ;
    public final void dns_set() throws RecognitionException {
        try { dbg.enterRule("dns_set");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1324, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1324:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1324:11: ip_addr ( ',' ip_addr )*
            {
            dbg.location(1324,11);
            pushFollow(FOLLOW_ip_addr_in_dns_set2676);
            ip_addr();
            _fsp--;

            dbg.location(1324,19);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1324:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(57);

            loop57:
            do {
                int alt57=2;
                try { dbg.enterDecision(57);

                int LA57_0 = input.LA(1);

                if ( (LA57_0==64) ) {
                    alt57=1;
                }


                } finally {dbg.exitDecision(57);}

                switch (alt57) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1324:20: ',' ip_addr
            	    {
            	    dbg.location(1324,20);
            	    match(input,64,FOLLOW_64_in_dns_set2679); 
            	    dbg.location(1324,25);
            	    pushFollow(FOLLOW_ip_addr_in_dns_set2682);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);
            } finally {dbg.exitSubRule(57);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1324, 34);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1326:1: gateway : ip_addr ( ',' ip_addr )* ;
    public final void gateway() throws RecognitionException {
        try { dbg.enterRule("gateway");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1326, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1326:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1326:11: ip_addr ( ',' ip_addr )*
            {
            dbg.location(1326,11);
            pushFollow(FOLLOW_ip_addr_in_gateway2692);
            ip_addr();
            _fsp--;

            dbg.location(1326,19);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1326:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(58);

            loop58:
            do {
                int alt58=2;
                try { dbg.enterDecision(58);

                int LA58_0 = input.LA(1);

                if ( (LA58_0==64) ) {
                    alt58=1;
                }


                } finally {dbg.exitDecision(58);}

                switch (alt58) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1326:20: ',' ip_addr
            	    {
            	    dbg.location(1326,20);
            	    match(input,64,FOLLOW_64_in_gateway2695); 
            	    dbg.location(1326,24);
            	    pushFollow(FOLLOW_ip_addr_in_gateway2697);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);
            } finally {dbg.exitSubRule(58);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1326, 33);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1329:1: host_group returns [Symbol sym] : 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}' ;
    public final Symbol host_group() throws RecognitionException {
        Symbol sym = null;

        Symbol i = null;

        object_name_return host_obj_i = null;

        Symbol j = null;

        object_name_return host_obj_j = null;


        try { dbg.enterRule("host_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1329, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1330:2: ( 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1331:2: 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}'
            {
            dbg.location(1331,2);
            
            	Vector <Host> hosts;
            	hosts = new Vector <Host> ();
            	
            dbg.location(1335,2);
            match(input,30,FOLLOW_30_in_host_group2718); 
            dbg.location(1335,16);
            match(input,76,FOLLOW_76_in_host_group2721); 
            dbg.location(1335,19);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1335:19: (i= host | (host_obj_i= object_name ) )
            int alt59=2;
            try { dbg.enterSubRule(59);
            try { dbg.enterDecision(59);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==89) ) {
                alt59=1;
            }
            else if ( (LA59_0==ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1335:19: (i= host | (host_obj_i= object_name ) )", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1335:21: i= host
                    {
                    dbg.location(1335,22);
                    pushFollow(FOLLOW_host_in_host_group2726);
                    i=host();
                    _fsp--;

                    dbg.location(1335,29);
                    hosts.add((Host)i.lookupValue()); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1335:67: (host_obj_i= object_name )
                    {
                    dbg.location(1335,67);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1335:67: (host_obj_i= object_name )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1335:68: host_obj_i= object_name
                    {
                    dbg.location(1335,78);
                    pushFollow(FOLLOW_object_name_in_host_group2735);
                    host_obj_i=object_name();
                    _fsp--;

                    dbg.location(1335,91);
                    
                    	Symbol hostsym =  currentScope.getSymbol(input.toString(host_obj_i.start,host_obj_i.stop));
                    	
                    	try{ 
                    	  if(hostsym.getType().equals ("host_type_t") != true) 
                    	  { throw (new DataFormatException("rule : host_group"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	Host host = (Host) hostsym.lookupValue();
                    	hosts.add(host);

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(59);}

            dbg.location(1351,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:3: ( ',' (j= host | (host_obj_j= object_name ) ) )*
            try { dbg.enterSubRule(61);

            loop61:
            do {
                int alt61=2;
                try { dbg.enterDecision(61);

                int LA61_0 = input.LA(1);

                if ( (LA61_0==64) ) {
                    alt61=1;
                }


                } finally {dbg.exitDecision(61);}

                switch (alt61) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:4: ',' (j= host | (host_obj_j= object_name ) )
            	    {
            	    dbg.location(1351,4);
            	    match(input,64,FOLLOW_64_in_host_group2748); 
            	    dbg.location(1351,8);
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:8: (j= host | (host_obj_j= object_name ) )
            	    int alt60=2;
            	    try { dbg.enterSubRule(60);
            	    try { dbg.enterDecision(60);

            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==89) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==ID) ) {
            	        alt60=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1351:8: (j= host | (host_obj_j= object_name ) )", 60, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(60);}

            	    switch (alt60) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:9: j= host
            	            {
            	            dbg.location(1351,10);
            	            pushFollow(FOLLOW_host_in_host_group2753);
            	            j=host();
            	            _fsp--;

            	            dbg.location(1351,16);
            	            hosts.add((Host)j.lookupValue());

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:54: (host_obj_j= object_name )
            	            {
            	            dbg.location(1351,54);
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:54: (host_obj_j= object_name )
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:55: host_obj_j= object_name
            	            {
            	            dbg.location(1351,66);
            	            pushFollow(FOLLOW_object_name_in_host_group2764);
            	            host_obj_j=object_name();
            	            _fsp--;

            	            dbg.location(1351,79);
            	            
            	            	Symbol hostsym =  currentScope.getSymbol(input.toString(host_obj_j.start,host_obj_j.stop));
            	            	
            	            	try{ 
            	            	  if(hostsym.getType().equals ("host_type_t") != true) 
            	            	  { throw (new DataFormatException("rule : host_group"));}
            	            	  }
            	            	  catch (DataFormatException dfe)
            	            	  {
            	            	   System.out.println(dfe);
            	            	   }
            	            	
            	            	Host host = (Host) hostsym.lookupValue();
            	            	hosts.add(host); 

            	            }


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(60);}


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);
            } finally {dbg.exitSubRule(61);}

            dbg.location(1365,9);
            match(input,77,FOLLOW_77_in_host_group2775); 
            dbg.location(1366,2);
            
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
        dbg.location(1371, 2);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1373:1: interf returns [Symbol sym] : 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )* ;
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
        dbg.location(1373, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1374:2: ( 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )* )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1374:4: 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )*
            {
            dbg.location(1374,4);
             
            	     Vector <Ipaddress> dns_ip;
            	       dns_ip = new Vector <Ipaddress>() ;	     
            	       boolean dns_used = false;
            	       boolean defgw_used = false;
            	       Interface iface;
            	         
            dbg.location(1381,3);
            match(input,90,FOLLOW_90_in_interf2806); 
            dbg.location(1381,12);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:12: (interface_name= ID )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:13: interface_name= ID
            {
            dbg.location(1381,27);
            interface_name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_interf2811); 

            }

            dbg.location(1381,32);
            System.out.println(interface_name.getText());
            dbg.location(1381,88);
            pushFollow(FOLLOW_ip_addr_in_interf2819);
            interface_ip=ip_addr();
            _fsp--;

            dbg.location(1381,98);
            match(input,79,FOLLOW_79_in_interf2821); 
            dbg.location(1381,125);
            pushFollow(FOLLOW_ip_addr_in_interf2826);
            interface_netmask=ip_addr();
            _fsp--;

            dbg.location(1382,2);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1382:2: ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )*
            try { dbg.enterSubRule(63);

            loop63:
            do {
                int alt63=2;
                try { dbg.enterDecision(63);

                int LA63_0 = input.LA(1);

                if ( (LA63_0==91) ) {
                    alt63=1;
                }


                } finally {dbg.exitDecision(63);}

                switch (alt63) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1382:4: 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}'
            	    {
            	    dbg.location(1382,4);
            	    match(input,91,FOLLOW_91_in_interf2832); 
            	    dbg.location(1382,11);
            	    match(input,76,FOLLOW_76_in_interf2835); 
            	    dbg.location(1382,16);
            	    pushFollow(FOLLOW_ip_addr_in_interf2839);
            	    i=ip_addr();
            	    _fsp--;

            	    dbg.location(1382,25);
            	    dns_ip.add(new Ipaddress(input.toString(i.start,i.stop)));
            	    dbg.location(1382,64);
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1382:64: ( ',' j= ip_addr )*
            	    try { dbg.enterSubRule(62);

            	    loop62:
            	    do {
            	        int alt62=2;
            	        try { dbg.enterDecision(62);

            	        int LA62_0 = input.LA(1);

            	        if ( (LA62_0==64) ) {
            	            alt62=1;
            	        }


            	        } finally {dbg.exitDecision(62);}

            	        switch (alt62) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1382:66: ',' j= ip_addr
            	    	    {
            	    	    dbg.location(1382,66);
            	    	    match(input,64,FOLLOW_64_in_interf2846); 
            	    	    dbg.location(1382,72);
            	    	    pushFollow(FOLLOW_ip_addr_in_interf2851);
            	    	    j=ip_addr();
            	    	    _fsp--;

            	    	    dbg.location(1382,80);
            	    	    dns_ip.add(new Ipaddress(input.toString(j.start,j.stop)));

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop62;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(62);}

            	    dbg.location(1382,121);
            	    match(input,77,FOLLOW_77_in_interf2857); 
            	    dbg.location(1383,5);
            	    dns_used = true;

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);
            } finally {dbg.exitSubRule(63);}

            dbg.location(1384,3);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1384:3: ( 'defgw' gw_ip= ip_addr )*
            try { dbg.enterSubRule(64);

            loop64:
            do {
                int alt64=2;
                try { dbg.enterDecision(64);

                int LA64_0 = input.LA(1);

                if ( (LA64_0==92) ) {
                    alt64=1;
                }


                } finally {dbg.exitDecision(64);}

                switch (alt64) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1384:5: 'defgw' gw_ip= ip_addr
            	    {
            	    dbg.location(1384,5);
            	    match(input,92,FOLLOW_92_in_interf2875); 
            	    dbg.location(1384,19);
            	    pushFollow(FOLLOW_ip_addr_in_interf2880);
            	    gw_ip=ip_addr();
            	    _fsp--;

            	    dbg.location(1384,28);
            	    defgw_used = true;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);
            } finally {dbg.exitSubRule(64);}

            dbg.location(1385,2);
            
            	String interf_name = interface_name.getText();
            	String interf_ip = input.toString(interface_ip.start,interface_ip.stop);
            	String interf_netmask = input.toString(interface_netmask.start,interface_netmask.stop);
            	String interf_gw = null;
            	if(defgw_used == true)
            	 {
            	  interf_gw = input.toString(gw_ip.start,gw_ip.stop);
            	 }
            	 if(dns_used == true){
            	   iface = new Interface (interf_name,interf_ip,interf_netmask,interf_gw, dns_ip);
            	}
            	else{
            	 iface = new Interface (interf_name,interf_ip,interf_netmask,interf_gw, null);
            	}
            	
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
        dbg.location(1403, 4);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1405:1: route returns [Symbol sym] : ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) );
    public final Symbol route() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return dst = null;

        object_name_return ip_obj = null;

        ip_addr_return gw = null;

        object_name_return gw_ip_obj = null;

        ip_addr_return netmask_ip = null;

        object_name_return nm_ip_obj = null;


        try { dbg.enterRule("route");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1405, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1405:28: ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) )
            int alt70=2;
            try { dbg.enterDecision(70);

            int LA70_0 = input.LA(1);

            if ( (LA70_0==93) ) {
                alt70=1;
            }
            else if ( (LA70_0==95) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1405:1: route returns [Symbol sym] : ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) );", 70, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1406:1: 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) )
                    {
                    dbg.location(1406,1);
                    
                       boolean ip_object_used , gw_object_used,nm_object_used ;
                       ip_object_used = false;
                       gw_object_used = false;
                       nm_object_used=false;

                    dbg.location(1412,1);
                    match(input,93,FOLLOW_93_in_route2905); 
                    dbg.location(1412,8);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:8: (dst= ip_addr | (ip_obj= object_name ) )
                    int alt65=2;
                    try { dbg.enterSubRule(65);
                    try { dbg.enterDecision(65);

                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==NUMBER) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==ID) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1412:8: (dst= ip_addr | (ip_obj= object_name ) )", 65, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(65);}

                    switch (alt65) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:9: dst= ip_addr
                            {
                            dbg.location(1412,12);
                            pushFollow(FOLLOW_ip_addr_in_route2910);
                            dst=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:21: (ip_obj= object_name )
                            {
                            dbg.location(1412,21);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:21: (ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:22: ip_obj= object_name
                            {
                            dbg.location(1412,29);
                            pushFollow(FOLLOW_object_name_in_route2916);
                            ip_obj=object_name();
                            _fsp--;

                            dbg.location(1412,42);
                            ip_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(65);}

                    dbg.location(1412,67);
                    match(input,94,FOLLOW_94_in_route2922); 
                    dbg.location(1412,72);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:72: (gw= ip_addr | (gw_ip_obj= object_name ) )
                    int alt66=2;
                    try { dbg.enterSubRule(66);
                    try { dbg.enterDecision(66);

                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NUMBER) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==ID) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1412:72: (gw= ip_addr | (gw_ip_obj= object_name ) )", 66, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(66);}

                    switch (alt66) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:73: gw= ip_addr
                            {
                            dbg.location(1412,75);
                            pushFollow(FOLLOW_ip_addr_in_route2927);
                            gw=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:84: (gw_ip_obj= object_name )
                            {
                            dbg.location(1412,84);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:84: (gw_ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1412:85: gw_ip_obj= object_name
                            {
                            dbg.location(1412,95);
                            pushFollow(FOLLOW_object_name_in_route2934);
                            gw_ip_obj=object_name();
                            _fsp--;

                            dbg.location(1412,108);
                            gw_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(66);}

                    dbg.location(1413,1);
                    
                    		
                    	if(ip_object_used == true && gw_object_used ==false)
                    	{
                    	  Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	 
                    	 /* Check for type error  in ipaddres*/
                    	 try{
                    	  if(s.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	    }
                    	   
                    	  Ipaddress ip = (Ipaddress) s.lookupValue();
                    	  Route rh = new Route (ip.getString(),input.toString(gw.start,gw.stop));
                    	  Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
                    	 sym = s_ret;
                    	
                    	}
                    	else if (ip_object_used == false  && gw_object_used ==true)
                    	{
                          	  Symbol s = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                          	  
                          	  /* Check for type error in netmask  */
                          	   try{
                    	  if(s.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                          	  
                    	  Ipaddress gwip = (Ipaddress) s.lookupValue();
                    	  Route rh = new Route (input.toString(ip_obj.start,ip_obj.stop),gwip.getString());//it should be input.toString(dst.start,dst.stop) instead of ip_obj
                    	  Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
                    	  sym = s_ret;
                    	}
                    	else if(ip_object_used ==true && gw_object_used ==true)
                    	{
                    	
                    	  Symbol dst_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	
                    	 try{  /* Check fot type exceptions in ip_address */
                    	  if(dst_ip.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	
                    	  Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
                    	 
                      	  Symbol dst_gw = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                    	
                    	 try{  /* Check for type exception in netmask  */
                    	  if(dst_gw.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	  
                    	  
                    	  Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
                    	 
                    	 Route rh = new Route (ip.getString(),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_host_string", "host_type_t", rh);
                    	 sym = s_ret;
                    	
                    	}
                    	 else{
                    	  Route rh = new Route (input.toString(dst.start,dst.stop), input.toString(gw.start,gw.stop));
                    	  Symbol s_ret = new Symbol("host_route_string", "route_type_t", rh);
                    	  sym = s_ret;
                    	  }
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1498:2: 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) )
                    {
                    dbg.location(1498,2);
                    
                    	 boolean  ip_object_used,nm_object_used , gw_object_used ;
                    	 ip_object_used = false;
                    	 nm_object_used = false;
                    	 gw_object_used = false;
                    	 
                    dbg.location(1505,3);
                    match(input,95,FOLLOW_95_in_route2956); 
                    dbg.location(1505,9);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:9: (dst= ip_addr | (ip_obj= object_name ) )
                    int alt67=2;
                    try { dbg.enterSubRule(67);
                    try { dbg.enterDecision(67);

                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==NUMBER) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==ID) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1505:9: (dst= ip_addr | (ip_obj= object_name ) )", 67, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(67);}

                    switch (alt67) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:10: dst= ip_addr
                            {
                            dbg.location(1505,13);
                            pushFollow(FOLLOW_ip_addr_in_route2961);
                            dst=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:22: (ip_obj= object_name )
                            {
                            dbg.location(1505,22);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:22: (ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:23: ip_obj= object_name
                            {
                            dbg.location(1505,29);
                            pushFollow(FOLLOW_object_name_in_route2966);
                            ip_obj=object_name();
                            _fsp--;

                            dbg.location(1505,41);
                            ip_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(67);}

                    dbg.location(1505,66);
                    match(input,79,FOLLOW_79_in_route2971); 
                    dbg.location(1505,76);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:76: (netmask_ip= ip_addr | (nm_ip_obj= object_name ) )
                    int alt68=2;
                    try { dbg.enterSubRule(68);
                    try { dbg.enterDecision(68);

                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==NUMBER) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==ID) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1505:76: (netmask_ip= ip_addr | (nm_ip_obj= object_name ) )", 68, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(68);}

                    switch (alt68) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:77: netmask_ip= ip_addr
                            {
                            dbg.location(1505,87);
                            pushFollow(FOLLOW_ip_addr_in_route2976);
                            netmask_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:96: (nm_ip_obj= object_name )
                            {
                            dbg.location(1505,96);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:96: (nm_ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1505:97: nm_ip_obj= object_name
                            {
                            dbg.location(1505,106);
                            pushFollow(FOLLOW_object_name_in_route2981);
                            nm_ip_obj=object_name();
                            _fsp--;

                            dbg.location(1505,118);
                            nm_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(68);}

                    dbg.location(1506,3);
                    match(input,94,FOLLOW_94_in_route2989); 
                    dbg.location(1506,8);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1506:8: (gw= ip_addr | (gw_ip_obj= object_name ) )
                    int alt69=2;
                    try { dbg.enterSubRule(69);
                    try { dbg.enterDecision(69);

                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NUMBER) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==ID) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1506:8: (gw= ip_addr | (gw_ip_obj= object_name ) )", 69, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(69);}

                    switch (alt69) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1506:9: gw= ip_addr
                            {
                            dbg.location(1506,11);
                            pushFollow(FOLLOW_ip_addr_in_route2995);
                            gw=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1506:21: (gw_ip_obj= object_name )
                            {
                            dbg.location(1506,21);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1506:21: (gw_ip_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1506:22: gw_ip_obj= object_name
                            {
                            dbg.location(1506,31);
                            pushFollow(FOLLOW_object_name_in_route3000);
                            gw_ip_obj=object_name();
                            _fsp--;

                            dbg.location(1506,43);
                            gw_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(69);}

                    dbg.location(1507,2);
                    
                    	 if((ip_object_used ==true )&& (nm_object_used==false) && (gw_object_used==false))
                    	 {
                    	 Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	 
                    	 try{
                    	  if(s.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	    }
                    	   
                    	  Ipaddress ip = (Ipaddress) s.lookupValue();
                    	  Route rn = new Route (ip.getString(),input.toString(netmask_ip.start,netmask_ip.stop),input.toString(gw.start,gw.stop));
                    	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rn);
                    	 sym = s_ret;
                    	 
                    	 }
                    	 else if(ip_object_used ==false && nm_object_used==true && gw_object_used==false)
                    	 {
                    	 Symbol s = currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                          	  
                          	  /* Check for type error in netmask  */
                          	   try{
                    	  if(s.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                          	  
                    	  Ipaddress nmip = (Ipaddress) s.lookupValue();
                    	  Route rn = new Route (input.toString(dst.start,dst.stop),nmip.getString(),input.toString(gw.start,gw.stop));
                    	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rn);
                    	  sym = s_ret;
                    	 }
                    	 else if(ip_object_used ==false && nm_object_used==false && gw_object_used==true)
                    	 {
                    	 
                    	 Symbol s = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                          	  
                          	  /* Check for type error in netmask  */
                          	   try{
                    	  if(s.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                          	  
                    	  Ipaddress gwip = (Ipaddress) s.lookupValue();
                    	  Route rh = new Route (input.toString(dst.start,dst.stop),input.toString(netmask_ip.start,netmask_ip.stop),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    	  sym = s_ret;
                    	 
                    	 }
                    	 
                    	 
                    	 else if(ip_object_used ==true && nm_object_used==true && gw_object_used==false)
                    	 {
                    	 	 	 	
                    	  Symbol dst_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	
                    	 try{  /* Check fot type exceptions in ip_address */
                    	  if(dst_ip.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	  Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
                    	 
                      	  Symbol dst_nm = currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    	
                    	 try{  /* Check for type exception in netmask  */
                    	  if(dst_nm.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	  
                    	  
                    	  Ipaddress nmip = (Ipaddress) dst_nm.lookupValue();
                    	 
                    	 Route rh = new Route (ip.getString(),nmip.getString(),input.toString(gw.start,gw.stop));
                    	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    	 sym = s_ret;
                    	 
                    	 
                    	 }
                    	 else if(ip_object_used ==true && nm_object_used==false && gw_object_used==true)
                    	 {
                    	 
                    	   Symbol dst_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	
                    	 try{  /* Check fot type exceptions in ip_address */
                    	  if(dst_ip.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	
                    	  Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
                    	 
                      	  Symbol dst_gw = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                    	
                    	 try{  /* Check for type exception in netmask  */
                    	  if(dst_gw.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	  
                    	  
                    	  Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
                    	 
                    	 Route rh = new Route (ip.getString(),input.toString(netmask_ip.start,netmask_ip.stop),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    	 sym = s_ret;
                    	 }
                    	 else if(ip_object_used ==false && nm_object_used==true && gw_object_used==true)
                    	 {
                    	 
                    	   Symbol nm_ip =  currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    	
                    	 try{  /* Check fot type exceptions in ip_address */
                    	  if(nm_ip.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	
                    	  Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
                    	 
                      	  Symbol dst_gw = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                    	
                    	 try{  /* Check for type exception in netmask  */
                    	  if(dst_gw.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	  
                    	  
                    	  Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
                    	 
                    	 Route rh = new Route (input.toString(dst.start,dst.stop),nmip.getString(),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    	 sym = s_ret;
                    	 }
                    	 else if(ip_object_used ==true && nm_object_used==true && gw_object_used==true)
                    	 {
                    	 	
                    	  Symbol dst_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	
                    	 try{  /* Check fot type exceptions in ip_address */
                    	  if(dst_ip.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	
                    	  Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
                    	 	
                    	 	 	
                    	  Symbol nm_ip =  currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    	
                    	 try{  /* Check fot type exceptions in ip_address */
                    	  if(nm_ip.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	
                    	  Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
                    	 
                      	  Symbol dst_gw = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                    	
                    	 try{  /* Check for type exception in netmask  */
                    	  if(dst_gw.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:net"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	  
                    	  
                    	  Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
                    	 
                    	 Route rh = new Route (ip.getString(),nmip.getString(),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    	 sym = s_ret;
                    	 }
                    	 else
                    	 {
                    	 Route rn = new Route (input.toString(dst.start,dst.stop),input.toString(netmask_ip.start,netmask_ip.stop),input.toString(gw.start,gw.stop));
                       	  Symbol s = new Symbol("net_route_string", "route_type_t", rn);
                    	  sym = s;
                    	  }
                    	  


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
        dbg.location(1733, 1);

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1747:1: serv_group returns [Symbol sym] : 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}' ;
    public final Symbol serv_group() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return serv_ip_str = null;

        object_name_return serv_ip_obj = null;

        ip_addr_return serv_netmask_str = null;

        object_name_return serv_netmask_obj = null;

        serv_listen_port_return serv_port_str = null;

        ip_addr_return extra_ip_str = null;

        object_name_return extra_ip_obj = null;

        ip_addr_return extra_serv_netmask_str = null;

        object_name_return extra_serv_netmask_obj = null;

        serv_listen_port_return extra_serv_port_str = null;


        try { dbg.enterRule("serv_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1747, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1748:2: ( 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}' )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1749:2: 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}'
            {
            dbg.location(1749,2);
            
            	 Ipaddress serviceIp;
            	 serviceIp = new Ipaddress ("0.0.0.0");
            	 Ipaddress serviceNetmask;
            	 serviceNetmask = new Ipaddress("0.0.0.0");
            	 String servicePort;
            	 servicePort = "0";
            	Vector <Servicedescriptor> sDesc;
            	sDesc = new Vector <Servicedescriptor> ();
            	
            dbg.location(1760,2);
            match(input,96,FOLLOW_96_in_serv_group3038); 
            dbg.location(1760,18);
            match(input,76,FOLLOW_76_in_serv_group3040); 
            dbg.location(1760,22);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1760:22: ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) )
            int alt71=2;
            try { dbg.enterSubRule(71);
            try { dbg.enterDecision(71);

            int LA71_0 = input.LA(1);

            if ( (LA71_0==NUMBER) ) {
                alt71=1;
            }
            else if ( (LA71_0==ID) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1760:22: ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) )", 71, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1760:23: (serv_ip_str= ip_addr )
                    {
                    dbg.location(1760,23);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1760:23: (serv_ip_str= ip_addr )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1760:24: serv_ip_str= ip_addr
                    {
                    dbg.location(1760,36);
                    pushFollow(FOLLOW_ip_addr_in_serv_group3049);
                    serv_ip_str=ip_addr();
                    _fsp--;

                    dbg.location(1760,47);
                     serviceIp = new Ipaddress(input.toString(serv_ip_str.start,serv_ip_str.stop));

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1761:5: (serv_ip_obj= object_name )
                    {
                    dbg.location(1761,5);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1761:5: (serv_ip_obj= object_name )
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1761:6: serv_ip_obj= object_name
                    {
                    dbg.location(1761,18);
                    pushFollow(FOLLOW_object_name_in_serv_group3063);
                    serv_ip_obj=object_name();
                    _fsp--;

                    dbg.location(1761,32);
                     
                    		 Symbol s = currentScope.getSymbol(input.toString(serv_ip_obj.start,serv_ip_obj.stop));
                    	 
                    		 try{
                    		  if(s.getType().equals ("ipaddr_t") != true) 
                    		  { throw (new DataFormatException("rule : service_group:service ip"));}
                    		  }
                    		  catch (DataFormatException dfe)
                    		  {
                    		   System.out.println(dfe);
                    		    }
                    	   
                    		  serviceIp = (Ipaddress) s.lookupValue();
                    		  

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(71);}

            dbg.location(1779,4);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1779:4: ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )?
            int alt73=2;
            try { dbg.enterSubRule(73);
            try { dbg.enterDecision(73);

            int LA73_0 = input.LA(1);

            if ( (LA73_0==79) ) {
                alt73=1;
            }
            } finally {dbg.exitDecision(73);}

            switch (alt73) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1779:5: 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )
                    {
                    dbg.location(1779,5);
                    match(input,79,FOLLOW_79_in_serv_group3085); 
                    dbg.location(1779,15);
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1779:15: ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )
                    int alt72=2;
                    try { dbg.enterSubRule(72);
                    try { dbg.enterDecision(72);

                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NUMBER) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==ID) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1779:15: ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )", 72, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(72);}

                    switch (alt72) {
                        case 1 :
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1779:16: (serv_netmask_str= ip_addr )
                            {
                            dbg.location(1779,16);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1779:16: (serv_netmask_str= ip_addr )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1779:17: serv_netmask_str= ip_addr
                            {
                            dbg.location(1779,33);
                            pushFollow(FOLLOW_ip_addr_in_serv_group3091);
                            serv_netmask_str=ip_addr();
                            _fsp--;

                            dbg.location(1779,41);
                            serviceNetmask = new Ipaddress(input.toString(serv_netmask_str.start,serv_netmask_str.stop));

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1780:26: (serv_netmask_obj= object_name )
                            {
                            dbg.location(1780,26);
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1780:26: (serv_netmask_obj= object_name )
                            dbg.enterAlt(1);

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1780:27: serv_netmask_obj= object_name
                            {
                            dbg.location(1780,44);
                            pushFollow(FOLLOW_object_name_in_serv_group3126);
                            serv_netmask_obj=object_name();
                            _fsp--;

                            dbg.location(1780,57);
                             
                            		                       Symbol s = currentScope.getSymbol(input.toString(serv_netmask_obj.start,serv_netmask_obj.stop));
                            		                       
                            		 try{
                            		  if(s.getType().equals ("ipaddr_t") != true) 
                            		  { throw (new DataFormatException("rule : service_group: service_netmask"));}
                            		  }
                            		  catch (DataFormatException dfe)
                            		  {
                            		   System.out.println(dfe);
                            		    }
                            		    
                            		    serviceNetmask = (Ipaddress)s.lookupValue();
                            	                               

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(72);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(73);}

            dbg.location(1794,22);
            pushFollow(FOLLOW_serv_listen_port_in_serv_group3146);
            serv_port_str=serv_listen_port();
            _fsp--;

            dbg.location(1794,41);
             sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
            		      			         input.toString(serv_port_str.start,serv_port_str.stop))));
            dbg.location(1798,2);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1798:2: ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )*
            try { dbg.enterSubRule(77);

            loop77:
            do {
                int alt77=2;
                try { dbg.enterDecision(77);

                int LA77_0 = input.LA(1);

                if ( (LA77_0==97) ) {
                    alt77=1;
                }


                } finally {dbg.exitDecision(77);}

                switch (alt77) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1798:3: ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port
            	    {
            	    dbg.location(1798,3);
            	    match(input,97,FOLLOW_97_in_serv_group3171); 
            	    dbg.location(1798,9);
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1798:9: ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) )
            	    int alt74=2;
            	    try { dbg.enterSubRule(74);
            	    try { dbg.enterDecision(74);

            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==NUMBER) ) {
            	        alt74=1;
            	    }
            	    else if ( (LA74_0==ID) ) {
            	        alt74=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1798:9: ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) )", 74, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(74);}

            	    switch (alt74) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1798:10: (extra_ip_str= ip_addr )
            	            {
            	            dbg.location(1798,10);
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1798:10: (extra_ip_str= ip_addr )
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1798:11: extra_ip_str= ip_addr
            	            {
            	            dbg.location(1798,24);
            	            pushFollow(FOLLOW_ip_addr_in_serv_group3181);
            	            extra_ip_str=ip_addr();
            	            _fsp--;

            	            dbg.location(1798,35);
            	             serviceIp = new Ipaddress(input.toString(extra_ip_str.start,extra_ip_str.stop));

            	            }


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1799:5: (extra_ip_obj= object_name )
            	            {
            	            dbg.location(1799,5);
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1799:5: (extra_ip_obj= object_name )
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1799:6: extra_ip_obj= object_name
            	            {
            	            dbg.location(1799,19);
            	            pushFollow(FOLLOW_object_name_in_serv_group3195);
            	            extra_ip_obj=object_name();
            	            _fsp--;

            	            dbg.location(1799,33);
            	             
            	            		 Symbol s = currentScope.getSymbol(input.toString(extra_ip_obj.start,extra_ip_obj.stop));
            	            	 
            	            		 try{
            	            		  if(s.getType().equals ("ipaddr_t") != true) 
            	            		  { throw (new DataFormatException("rule : service_group:service ip:second_comma_separated_values"));}
            	            		  }
            	            		  catch (DataFormatException dfe)
            	            		  {
            	            		   System.out.println(dfe);
            	            		    }
            	            	   
            	            		  serviceIp = (Ipaddress) s.lookupValue();
            	            		  

            	            }


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(74);}

            	    dbg.location(1815,4);
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1815:4: ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )?
            	    int alt76=2;
            	    try { dbg.enterSubRule(76);
            	    try { dbg.enterDecision(76);

            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==79) ) {
            	        alt76=1;
            	    }
            	    } finally {dbg.exitDecision(76);}

            	    switch (alt76) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1815:5: 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )
            	            {
            	            dbg.location(1815,5);
            	            match(input,79,FOLLOW_79_in_serv_group3213); 
            	            dbg.location(1815,15);
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1815:15: ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )
            	            int alt75=2;
            	            try { dbg.enterSubRule(75);
            	            try { dbg.enterDecision(75);

            	            int LA75_0 = input.LA(1);

            	            if ( (LA75_0==NUMBER) ) {
            	                alt75=1;
            	            }
            	            else if ( (LA75_0==ID) ) {
            	                alt75=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("1815:15: ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )", 75, 0, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	            } finally {dbg.exitDecision(75);}

            	            switch (alt75) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1815:16: (extra_serv_netmask_str= ip_addr )
            	                    {
            	                    dbg.location(1815,16);
            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1815:16: (extra_serv_netmask_str= ip_addr )
            	                    dbg.enterAlt(1);

            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1815:17: extra_serv_netmask_str= ip_addr
            	                    {
            	                    dbg.location(1815,39);
            	                    pushFollow(FOLLOW_ip_addr_in_serv_group3219);
            	                    extra_serv_netmask_str=ip_addr();
            	                    _fsp--;

            	                    dbg.location(1815,47);
            	                    serviceNetmask = new Ipaddress(input.toString(extra_serv_netmask_str.start,extra_serv_netmask_str.stop));

            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    dbg.enterAlt(2);

            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1816:26: (extra_serv_netmask_obj= object_name )
            	                    {
            	                    dbg.location(1816,26);
            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1816:26: (extra_serv_netmask_obj= object_name )
            	                    dbg.enterAlt(1);

            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1816:27: extra_serv_netmask_obj= object_name
            	                    {
            	                    dbg.location(1816,50);
            	                    pushFollow(FOLLOW_object_name_in_serv_group3254);
            	                    extra_serv_netmask_obj=object_name();
            	                    _fsp--;

            	                    dbg.location(1816,63);
            	                     
            	                    		                       Symbol s = currentScope.getSymbol(input.toString(extra_serv_netmask_obj.start,extra_serv_netmask_obj.stop));
            	                    		                       
            	                    		 try{
            	                    		  if(s.getType().equals ("ipaddr_t") != true) 
            	                    		  { throw (new DataFormatException("rule : service_group: service_netmask"));}
            	                    		  }
            	                    		  catch (DataFormatException dfe)
            	                    		  {
            	                    		   System.out.println(dfe);
            	                    		    }
            	                    		    
            	                    		    serviceNetmask = (Ipaddress)s.lookupValue();
            	                    	                               

            	                    }


            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(75);}


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(76);}

            	    dbg.location(1830,28);
            	    pushFollow(FOLLOW_serv_listen_port_in_serv_group3274);
            	    extra_serv_port_str=serv_listen_port();
            	    _fsp--;

            	    dbg.location(1830,47);
            	     sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
            	    		      			         input.toString(extra_serv_port_str.start,extra_serv_port_str.stop))));

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);
            } finally {dbg.exitSubRule(77);}

            dbg.location(1832,13);
            match(input,77,FOLLOW_77_in_serv_group3291); 
            dbg.location(1834,9);
            
            		       Servicegroup sg = new Servicegroup(sDesc);
            		       Symbol s = new Symbol ("serv_group_type_t","serv_group_type_t",sg);
            		       sym = s;		      
            		     

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1843, 2);

        }
        finally {
            dbg.exitRule("serv_group");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end serv_group

    public static class serv_listen_port_return extends ParserRuleReturnScope {
    };

    // $ANTLR start serv_listen_port
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1845:1: serv_listen_port : ( NUMBER ) ;
    public final serv_listen_port_return serv_listen_port() throws RecognitionException {
        serv_listen_port_return retval = new serv_listen_port_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("serv_listen_port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1845, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1846:2: ( ( NUMBER ) )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1846:4: ( NUMBER )
            {
            dbg.location(1846,4);
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1846:4: ( NUMBER )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1846:5: NUMBER
            {
            dbg.location(1846,5);
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port3330); 

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
        dbg.location(1846, 12);

        }
        finally {
            dbg.exitRule("serv_listen_port");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end serv_listen_port


    // $ANTLR start host_name
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1848:1: host_name : ID ;
    public final void host_name() throws RecognitionException {
        try { dbg.enterRule("host_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1848, 1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1849:2: ( ID )
            dbg.enterAlt(1);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1849:4: ID
            {
            dbg.location(1849,4);
            match(input,ID,FOLLOW_ID_in_host_name3340); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1849, 6);

        }
        finally {
            dbg.exitRule("host_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end host_name


 

    public static final BitSet FOLLOW_21_in_prog84 = new BitSet(new long[]{0x080051C3DB801D00L,0x00000001A61C0FFEL});
    public static final BitSet FOLLOW_statement_list_in_prog86 = new BitSet(new long[]{0x080051C3DBC01D00L,0x00000001A61C0FFEL});
    public static final BitSet FOLLOW_22_in_prog89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declr_stmt_in_statement_list112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_statement_in_statement127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_expr_in_statement139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_statement_in_statement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement_expr161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement_expr167 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement_expr169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_statement_in_statement_expr198 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement_expr200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_oper_in_config_statement224 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_oper_in_config_statement241 = new BitSet(new long[]{0x0000000000000000L,0x00000000A0000000L});
    public static final BitSet FOLLOW_route_in_config_statement245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_config_statement262 = new BitSet(new long[]{0x0000000000000800L,0x0000000004000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interf_in_config_statement284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement303 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_config_statement305 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement314 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_config_statement316 = new BitSet(new long[]{0x0000000040000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_topology_in_config_statement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement325 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement327 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement330 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_context_in_config_statement332 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_object_name_in_config_statement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement353 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement355 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement363 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement365 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_context_in_config_statement367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement381 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement383 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_object_name_in_config_statement389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement458 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement460 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement463 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000000L});
    public static final BitSet FOLLOW_host_group_in_config_statement466 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_config_statement472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_display_in_config_statement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_route_oper505 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_route_oper509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_route_oper518 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_route_oper522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_set_oper539 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_set_oper541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_set_oper546 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_set_oper548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_config_display567 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_display569 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_config_display576 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_display578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_config_display584 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_display586 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_config_display592 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_display594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_condition_statement616 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_condition_statement618 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_equality_expr_in_condition_statement620 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_condition_statement622 = new BitSet(new long[]{0x080051C3DB801D00L,0x00000001A61C0FFEL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement624 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_condition_statement627 = new BitSet(new long[]{0x080051C3DB801D00L,0x00000001A61C0FFEL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement629 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_condition_statement633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_iteration_statement649 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_iteration_statement651 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement653 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_iteration_statement655 = new BitSet(new long[]{0x080051C3DB801D00L,0x00000001A61C0FFEL});
    public static final BitSet FOLLOW_statement_list_in_iteration_statement657 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_iteration_statement659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_print_statement675 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_print_statement677 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_print_statement681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr718 = new BitSet(new long[]{0xF000000000080000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr722 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr780 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_conditional_expr788 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_expression_in_conditional_expr790 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_conditional_expr792 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_conditional_expr_in_conditional_expr794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr818 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_logicalOR_expr826 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr828 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr851 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_logicalAND_expr859 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr861 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr885 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_bitwiseOR_expr893 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr895 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr918 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_bitwiseAND_expr926 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr928 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr953 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr962 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr970 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr994 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr1005 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_expr_in_relational_expr1015 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_term_in_expr1041 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr1052 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_term_in_expr1063 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term1089 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term1100 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_unary_expr_in_term1110 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unary_expr1144 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression1173 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression1177 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_factor1257 = new BitSet(new long[]{0x0800010048001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_expression_in_factor1259 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_factor1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt1301 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1305 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_declr_stmt1312 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1318 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23_in_declr_stmt1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_object_values1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_in_object_values1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interf_in_object_values1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_in_object_values1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_context1530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_context1532 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_policy_in_context1538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_object_name_in_context1546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_64_in_context1565 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_policy_in_context1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_object_name_in_context1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_77_in_context1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_verdict_in_policy1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_proto_in_policy1635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000024000L});
    public static final BitSet FOLLOW_78_in_policy1642 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_policy1697 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1703 = new BitSet(new long[]{0x0000000000000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_object_name_in_policy1719 = new BitSet(new long[]{0x0000000000000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_port_in_policy1748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_80_in_policy1757 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_policy1781 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_policy1833 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1839 = new BitSet(new long[]{0x0000000000000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_object_name_in_policy1855 = new BitSet(new long[]{0x0000000000000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_port_in_policy1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_policy1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_verdict_in_policy1929 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy1933 = new BitSet(new long[]{0x0000000000000002L,0x0000000000024000L});
    public static final BitSet FOLLOW_78_in_policy1939 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy1973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_policy1994 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy2000 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_object_name_in_policy2016 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_policy2049 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_policy2101 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_policy2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_topology2183 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_host_group_in_topology2189 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_object_name_in_topology2201 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_topology2219 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_context_in_topology2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_topology2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_topology2280 = new BitSet(new long[]{0x0000000000000800L,0x0000000100000000L});
    public static final BitSet FOLLOW_serv_group_in_topology2286 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_object_name_in_topology2299 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_topology2315 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_context_in_topology2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_topology2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_verdict2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_verdict2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_name2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2543 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2545 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2549 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2551 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2555 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2557 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_nmask2581 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_nmask2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_host2605 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_host2610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_host2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_host2622 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_host2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_host2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_dns_set2679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2692 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_gateway2695 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2697 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_30_in_host_group2718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_host_group2721 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000000L});
    public static final BitSet FOLLOW_host_in_host_group2726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_object_name_in_host_group2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_64_in_host_group2748 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000000L});
    public static final BitSet FOLLOW_host_in_host_group2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_object_name_in_host_group2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_77_in_host_group2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_interf2806 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_interf2811 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_interf2821 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2826 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_91_in_interf2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_interf2835 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_64_in_interf2846 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_77_in_interf2857 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_92_in_interf2875 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2880 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_93_in_route2905 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2910 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_object_name_in_route2916 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_route2922 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_route2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_route2956 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_route2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_route2971 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_object_name_in_route2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_route2989 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_route3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_serv_group3038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_serv_group3040 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3049 = new BitSet(new long[]{0x0000000000000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_serv_group3063 = new BitSet(new long[]{0x0000000000000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_serv_group3085 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3091 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_object_name_in_serv_group3126 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group3146 = new BitSet(new long[]{0x0000000000000000L,0x0000000200002000L});
    public static final BitSet FOLLOW_97_in_serv_group3171 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3181 = new BitSet(new long[]{0x0000000000000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_serv_group3195 = new BitSet(new long[]{0x0000000000000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_serv_group3213 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3219 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_object_name_in_serv_group3254 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group3274 = new BitSet(new long[]{0x0000000000000000L,0x0000000200002000L});
    public static final BitSet FOLLOW_77_in_serv_group3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name3340 = new BitSet(new long[]{0x0000000000000002L});

}