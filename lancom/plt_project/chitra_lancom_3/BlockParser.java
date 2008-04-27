// $ANTLR 3.0.1 D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g 2008-04-27 11:05:33

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

public class BlockParser extends Parser {
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

        public BlockParser(TokenStream input) {
            super(input);
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
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:51:2: ( 'prog' ( statement_list )+ 'endprog' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:51:4: 'prog' ( statement_list )+ 'endprog'
            {
            match(input,22,FOLLOW_22_in_prog83); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:51:11: ( statement_list )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER||(LA1_0>=STRING && LA1_0<=ID)||LA1_0==CHAR||(LA1_0>=24 && LA1_0<=26)||(LA1_0>=28 && LA1_0<=29)||(LA1_0>=31 && LA1_0<=34)||(LA1_0>=39 && LA1_0<=41)||LA1_0==45||LA1_0==47||LA1_0==60||(LA1_0>=65 && LA1_0<=75)||(LA1_0>=79 && LA1_0<=80)||(LA1_0>=85 && LA1_0<=86)||(LA1_0>=89 && LA1_0<=91)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:51:11: statement_list
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:54:2: statement_list : ( statement | declr_stmt );
    public final void statement_list() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:55:3: ( statement | declr_stmt )
            int alt2=2;
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

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:55:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_statement_list104);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:56:6: declr_stmt
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:59:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:60:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt3=4;
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

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:60:5: condition_statement
                    {
                    pushFollow(FOLLOW_condition_statement_in_statement126);
                    condition_statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:61:5: iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement132);
                    iteration_statement();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:62:5: statement_expr
                    {
                    pushFollow(FOLLOW_statement_expr_in_statement138);
                    statement_expr();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:63:5: print_statement
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );
    public final void statement_expr() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:67:3: ( ';' | expression ';' | config_statement ';' )
            int alt4=3;
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

                                            if ( (LA4_38==88) ) {
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

                                                                            if ( ((LA4_46>=PLUS && LA4_46<=DIV)||LA4_46==DOT||LA4_46==24||LA4_46==48||(LA4_46>=50 && LA4_46<=59)) ) {
                                                                                alt4=2;
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 46, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 43, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 39, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 34, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 28, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 23, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 17, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else if ( (LA4_13==ID) ) {
                                                    int LA4_18 = input.LA(11);

                                                    if ( ((LA4_18>=PLUS && LA4_18<=DIV)||LA4_18==DOT||LA4_18==24||LA4_18==48||(LA4_18>=50 && LA4_18<=59)) ) {
                                                        alt4=2;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 18, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 13, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 38, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 33, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 27, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 22, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 12, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 8, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_4==ID) ) {
                    int LA4_9 = input.LA(3);

                    if ( (LA4_9==88) ) {
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

                                                    if ( ((LA4_46>=PLUS && LA4_46<=DIV)||LA4_46==DOT||LA4_46==24||LA4_46==48||(LA4_46>=50 && LA4_46<=59)) ) {
                                                        alt4=2;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 46, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 43, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 39, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 34, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 28, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 23, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 17, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA4_13==ID) ) {
                            int LA4_18 = input.LA(5);

                            if ( ((LA4_18>=PLUS && LA4_18<=DIV)||LA4_18==DOT||LA4_18==24||LA4_18==48||(LA4_18>=50 && LA4_18<=59)) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 13, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 9, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 90:
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

                                            if ( (LA4_40==78) ) {
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

                                                                            if ( (LA4_47==88) ) {
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

                                                                                                            if ( ((LA4_50>=PLUS && LA4_50<=DIV)||LA4_50==DOT||LA4_50==24||LA4_50==48||(LA4_50>=50 && LA4_50<=59)) ) {
                                                                                                                alt4=2;
                                                                                                            }
                                                                                                            else {
                                                                                                                NoViableAltException nvae =
                                                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                                                throw nvae;
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            NoViableAltException nvae =
                                                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                                            throw nvae;
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        NoViableAltException nvae =
                                                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                                        throw nvae;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    NoViableAltException nvae =
                                                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                                                    throw nvae;
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                NoViableAltException nvae =
                                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                                                throw nvae;
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            NoViableAltException nvae =
                                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                                            throw nvae;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else if ( (LA4_26==ID) ) {
                                                                                    int LA4_32 = input.LA(19);

                                                                                    if ( ((LA4_32>=PLUS && LA4_32<=DIV)||LA4_32==DOT||LA4_32==24||LA4_32==48||(LA4_32>=50 && LA4_32<=59)) ) {
                                                                                        alt4=2;
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 47, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 44, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 41, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 36, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 30, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 25, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 20, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else if ( (LA4_15==ID) ) {
                                                    int LA4_21 = input.LA(11);

                                                    if ( (LA4_21==88) ) {
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

                                                                                    if ( ((LA4_50>=PLUS && LA4_50<=DIV)||LA4_50==DOT||LA4_50==24||LA4_50==48||(LA4_50>=50 && LA4_50<=59)) ) {
                                                                                        alt4=2;
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else if ( (LA4_26==ID) ) {
                                                            int LA4_32 = input.LA(13);

                                                            if ( ((LA4_32>=PLUS && LA4_32<=DIV)||LA4_32==DOT||LA4_32==24||LA4_32==48||(LA4_32>=50 && LA4_32<=59)) ) {
                                                                alt4=2;
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 21, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 15, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 40, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 35, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 29, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 24, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 10, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_5==ID) ) {
                    int LA4_11 = input.LA(3);

                    if ( (LA4_11==78) ) {
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

                                                    if ( (LA4_47==88) ) {
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

                                                                                    if ( ((LA4_50>=PLUS && LA4_50<=DIV)||LA4_50==DOT||LA4_50==24||LA4_50==48||(LA4_50>=50 && LA4_50<=59)) ) {
                                                                                        alt4=2;
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else if ( (LA4_26==ID) ) {
                                                            int LA4_32 = input.LA(13);

                                                            if ( ((LA4_32>=PLUS && LA4_32<=DIV)||LA4_32==DOT||LA4_32==24||LA4_32==48||(LA4_32>=50 && LA4_32<=59)) ) {
                                                                alt4=2;
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 47, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 44, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 41, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 36, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 30, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 25, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 20, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA4_15==ID) ) {
                            int LA4_21 = input.LA(5);

                            if ( (LA4_21==88) ) {
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

                                                            if ( ((LA4_50>=PLUS && LA4_50<=DIV)||LA4_50==DOT||LA4_50==24||LA4_50==48||(LA4_50>=50 && LA4_50<=59)) ) {
                                                                alt4=2;
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA4_26==ID) ) {
                                    int LA4_32 = input.LA(7);

                                    if ( ((LA4_32>=PLUS && LA4_32<=DIV)||LA4_32==DOT||LA4_32==24||LA4_32==48||(LA4_32>=50 && LA4_32<=59)) ) {
                                        alt4=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 21, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 15, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 11, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("66:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 5, input);

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

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:67:5: ';'
                    {
                    match(input,24,FOLLOW_24_in_statement_expr160); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:68:5: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement_expr166);
                    expression();
                    _fsp--;

                    match(input,24,FOLLOW_24_in_statement_expr168); 

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:69:28: config_statement ';'
                    {
                    pushFollow(FOLLOW_config_statement_in_statement_expr197);
                    config_statement();
                    _fsp--;

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
        return ;
    }
    // $ANTLR end statement_expr


    // $ANTLR start config_statement
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );
    public final void config_statement() throws RecognitionException {
        route_oper_return route_cmd = null;

        object_name_return robj = null;

        route_oper_return route_cmd2 = null;

        Symbol robj2 = null;

        object_name_return var = null;

        Symbol p2 = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:73:3: (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display )
            int alt9=19;
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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 10, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 2, input);

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
                        new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 4, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 14, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 15, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 5, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 17, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 18, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 6, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 20, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 7, input);

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
                            new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 21, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 8, input);

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
                    new NoViableAltException("72:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' object_name | 'ifconfig' interf | 'apply' 'topology' object_name | 'apply' 'topology' topology | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'role' ( object_name | role ) ( object_name | policy ) | 'apply' 'role' object_name | 'apply' 'role' role | 'undo' 'role' object_name | 'undo' 'role' role | 'apply' 'policy' var= object_name | 'apply' 'policy' p2= policy | 'undo' 'policy' object_name | 'undo' 'policy' policy | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:74:5: route_cmd= route_oper robj= object_name
                    {
                    pushFollow(FOLLOW_route_oper_in_config_statement223);
                    route_cmd=route_oper();
                    _fsp--;

                    pushFollow(FOLLOW_object_name_in_config_statement227);
                    robj=object_name();
                    _fsp--;

                    
                     	   Route route = (Route) currentScope.lookup(input.toString(robj.start,robj.stop));
                     	   if (route != null)
                     	   {
                     	     System.out.println(" route command :"+input.toString(route_cmd.start,route_cmd.stop));
                     	     System.out.println(" inputs :"+route.getString());
                     	   }
                     	  
                     	  

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:84:4: route_cmd2= route_oper robj2= route
                    {
                    pushFollow(FOLLOW_route_oper_in_config_statement240);
                    route_cmd2=route_oper();
                    _fsp--;

                    pushFollow(FOLLOW_route_in_config_statement244);
                    robj2=route();
                    _fsp--;

                    
                     	Route r=(Route)robj2.lookupValue();
                     	if(r!=null)
                     	{
                     	System.out.println(" route command :"+input.toString(route_cmd2.start,route_cmd2.stop));
                     	System.out.println(" inputs :"+r.getString());
                     	}
                     	

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:93:4: 'ifconfig' object_name
                    {
                    match(input,25,FOLLOW_25_in_config_statement253); 
                    pushFollow(FOLLOW_object_name_in_config_statement255);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:94:3: 'ifconfig' interf
                    {
                    match(input,25,FOLLOW_25_in_config_statement259); 
                    pushFollow(FOLLOW_interf_in_config_statement261);
                    interf();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:95:3: 'apply' 'topology' object_name
                    {
                    match(input,26,FOLLOW_26_in_config_statement265); 
                    match(input,27,FOLLOW_27_in_config_statement267); 
                    pushFollow(FOLLOW_object_name_in_config_statement269);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:96:5: 'apply' 'topology' topology
                    {
                    match(input,26,FOLLOW_26_in_config_statement275); 
                    match(input,27,FOLLOW_27_in_config_statement277); 
                    pushFollow(FOLLOW_topology_in_config_statement279);
                    topology();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:97:5: 'undo' 'topology' object_name
                    {
                    match(input,28,FOLLOW_28_in_config_statement285); 
                    match(input,27,FOLLOW_27_in_config_statement287); 
                    pushFollow(FOLLOW_object_name_in_config_statement289);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 8 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:98:5: 'undo' 'topology' topology
                    {
                    match(input,28,FOLLOW_28_in_config_statement296); 
                    match(input,27,FOLLOW_27_in_config_statement298); 
                    pushFollow(FOLLOW_topology_in_config_statement300);
                    topology();
                    _fsp--;


                    }
                    break;
                case 9 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:99:6: set_oper 'role' ( object_name | role ) ( object_name | policy )
                    {
                    pushFollow(FOLLOW_set_oper_in_config_statement307);
                    set_oper();
                    _fsp--;

                    match(input,29,FOLLOW_29_in_config_statement309); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:99:22: ( object_name | role )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==29) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("99:22: ( object_name | role )", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:99:23: object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement312);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:99:35: role
                            {
                            pushFollow(FOLLOW_role_in_config_statement314);
                            role();
                            _fsp--;


                            }
                            break;

                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:99:41: ( object_name | policy )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ID) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_0>=79 && LA6_0<=80)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("99:41: ( object_name | policy )", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:99:42: object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement318);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:99:54: policy
                            {
                            pushFollow(FOLLOW_policy_in_config_statement320);
                            policy();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 10 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:100:6: 'apply' 'role' object_name
                    {
                    match(input,26,FOLLOW_26_in_config_statement328); 
                    match(input,29,FOLLOW_29_in_config_statement330); 
                    pushFollow(FOLLOW_object_name_in_config_statement332);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 11 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:101:6: 'apply' 'role' role
                    {
                    match(input,26,FOLLOW_26_in_config_statement339); 
                    match(input,29,FOLLOW_29_in_config_statement341); 
                    pushFollow(FOLLOW_role_in_config_statement343);
                    role();
                    _fsp--;


                    }
                    break;
                case 12 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:102:5: 'undo' 'role' object_name
                    {
                    match(input,28,FOLLOW_28_in_config_statement349); 
                    match(input,29,FOLLOW_29_in_config_statement351); 
                    pushFollow(FOLLOW_object_name_in_config_statement353);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 13 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:103:5: 'undo' 'role' role
                    {
                    match(input,28,FOLLOW_28_in_config_statement359); 
                    match(input,29,FOLLOW_29_in_config_statement361); 
                    pushFollow(FOLLOW_role_in_config_statement363);
                    role();
                    _fsp--;


                    }
                    break;
                case 14 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:104:5: 'apply' 'policy' var= object_name
                    {
                    match(input,26,FOLLOW_26_in_config_statement369); 
                    match(input,30,FOLLOW_30_in_config_statement371); 
                    pushFollow(FOLLOW_object_name_in_config_statement375);
                    var=object_name();
                    _fsp--;

                    
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
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:129:5: 'apply' 'policy' p2= policy
                    {
                    match(input,26,FOLLOW_26_in_config_statement385); 
                    match(input,30,FOLLOW_30_in_config_statement387); 
                    pushFollow(FOLLOW_policy_in_config_statement391);
                    p2=policy();
                    _fsp--;

                    
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
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:153:5: 'undo' 'policy' object_name
                    {
                    match(input,28,FOLLOW_28_in_config_statement400); 
                    match(input,30,FOLLOW_30_in_config_statement402); 
                    pushFollow(FOLLOW_object_name_in_config_statement404);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 17 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:154:5: 'undo' 'policy' policy
                    {
                    match(input,28,FOLLOW_28_in_config_statement410); 
                    match(input,30,FOLLOW_30_in_config_statement412); 
                    pushFollow(FOLLOW_policy_in_config_statement414);
                    policy();
                    _fsp--;


                    }
                    break;
                case 18 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:155:5: set_oper 'host_group' ( object_name | host_group ) ( object_name | host )
                    {
                    pushFollow(FOLLOW_set_oper_in_config_statement420);
                    set_oper();
                    _fsp--;

                    match(input,31,FOLLOW_31_in_config_statement422); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:155:27: ( object_name | host_group )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ID) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==31) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("155:27: ( object_name | host_group )", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:155:28: object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement425);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:155:41: host_group
                            {
                            pushFollow(FOLLOW_host_group_in_config_statement428);
                            host_group();
                            _fsp--;


                            }
                            break;

                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:155:53: ( object_name | host )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ID) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==85) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("155:53: ( object_name | host )", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:155:54: object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement432);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:155:66: host
                            {
                            pushFollow(FOLLOW_host_in_config_statement434);
                            host();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 19 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:157:3: config_display
                    {
                    pushFollow(FOLLOW_config_display_in_config_statement441);
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

    public static class route_oper_return extends ParserRuleReturnScope {
        public String route_cmd;
    };

    // $ANTLR start route_oper
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:160:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );
    public final route_oper_return route_oper() throws RecognitionException {
        route_oper_return retval = new route_oper_return();
        retval.start = input.LT(1);

        Token cmd=null;
        Token sub_cmd=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:161:3: ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' )
            int alt10=3;
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
                        new NoViableAltException("160:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("160:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:162:2: 
                    {
                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:162:3: cmd= 'route' sub_cmd= 'add'
                    {
                    cmd=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_route_oper467); 
                    sub_cmd=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_route_oper471); 
                     retval.route_cmd = cmd.getText()+sub_cmd.getText();

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:163:4: cmd= 'route' sub_cmd= 'delete'
                    {
                    cmd=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_route_oper480); 
                    sub_cmd=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_route_oper484); 
                     retval.route_cmd = cmd.getText()+sub_cmd.getText();

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
        return retval;
    }
    // $ANTLR end route_oper


    // $ANTLR start set_oper
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:166:1: set_oper : ( 'add' 'to' | 'delete' 'from' );
    public final void set_oper() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:167:2: ( 'add' 'to' | 'delete' 'from' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("166:1: set_oper : ( 'add' 'to' | 'delete' 'from' );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:168:2: 'add' 'to'
                    {
                    match(input,33,FOLLOW_33_in_set_oper501); 
                    match(input,35,FOLLOW_35_in_set_oper503); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:169:4: 'delete' 'from'
                    {
                    match(input,34,FOLLOW_34_in_set_oper508); 
                    match(input,36,FOLLOW_36_in_set_oper510); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:172:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );
    public final void config_display() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:173:3: ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' )
            int alt12=4;
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
                            new NoViableAltException("172:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("172:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 1, input);

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
                            new NoViableAltException("172:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("172:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("172:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:174:4: 'route' 'show' 'numeric'
                    {
                    match(input,32,FOLLOW_32_in_config_display529); 
                    match(input,37,FOLLOW_37_in_config_display531); 
                    match(input,38,FOLLOW_38_in_config_display533); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:175:4: 'route' 'show'
                    {
                    match(input,32,FOLLOW_32_in_config_display538); 
                    match(input,37,FOLLOW_37_in_config_display540); 

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:176:4: 'fw' 'show' 'numeric'
                    {
                    match(input,39,FOLLOW_39_in_config_display546); 
                    match(input,37,FOLLOW_37_in_config_display548); 
                    match(input,38,FOLLOW_38_in_config_display550); 

                    }
                    break;
                case 4 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:177:3: 'fw' 'show'
                    {
                    match(input,39,FOLLOW_39_in_config_display554); 
                    match(input,37,FOLLOW_37_in_config_display556); 

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


    // $ANTLR start condition_statement
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:182:2: condition_statement : 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' ;
    public final void condition_statement() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:183:3: ( 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:183:5: 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif'
            {
            match(input,40,FOLLOW_40_in_condition_statement578); 
            match(input,41,FOLLOW_41_in_condition_statement580); 
            pushFollow(FOLLOW_equality_expr_in_condition_statement582);
            equality_expr();
            _fsp--;

            match(input,42,FOLLOW_42_in_condition_statement584); 
            pushFollow(FOLLOW_statement_list_in_condition_statement586);
            statement_list();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:183:47: ( 'else' statement_list )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:183:48: 'else' statement_list
                    {
                    match(input,43,FOLLOW_43_in_condition_statement589); 
                    pushFollow(FOLLOW_statement_list_in_condition_statement591);
                    statement_list();
                    _fsp--;


                    }
                    break;

            }

            match(input,44,FOLLOW_44_in_condition_statement595); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:186:2: iteration_statement : 'while' '(' equality_expr ')' statement_list 'endwhile' ;
    public final void iteration_statement() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:187:3: ( 'while' '(' equality_expr ')' statement_list 'endwhile' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:187:5: 'while' '(' equality_expr ')' statement_list 'endwhile'
            {
            match(input,45,FOLLOW_45_in_iteration_statement611); 
            match(input,41,FOLLOW_41_in_iteration_statement613); 
            pushFollow(FOLLOW_equality_expr_in_iteration_statement615);
            equality_expr();
            _fsp--;

            match(input,42,FOLLOW_42_in_iteration_statement617); 
            pushFollow(FOLLOW_statement_list_in_iteration_statement619);
            statement_list();
            _fsp--;

            match(input,46,FOLLOW_46_in_iteration_statement621); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:190:2: print_statement : 'echo' STRING ';' ;
    public final void print_statement() throws RecognitionException {
        Token STRING1=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:191:3: ( 'echo' STRING ';' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:191:5: 'echo' STRING ';'
            {
            match(input,47,FOLLOW_47_in_print_statement637); 
            STRING1=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement639); 
            System.out.println(STRING1);
            match(input,24,FOLLOW_24_in_print_statement643); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:194:2: expression : assignment_expr ;
    public final void expression() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:195:3: ( assignment_expr )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:195:5: assignment_expr
            {
            pushFollow(FOLLOW_assignment_expr_in_expression659);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:198:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );
    public final void assignment_expr() throws RecognitionException {
        object_name_return var = null;

        assignment_operator_return op = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:199:4: (var= object_name op= assignment_operator assignment_expr | e= conditional_expr )
            int alt14=2;
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
                        new NoViableAltException("198:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==NUMBER||LA14_0==STRING||LA14_0==CHAR||LA14_0==29||LA14_0==31||LA14_0==41||LA14_0==60||(LA14_0>=79 && LA14_0<=80)||(LA14_0>=85 && LA14_0<=86)||(LA14_0>=89 && LA14_0<=91)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("198:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:199:7: var= object_name op= assignment_operator assignment_expr
                    {
                    pushFollow(FOLLOW_object_name_in_assignment_expr680);
                    var=object_name();
                    _fsp--;

                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr684);
                    op=assignment_operator();
                    _fsp--;

                    
                    	 		Symbol s = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			Assignment ans = new Assignment(s, input.toString(op.start,op.stop));
                    			map.put(input.toString(var.start,var.stop), ans);
                    			System.out.println("here");
                    		//	currentScope.printSymbols();
                    	 	
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr695);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:209:6: e= conditional_expr
                    {
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr708);
                    e=conditional_expr();
                    _fsp--;

                    
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
        return ;
    }
    // $ANTLR end assignment_expr


    // $ANTLR start conditional_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:267:2: conditional_expr returns [Symbol sym] : e= logicalOR_expr ( '?' expression ':' conditional_expr )? ;
    public final Symbol conditional_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:268:3: (e= logicalOR_expr ( '?' expression ':' conditional_expr )? )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:268:5: e= logicalOR_expr ( '?' expression ':' conditional_expr )?
            {
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr742);
            e=logicalOR_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:269:3: ( '?' expression ':' conditional_expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:269:5: '?' expression ':' conditional_expr
                    {
                    match(input,48,FOLLOW_48_in_conditional_expr750); 
                    pushFollow(FOLLOW_expression_in_conditional_expr752);
                    expression();
                    _fsp--;

                    match(input,49,FOLLOW_49_in_conditional_expr754); 
                    pushFollow(FOLLOW_conditional_expr_in_conditional_expr756);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:272:2: logicalOR_expr returns [Symbol sym] : e= logicalAND_expr ( '||' logicalAND_expr )* ;
    public final Symbol logicalOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:273:3: (e= logicalAND_expr ( '||' logicalAND_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:273:5: e= logicalAND_expr ( '||' logicalAND_expr )*
            {
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr780);
            e=logicalAND_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:274:3: ( '||' logicalAND_expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==50) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:274:4: '||' logicalAND_expr
            	    {
            	    match(input,50,FOLLOW_50_in_logicalOR_expr788); 
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr790);
            	    logicalAND_expr();
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
    // $ANTLR end logicalOR_expr


    // $ANTLR start logicalAND_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:277:2: logicalAND_expr returns [Symbol sym] : e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* ;
    public final Symbol logicalAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:278:3: (e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:278:5: e= bitwiseOR_expr ( '&&' bitwiseOR_expr )*
            {
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr813);
            e=bitwiseOR_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:279:3: ( '&&' bitwiseOR_expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==51) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:279:4: '&&' bitwiseOR_expr
            	    {
            	    match(input,51,FOLLOW_51_in_logicalAND_expr821); 
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr823);
            	    bitwiseOR_expr();
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
    // $ANTLR end logicalAND_expr


    // $ANTLR start bitwiseOR_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:282:2: bitwiseOR_expr returns [Symbol sym] : e= bitwiseAND_expr ( '|' bitwiseAND_expr )* ;
    public final Symbol bitwiseOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:283:3: (e= bitwiseAND_expr ( '|' bitwiseAND_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:283:5: e= bitwiseAND_expr ( '|' bitwiseAND_expr )*
            {
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr847);
            e=bitwiseAND_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:284:3: ( '|' bitwiseAND_expr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==52) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:284:4: '|' bitwiseAND_expr
            	    {
            	    match(input,52,FOLLOW_52_in_bitwiseOR_expr855); 
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr857);
            	    bitwiseAND_expr();
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
    // $ANTLR end bitwiseOR_expr


    // $ANTLR start bitwiseAND_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:287:2: bitwiseAND_expr returns [Symbol sym] : e= equality_expr ( '&' equality_expr )* ;
    public final Symbol bitwiseAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:288:3: (e= equality_expr ( '&' equality_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:288:5: e= equality_expr ( '&' equality_expr )*
            {
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr880);
            e=equality_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:289:3: ( '&' equality_expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:289:4: '&' equality_expr
            	    {
            	    match(input,53,FOLLOW_53_in_bitwiseAND_expr888); 
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr890);
            	    equality_expr();
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
    // $ANTLR end bitwiseAND_expr


    // $ANTLR start equality_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:292:2: equality_expr returns [Symbol sym] : e= relational_expr ( ( '==' | '!=' ) relational_expr )* ;
    public final Symbol equality_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:293:3: (e= relational_expr ( ( '==' | '!=' ) relational_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:293:5: e= relational_expr ( ( '==' | '!=' ) relational_expr )*
            {
            pushFollow(FOLLOW_relational_expr_in_equality_expr915);
            e=relational_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:294:3: ( ( '==' | '!=' ) relational_expr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=54 && LA20_0<=55)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:294:5: ( '==' | '!=' ) relational_expr
            	    {
            	    if ( (input.LA(1)>=54 && input.LA(1)<=55) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr924);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expr_in_equality_expr932);
            	    relational_expr();
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
    // $ANTLR end equality_expr


    // $ANTLR start relational_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:297:2: relational_expr returns [Symbol sym] : e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* ;
    public final Symbol relational_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:298:3: (e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:298:5: e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )*
            {
            pushFollow(FOLLOW_expr_in_relational_expr956);
            e=expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:299:3: ( ( '<' | '>' | '<=' | '>=' ) expr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=56 && LA21_0<=59)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:299:5: ( '<' | '>' | '<=' | '>=' ) expr
            	    {
            	    if ( (input.LA(1)>=56 && input.LA(1)<=59) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr967);    throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_in_relational_expr977);
            	    expr();
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
        return sym;
    }
    // $ANTLR end relational_expr


    // $ANTLR start expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:303:2: expr returns [Symbol sym] : e= term ( ( PLUS | MINUS ) term )* ;
    public final Symbol expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:304:3: (e= term ( ( PLUS | MINUS ) term )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:304:5: e= term ( ( PLUS | MINUS ) term )*
            {
            pushFollow(FOLLOW_term_in_expr1003);
            e=term();
            _fsp--;

            sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:305:3: ( ( PLUS | MINUS ) term )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=PLUS && LA22_0<=MINUS)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:305:5: ( PLUS | MINUS ) term
            	    {
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr1014);    throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr1025);
            	    term();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:308:2: term returns [Symbol sym] : e= unary_expr ( ( MULT | DIV ) unary_expr )* ;
    public final Symbol term() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:309:3: (e= unary_expr ( ( MULT | DIV ) unary_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:309:5: e= unary_expr ( ( MULT | DIV ) unary_expr )*
            {
            pushFollow(FOLLOW_unary_expr_in_term1051);
            e=unary_expr();
            _fsp--;

            sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:310:3: ( ( MULT | DIV ) unary_expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=MULT && LA23_0<=DIV)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:310:5: ( MULT | DIV ) unary_expr
            	    {
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term1062);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unary_expr_in_term1072);
            	    unary_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:313:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );
    public final Symbol unary_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:3: (e= postfix_expression | '~' unary_expr )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NUMBER||(LA24_0>=STRING && LA24_0<=ID)||LA24_0==CHAR||LA24_0==29||LA24_0==31||LA24_0==41||(LA24_0>=79 && LA24_0<=80)||(LA24_0>=85 && LA24_0<=86)||(LA24_0>=89 && LA24_0<=91)) ) {
                alt24=1;
            }
            else if ( (LA24_0==60) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("313:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:5: e= postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr1098);
                    e=postfix_expression();
                    _fsp--;

                    sym = e;

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:315:5: '~' unary_expr
                    {
                    match(input,60,FOLLOW_60_in_unary_expr1106); 
                    pushFollow(FOLLOW_unary_expr_in_unary_expr1108);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:320:2: postfix_expression returns [Symbol sym] : e= factor ( '.' ID )* ;
    public final Symbol postfix_expression() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:321:3: (e= factor ( '.' ID )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:321:5: e= factor ( '.' ID )*
            {
            pushFollow(FOLLOW_factor_in_postfix_expression1135);
            e=factor();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:321:14: ( '.' ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DOT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:321:15: '.' ID
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression1138); 
            	    match(input,ID,FOLLOW_ID_in_postfix_expression1139); 

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:324:2: assignment_operator : ( '=' | '*=' | '/=' | '+=' | '-=' );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:325:3: ( '=' | '*=' | '/=' | '+=' | '-=' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            if ( input.LA(1)==EQUAL||(input.LA(1)>=61 && input.LA(1)<=64) ) {
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:332:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );
    public final Symbol factor() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:334:2: ( ID | e= literal | '(' expression ')' )
            int alt26=3;
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
                    new NoViableAltException("332:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:334:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor1202); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:335:5: e= literal
                    {
                    pushFollow(FOLLOW_literal_in_factor1210);
                    e=literal();
                    _fsp--;

                    sym = e;

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:336:5: '(' expression ')'
                    {
                    match(input,41,FOLLOW_41_in_factor1219); 
                    pushFollow(FOLLOW_expression_in_factor1221);
                    expression();
                    _fsp--;

                    match(input,42,FOLLOW_42_in_factor1223); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:339:2: literal returns [Symbol sym] : e= object_values ;
    public final Symbol literal() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:340:3: (e= object_values )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:340:5: e= object_values
            {
            pushFollow(FOLLOW_object_values_in_literal1245);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:343:1: declr_stmt : type_name var_name= object_name ( COMMA next_var= object_name )* ';' ;
    public final void declr_stmt() throws RecognitionException {
        object_name_return var_name = null;

        object_name_return next_var = null;

        type_name_return type_name2 = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:344:2: ( type_name var_name= object_name ( COMMA next_var= object_name )* ';' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:345:2: type_name var_name= object_name ( COMMA next_var= object_name )* ';'
            {
            int count_com = 0;
            pushFollow(FOLLOW_type_name_in_declr_stmt1263);
            type_name2=type_name();
            _fsp--;

            pushFollow(FOLLOW_object_name_in_declr_stmt1267);
            var_name=object_name();
            _fsp--;

            
            		System.out.println(" type : " + input.toString(type_name2.start,type_name2.stop) +" var : "+ input.toString(var_name.start,var_name.stop));
            		currentScope.defineSymbol(input.toString(var_name.start,var_name.stop), input.toString(type_name2.start,type_name2.stop));
            	
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:351:2: ( COMMA next_var= object_name )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMMA) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:351:3: COMMA next_var= object_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_declr_stmt1274); 
            	    count_com++;
            	    pushFollow(FOLLOW_object_name_in_declr_stmt1280);
            	    next_var=object_name();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            
            	//	System.out.println(" commas : "+ count_com);
            		
            		if(count_com > 0)			
                          		 currentScope.defineSymbol(input.toString(next_var.start,next_var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            match(input,24,FOLLOW_24_in_declr_stmt1290); 

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

    public static class type_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start type_name
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:364:1: type_name : ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:365:2: ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            if ( (input.LA(1)>=65 && input.LA(1)<=75) ) {
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


    // $ANTLR start object_values
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:378:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | interf | route );
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


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:379:2: ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | interf | route )
            int alt28=12;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:379:4: char_value
                    {
                    pushFollow(FOLLOW_char_value_in_object_values1386);
                    char_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:380:4: int_value
                    {
                    pushFollow(FOLLOW_int_value_in_object_values1391);
                    int_value3=int_value();
                    _fsp--;

                     
                    		sym = int_value3;
                    	

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:384:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_object_values1400); 

                    }
                    break;
                case 4 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:385:4: ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_object_values1405);
                    ip_addr4=ip_addr();
                    _fsp--;

                    
                    	  sym = ip_addr4.sym;


                    }
                    break;
                case 5 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:389:4: policy
                    {
                    pushFollow(FOLLOW_policy_in_object_values1413);
                    policy5=policy();
                    _fsp--;

                     sym = policy5;

                    }
                    break;
                case 6 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:390:4: host
                    {
                    pushFollow(FOLLOW_host_in_object_values1422);
                    host6=host();
                    _fsp--;

                    
                    	sym = host6 ; 
                    	

                    }
                    break;
                case 7 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:393:4: role
                    {
                    pushFollow(FOLLOW_role_in_object_values1431);
                    role7=role();
                    _fsp--;

                    sym =role7;

                    }
                    break;
                case 8 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:394:4: host_group
                    {
                    pushFollow(FOLLOW_host_group_in_object_values1439);
                    host_group8=host_group();
                    _fsp--;

                     sym = host_group8;

                    }
                    break;
                case 9 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:395:4: topology
                    {
                    pushFollow(FOLLOW_topology_in_object_values1447);
                    topology();
                    _fsp--;


                    }
                    break;
                case 10 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:396:4: serv_group
                    {
                    pushFollow(FOLLOW_serv_group_in_object_values1452);
                    serv_group();
                    _fsp--;


                    }
                    break;
                case 11 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:397:4: interf
                    {
                    pushFollow(FOLLOW_interf_in_object_values1457);
                    interf9=interf();
                    _fsp--;

                     sym = interf9;

                    }
                    break;
                case 12 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:398:4: route
                    {
                    pushFollow(FOLLOW_route_in_object_values1464);
                    route10=route();
                    _fsp--;

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
        return sym;
    }
    // $ANTLR end object_values


    // $ANTLR start role
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:404:1: role returns [Symbol sym] : 'role' '{' ( (p_i= policy ) | (var= object_name ) ) ( COMMA ( (p_j= policy ) | (var2= object_name ) ) )* '}' ;
    public final Symbol role() throws RecognitionException {
        Symbol sym = null;

        Symbol p_i = null;

        object_name_return var = null;

        Symbol p_j = null;

        object_name_return var2 = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:404:27: ( 'role' '{' ( (p_i= policy ) | (var= object_name ) ) ( COMMA ( (p_j= policy ) | (var2= object_name ) ) )* '}' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:405:2: 'role' '{' ( (p_i= policy ) | (var= object_name ) ) ( COMMA ( (p_j= policy ) | (var2= object_name ) ) )* '}'
            {
             
            	      Vector <Policy> policies;
            	      policies = new Vector <Policy>() ;	     
            	 
            match(input,29,FOLLOW_29_in_role1489); 
            match(input,76,FOLLOW_76_in_role1491); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:13: ( (p_i= policy ) | (var= object_name ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=79 && LA29_0<=80)) ) {
                alt29=1;
            }
            else if ( (LA29_0==ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("409:13: ( (p_i= policy ) | (var= object_name ) )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:14: (p_i= policy )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:14: (p_i= policy )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:15: p_i= policy
                    {
                    pushFollow(FOLLOW_policy_in_role1497);
                    p_i=policy();
                    _fsp--;

                    policies.add((Policy)p_i.lookupValue());

                    }


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:70: (var= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:70: (var= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:71: var= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_role1505);
                    var=object_name();
                    _fsp--;

                    
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
                    		  
                    		  

                    }


                    }
                    break;

            }

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:6: ( COMMA ( (p_j= policy ) | (var2= object_name ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:7: COMMA ( (p_j= policy ) | (var2= object_name ) )
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_role1524); 
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:13: ( (p_j= policy ) | (var2= object_name ) )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( ((LA30_0>=79 && LA30_0<=80)) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==ID) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("426:13: ( (p_j= policy ) | (var2= object_name ) )", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:14: (p_j= policy )
            	            {
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:14: (p_j= policy )
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:15: p_j= policy
            	            {
            	            pushFollow(FOLLOW_policy_in_role1530);
            	            p_j=policy();
            	            _fsp--;

            	            policies.add((Policy)p_j.lookupValue());

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:70: (var2= object_name )
            	            {
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:70: (var2= object_name )
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:426:71: var2= object_name
            	            {
            	            pushFollow(FOLLOW_object_name_in_role1538);
            	            var2=object_name();
            	            _fsp--;

            	            
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
            	            		  
            	            		   
            	            		   

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match(input,77,FOLLOW_77_in_role1552); 
            
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
        return sym;
    }
    // $ANTLR end role


    // $ANTLR start policy
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:452:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) );
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


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:452:29: (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) )
            int alt37=2;
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
                            new NoViableAltException("452:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) );", 37, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("452:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) );", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("452:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) ) );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:453:4: dir= direction verd= verdict protocol= proto (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) ) (sport= port )?
                    {
                    int src_port = 0;
                      	 boolean ip_object_used , netmask_object_used ;
                      	 ip_object_used = false;
                      	 netmask_object_used = false;
                      	
                    pushFollow(FOLLOW_direction_in_policy1583);
                    dir=direction();
                    _fsp--;

                    pushFollow(FOLLOW_verdict_in_policy1587);
                    verd=verdict();
                    _fsp--;

                    pushFollow(FOLLOW_proto_in_policy1591);
                    protocol=proto();
                    _fsp--;

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:458:46: (src_ip= ip_addr | (ip_obj= object_name ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==NUMBER) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==ID) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("458:46: (src_ip= ip_addr | (ip_obj= object_name ) )", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:458:47: src_ip= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_policy1596);
                            src_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:458:62: (ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:458:62: (ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:458:63: ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_policy1601);
                            ip_obj=object_name();
                            _fsp--;

                            System.out.println(" object name:"+input.toString(ip_obj.start,ip_obj.stop));ip_object_used = true;

                            }


                            }
                            break;

                    }

                    match(input,78,FOLLOW_78_in_policy1611); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:459:15: (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==NUMBER) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==ID) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("459:15: (netmask_ip= ip_addr | (netmask_ip_obj= object_name ) )", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:459:16: netmask_ip= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_policy1616);
                            netmask_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:459:35: (netmask_ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:459:35: (netmask_ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:459:36: netmask_ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_policy1623);
                            netmask_ip_obj=object_name();
                            _fsp--;

                            netmask_object_used = true;

                            }


                            }
                            break;

                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:459:97: (sport= port )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==NUMBER) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:459:98: sport= port
                            {
                            pushFollow(FOLLOW_port_in_policy1632);
                            sport=port();
                            _fsp--;

                            src_port++;

                            }
                            break;

                    }

                    
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
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:513:2: dir= direction verd= verdict icmp_mesg= icmp_cntrl_message (src_ip= ip_addr | (ip_obj= object_name ) ) 'netmask' (src_netmask= ip_addr | (netmask_ip_obj= object_name ) )
                    {
                    int src_port = 0;
                      	 boolean ip_object_used , netmask_object_used ;
                      	 ip_object_used = false;
                      	 netmask_object_used = false;
                      	
                    pushFollow(FOLLOW_direction_in_policy1659);
                    dir=direction();
                    _fsp--;

                    pushFollow(FOLLOW_verdict_in_policy1663);
                    verd=verdict();
                    _fsp--;

                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy1667);
                    icmp_mesg=icmp_cntrl_message();
                    _fsp--;

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:519:59: (src_ip= ip_addr | (ip_obj= object_name ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==NUMBER) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==ID) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("519:59: (src_ip= ip_addr | (ip_obj= object_name ) )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:519:60: src_ip= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_policy1673);
                            src_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:519:77: (ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:519:77: (ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:519:78: ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_policy1680);
                            ip_obj=object_name();
                            _fsp--;

                            ip_object_used = true;

                            }


                            }
                            break;

                    }

                    match(input,78,FOLLOW_78_in_policy1692); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:520:16: (src_netmask= ip_addr | (netmask_ip_obj= object_name ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NUMBER) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==ID) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("520:16: (src_netmask= ip_addr | (netmask_ip_obj= object_name ) )", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:520:17: src_netmask= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_policy1697);
                            src_netmask=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:520:39: (netmask_ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:520:39: (netmask_ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:520:40: netmask_ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_policy1707);
                            netmask_ip_obj=object_name();
                            _fsp--;

                            netmask_object_used = true;

                            }


                            }
                            break;

                    }

                    
                    	
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
        return sym;
    }
    // $ANTLR end policy


    // $ANTLR start topology
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:582:1: topology : ( ( host_group )+ role | ( serv_group )+ role );
    public final void topology() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:582:9: ( ( host_group )+ role | ( serv_group )+ role )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            else if ( (LA40_0==91) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("582:1: topology : ( ( host_group )+ role | ( serv_group )+ role );", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:582:11: ( host_group )+ role
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:582:11: ( host_group )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==31) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:582:12: host_group
                    	    {
                    	    pushFollow(FOLLOW_host_group_in_topology1729);
                    	    host_group();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    pushFollow(FOLLOW_role_in_topology1733);
                    role();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:583:4: ( serv_group )+ role
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:583:4: ( serv_group )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==91) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:583:5: serv_group
                    	    {
                    	    pushFollow(FOLLOW_serv_group_in_topology1739);
                    	    serv_group();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    pushFollow(FOLLOW_role_in_topology1743);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:587:1: int_value returns [Symbol sym] : e= NUMBER ;
    public final Symbol int_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:588:2: (e= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:588:4: e= NUMBER
            {
            e=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_int_value1763); 
            
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
        return sym;
    }
    // $ANTLR end int_value


    // $ANTLR start char_value
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:615:1: char_value : CHAR ;
    public final void char_value() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:616:2: ( CHAR )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:616:11: CHAR
            {
            match(input,CHAR,FOLLOW_CHAR_in_char_value1788); 

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

    public static class direction_return extends ParserRuleReturnScope {
    };

    // $ANTLR start direction
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:628:1: direction : ( 'inbound' | 'outbound' );
    public final direction_return direction() throws RecognitionException {
        direction_return retval = new direction_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:629:2: ( 'inbound' | 'outbound' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            if ( (input.LA(1)>=79 && input.LA(1)<=80) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end direction

    public static class verdict_return extends ParserRuleReturnScope {
    };

    // $ANTLR start verdict
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:633:1: verdict : ( 'allow' | 'deny' );
    public final verdict_return verdict() throws RecognitionException {
        verdict_return retval = new verdict_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:633:9: ( 'allow' | 'deny' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            if ( (input.LA(1)>=81 && input.LA(1)<=82) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end verdict

    public static class proto_return extends ParserRuleReturnScope {
    };

    // $ANTLR start proto
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:637:1: proto : ( 'udp' | 'tcp' );
    public final proto_return proto() throws RecognitionException {
        proto_return retval = new proto_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:637:9: ( 'udp' | 'tcp' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            if ( (input.LA(1)>=83 && input.LA(1)<=84) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end proto

    public static class icmp_cntrl_message_return extends ParserRuleReturnScope {
    };

    // $ANTLR start icmp_cntrl_message
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:640:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final icmp_cntrl_message_return icmp_cntrl_message() throws RecognitionException {
        icmp_cntrl_message_return retval = new icmp_cntrl_message_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:641:2: ( ICMP_MESSAGE_TYPE )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:641:4: ICMP_MESSAGE_TYPE
            {
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1869); 

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
    // $ANTLR end icmp_cntrl_message

    public static class port_return extends ParserRuleReturnScope {
    };

    // $ANTLR start port
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:644:1: port : NUMBER ;
    public final port_return port() throws RecognitionException {
        port_return retval = new port_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:644:6: ( NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:644:8: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_port1879); 

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
    // $ANTLR end port

    public static class object_name_return extends ParserRuleReturnScope {
        public String obj_name;
    };

    // $ANTLR start object_name
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:647:1: object_name returns [String obj_name] : ID ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        Token ID11=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:648:2: ( ID )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:648:5: ID
            {
            ID11=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_object_name1894); 
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
        return retval;
    }
    // $ANTLR end object_name

    public static class ip_addr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start ip_addr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:1: ip_addr returns [Symbol sym] : (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) ;
    public final ip_addr_return ip_addr() throws RecognitionException {
        ip_addr_return retval = new ip_addr_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token c=null;
        Token d=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:32: ( (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:35: (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER )
            {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:35: (a= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:36: a= NUMBER
            {
            a=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1931); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr1933); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:48: (b= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:49: b= NUMBER
            {
            b=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1937); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr1939); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:61: (c= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:62: c= NUMBER
            {
            c=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1943); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr1945); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:74: (d= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:75: d= NUMBER
            {
            d=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1949); 

            }

            
            			
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
        return retval;
    }
    // $ANTLR end ip_addr


    // $ANTLR start nmask
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:1: nmask : 'netmask' ip_addr ;
    public final void nmask() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:7: ( 'netmask' ip_addr )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:9: 'netmask' ip_addr
            {
            match(input,78,FOLLOW_78_in_nmask1969); 
            pushFollow(FOLLOW_ip_addr_in_nmask1971);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:706:1: host returns [Symbol sym] : 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) ;
    public final Symbol host() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return ip_string = null;

        object_name_return ip_obj = null;

        ip_addr_return netmask_string = null;

        object_name_return netmask_ip_obj = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:706:26: ( 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:707:2: 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            {
            boolean ip_object_used =false, netmask_object_used = false;
            match(input,85,FOLLOW_85_in_host1993); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:708:13: (ip_string= ip_addr | (ip_obj= object_name ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==NUMBER) ) {
                alt41=1;
            }
            else if ( (LA41_0==ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("708:13: (ip_string= ip_addr | (ip_obj= object_name ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:708:14: ip_string= ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_host1998);
                    ip_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:708:32: (ip_obj= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:708:32: (ip_obj= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:708:33: ip_obj= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_host2003);
                    ip_obj=object_name();
                    _fsp--;

                    ip_object_used=true; 

                    }


                    }
                    break;

            }

            match(input,78,FOLLOW_78_in_host2010); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:708:89: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==NUMBER) ) {
                alt42=1;
            }
            else if ( (LA42_0==ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("708:89: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:708:90: netmask_string= ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_host2015);
                    netmask_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:21: (netmask_ip_obj= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:21: (netmask_ip_obj= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:22: netmask_ip_obj= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_host2045);
                    netmask_ip_obj=object_name();
                    _fsp--;

                    netmask_object_used = true;

                    }


                    }
                    break;

            }

            
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
        return sym;
    }
    // $ANTLR end host


    // $ANTLR start dns_set
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:804:1: dns_set : ip_addr ( ',' ip_addr )* ;
    public final void dns_set() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:804:9: ( ip_addr ( ',' ip_addr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:804:11: ip_addr ( ',' ip_addr )*
            {
            pushFollow(FOLLOW_ip_addr_in_dns_set2064);
            ip_addr();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:804:19: ( ',' ip_addr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:804:20: ',' ip_addr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_dns_set2067); 
            	    pushFollow(FOLLOW_ip_addr_in_dns_set2070);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:806:1: gateway : ip_addr ( ',' ip_addr )* ;
    public final void gateway() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:806:9: ( ip_addr ( ',' ip_addr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:806:11: ip_addr ( ',' ip_addr )*
            {
            pushFollow(FOLLOW_ip_addr_in_gateway2080);
            ip_addr();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:806:19: ( ',' ip_addr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:806:20: ',' ip_addr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_gateway2083); 
            	    pushFollow(FOLLOW_ip_addr_in_gateway2085);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:809:1: host_group returns [Symbol sym] : 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}' ;
    public final Symbol host_group() throws RecognitionException {
        Symbol sym = null;

        Symbol i = null;

        object_name_return host_obj_i = null;

        Symbol j = null;

        object_name_return host_obj_j = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:810:2: ( 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:811:2: 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}'
            {
            
            	Vector <Host> hosts;
            	hosts = new Vector <Host> ();
            	
            match(input,31,FOLLOW_31_in_host_group2106); 
            match(input,76,FOLLOW_76_in_host_group2109); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:815:19: (i= host | (host_obj_i= object_name ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==85) ) {
                alt45=1;
            }
            else if ( (LA45_0==ID) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("815:19: (i= host | (host_obj_i= object_name ) )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:815:21: i= host
                    {
                    pushFollow(FOLLOW_host_in_host_group2114);
                    i=host();
                    _fsp--;

                    hosts.add((Host)i.lookupValue()); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:815:67: (host_obj_i= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:815:67: (host_obj_i= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:815:68: host_obj_i= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_host_group2123);
                    host_obj_i=object_name();
                    _fsp--;

                    
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

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:831:3: ( ',' (j= host | (host_obj_j= object_name ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:831:4: ',' (j= host | (host_obj_j= object_name ) )
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_host_group2136); 
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:831:8: (j= host | (host_obj_j= object_name ) )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==85) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==ID) ) {
            	        alt46=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("831:8: (j= host | (host_obj_j= object_name ) )", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:831:9: j= host
            	            {
            	            pushFollow(FOLLOW_host_in_host_group2141);
            	            j=host();
            	            _fsp--;

            	            hosts.add((Host)j.lookupValue());

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:831:54: (host_obj_j= object_name )
            	            {
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:831:54: (host_obj_j= object_name )
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:831:55: host_obj_j= object_name
            	            {
            	            pushFollow(FOLLOW_object_name_in_host_group2152);
            	            host_obj_j=object_name();
            	            _fsp--;

            	            
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


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            match(input,77,FOLLOW_77_in_host_group2163); 
            
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
        return sym;
    }
    // $ANTLR end host_group


    // $ANTLR start interf
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:853:1: interf returns [Symbol sym] : 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' 'gw' gw_ip= ip_addr ;
    public final Symbol interf() throws RecognitionException {
        Symbol sym = null;

        Token interface_name=null;
        ip_addr_return interface_ip = null;

        ip_addr_return interface_netmask = null;

        ip_addr_return i = null;

        ip_addr_return j = null;

        ip_addr_return gw_ip = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:854:2: ( 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' 'gw' gw_ip= ip_addr )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:854:4: 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' 'gw' gw_ip= ip_addr
            {
             
            	     Vector <Ipaddress> dns_ip;
            	       dns_ip = new Vector <Ipaddress>() ;	     
            	         
            match(input,86,FOLLOW_86_in_interf2194); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:858:12: (interface_name= ID )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:858:13: interface_name= ID
            {
            interface_name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_interf2199); 

            }

            pushFollow(FOLLOW_ip_addr_in_interf2205);
            interface_ip=ip_addr();
            _fsp--;

            match(input,78,FOLLOW_78_in_interf2207); 
            pushFollow(FOLLOW_ip_addr_in_interf2212);
            interface_netmask=ip_addr();
            _fsp--;

            match(input,87,FOLLOW_87_in_interf2217); 
            match(input,76,FOLLOW_76_in_interf2220); 
            pushFollow(FOLLOW_ip_addr_in_interf2224);
            i=ip_addr();
            _fsp--;

            dns_ip.add(new Ipaddress(input.toString(i.start,i.stop)));
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:859:63: ( ',' j= ip_addr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:859:65: ',' j= ip_addr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_interf2231); 
            	    pushFollow(FOLLOW_ip_addr_in_interf2236);
            	    j=ip_addr();
            	    _fsp--;

            	    dns_ip.add(new Ipaddress(input.toString(j.start,j.stop)));

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            match(input,77,FOLLOW_77_in_interf2242); 
            match(input,88,FOLLOW_88_in_interf2250); 
            pushFollow(FOLLOW_ip_addr_in_interf2255);
            gw_ip=ip_addr();
            _fsp--;

            
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
        return sym;
    }
    // $ANTLR end interf


    // $ANTLR start route
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:867:1: route returns [Symbol sym] : ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) );
    public final Symbol route() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return dst = null;

        object_name_return ip_obj = null;

        ip_addr_return gw = null;

        object_name_return gw_ip_obj = null;

        ip_addr_return netmask_ip = null;

        object_name_return nm_ip_obj = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:867:28: ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==89) ) {
                alt54=1;
            }
            else if ( (LA54_0==90) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("867:1: route returns [Symbol sym] : ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:868:1: 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) )
                    {
                    
                       boolean ip_object_used , gw_object_used,nm_object_used ;
                       ip_object_used = false;
                       gw_object_used = false;
                       nm_object_used=false;

                    match(input,89,FOLLOW_89_in_route2279); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:8: (dst= ip_addr | (ip_obj= object_name ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==NUMBER) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==ID) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("874:8: (dst= ip_addr | (ip_obj= object_name ) )", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:9: dst= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route2284);
                            dst=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:21: (ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:21: (ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:22: ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route2290);
                            ip_obj=object_name();
                            _fsp--;

                            ip_object_used=true;

                            }


                            }
                            break;

                    }

                    match(input,88,FOLLOW_88_in_route2296); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:72: (gw= ip_addr | (gw_ip_obj= object_name ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==NUMBER) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==ID) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("874:72: (gw= ip_addr | (gw_ip_obj= object_name ) )", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:73: gw= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route2301);
                            gw=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:84: (gw_ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:84: (gw_ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:85: gw_ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route2308);
                            gw_ip_obj=object_name();
                            _fsp--;

                            gw_object_used=true;

                            }


                            }
                            break;

                    }

                    
                    		
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
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:3: 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) )
                    {
                    match(input,90,FOLLOW_90_in_route2329); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:9: (dst= ip_addr | (ip_obj= object_name ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==NUMBER) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==ID) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("962:9: (dst= ip_addr | (ip_obj= object_name ) )", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:10: dst= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route2334);
                            dst=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:22: (ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:22: (ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:23: ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route2339);
                            ip_obj=object_name();
                            _fsp--;

                            ip_object_used=true;

                            }


                            }
                            break;

                    }

                    match(input,78,FOLLOW_78_in_route2344); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:76: (netmask_ip= ip_addr | (nm_ip_obj= object_name ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==NUMBER) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==ID) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("962:76: (netmask_ip= ip_addr | (nm_ip_obj= object_name ) )", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:77: netmask_ip= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route2349);
                            netmask_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:96: (nm_ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:96: (nm_ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:97: nm_ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route2354);
                            nm_ip_obj=object_name();
                            _fsp--;

                            nm_object_used=true;

                            }


                            }
                            break;

                    }

                    match(input,88,FOLLOW_88_in_route2359); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:148: (gw= ip_addr | (gw_ip_obj= object_name ) )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==NUMBER) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==ID) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("962:148: (gw= ip_addr | (gw_ip_obj= object_name ) )", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:149: gw= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route2365);
                            gw=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:161: (gw_ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:161: (gw_ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:962:162: gw_ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route2370);
                            gw_ip_obj=object_name();
                            _fsp--;

                            gw_object_used=true;

                            }


                            }
                            break;

                    }

                    
                    	 if((ip_object_used ==true )&& (nm_object_used==false) && (gw_object_used==false))
                    	 {
                    	 Symbol s = currentScope.getSymbol(input.toString(ip_obj.start,ip_obj.stop));
                    	 
                    	 try{
                    	  if(s.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	    }
                    	   
                    	  Ipaddress ip = (Ipaddress) s.lookupValue();
                    	  Route rh = new Route (ip.getString(),input.toString(netmask_ip.start,netmask_ip.stop),input.toString(gw.start,gw.stop));
                    	  Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
                    	 sym = s_ret;
                    	 
                    	 }
                    	 else if(ip_object_used ==false && nm_object_used==true && gw_object_used==false)
                    	 {
                    	 Symbol s = currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                          	  
                          	  /* Check for type error in netmask  */
                          	   try{
                    	  if(s.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                          	  
                    	  Ipaddress nmip = (Ipaddress) s.lookupValue();
                    	  Route rh = new Route (input.toString(dst.start,dst.stop),nmip.getString(),input.toString(gw.start,gw.stop));
                    	  Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
                    	  sym = s_ret;
                    	 }
                    	 else if(ip_object_used ==false && nm_object_used==false && gw_object_used==true)
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
                    	  Route rh = new Route (input.toString(dst.start,dst.stop),input.toString(netmask_ip.start,netmask_ip.stop),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_host_string", "route_type_t", rh);
                    	  sym = s_ret;
                    	 
                    	 }
                    	 
                    	 
                    	 else if(ip_object_used ==true && nm_object_used==true && gw_object_used==false)
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
                    	 
                      	  Symbol dst_nm = currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    	
                    	 try{  /* Check for type exception in netmask  */
                    	  if(dst_nm.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	  
                    	  
                    	  Ipaddress nmip = (Ipaddress) dst_nm.lookupValue();
                    	 
                    	 Route rh = new Route (ip.getString(),nmip.getString(),input.toString(gw.start,gw.stop));
                    	  Symbol s_ret = new Symbol("route_host_string", "host_type_t", rh);
                    	 sym = s_ret;
                    	 
                    	 
                    	 }
                    	 else if(ip_object_used ==true && nm_object_used==false && gw_object_used==true)
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
                    	 
                    	 Route rh = new Route (ip.getString(),input.toString(netmask_ip.start,netmask_ip.stop),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_host_string", "host_type_t", rh);
                    	 sym = s_ret;
                    	 }
                    	 else if(ip_object_used ==false && nm_object_used==true && gw_object_used==true)
                    	 {
                    	 
                    	 
                    	 	 	
                    	  Symbol nm_ip =  currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    	
                    	 try{  /* Check fot type exceptions in ip_address */
                    	  if(nm_ip.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	
                    	  Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
                    	 
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
                    	 
                    	 Route rh = new Route ($dst.txt,nmip.getString(),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_host_string", "host_type_t", rh);
                    	 sym = s_ret;
                    	 }
                    	 else if(ip_object_used ==true && nm_object_used==true && gw_object_used==true)
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
                    	 	
                    	 	 	
                    	  Symbol nm_ip =  currentScope.getSymbol(input.toString(nm_ip_obj.start,nm_ip_obj.stop));
                    	
                    	 try{  /* Check fot type exceptions in ip_address */
                    	  if(nm_ip.getType().equals ("ipaddr_t") != true) 
                    	  { throw (new DataFormatException("rule : route:host"));}
                    	  }
                    	  catch (DataFormatException dfe)
                    	  {
                    	   System.out.println(dfe);
                    	   }
                    	
                    	
                    	  Ipaddress nmip = (Ipaddress) nm_ip.lookupValue();
                    	 
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
                    	 
                    	 Route rh = new Route (ip.getString(),nmip.getString(),gwip.getString());
                    	  Symbol s_ret = new Symbol("route_host_string", "host_type_t", rh);
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
        return sym;
    }
    // $ANTLR end route


    // $ANTLR start serv_group
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1208:1: serv_group : 'service_set' '{' ip_addr ( 'netmask' ip_addr )? serv_listen_port ( ',' ip_addr ( nmask )? serv_listen_port )* '}' ;
    public final void serv_group() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1209:2: ( 'service_set' '{' ip_addr ( 'netmask' ip_addr )? serv_listen_port ( ',' ip_addr ( nmask )? serv_listen_port )* '}' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1209:4: 'service_set' '{' ip_addr ( 'netmask' ip_addr )? serv_listen_port ( ',' ip_addr ( nmask )? serv_listen_port )* '}'
            {
            match(input,91,FOLLOW_91_in_serv_group2399); 
            match(input,76,FOLLOW_76_in_serv_group2401); 
            pushFollow(FOLLOW_ip_addr_in_serv_group2403);
            ip_addr();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1209:30: ( 'netmask' ip_addr )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==78) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1209:31: 'netmask' ip_addr
                    {
                    match(input,78,FOLLOW_78_in_serv_group2406); 
                    pushFollow(FOLLOW_ip_addr_in_serv_group2408);
                    ip_addr();
                    _fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_serv_listen_port_in_serv_group2412);
            serv_listen_port();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1209:69: ( ',' ip_addr ( nmask )? serv_listen_port )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1209:70: ',' ip_addr ( nmask )? serv_listen_port
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_serv_group2416); 
            	    pushFollow(FOLLOW_ip_addr_in_serv_group2418);
            	    ip_addr();
            	    _fsp--;

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1209:82: ( nmask )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==78) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1209:83: nmask
            	            {
            	            pushFollow(FOLLOW_nmask_in_serv_group2421);
            	            nmask();
            	            _fsp--;


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_serv_listen_port_in_serv_group2425);
            	    serv_listen_port();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            match(input,77,FOLLOW_77_in_serv_group2430); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1216:1: serv_listen_port : ( NUMBER ) ;
    public final void serv_listen_port() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1217:2: ( ( NUMBER ) )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1217:4: ( NUMBER )
            {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1217:4: ( NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1217:5: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port2450); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1219:1: host_name : ID ;
    public final void host_name() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1220:2: ( ID )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1220:4: ID
            {
            match(input,ID,FOLLOW_ID_in_host_name2460); 

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


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\135\uffff";
    static final String DFA28_eofS =
        "\135\uffff";
    static final String DFA28_minS =
        "\1\10\1\uffff\1\4\4\uffff\2\114\2\uffff\1\10\1\uffff\1\13\1\10\1"+
        "\uffff\1\10\1\14\2\17\1\116\1\13\1\4\4\10\1\14\2\uffff\3\17\1\14"+
        "\1\17\1\116\5\10\5\17\1\14\6\10\1\116\3\17\1\10\1\14\3\10\1\17\1"+
        "\10\1\4\1\14\1\116\1\17\1\10\1\17\1\uffff\1\10\1\17\1\10\1\14\1"+
        "\10\2\17\2\10\1\17\4\10\1\14\1\17\1\10\1\17\1\10\1\17\2\10";
    static final String DFA28_maxS =
        "\1\133\1\uffff\1\73\4\uffff\2\114\2\uffff\1\13\1\uffff\1\125\1\10"+
        "\1\uffff\1\13\1\115\2\17\1\116\1\125\1\73\2\10\2\13\1\115\2\uffff"+
        "\3\17\1\115\1\17\1\116\4\10\1\13\5\17\1\115\5\10\2\116\3\17\1\10"+
        "\1\115\3\10\1\17\1\10\1\133\1\115\1\116\1\17\1\10\1\17\1\uffff\1"+
        "\10\1\17\1\10\1\115\1\10\2\17\2\10\1\17\2\10\1\116\1\10\1\115\1"+
        "\17\1\10\1\17\1\10\1\17\2\10";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\5\1\6\1\7\2\uffff\1\13\1\14\1\uffff\1"+
        "\2\2\uffff\1\4\14\uffff\1\11\1\10\50\uffff\1\12\26\uffff";
    static final String DFA28_specialS =
        "\135\uffff}>";
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
            "\1\21\111\uffff\1\20",
            "\1\22",
            "",
            "\1\23\2\uffff\1\24",
            "\1\25\100\uffff\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\33\111\uffff\1\32",
            "\4\35\7\uffff\1\35\10\uffff\1\35\4\uffff\1\34\1\uffff\1\34\12"+
            "\uffff\1\35\5\uffff\14\35",
            "\1\36",
            "\1\37",
            "\1\40\2\uffff\1\41",
            "\1\42\2\uffff\1\43",
            "\1\25\100\uffff\1\26",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\25\100\uffff\1\26",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\2\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\25\100\uffff\1\26",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\105\uffff\1\71",
            "\1\31",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77\100\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\4\106\7\uffff\1\106\10\uffff\1\106\4\uffff\1\34\14\uffff\1"+
            "\106\5\uffff\14\106\37\uffff\1\34",
            "\1\25\100\uffff\1\26",
            "\1\50",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\25\100\uffff\1\26",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\72",
            "\1\123",
            "\1\125\105\uffff\1\124",
            "\1\126",
            "\1\77\100\uffff\1\100",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\125"
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
            return "378:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | interf | route );";
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
    public static final BitSet FOLLOW_route_oper_in_config_statement223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_oper_in_config_statement240 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_route_in_config_statement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement253 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_interf_in_config_statement261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement265 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement267 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement275 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement277 = new BitSet(new long[]{0x0000000080000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_topology_in_config_statement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement285 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement287 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement296 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_config_statement298 = new BitSet(new long[]{0x0000000080000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_topology_in_config_statement300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement307 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement309 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement312 = new BitSet(new long[]{0x0000000000000800L,0x0000000000018000L});
    public static final BitSet FOLLOW_role_in_config_statement314 = new BitSet(new long[]{0x0000000000000800L,0x0000000000018000L});
    public static final BitSet FOLLOW_object_name_in_config_statement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement328 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement330 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement339 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement341 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_role_in_config_statement343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement349 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement351 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement359 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement361 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_role_in_config_statement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement369 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement371 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_config_statement385 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_policy_in_config_statement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement400 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_config_statement410 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_policy_in_config_statement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement420 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_config_statement422 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement425 = new BitSet(new long[]{0x0000000000000800L,0x0000000000200000L});
    public static final BitSet FOLLOW_host_group_in_config_statement428 = new BitSet(new long[]{0x0000000000000800L,0x0000000000200000L});
    public static final BitSet FOLLOW_object_name_in_config_statement432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_config_statement434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_display_in_config_statement441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_route_oper467 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_route_oper471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_route_oper480 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_route_oper484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_set_oper501 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_set_oper503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_set_oper508 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_set_oper510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_config_display529 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display531 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_config_display533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_config_display538 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_config_display546 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display548 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_config_display550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_config_display554 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_condition_statement578 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_condition_statement580 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_equality_expr_in_condition_statement582 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_condition_statement584 = new BitSet(new long[]{0x1000A387B7002D00L,0x000000000E618FFEL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement586 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_condition_statement589 = new BitSet(new long[]{0x1000A387B7002D00L,0x000000000E618FFEL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement591 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_condition_statement595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_iteration_statement611 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_iteration_statement613 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement615 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_iteration_statement617 = new BitSet(new long[]{0x1000A387B7002D00L,0x000000000E618FFEL});
    public static final BitSet FOLLOW_statement_list_in_iteration_statement619 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_iteration_statement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_print_statement637 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_print_statement639 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_print_statement643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr680 = new BitSet(new long[]{0xE000000000100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr684 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr742 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_conditional_expr750 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_expression_in_conditional_expr752 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_conditional_expr754 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_conditional_expr_in_conditional_expr756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr780 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_logicalOR_expr788 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr790 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr813 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_logicalAND_expr821 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr823 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr847 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_bitwiseOR_expr855 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr857 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr880 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_bitwiseAND_expr888 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr890 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr915 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr924 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr932 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr956 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr967 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_expr_in_relational_expr977 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_term_in_expr1003 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr1014 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_term_in_expr1025 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term1051 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term1062 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_unary_expr_in_term1072 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_unary_expr1106 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression1135 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1138 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression1139 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_factor1219 = new BitSet(new long[]{0x10000200A0002D00L,0x000000000E618000L});
    public static final BitSet FOLLOW_expression_in_factor1221 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_factor1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt1263 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1267 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_COMMA_in_declr_stmt1274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1280 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_declr_stmt1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_object_values1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_role_in_object_values1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interf_in_object_values1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_in_object_values1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_role1489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_role1491 = new BitSet(new long[]{0x0000000000000800L,0x0000000000018000L});
    public static final BitSet FOLLOW_policy_in_role1497 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_object_name_in_role1505 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_role1524 = new BitSet(new long[]{0x0000000000000800L,0x0000000000018000L});
    public static final BitSet FOLLOW_policy_in_role1530 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_object_name_in_role1538 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_role1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_verdict_in_policy1587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_proto_in_policy1591 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_policy1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_policy1611 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1616 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_object_name_in_policy1623 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_port_in_policy1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_verdict_in_policy1663 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy1667 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_policy1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_policy1692 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_policy1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_topology1729 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_role_in_topology1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_topology1739 = new BitSet(new long[]{0x0000000020000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_role_in_topology1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_verdict0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_name1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1931 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1933 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1937 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1939 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1943 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1945 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_nmask1969 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_nmask1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_host1993 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_host1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_host2003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_host2010 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_host2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_host2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2064 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_dns_set2067 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2070 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2080 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_gateway2083 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2085 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_31_in_host_group2106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_host_group2109 = new BitSet(new long[]{0x0000000000000800L,0x0000000000200000L});
    public static final BitSet FOLLOW_host_in_host_group2114 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_object_name_in_host_group2123 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_host_group2136 = new BitSet(new long[]{0x0000000000000800L,0x0000000000200000L});
    public static final BitSet FOLLOW_host_in_host_group2141 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_object_name_in_host_group2152 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_host_group2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_interf2194 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_interf2199 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_interf2207 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_interf2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_interf2220 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2224 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_interf2231 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2236 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_interf2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_interf2250 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_route2279 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_object_name_in_route2290 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_route2296 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_route2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_route2329 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_object_name_in_route2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_route2344 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_object_name_in_route2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_route2359 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_route2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_serv_group2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_serv_group2401 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group2403 = new BitSet(new long[]{0x0000000000000100L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_serv_group2406 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group2408 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group2412 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_serv_group2416 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group2418 = new BitSet(new long[]{0x0000000000000100L,0x0000000000004000L});
    public static final BitSet FOLLOW_nmask_in_serv_group2421 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group2425 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_serv_group2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name2460 = new BitSet(new long[]{0x0000000000000002L});

}