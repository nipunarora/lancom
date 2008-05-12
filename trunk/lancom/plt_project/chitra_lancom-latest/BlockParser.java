// $ANTLR 3.0.1 /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g 2008-05-12 19:01:51

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "ELSE", "ENDIF", "OPAREN", "CPAREN", "ENDWHILE", "NUMBER", "NM", "ROUTE_OPER", "STRING", "ID", "CHAR", "ICMP_MESSAGE_TYPE", "DOT", "LETTER", "DIGIT", "EscapeSequence", "LINE_COMMENT", "EQUAL", "WHITESPACE", "'prog'", "'endprog'", "';'", "'ifconfig'", "'apply'", "'undo'", "'topology'", "'context'", "'policy'", "'host_group'", "'add'", "'to'", "'delete'", "'from'", "'route'", "'show'", "'numeric'", "'fw'", "'if'", "'while'", "'echo'", "'||'", "'&&'", "'|'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'~'", "'*='", "'/='", "'+='", "'-='", "','", "'topology_type_t'", "'host_type_t'", "'host_group_type_t'", "'serv_group_type_t'", "'context_type_t'", "'policy_type_t'", "'route_type_t'", "'interface_type_t'", "'ipaddr_t'", "'int_type_t'", "'char_type_t'", "'{'", "'}'", "'dst'", "'netmask'", "'all'", "'src'", "'serv_group'", "'inbound'", "'outbound'", "'allow'", "'deny'", "'udp'", "'tcp'", "'ip_addr'", "'ifname'", "'dns'", "'defgw'", "'host'", "'gw'", "'net'", "'service_group'", "', '"
    };
    public static final int LINE_COMMENT=24;
    public static final int OPAREN=10;
    public static final int LETTER=21;
    public static final int ROUTE_OPER=15;
    public static final int ELSE=8;
    public static final int NUMBER=13;
    public static final int CHAR=18;
    public static final int WHITESPACE=26;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int ID=17;
    public static final int EOF=-1;
    public static final int EQUAL=25;
    public static final int ENDIF=9;
    public static final int PLUS=4;
    public static final int CPAREN=11;
    public static final int DIGIT=22;
    public static final int ENDWHILE=12;
    public static final int DIV=7;
    public static final int NM=14;
    public static final int DOT=20;
    public static final int EscapeSequence=23;
    public static final int ICMP_MESSAGE_TYPE=19;
    public static final int STRING=16;
    public static final String[] ruleNames = new String[] {
        "invalidRule", "prog", "if_statement_list", "statement_list", "statement", 
        "statement_expr", "config_statement", "set_oper", "config_display", 
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
    public String getGrammarFileName() { return "/home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g"; }

          
    	Scope globalScope = new Scope(null);
    	Scope currentScope = globalScope;
    	String g_action = "";
    	boolean g_ignore_stmt = false;
    	Stack g_ifStack = new Stack();	
    	Map<String, Assignment> map = new HashMap<String, Assignment>(); 
    	
    	
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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:58:1: prog : 'prog' ( statement_list )+ 'endprog' ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule("prog");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(58, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:59:2: ( 'prog' ( statement_list )+ 'endprog' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:59:4: 'prog' ( statement_list )+ 'endprog'
            {
            dbg.location(59,4);
            match(input,27,FOLLOW_27_in_prog131); 
            dbg.location(59,11);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:59:11: ( statement_list )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER||(LA1_0>=ROUTE_OPER && LA1_0<=CHAR)||(LA1_0>=29 && LA1_0<=32)||LA1_0==34||(LA1_0>=36 && LA1_0<=37)||LA1_0==39||LA1_0==41||(LA1_0>=44 && LA1_0<=47)||LA1_0==58||(LA1_0>=64 && LA1_0<=74)||(LA1_0>=81 && LA1_0<=83)||(LA1_0>=88 && LA1_0<=89)||LA1_0==92||(LA1_0>=94 && LA1_0<=95)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:59:11: statement_list
            	    {
            	    dbg.location(59,11);
            	    pushFollow(FOLLOW_statement_list_in_prog133);
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

            dbg.location(59,27);
            match(input,28,FOLLOW_28_in_prog136); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(60, 3);

        }
        finally {
            dbg.exitRule("prog");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end prog


    // $ANTLR start if_statement_list
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:62:1: if_statement_list : ( statement_list )+ ;
    public final void if_statement_list() throws RecognitionException {
        try { dbg.enterRule("if_statement_list");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(62, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:63:3: ( ( statement_list )+ )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:63:5: ( statement_list )+
            {
            dbg.location(63,5);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:63:5: ( statement_list )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==NUMBER||(LA2_0>=ROUTE_OPER && LA2_0<=CHAR)||(LA2_0>=29 && LA2_0<=32)||LA2_0==34||(LA2_0>=36 && LA2_0<=37)||LA2_0==39||LA2_0==41||(LA2_0>=44 && LA2_0<=47)||LA2_0==58||(LA2_0>=64 && LA2_0<=74)||(LA2_0>=81 && LA2_0<=83)||(LA2_0>=88 && LA2_0<=89)||LA2_0==92||(LA2_0>=94 && LA2_0<=95)) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:63:5: statement_list
            	    {
            	    dbg.location(63,5);
            	    pushFollow(FOLLOW_statement_list_in_if_statement_list149);
            	    statement_list();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}


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
            dbg.exitRule("if_statement_list");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end if_statement_list


    // $ANTLR start statement_list
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:66:2: statement_list : ( statement | declr_stmt );
    public final void statement_list() throws RecognitionException {
        try { dbg.enterRule("statement_list");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(66, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:67:3: ( statement | declr_stmt )
            int alt3=2;
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==NUMBER||(LA3_0>=ROUTE_OPER && LA3_0<=CHAR)||(LA3_0>=29 && LA3_0<=32)||LA3_0==34||(LA3_0>=36 && LA3_0<=37)||LA3_0==39||LA3_0==41||(LA3_0>=44 && LA3_0<=47)||LA3_0==58||(LA3_0>=81 && LA3_0<=83)||(LA3_0>=88 && LA3_0<=89)||LA3_0==92||(LA3_0>=94 && LA3_0<=95)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=64 && LA3_0<=74)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("66:2: statement_list : ( statement | declr_stmt );", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:67:5: statement
                    {
                    dbg.location(67,5);
                    pushFollow(FOLLOW_statement_in_statement_list166);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:68:6: declr_stmt
                    {
                    dbg.location(68,6);
                    pushFollow(FOLLOW_declr_stmt_in_statement_list173);
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
        dbg.location(69, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:71:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final void statement() throws RecognitionException {
        try { dbg.enterRule("statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(71, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:72:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt4=4;
            try { dbg.enterDecision(4);

            switch ( input.LA(1) ) {
            case 45:
                {
                alt4=1;
                }
                break;
            case 46:
                {
                alt4=2;
                }
                break;
            case NUMBER:
            case ROUTE_OPER:
            case STRING:
            case ID:
            case CHAR:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 36:
            case 37:
            case 39:
            case 41:
            case 44:
            case 58:
            case 81:
            case 82:
            case 83:
            case 88:
            case 89:
            case 92:
            case 94:
            case 95:
                {
                alt4=3;
                }
                break;
            case 47:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("71:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:72:5: condition_statement
                    {
                    dbg.location(72,5);
                    pushFollow(FOLLOW_condition_statement_in_statement188);
                    condition_statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:73:5: iteration_statement
                    {
                    dbg.location(73,5);
                    pushFollow(FOLLOW_iteration_statement_in_statement194);
                    iteration_statement();
                    _fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:74:5: statement_expr
                    {
                    dbg.location(74,5);
                    pushFollow(FOLLOW_statement_expr_in_statement200);
                    statement_expr();
                    _fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:75:5: print_statement
                    {
                    dbg.location(75,5);
                    pushFollow(FOLLOW_print_statement_in_statement206);
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
        dbg.location(76, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:78:2: statement_expr : ( ';' | expression ';' | config_statement ';' );
    public final void statement_expr() throws RecognitionException {
        try { dbg.enterRule("statement_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(78, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:79:3: ( ';' | expression ';' | config_statement ';' )
            int alt5=3;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case NUMBER:
            case STRING:
            case ID:
            case CHAR:
            case 34:
            case 36:
            case 58:
            case 81:
            case 82:
            case 83:
            case 88:
            case 89:
            case 92:
            case 94:
            case 95:
                {
                alt5=2;
                }
                break;
            case ROUTE_OPER:
            case 30:
            case 31:
            case 32:
            case 37:
            case 39:
            case 41:
            case 44:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("78:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:79:5: ';'
                    {
                    dbg.location(79,5);
                    match(input,29,FOLLOW_29_in_statement_expr222); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:80:5: expression ';'
                    {
                    dbg.location(80,5);
                    pushFollow(FOLLOW_expression_in_statement_expr228);
                    expression();
                    _fsp--;

                    dbg.location(80,16);
                    match(input,29,FOLLOW_29_in_statement_expr230); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:81:11: config_statement ';'
                    {
                    dbg.location(81,11);
                    pushFollow(FOLLOW_config_statement_in_statement_expr242);
                    config_statement();
                    _fsp--;

                    dbg.location(81,28);
                    match(input,29,FOLLOW_29_in_statement_expr244); 

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
        dbg.location(82, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );
    public final void config_statement() throws RecognitionException {
        Token route_cmd=null;
        Token route_cmd2=null;
        object_name_return robj = null;

        Symbol robj2 = null;

        object_name_return interf_object_name = null;

        Symbol interf_sym = null;

        object_name_return topology_obj_name = null;

        Symbol topology_sym = null;

        object_name_return context_obj_name = null;

        Symbol context_sym = null;

        object_name_return var = null;

        Symbol policy_sym = null;


        try { dbg.enterRule("config_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(87, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:88:3: (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display )
            int alt17=11;
            try { dbg.enterDecision(17);

            switch ( input.LA(1) ) {
            case ROUTE_OPER:
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==ID) ) {
                    alt17=1;
                }
                else if ( (LA17_1==92||LA17_1==94) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 17, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt17=6;
                    }
                    break;
                case 35:
                    {
                    alt17=8;
                    }
                    break;
                case 33:
                    {
                    alt17=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 17, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case 32:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt17=9;
                    }
                    break;
                case 34:
                    {
                    alt17=7;
                    }
                    break;
                case 33:
                    {
                    alt17=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 17, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case 37:
                {
                int LA17_5 = input.LA(2);

                if ( (LA17_5==38) ) {
                    int LA17_15 = input.LA(3);

                    if ( (LA17_15==34) ) {
                        alt17=5;
                    }
                    else if ( (LA17_15==36) ) {
                        alt17=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 17, 15, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 17, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA17_6 = input.LA(2);

                if ( (LA17_6==40) ) {
                    int LA17_16 = input.LA(3);

                    if ( (LA17_16==34) ) {
                        alt17=5;
                    }
                    else if ( (LA17_16==36) ) {
                        alt17=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 17, 16, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 17, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 41:
            case 44:
                {
                alt17=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("87:2: config_statement : (route_cmd= ROUTE_OPER robj= object_name | route_cmd2= ROUTE_OPER robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:88:5: route_cmd= ROUTE_OPER robj= object_name
                    {
                    dbg.location(88,14);
                    route_cmd=(Token)input.LT(1);
                    match(input,ROUTE_OPER,FOLLOW_ROUTE_OPER_in_config_statement265); 
                    dbg.location(88,30);
                    pushFollow(FOLLOW_object_name_in_config_statement269);
                    robj=object_name();
                    _fsp--;

                    dbg.location(89,2);

                    		Symbol s = currentScope.getSymbol(input.toString(robj.start,robj.stop));
                    		try
                    		{
                    			if (s.type.equals("route_type_t")!=true)
                     	 		{
                     	   			throw (new DataFormatException(" route:route object"));
                     	 		}
                     	 	}
                     	 	catch (DataFormatException dfe)
                    		{
                    	 		System.out.println(dfe);
                    	 		dfe.printStackTrace();
                    	 		System.exit(1);
                    		} 
                     	  
                    		Route route = (Route) currentScope.lookup(input.toString(robj.start,robj.stop));
                    		if (route != null)
                    		{
                    			route.configure("route.xml",route_cmd.getText(),"route");
                    		} 
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:111:3: route_cmd2= ROUTE_OPER robj2= route
                    {
                    dbg.location(111,13);
                    route_cmd2=(Token)input.LT(1);
                    match(input,ROUTE_OPER,FOLLOW_ROUTE_OPER_in_config_statement278); 
                    dbg.location(111,30);
                    pushFollow(FOLLOW_route_in_config_statement282);
                    robj2=route();
                    _fsp--;

                    dbg.location(112,4);

                    		Route r=(Route)robj2.lookupValue();
                    		if(r!=null)
                    		{
                    			r.configure("route.xml",route_cmd2.getText(),"route");
                    		}
                     	

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:120:3: 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) )
                    {
                    dbg.location(120,3);
                    Interface ifc=null;
                    dbg.location(121,3);
                    match(input,30,FOLLOW_30_in_config_statement299); 
                    dbg.location(121,15);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:121:15: ( (interf_object_name= object_name ) | (interf_sym= interf ) )
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==89) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("121:15: ( (interf_object_name= object_name ) | (interf_sym= interf ) )", 6, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:121:16: (interf_object_name= object_name )
                            {
                            dbg.location(121,16);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:121:16: (interf_object_name= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:121:17: interf_object_name= object_name
                            {
                            dbg.location(121,35);
                            pushFollow(FOLLOW_object_name_in_config_statement306);
                            interf_object_name=object_name();
                            _fsp--;


                            }

                            dbg.location(122,3);

                             		//interf_obj_name=object_name 
                            		Symbol s = (Symbol) currentScope.getSymbol(input.toString(interf_object_name.start,interf_object_name.stop));
                            		try
                            		{
                            			if (s.type.equals("interface_type_t")!=true)
                             	 		{
                            				throw (new DataFormatException(" ifconfig:inteface:interface object"));
                             	 		}
                             	 	}
                             	 	catch (DataFormatException dfe)
                             	 	{
                             	    		System.out.println(dfe);
                             	    		dfe.printStackTrace();
                             	    		System.exit(1);
                             	  	}
                             	  	ifc = (Interface) s.lookupValue();
                            	

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:140:3: (interf_sym= interf )
                            {
                            dbg.location(140,3);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:140:3: (interf_sym= interf )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:140:4: interf_sym= interf
                            {
                            dbg.location(140,15);
                            pushFollow(FOLLOW_interf_in_config_statement321);
                            interf_sym=interf();
                            _fsp--;


                            }

                            dbg.location(141,2);

                            		ifc = (Interface)interf_sym.lookupValue();
                            	

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(144,2);
                    	  
                    		ifc.configure("interface.xml","InterfConfig","ifconf");	
                    	

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:148:2: ( ( 'apply' ) | ( 'undo' ) ) 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) )
                    {
                    dbg.location(148,2);

                    		Topology topology = null;
                    		boolean applyActions = false;
                    		boolean undoActions = true;
                    	
                    dbg.location(153,2);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:2: ( ( 'apply' ) | ( 'undo' ) )
                    int alt7=2;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==31) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==32) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("153:2: ( ( 'apply' ) | ( 'undo' ) )", 7, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:3: ( 'apply' )
                            {
                            dbg.location(153,3);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:3: ( 'apply' )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:4: 'apply'
                            {
                            dbg.location(153,4);
                            match(input,31,FOLLOW_31_in_config_statement340); 

                            }

                            dbg.location(153,12);
                            applyActions = true;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:35: ( 'undo' )
                            {
                            dbg.location(153,35);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:35: ( 'undo' )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:36: 'undo'
                            {
                            dbg.location(153,36);
                            match(input,32,FOLLOW_32_in_config_statement345); 

                            }

                            dbg.location(153,43);
                            applyActions = false;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(153,68);
                    match(input,33,FOLLOW_33_in_config_statement350); 
                    dbg.location(153,79);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:79: ( (topology_obj_name= object_name ) | (topology_sym= topology ) )
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ID) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==36||LA8_0==81) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("153:79: ( (topology_obj_name= object_name ) | (topology_sym= topology ) )", 8, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:80: (topology_obj_name= object_name )
                            {
                            dbg.location(153,80);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:80: (topology_obj_name= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:153:81: topology_obj_name= object_name
                            {
                            dbg.location(153,98);
                            pushFollow(FOLLOW_object_name_in_config_statement356);
                            topology_obj_name=object_name();
                            _fsp--;


                            }

                            dbg.location(154,2);

                            		Symbol s = (Symbol) currentScope.getSymbol(input.toString(topology_obj_name.start,topology_obj_name.stop));
                             		try
                             		{
                            			if (s.type.equals("topology_type_t")!=true)
                             	 		{
                            				throw (new DataFormatException(" apply : topology : object"));
                             			}
                             	 	}
                             	 	catch (DataFormatException dfe)
                             	 	{
                             	    		System.out.println(dfe);
                             	    		dfe.printStackTrace();
                             	    		System.exit(1);
                             	  	}           	
                             	  	topology = (Topology) currentScope.lookup(input.toString(topology_obj_name.start,topology_obj_name.stop));
                             	

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:171:5: (topology_sym= topology )
                            {
                            dbg.location(171,5);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:171:5: (topology_sym= topology )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:171:6: topology_sym= topology
                            {
                            dbg.location(171,19);
                            pushFollow(FOLLOW_topology_in_config_statement371);
                            topology_sym=topology();
                            _fsp--;


                            }

                            dbg.location(172,3);

                            		topology = (Topology) topology_sym.lookupValue();
                             	

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(176,2);

                    		if (topology.hostGroup != null) 
                     	     	{ 
                    			Hostgroup hg;
                    	 	     	hg = topology.hostGroup;
                    	 	    	Context cxt;
                    	 	     	cxt = topology.context;
                    	 	     	Iterator <Host> hostiter= hg.hostGroup.iterator();
                    	 	    	Iterator <Policy> policyiter= cxt.context.iterator();
                    	       
                           	 		while(hostiter.hasNext())
                            		{
                            	   		Host h = hostiter.next();
                    	       	
                    	    			while(policyiter.hasNext())
                    	    			{
                    	       
                    	       				Policy p = policyiter.next();
                    	       
                    	       				if(p.direction.equals("inbound")==true)
                    	       				{
                    	         				if(p.destIpAddress.getString().equals("0.0.0.0") == true)
                    	         				{
                    	           					p.destIpAddress = new Ipaddress(h.ipAddress.getString());
                    	           					p.destNetMask = new Ipaddress(h.netMask.getString());
                    	           				}
                    	           				else 
                    	           				{ 
                    	           					System.out.println(" dest IP address alredy present in policy : "+p.getString());
                    	           	   				System.exit(0);
                    	           	   			}	
                    	       				}
                    	       				else
                    	       				{
                    	       
                    	       					if(p.sourceIpAddress.getString().equals("0.0.0.0") == true)
                    	         				{
                    					        	p.sourceIpAddress = new Ipaddress(h.ipAddress.getString());
                    					           	p.sourceNetMask = new Ipaddress(h.netMask.getString());
                    	           				}
                    	           				else 
                    	           				{ 
                    	           					System.out.println(" Source IP address alredy present in policy : "+p.getString());
                    	           	   				System.exit(0);
                    	           	   			}	 
                    	       				}
                    	      				if((applyActions == true) && (undoActions ==false))
                    	      				{
                    	       					p.configure("fw.xml","PolicyAdd","topo_host2");  
                    	       				}
                    	       				else if((applyActions == false) && (undoActions ==true))
                    	       				{
                    	       					p.configure("fw.xml","PolicyDelete","topo_host2");  
                    	       				}
                    	       
                    	       			}//while2
                    			}//while1
                    		}
                               	else  if (topology.serviceGroup != null) 
                     	     	{
                     	     		Servicegroup sg;
                     	     		sg = topology.serviceGroup;
                     	     		Context cxt;
                     	     		cxt = topology.context;
                     	     		Iterator <Servicedescriptor> serviter= sg.serviceGroup.iterator();
                     	     		Iterator <Policy> policyiter= cxt.context.iterator();
                    	       
                    	
                           	 		while(serviter.hasNext())
                            		{
                            	    		Servicedescriptor s = serviter.next();
                    	    			while(policyiter.hasNext())
                    	    			{
                    	       				Policy p = policyiter.next();
                    	       				if(p.direction.equals("inbound")==true)
                    	       				{
                    	         				if(p.destIpAddress.getString().equals("0.0.0.0") == true)
                    	         				{
                    	           					p.destIpAddress = new Ipaddress(s.ipAddress.getString());
                    	           					p.destNetMask = new Ipaddress(s.netMask.getString());
                    	            					if(p.destPort != s.port )
                    	           					{
                    	           						System.out.println(" Destination port present in policy : "+
                    	                                               		p.getString()+ "  different from the one specified in service descriptor");
                    	             						System.exit(0);
                    	           					}
                    	           					p.destPort=s.port;
                    	           				}
                    		           			else 
                    		           			{ 
                    		           				System.out.println(" dest IP address alredy present in policy : "+p.getString());
                    		           	   			System.exit(0);
                    		           	   		}	
                    	       				}
                    		       			else
                    		       			{
                    		       				if(p.sourceIpAddress.getString().equals("0.0.0.0") == true)
                    		         			{
                    		           				p.sourceIpAddress = new Ipaddress(s.ipAddress.getString());
                    		           				p.sourceNetMask = new Ipaddress(s.netMask.getString());
                    		           				if(p.sourcePort != s.port )
                    		           				{
                    		           					System.out.println(" Source port present in policy : "+p.getString()+ "  different from the one specified in service descriptor");
                    		             					System.exit(0);
                    		           				}
                    		           				p.sourcePort=s.port;
                    		           			}
                    		           			else 
                    		           			{ 
                    		           				System.out.println(" Source IP address alredy present in policy : "+p.getString());
                    		           	   			System.exit(0);
                    		           	   		}	
                    		       			}
                    		       			if((applyActions == true) && (undoActions ==false))
                    		       			{
                    		       				p.configure("fw.xml","PolicyAdd","topo_host2");  
                    		       			}
                    					else if((applyActions == false) && (undoActions ==true))
                    					{
                    		       				p.configure("fw.xml","PolicyDelete","topo_host2");  
                    		       			}
                    	       			}//while2
                    			}//while1
                    		}
                    	   

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:303:5: set_oper 'context' ( object_name | context ) ( object_name | policy )
                    {
                    dbg.location(303,5);
                    pushFollow(FOLLOW_set_oper_in_config_statement392);
                    set_oper();
                    _fsp--;

                    dbg.location(303,14);
                    match(input,34,FOLLOW_34_in_config_statement394); 
                    dbg.location(303,24);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:303:24: ( object_name | context )
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ID) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==34) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("303:24: ( object_name | context )", 9, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:303:25: object_name
                            {
                            dbg.location(303,25);
                            pushFollow(FOLLOW_object_name_in_config_statement397);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:303:37: context
                            {
                            dbg.location(303,37);
                            pushFollow(FOLLOW_context_in_config_statement399);
                            context();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(303,46);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:303:46: ( object_name | policy )
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        alt10=1;
                    }
                    else if ( ((LA10_0>=82 && LA10_0<=83)) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("303:46: ( object_name | policy )", 10, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:303:47: object_name
                            {
                            dbg.location(303,47);
                            pushFollow(FOLLOW_object_name_in_config_statement403);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:303:59: policy
                            {
                            dbg.location(303,59);
                            pushFollow(FOLLOW_policy_in_config_statement405);
                            policy();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:305:2: 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) )
                    {
                    dbg.location(305,2);
                    	
                    		Context cxt = null; 
                    	
                    dbg.location(308,2);
                    match(input,31,FOLLOW_31_in_config_statement416); 
                    dbg.location(308,10);
                    match(input,34,FOLLOW_34_in_config_statement418); 
                    dbg.location(308,20);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:308:20: ( (context_obj_name= object_name ) | (context_sym= context ) )
                    int alt11=2;
                    try { dbg.enterSubRule(11);
                    try { dbg.enterDecision(11);

                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==34) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("308:20: ( (context_obj_name= object_name ) | (context_sym= context ) )", 11, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(11);}

                    switch (alt11) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:308:21: (context_obj_name= object_name )
                            {
                            dbg.location(308,21);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:308:21: (context_obj_name= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:308:22: context_obj_name= object_name
                            {
                            dbg.location(308,38);
                            pushFollow(FOLLOW_object_name_in_config_statement424);
                            context_obj_name=object_name();
                            _fsp--;


                            }

                            dbg.location(309,2);

                            		Symbol s = (Symbol) currentScope.getSymbol(input.toString(context_obj_name.start,context_obj_name.stop));
                            		try
                            		{
                            			System.out.println(s.type);
                             	 		if (s.type.equals("context_type_t")!=true)
                             	 		{
                             	   			throw (new DataFormatException(" apply:context:policy object"));
                             	 		}
                             	 	}
                             	 	catch (DataFormatException dfe)
                             	 	{
                             	    		System.out.println(dfe);
                             	    		dfe.printStackTrace();
                             	    		System.exit(1);
                             	  	}
                             		cxt = (Context)s.lookupValue();
                             	

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:327:5: (context_sym= context )
                            {
                            dbg.location(327,5);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:327:5: (context_sym= context )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:327:6: context_sym= context
                            {
                            dbg.location(327,18);
                            pushFollow(FOLLOW_context_in_config_statement439);
                            context_sym=context();
                            _fsp--;


                            }

                            dbg.location(328,3);

                             		cxt = (Context)context_sym.lookupValue();
                             	

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(11);}

                    dbg.location(331,3);

                    		Iterator <Policy> iter =cxt.context.iterator();
                     	 	while(iter.hasNext())
                     	 	{ 
                    			iter.next().configure("fw.xml","PolicyAdd","contextadd");	
                     	 	} 
                     	

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:339:3: 'undo' 'context' ( (var= object_name ) | (context_sym= context ) )
                    {
                    dbg.location(339,3);

                     		Context cxt = null;
                     	
                    dbg.location(342,3);
                    match(input,32,FOLLOW_32_in_config_statement462); 
                    dbg.location(342,10);
                    match(input,34,FOLLOW_34_in_config_statement464); 
                    dbg.location(342,20);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:342:20: ( (var= object_name ) | (context_sym= context ) )
                    int alt12=2;
                    try { dbg.enterSubRule(12);
                    try { dbg.enterDecision(12);

                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ID) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==34) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("342:20: ( (var= object_name ) | (context_sym= context ) )", 12, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(12);}

                    switch (alt12) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:342:21: (var= object_name )
                            {
                            dbg.location(342,21);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:342:21: (var= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:342:22: var= object_name
                            {
                            dbg.location(342,25);
                            pushFollow(FOLLOW_object_name_in_config_statement470);
                            var=object_name();
                            _fsp--;


                            }

                            dbg.location(343,3);

                            		Symbol s = (Symbol) currentScope.getSymbol(input.toString(var.start,var.stop));	
                             	
                             	  	try
                             	  	{
                             	        	if (s.type.equals("context_type_t")!=true)
                             	         	{
                             	           		throw (new DataFormatException(" undo:policy:policy object"));
                             	           	}
                             	     	}
                             	  	catch (DataFormatException dfe)
                             	 	{
                             	    		System.out.println(dfe);
                            		 	dfe.printStackTrace();
                            		 	System.exit(1);
                             	  	}	
                             		cxt = (Context)s.lookupValue();
                             	

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:361:3: (context_sym= context )
                            {
                            dbg.location(361,3);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:361:3: (context_sym= context )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:361:4: context_sym= context
                            {
                            dbg.location(361,16);
                            pushFollow(FOLLOW_context_in_config_statement485);
                            context_sym=context();
                            _fsp--;


                            }

                            dbg.location(362,3);

                             	 	cxt = (Context)context_sym.lookupValue();
                            	

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(12);}

                    dbg.location(366,3);

                     	 
                     	 	Iterator <Policy> iter =cxt.context.iterator();
                    		while(iter.hasNext())
                     	 	{ 
                     	   		iter.next().configure("fw.xml","PolicyDelete","contextdel");	
                     	 	}
                    	

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:375:2: 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) )
                    {
                    dbg.location(375,2);
                     
                    		Policy p=null;
                    	
                    dbg.location(378,2);
                    match(input,31,FOLLOW_31_in_config_statement510); 
                    dbg.location(378,10);
                    match(input,35,FOLLOW_35_in_config_statement512); 
                    dbg.location(378,19);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:378:19: ( (var= object_name ) | (policy_sym= policy ) )
                    int alt13=2;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13);

                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ID) ) {
                        alt13=1;
                    }
                    else if ( ((LA13_0>=82 && LA13_0<=83)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("378:19: ( (var= object_name ) | (policy_sym= policy ) )", 13, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:378:20: (var= object_name )
                            {
                            dbg.location(378,20);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:378:20: (var= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:378:21: var= object_name
                            {
                            dbg.location(378,24);
                            pushFollow(FOLLOW_object_name_in_config_statement518);
                            var=object_name();
                            _fsp--;


                            }

                            dbg.location(379,2);

                            		Symbol s = (Symbol) currentScope.getSymbol(input.toString(var.start,var.stop));
                             	  	try
                             	  	{
                             			if (s.type.equals("policy_type_t")!=true)
                             		      	{
                             	 	       		throw (new DataFormatException(" apply:policy:policy object"));
                             		      	}
                             	 	}
                             		catch (DataFormatException dfe)
                             	 	{
                             	    		System.out.println(dfe);
                             	    	  	dfe.printStackTrace();
                            	 	  	System.exit(1);
                            		}	
                            		p = (Policy) currentScope.lookup(input.toString(var.start,var.stop));		
                            	

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:397:2: (policy_sym= policy )
                            {
                            dbg.location(397,2);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:397:2: (policy_sym= policy )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:397:3: policy_sym= policy
                            {
                            dbg.location(397,14);
                            pushFollow(FOLLOW_policy_in_config_statement535);
                            policy_sym=policy();
                            _fsp--;


                            }

                            dbg.location(398,2);

                            		p = (Policy)policy_sym.lookupValue();	
                            	

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(401,2);

                    		p.configure("fw.xml","PolicyAdd","policyadd");
                     	

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:405:3: 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) )
                    {
                    dbg.location(405,3);
                     
                     		Policy p = null;
                     	
                    dbg.location(408,3);
                    match(input,32,FOLLOW_32_in_config_statement556); 
                    dbg.location(408,10);
                    match(input,35,FOLLOW_35_in_config_statement558); 
                    dbg.location(408,18);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:408:18: ( (var= object_name ) | (policy_sym= policy ) )
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ID) ) {
                        alt14=1;
                    }
                    else if ( ((LA14_0>=82 && LA14_0<=83)) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("408:18: ( (var= object_name ) | (policy_sym= policy ) )", 14, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:408:19: (var= object_name )
                            {
                            dbg.location(408,19);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:408:19: (var= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:408:20: var= object_name
                            {
                            dbg.location(408,23);
                            pushFollow(FOLLOW_object_name_in_config_statement563);
                            var=object_name();
                            _fsp--;


                            }

                            dbg.location(409,2);

                            		Symbol s = (Symbol) currentScope.getSymbol(input.toString(var.start,var.stop));
                             	  	try
                             	  	{
                             			if (s.type.equals("policy_type_t")!=true)
                             		      	{
                             	 	       		throw (new DataFormatException(" apply:policy:policy object"));
                             		      	}
                             	 	}
                             		catch (DataFormatException dfe)
                             	 	{
                             	    		System.out.println(dfe);
                             	    	  	dfe.printStackTrace();
                            	 	  	System.exit(1);
                             	  	}	
                            		p = (Policy) currentScope.lookup(input.toString(var.start,var.stop));		
                            	

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:427:2: (policy_sym= policy )
                            {
                            dbg.location(427,2);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:427:2: (policy_sym= policy )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:427:3: policy_sym= policy
                            {
                            dbg.location(427,14);
                            pushFollow(FOLLOW_policy_in_config_statement580);
                            policy_sym=policy();
                            _fsp--;


                            }

                            dbg.location(428,2);

                            		p = (Policy)policy_sym.lookupValue();
                            		
                            	

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(432,3);

                     		p.configure("fw.xml","PolicyDelete","policydel");
                     	

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:435:5: set_oper 'host_group' ( object_name | host_group ) ( object_name | host )
                    {
                    dbg.location(435,5);
                    pushFollow(FOLLOW_set_oper_in_config_statement596);
                    set_oper();
                    _fsp--;

                    dbg.location(435,14);
                    match(input,36,FOLLOW_36_in_config_statement598); 
                    dbg.location(435,27);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:435:27: ( object_name | host_group )
                    int alt15=2;
                    try { dbg.enterSubRule(15);
                    try { dbg.enterDecision(15);

                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ID) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==36) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("435:27: ( object_name | host_group )", 15, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(15);}

                    switch (alt15) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:435:28: object_name
                            {
                            dbg.location(435,28);
                            pushFollow(FOLLOW_object_name_in_config_statement601);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:435:41: host_group
                            {
                            dbg.location(435,41);
                            pushFollow(FOLLOW_host_group_in_config_statement604);
                            host_group();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(435,53);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:435:53: ( object_name | host )
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16);

                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ID) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==88) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("435:53: ( object_name | host )", 16, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:435:54: object_name
                            {
                            dbg.location(435,54);
                            pushFollow(FOLLOW_object_name_in_config_statement608);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:435:66: host
                            {
                            dbg.location(435,66);
                            pushFollow(FOLLOW_host_in_config_statement610);
                            host();
                            _fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}


                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:437:3: config_display
                    {
                    dbg.location(437,3);
                    pushFollow(FOLLOW_config_display_in_config_statement617);
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
        dbg.location(438, 3);

        }
        finally {
            dbg.exitRule("config_statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end config_statement


    // $ANTLR start set_oper
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:451:1: set_oper : ( 'add' 'to' | 'delete' 'from' );
    public final void set_oper() throws RecognitionException {
        try { dbg.enterRule("set_oper");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(451, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:452:2: ( 'add' 'to' | 'delete' 'from' )
            int alt18=2;
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==39) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("451:1: set_oper : ( 'add' 'to' | 'delete' 'from' );", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:452:3: 'add' 'to'
                    {
                    dbg.location(452,3);
                    match(input,37,FOLLOW_37_in_set_oper666); 
                    dbg.location(452,9);
                    match(input,38,FOLLOW_38_in_set_oper668); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:453:4: 'delete' 'from'
                    {
                    dbg.location(453,4);
                    match(input,39,FOLLOW_39_in_set_oper673); 
                    dbg.location(453,13);
                    match(input,40,FOLLOW_40_in_set_oper675); 

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
        dbg.location(454, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:456:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );
    public final void config_display() throws RecognitionException {
        try { dbg.enterRule("config_display");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(456, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:457:3: ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' )
            int alt19=4;
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==42) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==43) ) {
                        alt19=1;
                    }
                    else if ( (LA19_3==29) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("456:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 19, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("456:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 19, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA19_0==44) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==42) ) {
                    int LA19_4 = input.LA(3);

                    if ( (LA19_4==43) ) {
                        alt19=3;
                    }
                    else if ( (LA19_4==29) ) {
                        alt19=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("456:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 19, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("456:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 19, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("456:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:457:4: 'route' 'show' 'numeric'
                    {
                    dbg.location(457,4);
                    match(input,41,FOLLOW_41_in_config_display690); 
                    dbg.location(457,12);
                    match(input,42,FOLLOW_42_in_config_display692); 
                    dbg.location(457,19);
                    match(input,43,FOLLOW_43_in_config_display694); 
                    dbg.location(457,30);
                    Route.display("route.xml","DisplayRouteNumeric","RouteDisp");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:458:4: 'route' 'show'
                    {
                    dbg.location(458,4);
                    match(input,41,FOLLOW_41_in_config_display702); 
                    dbg.location(458,12);
                    match(input,42,FOLLOW_42_in_config_display704); 
                    dbg.location(458,20);
                    Route.display("route.xml","DisplayRoute","RouteDisp");

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:459:4: 'fw' 'show' 'numeric'
                    {
                    dbg.location(459,4);
                    match(input,44,FOLLOW_44_in_config_display712); 
                    dbg.location(459,9);
                    match(input,42,FOLLOW_42_in_config_display714); 
                    dbg.location(459,16);
                    match(input,43,FOLLOW_43_in_config_display716); 
                    dbg.location(459,26);
                    Policy.display("fw.xml","DisplayRulesNumeric","RulesDisp");

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:460:3: 'fw' 'show'
                    {
                    dbg.location(460,3);
                    match(input,44,FOLLOW_44_in_config_display722); 
                    dbg.location(460,8);
                    match(input,42,FOLLOW_42_in_config_display724); 
                    dbg.location(460,15);
                    Policy.display("fw.xml","DisplayRules","RulesDisp");

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
        dbg.location(461, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:469:2: condition_statement : 'if' '(' val= logicalOR_expr ')' if_statement_list ( 'else' if_statement_list )? 'endif' ;
    public final void condition_statement() throws RecognitionException {
        Symbol val = null;



         	IfElse parent, condition;
         	if(g_ifStack.empty())
        		parent = null;
        	else
         		parent = (IfElse) g_ifStack.peek();
         
        try { dbg.enterRule("condition_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(469, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:483:3: ( 'if' '(' val= logicalOR_expr ')' if_statement_list ( 'else' if_statement_list )? 'endif' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:483:5: 'if' '(' val= logicalOR_expr ')' if_statement_list ( 'else' if_statement_list )? 'endif'
            {
            dbg.location(483,5);
            match(input,45,FOLLOW_45_in_condition_statement762); 
            dbg.location(483,10);
            match(input,OPAREN,FOLLOW_OPAREN_in_condition_statement764); 
            dbg.location(483,17);
            pushFollow(FOLLOW_logicalOR_expr_in_condition_statement768);
            val=logicalOR_expr();
            _fsp--;

            dbg.location(484,6);

               		condition = new IfElse(parent);
             		if(parent != null)
             			condition.setIgnore(parent.getIgnore());
             		g_ifStack.push(condition);
             		if(!condition.getIgnore())
             		{
             			
            	   		if (((IntType)val.lookupValue()).getValue() == 0)
            	   		{
            	   			System.out.println("Equality Expr: false"); 
            	   			((IfElse)g_ifStack.peek()).setIgnore(true);
            	   			g_ignore_stmt = true;
            	   			g_action = "else";
            	   		}
            	   		else
            	   		{
            	   			System.out.println("Equality Expr: true");
            	   			g_ignore_stmt = false;
            	   			g_action = "if";
            	   		}
            	   	}
               	
            dbg.location(506,7);
            match(input,CPAREN,FOLLOW_CPAREN_in_condition_statement778); 
            dbg.location(507,3);
            pushFollow(FOLLOW_if_statement_list_in_condition_statement783);
            if_statement_list();
            _fsp--;

            dbg.location(507,21);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:507:21: ( 'else' if_statement_list )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==ELSE) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:507:22: 'else' if_statement_list
                    {
                    dbg.location(507,22);
                    match(input,ELSE,FOLLOW_ELSE_in_condition_statement786); 
                    dbg.location(508,3);

                     		//Pop the previous if
                     		g_ifStack.pop();
                     		condition = new IfElse(parent);
                    	 	if(parent != null)
                     			condition.setIgnore(parent.getIgnore());
                     		g_ifStack.push(condition);
                     		if((!condition.getIgnore()) && g_action.equals("else"))
                     		{
                     			g_ignore_stmt = false;
                     		}
                     		else
                     		{
                     			g_ignore_stmt = true;
                     		}
                     	
                    dbg.location(524,3);
                    pushFollow(FOLLOW_if_statement_list_in_condition_statement796);
                    if_statement_list();
                    _fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(524,23);
            match(input,ENDIF,FOLLOW_ENDIF_in_condition_statement800); 
            dbg.location(525,3);

             		if(!g_ifStack.empty())
            			g_ifStack.pop();
            		//No dangling else
             		if(g_ifStack.empty())
             		{
            			g_ignore_stmt = false;
            		}
            		//There is a dangling else. So parse it
            		else
            		{
            			if(((IfElse)g_ifStack.peek()).getIgnore())
            				g_ignore_stmt = true;
            			else
            				g_ignore_stmt = false;
            		}
            		if(input.LA(1) == ELSE)
            		{
            			match(input,ELSE,FOLLOW_ELSE_in_condition_statement786);  
            			//Check the value of TOS to see if expression was true
            			boolean ignoreFlag = ((IfElse)g_ifStack.peek()).getIgnore();
            			g_ifStack.pop();
            			//Do what you do for else
            			if(g_ifStack.empty())
            				parent = null;
            			else
             				parent = (IfElse) g_ifStack.peek();
            	 		condition = new IfElse(parent);
            			if(parent != null)
            	 			condition.setIgnore(parent.getIgnore());
            	 		if(!ignoreFlag)
            	 			condition.setIgnore(true);
            	 		g_ifStack.push(condition);
            	 		if((!condition.getIgnore()) && g_action.equals("else"))
            	 		{
            	 			g_ignore_stmt = false;
            	 		}
            	 		else
            	 		{
            	 			g_ignore_stmt = true;
            	 		}
            	 		if_statement_list();
            	 		g_ifStack.pop();
            	 	}			
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(570, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:572:2: iteration_statement : 'while' '(' val= equality_expr ')' if_statement_list 'endwhile' ;
    public final void iteration_statement() throws RecognitionException {
        equality_expr_return val = null;



         	int condMet;
         	int start_index;
         	int stmt_index;
         	int end_index;
         	IfElse parent, condition;
         	if(g_ifStack.empty())
        		parent = null;
        	else
         		parent = (IfElse) g_ifStack.peek();
         
        try { dbg.enterRule("iteration_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(572, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:591:3: ( 'while' '(' val= equality_expr ')' if_statement_list 'endwhile' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:591:4: 'while' '(' val= equality_expr ')' if_statement_list 'endwhile'
            {
            dbg.location(591,4);
            match(input,46,FOLLOW_46_in_iteration_statement835); 
            dbg.location(592,2);

             		start_index = input.index();
             	
            dbg.location(596,3);
            match(input,OPAREN,FOLLOW_OPAREN_in_iteration_statement847); 
            dbg.location(596,10);
            pushFollow(FOLLOW_equality_expr_in_iteration_statement851);
            val=equality_expr();
            _fsp--;

            dbg.location(597,2);

             		stmt_index = input.index();
             	
            dbg.location(600,3);
            match(input,CPAREN,FOLLOW_CPAREN_in_iteration_statement861); 
            dbg.location(601,2);

             		condition = new IfElse(parent);
             		if(parent != null)
             		condition.setIgnore(parent.getIgnore());
             		g_ifStack.push(condition);
             		g_ignore_stmt = condition.getIgnore();
             		if(!g_ignore_stmt)
             		{	
               			if (((IntType)val.sym.lookupValue()).getValue() == 0)
               			{
               				((IfElse)g_ifStack.peek()).setIgnore(true);
               				g_ignore_stmt = true;
               				g_action = "else";
               			}
               			else
               			{
               				g_ignore_stmt = false;
               				g_action = "if";
               			}
               		}
             	
            dbg.location(622,3);
            pushFollow(FOLLOW_if_statement_list_in_iteration_statement871);
            if_statement_list();
            _fsp--;

            dbg.location(623,2);

             		end_index = input.index();
             	
            dbg.location(627,3);
            match(input,ENDWHILE,FOLLOW_ENDWHILE_in_iteration_statement881); 
            dbg.location(628,3);

             		if(!g_ignore_stmt)
             		{
             			while(((IntType)val.sym.lookupValue()).getValue() == 1)
             			{
             			input.rewind(start_index);
             			match(input,OPAREN,FOLLOW_OPAREN_in_iteration_statement847);  
             			val = equality_expr();
             			if (((IntType)val.sym.lookupValue()).getValue() == 1)
               			{
               				input.rewind(stmt_index);
               				if(input.LA(1) == CPAREN)
               				{
               					match(input,CPAREN,FOLLOW_CPAREN_in_iteration_statement861);  
               					if_statement_list();
               				}
               			}
               			else
               			{
               				input.rewind(stmt_index);
               				if(input.LA(1) == CPAREN)
               				{
               					match(input,CPAREN,FOLLOW_CPAREN_in_iteration_statement861);  
               				}
               				break;
               			}
               			}
               			input.rewind(end_index);
               			if(input.LA(1) == ENDWHILE)
               			{
               				match(input,ENDWHILE,FOLLOW_ENDWHILE_in_iteration_statement881);  
               			}
             		}
              		g_ifStack.pop();
              		g_ignore_stmt = false;
             	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(664, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:666:2: print_statement : 'echo' STRING ';' ;
    public final void print_statement() throws RecognitionException {
        Token STRING1=null;

        try { dbg.enterRule("print_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(666, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:667:3: ( 'echo' STRING ';' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:667:5: 'echo' STRING ';'
            {
            dbg.location(667,5);
            match(input,47,FOLLOW_47_in_print_statement902); 
            dbg.location(667,12);
            STRING1=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement904); 
            dbg.location(668,2);

             		if(!g_ignore_stmt)
             			System.out.println(STRING1.getText());
             	
            dbg.location(671,4);
            match(input,29,FOLLOW_29_in_print_statement910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(672, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:674:2: expression : assignment_expr ;
    public final void expression() throws RecognitionException {
        try { dbg.enterRule("expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(674, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:675:3: ( assignment_expr )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:675:5: assignment_expr
            {
            dbg.location(675,5);
            pushFollow(FOLLOW_assignment_expr_in_expression926);
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
        dbg.location(676, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:678:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );
    public final void assignment_expr() throws RecognitionException {
        object_name_return var = null;

        assignment_operator_return op = null;

        Symbol e = null;


        try { dbg.enterRule("assignment_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(678, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:679:4: (var= object_name op= assignment_operator assignment_expr | e= conditional_expr )
            int alt21=2;
            try { dbg.enterDecision(21);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EQUAL||(LA21_1>=59 && LA21_1<=62)) ) {
                    alt21=1;
                }
                else if ( ((LA21_1>=PLUS && LA21_1<=DIV)||LA21_1==DOT||LA21_1==29||(LA21_1>=48 && LA21_1<=57)) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("678:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 21, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA21_0==NUMBER||LA21_0==STRING||LA21_0==CHAR||LA21_0==34||LA21_0==36||LA21_0==58||(LA21_0>=81 && LA21_0<=83)||(LA21_0>=88 && LA21_0<=89)||LA21_0==92||(LA21_0>=94 && LA21_0<=95)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("678:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:679:6: var= object_name op= assignment_operator assignment_expr
                    {
                    dbg.location(679,9);
                    pushFollow(FOLLOW_object_name_in_assignment_expr945);
                    var=object_name();
                    _fsp--;

                    dbg.location(679,24);
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr949);
                    op=assignment_operator();
                    _fsp--;

                    dbg.location(680,3);

                    	 	if(!g_ignore_stmt)
                    	 	{	 	
                    	 		Symbol s = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			Assignment asn = new Assignment(s, input.toString(op.start,op.stop));
                    			map.put(input.toString(var.start,var.stop), asn);
                    			System.out.println("here");
                    		//	currentScope.printSymbols();
                    		}
                    	
                    dbg.location(690,3);
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr958);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:692:5: e= conditional_expr
                    {
                    dbg.location(692,6);
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr969);
                    e=conditional_expr();
                    _fsp--;

                    dbg.location(693,3);

                     		try
                     		{
                     			if(!g_ignore_stmt)
                     			{
                     				System.out.println("Cond expr: " + e);
                    	 			Set entries = map.entrySet();
                    				Iterator iter = entries.iterator();
                    				while(iter.hasNext() && e != null)
                    				{
                    					Map.Entry entry = (Map.Entry)iter.next();
                    					String key = (String)entry.getKey();
                    					//System.out.println(" going to search for symbol with name : "+key);
                    					//This portion added by Chitra
                    					if(e.getType().equals("int_type_t") || e.getType().equals("char_type_t"))
                    					{
                    						Assignment asn = (Assignment)entry.getValue();
                    						asn.assignValue(e);
                    					}
                    					else
                    					{
                    						Symbol s = new Symbol(key, e.getType(), e.lookupValue());
                    						//-- COMMENT: Somehow this statement is not reflecting a change in the symbol value
                    						if (currentScope.setSymbolValue(key, s) == -1)	
                    						{
                    						     System.out.println(" problem setting symbol : ");
                    						}
                    						//System.out.println("Symbol table:  " + s.getName()+" "+ s.getType() + " " + s.getString());
                    					}
                    				} //End of While
                    				map.clear();
                    			} //End of If
                     		}
                     		catch(Exception eee)
                    		{
                    			eee.printStackTrace();
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
        dbg.location(731, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:735:2: conditional_expr returns [Symbol sym] : val1= logicalOR_expr ;
    public final Symbol conditional_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol val1 = null;


        try { dbg.enterRule("conditional_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(735, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:736:3: (val1= logicalOR_expr )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:736:5: val1= logicalOR_expr
            {
            dbg.location(736,9);
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr1002);
            val1=logicalOR_expr();
            _fsp--;

            dbg.location(737,2);
             
             		if(!g_ignore_stmt)
             			sym = val1;
             	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(743, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:745:2: logicalOR_expr returns [Symbol sym] : val1= logicalAND_expr (op= '||' val2= logicalAND_expr )* ;
    public final Symbol logicalOR_expr() throws RecognitionException {
        Symbol sym = null;

        Token op=null;
        logicalAND_expr_return val1 = null;

        logicalAND_expr_return val2 = null;


        try { dbg.enterRule("logicalOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(745, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:746:3: (val1= logicalAND_expr (op= '||' val2= logicalAND_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:746:5: val1= logicalAND_expr (op= '||' val2= logicalAND_expr )*
            {
            dbg.location(746,9);
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr1034);
            val1=logicalAND_expr();
            _fsp--;

            dbg.location(747,3);
             
             		if(!g_ignore_stmt)
             			sym = val1.sym;
             	
            dbg.location(751,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:751:3: (op= '||' val2= logicalAND_expr )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:751:4: op= '||' val2= logicalAND_expr
            	    {
            	    dbg.location(751,6);
            	    op=(Token)input.LT(1);
            	    match(input,48,FOLLOW_48_in_logicalOR_expr1047); 
            	    dbg.location(751,16);
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr1051);
            	    val2=logicalAND_expr();
            	    _fsp--;

            	    dbg.location(752,2);

            	    		try
            	    		{
            	    			if(!g_ignore_stmt)
            	    			{
            	    				//System.out.println(input.toString(val1.start,val1.stop) + " " + input.toString(val2.start,val2.stop));
            	    				Symbol s = new Symbol("literal", sym.getType()); 
            	    				Expression expr = new Expression(s, op.getText());
            	    				expr.assignValue(sym, val2.sym);
            	    				sym = expr.getSymbol();
            	    			}
            	    		}
            	    		catch(Exception eee)
            	    		{
            	    			 eee.printStackTrace();
            	    		}
            	    	

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
        dbg.location(770, 3);

        }
        finally {
            dbg.exitRule("logicalOR_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end logicalOR_expr

    public static class logicalAND_expr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start logicalAND_expr
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:772:2: logicalAND_expr returns [Symbol sym] : val1= bitwiseOR_expr (op= '&&' val2= bitwiseOR_expr )* ;
    public final logicalAND_expr_return logicalAND_expr() throws RecognitionException {
        logicalAND_expr_return retval = new logicalAND_expr_return();
        retval.start = input.LT(1);

        Token op=null;
        bitwiseOR_expr_return val1 = null;

        bitwiseOR_expr_return val2 = null;


        try { dbg.enterRule("logicalAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(772, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:773:3: (val1= bitwiseOR_expr (op= '&&' val2= bitwiseOR_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:773:5: val1= bitwiseOR_expr (op= '&&' val2= bitwiseOR_expr )*
            {
            dbg.location(773,9);
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr1084);
            val1=bitwiseOR_expr();
            _fsp--;

            dbg.location(774,3);
             
             		if(!g_ignore_stmt) 
             			retval.sym = val1.sym;
             	
            dbg.location(778,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:778:3: (op= '&&' val2= bitwiseOR_expr )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==49) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:778:4: op= '&&' val2= bitwiseOR_expr
            	    {
            	    dbg.location(778,6);
            	    op=(Token)input.LT(1);
            	    match(input,49,FOLLOW_49_in_logicalAND_expr1096); 
            	    dbg.location(778,16);
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr1100);
            	    val2=bitwiseOR_expr();
            	    _fsp--;

            	    dbg.location(779,2);

            	    		try
            	    		{
            	    			if(!g_ignore_stmt)
            	    			{
            	    				//System.out.println(input.toString(val1.start,val1.stop) + " " + input.toString(val2.start,val2.stop));
            	    				Symbol s = new Symbol("literal", retval.sym.getType()); 
            	    				Expression expr = new Expression(s, op.getText());
            	    				expr.assignValue(retval.sym, val2.sym);
            	    				retval.sym = expr.getSymbol();
            	    			}
            	    		}
            	    		catch(Exception eee)
            	    		{
            	    			eee.printStackTrace();
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(797, 3);

        }
        finally {
            dbg.exitRule("logicalAND_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end logicalAND_expr

    public static class bitwiseOR_expr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start bitwiseOR_expr
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:799:2: bitwiseOR_expr returns [Symbol sym] : val1= bitwiseAND_expr (op= '|' val2= bitwiseAND_expr )* ;
    public final bitwiseOR_expr_return bitwiseOR_expr() throws RecognitionException {
        bitwiseOR_expr_return retval = new bitwiseOR_expr_return();
        retval.start = input.LT(1);

        Token op=null;
        bitwiseAND_expr_return val1 = null;

        bitwiseAND_expr_return val2 = null;


        try { dbg.enterRule("bitwiseOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(799, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:800:3: (val1= bitwiseAND_expr (op= '|' val2= bitwiseAND_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:800:5: val1= bitwiseAND_expr (op= '|' val2= bitwiseAND_expr )*
            {
            dbg.location(800,9);
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr1133);
            val1=bitwiseAND_expr();
            _fsp--;

            dbg.location(801,3);
             
             		if(!g_ignore_stmt) 
             			retval.sym = val1.sym;
             	
            dbg.location(805,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:805:3: (op= '|' val2= bitwiseAND_expr )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==50) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:805:4: op= '|' val2= bitwiseAND_expr
            	    {
            	    dbg.location(805,6);
            	    op=(Token)input.LT(1);
            	    match(input,50,FOLLOW_50_in_bitwiseOR_expr1145); 
            	    dbg.location(805,15);
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr1149);
            	    val2=bitwiseAND_expr();
            	    _fsp--;

            	    dbg.location(806,3);

            	     		try
            	     		{
            	    	 		if(!g_ignore_stmt)
            	    	 		{
            	    				//System.out.println(input.toString(val1.start,val1.stop) + " " + input.toString(val2.start,val2.stop));
            	    				Symbol s = new Symbol("literal", retval.sym.getType()); 
            	    				Expression expr = new Expression(s, op.getText());
            	    				expr.assignValue(retval.sym, val2.sym);
            	    				retval.sym = expr.getSymbol();
            	    			}
            	    		}
            	    		catch(Exception eee)
            	    		{
            	    			 eee.printStackTrace();
            	    			 		}
            	    	

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(824, 3);

        }
        finally {
            dbg.exitRule("bitwiseOR_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end bitwiseOR_expr

    public static class bitwiseAND_expr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start bitwiseAND_expr
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:826:2: bitwiseAND_expr returns [Symbol sym] : val1= equality_expr (op= '&' val2= equality_expr )* ;
    public final bitwiseAND_expr_return bitwiseAND_expr() throws RecognitionException {
        bitwiseAND_expr_return retval = new bitwiseAND_expr_return();
        retval.start = input.LT(1);

        Token op=null;
        equality_expr_return val1 = null;

        equality_expr_return val2 = null;


        try { dbg.enterRule("bitwiseAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(826, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:827:3: (val1= equality_expr (op= '&' val2= equality_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:827:5: val1= equality_expr (op= '&' val2= equality_expr )*
            {
            dbg.location(827,9);
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr1182);
            val1=equality_expr();
            _fsp--;

            dbg.location(828,3);
             
             		if(!g_ignore_stmt) 
             			retval.sym = val1.sym;
             	
            dbg.location(832,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:832:3: (op= '&' val2= equality_expr )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==51) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:832:4: op= '&' val2= equality_expr
            	    {
            	    dbg.location(832,6);
            	    op=(Token)input.LT(1);
            	    match(input,51,FOLLOW_51_in_bitwiseAND_expr1194); 
            	    dbg.location(832,15);
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr1198);
            	    val2=equality_expr();
            	    _fsp--;

            	    dbg.location(833,2);

            	     		try
            	     		{
            	    	 		if(!g_ignore_stmt)
            	    	 		{
            	    				//System.out.println(input.toString(val1.start,val1.stop) + " " + input.toString(val2.start,val2.stop));
            	    				Symbol s = new Symbol("literal", retval.sym.getType()); 
            	    				Expression expr = new Expression(s, op.getText());
            	    				expr.assignValue(retval.sym, val2.sym);
            	    				retval.sym = expr.getSymbol();
            	    			}
            	    		}
            	    		catch(Exception eee)
            	    		{
            	    			eee.printStackTrace();
            	    		}		
            	    	

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(851, 3);

        }
        finally {
            dbg.exitRule("bitwiseAND_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end bitwiseAND_expr

    public static class equality_expr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start equality_expr
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:853:2: equality_expr returns [Symbol sym] : val1= relational_expr (op= ( '==' | '!=' ) val2= relational_expr )* ;
    public final equality_expr_return equality_expr() throws RecognitionException {
        equality_expr_return retval = new equality_expr_return();
        retval.start = input.LT(1);

        Token op=null;
        relational_expr_return val1 = null;

        relational_expr_return val2 = null;


        try { dbg.enterRule("equality_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(853, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:854:3: (val1= relational_expr (op= ( '==' | '!=' ) val2= relational_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:854:5: val1= relational_expr (op= ( '==' | '!=' ) val2= relational_expr )*
            {
            dbg.location(854,9);
            pushFollow(FOLLOW_relational_expr_in_equality_expr1232);
            val1=relational_expr();
            _fsp--;

            dbg.location(855,3);
             
             		if(!g_ignore_stmt) 
             			retval.sym = val1.sym;
             	
            dbg.location(859,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:859:3: (op= ( '==' | '!=' ) val2= relational_expr )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=52 && LA26_0<=53)) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:859:5: op= ( '==' | '!=' ) val2= relational_expr
            	    {
            	    dbg.location(859,7);
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=52 && input.LA(1)<=53) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr1244);    throw mse;
            	    }

            	    dbg.location(859,26);
            	    pushFollow(FOLLOW_relational_expr_in_equality_expr1254);
            	    val2=relational_expr();
            	    _fsp--;

            	    dbg.location(860,2);

            	     		try
            	     		{
            	    	 		if(!g_ignore_stmt)
            	    	 		{
            	    				//System.out.println(input.toString(val1.start,val1.stop) + " " + input.toString(val2.start,val2.stop));
            	    				Symbol s = new Symbol("literal", retval.sym.getType()); 
            	    				Expression expr = new Expression(s, op.getText());
            	    				expr.assignValue(retval.sym, val2.sym);
            	    				retval.sym = expr.getSymbol();
            	    			}
            	    		}
            	    		catch(Exception eee)
            	    		{
            	    			eee.printStackTrace();
            	    		}		
            	    	

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(878, 3);

        }
        finally {
            dbg.exitRule("equality_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end equality_expr

    public static class relational_expr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start relational_expr
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:880:2: relational_expr returns [Symbol sym] : val1= expr (op= ( '<' | '>' | '<=' | '>=' ) val2= expr )* ;
    public final relational_expr_return relational_expr() throws RecognitionException {
        relational_expr_return retval = new relational_expr_return();
        retval.start = input.LT(1);

        Token op=null;
        expr_return val1 = null;

        expr_return val2 = null;


        try { dbg.enterRule("relational_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(880, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:881:3: (val1= expr (op= ( '<' | '>' | '<=' | '>=' ) val2= expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:881:5: val1= expr (op= ( '<' | '>' | '<=' | '>=' ) val2= expr )*
            {
            dbg.location(881,9);
            pushFollow(FOLLOW_expr_in_relational_expr1287);
            val1=expr();
            _fsp--;

            dbg.location(882,3);
             
             		if(!g_ignore_stmt) 
             			retval.sym = val1.sym;
             	
            dbg.location(886,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:886:3: (op= ( '<' | '>' | '<=' | '>=' ) val2= expr )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27);

                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=54 && LA27_0<=57)) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:886:5: op= ( '<' | '>' | '<=' | '>=' ) val2= expr
            	    {
            	    dbg.location(886,7);
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=54 && input.LA(1)<=57) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr1299);    throw mse;
            	    }

            	    dbg.location(886,32);
            	    pushFollow(FOLLOW_expr_in_relational_expr1311);
            	    val2=expr();
            	    _fsp--;

            	    dbg.location(887,2);

            	     		try
            	     		{
            	    	 		if(!g_ignore_stmt)
            	    	 		{
            	    				//System.out.println(input.toString(val1.start,val1.stop) + " " + input.toString(val2.start,val2.stop));
            	    				Symbol s = new Symbol("literal", retval.sym.getType()); 
            	    				Expression expr = new Expression(s, op.getText());
            	    				expr.assignValue(retval.sym, val2.sym);
            	    				retval.sym = expr.getSymbol();
            	    			}
            	    		}
            	    		catch(Exception eee)
            	    		{
            	    			eee.printStackTrace();
            	    		}		
            	    	

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(905, 3);

        }
        finally {
            dbg.exitRule("relational_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end relational_expr

    public static class expr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start expr
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:908:2: expr returns [Symbol sym] : val1= term (op= ( PLUS | MINUS ) val2= term )* ;
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        Token op=null;
        term_return val1 = null;

        term_return val2 = null;


        try { dbg.enterRule("expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(908, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:909:3: (val1= term (op= ( PLUS | MINUS ) val2= term )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:909:5: val1= term (op= ( PLUS | MINUS ) val2= term )*
            {
            dbg.location(909,9);
            pushFollow(FOLLOW_term_in_expr1345);
            val1=term();
            _fsp--;

            dbg.location(910,2);
             
            		if(!g_ignore_stmt) 
            			retval.sym = val1.sym;
            	
            dbg.location(914,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:914:3: (op= ( PLUS | MINUS ) val2= term )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28);

                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=PLUS && LA28_0<=MINUS)) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:914:5: op= ( PLUS | MINUS ) val2= term
            	    {
            	    dbg.location(914,7);
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr1360);    throw mse;
            	    }

            	    dbg.location(914,30);
            	    pushFollow(FOLLOW_term_in_expr1373);
            	    val2=term();
            	    _fsp--;

            	    dbg.location(915,2);

            	    		try
            	    		{
            	    			if(!g_ignore_stmt)
            	    			{
            	    				//System.out.println(input.toString(val1.start,val1.stop) + " " + input.toString(val2.start,val2.stop));
            	    				Symbol s = new Symbol("literal", retval.sym.getType()); 
            	    				Expression expr = new Expression(s, op.getText());
            	    				expr.assignValue(retval.sym, val2.sym);
            	    				retval.sym = expr.getSymbol();
            	    			}
            	    		}
            	    		catch(Exception eee)
            	    		{
            	    			eee.printStackTrace();
            	    		}	
            	    	

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(933, 3);

        }
        finally {
            dbg.exitRule("expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end expr

    public static class term_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start term
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:935:2: term returns [Symbol sym] : val1= unary_expr (op= ( MULT | DIV ) val2= unary_expr )* ;
    public final term_return term() throws RecognitionException {
        term_return retval = new term_return();
        retval.start = input.LT(1);

        Token op=null;
        Symbol val1 = null;

        Symbol val2 = null;


        try { dbg.enterRule("term");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(935, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:936:3: (val1= unary_expr (op= ( MULT | DIV ) val2= unary_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:936:5: val1= unary_expr (op= ( MULT | DIV ) val2= unary_expr )*
            {
            dbg.location(936,9);
            pushFollow(FOLLOW_unary_expr_in_term1409);
            val1=unary_expr();
            _fsp--;

            dbg.location(937,3);
             
             		if(!g_ignore_stmt) 
             			retval.sym = val1;
             	
            dbg.location(941,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:941:3: (op= ( MULT | DIV ) val2= unary_expr )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29);

                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=MULT && LA29_0<=DIV)) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:941:5: op= ( MULT | DIV ) val2= unary_expr
            	    {
            	    dbg.location(941,7);
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term1423);    throw mse;
            	    }

            	    dbg.location(941,27);
            	    pushFollow(FOLLOW_unary_expr_in_term1435);
            	    val2=unary_expr();
            	    _fsp--;

            	    dbg.location(942,2);

            	    		try
            	    		{
            	    			if(!g_ignore_stmt)
            	    			{
            	    				Symbol s = new Symbol("literal", retval.sym.getType()); 
            	    				Expression expr = new Expression(s, op.getText());
            	    				expr.assignValue(retval.sym, val2);
            	    				retval.sym = expr.getSymbol();
            	    			}
            	    		}
            	    		catch(Exception eee)
            	    		{
            	    			eee.printStackTrace();
            	    		}		
            	    	

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(959, 3);

        }
        finally {
            dbg.exitRule("term");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end term


    // $ANTLR start unary_expr
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:961:2: unary_expr returns [Symbol sym] : (val1= postfix_expression | '~' unary_expr );
    public final Symbol unary_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol val1 = null;


        try { dbg.enterRule("unary_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(961, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:962:3: (val1= postfix_expression | '~' unary_expr )
            int alt30=2;
            try { dbg.enterDecision(30);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==NUMBER||(LA30_0>=STRING && LA30_0<=CHAR)||LA30_0==34||LA30_0==36||(LA30_0>=81 && LA30_0<=83)||(LA30_0>=88 && LA30_0<=89)||LA30_0==92||(LA30_0>=94 && LA30_0<=95)) ) {
                alt30=1;
            }
            else if ( (LA30_0==58) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("961:2: unary_expr returns [Symbol sym] : (val1= postfix_expression | '~' unary_expr );", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:962:4: val1= postfix_expression
                    {
                    dbg.location(962,8);
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr1468);
                    val1=postfix_expression();
                    _fsp--;

                    dbg.location(963,3);
                     
                     		if(!g_ignore_stmt) 
                     			sym = val1;
                     	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:967:5: '~' unary_expr
                    {
                    dbg.location(967,5);
                    match(input,58,FOLLOW_58_in_unary_expr1478); 
                    dbg.location(967,9);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr1480);
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
        dbg.location(970, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:972:2: postfix_expression returns [Symbol sym] : e= factor ( '.' ID )* ;
    public final Symbol postfix_expression() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("postfix_expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(972, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:973:3: (e= factor ( '.' ID )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:973:5: e= factor ( '.' ID )*
            {
            dbg.location(973,6);
            pushFollow(FOLLOW_factor_in_postfix_expression1507);
            e=factor();
            _fsp--;

            dbg.location(973,14);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:973:14: ( '.' ID )*
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=2;
                try { dbg.enterDecision(31);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==DOT) ) {
                    alt31=1;
                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:973:15: '.' ID
            	    {
            	    dbg.location(973,15);
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression1510); 
            	    dbg.location(973,18);
            	    match(input,ID,FOLLOW_ID_in_postfix_expression1511); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);
            } finally {dbg.exitSubRule(31);}

            dbg.location(974,3);
             
             		if(!g_ignore_stmt) 
             			sym = e;
             	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(978, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:980:2: assignment_operator : ( '=' | '*=' | '/=' | '+=' | '-=' );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("assignment_operator");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(980, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:981:3: ( '=' | '*=' | '/=' | '+=' | '-=' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:
            {
            dbg.location(981,3);
            if ( input.LA(1)==EQUAL||(input.LA(1)>=59 && input.LA(1)<=62) ) {
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
        dbg.location(986, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:988:2: factor returns [Symbol sym] : ( ID | e= literal );
    public final Symbol factor() throws RecognitionException {
        Symbol sym = null;

        Token ID2=null;
        Symbol e = null;


        try { dbg.enterRule("factor");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(988, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:989:2: ( ID | e= literal )
            int alt32=2;
            try { dbg.enterDecision(32);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==NUMBER||LA32_0==STRING||LA32_0==CHAR||LA32_0==34||LA32_0==36||(LA32_0>=81 && LA32_0<=83)||(LA32_0>=88 && LA32_0<=89)||LA32_0==92||(LA32_0>=94 && LA32_0<=95)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("988:2: factor returns [Symbol sym] : ( ID | e= literal );", 32, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:989:4: ID
                    {
                    dbg.location(989,4);
                    ID2=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_factor1576); 
                    dbg.location(990,2);

                    		if(!g_ignore_stmt)
                    		{
                    			Symbol s = currentScope.getSymbol(ID2.getText());
                    			sym = s;
                    		}
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:997:5: e= literal
                    {
                    dbg.location(997,6);
                    pushFollow(FOLLOW_literal_in_factor1587);
                    e=literal();
                    _fsp--;

                    dbg.location(997,16);
                     if(!g_ignore_stmt) sym = e;

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
        dbg.location(999, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1001:2: literal returns [Symbol sym] : e= object_values ;
    public final Symbol literal() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try { dbg.enterRule("literal");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1001, 2);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1002:3: (e= object_values )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1002:5: e= object_values
            {
            dbg.location(1002,6);
            pushFollow(FOLLOW_object_values_in_literal1614);
            e=object_values();
            _fsp--;

            dbg.location(1002,21);
             if(!g_ignore_stmt) sym = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1003, 3);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1005:1: declr_stmt : type_name var_name= object_name ( ',' next_var= object_name )* ';' ;
    public final void declr_stmt() throws RecognitionException {
        object_name_return var_name = null;

        object_name_return next_var = null;

        type_name_return type_name3 = null;


        try { dbg.enterRule("declr_stmt");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1005, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1006:2: ( type_name var_name= object_name ( ',' next_var= object_name )* ';' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1007:2: type_name var_name= object_name ( ',' next_var= object_name )* ';'
            {
            dbg.location(1007,2);
            int count_com = 0;
            dbg.location(1008,2);
            pushFollow(FOLLOW_type_name_in_declr_stmt1632);
            type_name3=type_name();
            _fsp--;

            dbg.location(1008,20);
            pushFollow(FOLLOW_object_name_in_declr_stmt1636);
            var_name=object_name();
            _fsp--;

            dbg.location(1009,2);

            		//System.out.println(" type : " + input.toString(type_name3.start,type_name3.stop) +" var : "+ input.toString(var_name.start,var_name.stop));
            		if(!g_ignore_stmt)
            		{
            			currentScope.defineSymbol(input.toString(var_name.start,var_name.stop), input.toString(type_name3.start,type_name3.stop));
            		}
            	
            dbg.location(1016,2);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1016:2: ( ',' next_var= object_name )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=2;
                try { dbg.enterDecision(33);

                int LA33_0 = input.LA(1);

                if ( (LA33_0==63) ) {
                    alt33=1;
                }


                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1016:3: ',' next_var= object_name
            	    {
            	    dbg.location(1016,3);
            	    match(input,63,FOLLOW_63_in_declr_stmt1643); 
            	    dbg.location(1016,7);
            	    count_com++;
            	    dbg.location(1016,30);
            	    pushFollow(FOLLOW_object_name_in_declr_stmt1649);
            	    next_var=object_name();
            	    _fsp--;

            	    dbg.location(1017,2);

            	    		if(!g_ignore_stmt)
            	    		{
            	    			if((count_com > 0) && (next_var != null))			
            	                  			currentScope.defineSymbol(input.toString(next_var.start,next_var.stop), input.toString(type_name3.start,type_name3.stop));
            	                  	}
            	    	

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}

            dbg.location(1025,2);
            match(input,29,FOLLOW_29_in_declr_stmt1661); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1026, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1028:1: type_name : ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'context_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("type_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1028, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1029:2: ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'context_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:
            {
            dbg.location(1029,2);
            if ( (input.LA(1)>=64 && input.LA(1)<=74) ) {
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
        dbg.location(1040, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1042:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );
    public final Symbol object_values() throws RecognitionException {
        Symbol sym = null;

        Symbol char_value4 = null;

        Symbol int_value5 = null;

        ip_addr_return ip_addr6 = null;

        Symbol policy7 = null;

        Symbol host8 = null;

        Symbol context9 = null;

        Symbol host_group10 = null;

        Symbol topology11 = null;

        Symbol serv_group12 = null;

        Symbol interf13 = null;

        Symbol route14 = null;


        try { dbg.enterRule("object_values");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1042, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1043:2: ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route )
            int alt34=12;
            try { dbg.enterDecision(34);

            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt34=1;
                }
                break;
            case NUMBER:
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==DOT) ) {
                    int LA34_12 = input.LA(3);

                    if ( (LA34_12==ID) ) {
                        alt34=2;
                    }
                    else if ( (LA34_12==NUMBER) ) {
                        alt34=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1042:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 34, 12, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( ((LA34_2>=PLUS && LA34_2<=DIV)||LA34_2==CPAREN||LA34_2==29||(LA34_2>=48 && LA34_2<=57)) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1042:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 34, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                alt34=3;
                }
                break;
            case 82:
            case 83:
                {
                alt34=5;
                }
                break;
            case 88:
                {
                alt34=6;
                }
                break;
            case 34:
                {
                alt34=7;
                }
                break;
            case 36:
                {
                int LA34_7 = input.LA(2);

                if ( (LA34_7==75) ) {
                    alt34=8;
                }
                else if ( (LA34_7==ID||LA34_7==36) ) {
                    alt34=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1042:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 34, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 81:
                {
                alt34=9;
                }
                break;
            case 95:
                {
                alt34=10;
                }
                break;
            case 89:
                {
                alt34=11;
                }
                break;
            case 92:
            case 94:
                {
                alt34=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1042:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 34, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1043:4: char_value
                    {
                    dbg.location(1043,4);
                    pushFollow(FOLLOW_char_value_in_object_values1740);
                    char_value4=char_value();
                    _fsp--;

                    dbg.location(1044,2);
                     if(!g_ignore_stmt) sym = char_value4; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1045:4: int_value
                    {
                    dbg.location(1045,4);
                    pushFollow(FOLLOW_int_value_in_object_values1748);
                    int_value5=int_value();
                    _fsp--;

                    dbg.location(1046,2);
                     if(!g_ignore_stmt) sym = int_value5; 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1047:4: STRING
                    {
                    dbg.location(1047,4);
                    match(input,STRING,FOLLOW_STRING_in_object_values1757); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1048:4: ip_addr
                    {
                    dbg.location(1048,4);
                    pushFollow(FOLLOW_ip_addr_in_object_values1762);
                    ip_addr6=ip_addr();
                    _fsp--;

                    dbg.location(1049,2);
                     if(!g_ignore_stmt) sym = ip_addr6.sym; 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1050:4: policy
                    {
                    dbg.location(1050,4);
                    pushFollow(FOLLOW_policy_in_object_values1770);
                    policy7=policy();
                    _fsp--;

                    dbg.location(1051,2);
                     if(!g_ignore_stmt) sym = policy7;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1052:4: host
                    {
                    dbg.location(1052,4);
                    pushFollow(FOLLOW_host_in_object_values1781);
                    host8=host();
                    _fsp--;

                    dbg.location(1053,2);
                     if(!g_ignore_stmt) sym = host8 ; 

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1054:4: context
                    {
                    dbg.location(1054,4);
                    pushFollow(FOLLOW_context_in_object_values1792);
                    context9=context();
                    _fsp--;

                    dbg.location(1055,2);
                     if(!g_ignore_stmt) sym =context9;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1056:4: host_group
                    {
                    dbg.location(1056,4);
                    pushFollow(FOLLOW_host_group_in_object_values1802);
                    host_group10=host_group();
                    _fsp--;

                    dbg.location(1057,2);
                     if(!g_ignore_stmt) sym = host_group10;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1058:4: topology
                    {
                    dbg.location(1058,4);
                    pushFollow(FOLLOW_topology_in_object_values1812);
                    topology11=topology();
                    _fsp--;

                    dbg.location(1059,2);
                    if(!g_ignore_stmt) sym = topology11;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1060:4: serv_group
                    {
                    dbg.location(1060,4);
                    pushFollow(FOLLOW_serv_group_in_object_values1821);
                    serv_group12=serv_group();
                    _fsp--;

                    dbg.location(1061,2);
                     if(!g_ignore_stmt) sym = serv_group12;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1062:4: interf
                    {
                    dbg.location(1062,4);
                    pushFollow(FOLLOW_interf_in_object_values1830);
                    interf13=interf();
                    _fsp--;

                    dbg.location(1063,2);
                     if(!g_ignore_stmt) sym = interf13;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1064:4: route
                    {
                    dbg.location(1064,4);
                    pushFollow(FOLLOW_route_in_object_values1839);
                    route14=route();
                    _fsp--;

                    dbg.location(1065,2);
                     if(!g_ignore_stmt) sym = route14;

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
        dbg.location(1066, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1069:1: context returns [Symbol sym] : 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}' ;
    public final Symbol context() throws RecognitionException {
        Symbol sym = null;

        Symbol p_i = null;

        object_name_return var = null;

        Symbol p_j = null;

        object_name_return var2 = null;


         
        	Vector <Policy> policies;
        	policies = new Vector <Policy>() ;	     
         
        try { dbg.enterRule("context");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1069, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1075:3: ( 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1076:2: 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}'
            {
            dbg.location(1076,2);
            match(input,34,FOLLOW_34_in_context1867); 
            dbg.location(1076,12);
            match(input,75,FOLLOW_75_in_context1869); 
            dbg.location(1076,16);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1076:16: ( (p_i= policy ) | (var= object_name ) )
            int alt35=2;
            try { dbg.enterSubRule(35);
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=82 && LA35_0<=83)) ) {
                alt35=1;
            }
            else if ( (LA35_0==ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1076:16: ( (p_i= policy ) | (var= object_name ) )", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1076:17: (p_i= policy )
                    {
                    dbg.location(1076,17);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1076:17: (p_i= policy )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1076:18: p_i= policy
                    {
                    dbg.location(1076,21);
                    pushFollow(FOLLOW_policy_in_context1875);
                    p_i=policy();
                    _fsp--;

                    dbg.location(1077,2);
                     
                    		if(!g_ignore_stmt)
                    		{
                    			policies.add((Policy)p_i.lookupValue());
                    		}
                    	

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1083:4: (var= object_name )
                    {
                    dbg.location(1083,4);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1083:4: (var= object_name )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1083:5: var= object_name
                    {
                    dbg.location(1083,8);
                    pushFollow(FOLLOW_object_name_in_context1887);
                    var=object_name();
                    _fsp--;

                    dbg.location(1084,2);

                    		if(!g_ignore_stmt)
                    		{
                    			Symbol s2 = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			String st=s2.getType();
                    			try
                    			{
                    				if((st.equals("policy_type_t")!=true))
                    				{
                    					throw(new DataFormatException("rule:context"));
                    				}
                    			}
                    			catch(DataFormatException dfe)
                    			{
                    				System.out.println(dfe);
                    				dfe.printStackTrace();
                    		 		System.exit(1);
                    			}
                    			Policy p3=(Policy)s2.lookupValue();
                    			policies.add(p3);
                    		}
                    	

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}

            dbg.location(1107,2);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1107:2: ( ',' ( (p_j= policy ) | (var2= object_name ) ) )*
            try { dbg.enterSubRule(37);

            loop37:
            do {
                int alt37=2;
                try { dbg.enterDecision(37);

                int LA37_0 = input.LA(1);

                if ( (LA37_0==63) ) {
                    alt37=1;
                }


                } finally {dbg.exitDecision(37);}

                switch (alt37) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1107:5: ',' ( (p_j= policy ) | (var2= object_name ) )
            	    {
            	    dbg.location(1107,5);
            	    match(input,63,FOLLOW_63_in_context1901); 
            	    dbg.location(1107,10);
            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1107:10: ( (p_j= policy ) | (var2= object_name ) )
            	    int alt36=2;
            	    try { dbg.enterSubRule(36);
            	    try { dbg.enterDecision(36);

            	    int LA36_0 = input.LA(1);

            	    if ( ((LA36_0>=82 && LA36_0<=83)) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==ID) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1107:10: ( (p_j= policy ) | (var2= object_name ) )", 36, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(36);}

            	    switch (alt36) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1107:11: (p_j= policy )
            	            {
            	            dbg.location(1107,11);
            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1107:11: (p_j= policy )
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1107:12: p_j= policy
            	            {
            	            dbg.location(1107,15);
            	            pushFollow(FOLLOW_policy_in_context1908);
            	            p_j=policy();
            	            _fsp--;

            	            dbg.location(1108,2);

            	            		if(!g_ignore_stmt)
            	            		{
            	            			policies.add((Policy)p_j.lookupValue());
            	            		}
            	            	

            	            }


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1114:4: (var2= object_name )
            	            {
            	            dbg.location(1114,4);
            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1114:4: (var2= object_name )
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1114:5: var2= object_name
            	            {
            	            dbg.location(1114,9);
            	            pushFollow(FOLLOW_object_name_in_context1920);
            	            var2=object_name();
            	            _fsp--;

            	            dbg.location(1115,2);

            	            		if(!g_ignore_stmt)
            	            		{
            	            			Symbol s3 = currentScope.getSymbol(input.toString(var2.start,var2.stop));
            	            			String st=s3.getType();
            	            			try
            	            			{
            	            				if((st.equals("policy_type_t")!=true))
            	            				{
            	            					throw(new DataFormatException("rule:context"));
            	            		//	  System.out.println("added"+p3.verdict);
            	            				}
            	            			}
            	            			catch(DataFormatException dfe)
            	            			{
            	            				System.out.println(dfe);
            	            				dfe.printStackTrace();
            	            				System.exit(1);
            	            			}
            	            			Policy p4=(Policy)s3.lookupValue();
            	            			policies.add(p4);
            	            		}
            	            	

            	            }


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(36);}


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);
            } finally {dbg.exitSubRule(37);}

            dbg.location(1138,8);
            match(input,76,FOLLOW_76_in_context1932); 
            dbg.location(1139,2);

            		if(!g_ignore_stmt)
            		{
            			Context context = new Context (policies);
            			Symbol s = new Symbol ("context_type_t","context_type_t",context);
            			sym = s;  		
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1148, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1152:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );
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



          	String sp = "0";
          	String dp = "0";
          	Ipaddress dip;
          	dip  = new Ipaddress("0.0.0.0") ;
          	Ipaddress dnetmask ;
          	dnetmask = new Ipaddress("0.0.0.0");
          	Ipaddress sip ;
          	sip = new Ipaddress("0.0.0.0");
          	Ipaddress snetmask;
          	snetmask = new Ipaddress("0.0.0.0");
         
        try { dbg.enterRule("policy");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1152, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1166:2: (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? )
            int alt52=2;
            try { dbg.enterDecision(52);

            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=82 && LA52_0<=83)) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==84) ) {
                    int LA52_2 = input.LA(3);

                    if ( ((LA52_2>=86 && LA52_2<=87)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_2==ICMP_MESSAGE_TYPE) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1152:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 52, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA52_1==85) ) {
                    int LA52_3 = input.LA(3);

                    if ( ((LA52_3>=86 && LA52_3<=87)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_3==ICMP_MESSAGE_TYPE) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1152:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 52, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1152:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 52, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1152:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 52, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(52);}

            switch (alt52) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1167:4: dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )?
                    {
                    dbg.location(1167,7);
                    pushFollow(FOLLOW_direction_in_policy1967);
                    dir=direction();
                    _fsp--;

                    dbg.location(1167,22);
                    pushFollow(FOLLOW_verdict_in_policy1971);
                    verd=verdict();
                    _fsp--;

                    dbg.location(1167,39);
                    pushFollow(FOLLOW_proto_in_policy1975);
                    protocol=proto();
                    _fsp--;

                    dbg.location(1168,4);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1168:4: ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )?
                    int alt41=2;
                    try { dbg.enterSubRule(41);
                    try { dbg.enterDecision(41);

                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==77) ) {
                        alt41=1;
                    }
                    } finally {dbg.exitDecision(41);}

                    switch (alt41) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1168:5: 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) )
                            {
                            dbg.location(1168,5);
                            match(input,77,FOLLOW_77_in_policy1982); 
                            dbg.location(1169,6);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1169:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )
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
                                    new NoViableAltException("1169:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )", 38, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(38);}

                            switch (alt38) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1169:7: (dst_ip= ip_addr )
                                    {
                                    dbg.location(1169,7);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1169:7: (dst_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1169:8: dst_ip= ip_addr
                                    {
                                    dbg.location(1169,15);
                                    pushFollow(FOLLOW_ip_addr_in_policy1996);
                                    dst_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(1170,6);
                                     
                                      	  	if(!g_ignore_stmt)
                                      	  	{
                                      	  		dip = new Ipaddress(input.toString(dst_ip.start,dst_ip.stop));
                                      	  	}
                                      	  

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1176:6: (dip_obj= object_name )
                                    {
                                    dbg.location(1176,6);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1176:6: (dip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1176:7: dip_obj= object_name
                                    {
                                    dbg.location(1176,15);
                                    pushFollow(FOLLOW_object_name_in_policy2022);
                                    dip_obj=object_name();
                                    _fsp--;

                                    dbg.location(1177,6);
                                     
                                      	  	if(!g_ignore_stmt)
                                      	  	{
                                    	  	  	Symbol s = currentScope.getSymbol(input.toString(dip_obj.start,dip_obj.stop));   
                                    	  	   
                                    	  	  	if ( s == null)
                                    	  	   	{
                                    				System.out.println ("object : "+input.toString(dip_obj.start,dip_obj.stop)+"  not found");
                                    			} 
                                    	  	    
                                    			try
                                    			{  /* Check fot type exceptions in ip_address */
                                    				if(s.getType().equals ("ipaddr_t") != true) 
                                    				{ 
                                    					throw (new DataFormatException("policy : tcp/udp:destip"));
                                    				}
                                    		 	}
                                    			catch (DataFormatException dfe)
                                    		  	{
                                    		 		System.out.println(dfe);
                                    		   	}
                                    	  	   	
                                    	  	   	dip = (Ipaddress) s.lookupValue(); 
                                    		}
                                    	

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(38);}

                            dbg.location(1202,4);
                            match(input,78,FOLLOW_78_in_policy2036); 
                            dbg.location(1202,14);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1202:14: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
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
                                    new NoViableAltException("1202:14: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )", 39, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(39);}

                            switch (alt39) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1202:15: (dnetmask_ip= ip_addr )
                                    {
                                    dbg.location(1202,15);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1202:15: (dnetmask_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1202:16: dnetmask_ip= ip_addr
                                    {
                                    dbg.location(1202,27);
                                    pushFollow(FOLLOW_ip_addr_in_policy2042);
                                    dnetmask_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(1203,4);

                                      		if(!g_ignore_stmt)
                                      		{
                                      			dnetmask = new Ipaddress(input.toString(dnetmask_ip.start,dnetmask_ip.stop));
                                      		}
                                      	

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1209:4: (dnetmask_ip_obj= object_name )
                                    {
                                    dbg.location(1209,4);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1209:4: (dnetmask_ip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1209:5: dnetmask_ip_obj= object_name
                                    {
                                    dbg.location(1209,21);
                                    pushFollow(FOLLOW_object_name_in_policy2060);
                                    dnetmask_ip_obj=object_name();
                                    _fsp--;

                                    dbg.location(1210,4);

                                      		if(!g_ignore_stmt)
                                      		{
                                      			Symbol s = currentScope.getSymbol(input.toString(dnetmask_ip_obj.start,dnetmask_ip_obj.stop));  
                                    	  	  	if ( s == null)
                                    	  	   	{
                                    	  	    		System.out.println ("object : "+ input.toString(dnetmask_ip_obj.start,dnetmask_ip_obj.stop)+"  not found");
                                    	  	   	 } 
                                    	  	    
                                    	  	   	try
                                    	  	   	{  /* Check fot type exceptions in ip_address */
                                    		  		if(s.getType().equals ("ipaddr_t") != true) 
                                    		  		{ 
                                    		  			throw (new DataFormatException("policy : tcp/udp:dest_netmask"));
                                    		  		}
                                    		  	}
                                    		  	catch (DataFormatException dfe)
                                    		  	{
                                    		  		System.out.println(dfe);
                                    		   	}
                                    			dnetmask = (Ipaddress) s.lookupValue();
                                    		}
                                      	

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(39);}

                            dbg.location(1233,2);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1233:2: ( (dport= port ) | ( 'all' ) )
                            int alt40=2;
                            try { dbg.enterSubRule(40);
                            try { dbg.enterDecision(40);

                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==NUMBER) ) {
                                alt40=1;
                            }
                            else if ( (LA40_0==79) ) {
                                alt40=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1233:2: ( (dport= port ) | ( 'all' ) )", 40, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(40);}

                            switch (alt40) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1233:3: (dport= port )
                                    {
                                    dbg.location(1233,3);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1233:3: (dport= port )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1233:4: dport= port
                                    {
                                    dbg.location(1233,9);
                                    pushFollow(FOLLOW_port_in_policy2075);
                                    dport=port();
                                    _fsp--;

                                    dbg.location(1234,2);

                                    		if(!g_ignore_stmt)
                                    		{
                                    			dp = new String(input.toString(dport.start,dport.stop));
                                    		}
                                    	

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1239:8: ( 'all' )
                                    {
                                    dbg.location(1239,8);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1239:8: ( 'all' )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1239:9: 'all'
                                    {
                                    dbg.location(1239,9);
                                    match(input,79,FOLLOW_79_in_policy2086); 

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(40);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(41);}

                    dbg.location(1240,4);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1240:4: ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )?
                    int alt45=2;
                    try { dbg.enterSubRule(45);
                    try { dbg.enterDecision(45);

                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==80) ) {
                        alt45=1;
                    }
                    } finally {dbg.exitDecision(45);}

                    switch (alt45) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1240:5: 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) )
                            {
                            dbg.location(1240,5);
                            match(input,80,FOLLOW_80_in_policy2098); 
                            dbg.location(1241,4);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1241:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )
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
                                    new NoViableAltException("1241:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )", 42, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(42);}

                            switch (alt42) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1241:5: (src_ip= ip_addr )
                                    {
                                    dbg.location(1241,5);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1241:5: (src_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1241:6: src_ip= ip_addr
                                    {
                                    dbg.location(1241,13);
                                    pushFollow(FOLLOW_ip_addr_in_policy2109);
                                    src_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(1242,4);

                                      		if(!g_ignore_stmt)
                                      		{
                                      			sip = new Ipaddress(input.toString(src_ip.start,src_ip.stop));
                                      		}
                                      	

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1248:4: (sip_obj= object_name )
                                    {
                                    dbg.location(1248,4);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1248:4: (sip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1248:5: sip_obj= object_name
                                    {
                                    dbg.location(1248,13);
                                    pushFollow(FOLLOW_object_name_in_policy2131);
                                    sip_obj=object_name();
                                    _fsp--;

                                    dbg.location(1249,4);
                                     
                                      		if(!g_ignore_stmt)
                                      		{
                                    		  	Symbol s = currentScope.getSymbol(input.toString(sip_obj.start,sip_obj.stop));     
                                    		  	if ( s == null)
                                    		  	{
                                    		  		System.out.println ("object : "+input.toString(sip_obj.start,sip_obj.stop)+"  not found");
                                    		  	} 
                                    		  	    
                                    		  	try
                                    		  	{  /* Check fot type exceptions in ip_address */
                                    				if(s.getType().equals ("ipaddr_t") != true) 
                                    			  	{ 
                                    			  		throw (new DataFormatException("policy : tcp/udp:srcip"));
                                    			  	}
                                    			}
                                    			catch (DataFormatException dfe)
                                    			{
                                    				System.out.println(dfe);
                                    			} 	   
                                    		  	sip = (Ipaddress) s.lookupValue(); 
                                    		  }
                                    	

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(42);}

                            dbg.location(1272,5);
                            match(input,78,FOLLOW_78_in_policy2147); 
                            dbg.location(1272,15);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1272:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
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
                                    new NoViableAltException("1272:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )", 43, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(43);}

                            switch (alt43) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1272:16: (snetmask_ip= ip_addr )
                                    {
                                    dbg.location(1272,16);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1272:16: (snetmask_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1272:17: snetmask_ip= ip_addr
                                    {
                                    dbg.location(1272,28);
                                    pushFollow(FOLLOW_ip_addr_in_policy2153);
                                    snetmask_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(1273,5);

                                      	 	if(!g_ignore_stmt)
                                      	 	{
                                      	 		snetmask = new Ipaddress(input.toString(snetmask_ip.start,snetmask_ip.stop));
                                      	 	}
                                      	 

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1279:6: (snetmask_ip_obj= object_name )
                                    {
                                    dbg.location(1279,6);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1279:6: (snetmask_ip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1279:7: snetmask_ip_obj= object_name
                                    {
                                    dbg.location(1279,23);
                                    pushFollow(FOLLOW_object_name_in_policy2174);
                                    snetmask_ip_obj=object_name();
                                    _fsp--;

                                    dbg.location(1280,6);

                                      	  	if(!g_ignore_stmt)
                                      	  	{
                                    	  		Symbol s = currentScope.getSymbol(input.toString(snetmask_ip_obj.start,snetmask_ip_obj.stop));  
                                    	  	 	if ( s == null)
                                    	  	   	{
                                    	  	    		System.out.println ("object : "+input.toString(snetmask_ip_obj.start,snetmask_ip_obj.stop)+"  not found");
                                    	  	    	} 
                                    	  	    
                                    			try
                                    			{  /* Check fot type exceptions in ip_address */
                                    				if(s.getType().equals ("ipaddr_t") != true) 
                                    				{ 
                                    					throw (new DataFormatException("policy : tcp/udp:snetmask"));
                                    				}
                                    		  	}
                                    		 	catch (DataFormatException dfe)
                                    		 	{
                                    		   		System.out.println(dfe);
                                    		   	}
                                    	  	  	snetmask = (Ipaddress) s.lookupValue();
                                    	  	  }
                                    	

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(43);}

                            dbg.location(1303,6);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1303:6: ( (sport= port ) | ( 'all' ) )
                            int alt44=2;
                            try { dbg.enterSubRule(44);
                            try { dbg.enterDecision(44);

                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==NUMBER) ) {
                                alt44=1;
                            }
                            else if ( (LA44_0==79) ) {
                                alt44=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1303:6: ( (sport= port ) | ( 'all' ) )", 44, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(44);}

                            switch (alt44) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1303:7: (sport= port )
                                    {
                                    dbg.location(1303,7);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1303:7: (sport= port )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1303:8: sport= port
                                    {
                                    dbg.location(1303,13);
                                    pushFollow(FOLLOW_port_in_policy2197);
                                    sport=port();
                                    _fsp--;

                                    dbg.location(1304,6);

                                      	  	if(!g_ignore_stmt)
                                      	  	{
                                      	  		sp = new String(input.toString(sport.start,sport.stop));
                                      	  	}
                                      	  

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1309:12: ( 'all' )
                                    {
                                    dbg.location(1309,12);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1309:12: ( 'all' )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1309:13: 'all'
                                    {
                                    dbg.location(1309,13);
                                    match(input,79,FOLLOW_79_in_policy2212); 

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(44);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(45);}

                    dbg.location(1310,2);

                    		if(!g_ignore_stmt)
                    		{
                    			System.out.println (input.toString(dir.start,dir.stop)+input.toString(verd.start,verd.stop)+input.toString(protocol.start,protocol.stop)+sip.getString()+snetmask.getString()+
                    	                                      sp+dip.getString()+ dnetmask.getString()+dp);
                    			Policy pl = new Policy(input.toString(dir.start,dir.stop),input.toString(verd.start,verd.stop), input.toString(protocol.start,protocol.stop), sip.getString(),snetmask.getString(),
                    				              sp,dip.getString(),dnetmask.getString(),dp);		
                    		
                    		 	Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
                    			sym = s;
                    		}
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1340:2: dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )?
                    {
                    dbg.location(1340,5);
                    pushFollow(FOLLOW_direction_in_policy2234);
                    dir=direction();
                    _fsp--;

                    dbg.location(1340,20);
                    pushFollow(FOLLOW_verdict_in_policy2238);
                    verd=verdict();
                    _fsp--;

                    dbg.location(1340,38);
                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy2242);
                    icmp_mesg=icmp_cntrl_message();
                    _fsp--;

                    dbg.location(1341,2);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1341:2: ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )?
                    int alt48=2;
                    try { dbg.enterSubRule(48);
                    try { dbg.enterDecision(48);

                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==77) ) {
                        alt48=1;
                    }
                    } finally {dbg.exitDecision(48);}

                    switch (alt48) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1341:3: 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
                            {
                            dbg.location(1341,3);
                            match(input,77,FOLLOW_77_in_policy2248); 
                            dbg.location(1342,6);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1342:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )
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
                                    new NoViableAltException("1342:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )", 46, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(46);}

                            switch (alt46) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1342:7: (dst_ip= ip_addr )
                                    {
                                    dbg.location(1342,7);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1342:7: (dst_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1342:8: dst_ip= ip_addr
                                    {
                                    dbg.location(1342,15);
                                    pushFollow(FOLLOW_ip_addr_in_policy2262);
                                    dst_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(1343,6);
                                     
                                      	  	if(!g_ignore_stmt)
                                      	  	{
                                      	  		dip = new Ipaddress(input.toString(dst_ip.start,dst_ip.stop));
                                      	  	}
                                      	  

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1349:6: (dip_obj= object_name )
                                    {
                                    dbg.location(1349,6);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1349:6: (dip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1349:7: dip_obj= object_name
                                    {
                                    dbg.location(1349,15);
                                    pushFollow(FOLLOW_object_name_in_policy2288);
                                    dip_obj=object_name();
                                    _fsp--;

                                    dbg.location(1350,6);
                                     
                                      	  	if(!g_ignore_stmt)
                                      	  	{
                                      	  		Symbol s = currentScope.getSymbol(input.toString(dip_obj.start,dip_obj.stop)); 
                                    		  	if ( s == null)
                                    		  	{
                                    		  		System.out.println ("object : input.toString(dip_obj.start,dip_obj.stop)  not found");
                                    		  	} 
                                    		  	    
                                    		  	try
                                    		  	{  /* Check fot type exceptions in ip_address */
                                    				if(s.getType().equals ("ipaddr_t") != true) 
                                    			  	{ 
                                    			  		throw (new DataFormatException("policy : icmp:destip"));
                                    			  	}
                                    			}
                                    			catch (DataFormatException dfe)
                                    			{
                                    				System.out.println(dfe);
                                    			}   
                                    			dip = (Ipaddress) s.lookupValue(); 
                                    		}
                                    	

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(46);}

                            dbg.location(1373,5);
                            match(input,78,FOLLOW_78_in_policy2308); 
                            dbg.location(1373,15);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1373:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
                            int alt47=2;
                            try { dbg.enterSubRule(47);
                            try { dbg.enterDecision(47);

                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==NUMBER) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==ID) ) {
                                alt47=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1373:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )", 47, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(47);}

                            switch (alt47) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1373:16: (dnetmask_ip= ip_addr )
                                    {
                                    dbg.location(1373,16);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1373:16: (dnetmask_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1373:17: dnetmask_ip= ip_addr
                                    {
                                    dbg.location(1373,28);
                                    pushFollow(FOLLOW_ip_addr_in_policy2314);
                                    dnetmask_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(1374,5);

                                      	 	if(!g_ignore_stmt)
                                      	 	{
                                    			dnetmask = new Ipaddress(input.toString(dnetmask_ip.start,dnetmask_ip.stop));
                                    		}
                                    	

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1380:4: (dnetmask_ip_obj= object_name )
                                    {
                                    dbg.location(1380,4);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1380:4: (dnetmask_ip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1380:5: dnetmask_ip_obj= object_name
                                    {
                                    dbg.location(1380,21);
                                    pushFollow(FOLLOW_object_name_in_policy2333);
                                    dnetmask_ip_obj=object_name();
                                    _fsp--;

                                    dbg.location(1381,2);

                                    		if(!g_ignore_stmt)
                                    		{
                                    			Symbol s = currentScope.getSymbol(input.toString(dnetmask_ip_obj.start,dnetmask_ip_obj.stop)); 
                                    		  	if ( s == null)
                                    		  	{
                                    		  		System.out.println ("object : $dnetmask_obj.text  not found");
                                    		  	} 
                                    		  	    
                                    		  	try
                                    		  	{  /* Check fot type exceptions in ip_address */
                                    				if(s.getType().equals ("ipaddr_t") != true) 
                                    			  	{ 
                                    			  		throw (new DataFormatException("policy : icmp:dnetmask"));
                                    			  	}
                                    			}
                                    			catch (DataFormatException dfe)
                                    			{
                                    				System.out.println(dfe);
                                    			}  
                                    		  	dnetmask = (Ipaddress) s.lookupValue();
                                    		}
                                    	

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(47);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(48);}

                    dbg.location(1404,4);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1404:4: ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )?
                    int alt51=2;
                    try { dbg.enterSubRule(51);
                    try { dbg.enterDecision(51);

                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==80) ) {
                        alt51=1;
                    }
                    } finally {dbg.exitDecision(51);}

                    switch (alt51) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1404:5: 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
                            {
                            dbg.location(1404,5);
                            match(input,80,FOLLOW_80_in_policy2347); 
                            dbg.location(1405,4);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1405:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )
                            int alt49=2;
                            try { dbg.enterSubRule(49);
                            try { dbg.enterDecision(49);

                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==NUMBER) ) {
                                alt49=1;
                            }
                            else if ( (LA49_0==ID) ) {
                                alt49=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1405:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )", 49, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(49);}

                            switch (alt49) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1405:5: (src_ip= ip_addr )
                                    {
                                    dbg.location(1405,5);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1405:5: (src_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1405:6: src_ip= ip_addr
                                    {
                                    dbg.location(1405,13);
                                    pushFollow(FOLLOW_ip_addr_in_policy2358);
                                    src_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(1406,4);
                                     
                                      		if(!g_ignore_stmt)
                                      		{
                                      			sip = new Ipaddress(input.toString(src_ip.start,src_ip.stop));
                                      		}
                                      	

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1412:4: (sip_obj= object_name )
                                    {
                                    dbg.location(1412,4);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1412:4: (sip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1412:5: sip_obj= object_name
                                    {
                                    dbg.location(1412,13);
                                    pushFollow(FOLLOW_object_name_in_policy2379);
                                    sip_obj=object_name();
                                    _fsp--;

                                    dbg.location(1413,4);
                                     
                                      		if(!g_ignore_stmt)
                                      		{
                                      			Symbol s = currentScope.getSymbol(input.toString(sip_obj.start,sip_obj.stop));  
                                    	  	  	if ( s == null)
                                    	  	   	{
                                    	  	    		System.out.println ("object : $src_obj.text  not found");
                                    	  	    	} 
                                    	  	    
                                    	  	   	try
                                    	  	   	{  /* Check fot type exceptions in ip_address */
                                    		  		if(s.getType().equals ("ipaddr_t") != true) 
                                    		  		{ 
                                    		  			throw (new DataFormatException("policy : icmp:srcip"));
                                    		  		}
                                    		  	}
                                    		  	catch (DataFormatException dfe)
                                    		  	{
                                    		  		System.out.println(dfe);
                                    		   	}
                                    			sip = (Ipaddress) s.lookupValue(); 
                                    		}
                                    	

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(49);}

                            dbg.location(1436,2);
                            match(input,78,FOLLOW_78_in_policy2389); 
                            dbg.location(1436,12);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1436:12: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
                            int alt50=2;
                            try { dbg.enterSubRule(50);
                            try { dbg.enterDecision(50);

                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==NUMBER) ) {
                                alt50=1;
                            }
                            else if ( (LA50_0==ID) ) {
                                alt50=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1436:12: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )", 50, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(50);}

                            switch (alt50) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1436:13: (snetmask_ip= ip_addr )
                                    {
                                    dbg.location(1436,13);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1436:13: (snetmask_ip= ip_addr )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1436:14: snetmask_ip= ip_addr
                                    {
                                    dbg.location(1436,25);
                                    pushFollow(FOLLOW_ip_addr_in_policy2395);
                                    snetmask_ip=ip_addr();
                                    _fsp--;

                                    dbg.location(1437,2);

                                    		if(!g_ignore_stmt)
                                    		{
                                    			dnetmask = new Ipaddress(input.toString(snetmask_ip.start,snetmask_ip.stop));
                                    		}
                                    	

                                    }


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1443:2: (snetmask_ip_obj= object_name )
                                    {
                                    dbg.location(1443,2);
                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1443:2: (snetmask_ip_obj= object_name )
                                    dbg.enterAlt(1);

                                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1443:3: snetmask_ip_obj= object_name
                                    {
                                    dbg.location(1443,19);
                                    pushFollow(FOLLOW_object_name_in_policy2409);
                                    snetmask_ip_obj=object_name();
                                    _fsp--;

                                    dbg.location(1444,4);

                                      		if(!g_ignore_stmt)
                                      		{
                                    	  		Symbol s = currentScope.getSymbol(input.toString(snetmask_ip_obj.start,snetmask_ip_obj.stop));  
                                    	  	  	if ( s == null)
                                    	  	   	{
                                    	  	    		System.out.println ("object : "+ input.toString(snetmask_ip_obj.start,snetmask_ip_obj.stop)+"  not found");
                                    	  	    	} 
                                    	  	    
                                    	  	   	try
                                    	  	   	{  /* Check fot type exceptions in ip_address */
                                    		  		if(s.getType().equals ("ipaddr_t") != true) 
                                    		  		{ 
                                    		  			throw (new DataFormatException("policy : icmp:snetmask"));
                                    		  		}
                                    		  	}
                                    		  	catch (DataFormatException dfe)
                                    		  	{
                                    		   		System.out.println(dfe);
                                    		    	    	dfe.printStackTrace();
                                    		 	    	System.exit(1);
                                    		   	}
                                    			snetmask = (Ipaddress) s.lookupValue();
                                    		}
                                    	

                                    }


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(50);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(51);}

                    dbg.location(1469,2);

                    		if(!g_ignore_stmt)
                    		{
                    			Policy pl = new Policy(input.toString(dir.start,dir.stop),input.toString(verd.start,verd.stop), input.toString(icmp_mesg.start,icmp_mesg.stop), dip.getString(),dnetmask.getString(),
                    			               sip.getString(),snetmask.getString());		
                    	
                    			Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
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
        dbg.location(1479, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1481:1: topology returns [Symbol sym] : ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) );
    public final Symbol topology() throws RecognitionException {
        Symbol sym = null;

        Symbol host_group_sym = null;

        object_name_return host_group_obj = null;

        Symbol cxt_sym = null;

        object_name_return cxt_obj = null;

        Symbol serv_group_sym = null;

        object_name_return serv_group_obj = null;



        	Hostgroup hg;
        	Servicegroup sg;
        	Context cxt;
        	hg = null;
        	sg = null;
        	cxt =null;

        try { dbg.enterRule("topology");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1481, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1491:2: ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) )
            int alt57=2;
            try { dbg.enterDecision(57);

            int LA57_0 = input.LA(1);

            if ( (LA57_0==36) ) {
                alt57=1;
            }
            else if ( (LA57_0==81) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1481:1: topology returns [Symbol sym] : ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) );", 57, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(57);}

            switch (alt57) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1492:2: ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    {
                    dbg.location(1492,2);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1492:2: ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1493:2: ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    {
                    dbg.location(1493,2);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1493:2: ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1493:3: 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )
                    {
                    dbg.location(1493,3);
                    match(input,36,FOLLOW_36_in_topology2452); 
                    dbg.location(1493,16);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1493:16: ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )
                    int alt53=2;
                    try { dbg.enterSubRule(53);
                    try { dbg.enterDecision(53);

                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==36) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==ID) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1493:16: ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )", 53, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(53);}

                    switch (alt53) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1493:17: (host_group_sym= host_group )
                            {
                            dbg.location(1493,17);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1493:17: (host_group_sym= host_group )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1493:18: host_group_sym= host_group
                            {
                            dbg.location(1493,32);
                            pushFollow(FOLLOW_host_group_in_topology2458);
                            host_group_sym=host_group();
                            _fsp--;

                            dbg.location(1494,2);

                            		if(!g_ignore_stmt)
                            		{
                            			hg = (Hostgroup)host_group_sym.lookupValue();
                            		}	
                            	

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1500:3: (host_group_obj= object_name )
                            {
                            dbg.location(1500,3);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1500:3: (host_group_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1500:5: host_group_obj= object_name
                            {
                            dbg.location(1500,19);
                            pushFollow(FOLLOW_object_name_in_topology2472);
                            host_group_obj=object_name();
                            _fsp--;

                            dbg.location(1501,2);

                            		if(!g_ignore_stmt)
                            		{
                            			Symbol s  = currentScope.getSymbol (input.toString(host_group_obj.start,host_group_obj.stop)); 
                            		
                            			try
                            			{
                            		  		if(s.getType().equals ("host_group_type_t") != true) 
                            		  		{ 
                            		  			throw (new DataFormatException("rule : host"));
                            		  		}
                            		  	}
                            		  	catch (DataFormatException dfe)
                            		  	{
                            		   		System.out.println(dfe);
                            		    		dfe.printStackTrace();
                            	 	   		System.exit(1);
                            		    	}
                            			hg = (Hostgroup) s.lookupValue(); 
                            		}
                            	

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(53);}


                    }

                    dbg.location(1522,2);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1522:2: ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1522:3: 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    {
                    dbg.location(1522,3);
                    match(input,34,FOLLOW_34_in_topology2484); 
                    dbg.location(1522,13);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1522:13: ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    int alt54=2;
                    try { dbg.enterSubRule(54);
                    try { dbg.enterDecision(54);

                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==34) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==ID) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1522:13: ( (cxt_sym= context ) | (cxt_obj= object_name ) )", 54, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(54);}

                    switch (alt54) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1522:14: (cxt_sym= context )
                            {
                            dbg.location(1522,14);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1522:14: (cxt_sym= context )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1522:15: cxt_sym= context
                            {
                            dbg.location(1522,22);
                            pushFollow(FOLLOW_context_in_topology2490);
                            cxt_sym=context();
                            _fsp--;

                            dbg.location(1523,2);

                            		if(!g_ignore_stmt)
                            		{
                            			cxt = (Context) cxt_sym.lookupValue(); 
                            		}	
                            	

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1529:3: (cxt_obj= object_name )
                            {
                            dbg.location(1529,3);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1529:3: (cxt_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1529:5: cxt_obj= object_name
                            {
                            dbg.location(1529,13);
                            pushFollow(FOLLOW_object_name_in_topology2507);
                            cxt_obj=object_name();
                            _fsp--;

                            dbg.location(1530,3);

                            	 	if(!g_ignore_stmt)
                            	 	{
                            			Symbol s = (Symbol)currentScope.getSymbol (input.toString(cxt_obj.start,cxt_obj.stop));
                            			try
                            			{
                            				if(s.getType().equals ("context_type_t") != true) 
                            				{ 
                            					throw (new DataFormatException("rule : topology: host:context"));
                            				}
                            		  	}
                            		  	catch (DataFormatException dfe)
                            		  	{
                            		   		System.out.println(dfe);
                            		    		dfe.printStackTrace();
                            	 	    		System.exit(1);
                            	    		} 
                            			cxt = (Context) s.lookupValue(); 
                            		}
                            	

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(54);}


                    }

                    dbg.location(1550,2);

                    		if(!g_ignore_stmt)
                    		{
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


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:2: ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    {
                    dbg.location(1578,2);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:2: ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:3: ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    {
                    dbg.location(1578,3);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:3: ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:4: 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )
                    {
                    dbg.location(1578,4);
                    match(input,81,FOLLOW_81_in_topology2532); 
                    dbg.location(1578,17);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:17: ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )
                    int alt55=2;
                    try { dbg.enterSubRule(55);
                    try { dbg.enterDecision(55);

                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==95) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==ID) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1578:17: ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )", 55, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(55);}

                    switch (alt55) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:18: (serv_group_sym= serv_group )
                            {
                            dbg.location(1578,18);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:18: (serv_group_sym= serv_group )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1578:19: serv_group_sym= serv_group
                            {
                            dbg.location(1578,33);
                            pushFollow(FOLLOW_serv_group_in_topology2538);
                            serv_group_sym=serv_group();
                            _fsp--;

                            dbg.location(1579,2);

                            		if(!g_ignore_stmt)
                            		{
                            			sg = (Servicegroup)serv_group_sym.lookupValue();
                            		}
                            	

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1585:3: (serv_group_obj= object_name )
                            {
                            dbg.location(1585,3);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1585:3: (serv_group_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1585:5: serv_group_obj= object_name
                            {
                            dbg.location(1585,19);
                            pushFollow(FOLLOW_object_name_in_topology2552);
                            serv_group_obj=object_name();
                            _fsp--;

                            dbg.location(1586,2);

                            		if(!g_ignore_stmt)
                            		{
                            			Symbol s  = currentScope.getSymbol (input.toString(serv_group_obj.start,serv_group_obj.stop)); 
                            			try
                            			{
                            				if(s.getType().equals ("serv_group_type_t") != true) 
                            			  	{ 
                            			  		throw (new DataFormatException("rule : topology : servgroup:context"));
                            			  	}
                            			}
                            			catch (DataFormatException dfe)
                            			{
                            				System.out.println(dfe);
                            			     	dfe.printStackTrace();
                            		 	    	System.exit(1); 
                            			}
                            			sg = (Servicegroup) s.lookupValue(); 
                            		}
                            	

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(55);}


                    }

                    dbg.location(1606,2);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1606:2: ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1606:3: 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    {
                    dbg.location(1606,3);
                    match(input,34,FOLLOW_34_in_topology2564); 
                    dbg.location(1606,13);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1606:13: ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    int alt56=2;
                    try { dbg.enterSubRule(56);
                    try { dbg.enterDecision(56);

                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==34) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==ID) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1606:13: ( (cxt_sym= context ) | (cxt_obj= object_name ) )", 56, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(56);}

                    switch (alt56) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1606:14: (cxt_sym= context )
                            {
                            dbg.location(1606,14);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1606:14: (cxt_sym= context )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1606:15: cxt_sym= context
                            {
                            dbg.location(1606,22);
                            pushFollow(FOLLOW_context_in_topology2570);
                            cxt_sym=context();
                            _fsp--;

                            dbg.location(1607,2);

                            		if(!g_ignore_stmt)
                            		{
                            			cxt = (Context) cxt_sym.lookupValue(); 
                            		}
                            	

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1613:3: (cxt_obj= object_name )
                            {
                            dbg.location(1613,3);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1613:3: (cxt_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1613:5: cxt_obj= object_name
                            {
                            dbg.location(1613,13);
                            pushFollow(FOLLOW_object_name_in_topology2587);
                            cxt_obj=object_name();
                            _fsp--;

                            dbg.location(1614,3);

                            	 	if(!g_ignore_stmt)
                            	 	{
                            			 Symbol s = (Symbol)currentScope.getSymbol (input.toString(cxt_obj.start,cxt_obj.stop));
                            			 
                            			 try
                            			 {
                            			 	if(s.getType().equals ("context_type_t") != true) 
                            			  	{ 
                            			  		throw (new DataFormatException("rule : topology:servgroup:context"));
                            			  	}
                            			 }
                            			 catch (DataFormatException dfe)
                            			 {
                            			 	System.out.println(dfe);
                            			   	dfe.printStackTrace();
                            		 	    	System.exit(1);
                            			 }
                            		 	cxt = (Context) s.lookupValue(); 
                            		 }
                            	

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(56);}


                    }


                    }

                    dbg.location(1636,3);

                    	 	if(!g_ignore_stmt)
                    	 	{
                    		 	Topology topology = new Topology(sg,cxt);
                    			 Symbol s = new Symbol("topology_serv_group_context","topology_type_t",topology);
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
        dbg.location(1644, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1647:1: int_value returns [Symbol sym] : e= NUMBER ;
    public final Symbol int_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try { dbg.enterRule("int_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1647, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1648:2: (e= NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1648:4: e= NUMBER
            {
            dbg.location(1648,5);
            e=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_int_value2623); 
            dbg.location(1649,3);

            			if(!g_ignore_stmt)
            			{
            				Integer v = Integer.parseInt(e.getText());
            				IntType temp = new IntType(v);
            				Symbol s = new Symbol("literal", "int_type_t", temp);
            				sym = s;
            				return sym;
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1659, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1661:1: char_value returns [Symbol sym] : e= CHAR ;
    public final Symbol char_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try { dbg.enterRule("char_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1661, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1662:2: (e= CHAR )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1662:4: e= CHAR
            {
            dbg.location(1662,5);
            e=(Token)input.LT(1);
            match(input,CHAR,FOLLOW_CHAR_in_char_value2646); 
            dbg.location(1663,3);

            			if(!g_ignore_stmt)
            			{
            				String str = e.getText();
            				if(str.length() != 3)
            					System.out.println("Error in character input");
            				else 
            				{
            					CharType temp = new CharType(str.charAt(1));
            					Symbol s = new Symbol("literal", "char_type_t", temp);
            					sym = s;
            					System.out.println(s);
            					return sym;
            				}	
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1679, 2);

        }
        finally {
            dbg.exitRule("char_value");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end char_value

    public static class direction_return extends ParserRuleReturnScope {
    };

    // $ANTLR start direction
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1682:1: direction : ( 'inbound' | 'outbound' );
    public final direction_return direction() throws RecognitionException {
        direction_return retval = new direction_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("direction");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1682, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1683:2: ( 'inbound' | 'outbound' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:
            {
            dbg.location(1683,2);
            if ( (input.LA(1)>=82 && input.LA(1)<=83) ) {
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
        dbg.location(1685, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1687:1: verdict returns [String verd] : ( 'allow' | 'deny' );
    public final verdict_return verdict() throws RecognitionException {
        verdict_return retval = new verdict_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("verdict");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1687, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1688:2: ( 'allow' | 'deny' )
            int alt58=2;
            try { dbg.enterDecision(58);

            int LA58_0 = input.LA(1);

            if ( (LA58_0==84) ) {
                alt58=1;
            }
            else if ( (LA58_0==85) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1687:1: verdict returns [String verd] : ( 'allow' | 'deny' );", 58, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(58);}

            switch (alt58) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1688:5: 'allow'
                    {
                    dbg.location(1688,5);
                    match(input,84,FOLLOW_84_in_verdict2687); 
                    dbg.location(1688,14);
                     if(!g_ignore_stmt) retval.verd = new String("allow"); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1689:5: 'deny'
                    {
                    dbg.location(1689,5);
                    match(input,85,FOLLOW_85_in_verdict2696); 
                    dbg.location(1689,14);
                     if(!g_ignore_stmt) retval.verd = new String ("deny"); 

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
        dbg.location(1690, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1692:1: proto : ( 'udp' | 'tcp' );
    public final proto_return proto() throws RecognitionException {
        proto_return retval = new proto_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("proto");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1692, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1692:9: ( 'udp' | 'tcp' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:
            {
            dbg.location(1692,9);
            if ( (input.LA(1)>=86 && input.LA(1)<=87) ) {
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
        dbg.location(1693, 10);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1695:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final icmp_cntrl_message_return icmp_cntrl_message() throws RecognitionException {
        icmp_cntrl_message_return retval = new icmp_cntrl_message_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("icmp_cntrl_message");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1695, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1696:2: ( ICMP_MESSAGE_TYPE )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1696:4: ICMP_MESSAGE_TYPE
            {
            dbg.location(1696,4);
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message2730); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1697, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1699:1: port : NUMBER ;
    public final port_return port() throws RecognitionException {
        port_return retval = new port_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1699, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1699:6: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1699:8: NUMBER
            {
            dbg.location(1699,8);
            match(input,NUMBER,FOLLOW_NUMBER_in_port2740); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1699, 14);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1702:1: object_name returns [String obj_name] : ID ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        Token ID15=null;

        try { dbg.enterRule("object_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1702, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1703:2: ( ID )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1703:5: ID
            {
            dbg.location(1703,5);
            ID15=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_object_name2755); 
            dbg.location(1704,2);
             
            		if(!g_ignore_stmt)
            		{
            			retval.obj_name = new String (ID15.getText());
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
        dbg.location(1710, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:1: ip_addr returns [Symbol sym] : (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) ;
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
        dbg.location(1713, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:32: ( (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:35: (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER )
            {
            dbg.location(1713,35);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:35: (a= NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:36: a= NUMBER
            {
            dbg.location(1713,37);
            a=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2780); 

            }

            dbg.location(1713,45);
            match(input,DOT,FOLLOW_DOT_in_ip_addr2782); 
            dbg.location(1713,48);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:48: (b= NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:49: b= NUMBER
            {
            dbg.location(1713,50);
            b=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2786); 

            }

            dbg.location(1713,58);
            match(input,DOT,FOLLOW_DOT_in_ip_addr2788); 
            dbg.location(1713,61);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:61: (c= NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:62: c= NUMBER
            {
            dbg.location(1713,63);
            c=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2792); 

            }

            dbg.location(1713,71);
            match(input,DOT,FOLLOW_DOT_in_ip_addr2794); 
            dbg.location(1713,74);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:74: (d= NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1713:75: d= NUMBER
            {
            dbg.location(1713,76);
            d=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2798); 

            }

            dbg.location(1714,2);

            		if(!g_ignore_stmt)
            		{	
            			Ipaddress ip = new Ipaddress(a.getText()+"."+b.getText()+"."+c.getText()+"."+d.getText());
            		//	System.out.println (" ip address being sent : "+ip.getString());
            			Symbol s = new Symbol("ip_addr_string", "ipaddr_t", ip);
            			retval.sym = s;
            	//		return retval.sym;
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
        dbg.location(1725, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1727:1: nmask : 'netmask' ip_addr ;
    public final void nmask() throws RecognitionException {
        try { dbg.enterRule("nmask");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1727, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1727:7: ( 'netmask' ip_addr )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1727:9: 'netmask' ip_addr
            {
            dbg.location(1727,9);
            match(input,78,FOLLOW_78_in_nmask2815); 
            dbg.location(1727,19);
            pushFollow(FOLLOW_ip_addr_in_nmask2817);
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
        dbg.location(1727, 26);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1729:1: host returns [Symbol sym] : 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) ;
    public final Symbol host() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return ip_string = null;

        object_name_return ip_obj = null;

        ip_addr_return netmask_string = null;

        object_name_return netmask_ip_obj = null;


        try { dbg.enterRule("host");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1729, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1729:26: ( 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1730:2: 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            {
            dbg.location(1730,2);

            		boolean ip_object_used =false, netmask_object_used = false;
            	
            dbg.location(1733,2);
            match(input,88,FOLLOW_88_in_host2833); 
            dbg.location(1733,12);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1733:12: (ip_string= ip_addr | (ip_obj= object_name ) )
            int alt59=2;
            try { dbg.enterSubRule(59);
            try { dbg.enterDecision(59);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==NUMBER) ) {
                alt59=1;
            }
            else if ( (LA59_0==ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1733:12: (ip_string= ip_addr | (ip_obj= object_name ) )", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1733:13: ip_string= ip_addr
                    {
                    dbg.location(1733,22);
                    pushFollow(FOLLOW_ip_addr_in_host2838);
                    ip_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1733:31: (ip_obj= object_name )
                    {
                    dbg.location(1733,31);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1733:31: (ip_obj= object_name )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1733:32: ip_obj= object_name
                    {
                    dbg.location(1733,38);
                    pushFollow(FOLLOW_object_name_in_host2843);
                    ip_obj=object_name();
                    _fsp--;

                    dbg.location(1734,2);

                    		ip_object_used=true; 
                    	

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(59);}

            dbg.location(1737,5);
            match(input,78,FOLLOW_78_in_host2854); 
            dbg.location(1737,15);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1737:15: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            int alt60=2;
            try { dbg.enterSubRule(60);
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( (LA60_0==NUMBER) ) {
                alt60=1;
            }
            else if ( (LA60_0==ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1737:15: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )", 60, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1737:16: netmask_string= ip_addr
                    {
                    dbg.location(1737,30);
                    pushFollow(FOLLOW_ip_addr_in_host2859);
                    netmask_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1738:3: (netmask_ip_obj= object_name )
                    {
                    dbg.location(1738,3);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1738:3: (netmask_ip_obj= object_name )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1738:4: netmask_ip_obj= object_name
                    {
                    dbg.location(1738,19);
                    pushFollow(FOLLOW_object_name_in_host2871);
                    netmask_ip_obj=object_name();
                    _fsp--;

                    dbg.location(1738,33);
                    netmask_object_used = true;

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(60);}

            dbg.location(1739,2);

            		if(!g_ignore_stmt)
            		{
            			Host h;
            			if(ip_object_used == true && netmask_object_used ==false)
            			{
            				Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
            		 
            				/* Check for type error  in ipaddres*/
            		 		try
            		 		{
            		  			if(s.getType().equals ("ipaddr_t") != true) 
            		  			{ 
            		  				throw (new DataFormatException("rule : host"));
            		  			}
            		  		}
            		  		catch (DataFormatException dfe)
            		  		{
            		   			System.out.println(dfe);
            		    			dfe.printStackTrace();
            	 	    			System.exit(1);
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
            	      	   		try
            	      	   		{
            		  			if(s.getType().equals ("ipaddr_t") != true) 
            		  			{ 
            		  				throw (new DataFormatException("rule : host"));
            		  			}
            		  		}
            		  		catch (DataFormatException dfe)
            		 		{
            		   			System.out.println(dfe);
            		   			dfe.printStackTrace();
            	 	    			System.exit(1);
            		   		}
            	      	  
            		  		Ipaddress ip = (Ipaddress) s.lookupValue();
            		  		h = new Host	( input.toString(ip_string.start,ip_string.stop),ip.getString());
            		  		Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            		  		sym = s_ret;
            			}
            			else if(ip_object_used ==true && netmask_object_used ==true)
            			{
            		
            		  		Symbol s_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
            		
            		 		try
            		 		{  
            		 			/* Check fot type exceptions in ip_address */
            		  			if(s_ip.getType().equals ("ipaddr_t") != true) 
            		  			{ 
            		  				throw (new DataFormatException("rule : host"));
            		  			}
            		  		}
            		  		catch (DataFormatException dfe)
            		  		{
            		   			System.out.println(dfe);
            		    			dfe.printStackTrace();
            	 	    			System.exit(1);
            		   		}
            		  		Ipaddress ip = (Ipaddress) s_ip.lookupValue();
            		 
            	  	  		Symbol s_nmask = currentScope.getSymbol(input.toString(netmask_ip_obj.start,netmask_ip_obj.stop));
            		
            		 		try
            		 		{  	/* Check for type exception in netmask  */
            		  			if(s_nmask.getType().equals ("ipaddr_t") != true) 
            		  			{ 
            		  				throw (new DataFormatException("rule : host"));
            		  			}
            		  		}
            		  		catch (DataFormatException dfe)
            		  		{
            		   			System.out.println(dfe);
            		   			dfe.printStackTrace();
            	 	    			System.exit(1); 
            		   		}
            			  	Ipaddress nmask = (Ipaddress) s_nmask.lookupValue();
            			 	h = new Host	( ip.getString(),nmask.getString());
            			 	Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            			 	sym = s_ret;
            			}
            			else
            			{
            				h = new Host (input.toString(ip_string.start,ip_string.stop),input.toString(netmask_string.start,netmask_string.stop)); //usure about the text error
            				Symbol s_ret = new Symbol("host_descr_string", "host_type_t", h);
            				
            				/* Check for type exceptions */
            				  
            				sym = s_ret;
            			}
            		}
            	

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
            dbg.exitRule("host");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return sym;
    }
    // $ANTLR end host


    // $ANTLR start dns_set
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1845:1: dns_set : ip_addr ( ',' ip_addr )* ;
    public final void dns_set() throws RecognitionException {
        try { dbg.enterRule("dns_set");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1845, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1845:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1845:11: ip_addr ( ',' ip_addr )*
            {
            dbg.location(1845,11);
            pushFollow(FOLLOW_ip_addr_in_dns_set2888);
            ip_addr();
            _fsp--;

            dbg.location(1845,19);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1845:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(61);

            loop61:
            do {
                int alt61=2;
                try { dbg.enterDecision(61);

                int LA61_0 = input.LA(1);

                if ( (LA61_0==63) ) {
                    alt61=1;
                }


                } finally {dbg.exitDecision(61);}

                switch (alt61) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1845:20: ',' ip_addr
            	    {
            	    dbg.location(1845,20);
            	    match(input,63,FOLLOW_63_in_dns_set2891); 
            	    dbg.location(1845,25);
            	    pushFollow(FOLLOW_ip_addr_in_dns_set2894);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);
            } finally {dbg.exitSubRule(61);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1845, 34);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1847:1: gateway : ip_addr ( ',' ip_addr )* ;
    public final void gateway() throws RecognitionException {
        try { dbg.enterRule("gateway");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1847, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1847:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1847:11: ip_addr ( ',' ip_addr )*
            {
            dbg.location(1847,11);
            pushFollow(FOLLOW_ip_addr_in_gateway2904);
            ip_addr();
            _fsp--;

            dbg.location(1847,19);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1847:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(62);

            loop62:
            do {
                int alt62=2;
                try { dbg.enterDecision(62);

                int LA62_0 = input.LA(1);

                if ( (LA62_0==63) ) {
                    alt62=1;
                }


                } finally {dbg.exitDecision(62);}

                switch (alt62) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1847:20: ',' ip_addr
            	    {
            	    dbg.location(1847,20);
            	    match(input,63,FOLLOW_63_in_gateway2907); 
            	    dbg.location(1847,24);
            	    pushFollow(FOLLOW_ip_addr_in_gateway2909);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);
            } finally {dbg.exitSubRule(62);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1847, 33);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1850:1: host_group returns [Symbol sym] : 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}' ;
    public final Symbol host_group() throws RecognitionException {
        Symbol sym = null;

        Symbol i = null;

        object_name_return host_obj_i = null;

        Symbol j = null;

        object_name_return host_obj_j = null;



        	Vector <Host> hosts;
        	hosts = new Vector <Host> ();

        try { dbg.enterRule("host_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1850, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1856:2: ( 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1857:2: 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}'
            {
            dbg.location(1857,2);
            match(input,36,FOLLOW_36_in_host_group2932); 
            dbg.location(1857,16);
            match(input,75,FOLLOW_75_in_host_group2935); 
            dbg.location(1857,19);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1857:19: (i= host | (host_obj_i= object_name ) )
            int alt63=2;
            try { dbg.enterSubRule(63);
            try { dbg.enterDecision(63);

            int LA63_0 = input.LA(1);

            if ( (LA63_0==88) ) {
                alt63=1;
            }
            else if ( (LA63_0==ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1857:19: (i= host | (host_obj_i= object_name ) )", 63, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(63);}

            switch (alt63) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1857:21: i= host
                    {
                    dbg.location(1857,22);
                    pushFollow(FOLLOW_host_in_host_group2940);
                    i=host();
                    _fsp--;

                    dbg.location(1858,2);

                    		if(!g_ignore_stmt)
                    		{
                    			hosts.add((Host)i.lookupValue()); 
                    		}
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1863:5: (host_obj_i= object_name )
                    {
                    dbg.location(1863,5);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1863:5: (host_obj_i= object_name )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1863:6: host_obj_i= object_name
                    {
                    dbg.location(1863,16);
                    pushFollow(FOLLOW_object_name_in_host_group2951);
                    host_obj_i=object_name();
                    _fsp--;

                    dbg.location(1864,2);

                    		if(!g_ignore_stmt)
                    		{
                    			Symbol hostsym =  currentScope.getSymbol(input.toString(host_obj_i.start,host_obj_i.stop));
                    			
                    			try
                    			{ 
                    				if(hostsym.getType().equals ("host_type_t") != true) 
                    			  	{ 
                    			  		throw (new DataFormatException("rule : host_group"));
                    			  	}
                    		  	}
                    		  	catch (DataFormatException dfe)
                    		  	{
                    		   		System.out.println(dfe);
                    		    		dfe.printStackTrace();
                    	 	    		System.exit(1); 
                    		   	}
                    			Host host = (Host) hostsym.lookupValue();
                    			hosts.add(host);
                    		}
                    	

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(63);}

            dbg.location(1887,3);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1887:3: ( ',' (j= host | (host_obj_j= object_name ) ) )*
            try { dbg.enterSubRule(65);

            loop65:
            do {
                int alt65=2;
                try { dbg.enterDecision(65);

                int LA65_0 = input.LA(1);

                if ( (LA65_0==63) ) {
                    alt65=1;
                }


                } finally {dbg.exitDecision(65);}

                switch (alt65) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1887:4: ',' (j= host | (host_obj_j= object_name ) )
            	    {
            	    dbg.location(1887,4);
            	    match(input,63,FOLLOW_63_in_host_group2964); 
            	    dbg.location(1887,8);
            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1887:8: (j= host | (host_obj_j= object_name ) )
            	    int alt64=2;
            	    try { dbg.enterSubRule(64);
            	    try { dbg.enterDecision(64);

            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==88) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==ID) ) {
            	        alt64=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1887:8: (j= host | (host_obj_j= object_name ) )", 64, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(64);}

            	    switch (alt64) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1887:9: j= host
            	            {
            	            dbg.location(1887,10);
            	            pushFollow(FOLLOW_host_in_host_group2969);
            	            j=host();
            	            _fsp--;

            	            dbg.location(1888,3);

            	            	 	if(!g_ignore_stmt)
            	            	 	{
            	            	 		hosts.add((Host)j.lookupValue());
            	            	 	}
            	            	 

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1894:5: (host_obj_j= object_name )
            	            {
            	            dbg.location(1894,5);
            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1894:5: (host_obj_j= object_name )
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1894:6: host_obj_j= object_name
            	            {
            	            dbg.location(1894,17);
            	            pushFollow(FOLLOW_object_name_in_host_group2986);
            	            host_obj_j=object_name();
            	            _fsp--;

            	            dbg.location(1895,3);

            	            	
            	            		if(!g_ignore_stmt)
            	            		{
            	            			Symbol hostsym =  currentScope.getSymbol(input.toString(host_obj_j.start,host_obj_j.stop));
            	            			
            	            			try
            	            			{ 
            	            				if(hostsym.getType().equals ("host_type_t") != true) 
            	            			  	{ 
            	            			  		throw (new DataFormatException("rule : host_group"));
            	            			  	}
            	            			}
            	            			catch (DataFormatException dfe)
            	            			{
            	            				System.out.println(dfe);
            	            				dfe.printStackTrace();
            	            			 	System.exit(1);
            	            			}
            	            			Host host = (Host) hostsym.lookupValue();
            	            			hosts.add(host); 
            	            		}
            	            	

            	            }


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(64);}


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);
            } finally {dbg.exitSubRule(65);}

            dbg.location(1918,7);
            match(input,76,FOLLOW_76_in_host_group2998); 
            dbg.location(1919,2);

            		if(!g_ignore_stmt)
            		{
            			Hostgroup hgroup = new Hostgroup (hosts);
            			Symbol s = new Symbol ("host_group_type_t","host_group_type_t",hgroup);
            			sym = s;  		
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1927, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1929:1: interf returns [Symbol sym] : 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )* ;
    public final Symbol interf() throws RecognitionException {
        Symbol sym = null;

        Token interface_name=null;
        ip_addr_return interface_ip = null;

        ip_addr_return interface_netmask = null;

        ip_addr_return i = null;

        ip_addr_return j = null;

        ip_addr_return gw_ip = null;


         
        	Vector <Ipaddress> dns_ip;
             	dns_ip = new Vector <Ipaddress>() ;	     
             	boolean dns_used = false;
             	boolean defgw_used = false;
             	Interface iface;

        try { dbg.enterRule("interf");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1929, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1938:2: ( 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1939:3: 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )*
            {
            dbg.location(1939,3);
            match(input,89,FOLLOW_89_in_interf3033); 
            dbg.location(1939,12);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1939:12: (interface_name= ID )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1939:13: interface_name= ID
            {
            dbg.location(1939,27);
            interface_name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_interf3038); 

            }

            dbg.location(1940,3);

            	 	if(!g_ignore_stmt)
            	 	{
            	 		System.out.println(interface_name.getText());
            	 	}
            	 
            dbg.location(1945,17);
            pushFollow(FOLLOW_ip_addr_in_interf3049);
            interface_ip=ip_addr();
            _fsp--;

            dbg.location(1945,27);
            match(input,78,FOLLOW_78_in_interf3051); 
            dbg.location(1945,54);
            pushFollow(FOLLOW_ip_addr_in_interf3056);
            interface_netmask=ip_addr();
            _fsp--;

            dbg.location(1946,2);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1946:2: ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )*
            try { dbg.enterSubRule(67);

            loop67:
            do {
                int alt67=2;
                try { dbg.enterDecision(67);

                int LA67_0 = input.LA(1);

                if ( (LA67_0==90) ) {
                    alt67=1;
                }


                } finally {dbg.exitDecision(67);}

                switch (alt67) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1946:4: 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}'
            	    {
            	    dbg.location(1946,4);
            	    match(input,90,FOLLOW_90_in_interf3062); 
            	    dbg.location(1946,11);
            	    match(input,75,FOLLOW_75_in_interf3065); 
            	    dbg.location(1946,16);
            	    pushFollow(FOLLOW_ip_addr_in_interf3069);
            	    i=ip_addr();
            	    _fsp--;

            	    dbg.location(1947,2);

            	    		if(!g_ignore_stmt)
            	    		{
            	    		dns_ip.add(new Ipaddress(input.toString(i.start,i.stop)));
            	    		}
            	    	
            	    dbg.location(1953,2);
            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1953:2: ( ',' j= ip_addr )*
            	    try { dbg.enterSubRule(66);

            	    loop66:
            	    do {
            	        int alt66=2;
            	        try { dbg.enterDecision(66);

            	        int LA66_0 = input.LA(1);

            	        if ( (LA66_0==63) ) {
            	            alt66=1;
            	        }


            	        } finally {dbg.exitDecision(66);}

            	        switch (alt66) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1953:4: ',' j= ip_addr
            	    	    {
            	    	    dbg.location(1953,4);
            	    	    match(input,63,FOLLOW_63_in_interf3080); 
            	    	    dbg.location(1953,10);
            	    	    pushFollow(FOLLOW_ip_addr_in_interf3085);
            	    	    j=ip_addr();
            	    	    _fsp--;

            	    	    dbg.location(1954,2);

            	    	    		if(!g_ignore_stmt)
            	    	    		{
            	    	    			dns_ip.add(new Ipaddress(input.toString(j.start,j.stop)));
            	    	    		}
            	    	    	

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop66;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(66);}

            	    dbg.location(1959,7);
            	    match(input,76,FOLLOW_76_in_interf3093); 
            	    dbg.location(1960,2);
            	    dns_used = true;

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);
            } finally {dbg.exitSubRule(67);}

            dbg.location(1961,2);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1961:2: ( 'defgw' gw_ip= ip_addr )*
            try { dbg.enterSubRule(68);

            loop68:
            do {
                int alt68=2;
                try { dbg.enterDecision(68);

                int LA68_0 = input.LA(1);

                if ( (LA68_0==91) ) {
                    alt68=1;
                }


                } finally {dbg.exitDecision(68);}

                switch (alt68) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1961:4: 'defgw' gw_ip= ip_addr
            	    {
            	    dbg.location(1961,4);
            	    match(input,91,FOLLOW_91_in_interf3107); 
            	    dbg.location(1961,18);
            	    pushFollow(FOLLOW_ip_addr_in_interf3112);
            	    gw_ip=ip_addr();
            	    _fsp--;

            	    dbg.location(1961,27);
            	    defgw_used = true;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);
            } finally {dbg.exitSubRule(68);}

            dbg.location(1962,2);

            		if(!g_ignore_stmt)
            		{
            			String interf_name = interface_name.getText();
            			String interf_ip = input.toString(interface_ip.start,interface_ip.stop);
            			String interf_netmask = input.toString(interface_netmask.start,interface_netmask.stop);
            			String interf_gw = null;
            			if(defgw_used == true)
            			{
            				interf_gw = input.toString(gw_ip.start,gw_ip.stop);
            			}
            			if(dns_used == true)
            			{
            				iface = new Interface (interf_name,interf_ip,interf_netmask,interf_gw, dns_ip);
            			}
            			else
            			{
            				iface = new Interface (interf_name,interf_ip,interf_netmask,interf_gw, null);
            			}
            			
            			Symbol s = new Symbol("interface_descriptor", "interface_type_t", iface);
            			sym = s;  
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(1985, 4);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1987:1: route returns [Symbol sym] : ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) );
    public final Symbol route() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return dst = null;

        object_name_return ip_obj = null;

        ip_addr_return gw = null;

        object_name_return gw_ip_obj = null;

        ip_addr_return netmask_ip = null;

        object_name_return nm_ip_obj = null;




        	boolean ip_object_used , gw_object_used,nm_object_used ;
        	ip_object_used = false;
        	gw_object_used = false;
        	nm_object_used=false;

        try { dbg.enterRule("route");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(1987, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1996:2: ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) )
            int alt74=2;
            try { dbg.enterDecision(74);

            int LA74_0 = input.LA(1);

            if ( (LA74_0==92) ) {
                alt74=1;
            }
            else if ( (LA74_0==94) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1987:1: route returns [Symbol sym] : ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) );", 74, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(74);}

            switch (alt74) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1997:2: 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) )
                    {
                    dbg.location(1997,2);
                    match(input,92,FOLLOW_92_in_route3143); 
                    dbg.location(1997,9);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1997:9: (dst= ip_addr | (ip_obj= object_name ) )
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
                            new NoViableAltException("1997:9: (dst= ip_addr | (ip_obj= object_name ) )", 69, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(69);}

                    switch (alt69) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1997:10: dst= ip_addr
                            {
                            dbg.location(1997,13);
                            pushFollow(FOLLOW_ip_addr_in_route3148);
                            dst=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1997:22: (ip_obj= object_name )
                            {
                            dbg.location(1997,22);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1997:22: (ip_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1997:23: ip_obj= object_name
                            {
                            dbg.location(1997,30);
                            pushFollow(FOLLOW_object_name_in_route3154);
                            ip_obj=object_name();
                            _fsp--;

                            dbg.location(1998,2);
                            ip_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(69);}

                    dbg.location(1998,27);
                    match(input,93,FOLLOW_93_in_route3162); 
                    dbg.location(1998,32);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1998:32: (gw= ip_addr | (gw_ip_obj= object_name ) )
                    int alt70=2;
                    try { dbg.enterSubRule(70);
                    try { dbg.enterDecision(70);

                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NUMBER) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==ID) ) {
                        alt70=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1998:32: (gw= ip_addr | (gw_ip_obj= object_name ) )", 70, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(70);}

                    switch (alt70) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1998:33: gw= ip_addr
                            {
                            dbg.location(1998,35);
                            pushFollow(FOLLOW_ip_addr_in_route3167);
                            gw=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1998:44: (gw_ip_obj= object_name )
                            {
                            dbg.location(1998,44);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1998:44: (gw_ip_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:1998:45: gw_ip_obj= object_name
                            {
                            dbg.location(1998,55);
                            pushFollow(FOLLOW_object_name_in_route3174);
                            gw_ip_obj=object_name();
                            _fsp--;

                            dbg.location(1998,68);
                            gw_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(70);}

                    dbg.location(1999,2);

                    		if(!g_ignore_stmt)
                    		{	
                    			if(ip_object_used == true && gw_object_used ==false)
                    			{
                    			  	Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    			 
                    			 	/* Check for type error  in ipaddres*/
                    				try
                    				{
                    			  		if(s.getType().equals ("ipaddr_t") != true) 
                    			  		{ 
                    			  			throw (new DataFormatException("rule : route:host"));
                    			  		}
                    			  	}
                    			  	catch (DataFormatException dfe)
                    			  	{
                    			   		System.out.println(dfe);
                    			   		dfe.printStackTrace();
                    		 	    		System.exit(1); 
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
                    			      	try
                    			      	{
                    					if(s.getType().equals ("ipaddr_t") != true) 
                    				  	{ 
                    				  		throw (new DataFormatException("rule : route:host"));
                    				  	}
                    				}
                    				catch (DataFormatException dfe)
                    				{
                    					System.out.println(dfe);
                    				   	dfe.printStackTrace();
                    			 	   	System.exit(1);  
                    				}
                    	      	  
                    				Ipaddress gwip = (Ipaddress) s.lookupValue();
                    				Route rh = new Route (input.toString(ip_obj.start,ip_obj.stop),gwip.getString());//it should be input.toString(dst.start,dst.stop) instead of ip_obj
                    				Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
                    				sym = s_ret;
                    			}
                    			else if(ip_object_used ==true && gw_object_used ==true)
                    			{
                    		
                    		  		Symbol dst_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    		
                    		 		try
                    		 		{
                    		 			/* Check fot type exceptions in ip_address */
                    		  			if(dst_ip.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:host"));
                    		  			}
                    		  		}
                    		  		catch (DataFormatException dfe)
                    				{
                    					System.out.println(dfe);
                    					dfe.printStackTrace();
                    			 	   	System.exit(1);
                    				}
                    				Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
                    			  	Symbol dst_gw = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                    				
                    		 		try
                    		 		{  /* Check for type exception in netmask  */
                    		  			if(dst_gw.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:host"));
                    		  			}
                    		  		}
                    		 		catch (DataFormatException dfe)
                    		  		{
                    		   			System.out.println(dfe);
                    					dfe.printStackTrace();
                    				 	System.exit(1);
                    		   		}	  
                    				Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();	 
                    		 		Route rh = new Route (ip.getString(),gwip.getString());
                    		 		Symbol s_ret = new Symbol("route_host_string", "host_type_t", rh);
                    		 		sym = s_ret;
                    		
                    			}
                    		 	else
                    		 	{
                    			 	Route rh = new Route (input.toString(dst.start,dst.stop), input.toString(gw.start,gw.stop));
                    			  	Symbol s_ret = new Symbol("host_route_string", "route_type_t", rh);
                    			  	sym = s_ret;
                    		  	}
                    		}
                    	

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:3: 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) )
                    {
                    dbg.location(2108,3);
                    match(input,94,FOLLOW_94_in_route3195); 
                    dbg.location(2108,9);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:9: (dst= ip_addr | (ip_obj= object_name ) )
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
                            new NoViableAltException("2108:9: (dst= ip_addr | (ip_obj= object_name ) )", 71, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(71);}

                    switch (alt71) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:10: dst= ip_addr
                            {
                            dbg.location(2108,13);
                            pushFollow(FOLLOW_ip_addr_in_route3200);
                            dst=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:22: (ip_obj= object_name )
                            {
                            dbg.location(2108,22);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:22: (ip_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:23: ip_obj= object_name
                            {
                            dbg.location(2108,29);
                            pushFollow(FOLLOW_object_name_in_route3205);
                            ip_obj=object_name();
                            _fsp--;

                            dbg.location(2108,41);
                            ip_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(71);}

                    dbg.location(2108,66);
                    match(input,78,FOLLOW_78_in_route3210); 
                    dbg.location(2108,76);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:76: (netmask_ip= ip_addr | (nm_ip_obj= object_name ) )
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
                            new NoViableAltException("2108:76: (netmask_ip= ip_addr | (nm_ip_obj= object_name ) )", 72, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(72);}

                    switch (alt72) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:77: netmask_ip= ip_addr
                            {
                            dbg.location(2108,87);
                            pushFollow(FOLLOW_ip_addr_in_route3215);
                            netmask_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:96: (nm_ip_obj= object_name )
                            {
                            dbg.location(2108,96);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:96: (nm_ip_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2108:97: nm_ip_obj= object_name
                            {
                            dbg.location(2108,106);
                            pushFollow(FOLLOW_object_name_in_route3220);
                            nm_ip_obj=object_name();
                            _fsp--;

                            dbg.location(2108,118);
                            nm_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(72);}

                    dbg.location(2109,3);
                    match(input,93,FOLLOW_93_in_route3228); 
                    dbg.location(2109,8);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2109:8: (gw= ip_addr | (gw_ip_obj= object_name ) )
                    int alt73=2;
                    try { dbg.enterSubRule(73);
                    try { dbg.enterDecision(73);

                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NUMBER) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==ID) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2109:8: (gw= ip_addr | (gw_ip_obj= object_name ) )", 73, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(73);}

                    switch (alt73) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2109:9: gw= ip_addr
                            {
                            dbg.location(2109,11);
                            pushFollow(FOLLOW_ip_addr_in_route3234);
                            gw=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2109:21: (gw_ip_obj= object_name )
                            {
                            dbg.location(2109,21);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2109:21: (gw_ip_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2109:22: gw_ip_obj= object_name
                            {
                            dbg.location(2109,31);
                            pushFollow(FOLLOW_object_name_in_route3239);
                            gw_ip_obj=object_name();
                            _fsp--;

                            dbg.location(2109,43);
                            gw_object_used=true;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(73);}

                    dbg.location(2110,2);

                    	 	if(!g_ignore_stmt)
                    	 	{
                    		 	if((ip_object_used ==true )&& (nm_object_used==false) && (gw_object_used==false))
                    		 	{
                    		 		Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    		 
                    		 		try
                    		 		{
                    		  			if(s.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:net"));
                    		  			}
                    		  		}
                    		  		catch (DataFormatException dfe)
                    		  		{
                    		   			System.out.println(dfe);
                    				    	dfe.printStackTrace();
                    				    	System.exit(1);
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
                    		      	   	try
                    		      	   	{
                    			  		if(s.getType().equals ("ipaddr_t") != true) 
                    			  		{ 
                    			  			throw (new DataFormatException("rule : route:net"));
                    			  		}
                    			  	}
                    			  	catch (DataFormatException dfe)
                    			  	{
                    			   		System.out.println(dfe);
                    		    	    		dfe.printStackTrace();
                    		 	    		System.exit(1);
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
                    				try
                    				{
                    		  			if(s.getType().equals ("ipaddr_t") != true) 
                    					{ 
                    						throw (new DataFormatException("rule : route:net"));
                    					}
                    				}
                    				catch (DataFormatException dfe)
                    				{
                    					System.out.println(dfe);
                    				    	dfe.printStackTrace();
                    				 	System.exit(1);
                    				}
                    				Ipaddress gwip = (Ipaddress) s.lookupValue();
                    				Route rh = new Route (input.toString(dst.start,dst.stop),input.toString(netmask_ip.start,netmask_ip.stop),gwip.getString());
                    				Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    				sym = s_ret;			 
                    		 	}
                    		 	else if(ip_object_used ==true && nm_object_used==true && gw_object_used==false)
                    		 	{ 	 	
                    		 		Symbol dst_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    				try
                    				{  /* Check fot type exceptions in ip_address */
                    					if(dst_ip.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:net"));
                    		  			}
                    		  		}
                    		  		catch (DataFormatException dfe)
                    		  		{
                    		   			System.out.println(dfe);
                    					dfe.printStackTrace();
                    				 	System.exit(1);
                    		   		}
                    		  		Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
                    	  	  		Symbol dst_nm = currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    		
                    		 		try
                    		 		{  /* Check for type exception in netmask  */
                    					if(dst_nm.getType().equals ("ipaddr_t") != true) 
                    				  	{ 
                    				  		throw (new DataFormatException("rule : route:net"));
                    				  	}
                    				}
                    				catch (DataFormatException dfe)
                    				{
                    					System.out.println(dfe);
                    				    	dfe.printStackTrace();
                    			 	    	System.exit(1);
                    				}
                    				  
                    				Ipaddress nmip = (Ipaddress) dst_nm.lookupValue();
                    				Route rh = new Route (ip.getString(),nmip.getString(),input.toString(gw.start,gw.stop));
                    				Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    				sym = s_ret;
                    				
                    		 	}
                    		 	else if(ip_object_used ==true && nm_object_used==false && gw_object_used==true)
                    		 	{
                    		 
                    		   		Symbol dst_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    		 		try
                    		 		{  /* Check fot type exceptions in ip_address */
                    					if(dst_ip.getType().equals ("ipaddr_t") != true) 
                    				  	{ 
                    				  		throw (new DataFormatException("rule : route:net"));
                    				  	}
                    				}
                    				catch (DataFormatException dfe)
                    		  		{
                    		 			System.out.println(dfe);
                    		    			dfe.printStackTrace();
                    	 	    			System.exit(1);
                    		   		}
                    				Ipaddress ip = (Ipaddress) dst_ip.lookupValue();
                    			  	Symbol dst_gw = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                    				
                    		 		try
                    		 		{  /* Check for type exception in netmask  */
                    		  			if(dst_gw.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:net"));
                    		  			}
                    		  		}
                    		  		catch (DataFormatException dfe)
                    		  		{
                    		  			System.out.println(dfe);
                    		   			dfe.printStackTrace();
                    	 	   			System.exit(1);
                    		   		}
                    		  		Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
                    			 	Route rh = new Route (ip.getString(),input.toString(netmask_ip.start,netmask_ip.stop),gwip.getString());
                    		  		Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    		 		sym = s_ret;
                    		 	}
                    		 	else if(ip_object_used ==false && nm_object_used==true && gw_object_used==true)
                    		 	{
                    		 
                    		   		Symbol nm_ip =  currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    		
                    		 		try
                    		 		{  /* Check fot type exceptions in ip_address */
                    		  			if(nm_ip.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:net"));
                    		  			}
                    		  		}
                    		  		catch (DataFormatException dfe)
                    		  		{
                    		   			System.out.println(dfe);
                    		   			dfe.printStackTrace();
                    	 	  		 	System.exit(1);	   
                    	 	   		}
                    		  		Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
                    		  		Symbol dst_gw = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                    		
                    		 		try
                    		 		{  /* Check for type exception in netmask  */
                    		  			if(dst_gw.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:net"));
                    		  			}
                    		  		}
                    		  		catch (DataFormatException dfe)
                    		  		{
                    		   			System.out.println(dfe);
                    	    	    			dfe.printStackTrace();
                    	 	    			System.exit(1);
                    		   		}
                    		  
                    		  		Ipaddress gwip = (Ipaddress) dst_gw.lookupValue();
                    		 		Route rh = new Route (input.toString(dst.start,dst.stop),nmip.getString(),gwip.getString());
                    		  		Symbol s_ret = new Symbol("route_net_string", "route_type_t", rh);
                    		 		sym = s_ret;
                    		 	}
                    		 	else if(ip_object_used ==true && nm_object_used==true && gw_object_used==true)
                    		 	{
                    		  		Symbol dst_ip =  currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    		 		try
                    		 		{  /* Check fot type exceptions in ip_address */
                    		  	  		if(dst_ip.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:net"));
                    		  			}
                    	  			}
                    	  			catch (DataFormatException dfe)
                    	  			{
                    	   				System.out.println(dfe);
                    				    	dfe.printStackTrace();
                    			 	    	System.exit(1);
                    	   			}
                    				Ipaddress ip = (Ipaddress) dst_ip.lookupValue(); 	
                    		  		Symbol nm_ip =  currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    		
                    		 		try
                    		 		{  /* Check fot type exceptions in ip_address */
                    		  			if(nm_ip.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:net"));
                    		  			}
                    		  		}
                    		  		catch (DataFormatException dfe)
                    		  		{
                    		   			System.out.println(dfe);
                    	   	    			dfe.printStackTrace();
                    	 	    			System.exit(1); 
                    		   		}
                    				Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
                    				Symbol dst_gw = currentScope.getSymbol(input.toString(gw_ip_obj.start,gw_ip_obj.stop));
                    		
                    		 		try
                    		 		{  /* Check for type exception in netmask  */
                    		  			if(dst_gw.getType().equals ("ipaddr_t") != true) 
                    		  			{ 
                    		  				throw (new DataFormatException("rule : route:net"));
                    		  			}
                    		  		}
                    		  		catch (DataFormatException dfe)
                    		  		{
                    		   			System.out.println(dfe);
                    	  	    			dfe.printStackTrace();
                    	 	    			System.exit(1);  
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
        dbg.location(2361, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2363:1: serv_group returns [Symbol sym] : 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}' ;
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



        	Ipaddress serviceIp;
        	serviceIp = new Ipaddress ("0.0.0.0");
        	Ipaddress serviceNetmask;
        	serviceNetmask = new Ipaddress("0.0.0.0");
        	String servicePort;
        	servicePort = "0";
        	Vector <Servicedescriptor> sDesc;
        	sDesc = new Vector <Servicedescriptor> ();

        try { dbg.enterRule("serv_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(2363, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2375:2: ( 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}' )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2376:2: 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}'
            {
            dbg.location(2376,2);
            match(input,95,FOLLOW_95_in_serv_group3267); 
            dbg.location(2376,18);
            match(input,75,FOLLOW_75_in_serv_group3269); 
            dbg.location(2376,22);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2376:22: ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) )
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
                    new NoViableAltException("2376:22: ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) )", 75, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(75);}

            switch (alt75) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2376:23: (serv_ip_str= ip_addr )
                    {
                    dbg.location(2376,23);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2376:23: (serv_ip_str= ip_addr )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2376:24: serv_ip_str= ip_addr
                    {
                    dbg.location(2376,36);
                    pushFollow(FOLLOW_ip_addr_in_serv_group3278);
                    serv_ip_str=ip_addr();
                    _fsp--;

                    dbg.location(2377,2);
                     
                    		if(!g_ignore_stmt)
                    			serviceIp = new Ipaddress(input.toString(serv_ip_str.start,serv_ip_str.stop));
                    	

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2381:4: (serv_ip_obj= object_name )
                    {
                    dbg.location(2381,4);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2381:4: (serv_ip_obj= object_name )
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2381:5: serv_ip_obj= object_name
                    {
                    dbg.location(2381,17);
                    pushFollow(FOLLOW_object_name_in_serv_group3293);
                    serv_ip_obj=object_name();
                    _fsp--;

                    dbg.location(2382,2);
                     
                    		if(!g_ignore_stmt)
                    		{
                    			Symbol s = currentScope.getSymbol(input.toString(serv_ip_obj.start,serv_ip_obj.stop));
                    		 
                    			 try
                    			 {
                    			 	if(s.getType().equals ("ipaddr_t") != true) 
                    			  	{ 
                    			  		throw (new DataFormatException("rule : service_group:service ip"));
                    			  	}
                    			 }
                    			 catch (DataFormatException dfe)
                    			 {
                    			   	System.out.println(dfe);
                    		 	    	dfe.printStackTrace();
                    		 	    	System.exit(1);	   
                    			 }
                    		   
                    			 serviceIp = (Ipaddress) s.lookupValue();
                    		}
                    	

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(75);}

            dbg.location(2404,2);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2404:2: ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )?
            int alt77=2;
            try { dbg.enterSubRule(77);
            try { dbg.enterDecision(77);

            int LA77_0 = input.LA(1);

            if ( (LA77_0==78) ) {
                alt77=1;
            }
            } finally {dbg.exitDecision(77);}

            switch (alt77) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2404:3: 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )
                    {
                    dbg.location(2404,3);
                    match(input,78,FOLLOW_78_in_serv_group3303); 
                    dbg.location(2404,13);
                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2404:13: ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )
                    int alt76=2;
                    try { dbg.enterSubRule(76);
                    try { dbg.enterDecision(76);

                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NUMBER) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==ID) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2404:13: ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )", 76, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(76);}

                    switch (alt76) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2404:14: (serv_netmask_str= ip_addr )
                            {
                            dbg.location(2404,14);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2404:14: (serv_netmask_str= ip_addr )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2404:15: serv_netmask_str= ip_addr
                            {
                            dbg.location(2404,31);
                            pushFollow(FOLLOW_ip_addr_in_serv_group3309);
                            serv_netmask_str=ip_addr();
                            _fsp--;

                            dbg.location(2405,2);

                            		if(!g_ignore_stmt)
                            		{
                            			serviceNetmask = new Ipaddress(input.toString(serv_netmask_str.start,serv_netmask_str.stop));
                            		}
                            	

                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2411:2: (serv_netmask_obj= object_name )
                            {
                            dbg.location(2411,2);
                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2411:2: (serv_netmask_obj= object_name )
                            dbg.enterAlt(1);

                            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2411:3: serv_netmask_obj= object_name
                            {
                            dbg.location(2411,20);
                            pushFollow(FOLLOW_object_name_in_serv_group3322);
                            serv_netmask_obj=object_name();
                            _fsp--;

                            dbg.location(2412,2);

                            		if(!g_ignore_stmt)
                            		{ 
                            			Symbol s = currentScope.getSymbol(input.toString(serv_netmask_obj.start,serv_netmask_obj.stop));
                            		                       
                            			try
                            			{
                            				if(s.getType().equals ("ipaddr_t") != true) 
                            			  	{ 
                            			  		throw (new DataFormatException("rule : service_group: service_netmask"));
                            			  	}
                            			}
                            			catch (DataFormatException dfe)
                            			{
                            				System.out.println(dfe);
                            		 	    	dfe.printStackTrace();
                            	 		    	System.exit(1);		   
                            			} 
                            			serviceNetmask = (Ipaddress)s.lookupValue();
                            		}
                            	

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(76);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(77);}

            dbg.location(2433,15);
            pushFollow(FOLLOW_serv_listen_port_in_serv_group3337);
            serv_port_str=serv_listen_port();
            _fsp--;

            dbg.location(2434,2);

            		if(!g_ignore_stmt)
            		{ 
            			if(serviceIp.getString().equals("0.0.0.0")!=true)
            		     	{
            				serviceNetmask=new Ipaddress("255.255.255.255");
            		     	}
            		      
            		      	sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
            		      			         input.toString(serv_port_str.start,serv_port_str.stop))));
            		}
            	
            dbg.location(2446,2);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2446:2: ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )*
            try { dbg.enterSubRule(81);

            loop81:
            do {
                int alt81=2;
                try { dbg.enterDecision(81);

                int LA81_0 = input.LA(1);

                if ( (LA81_0==96) ) {
                    alt81=1;
                }


                } finally {dbg.exitDecision(81);}

                switch (alt81) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2446:3: ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port
            	    {
            	    dbg.location(2446,3);
            	    match(input,96,FOLLOW_96_in_serv_group3346); 
            	    dbg.location(2446,9);
            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2446:9: ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) )
            	    int alt78=2;
            	    try { dbg.enterSubRule(78);
            	    try { dbg.enterDecision(78);

            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==NUMBER) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==ID) ) {
            	        alt78=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("2446:9: ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) )", 78, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(78);}

            	    switch (alt78) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2446:10: (extra_ip_str= ip_addr )
            	            {
            	            dbg.location(2446,10);
            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2446:10: (extra_ip_str= ip_addr )
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2446:11: extra_ip_str= ip_addr
            	            {
            	            dbg.location(2446,24);
            	            pushFollow(FOLLOW_ip_addr_in_serv_group3356);
            	            extra_ip_str=ip_addr();
            	            _fsp--;

            	            dbg.location(2447,2);
            	             
            	            		if(!g_ignore_stmt)
            	            			serviceIp = new Ipaddress(input.toString(extra_ip_str.start,extra_ip_str.stop));
            	            	

            	            }


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2451:5: (extra_ip_obj= object_name )
            	            {
            	            dbg.location(2451,5);
            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2451:5: (extra_ip_obj= object_name )
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2451:6: extra_ip_obj= object_name
            	            {
            	            dbg.location(2451,19);
            	            pushFollow(FOLLOW_object_name_in_serv_group3372);
            	            extra_ip_obj=object_name();
            	            _fsp--;

            	            dbg.location(2452,2);

            	            		if(!g_ignore_stmt)
            	            		{ 
            	            			Symbol s = currentScope.getSymbol(input.toString(extra_ip_obj.start,extra_ip_obj.stop));
            	            		 
            	            			 try
            	            			 {
            	            			 	if(s.getType().equals ("ipaddr_t") != true) 
            	            			 				  	{ 
            	            			  		throw (new DataFormatException("rule : service_group:service ip:second_comma_separated_values"));
            	            			  	}
            	            			}
            	            			catch (DataFormatException dfe)
            	            			{
            	            				System.out.println(dfe);
            	            			    	dfe.printStackTrace();
            	            		 	    	System.exit(1);   
            	            		 	    				}
            	            			serviceIp = (Ipaddress) s.lookupValue();
            	            		}
            	            	

            	            }


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(78);}

            	    dbg.location(2473,2);
            	    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2473:2: ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )?
            	    int alt80=2;
            	    try { dbg.enterSubRule(80);
            	    try { dbg.enterDecision(80);

            	    int LA80_0 = input.LA(1);

            	    if ( (LA80_0==78) ) {
            	        alt80=1;
            	    }
            	    } finally {dbg.exitDecision(80);}

            	    switch (alt80) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2473:3: 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )
            	            {
            	            dbg.location(2473,3);
            	            match(input,78,FOLLOW_78_in_serv_group3382); 
            	            dbg.location(2473,13);
            	            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2473:13: ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )
            	            int alt79=2;
            	            try { dbg.enterSubRule(79);
            	            try { dbg.enterDecision(79);

            	            int LA79_0 = input.LA(1);

            	            if ( (LA79_0==NUMBER) ) {
            	                alt79=1;
            	            }
            	            else if ( (LA79_0==ID) ) {
            	                alt79=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("2473:13: ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )", 79, 0, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	            } finally {dbg.exitDecision(79);}

            	            switch (alt79) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2473:14: (extra_serv_netmask_str= ip_addr )
            	                    {
            	                    dbg.location(2473,14);
            	                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2473:14: (extra_serv_netmask_str= ip_addr )
            	                    dbg.enterAlt(1);

            	                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2473:15: extra_serv_netmask_str= ip_addr
            	                    {
            	                    dbg.location(2473,37);
            	                    pushFollow(FOLLOW_ip_addr_in_serv_group3388);
            	                    extra_serv_netmask_str=ip_addr();
            	                    _fsp--;

            	                    dbg.location(2474,2);

            	                    		if(!g_ignore_stmt)
            	                    		{
            	                    			serviceNetmask = new Ipaddress(input.toString(extra_serv_netmask_str.start,extra_serv_netmask_str.stop));
            	                    		}
            	                    	

            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    dbg.enterAlt(2);

            	                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2480:2: (extra_serv_netmask_obj= object_name )
            	                    {
            	                    dbg.location(2480,2);
            	                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2480:2: (extra_serv_netmask_obj= object_name )
            	                    dbg.enterAlt(1);

            	                    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2480:3: extra_serv_netmask_obj= object_name
            	                    {
            	                    dbg.location(2480,26);
            	                    pushFollow(FOLLOW_object_name_in_serv_group3401);
            	                    extra_serv_netmask_obj=object_name();
            	                    _fsp--;

            	                    dbg.location(2481,2);
            	                     
            	                    		if(!g_ignore_stmt)
            	                    		{
            	                    			Symbol s = currentScope.getSymbol(input.toString(extra_serv_netmask_obj.start,extra_serv_netmask_obj.stop));
            	                    		                      
            	                    			try{
            	                    		  		if(s.getType().equals ("ipaddr_t") != true) 
            	                    		  		{ 
            	                    		  			throw (new DataFormatException("rule : service_group: service_netmask"));
            	                    		  		}
            	                    		  	}
            	                    		  	catch (DataFormatException dfe)
            	                    		  	{
            	                    		   		System.out.println(dfe);
            	                    		    		dfe.printStackTrace();
            	                    	 	    		System.exit(1);   
            	                    		    	}
            	                    		    	serviceNetmask = (Ipaddress)s.lookupValue();
            	                    		}
            	                    	

            	                    }


            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(79);}


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(80);}

            	    dbg.location(2501,21);
            	    pushFollow(FOLLOW_serv_listen_port_in_serv_group3416);
            	    extra_serv_port_str=serv_listen_port();
            	    _fsp--;

            	    dbg.location(2502,2);

            	    		if(!g_ignore_stmt)
            	    		{ 
            	    			if(serviceIp.getString().equals("0.0.0.0")!=true)
            	    		     	{
            	    		     		serviceNetmask=new Ipaddress("255.255.255.255");
            	    		     	}
            	    		     	sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
            	    		      			         input.toString(extra_serv_port_str.start,extra_serv_port_str.stop))));
            	    		}	      			         
            	    	

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);
            } finally {dbg.exitSubRule(81);}

            dbg.location(2513,6);
            match(input,76,FOLLOW_76_in_serv_group3428); 
            dbg.location(2515,8);

                   		if(!g_ignore_stmt)
                   		{
                   			Servicegroup sg = new Servicegroup(sDesc);
                   			Symbol s = new Symbol ("serv_group_type_t","serv_group_type_t",sg);
                   			sym = s;		      
                 		}
                 	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(2523, 2);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2525:1: serv_listen_port : ( NUMBER ) ;
    public final serv_listen_port_return serv_listen_port() throws RecognitionException {
        serv_listen_port_return retval = new serv_listen_port_return();
        retval.start = input.LT(1);

        try { dbg.enterRule("serv_listen_port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(2525, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2526:2: ( ( NUMBER ) )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2526:4: ( NUMBER )
            {
            dbg.location(2526,4);
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2526:4: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2526:5: NUMBER
            {
            dbg.location(2526,5);
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port3462); 

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
        dbg.location(2526, 12);

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
    // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2528:1: host_name : ID ;
    public final void host_name() throws RecognitionException {
        try { dbg.enterRule("host_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(2528, 1);

        try {
            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2529:2: ( ID )
            dbg.enterAlt(1);

            // /home/sambuddho/lancom/plt_project/chitra_lancom_3/Block.g:2529:4: ID
            {
            dbg.location(2529,4);
            match(input,ID,FOLLOW_ID_in_host_name3472); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(2529, 6);

        }
        finally {
            dbg.exitRule("host_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end host_name


 

    public static final BitSet FOLLOW_27_in_prog131 = new BitSet(new long[]{0x0400F2B5E007A000L,0x00000000D30E07FFL});
    public static final BitSet FOLLOW_statement_list_in_prog133 = new BitSet(new long[]{0x0400F2B5F007A000L,0x00000000D30E07FFL});
    public static final BitSet FOLLOW_28_in_prog136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_if_statement_list149 = new BitSet(new long[]{0x0400F2B5E007A002L,0x00000000D30E07FFL});
    public static final BitSet FOLLOW_statement_in_statement_list166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declr_stmt_in_statement_list173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_statement_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_expr_in_statement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_statement_in_statement206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_statement_expr222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement_expr228 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement_expr230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_statement_in_statement_expr242 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement_expr244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUTE_OPER_in_config_statement265 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_object_name_in_config_statement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUTE_OPER_in_config_statement278 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_route_in_config_statement282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_config_statement299 = new BitSet(new long[]{0x0000000000020000L,0x0000000002000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interf_in_config_statement321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_config_statement340 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32_in_config_statement345 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_config_statement350 = new BitSet(new long[]{0x0000001000020000L,0x0000000000020000L});
    public static final BitSet FOLLOW_object_name_in_config_statement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_config_statement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement392 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_config_statement394 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_object_name_in_config_statement397 = new BitSet(new long[]{0x0000000000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_context_in_config_statement399 = new BitSet(new long[]{0x0000000000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_object_name_in_config_statement403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_config_statement416 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_config_statement418 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_object_name_in_config_statement424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_in_config_statement439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_config_statement462 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_config_statement464 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_object_name_in_config_statement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_in_config_statement485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_config_statement510 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_config_statement512 = new BitSet(new long[]{0x0000000000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_object_name_in_config_statement518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_config_statement556 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_config_statement558 = new BitSet(new long[]{0x0000000000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_object_name_in_config_statement563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement596 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_statement598 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_object_name_in_config_statement601 = new BitSet(new long[]{0x0000000000020000L,0x0000000001000000L});
    public static final BitSet FOLLOW_host_group_in_config_statement604 = new BitSet(new long[]{0x0000000000020000L,0x0000000001000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_config_statement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_display_in_config_statement617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_set_oper666 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_set_oper668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_set_oper673 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_set_oper675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_config_display690 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_config_display692 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_config_display694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_config_display702 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_config_display704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_config_display712 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_config_display714 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_config_display716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_config_display722 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_config_display724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_condition_statement762 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OPAREN_in_condition_statement764 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_logicalOR_expr_in_condition_statement768 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CPAREN_in_condition_statement778 = new BitSet(new long[]{0x0400F2B5E007A000L,0x00000000D30E07FFL});
    public static final BitSet FOLLOW_if_statement_list_in_condition_statement783 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_ELSE_in_condition_statement786 = new BitSet(new long[]{0x0400F2B5E007A000L,0x00000000D30E07FFL});
    public static final BitSet FOLLOW_if_statement_list_in_condition_statement796 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDIF_in_condition_statement800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_iteration_statement835 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OPAREN_in_iteration_statement847 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement851 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CPAREN_in_iteration_statement861 = new BitSet(new long[]{0x0400F2B5E007A000L,0x00000000D30E07FFL});
    public static final BitSet FOLLOW_if_statement_list_in_iteration_statement871 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDWHILE_in_iteration_statement881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_print_statement902 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_print_statement904 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_print_statement910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr945 = new BitSet(new long[]{0x7800000002000000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr949 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr1034 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_logicalOR_expr1047 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr1051 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr1084 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_logicalAND_expr1096 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr1100 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr1133 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_bitwiseOR_expr1145 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr1149 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr1182 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_bitwiseAND_expr1194 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr1198 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr1232 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr1244 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr1254 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr1287 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr1299 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_expr_in_relational_expr1311 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_term_in_expr1345 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr1360 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_term_in_expr1373 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term1409 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term1423 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_unary_expr_in_term1435 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_unary_expr1478 = new BitSet(new long[]{0x0400001400072000L,0x00000000D30E0000L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression1507 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1510 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_postfix_expression1511 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt1632 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1636 = new BitSet(new long[]{0x8000000020000000L});
    public static final BitSet FOLLOW_63_in_declr_stmt1643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1649 = new BitSet(new long[]{0x8000000020000000L});
    public static final BitSet FOLLOW_29_in_declr_stmt1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_object_values1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_in_object_values1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interf_in_object_values1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_in_object_values1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_context1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_context1869 = new BitSet(new long[]{0x0000000000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_policy_in_context1875 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_object_name_in_context1887 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_63_in_context1901 = new BitSet(new long[]{0x0000000000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_policy_in_context1908 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_object_name_in_context1920 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_context1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_verdict_in_policy1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_proto_in_policy1975 = new BitSet(new long[]{0x0000000000000002L,0x0000000000012000L});
    public static final BitSet FOLLOW_77_in_policy1982 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_policy1996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_policy2022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_policy2036 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_policy2042 = new BitSet(new long[]{0x0000000000002000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy2060 = new BitSet(new long[]{0x0000000000002000L,0x0000000000008000L});
    public static final BitSet FOLLOW_port_in_policy2075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_79_in_policy2086 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_policy2098 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_policy2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_policy2131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_policy2147 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_policy2153 = new BitSet(new long[]{0x0000000000002000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy2174 = new BitSet(new long[]{0x0000000000002000L,0x0000000000008000L});
    public static final BitSet FOLLOW_port_in_policy2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_policy2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy2234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_verdict_in_policy2238 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy2242 = new BitSet(new long[]{0x0000000000000002L,0x0000000000012000L});
    public static final BitSet FOLLOW_77_in_policy2248 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_policy2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_policy2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_policy2308 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_policy2314 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_object_name_in_policy2333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_policy2347 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_policy2358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_policy2379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_policy2389 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_policy2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_policy2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_topology2452 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_host_group_in_topology2458 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_object_name_in_topology2472 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_topology2484 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_context_in_topology2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_topology2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_topology2532 = new BitSet(new long[]{0x0000000000020000L,0x0000000080000000L});
    public static final BitSet FOLLOW_serv_group_in_topology2538 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_object_name_in_topology2552 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_topology2564 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_context_in_topology2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_topology2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_verdict2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_verdict2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_name2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2780 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2786 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2788 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2792 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2794 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_nmask2815 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ip_addr_in_nmask2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_host2833 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_host2838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_host2843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_host2854 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_host2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_host2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2888 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_dns_set2891 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2894 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2904 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_gateway2907 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2909 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_36_in_host_group2932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_host_group2935 = new BitSet(new long[]{0x0000000000020000L,0x0000000001000000L});
    public static final BitSet FOLLOW_host_in_host_group2940 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_object_name_in_host_group2951 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_63_in_host_group2964 = new BitSet(new long[]{0x0000000000020000L,0x0000000001000000L});
    public static final BitSet FOLLOW_host_in_host_group2969 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_object_name_in_host_group2986 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_host_group2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_interf3033 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_interf3038 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ip_addr_in_interf3049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_interf3051 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ip_addr_in_interf3056 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_90_in_interf3062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_interf3065 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ip_addr_in_interf3069 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_63_in_interf3080 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ip_addr_in_interf3085 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_interf3093 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_91_in_interf3107 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ip_addr_in_interf3112 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_92_in_route3143 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_route3148 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_object_name_in_route3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_route3162 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_route3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_route3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_route3195 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_route3200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_route3205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_route3210 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_route3215 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_object_name_in_route3220 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_route3228 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_route3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_route3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_serv_group3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_serv_group3269 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3278 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_serv_group3293 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_serv_group3303 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3309 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_object_name_in_serv_group3322 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group3337 = new BitSet(new long[]{0x0000000000000000L,0x0000000100001000L});
    public static final BitSet FOLLOW_96_in_serv_group3346 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3356 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_serv_group3372 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_serv_group3382 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3388 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_object_name_in_serv_group3401 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group3416 = new BitSet(new long[]{0x0000000000000000L,0x0000000100001000L});
    public static final BitSet FOLLOW_76_in_serv_group3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name3472 = new BitSet(new long[]{0x0000000000000002L});

}