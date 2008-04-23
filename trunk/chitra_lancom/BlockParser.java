// $ANTLR 3.0.1 /home/sambuddho/plt_project/chitra_lancom/Block.g 2008-04-22 01:04:38

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "PROG_BEGIN", "PROG_END", "SEMICOLON", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "ECHO", "STRING", "IFCONFIG", "APPLY", "TOPOLOGY", "UNDO", "ROLE", "POLICY", "HOST_GROUP", "SERV_GROUP", "ROUTE", "ADD", "DELETE", "TO", "FROM", "SHOW", "NUMERIC", "FW", "QUES", "COLON", "LOG_OR", "LOG_AND", "BITWISE_OR", "BITWISE_AND", "EQUAL_TO", "NOT_EQUAL_TO", "LT", "GT", "LE", "GE", "BITWISE_NEGATE", "ID", "ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "ADD_ASSIGN", "MINUS_ASSIGN", "COMMA", "TOPOLOGY_TYPE_NAME", "HOST_TYPE_NAME", "HOST_GROUP_TYPE_NAME", "SERVICE_GROUP_TYPE_NAME", "ROLE_GROUP_TYPE_NAME", "POLICY_TYPE_NAME", "ROUTE_TYPE_NAME", "INTERFACE_TYPE_NAME", "IP_ADDR_TYPE_NAME", "INT_TYPE_NAME", "CHAR_TYPE_NAME", "NETMASK", "NUMBER", "CHAR", "DIR_INBOUND", "DIR_OUTBOUND", "VERD_ALLOW", "VERD_DENY", "PROTO_UDP", "PROTO_TCP", "ICMP_MESSAGE_TYPE", "IFNAME", "CARD_ID", "DOT", "IPADDR", "DNS", "GATEWAY", "HOST", "GW", "NET", "SERV_SET", "LETTER", "DIGIT", "EscapeSequence", "LINE_COMMENT", "EQUAL", "WHITESPACE", "ALL", "'('", "')'", "'{'", "'}'"
    };
    public static final int LT=42;
    public static final int ROUTE=26;
    public static final int WHILE=14;
    public static final int ROUTE_TYPE_NAME=60;
    public static final int LETTER=85;
    public static final int CHAR=67;
    public static final int UNDO=21;
    public static final int EOF=-1;
    public static final int DIV_ASSIGN=50;
    public static final int SERV_SET=84;
    public static final int DIR_INBOUND=68;
    public static final int IFNAME=75;
    public static final int IPADDR=78;
    public static final int ENDIF=13;
    public static final int TOPOLOGY=20;
    public static final int CARD_ID=76;
    public static final int ENDWHILE=15;
    public static final int HOST_GROUP_TYPE_NAME=56;
    public static final int SHOW=31;
    public static final int QUES=34;
    public static final int GE=45;
    public static final int ROLE=22;
    public static final int LINE_COMMENT=88;
    public static final int ADD_ASSIGN=51;
    public static final int FW=33;
    public static final int ELSE=12;
    public static final int MINUS_ASSIGN=52;
    public static final int NUMBER=66;
    public static final int VERD_ALLOW=70;
    public static final int WHITESPACE=90;
    public static final int SEMICOLON=10;
    public static final int DELETE=28;
    public static final int NUMERIC=32;
    public static final int MULT=6;
    public static final int INTERFACE_TYPE_NAME=61;
    public static final int EQUAL_TO=40;
    public static final int NOT_EQUAL_TO=41;
    public static final int GATEWAY=80;
    public static final int GW=82;
    public static final int POLICY_TYPE_NAME=59;
    public static final int VERD_DENY=71;
    public static final int GT=43;
    public static final int PROG_END=9;
    public static final int POLICY=23;
    public static final int FROM=30;
    public static final int EscapeSequence=87;
    public static final int ICMP_MESSAGE_TYPE=74;
    public static final int BITWISE_AND=39;
    public static final int APPLY=19;
    public static final int MULT_ASSIGN=49;
    public static final int IP_ADDR_TYPE_NAME=62;
    public static final int HOST=81;
    public static final int HOST_TYPE_NAME=55;
    public static final int BITWISE_OR=38;
    public static final int ID=47;
    public static final int DNS=79;
    public static final int IF=11;
    public static final int BITWISE_NEGATE=46;
    public static final int SERVICE_GROUP_TYPE_NAME=57;
    public static final int COMMA=53;
    public static final int ROLE_GROUP_TYPE_NAME=58;
    public static final int EQUAL=89;
    public static final int ALL=91;
    public static final int PLUS=4;
    public static final int LOG_OR=36;
    public static final int DIGIT=86;
    public static final int DOT=77;
    public static final int LOG_AND=37;
    public static final int HOST_GROUP=24;
    public static final int ADD=27;
    public static final int CHAR_TYPE_NAME=64;
    public static final int NETMASK=65;
    public static final int TO=29;
    public static final int SERV_GROUP=25;
    public static final int PROTO_TCP=73;
    public static final int INT_TYPE_NAME=63;
    public static final int MINUS=5;
    public static final int COLON=35;
    public static final int ECHO=16;
    public static final int NET=83;
    public static final int IFCONFIG=18;
    public static final int TOPOLOGY_TYPE_NAME=54;
    public static final int DIR_OUTBOUND=69;
    public static final int ASSIGN=48;
    public static final int PROG_BEGIN=8;
    public static final int DIV=7;
    public static final int LE=44;
    public static final int STRING=17;
    public static final int PROTO_UDP=72;

        public BlockParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/sambuddho/plt_project/chitra_lancom/Block.g"; }


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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:133:1: prog : PROG_BEGIN ( statement_list )+ PROG_END ;
    public final void prog() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:134:2: ( PROG_BEGIN ( statement_list )+ PROG_END )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:134:4: PROG_BEGIN ( statement_list )+ PROG_END
            {
            match(input,PROG_BEGIN,FOLLOW_PROG_BEGIN_in_prog73); 
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:134:15: ( statement_list )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SEMICOLON && LA1_0<=IF)||LA1_0==WHILE||(LA1_0>=ECHO && LA1_0<=APPLY)||LA1_0==UNDO||LA1_0==HOST_GROUP||(LA1_0>=ROUTE && LA1_0<=DELETE)||LA1_0==FW||(LA1_0>=BITWISE_NEGATE && LA1_0<=ID)||(LA1_0>=TOPOLOGY_TYPE_NAME && LA1_0<=CHAR_TYPE_NAME)||(LA1_0>=NUMBER && LA1_0<=DIR_OUTBOUND)||LA1_0==IFNAME||LA1_0==IPADDR||LA1_0==HOST||(LA1_0>=NET && LA1_0<=SERV_SET)||LA1_0==92) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:134:15: statement_list
            	    {
            	    pushFollow(FOLLOW_statement_list_in_prog75);
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

            match(input,PROG_END,FOLLOW_PROG_END_in_prog78); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:136:2: statement_list : ( statement | declr_stmt );
    public final void statement_list() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:136:18: ( statement | declr_stmt )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=SEMICOLON && LA2_0<=IF)||LA2_0==WHILE||(LA2_0>=ECHO && LA2_0<=APPLY)||LA2_0==UNDO||LA2_0==HOST_GROUP||(LA2_0>=ROUTE && LA2_0<=DELETE)||LA2_0==FW||(LA2_0>=BITWISE_NEGATE && LA2_0<=ID)||(LA2_0>=NUMBER && LA2_0<=DIR_OUTBOUND)||LA2_0==IFNAME||LA2_0==IPADDR||LA2_0==HOST||(LA2_0>=NET && LA2_0<=SERV_SET)||LA2_0==92) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=TOPOLOGY_TYPE_NAME && LA2_0<=CHAR_TYPE_NAME)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("136:2: statement_list : ( statement | declr_stmt );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:136:20: statement
                    {
                    pushFollow(FOLLOW_statement_in_statement_list90);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:137:6: declr_stmt
                    {
                    pushFollow(FOLLOW_declr_stmt_in_statement_list97);
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:140:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final void statement() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:141:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt3=4;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt3=1;
                }
                break;
            case WHILE:
                {
                alt3=2;
                }
                break;
            case SEMICOLON:
            case STRING:
            case IFCONFIG:
            case APPLY:
            case UNDO:
            case HOST_GROUP:
            case ROUTE:
            case ADD:
            case DELETE:
            case FW:
            case BITWISE_NEGATE:
            case ID:
            case NUMBER:
            case CHAR:
            case DIR_INBOUND:
            case DIR_OUTBOUND:
            case IFNAME:
            case IPADDR:
            case HOST:
            case NET:
            case SERV_SET:
            case 92:
                {
                alt3=3;
                }
                break;
            case ECHO:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("140:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:141:5: condition_statement
                    {
                    pushFollow(FOLLOW_condition_statement_in_statement112);
                    condition_statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:142:5: iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement118);
                    iteration_statement();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:143:5: statement_expr
                    {
                    pushFollow(FOLLOW_statement_expr_in_statement124);
                    statement_expr();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:144:5: print_statement
                    {
                    pushFollow(FOLLOW_print_statement_in_statement130);
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:147:2: statement_expr : ( SEMICOLON | expression SEMICOLON );
    public final void statement_expr() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:148:3: ( SEMICOLON | expression SEMICOLON )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMICOLON) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=STRING && LA4_0<=APPLY)||LA4_0==UNDO||LA4_0==HOST_GROUP||(LA4_0>=ROUTE && LA4_0<=DELETE)||LA4_0==FW||(LA4_0>=BITWISE_NEGATE && LA4_0<=ID)||(LA4_0>=NUMBER && LA4_0<=DIR_OUTBOUND)||LA4_0==IFNAME||LA4_0==IPADDR||LA4_0==HOST||(LA4_0>=NET && LA4_0<=SERV_SET)||LA4_0==92) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("147:2: statement_expr : ( SEMICOLON | expression SEMICOLON );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:148:5: SEMICOLON
                    {
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement_expr146); 

                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:149:5: expression SEMICOLON
                    {
                    pushFollow(FOLLOW_expression_in_statement_expr153);
                    expression();
                    _fsp--;

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement_expr155); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:152:2: condition_statement : IF '(' equality_expr ')' statement_list ( ELSE statement_list )? ENDIF ;
    public final void condition_statement() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:153:3: ( IF '(' equality_expr ')' statement_list ( ELSE statement_list )? ENDIF )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:153:5: IF '(' equality_expr ')' statement_list ( ELSE statement_list )? ENDIF
            {
            match(input,IF,FOLLOW_IF_in_condition_statement171); 
            match(input,92,FOLLOW_92_in_condition_statement173); 
            pushFollow(FOLLOW_equality_expr_in_condition_statement175);
            equality_expr();
            _fsp--;

            match(input,93,FOLLOW_93_in_condition_statement177); 
            pushFollow(FOLLOW_statement_list_in_condition_statement179);
            statement_list();
            _fsp--;

            // /home/sambuddho/plt_project/chitra_lancom/Block.g:153:45: ( ELSE statement_list )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ELSE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:153:46: ELSE statement_list
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_condition_statement182); 
                    pushFollow(FOLLOW_statement_list_in_condition_statement184);
                    statement_list();
                    _fsp--;


                    }
                    break;

            }

            match(input,ENDIF,FOLLOW_ENDIF_in_condition_statement188); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:156:2: iteration_statement : WHILE '(' equality_expr ')' statement_list ENDWHILE ;
    public final void iteration_statement() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:157:3: ( WHILE '(' equality_expr ')' statement_list ENDWHILE )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:157:5: WHILE '(' equality_expr ')' statement_list ENDWHILE
            {
            match(input,WHILE,FOLLOW_WHILE_in_iteration_statement204); 
            match(input,92,FOLLOW_92_in_iteration_statement206); 
            pushFollow(FOLLOW_equality_expr_in_iteration_statement208);
            equality_expr();
            _fsp--;

            match(input,93,FOLLOW_93_in_iteration_statement210); 
            pushFollow(FOLLOW_statement_list_in_iteration_statement212);
            statement_list();
            _fsp--;

            match(input,ENDWHILE,FOLLOW_ENDWHILE_in_iteration_statement214); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:160:2: print_statement : ECHO STRING ';' ;
    public final void print_statement() throws RecognitionException {
        Token STRING1=null;

        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:161:3: ( ECHO STRING ';' )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:161:5: ECHO STRING ';'
            {
            match(input,ECHO,FOLLOW_ECHO_in_print_statement230); 
            STRING1=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement232); 
            System.out.println(STRING1);
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print_statement236); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:164:2: expression : ( assignment_expr | config_statement );
    public final void expression() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:165:3: ( assignment_expr | config_statement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==STRING||LA6_0==HOST_GROUP||(LA6_0>=BITWISE_NEGATE && LA6_0<=ID)||(LA6_0>=NUMBER && LA6_0<=DIR_OUTBOUND)||LA6_0==IFNAME||LA6_0==IPADDR||LA6_0==HOST||(LA6_0>=NET && LA6_0<=SERV_SET)||LA6_0==92) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=IFCONFIG && LA6_0<=APPLY)||LA6_0==UNDO||(LA6_0>=ROUTE && LA6_0<=DELETE)||LA6_0==FW) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("164:2: expression : ( assignment_expr | config_statement );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:165:5: assignment_expr
                    {
                    pushFollow(FOLLOW_assignment_expr_in_expression252);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:166:5: config_statement
                    {
                    pushFollow(FOLLOW_config_statement_in_expression259);
                    config_statement();
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
    // $ANTLR end expression


    // $ANTLR start config_statement
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );
    public final void config_statement() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:170:3: ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display )
            int alt7=21;
            switch ( input.LA(1) ) {
            case ROUTE:
                {
                switch ( input.LA(2) ) {
                case DELETE:
                    {
                    int LA7_8 = input.LA(3);

                    if ( (LA7_8==ID) ) {
                        alt7=1;
                    }
                    else if ( (LA7_8==HOST||LA7_8==NET) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case ADD:
                    {
                    int LA7_9 = input.LA(3);

                    if ( (LA7_9==HOST||LA7_9==NET) ) {
                        alt7=2;
                    }
                    else if ( (LA7_9==ID) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case SHOW:
                    {
                    alt7=21;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 1, input);

                    throw nvae;
                }

                }
                break;
            case IFCONFIG:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==ID) ) {
                    alt7=3;
                }
                else if ( (LA7_2==IFNAME) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case APPLY:
                {
                switch ( input.LA(2) ) {
                case ROLE:
                    {
                    int LA7_12 = input.LA(3);

                    if ( ((LA7_12>=DIR_INBOUND && LA7_12<=DIR_OUTBOUND)) ) {
                        int LA7_21 = input.LA(4);

                        if ( ((LA7_21>=VERD_ALLOW && LA7_21<=VERD_DENY)) ) {
                            switch ( input.LA(5) ) {
                            case NUMBER:
                                {
                                int LA7_36 = input.LA(6);

                                if ( (LA7_36==DOT) ) {
                                    int LA7_42 = input.LA(7);

                                    if ( (LA7_42==NUMBER) ) {
                                        int LA7_50 = input.LA(8);

                                        if ( (LA7_50==DOT) ) {
                                            int LA7_60 = input.LA(9);

                                            if ( (LA7_60==NUMBER) ) {
                                                int LA7_72 = input.LA(10);

                                                if ( (LA7_72==DOT) ) {
                                                    int LA7_80 = input.LA(11);

                                                    if ( (LA7_80==NUMBER) ) {
                                                        int LA7_88 = input.LA(12);

                                                        if ( (LA7_88==NETMASK) ) {
                                                            int LA7_43 = input.LA(13);

                                                            if ( (LA7_43==NUMBER) ) {
                                                                int LA7_51 = input.LA(14);

                                                                if ( (LA7_51==DOT) ) {
                                                                    int LA7_61 = input.LA(15);

                                                                    if ( (LA7_61==NUMBER) ) {
                                                                        int LA7_73 = input.LA(16);

                                                                        if ( (LA7_73==DOT) ) {
                                                                            int LA7_81 = input.LA(17);

                                                                            if ( (LA7_81==NUMBER) ) {
                                                                                int LA7_89 = input.LA(18);

                                                                                if ( (LA7_89==DOT) ) {
                                                                                    int LA7_96 = input.LA(19);

                                                                                    if ( (LA7_96==NUMBER) ) {
                                                                                        int LA7_102 = input.LA(20);

                                                                                        if ( (LA7_102==ICMP_MESSAGE_TYPE) ) {
                                                                                            alt7=12;
                                                                                        }
                                                                                        else {
                                                                                            NoViableAltException nvae =
                                                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 102, input);

                                                                                            throw nvae;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 96, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 89, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 81, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 73, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 61, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 51, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else if ( (LA7_43==ID) ) {
                                                                int LA7_52 = input.LA(14);

                                                                if ( (LA7_52==ICMP_MESSAGE_TYPE) ) {
                                                                    alt7=12;
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 52, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 43, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 88, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 80, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 72, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 60, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 50, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 42, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 36, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case ID:
                                {
                                int LA7_37 = input.LA(6);

                                if ( (LA7_37==NETMASK) ) {
                                    int LA7_43 = input.LA(7);

                                    if ( (LA7_43==NUMBER) ) {
                                        int LA7_51 = input.LA(8);

                                        if ( (LA7_51==DOT) ) {
                                            int LA7_61 = input.LA(9);

                                            if ( (LA7_61==NUMBER) ) {
                                                int LA7_73 = input.LA(10);

                                                if ( (LA7_73==DOT) ) {
                                                    int LA7_81 = input.LA(11);

                                                    if ( (LA7_81==NUMBER) ) {
                                                        int LA7_89 = input.LA(12);

                                                        if ( (LA7_89==DOT) ) {
                                                            int LA7_96 = input.LA(13);

                                                            if ( (LA7_96==NUMBER) ) {
                                                                int LA7_102 = input.LA(14);

                                                                if ( (LA7_102==ICMP_MESSAGE_TYPE) ) {
                                                                    alt7=12;
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 102, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 96, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 89, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 81, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 73, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 61, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 51, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA7_43==ID) ) {
                                        int LA7_52 = input.LA(8);

                                        if ( (LA7_52==ICMP_MESSAGE_TYPE) ) {
                                            alt7=12;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 52, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 43, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 37, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case PROTO_UDP:
                            case PROTO_TCP:
                                {
                                int LA7_38 = input.LA(6);

                                if ( (LA7_38==NUMBER) ) {
                                    int LA7_44 = input.LA(7);

                                    if ( (LA7_44==DOT) ) {
                                        int LA7_53 = input.LA(8);

                                        if ( (LA7_53==NUMBER) ) {
                                            int LA7_63 = input.LA(9);

                                            if ( (LA7_63==DOT) ) {
                                                int LA7_74 = input.LA(10);

                                                if ( (LA7_74==NUMBER) ) {
                                                    int LA7_82 = input.LA(11);

                                                    if ( (LA7_82==DOT) ) {
                                                        int LA7_90 = input.LA(12);

                                                        if ( (LA7_90==NUMBER) ) {
                                                            int LA7_97 = input.LA(13);

                                                            if ( (LA7_97==NETMASK) ) {
                                                                int LA7_54 = input.LA(14);

                                                                if ( (LA7_54==NUMBER) ) {
                                                                    int LA7_64 = input.LA(15);

                                                                    if ( (LA7_64==DOT) ) {
                                                                        int LA7_75 = input.LA(16);

                                                                        if ( (LA7_75==NUMBER) ) {
                                                                            int LA7_83 = input.LA(17);

                                                                            if ( (LA7_83==DOT) ) {
                                                                                int LA7_91 = input.LA(18);

                                                                                if ( (LA7_91==NUMBER) ) {
                                                                                    int LA7_98 = input.LA(19);

                                                                                    if ( (LA7_98==DOT) ) {
                                                                                        int LA7_103 = input.LA(20);

                                                                                        if ( (LA7_103==NUMBER) ) {
                                                                                            alt7=12;
                                                                                        }
                                                                                        else {
                                                                                            NoViableAltException nvae =
                                                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 103, input);

                                                                                            throw nvae;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 98, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 91, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 83, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 75, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 64, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else if ( (LA7_54==ID) ) {
                                                                    alt7=12;
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 54, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 97, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 90, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 82, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 74, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 63, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 53, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 44, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA7_38==ID) ) {
                                    int LA7_45 = input.LA(7);

                                    if ( (LA7_45==NETMASK) ) {
                                        int LA7_54 = input.LA(8);

                                        if ( (LA7_54==NUMBER) ) {
                                            int LA7_64 = input.LA(9);

                                            if ( (LA7_64==DOT) ) {
                                                int LA7_75 = input.LA(10);

                                                if ( (LA7_75==NUMBER) ) {
                                                    int LA7_83 = input.LA(11);

                                                    if ( (LA7_83==DOT) ) {
                                                        int LA7_91 = input.LA(12);

                                                        if ( (LA7_91==NUMBER) ) {
                                                            int LA7_98 = input.LA(13);

                                                            if ( (LA7_98==DOT) ) {
                                                                int LA7_103 = input.LA(14);

                                                                if ( (LA7_103==NUMBER) ) {
                                                                    alt7=12;
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 103, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 98, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 91, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 83, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 75, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 64, input);

                                                throw nvae;
                                            }
                                        }
                                        else if ( (LA7_54==ID) ) {
                                            alt7=12;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 54, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 45, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 38, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 32, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 21, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA7_12==ID) ) {
                        alt7=11;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case POLICY:
                    {
                    alt7=15;
                    }
                    break;
                case TOPOLOGY:
                    {
                    int LA7_14 = input.LA(3);

                    if ( (LA7_14==ID) ) {
                        alt7=5;
                    }
                    else if ( (LA7_14==HOST_GROUP||LA7_14==SERV_SET) ) {
                        alt7=6;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 3, input);

                    throw nvae;
                }

                }
                break;
            case UNDO:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==ROLE) ) {
                    int LA7_15 = input.LA(3);

                    if ( ((LA7_15>=DIR_INBOUND && LA7_15<=DIR_OUTBOUND)) ) {
                        int LA7_25 = input.LA(4);

                        if ( ((LA7_25>=VERD_ALLOW && LA7_25<=VERD_DENY)) ) {
                            switch ( input.LA(5) ) {
                            case PROTO_UDP:
                            case PROTO_TCP:
                                {
                                int LA7_39 = input.LA(6);

                                if ( (LA7_39==NUMBER) ) {
                                    int LA7_46 = input.LA(7);

                                    if ( (LA7_46==DOT) ) {
                                        int LA7_55 = input.LA(8);

                                        if ( (LA7_55==NUMBER) ) {
                                            int LA7_66 = input.LA(9);

                                            if ( (LA7_66==DOT) ) {
                                                int LA7_76 = input.LA(10);

                                                if ( (LA7_76==NUMBER) ) {
                                                    int LA7_84 = input.LA(11);

                                                    if ( (LA7_84==DOT) ) {
                                                        int LA7_92 = input.LA(12);

                                                        if ( (LA7_92==NUMBER) ) {
                                                            int LA7_99 = input.LA(13);

                                                            if ( (LA7_99==NETMASK) ) {
                                                                int LA7_56 = input.LA(14);

                                                                if ( (LA7_56==NUMBER) ) {
                                                                    int LA7_67 = input.LA(15);

                                                                    if ( (LA7_67==DOT) ) {
                                                                        int LA7_77 = input.LA(16);

                                                                        if ( (LA7_77==NUMBER) ) {
                                                                            int LA7_85 = input.LA(17);

                                                                            if ( (LA7_85==DOT) ) {
                                                                                int LA7_93 = input.LA(18);

                                                                                if ( (LA7_93==NUMBER) ) {
                                                                                    int LA7_100 = input.LA(19);

                                                                                    if ( (LA7_100==DOT) ) {
                                                                                        int LA7_104 = input.LA(20);

                                                                                        if ( (LA7_104==NUMBER) ) {
                                                                                            alt7=14;
                                                                                        }
                                                                                        else {
                                                                                            NoViableAltException nvae =
                                                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 104, input);

                                                                                            throw nvae;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 100, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 93, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 85, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 77, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 67, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else if ( (LA7_56==ID) ) {
                                                                    alt7=14;
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 56, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 99, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 92, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 84, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 76, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 66, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 55, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 46, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA7_39==ID) ) {
                                    int LA7_47 = input.LA(7);

                                    if ( (LA7_47==NETMASK) ) {
                                        int LA7_56 = input.LA(8);

                                        if ( (LA7_56==NUMBER) ) {
                                            int LA7_67 = input.LA(9);

                                            if ( (LA7_67==DOT) ) {
                                                int LA7_77 = input.LA(10);

                                                if ( (LA7_77==NUMBER) ) {
                                                    int LA7_85 = input.LA(11);

                                                    if ( (LA7_85==DOT) ) {
                                                        int LA7_93 = input.LA(12);

                                                        if ( (LA7_93==NUMBER) ) {
                                                            int LA7_100 = input.LA(13);

                                                            if ( (LA7_100==DOT) ) {
                                                                int LA7_104 = input.LA(14);

                                                                if ( (LA7_104==NUMBER) ) {
                                                                    alt7=14;
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 104, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 100, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 93, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 85, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 77, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 67, input);

                                                throw nvae;
                                            }
                                        }
                                        else if ( (LA7_56==ID) ) {
                                            alt7=14;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 56, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 47, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 39, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA7_40 = input.LA(6);

                                if ( (LA7_40==DOT) ) {
                                    int LA7_48 = input.LA(7);

                                    if ( (LA7_48==NUMBER) ) {
                                        int LA7_57 = input.LA(8);

                                        if ( (LA7_57==DOT) ) {
                                            int LA7_69 = input.LA(9);

                                            if ( (LA7_69==NUMBER) ) {
                                                int LA7_78 = input.LA(10);

                                                if ( (LA7_78==DOT) ) {
                                                    int LA7_86 = input.LA(11);

                                                    if ( (LA7_86==NUMBER) ) {
                                                        int LA7_94 = input.LA(12);

                                                        if ( (LA7_94==NETMASK) ) {
                                                            int LA7_49 = input.LA(13);

                                                            if ( (LA7_49==NUMBER) ) {
                                                                int LA7_58 = input.LA(14);

                                                                if ( (LA7_58==DOT) ) {
                                                                    int LA7_70 = input.LA(15);

                                                                    if ( (LA7_70==NUMBER) ) {
                                                                        int LA7_79 = input.LA(16);

                                                                        if ( (LA7_79==DOT) ) {
                                                                            int LA7_87 = input.LA(17);

                                                                            if ( (LA7_87==NUMBER) ) {
                                                                                int LA7_95 = input.LA(18);

                                                                                if ( (LA7_95==DOT) ) {
                                                                                    int LA7_101 = input.LA(19);

                                                                                    if ( (LA7_101==NUMBER) ) {
                                                                                        int LA7_105 = input.LA(20);

                                                                                        if ( (LA7_105==ICMP_MESSAGE_TYPE) ) {
                                                                                            alt7=14;
                                                                                        }
                                                                                        else {
                                                                                            NoViableAltException nvae =
                                                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 105, input);

                                                                                            throw nvae;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 101, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 95, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 87, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 79, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 70, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 58, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else if ( (LA7_49==ID) ) {
                                                                int LA7_59 = input.LA(14);

                                                                if ( (LA7_59==ICMP_MESSAGE_TYPE) ) {
                                                                    alt7=14;
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 59, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 49, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 94, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 86, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 78, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 69, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 57, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 48, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 40, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case ID:
                                {
                                int LA7_41 = input.LA(6);

                                if ( (LA7_41==NETMASK) ) {
                                    int LA7_49 = input.LA(7);

                                    if ( (LA7_49==NUMBER) ) {
                                        int LA7_58 = input.LA(8);

                                        if ( (LA7_58==DOT) ) {
                                            int LA7_70 = input.LA(9);

                                            if ( (LA7_70==NUMBER) ) {
                                                int LA7_79 = input.LA(10);

                                                if ( (LA7_79==DOT) ) {
                                                    int LA7_87 = input.LA(11);

                                                    if ( (LA7_87==NUMBER) ) {
                                                        int LA7_95 = input.LA(12);

                                                        if ( (LA7_95==DOT) ) {
                                                            int LA7_101 = input.LA(13);

                                                            if ( (LA7_101==NUMBER) ) {
                                                                int LA7_105 = input.LA(14);

                                                                if ( (LA7_105==ICMP_MESSAGE_TYPE) ) {
                                                                    alt7=14;
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 105, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 101, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 95, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 87, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 79, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 70, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 58, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA7_49==ID) ) {
                                        int LA7_59 = input.LA(8);

                                        if ( (LA7_59==ICMP_MESSAGE_TYPE) ) {
                                            alt7=14;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 59, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 49, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 41, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 33, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 25, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA7_15==ID) ) {
                        alt7=13;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 15, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_4==TOPOLOGY) ) {
                    int LA7_16 = input.LA(3);

                    if ( (LA7_16==ID) ) {
                        alt7=7;
                    }
                    else if ( (LA7_16==HOST_GROUP||LA7_16==SERV_SET) ) {
                        alt7=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 16, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            case ADD:
                {
                int LA7_5 = input.LA(2);

                if ( (LA7_5==TO) ) {
                    switch ( input.LA(3) ) {
                    case HOST_GROUP:
                        {
                        alt7=19;
                        }
                        break;
                    case ROLE:
                        {
                        int LA7_30 = input.LA(4);

                        if ( ((LA7_30>=DIR_INBOUND && LA7_30<=DIR_OUTBOUND)) ) {
                            alt7=10;
                        }
                        else if ( (LA7_30==ID) ) {
                            alt7=9;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 30, input);

                            throw nvae;
                        }
                        }
                        break;
                    case SERV_GROUP:
                        {
                        alt7=20;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 17, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            case DELETE:
                {
                int LA7_6 = input.LA(2);

                if ( (LA7_6==FROM) ) {
                    switch ( input.LA(3) ) {
                    case SERV_GROUP:
                        {
                        alt7=20;
                        }
                        break;
                    case ROLE:
                        {
                        int LA7_30 = input.LA(4);

                        if ( ((LA7_30>=DIR_INBOUND && LA7_30<=DIR_OUTBOUND)) ) {
                            alt7=10;
                        }
                        else if ( (LA7_30==ID) ) {
                            alt7=9;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 30, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HOST_GROUP:
                        {
                        alt7=19;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 18, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 6, input);

                    throw nvae;
                }
                }
                break;
            case FW:
                {
                alt7=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("169:2: config_statement : ( route_oper object_name | route_oper route | IFCONFIG object_name | IFCONFIG interface | APPLY TOPOLOGY object_name | APPLY TOPOLOGY topology | UNDO TOPOLOGY object_name | UNDO TOPOLOGY topology | set_oper ROLE object_name | set_oper ROLE role | APPLY ROLE object_name | APPLY ROLE role | UNDO ROLE object_name | UNDO ROLE role | APPLY POLICY object_name | APPLY ROLE policy | UNDO ROLE object_name | UNDO ROLE policy | set_oper HOST_GROUP host_group host | set_oper SERV_GROUP serv_group serv_descr | config_display );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:170:5: route_oper object_name
                    {
                    pushFollow(FOLLOW_route_oper_in_config_statement274);
                    route_oper();
                    _fsp--;

                    pushFollow(FOLLOW_object_name_in_config_statement276);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:171:5: route_oper route
                    {
                    pushFollow(FOLLOW_route_oper_in_config_statement282);
                    route_oper();
                    _fsp--;

                    pushFollow(FOLLOW_route_in_config_statement284);
                    route();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:172:5: IFCONFIG object_name
                    {
                    match(input,IFCONFIG,FOLLOW_IFCONFIG_in_config_statement291); 
                    pushFollow(FOLLOW_object_name_in_config_statement293);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:173:5: IFCONFIG interface
                    {
                    match(input,IFCONFIG,FOLLOW_IFCONFIG_in_config_statement299); 
                    pushFollow(FOLLOW_interface_in_config_statement301);
                    interface();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:174:5: APPLY TOPOLOGY object_name
                    {
                    match(input,APPLY,FOLLOW_APPLY_in_config_statement307); 
                    match(input,TOPOLOGY,FOLLOW_TOPOLOGY_in_config_statement309); 
                    pushFollow(FOLLOW_object_name_in_config_statement311);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:175:5: APPLY TOPOLOGY topology
                    {
                    match(input,APPLY,FOLLOW_APPLY_in_config_statement317); 
                    match(input,TOPOLOGY,FOLLOW_TOPOLOGY_in_config_statement319); 
                    pushFollow(FOLLOW_topology_in_config_statement321);
                    topology();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:176:5: UNDO TOPOLOGY object_name
                    {
                    match(input,UNDO,FOLLOW_UNDO_in_config_statement327); 
                    match(input,TOPOLOGY,FOLLOW_TOPOLOGY_in_config_statement329); 
                    pushFollow(FOLLOW_object_name_in_config_statement331);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 8 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:177:5: UNDO TOPOLOGY topology
                    {
                    match(input,UNDO,FOLLOW_UNDO_in_config_statement338); 
                    match(input,TOPOLOGY,FOLLOW_TOPOLOGY_in_config_statement340); 
                    pushFollow(FOLLOW_topology_in_config_statement342);
                    topology();
                    _fsp--;


                    }
                    break;
                case 9 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:178:5: set_oper ROLE object_name
                    {
                    pushFollow(FOLLOW_set_oper_in_config_statement348);
                    set_oper();
                    _fsp--;

                    match(input,ROLE,FOLLOW_ROLE_in_config_statement350); 
                    pushFollow(FOLLOW_object_name_in_config_statement352);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 10 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:179:5: set_oper ROLE role
                    {
                    pushFollow(FOLLOW_set_oper_in_config_statement382);
                    set_oper();
                    _fsp--;

                    match(input,ROLE,FOLLOW_ROLE_in_config_statement384); 
                    pushFollow(FOLLOW_role_in_config_statement386);
                    role();
                    _fsp--;


                    }
                    break;
                case 11 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:180:5: APPLY ROLE object_name
                    {
                    match(input,APPLY,FOLLOW_APPLY_in_config_statement392); 
                    match(input,ROLE,FOLLOW_ROLE_in_config_statement394); 
                    pushFollow(FOLLOW_object_name_in_config_statement396);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 12 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:181:5: APPLY ROLE role
                    {
                    match(input,APPLY,FOLLOW_APPLY_in_config_statement402); 
                    match(input,ROLE,FOLLOW_ROLE_in_config_statement404); 
                    pushFollow(FOLLOW_role_in_config_statement406);
                    role();
                    _fsp--;


                    }
                    break;
                case 13 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:182:5: UNDO ROLE object_name
                    {
                    match(input,UNDO,FOLLOW_UNDO_in_config_statement412); 
                    match(input,ROLE,FOLLOW_ROLE_in_config_statement414); 
                    pushFollow(FOLLOW_object_name_in_config_statement416);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 14 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:183:5: UNDO ROLE role
                    {
                    match(input,UNDO,FOLLOW_UNDO_in_config_statement422); 
                    match(input,ROLE,FOLLOW_ROLE_in_config_statement424); 
                    pushFollow(FOLLOW_role_in_config_statement426);
                    role();
                    _fsp--;


                    }
                    break;
                case 15 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:184:5: APPLY POLICY object_name
                    {
                    match(input,APPLY,FOLLOW_APPLY_in_config_statement432); 
                    match(input,POLICY,FOLLOW_POLICY_in_config_statement434); 
                    pushFollow(FOLLOW_object_name_in_config_statement436);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 16 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:185:5: APPLY ROLE policy
                    {
                    match(input,APPLY,FOLLOW_APPLY_in_config_statement442); 
                    match(input,ROLE,FOLLOW_ROLE_in_config_statement444); 
                    pushFollow(FOLLOW_policy_in_config_statement446);
                    policy();
                    _fsp--;


                    }
                    break;
                case 17 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:186:5: UNDO ROLE object_name
                    {
                    match(input,UNDO,FOLLOW_UNDO_in_config_statement452); 
                    match(input,ROLE,FOLLOW_ROLE_in_config_statement454); 
                    pushFollow(FOLLOW_object_name_in_config_statement456);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 18 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:187:5: UNDO ROLE policy
                    {
                    match(input,UNDO,FOLLOW_UNDO_in_config_statement462); 
                    match(input,ROLE,FOLLOW_ROLE_in_config_statement464); 
                    pushFollow(FOLLOW_policy_in_config_statement466);
                    policy();
                    _fsp--;


                    }
                    break;
                case 19 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:188:5: set_oper HOST_GROUP host_group host
                    {
                    pushFollow(FOLLOW_set_oper_in_config_statement472);
                    set_oper();
                    _fsp--;

                    match(input,HOST_GROUP,FOLLOW_HOST_GROUP_in_config_statement474); 
                    pushFollow(FOLLOW_host_group_in_config_statement476);
                    host_group();
                    _fsp--;

                    pushFollow(FOLLOW_host_in_config_statement478);
                    host();
                    _fsp--;


                    }
                    break;
                case 20 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:189:5: set_oper SERV_GROUP serv_group serv_descr
                    {
                    pushFollow(FOLLOW_set_oper_in_config_statement484);
                    set_oper();
                    _fsp--;

                    match(input,SERV_GROUP,FOLLOW_SERV_GROUP_in_config_statement486); 
                    pushFollow(FOLLOW_serv_group_in_config_statement488);
                    serv_group();
                    _fsp--;

                    pushFollow(FOLLOW_serv_descr_in_config_statement490);
                    serv_descr();
                    _fsp--;


                    }
                    break;
                case 21 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:190:5: config_display
                    {
                    pushFollow(FOLLOW_config_display_in_config_statement497);
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
        return ;
    }
    // $ANTLR end config_statement


    // $ANTLR start route_oper
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:193:2: route_oper : ( ROUTE ADD | ROUTE DELETE );
    public final void route_oper() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:194:3: ( ROUTE ADD | ROUTE DELETE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ROUTE) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DELETE) ) {
                    alt8=2;
                }
                else if ( (LA8_1==ADD) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("193:2: route_oper : ( ROUTE ADD | ROUTE DELETE );", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("193:2: route_oper : ( ROUTE ADD | ROUTE DELETE );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:194:5: ROUTE ADD
                    {
                    match(input,ROUTE,FOLLOW_ROUTE_in_route_oper513); 
                    match(input,ADD,FOLLOW_ADD_in_route_oper515); 

                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:195:5: ROUTE DELETE
                    {
                    match(input,ROUTE,FOLLOW_ROUTE_in_route_oper521); 
                    match(input,DELETE,FOLLOW_DELETE_in_route_oper523); 

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
    // $ANTLR end route_oper


    // $ANTLR start set_oper
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:198:1: set_oper : ( ADD TO | DELETE FROM );
    public final void set_oper() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:199:3: ( ADD TO | DELETE FROM )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ADD) ) {
                alt9=1;
            }
            else if ( (LA9_0==DELETE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("198:1: set_oper : ( ADD TO | DELETE FROM );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:199:5: ADD TO
                    {
                    match(input,ADD,FOLLOW_ADD_in_set_oper539); 
                    match(input,TO,FOLLOW_TO_in_set_oper541); 

                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:200:5: DELETE FROM
                    {
                    match(input,DELETE,FOLLOW_DELETE_in_set_oper547); 
                    match(input,FROM,FOLLOW_FROM_in_set_oper549); 

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
    // $ANTLR end set_oper


    // $ANTLR start config_display
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:203:2: config_display : ( ROUTE SHOW NUMERIC | ROUTE SHOW | FW SHOW NUMERIC | FW SHOW );
    public final void config_display() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:204:3: ( ROUTE SHOW NUMERIC | ROUTE SHOW | FW SHOW NUMERIC | FW SHOW )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ROUTE) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==SHOW) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==NUMERIC) ) {
                        alt10=1;
                    }
                    else if ( (LA10_3==SEMICOLON||LA10_3==COLON||LA10_3==93) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("203:2: config_display : ( ROUTE SHOW NUMERIC | ROUTE SHOW | FW SHOW NUMERIC | FW SHOW );", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("203:2: config_display : ( ROUTE SHOW NUMERIC | ROUTE SHOW | FW SHOW NUMERIC | FW SHOW );", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==FW) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==SHOW) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==NUMERIC) ) {
                        alt10=3;
                    }
                    else if ( (LA10_4==SEMICOLON||LA10_4==COLON||LA10_4==93) ) {
                        alt10=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("203:2: config_display : ( ROUTE SHOW NUMERIC | ROUTE SHOW | FW SHOW NUMERIC | FW SHOW );", 10, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("203:2: config_display : ( ROUTE SHOW NUMERIC | ROUTE SHOW | FW SHOW NUMERIC | FW SHOW );", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("203:2: config_display : ( ROUTE SHOW NUMERIC | ROUTE SHOW | FW SHOW NUMERIC | FW SHOW );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:205:4: ROUTE SHOW NUMERIC
                    {
                    match(input,ROUTE,FOLLOW_ROUTE_in_config_display569); 
                    match(input,SHOW,FOLLOW_SHOW_in_config_display571); 
                    match(input,NUMERIC,FOLLOW_NUMERIC_in_config_display573); 

                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:206:3: ROUTE SHOW
                    {
                    match(input,ROUTE,FOLLOW_ROUTE_in_config_display577); 
                    match(input,SHOW,FOLLOW_SHOW_in_config_display579); 

                    }
                    break;
                case 3 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:207:4: FW SHOW NUMERIC
                    {
                    match(input,FW,FOLLOW_FW_in_config_display585); 
                    match(input,SHOW,FOLLOW_SHOW_in_config_display587); 
                    match(input,NUMERIC,FOLLOW_NUMERIC_in_config_display589); 

                    }
                    break;
                case 4 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:208:3: FW SHOW
                    {
                    match(input,FW,FOLLOW_FW_in_config_display593); 
                    match(input,SHOW,FOLLOW_SHOW_in_config_display595); 

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
    // $ANTLR end config_display


    // $ANTLR start assignment_expr
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:211:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );
    public final void assignment_expr() throws RecognitionException {
        object_name_return var = null;

        assignment_operator_return op = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:212:4: (var= object_name op= assignment_operator assignment_expr | e= conditional_expr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=PLUS && LA11_1<=DIV)||LA11_1==SEMICOLON||(LA11_1>=QUES && LA11_1<=GE)||LA11_1==DOT||LA11_1==93) ) {
                    alt11=2;
                }
                else if ( ((LA11_1>=ASSIGN && LA11_1<=MINUS_ASSIGN)) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("211:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==STRING||LA11_0==HOST_GROUP||LA11_0==BITWISE_NEGATE||(LA11_0>=NUMBER && LA11_0<=DIR_OUTBOUND)||LA11_0==IFNAME||LA11_0==IPADDR||LA11_0==HOST||(LA11_0>=NET && LA11_0<=SERV_SET)||LA11_0==92) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("211:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:212:7: var= object_name op= assignment_operator assignment_expr
                    {
                    pushFollow(FOLLOW_object_name_in_assignment_expr615);
                    var=object_name();
                    _fsp--;

                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr619);
                    op=assignment_operator();
                    _fsp--;


                    	 		Symbol s = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			Assignment ans = new Assignment(s, input.toString(op.start,op.stop));
                    			map.put(input.toString(var.start,var.stop), ans);
                    			System.out.println("here");
                    	 	
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr630);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:221:6: e= conditional_expr
                    {
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr643);
                    e=conditional_expr();
                    _fsp--;


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
        return ;
    }
    // $ANTLR end assignment_expr


    // $ANTLR start conditional_expr
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:246:2: conditional_expr returns [Symbol sym] : e= logicalOR_expr ( QUES expression COLON conditional_expr )? ;
    public final Symbol conditional_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:247:3: (e= logicalOR_expr ( QUES expression COLON conditional_expr )? )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:247:5: e= logicalOR_expr ( QUES expression COLON conditional_expr )?
            {
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr677);
            e=logicalOR_expr();
            _fsp--;

             sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:248:3: ( QUES expression COLON conditional_expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==QUES) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:248:5: QUES expression COLON conditional_expr
                    {
                    match(input,QUES,FOLLOW_QUES_in_conditional_expr685); 
                    pushFollow(FOLLOW_expression_in_conditional_expr687);
                    expression();
                    _fsp--;

                    match(input,COLON,FOLLOW_COLON_in_conditional_expr689); 
                    pushFollow(FOLLOW_conditional_expr_in_conditional_expr691);
                    conditional_expr();
                    _fsp--;


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
        return sym;
    }
    // $ANTLR end conditional_expr


    // $ANTLR start logicalOR_expr
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:251:2: logicalOR_expr returns [Symbol sym] : e= logicalAND_expr ( LOG_OR logicalAND_expr )* ;
    public final Symbol logicalOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:252:3: (e= logicalAND_expr ( LOG_OR logicalAND_expr )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:252:5: e= logicalAND_expr ( LOG_OR logicalAND_expr )*
            {
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr715);
            e=logicalAND_expr();
            _fsp--;

             sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:253:3: ( LOG_OR logicalAND_expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==LOG_OR) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:253:4: LOG_OR logicalAND_expr
            	    {
            	    match(input,LOG_OR,FOLLOW_LOG_OR_in_logicalOR_expr723); 
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr725);
            	    logicalAND_expr();
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
    // $ANTLR end logicalOR_expr


    // $ANTLR start logicalAND_expr
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:256:2: logicalAND_expr returns [Symbol sym] : e= bitwiseOR_expr ( LOG_AND bitwiseOR_expr )* ;
    public final Symbol logicalAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:257:3: (e= bitwiseOR_expr ( LOG_AND bitwiseOR_expr )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:257:5: e= bitwiseOR_expr ( LOG_AND bitwiseOR_expr )*
            {
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr748);
            e=bitwiseOR_expr();
            _fsp--;

             sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:258:3: ( LOG_AND bitwiseOR_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LOG_AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:258:4: LOG_AND bitwiseOR_expr
            	    {
            	    match(input,LOG_AND,FOLLOW_LOG_AND_in_logicalAND_expr756); 
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr758);
            	    bitwiseOR_expr();
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
    // $ANTLR end logicalAND_expr


    // $ANTLR start bitwiseOR_expr
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:261:2: bitwiseOR_expr returns [Symbol sym] : e= bitwiseAND_expr ( BITWISE_OR bitwiseAND_expr )* ;
    public final Symbol bitwiseOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:262:3: (e= bitwiseAND_expr ( BITWISE_OR bitwiseAND_expr )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:262:5: e= bitwiseAND_expr ( BITWISE_OR bitwiseAND_expr )*
            {
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr782);
            e=bitwiseAND_expr();
            _fsp--;

             sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:263:3: ( BITWISE_OR bitwiseAND_expr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==BITWISE_OR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:263:4: BITWISE_OR bitwiseAND_expr
            	    {
            	    match(input,BITWISE_OR,FOLLOW_BITWISE_OR_in_bitwiseOR_expr790); 
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr792);
            	    bitwiseAND_expr();
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
    // $ANTLR end bitwiseOR_expr


    // $ANTLR start bitwiseAND_expr
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:266:2: bitwiseAND_expr returns [Symbol sym] : e= equality_expr ( BITWISE_AND equality_expr )* ;
    public final Symbol bitwiseAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:267:3: (e= equality_expr ( BITWISE_AND equality_expr )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:267:5: e= equality_expr ( BITWISE_AND equality_expr )*
            {
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr815);
            e=equality_expr();
            _fsp--;

             sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:268:3: ( BITWISE_AND equality_expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==BITWISE_AND) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:268:4: BITWISE_AND equality_expr
            	    {
            	    match(input,BITWISE_AND,FOLLOW_BITWISE_AND_in_bitwiseAND_expr823); 
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr825);
            	    equality_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:271:2: equality_expr returns [Symbol sym] : e= relational_expr ( ( EQUAL_TO | NOT_EQUAL_TO ) relational_expr )* ;
    public final Symbol equality_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:272:3: (e= relational_expr ( ( EQUAL_TO | NOT_EQUAL_TO ) relational_expr )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:272:5: e= relational_expr ( ( EQUAL_TO | NOT_EQUAL_TO ) relational_expr )*
            {
            pushFollow(FOLLOW_relational_expr_in_equality_expr850);
            e=relational_expr();
            _fsp--;

             sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:273:3: ( ( EQUAL_TO | NOT_EQUAL_TO ) relational_expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=EQUAL_TO && LA17_0<=NOT_EQUAL_TO)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:273:5: ( EQUAL_TO | NOT_EQUAL_TO ) relational_expr
            	    {
            	    if ( (input.LA(1)>=EQUAL_TO && input.LA(1)<=NOT_EQUAL_TO) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr859);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expr_in_equality_expr867);
            	    relational_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:276:2: relational_expr returns [Symbol sym] : e= expr ( ( LT | GT | LE | GE ) expr )* ;
    public final Symbol relational_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:277:3: (e= expr ( ( LT | GT | LE | GE ) expr )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:277:5: e= expr ( ( LT | GT | LE | GE ) expr )*
            {
            pushFollow(FOLLOW_expr_in_relational_expr891);
            e=expr();
            _fsp--;

             sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:278:3: ( ( LT | GT | LE | GE ) expr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=LT && LA18_0<=GE)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:278:5: ( LT | GT | LE | GE ) expr
            	    {
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GE) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr902);    throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_in_relational_expr912);
            	    expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:282:2: expr returns [Symbol sym] : e= term ( ( PLUS | MINUS ) term )* ;
    public final Symbol expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:283:3: (e= term ( ( PLUS | MINUS ) term )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:283:5: e= term ( ( PLUS | MINUS ) term )*
            {
            pushFollow(FOLLOW_term_in_expr938);
            e=term();
            _fsp--;

            sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:284:3: ( ( PLUS | MINUS ) term )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=PLUS && LA19_0<=MINUS)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:284:5: ( PLUS | MINUS ) term
            	    {
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr949);    throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr960);
            	    term();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:287:2: term returns [Symbol sym] : e= unary_expr ( ( MULT | DIV ) unary_expr )* ;
    public final Symbol term() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:288:3: (e= unary_expr ( ( MULT | DIV ) unary_expr )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:288:5: e= unary_expr ( ( MULT | DIV ) unary_expr )*
            {
            pushFollow(FOLLOW_unary_expr_in_term986);
            e=unary_expr();
            _fsp--;

            sym = e;
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:289:3: ( ( MULT | DIV ) unary_expr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=MULT && LA20_0<=DIV)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:289:5: ( MULT | DIV ) unary_expr
            	    {
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term997);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unary_expr_in_term1007);
            	    unary_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:292:2: unary_expr returns [Symbol sym] : (e= postfix_expression | BITWISE_NEGATE unary_expr );
    public final Symbol unary_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:293:3: (e= postfix_expression | BITWISE_NEGATE unary_expr )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==STRING||LA21_0==HOST_GROUP||LA21_0==ID||(LA21_0>=NUMBER && LA21_0<=DIR_OUTBOUND)||LA21_0==IFNAME||LA21_0==IPADDR||LA21_0==HOST||(LA21_0>=NET && LA21_0<=SERV_SET)||LA21_0==92) ) {
                alt21=1;
            }
            else if ( (LA21_0==BITWISE_NEGATE) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("292:2: unary_expr returns [Symbol sym] : (e= postfix_expression | BITWISE_NEGATE unary_expr );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:293:5: e= postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr1033);
                    e=postfix_expression();
                    _fsp--;

                    sym = e;

                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:294:5: BITWISE_NEGATE unary_expr
                    {
                    match(input,BITWISE_NEGATE,FOLLOW_BITWISE_NEGATE_in_unary_expr1041); 
                    pushFollow(FOLLOW_unary_expr_in_unary_expr1043);
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:299:2: postfix_expression returns [Symbol sym] : e= factor ( '.' ID )* ;
    public final Symbol postfix_expression() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:300:3: (e= factor ( '.' ID )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:300:5: e= factor ( '.' ID )*
            {
            pushFollow(FOLLOW_factor_in_postfix_expression1070);
            e=factor();
            _fsp--;

            // /home/sambuddho/plt_project/chitra_lancom/Block.g:300:14: ( '.' ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==DOT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:300:15: '.' ID
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression1073); 
            	    match(input,ID,FOLLOW_ID_in_postfix_expression1074); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:303:2: assignment_operator : ( ASSIGN | MULT_ASSIGN | DIV_ASSIGN | ADD_ASSIGN | MINUS_ASSIGN );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:304:3: ( ASSIGN | MULT_ASSIGN | DIV_ASSIGN | ADD_ASSIGN | MINUS_ASSIGN )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:
            {
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=MINUS_ASSIGN) ) {
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:311:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );
    public final Symbol factor() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:313:2: ( ID | e= literal | '(' expression ')' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt23=1;
                }
                break;
            case STRING:
            case HOST_GROUP:
            case NUMBER:
            case CHAR:
            case DIR_INBOUND:
            case DIR_OUTBOUND:
            case IFNAME:
            case IPADDR:
            case HOST:
            case NET:
            case SERV_SET:
                {
                alt23=2;
                }
                break;
            case 92:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("311:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:313:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor1137); 

                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:314:5: e= literal
                    {
                    pushFollow(FOLLOW_literal_in_factor1145);
                    e=literal();
                    _fsp--;

                    sym = e;

                    }
                    break;
                case 3 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:315:5: '(' expression ')'
                    {
                    match(input,92,FOLLOW_92_in_factor1154); 
                    pushFollow(FOLLOW_expression_in_factor1156);
                    expression();
                    _fsp--;

                    match(input,93,FOLLOW_93_in_factor1158); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:318:2: literal returns [Symbol sym] : e= object_values ;
    public final Symbol literal() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:319:3: (e= object_values )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:319:5: e= object_values
            {
            pushFollow(FOLLOW_object_values_in_literal1180);
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:322:1: declr_stmt : type_name var= object_name ( COMMA next_var= object_name )* ';' ;
    public final void declr_stmt() throws RecognitionException {
        object_name_return var = null;

        object_name_return next_var = null;

        type_name_return type_name2 = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:323:2: ( type_name var= object_name ( COMMA next_var= object_name )* ';' )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:324:2: type_name var= object_name ( COMMA next_var= object_name )* ';'
            {
            pushFollow(FOLLOW_type_name_in_declr_stmt1195);
            type_name2=type_name();
            _fsp--;

            pushFollow(FOLLOW_object_name_in_declr_stmt1199);
            var=object_name();
            _fsp--;


            		currentScope.defineSymbol(input.toString(var.start,var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:328:2: ( COMMA next_var= object_name )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:328:3: COMMA next_var= object_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_declr_stmt1206); 
            	    pushFollow(FOLLOW_object_name_in_declr_stmt1210);
            	    next_var=object_name();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            		currentScope.defineSymbol(input.toString(next_var.start,next_var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declr_stmt1219); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:340:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | route | interface );
    public final Symbol object_values() throws RecognitionException {
        Symbol sym = null;

        Symbol int_value3 = null;


        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:341:2: ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | route | interface )
            int alt25=12;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:341:4: char_value
                    {
                    pushFollow(FOLLOW_char_value_in_object_values1252);
                    char_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:342:4: int_value
                    {
                    pushFollow(FOLLOW_int_value_in_object_values1258);
                    int_value3=int_value();
                    _fsp--;


                    	/* Sambuddho :  This thing will be repeated for all types.
                    	   The types are not there so I am waiting for them to ready
                    	*/
                    		sym = int_value3;
                    	

                    }
                    break;
                case 3 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:349:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_object_values1267); 

                    }
                    break;
                case 4 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:350:4: ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_object_values1272);
                    ip_addr();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:351:4: policy
                    {
                    pushFollow(FOLLOW_policy_in_object_values1277);
                    policy();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:352:4: host
                    {
                    pushFollow(FOLLOW_host_in_object_values1282);
                    host();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:353:4: role
                    {
                    pushFollow(FOLLOW_role_in_object_values1287);
                    role();
                    _fsp--;


                    }
                    break;
                case 8 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:354:4: host_group
                    {
                    pushFollow(FOLLOW_host_group_in_object_values1292);
                    host_group();
                    _fsp--;


                    }
                    break;
                case 9 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:355:4: topology
                    {
                    pushFollow(FOLLOW_topology_in_object_values1297);
                    topology();
                    _fsp--;


                    }
                    break;
                case 10 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:356:4: serv_group
                    {
                    pushFollow(FOLLOW_serv_group_in_object_values1302);
                    serv_group();
                    _fsp--;


                    }
                    break;
                case 11 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:357:4: route
                    {
                    pushFollow(FOLLOW_route_in_object_values1307);
                    route();
                    _fsp--;


                    }
                    break;
                case 12 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:358:4: interface
                    {
                    pushFollow(FOLLOW_interface_in_object_values1312);
                    interface();
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:362:1: type_name : ( TOPOLOGY_TYPE_NAME | HOST_TYPE_NAME | HOST_GROUP_TYPE_NAME | SERVICE_GROUP_TYPE_NAME | ROLE_GROUP_TYPE_NAME | POLICY_TYPE_NAME | ROUTE_TYPE_NAME | INTERFACE_TYPE_NAME | IP_ADDR_TYPE_NAME | INT_TYPE_NAME | CHAR_TYPE_NAME );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:363:2: ( TOPOLOGY_TYPE_NAME | HOST_TYPE_NAME | HOST_GROUP_TYPE_NAME | SERVICE_GROUP_TYPE_NAME | ROLE_GROUP_TYPE_NAME | POLICY_TYPE_NAME | ROUTE_TYPE_NAME | INTERFACE_TYPE_NAME | IP_ADDR_TYPE_NAME | INT_TYPE_NAME | CHAR_TYPE_NAME )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:
            {
            if ( (input.LA(1)>=TOPOLOGY_TYPE_NAME && input.LA(1)<=CHAR_TYPE_NAME) ) {
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:376:1: role : policy ( COMMA policy )* ;
    public final void role() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:376:7: ( policy ( COMMA policy )* )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:376:9: policy ( COMMA policy )*
            {
            pushFollow(FOLLOW_policy_in_role1409);
            policy();
            _fsp--;

            // /home/sambuddho/plt_project/chitra_lancom/Block.g:376:16: ( COMMA policy )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:376:17: COMMA policy
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_role1412); 
            	    pushFollow(FOLLOW_policy_in_role1414);
            	    policy();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:379:1: policy : ( direction verdict proto ip_addr NETMASK ip_addr ( port )? | direction verdict ip_addr NETMASK ip_addr icmp_cntrl_message );
    public final void policy() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:379:33: ( direction verdict proto ip_addr NETMASK ip_addr ( port )? | direction verdict ip_addr NETMASK ip_addr icmp_cntrl_message )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=DIR_INBOUND && LA28_0<=DIR_OUTBOUND)) ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>=VERD_ALLOW && LA28_1<=VERD_DENY)) ) {
                    int LA28_2 = input.LA(3);

                    if ( (LA28_2==ID||LA28_2==NUMBER) ) {
                        alt28=2;
                    }
                    else if ( ((LA28_2>=PROTO_UDP && LA28_2<=PROTO_TCP)) ) {
                        alt28=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("379:1: policy : ( direction verdict proto ip_addr NETMASK ip_addr ( port )? | direction verdict ip_addr NETMASK ip_addr icmp_cntrl_message );", 28, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("379:1: policy : ( direction verdict proto ip_addr NETMASK ip_addr ( port )? | direction verdict ip_addr NETMASK ip_addr icmp_cntrl_message );", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("379:1: policy : ( direction verdict proto ip_addr NETMASK ip_addr ( port )? | direction verdict ip_addr NETMASK ip_addr icmp_cntrl_message );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:379:35: direction verdict proto ip_addr NETMASK ip_addr ( port )?
                    {
                    pushFollow(FOLLOW_direction_in_policy1428);
                    direction();
                    _fsp--;

                    pushFollow(FOLLOW_verdict_in_policy1430);
                    verdict();
                    _fsp--;

                    pushFollow(FOLLOW_proto_in_policy1432);
                    proto();
                    _fsp--;

                    pushFollow(FOLLOW_ip_addr_in_policy1434);
                    ip_addr();
                    _fsp--;

                    match(input,NETMASK,FOLLOW_NETMASK_in_policy1436); 
                    pushFollow(FOLLOW_ip_addr_in_policy1438);
                    ip_addr();
                    _fsp--;

                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:379:84: ( port )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NUMBER) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/sambuddho/plt_project/chitra_lancom/Block.g:379:85: port
                            {
                            pushFollow(FOLLOW_port_in_policy1442);
                            port();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:393:5: direction verdict ip_addr NETMASK ip_addr icmp_cntrl_message
                    {
                    pushFollow(FOLLOW_direction_in_policy1503);
                    direction();
                    _fsp--;

                    pushFollow(FOLLOW_verdict_in_policy1505);
                    verdict();
                    _fsp--;

                    pushFollow(FOLLOW_ip_addr_in_policy1508);
                    ip_addr();
                    _fsp--;

                    match(input,NETMASK,FOLLOW_NETMASK_in_policy1510); 
                    pushFollow(FOLLOW_ip_addr_in_policy1512);
                    ip_addr();
                    _fsp--;

                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy1514);
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:396:1: topology : ( ( host_group ) role | ( serv_group ) role );
    public final void topology() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:396:9: ( ( host_group ) role | ( serv_group ) role )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==HOST_GROUP) ) {
                alt29=1;
            }
            else if ( (LA29_0==SERV_SET) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("396:1: topology : ( ( host_group ) role | ( serv_group ) role );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:396:11: ( host_group ) role
                    {
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:396:11: ( host_group )
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:396:12: host_group
                    {
                    pushFollow(FOLLOW_host_group_in_topology1526);
                    host_group();
                    _fsp--;


                    }

                    pushFollow(FOLLOW_role_in_topology1529);
                    role();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:397:4: ( serv_group ) role
                    {
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:397:4: ( serv_group )
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:397:5: serv_group
                    {
                    pushFollow(FOLLOW_serv_group_in_topology1535);
                    serv_group();
                    _fsp--;


                    }

                    pushFollow(FOLLOW_role_in_topology1538);
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:401:1: int_value returns [Symbol sym] : e= NUMBER ;
    public final Symbol int_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:402:2: (e= NUMBER )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:402:4: e= NUMBER
            {
            e=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_int_value1558); 

            			Integer v = Integer.parseInt(e.getText());
            			IntType temp = new IntType(v);
            			Symbol s = new Symbol("literal", "int_type_t", temp);
            			sym = s;
            		/* Sambuddho : Might not need this
            	          already there in the generated code */
            		// return sym;
            		

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:415:1: char_value : CHAR ;
    public final void char_value() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:416:2: ( CHAR )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:416:4: CHAR
            {
            match(input,CHAR,FOLLOW_CHAR_in_char_value1577); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:427:1: direction : ( DIR_INBOUND | DIR_OUTBOUND );
    public final void direction() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:428:2: ( DIR_INBOUND | DIR_OUTBOUND )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:
            {
            if ( (input.LA(1)>=DIR_INBOUND && input.LA(1)<=DIR_OUTBOUND) ) {
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:432:1: verdict : ( VERD_ALLOW | VERD_DENY );
    public final void verdict() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:432:9: ( VERD_ALLOW | VERD_DENY )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:
            {
            if ( (input.LA(1)>=VERD_ALLOW && input.LA(1)<=VERD_DENY) ) {
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:436:1: proto : ( PROTO_UDP | PROTO_TCP );
    public final void proto() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:436:9: ( PROTO_UDP | PROTO_TCP )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:
            {
            if ( (input.LA(1)>=PROTO_UDP && input.LA(1)<=PROTO_TCP) ) {
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:439:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final void icmp_cntrl_message() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:440:2: ( ICMP_MESSAGE_TYPE )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:440:4: ICMP_MESSAGE_TYPE
            {
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1655); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:443:1: port : NUMBER ;
    public final void port() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:443:6: ( NUMBER )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:443:8: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_port1665); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:446:1: object_name : ID ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:447:2: ( ID )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:447:4: ID
            {
            match(input,ID,FOLLOW_ID_in_object_name1675); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:453:1: interface_name : IFNAME ( ID ) CARD_ID NUMBER ( '/' NUMBER )? ;
    public final void interface_name() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:454:1: ( IFNAME ( ID ) CARD_ID NUMBER ( '/' NUMBER )? )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:454:5: IFNAME ( ID ) CARD_ID NUMBER ( '/' NUMBER )?
            {
            match(input,IFNAME,FOLLOW_IFNAME_in_interface_name1690); 
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:454:12: ( ID )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:454:13: ID
            {
            match(input,ID,FOLLOW_ID_in_interface_name1693); 

            }

            match(input,CARD_ID,FOLLOW_CARD_ID_in_interface_name1696); 
            match(input,NUMBER,FOLLOW_NUMBER_in_interface_name1699); 
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:454:33: ( '/' NUMBER )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==DIV) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:454:34: '/' NUMBER
                    {
                    match(input,DIV,FOLLOW_DIV_in_interface_name1702); 
                    match(input,NUMBER,FOLLOW_NUMBER_in_interface_name1704); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:458:1: ip_addr : ( ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) | object_name );
    public final void ip_addr() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:1: ( ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) | object_name )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==NUMBER) ) {
                alt31=1;
            }
            else if ( (LA31_0==ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("458:1: ip_addr : ( ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) | object_name );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:2: ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER )
                    {
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:2: ( NUMBER )
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:3: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1718); 

                    }

                    match(input,DOT,FOLLOW_DOT_in_ip_addr1720); 
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:13: ( NUMBER )
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:14: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1722); 

                    }

                    match(input,DOT,FOLLOW_DOT_in_ip_addr1724); 
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:24: ( NUMBER )
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:25: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1726); 

                    }

                    match(input,DOT,FOLLOW_DOT_in_ip_addr1728); 
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:35: ( NUMBER )
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:459:36: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1730); 

                    }


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:469:3: object_name
                    {
                    pushFollow(FOLLOW_object_name_in_ip_addr1759);
                    object_name();
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
    // $ANTLR end ip_addr


    // $ANTLR start host
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:474:1: host : ( IPADDR ip_addr NETMASK ip_addr | object_name );
    public final void host() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:474:31: ( IPADDR ip_addr NETMASK ip_addr | object_name )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IPADDR) ) {
                alt32=1;
            }
            else if ( (LA32_0==ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("474:1: host : ( IPADDR ip_addr NETMASK ip_addr | object_name );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:474:33: IPADDR ip_addr NETMASK ip_addr
                    {
                    match(input,IPADDR,FOLLOW_IPADDR_in_host1775); 
                    pushFollow(FOLLOW_ip_addr_in_host1777);
                    ip_addr();
                    _fsp--;

                    match(input,NETMASK,FOLLOW_NETMASK_in_host1779); 
                    pushFollow(FOLLOW_ip_addr_in_host1781);
                    ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:483:3: object_name
                    {
                    pushFollow(FOLLOW_object_name_in_host1796);
                    object_name();
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
    // $ANTLR end host


    // $ANTLR start interface
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:1: interface : interface_name ip_addr NETMASK ip_addr ( DNS '{' ip_addr ( ',' ip_addr )* '}' )? ( GATEWAY '{' ip_addr ( ',' ip_addr )* '}' )? ;
    public final void interface() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:11: ( interface_name ip_addr NETMASK ip_addr ( DNS '{' ip_addr ( ',' ip_addr )* '}' )? ( GATEWAY '{' ip_addr ( ',' ip_addr )* '}' )? )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:13: interface_name ip_addr NETMASK ip_addr ( DNS '{' ip_addr ( ',' ip_addr )* '}' )? ( GATEWAY '{' ip_addr ( ',' ip_addr )* '}' )?
            {
            pushFollow(FOLLOW_interface_name_in_interface1811);
            interface_name();
            _fsp--;

            pushFollow(FOLLOW_ip_addr_in_interface1813);
            ip_addr();
            _fsp--;

            match(input,NETMASK,FOLLOW_NETMASK_in_interface1815); 
            pushFollow(FOLLOW_ip_addr_in_interface1817);
            ip_addr();
            _fsp--;

            // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:52: ( DNS '{' ip_addr ( ',' ip_addr )* '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==DNS) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:54: DNS '{' ip_addr ( ',' ip_addr )* '}'
                    {
                    match(input,DNS,FOLLOW_DNS_in_interface1821); 
                    match(input,94,FOLLOW_94_in_interface1824); 
                    pushFollow(FOLLOW_ip_addr_in_interface1826);
                    ip_addr();
                    _fsp--;

                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:71: ( ',' ip_addr )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==COMMA) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:72: ',' ip_addr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_interface1829); 
                    	    pushFollow(FOLLOW_ip_addr_in_interface1832);
                    	    ip_addr();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    match(input,95,FOLLOW_95_in_interface1836); 

                    }
                    break;

            }

            // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:95: ( GATEWAY '{' ip_addr ( ',' ip_addr )* '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==GATEWAY) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:97: GATEWAY '{' ip_addr ( ',' ip_addr )* '}'
                    {
                    match(input,GATEWAY,FOLLOW_GATEWAY_in_interface1844); 
                    match(input,94,FOLLOW_94_in_interface1846); 
                    pushFollow(FOLLOW_ip_addr_in_interface1848);
                    ip_addr();
                    _fsp--;

                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:117: ( ',' ip_addr )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==COMMA) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:490:118: ',' ip_addr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_interface1851); 
                    	    pushFollow(FOLLOW_ip_addr_in_interface1854);
                    	    ip_addr();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match(input,95,FOLLOW_95_in_interface1858); 

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
    // $ANTLR end interface


    // $ANTLR start route
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:491:1: route : ( HOST ip_addr GW ip_addr | NET ip_addr NETMASK ip_addr GW ip_addr );
    public final void route() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:491:7: ( HOST ip_addr GW ip_addr | NET ip_addr NETMASK ip_addr GW ip_addr )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==HOST) ) {
                alt37=1;
            }
            else if ( (LA37_0==NET) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("491:1: route : ( HOST ip_addr GW ip_addr | NET ip_addr NETMASK ip_addr GW ip_addr );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:491:9: HOST ip_addr GW ip_addr
                    {
                    match(input,HOST,FOLLOW_HOST_in_route1869); 
                    pushFollow(FOLLOW_ip_addr_in_route1871);
                    ip_addr();
                    _fsp--;

                    match(input,GW,FOLLOW_GW_in_route1873); 
                    pushFollow(FOLLOW_ip_addr_in_route1875);
                    ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:492:4: NET ip_addr NETMASK ip_addr GW ip_addr
                    {
                    match(input,NET,FOLLOW_NET_in_route1880); 
                    pushFollow(FOLLOW_ip_addr_in_route1882);
                    ip_addr();
                    _fsp--;

                    match(input,NETMASK,FOLLOW_NETMASK_in_route1884); 
                    pushFollow(FOLLOW_ip_addr_in_route1886);
                    ip_addr();
                    _fsp--;

                    match(input,GW,FOLLOW_GW_in_route1888); 
                    pushFollow(FOLLOW_ip_addr_in_route1891);
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
        return ;
    }
    // $ANTLR end route


    // $ANTLR start host_group
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:496:1: host_group : HOST_GROUP '{' host ( ',' host )* '}' ;
    public final void host_group() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:497:2: ( HOST_GROUP '{' host ( ',' host )* '}' )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:497:4: HOST_GROUP '{' host ( ',' host )* '}'
            {
            match(input,HOST_GROUP,FOLLOW_HOST_GROUP_in_host_group1903); 
            match(input,94,FOLLOW_94_in_host_group1905); 
            pushFollow(FOLLOW_host_in_host_group1907);
            host();
            _fsp--;

            // /home/sambuddho/plt_project/chitra_lancom/Block.g:497:24: ( ',' host )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:497:25: ',' host
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_host_group1910); 
            	    pushFollow(FOLLOW_host_in_host_group1912);
            	    host();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            match(input,95,FOLLOW_95_in_host_group1916); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:500:1: serv_descr : ip_addr ( NETMASK ip_addr )? serv_listen_port ;
    public final void serv_descr() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:501:2: ( ip_addr ( NETMASK ip_addr )? serv_listen_port )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:501:4: ip_addr ( NETMASK ip_addr )? serv_listen_port
            {
            pushFollow(FOLLOW_ip_addr_in_serv_descr1935);
            ip_addr();
            _fsp--;

            // /home/sambuddho/plt_project/chitra_lancom/Block.g:501:12: ( NETMASK ip_addr )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==NETMASK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/sambuddho/plt_project/chitra_lancom/Block.g:501:13: NETMASK ip_addr
                    {
                    match(input,NETMASK,FOLLOW_NETMASK_in_serv_descr1938); 
                    pushFollow(FOLLOW_ip_addr_in_serv_descr1940);
                    ip_addr();
                    _fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_serv_listen_port_in_serv_descr1944);
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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:503:1: serv_group : SERV_SET '{' serv_descr ( ',' serv_descr )* '}' ;
    public final void serv_group() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:504:2: ( SERV_SET '{' serv_descr ( ',' serv_descr )* '}' )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:504:4: SERV_SET '{' serv_descr ( ',' serv_descr )* '}'
            {
            match(input,SERV_SET,FOLLOW_SERV_SET_in_serv_group1953); 
            match(input,94,FOLLOW_94_in_serv_group1955); 
            pushFollow(FOLLOW_serv_descr_in_serv_group1957);
            serv_descr();
            _fsp--;

            // /home/sambuddho/plt_project/chitra_lancom/Block.g:504:28: ( ',' serv_descr )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/sambuddho/plt_project/chitra_lancom/Block.g:504:29: ',' serv_descr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_serv_group1960); 
            	    pushFollow(FOLLOW_serv_descr_in_serv_group1962);
            	    serv_descr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            match(input,95,FOLLOW_95_in_serv_group1966); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:508:1: serv_listen_port : ( NUMBER ) ;
    public final void serv_listen_port() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:509:2: ( ( NUMBER ) )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:509:4: ( NUMBER )
            {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:509:4: ( NUMBER )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:509:5: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port1982); 

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
    // /home/sambuddho/plt_project/chitra_lancom/Block.g:510:1: host_name : ID ;
    public final void host_name() throws RecognitionException {
        try {
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:511:2: ( ID )
            // /home/sambuddho/plt_project/chitra_lancom/Block.g:511:4: ID
            {
            match(input,ID,FOLLOW_ID_in_host_name1991); 

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


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\u0085\uffff";
    static final String DFA25_eofS =
        "\u0085\uffff";
    static final String DFA25_minS =
        "\1\21\1\uffff\1\4\2\uffff\1\106\1\uffff\2\136\2\uffff\1\57\1\uffff"+
        "\3\57\1\115\1\101\2\57\1\65\1\115\1\101\1\102\1\57\1\115\1\101\1"+
        "\115\1\101\1\57\1\4\1\102\1\57\1\65\2\115\1\112\1\102\1\57\1\102"+
        "\2\57\1\65\2\uffff\2\115\1\102\1\57\1\4\2\102\1\uffff\2\115\1\uffff"+
        "\2\115\1\65\1\115\1\101\2\102\1\115\1\101\1\uffff\2\115\5\102\1"+
        "\57\2\115\1\102\1\57\1\65\2\102\6\115\1\65\2\102\2\115\1\102\1\101"+
        "\1\115\6\102\1\101\1\115\3\102\1\101\1\115\1\101\3\115\1\102\2\115"+
        "\1\112\7\102\1\uffff\1\65\1\101\1\115\1\101\1\115\2\102\1\65\1\102";
    static final String DFA25_maxS =
        "\1\124\1\uffff\1\135\2\uffff\1\107\1\uffff\2\136\2\uffff\1\102\1"+
        "\uffff\1\111\1\116\1\102\1\115\1\101\2\102\1\137\1\115\3\102\1\115"+
        "\1\101\1\115\1\101\1\116\1\135\2\102\1\137\2\115\1\112\5\102\1\137"+
        "\2\uffff\2\115\2\102\1\135\2\102\1\uffff\2\115\1\uffff\2\115\1\137"+
        "\1\115\1\101\2\102\1\115\1\102\1\uffff\2\115\6\102\2\115\2\102\1"+
        "\137\2\102\6\115\1\137\2\102\2\115\1\102\1\101\1\115\7\102\1\115"+
        "\3\102\1\101\1\115\1\101\3\115\1\102\2\115\1\112\7\102\1\uffff\1"+
        "\137\1\101\1\115\1\102\1\115\2\102\1\137\1\102";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\6\2\uffff\1\13\1\14\1\uffff"+
        "\1\2\36\uffff\1\11\1\10\7\uffff\1\5\2\uffff\1\5\11\uffff\1\12\71"+
        "\uffff\1\5\11\uffff";
    static final String DFA25_specialS =
        "\u0085\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\6\uffff\1\7\26\uffff\1\4\22\uffff\1\2\1\1\2\5\5\uffff\1"+
            "\12\2\uffff\1\6\2\uffff\1\11\1\uffff\1\11\1\10",
            "",
            "\4\14\2\uffff\1\14\27\uffff\14\14\37\uffff\1\13\17\uffff\1\14",
            "",
            "",
            "\2\15",
            "",
            "\1\16",
            "\1\17",
            "",
            "",
            "\1\14\22\uffff\1\4",
            "",
            "\1\21\22\uffff\1\20\5\uffff\2\22",
            "\1\24\36\uffff\1\23",
            "\1\26\22\uffff\1\25",
            "\1\27",
            "\1\30",
            "\1\32\22\uffff\1\31",
            "\1\34\22\uffff\1\33",
            "\1\35\51\uffff\1\36",
            "\1\37",
            "\1\40\1\41",
            "\1\42",
            "\1\44\22\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\52\36\uffff\1\51",
            "\4\54\2\uffff\1\54\27\uffff\14\54\26\uffff\2\53\7\uffff\1\54"+
            "\17\uffff\1\54",
            "\1\55",
            "\1\57\22\uffff\1\56",
            "\1\60\51\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\67\22\uffff\1\66",
            "\1\70",
            "\1\72\22\uffff\1\71",
            "\1\74\22\uffff\1\73",
            "\1\35\51\uffff\1\36",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\41",
            "\1\100\22\uffff\1\77",
            "\4\101\2\uffff\1\101\27\uffff\14\101\26\uffff\2\53\7\uffff\1"+
            "\101\17\uffff\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\35\51\uffff\1\36",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\127\22\uffff\1\126",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\134\22\uffff\1\133",
            "\1\60\51\uffff\1\61",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\35\51\uffff\1\36",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\116",
            "\1\30",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\40\1\41",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\46",
            "\1\164",
            "\1\50",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\64",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\41",
            "\1\177",
            "\1\u0080",
            "",
            "\1\35\51\uffff\1\36",
            "\1\111",
            "\1\u0081",
            "\1\115\1\116",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\35\51\uffff\1\36",
            "\1\116"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "340:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | route | interface );";
        }
    }
 

    public static final BitSet FOLLOW_PROG_BEGIN_in_prog73 = new BitSet(new long[]{0xFFC0C0021D2F4C00L,0x00000000101A483DL});
    public static final BitSet FOLLOW_statement_list_in_prog75 = new BitSet(new long[]{0xFFC0C0021D2F4E00L,0x00000000101A483DL});
    public static final BitSet FOLLOW_PROG_END_in_prog78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declr_stmt_in_statement_list97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_statement_in_statement112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_expr_in_statement124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_statement_in_statement130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statement_expr146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement_expr153 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_statement_expr155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_condition_statement171 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_condition_statement173 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_equality_expr_in_condition_statement175 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_condition_statement177 = new BitSet(new long[]{0xFFC0C0021D2F4C00L,0x00000000101A483DL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement179 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ELSE_in_condition_statement182 = new BitSet(new long[]{0xFFC0C0021D2F4C00L,0x00000000101A483DL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement184 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDIF_in_condition_statement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement204 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_iteration_statement206 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement208 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_iteration_statement210 = new BitSet(new long[]{0xFFC0C0021D2F4C00L,0x00000000101A483DL});
    public static final BitSet FOLLOW_statement_list_in_iteration_statement212 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDWHILE_in_iteration_statement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ECHO_in_print_statement230 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_STRING_in_print_statement232 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_print_statement236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_statement_in_expression259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_oper_in_config_statement274 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_oper_in_config_statement282 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_route_in_config_statement284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFCONFIG_in_config_statement291 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFCONFIG_in_config_statement299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_interface_in_config_statement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_config_statement307 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TOPOLOGY_in_config_statement309 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_config_statement317 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TOPOLOGY_in_config_statement319 = new BitSet(new long[]{0x0000000001000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_topology_in_config_statement321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDO_in_config_statement327 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TOPOLOGY_in_config_statement329 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDO_in_config_statement338 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TOPOLOGY_in_config_statement340 = new BitSet(new long[]{0x0000000001000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_topology_in_config_statement342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement348 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement350 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement382 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_role_in_config_statement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_config_statement392 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement394 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_config_statement402 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_role_in_config_statement406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDO_in_config_statement412 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement414 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDO_in_config_statement422 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_role_in_config_statement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_config_statement432 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_POLICY_in_config_statement434 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPLY_in_config_statement442 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_policy_in_config_statement446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDO_in_config_statement452 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement454 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDO_in_config_statement462 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ROLE_in_config_statement464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_policy_in_config_statement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement472 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_HOST_GROUP_in_config_statement474 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_host_group_in_config_statement476 = new BitSet(new long[]{0x0000800000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_host_in_config_statement478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement484 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SERV_GROUP_in_config_statement486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_serv_group_in_config_statement488 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_serv_descr_in_config_statement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_display_in_config_statement497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUTE_in_route_oper513 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ADD_in_route_oper515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUTE_in_route_oper521 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_DELETE_in_route_oper523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_set_oper539 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TO_in_set_oper541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_set_oper547 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_FROM_in_set_oper549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUTE_in_config_display569 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SHOW_in_config_display571 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NUMERIC_in_config_display573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUTE_in_config_display577 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SHOW_in_config_display579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FW_in_config_display585 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SHOW_in_config_display587 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NUMERIC_in_config_display589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FW_in_config_display593 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SHOW_in_config_display595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr615 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr619 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr677 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_QUES_in_conditional_expr685 = new BitSet(new long[]{0x0000C0021D2E0000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_expression_in_conditional_expr687 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_COLON_in_conditional_expr689 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_conditional_expr_in_conditional_expr691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr715 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LOG_OR_in_logicalOR_expr723 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr725 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr748 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LOG_AND_in_logicalAND_expr756 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr758 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr782 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_BITWISE_OR_in_bitwiseOR_expr790 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr792 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr815 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_BITWISE_AND_in_bitwiseAND_expr823 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr825 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr850 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr859 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr867 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr891 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr902 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_expr_in_relational_expr912 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_term_in_expr938 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr949 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_term_in_expr960 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term986 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term997 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_unary_expr_in_term1007 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISE_NEGATE_in_unary_expr1041 = new BitSet(new long[]{0x0000C00001020000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression1070 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1073 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_postfix_expression1074 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_factor1154 = new BitSet(new long[]{0x0000C0021D2E0000L,0x00000000101A483CL});
    public static final BitSet FOLLOW_expression_in_factor1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_factor1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt1195 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1199 = new BitSet(new long[]{0x0020000000000400L});
    public static final BitSet FOLLOW_COMMA_in_declr_stmt1206 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1210 = new BitSet(new long[]{0x0020000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_declr_stmt1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_object_values1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_role_in_object_values1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_in_object_values1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_in_object_values1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_role1409 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_COMMA_in_role1412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_policy_in_role1414 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1428 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_verdict_in_policy1430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_proto_in_policy1432 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_policy1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NETMASK_in_policy1436 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_policy1438 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_port_in_policy1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1503 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_verdict_in_policy1505 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_policy1508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NETMASK_in_policy1510 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_policy1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_topology1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_role_in_topology1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_topology1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_role_in_topology1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_verdict0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_name1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFNAME_in_interface_name1690 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_interface_name1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_CARD_ID_in_interface_name1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_interface_name1699 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DIV_in_interface_name1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_interface_name1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_ip_addr1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IPADDR_in_host1775 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_host1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NETMASK_in_host1779 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_host1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_host1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_name_in_interface1811 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_interface1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NETMASK_in_interface1815 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_interface1817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_DNS_in_interface1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_interface1824 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_interface1826 = new BitSet(new long[]{0x0020000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_interface1829 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_interface1832 = new BitSet(new long[]{0x0020000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_interface1836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_GATEWAY_in_interface1844 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_interface1846 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_interface1848 = new BitSet(new long[]{0x0020000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_interface1851 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_interface1854 = new BitSet(new long[]{0x0020000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_interface1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOST_in_route1869 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_route1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_GW_in_route1873 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_route1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NET_in_route1880 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_route1882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NETMASK_in_route1884 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_route1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_GW_in_route1888 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_route1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOST_GROUP_in_host_group1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_host_group1905 = new BitSet(new long[]{0x0000800000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_host_in_host_group1907 = new BitSet(new long[]{0x0020000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_host_group1910 = new BitSet(new long[]{0x0000800000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_host_in_host_group1912 = new BitSet(new long[]{0x0020000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_host_group1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_serv_descr1935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_NETMASK_in_serv_descr1938 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ip_addr_in_serv_descr1940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_descr1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SERV_SET_in_serv_group1953 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_serv_group1955 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_serv_descr_in_serv_group1957 = new BitSet(new long[]{0x0020000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_serv_group1960 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_serv_descr_in_serv_group1962 = new BitSet(new long[]{0x0020000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_serv_group1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name1991 = new BitSet(new long[]{0x0000000000000002L});

}