// $ANTLR 3.0.1 D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g 2008-05-10 03:01:15

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "NUMBER", "NM", "STRING", "ID", "CHAR", "ICMP_MESSAGE_TYPE", "DOT", "LETTER", "DIGIT", "EscapeSequence", "LINE_COMMENT", "EQUAL", "WHITESPACE", "'prog'", "'endprog'", "';'", "'ifconfig'", "'apply'", "'topology'", "'undo'", "'context'", "'policy'", "'host_group'", "'route'", "'add'", "'delete'", "'to'", "'from'", "'show'", "'numeric'", "'fw'", "'if'", "'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'echo'", "'?'", "':'", "'||'", "'&&'", "'|'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'~'", "'*='", "'/='", "'+='", "'-='", "','", "'topology_type_t'", "'host_type_t'", "'host_group_type_t'", "'serv_group_type_t'", "'context_type_t'", "'policy_type_t'", "'route_type_t'", "'interface_type_t'", "'ipaddr_t'", "'int_type_t'", "'char_type_t'", "'{'", "'}'", "'dst'", "'netmask'", "'all'", "'src'", "'serv_group'", "'inbound'", "'outbound'", "'allow'", "'deny'", "'udp'", "'tcp'", "'ip_addr'", "'ifname'", "'dns'", "'defgw'", "'host'", "'gw'", "'net'", "'service_group'", "', '"
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
    	            parser.prog();
            	} 
            	catch (RecognitionException e)  
            	{
    	            e.printStackTrace();
            	}
        	}



    // $ANTLR start prog
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:53:1: prog : 'prog' ( statement_list )+ 'endprog' ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:54:2: ( 'prog' ( statement_list )+ 'endprog' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:54:4: 'prog' ( statement_list )+ 'endprog'
            {
            match(input,21,FOLLOW_21_in_prog84); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:54:11: ( statement_list )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER||(LA1_0>=STRING && LA1_0<=CHAR)||(LA1_0>=23 && LA1_0<=25)||(LA1_0>=27 && LA1_0<=28)||(LA1_0>=30 && LA1_0<=33)||(LA1_0>=38 && LA1_0<=40)||LA1_0==44||LA1_0==46||LA1_0==59||(LA1_0>=65 && LA1_0<=75)||(LA1_0>=82 && LA1_0<=84)||(LA1_0>=89 && LA1_0<=90)||LA1_0==93||(LA1_0>=95 && LA1_0<=96)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:54:11: statement_list
            	    {
            	    pushFollow(FOLLOW_statement_list_in_prog86);
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

            match(input,22,FOLLOW_22_in_prog89); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:57:2: statement_list : ( statement | declr_stmt );
    public final void statement_list() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:58:3: ( statement | declr_stmt )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NUMBER||(LA2_0>=STRING && LA2_0<=CHAR)||(LA2_0>=23 && LA2_0<=25)||(LA2_0>=27 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=33)||(LA2_0>=38 && LA2_0<=40)||LA2_0==44||LA2_0==46||LA2_0==59||(LA2_0>=82 && LA2_0<=84)||(LA2_0>=89 && LA2_0<=90)||LA2_0==93||(LA2_0>=95 && LA2_0<=96)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=65 && LA2_0<=75)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("57:2: statement_list : ( statement | declr_stmt );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:58:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_statement_list105);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:59:6: declr_stmt
                    {
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
        return ;
    }
    // $ANTLR end statement_list


    // $ANTLR start statement
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:62:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:63:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt3=4;
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
                    new NoViableAltException("62:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:63:5: condition_statement
                    {
                    pushFollow(FOLLOW_condition_statement_in_statement127);
                    condition_statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:64:5: iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement133);
                    iteration_statement();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:65:5: statement_expr
                    {
                    pushFollow(FOLLOW_statement_expr_in_statement139);
                    statement_expr();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:66:5: print_statement
                    {
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
        return ;
    }
    // $ANTLR end statement


    // $ANTLR start statement_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );
    public final void statement_expr() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:70:3: ( ';' | expression ';' | config_statement ';' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=PLUS && LA4_2<=DIV)||LA4_2==DOT||LA4_2==EQUAL||LA4_2==47||(LA4_2>=49 && LA4_2<=58)||(LA4_2>=60 && LA4_2<=63)) ) {
                    alt4=2;
                }
                else if ( (LA4_2==23) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 28:
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
                                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 46, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 43, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 39, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 34, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 28, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 23, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 17, input);

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
                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 18, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 13, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 38, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 33, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 27, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 22, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 12, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 8, input);

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
                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 46, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 43, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 39, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 34, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 28, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 23, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 17, input);

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
                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 13, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 9, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 4, input);

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
                                                                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                                                throw nvae;
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            NoViableAltException nvae =
                                                                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                                            throw nvae;
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        NoViableAltException nvae =
                                                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                                        throw nvae;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    NoViableAltException nvae =
                                                                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                                                    throw nvae;
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                NoViableAltException nvae =
                                                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                                                throw nvae;
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            NoViableAltException nvae =
                                                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                                            throw nvae;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        NoViableAltException nvae =
                                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

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
                                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 47, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 44, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 41, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 36, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 30, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 25, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 20, input);

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
                                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

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
                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 21, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 15, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 40, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 35, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 29, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 24, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 10, input);

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
                                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                                        throw nvae;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

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
                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 47, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 44, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 41, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 36, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 30, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 25, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 20, input);

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
                                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 50, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 49, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 48, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 45, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 42, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 37, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 31, input);

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
                                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 26, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 21, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 15, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 11, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 25:
            case 27:
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
                    new NoViableAltException("69:2: statement_expr : ( ';' | expression ';' | config_statement ';' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:70:5: ';'
                    {
                    match(input,23,FOLLOW_23_in_statement_expr161); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:71:5: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement_expr167);
                    expression();
                    _fsp--;

                    match(input,23,FOLLOW_23_in_statement_expr169); 

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:72:28: config_statement ';'
                    {
                    pushFollow(FOLLOW_config_statement_in_statement_expr198);
                    config_statement();
                    _fsp--;

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
        return ;
    }
    // $ANTLR end statement_expr


    // $ANTLR start config_statement
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );
    public final void config_statement() throws RecognitionException {
        String route_cmd = null;

        object_name_return robj = null;

        String route_cmd2 = null;

        Symbol robj2 = null;

        object_name_return interf_object_name = null;

        Symbol interf_sym = null;

        object_name_return topology_obj_name = null;

        Symbol topology_sym = null;

        object_name_return context_obj_name = null;

        Symbol context_sym = null;

        object_name_return var = null;

        Symbol policy_sym = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:76:3: (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display )
            int alt15=13;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    int LA15_10 = input.LA(3);

                    if ( (LA15_10==93||LA15_10==95) ) {
                        alt15=2;
                    }
                    else if ( (LA15_10==ID) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA15_11 = input.LA(3);

                    if ( (LA15_11==93||LA15_11==95) ) {
                        alt15=2;
                    }
                    else if ( (LA15_11==ID) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                    {
                    alt15=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 2, input);

                    throw nvae;
                }

                }
                break;
            case 93:
            case 95:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            case 25:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt15=8;
                    }
                    break;
                case 29:
                    {
                    alt15=10;
                    }
                    break;
                case 26:
                    {
                    alt15=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 5, input);

                    throw nvae;
                }

                }
                break;
            case 27:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt15=9;
                    }
                    break;
                case 26:
                    {
                    int LA15_16 = input.LA(3);

                    if ( (LA15_16==30||LA15_16==82) ) {
                        alt15=6;
                    }
                    else if ( (LA15_16==ID) ) {
                        alt15=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 29:
                    {
                    alt15=11;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 6, input);

                    throw nvae;
                }

                }
                break;
            case 32:
                {
                int LA15_7 = input.LA(2);

                if ( (LA15_7==34) ) {
                    int LA15_18 = input.LA(3);

                    if ( (LA15_18==30) ) {
                        alt15=12;
                    }
                    else if ( (LA15_18==28) ) {
                        alt15=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 18, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 7, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA15_8 = input.LA(2);

                if ( (LA15_8==35) ) {
                    int LA15_19 = input.LA(3);

                    if ( (LA15_19==30) ) {
                        alt15=12;
                    }
                    else if ( (LA15_19==28) ) {
                        alt15=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 19, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 8, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt15=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("75:2: config_statement : (route_cmd= route_oper robj= object_name | route_cmd2= route_oper robj2= route | 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) ) | 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) ) | 'undo' 'topology' object_name | 'undo' 'topology' topology | set_oper 'context' ( object_name | context ) ( object_name | policy ) | 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) ) | 'undo' 'context' ( (var= object_name ) | (context_sym= context ) ) | 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) ) | set_oper 'host_group' ( object_name | host_group ) ( object_name | host ) | config_display );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:77:5: route_cmd= route_oper robj= object_name
                    {
                    pushFollow(FOLLOW_route_oper_in_config_statement224);
                    route_cmd=route_oper();
                    _fsp--;

                    pushFollow(FOLLOW_object_name_in_config_statement228);
                    robj=object_name();
                    _fsp--;

                    
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
                     	   route.configure("route.xml",route_cmd,"route");
                     	   }
                     	  
                     	  

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:97:4: route_cmd2= route_oper robj2= route
                    {
                    pushFollow(FOLLOW_route_oper_in_config_statement241);
                    route_cmd2=route_oper();
                    _fsp--;

                    pushFollow(FOLLOW_route_in_config_statement245);
                    robj2=route();
                    _fsp--;

                    
                     	Route r=(Route)robj2.lookupValue();
                     	if(r!=null)
                     	{
                     	r.configure("route.xml",route_cmd2,"route");
                     	}
                     	

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:106:3: 'ifconfig' ( (interf_object_name= object_name ) | (interf_sym= interf ) )
                    {
                    Interface ifc=null;
                    match(input,24,FOLLOW_24_in_config_statement262); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:107:15: ( (interf_object_name= object_name ) | (interf_sym= interf ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==90) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("107:15: ( (interf_object_name= object_name ) | (interf_sym= interf ) )", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:107:16: (interf_object_name= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:107:16: (interf_object_name= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:107:17: interf_object_name= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement269);
                            interf_object_name=object_name();
                            _fsp--;


                            }

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
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:123:5: (interf_sym= interf )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:123:5: (interf_sym= interf )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:123:6: interf_sym= interf
                            {
                            pushFollow(FOLLOW_interf_in_config_statement284);
                            interf_sym=interf();
                            _fsp--;


                            }

                            
                            	   ifc = (Interface)interf_sym.lookupValue();
                            	   

                            }
                            break;

                    }

                    	
                    	  
                     	  ifc.configure("interface.xml","InterfConfig","ifconf");	
                    	

                    }
                    break;
                case 4 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:153:2: 'apply' 'topology' ( (topology_obj_name= object_name ) | (topology_sym= topology ) )
                    {
                    Topology topology = null;
                    match(input,25,FOLLOW_25_in_config_statement304); 
                    match(input,26,FOLLOW_26_in_config_statement306); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:154:21: ( (topology_obj_name= object_name ) | (topology_sym= topology ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==30||LA6_0==82) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("154:21: ( (topology_obj_name= object_name ) | (topology_sym= topology ) )", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:154:22: (topology_obj_name= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:154:22: (topology_obj_name= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:154:23: topology_obj_name= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement312);
                            topology_obj_name=object_name();
                            _fsp--;


                            }

                            
                            	
                            	Symbol s = (Symbol) currentScope.getSymbol(input.toString(topology_obj_name.start,topology_obj_name.stop));
                             	  try{
                             	 if (s.type.equals("topology_type_t")!=true)
                             	 {
                             	   throw (new DataFormatException(" apply : topology : object"));
                             	 }
                             	 }
                             	 
                             	 catch (DataFormatException dfe)
                             	 {
                             	    System.out.println(dfe);
                             	  }
                             
                                                        	
                             	  Topology tolpology = (Topology) currentScope.lookup(input.toString(topology_obj_name.start,topology_obj_name.stop));
                             	  

                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:172:8: (topology_sym= topology )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:172:8: (topology_sym= topology )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:172:9: topology_sym= topology
                            {
                            pushFollow(FOLLOW_topology_in_config_statement324);
                            topology_sym=topology();
                            _fsp--;


                            }

                            
                             	   topology = (Topology) topology_sym.lookupValue();
                             	   

                            }
                            break;

                    }

                      
                     	  
                     	  if (topology.hostGroup != null) 
                     	     {
                     	     
                     	     Hostgroup hg;
                     	     hg = topology.hostGroup;
                     	     Context cxt;
                     	     cxt = topology.context;
                     	     Iterator <Host> hostiter= hg.hostGroup.iterator();
                     	     Iterator <Policy> policyiter= cxt.context.iterator();
                    	       
                       	System.out.println(hg.getString());
                       	System.out.println(cxt.getString());
                           	 while(hostiter.hasNext())
                            	{
                    	    while(policyiter.hasNext())
                    	    {
                    	       Host h = hostiter.next();
                    	       Policy p = policyiter.next();
                    	       if(p.direction.equals("inbound")==true)
                    	       {
                    	         if(p.destIpAddress.getString().equals("0.0.0.0") == true)
                    	         {
                    	           p.destIpAddress = new Ipaddress(h.ipAddress.getString());
                    	           p.destNetMask = new Ipaddress(h.netMask.getString());
                    	           }
                    	           else 
                    	           	{ System.out.println(" dest IP address alredy present in policy : "+p.getString());
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
                    	           	{ System.out.println(" Source IP address alredy present in policy : "+p.getString());
                    	           	   System.exit(0);
                    	           	   }	
                    	      
                    	       
                    	       }
                    	      
                    	       p.configure("fw.xml","PolicyAdd","topo_host2");  
                    	       
                    	       }//while2
                    	       }//while1
                    	    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    if (topology.serviceGroup != null) 
                     	     {
                     	     
                     	     Servicegroup sg;
                     	     sg = topology.serviceGroup;
                     	     Context cxt;
                     	     cxt = topology.context;
                     	     Iterator <Servicedescriptor> serviter= sg.serviceGroup.iterator();
                     	     Iterator <Policy> policyiter= cxt.context.iterator();
                    	       
                    	
                           	 while(serviter.hasNext())
                            	{
                    	    while(policyiter.hasNext())
                    	    {
                    	       Servicedescriptor s = serviter.next();
                    	       Policy p = policyiter.next();
                    	       if(p.direction.equals("inbound")==true)
                    	       {
                    	         if(p.destIpAddress.getString().equals("0.0.0.0") == true)
                    	         {
                    	           p.destIpAddress = new Ipaddress(s.ipAddress.getString());
                    	           p.destNetMask = new Ipaddress(s.netMask.getString());
                    	           p.destPort=s.port;
                    	           }
                    	           else 
                    	           	{ System.out.println(" dest IP address alredy present in policy : "+p.getString());
                    	           	   System.exit(0);
                    	           	   }	
                    	       }
                    	       else
                    	       {
                    	       
                    	       if(p.sourceIpAddress.getString().equals("0.0.0.0") == true)
                    	         {
                    	           p.sourceIpAddress = new Ipaddress(s.ipAddress.getString());
                    	           p.sourceNetMask = new Ipaddress(s.netMask.getString());
                    	           p.sourcePort=s.port;
                    	           }
                    	           else 
                    	           	{ System.out.println(" Source IP address alredy present in policy : "+p.getString());
                    	           	   System.exit(0);
                    	           	   }	
                    	       
                    	       
                    	       }
                    	      
                    	       p.configure("fw.xml","PolicyAdd","topo_serv");  
                    	       
                    	       }//while2
                    	       }//while1
                    	    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    	   

                    }
                    break;
                case 5 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:312:5: 'undo' 'topology' object_name
                    {
                    match(input,27,FOLLOW_27_in_config_statement357); 
                    match(input,26,FOLLOW_26_in_config_statement359); 
                    pushFollow(FOLLOW_object_name_in_config_statement361);
                    object_name();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:313:5: 'undo' 'topology' topology
                    {
                    match(input,27,FOLLOW_27_in_config_statement368); 
                    match(input,26,FOLLOW_26_in_config_statement370); 
                    pushFollow(FOLLOW_topology_in_config_statement372);
                    topology();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:6: set_oper 'context' ( object_name | context ) ( object_name | policy )
                    {
                    pushFollow(FOLLOW_set_oper_in_config_statement379);
                    set_oper();
                    _fsp--;

                    match(input,28,FOLLOW_28_in_config_statement381); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:25: ( object_name | context )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ID) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==28) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("314:25: ( object_name | context )", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:26: object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement384);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:38: context
                            {
                            pushFollow(FOLLOW_context_in_config_statement386);
                            context();
                            _fsp--;


                            }
                            break;

                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:47: ( object_name | policy )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ID) ) {
                        alt8=1;
                    }
                    else if ( ((LA8_0>=83 && LA8_0<=84)) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("314:47: ( object_name | policy )", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:48: object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement390);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:314:60: policy
                            {
                            pushFollow(FOLLOW_policy_in_config_statement392);
                            policy();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:317:3: 'apply' 'context' ( (context_obj_name= object_name ) | (context_sym= context ) )
                    {
                    Context cxt = null; 
                    match(input,25,FOLLOW_25_in_config_statement407); 
                    match(input,28,FOLLOW_28_in_config_statement409); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:318:20: ( (context_obj_name= object_name ) | (context_sym= context ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ID) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==28) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("318:20: ( (context_obj_name= object_name ) | (context_sym= context ) )", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:318:21: (context_obj_name= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:318:21: (context_obj_name= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:318:22: context_obj_name= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement415);
                            context_obj_name=object_name();
                            _fsp--;


                            }

                            
                            	
                            	 Symbol s = (Symbol) currentScope.getSymbol(input.toString(context_obj_name.start,context_obj_name.stop));
                             	  try{
                             	  System.out.println(s.type);
                             	 if (s.type.equals("context_type_t")!=true)
                             	 {
                             	   throw (new DataFormatException(" apply:context:policy object"));
                             	 }
                             	 }
                             	 catch (DataFormatException dfe)
                             	 {
                             	    System.out.println(dfe);
                             	  }
                             	cxt = (Context)s.lookupValue();
                             	

                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:334:5: (context_sym= context )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:334:5: (context_sym= context )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:334:6: context_sym= context
                            {
                            pushFollow(FOLLOW_context_in_config_statement428);
                            context_sym=context();
                            _fsp--;


                            }

                            
                             	cxt = (Context)context_sym.lookupValue();
                             	

                            }
                            break;

                    }

                    
                     	 Iterator <Policy> iter =cxt.context.iterator();
                     	 while(iter.hasNext())
                     	 { 
                     	   iter.next().configure("fw.xml","PolicyAdd","contextadd");	
                     	 }
                     	 
                     	

                    }
                    break;
                case 9 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:347:5: 'undo' 'context' ( (var= object_name ) | (context_sym= context ) )
                    {
                    Context cxt = null;
                    match(input,27,FOLLOW_27_in_config_statement450); 
                    match(input,28,FOLLOW_28_in_config_statement452); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:348:20: ( (var= object_name ) | (context_sym= context ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==28) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("348:20: ( (var= object_name ) | (context_sym= context ) )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:348:21: (var= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:348:21: (var= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:348:22: var= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement458);
                            var=object_name();
                            _fsp--;


                            }

                            
                             	   Symbol s = (Symbol) currentScope.getSymbol(input.toString(var.start,var.stop));	
                             	
                             	  try{
                             	          if (s.type.equals("context_type_t")!=true)
                             	         {
                             	           throw (new DataFormatException(" undo:policy:policy object"));
                             	           }
                             	     }
                             	  catch (DataFormatException dfe)
                             	 {
                             	    System.out.println(dfe);
                             	  }	
                             	cxt = (Context)s.lookupValue();
                             	

                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:364:3: (context_sym= context )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:364:3: (context_sym= context )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:364:4: context_sym= context
                            {
                            pushFollow(FOLLOW_context_in_config_statement473);
                            context_sym=context();
                            _fsp--;


                            }

                            
                             	 cxt = (Context)context_sym.lookupValue();

                            }
                            break;

                    }

                    
                     	 
                     	 Iterator <Policy> iter =cxt.context.iterator();
                     	 while(iter.hasNext())
                     	 { 
                     	   iter.next().configure("fw.xml","PolicyDelete","contextdel");	
                     	 }
                     	  	  
                     	 

                    }
                    break;
                case 10 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:378:4: 'apply' 'policy' ( (var= object_name ) | (policy_sym= policy ) )
                    {
                     Policy p=null;
                    match(input,25,FOLLOW_25_in_config_statement502); 
                    match(input,29,FOLLOW_29_in_config_statement504); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:379:21: ( (var= object_name ) | (policy_sym= policy ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_0>=83 && LA11_0<=84)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("379:21: ( (var= object_name ) | (policy_sym= policy ) )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:379:22: (var= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:379:22: (var= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:379:23: var= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement510);
                            var=object_name();
                            _fsp--;


                            }

                            
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
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:397:3: (policy_sym= policy )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:397:3: (policy_sym= policy )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:397:4: policy_sym= policy
                            {
                            pushFollow(FOLLOW_policy_in_config_statement533);
                            policy_sym=policy();
                            _fsp--;


                            }

                            
                            		p = (Policy)policy_sym.lookupValue();
                            		
                            		

                            }
                            break;

                    }

                    
                     	 	   p.configure("fw.xml","PolicyAdd","policyadd");
                     	 	

                    }
                    break;
                case 11 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:408:4: 'undo' 'policy' ( (var= object_name ) | (policy_sym= policy ) )
                    {
                     Policy p = null;
                    match(input,27,FOLLOW_27_in_config_statement565); 
                    match(input,29,FOLLOW_29_in_config_statement567); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:18: ( (var= object_name ) | (policy_sym= policy ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ID) ) {
                        alt12=1;
                    }
                    else if ( ((LA12_0>=83 && LA12_0<=84)) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("409:18: ( (var= object_name ) | (policy_sym= policy ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:19: (var= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:19: (var= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:409:20: var= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement572);
                            var=object_name();
                            _fsp--;


                            }

                            
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
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:427:3: (policy_sym= policy )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:427:3: (policy_sym= policy )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:427:4: policy_sym= policy
                            {
                            pushFollow(FOLLOW_policy_in_config_statement595);
                            policy_sym=policy();
                            _fsp--;


                            }

                            
                            		p = (Policy)policy_sym.lookupValue();
                            		
                            		

                            }
                            break;

                    }

                    
                     	 	   p.configure("fw.xml","PolicyDelete","policydel");
                     	 	

                    }
                    break;
                case 12 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:437:5: set_oper 'host_group' ( object_name | host_group ) ( object_name | host )
                    {
                    pushFollow(FOLLOW_set_oper_in_config_statement616);
                    set_oper();
                    _fsp--;

                    match(input,30,FOLLOW_30_in_config_statement618); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:437:27: ( object_name | host_group )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ID) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==30) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("437:27: ( object_name | host_group )", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:437:28: object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement621);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:437:41: host_group
                            {
                            pushFollow(FOLLOW_host_group_in_config_statement624);
                            host_group();
                            _fsp--;


                            }
                            break;

                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:437:53: ( object_name | host )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ID) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==89) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("437:53: ( object_name | host )", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:437:54: object_name
                            {
                            pushFollow(FOLLOW_object_name_in_config_statement628);
                            object_name();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:437:66: host
                            {
                            pushFollow(FOLLOW_host_in_config_statement630);
                            host();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 13 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:439:3: config_display
                    {
                    pushFollow(FOLLOW_config_display_in_config_statement637);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:442:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );
    public final String route_oper() throws RecognitionException {
        String route_cmd = null;

        Token cmd=null;
        Token sub_cmd=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:443:3: ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||LA16_0==93||LA16_0==95) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==33) ) {
                    alt16=3;
                }
                else if ( (LA16_2==32) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("442:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("442:2: route_oper returns [String route_cmd] : ( | cmd= 'route' sub_cmd= 'add' | cmd= 'route' sub_cmd= 'delete' );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:444:2: 
                    {
                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:444:3: cmd= 'route' sub_cmd= 'add'
                    {
                    cmd=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_route_oper663); 
                    sub_cmd=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_route_oper667); 
                     route_cmd = "RouteAdd";

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:445:4: cmd= 'route' sub_cmd= 'delete'
                    {
                    cmd=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_route_oper676); 
                    sub_cmd=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_route_oper680); 
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
        return route_cmd;
    }
    // $ANTLR end route_oper


    // $ANTLR start set_oper
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:448:1: set_oper : ( 'add' 'to' | 'delete' 'from' );
    public final void set_oper() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:449:2: ( 'add' 'to' | 'delete' 'from' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            else if ( (LA17_0==33) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("448:1: set_oper : ( 'add' 'to' | 'delete' 'from' );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:450:2: 'add' 'to'
                    {
                    match(input,32,FOLLOW_32_in_set_oper697); 
                    match(input,34,FOLLOW_34_in_set_oper699); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:451:4: 'delete' 'from'
                    {
                    match(input,33,FOLLOW_33_in_set_oper704); 
                    match(input,35,FOLLOW_35_in_set_oper706); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:454:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );
    public final void config_display() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:455:3: ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==36) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==37) ) {
                        alt18=1;
                    }
                    else if ( (LA18_3==23) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("454:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 18, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("454:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==38) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==36) ) {
                    int LA18_4 = input.LA(3);

                    if ( (LA18_4==37) ) {
                        alt18=3;
                    }
                    else if ( (LA18_4==23) ) {
                        alt18=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("454:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 18, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("454:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("454:2: config_display : ( 'route' 'show' 'numeric' | 'route' 'show' | 'fw' 'show' 'numeric' | 'fw' 'show' );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:456:4: 'route' 'show' 'numeric'
                    {
                    match(input,31,FOLLOW_31_in_config_display725); 
                    match(input,36,FOLLOW_36_in_config_display727); 
                    match(input,37,FOLLOW_37_in_config_display729); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:457:4: 'route' 'show'
                    {
                    match(input,31,FOLLOW_31_in_config_display734); 
                    match(input,36,FOLLOW_36_in_config_display736); 

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:458:4: 'fw' 'show' 'numeric'
                    {
                    match(input,38,FOLLOW_38_in_config_display742); 
                    match(input,36,FOLLOW_36_in_config_display744); 
                    match(input,37,FOLLOW_37_in_config_display746); 

                    }
                    break;
                case 4 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:459:3: 'fw' 'show'
                    {
                    match(input,38,FOLLOW_38_in_config_display751); 
                    match(input,36,FOLLOW_36_in_config_display753); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:464:2: condition_statement : 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' ;
    public final void condition_statement() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:465:3: ( 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:465:5: 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif'
            {
            match(input,39,FOLLOW_39_in_condition_statement775); 
            match(input,40,FOLLOW_40_in_condition_statement777); 
            pushFollow(FOLLOW_equality_expr_in_condition_statement779);
            equality_expr();
            _fsp--;

            match(input,41,FOLLOW_41_in_condition_statement781); 
            pushFollow(FOLLOW_statement_list_in_condition_statement783);
            statement_list();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:465:47: ( 'else' statement_list )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:465:48: 'else' statement_list
                    {
                    match(input,42,FOLLOW_42_in_condition_statement786); 
                    pushFollow(FOLLOW_statement_list_in_condition_statement788);
                    statement_list();
                    _fsp--;


                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_condition_statement792); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:468:2: iteration_statement : 'while' '(' equality_expr ')' statement_list 'endwhile' ;
    public final void iteration_statement() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:469:3: ( 'while' '(' equality_expr ')' statement_list 'endwhile' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:469:5: 'while' '(' equality_expr ')' statement_list 'endwhile'
            {
            match(input,44,FOLLOW_44_in_iteration_statement808); 
            match(input,40,FOLLOW_40_in_iteration_statement810); 
            pushFollow(FOLLOW_equality_expr_in_iteration_statement812);
            equality_expr();
            _fsp--;

            match(input,41,FOLLOW_41_in_iteration_statement814); 
            pushFollow(FOLLOW_statement_list_in_iteration_statement816);
            statement_list();
            _fsp--;

            match(input,45,FOLLOW_45_in_iteration_statement818); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:472:2: print_statement : 'echo' STRING ';' ;
    public final void print_statement() throws RecognitionException {
        Token STRING1=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:473:3: ( 'echo' STRING ';' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:473:5: 'echo' STRING ';'
            {
            match(input,46,FOLLOW_46_in_print_statement834); 
            STRING1=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement836); 
            System.out.println(STRING1);
            match(input,23,FOLLOW_23_in_print_statement840); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:476:2: expression : assignment_expr ;
    public final void expression() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:477:3: ( assignment_expr )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:477:5: assignment_expr
            {
            pushFollow(FOLLOW_assignment_expr_in_expression856);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:480:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );
    public final void assignment_expr() throws RecognitionException {
        object_name_return var = null;

        assignment_operator_return op = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:481:4: (var= object_name op= assignment_operator assignment_expr | e= conditional_expr )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>=PLUS && LA20_1<=DIV)||LA20_1==DOT||LA20_1==23||LA20_1==41||(LA20_1>=47 && LA20_1<=58)) ) {
                    alt20=2;
                }
                else if ( (LA20_1==EQUAL||(LA20_1>=60 && LA20_1<=63)) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("480:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==NUMBER||LA20_0==STRING||LA20_0==CHAR||LA20_0==28||LA20_0==30||LA20_0==40||LA20_0==59||(LA20_0>=82 && LA20_0<=84)||(LA20_0>=89 && LA20_0<=90)||LA20_0==93||(LA20_0>=95 && LA20_0<=96)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("480:2: assignment_expr : (var= object_name op= assignment_operator assignment_expr | e= conditional_expr );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:481:7: var= object_name op= assignment_operator assignment_expr
                    {
                    pushFollow(FOLLOW_object_name_in_assignment_expr877);
                    var=object_name();
                    _fsp--;

                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr881);
                    op=assignment_operator();
                    _fsp--;

                    
                    	 		Symbol s = currentScope.getSymbol(input.toString(var.start,var.stop));
                    			Assignment ans = new Assignment(s, input.toString(op.start,op.stop));
                    			map.put(input.toString(var.start,var.stop), ans);
                    			System.out.println("here");
                    		//	currentScope.printSymbols();
                    	 	
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr892);
                    assignment_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:491:6: e= conditional_expr
                    {
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr905);
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
        return ;
    }
    // $ANTLR end assignment_expr


    // $ANTLR start conditional_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:550:2: conditional_expr returns [Symbol sym] : e= logicalOR_expr ( '?' expression ':' conditional_expr )? ;
    public final Symbol conditional_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:551:3: (e= logicalOR_expr ( '?' expression ':' conditional_expr )? )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:551:5: e= logicalOR_expr ( '?' expression ':' conditional_expr )?
            {
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr939);
            e=logicalOR_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:552:3: ( '?' expression ':' conditional_expr )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:552:5: '?' expression ':' conditional_expr
                    {
                    match(input,47,FOLLOW_47_in_conditional_expr947); 
                    pushFollow(FOLLOW_expression_in_conditional_expr949);
                    expression();
                    _fsp--;

                    match(input,48,FOLLOW_48_in_conditional_expr951); 
                    pushFollow(FOLLOW_conditional_expr_in_conditional_expr953);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:555:2: logicalOR_expr returns [Symbol sym] : e= logicalAND_expr ( '||' logicalAND_expr )* ;
    public final Symbol logicalOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:556:3: (e= logicalAND_expr ( '||' logicalAND_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:556:5: e= logicalAND_expr ( '||' logicalAND_expr )*
            {
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr977);
            e=logicalAND_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:557:3: ( '||' logicalAND_expr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==49) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:557:4: '||' logicalAND_expr
            	    {
            	    match(input,49,FOLLOW_49_in_logicalOR_expr985); 
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr987);
            	    logicalAND_expr();
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
    // $ANTLR end logicalOR_expr


    // $ANTLR start logicalAND_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:560:2: logicalAND_expr returns [Symbol sym] : e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* ;
    public final Symbol logicalAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:561:3: (e= bitwiseOR_expr ( '&&' bitwiseOR_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:561:5: e= bitwiseOR_expr ( '&&' bitwiseOR_expr )*
            {
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr1010);
            e=bitwiseOR_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:562:3: ( '&&' bitwiseOR_expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==50) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:562:4: '&&' bitwiseOR_expr
            	    {
            	    match(input,50,FOLLOW_50_in_logicalAND_expr1018); 
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr1020);
            	    bitwiseOR_expr();
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
    // $ANTLR end logicalAND_expr


    // $ANTLR start bitwiseOR_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:565:2: bitwiseOR_expr returns [Symbol sym] : e= bitwiseAND_expr ( '|' bitwiseAND_expr )* ;
    public final Symbol bitwiseOR_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:566:3: (e= bitwiseAND_expr ( '|' bitwiseAND_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:566:5: e= bitwiseAND_expr ( '|' bitwiseAND_expr )*
            {
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr1044);
            e=bitwiseAND_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:567:3: ( '|' bitwiseAND_expr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==51) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:567:4: '|' bitwiseAND_expr
            	    {
            	    match(input,51,FOLLOW_51_in_bitwiseOR_expr1052); 
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr1054);
            	    bitwiseAND_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:570:2: bitwiseAND_expr returns [Symbol sym] : e= equality_expr ( '&' equality_expr )* ;
    public final Symbol bitwiseAND_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:571:3: (e= equality_expr ( '&' equality_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:571:5: e= equality_expr ( '&' equality_expr )*
            {
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr1077);
            e=equality_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:572:3: ( '&' equality_expr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==52) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:572:4: '&' equality_expr
            	    {
            	    match(input,52,FOLLOW_52_in_bitwiseAND_expr1085); 
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr1087);
            	    equality_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:575:2: equality_expr returns [Symbol sym] : e= relational_expr ( ( '==' | '!=' ) relational_expr )* ;
    public final Symbol equality_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:576:3: (e= relational_expr ( ( '==' | '!=' ) relational_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:576:5: e= relational_expr ( ( '==' | '!=' ) relational_expr )*
            {
            pushFollow(FOLLOW_relational_expr_in_equality_expr1112);
            e=relational_expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:577:3: ( ( '==' | '!=' ) relational_expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=53 && LA26_0<=54)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:577:5: ( '==' | '!=' ) relational_expr
            	    {
            	    if ( (input.LA(1)>=53 && input.LA(1)<=54) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr1121);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expr_in_equality_expr1129);
            	    relational_expr();
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
        return sym;
    }
    // $ANTLR end equality_expr


    // $ANTLR start relational_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:580:2: relational_expr returns [Symbol sym] : e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* ;
    public final Symbol relational_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:581:3: (e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:581:5: e= expr ( ( '<' | '>' | '<=' | '>=' ) expr )*
            {
            pushFollow(FOLLOW_expr_in_relational_expr1153);
            e=expr();
            _fsp--;

             sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:582:3: ( ( '<' | '>' | '<=' | '>=' ) expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=55 && LA27_0<=58)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:582:5: ( '<' | '>' | '<=' | '>=' ) expr
            	    {
            	    if ( (input.LA(1)>=55 && input.LA(1)<=58) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr1164);    throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_in_relational_expr1174);
            	    expr();
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
        return sym;
    }
    // $ANTLR end relational_expr


    // $ANTLR start expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:586:2: expr returns [Symbol sym] : e= term ( ( PLUS | MINUS ) term )* ;
    public final Symbol expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:587:3: (e= term ( ( PLUS | MINUS ) term )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:587:5: e= term ( ( PLUS | MINUS ) term )*
            {
            pushFollow(FOLLOW_term_in_expr1200);
            e=term();
            _fsp--;

            sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:588:3: ( ( PLUS | MINUS ) term )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=PLUS && LA28_0<=MINUS)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:588:5: ( PLUS | MINUS ) term
            	    {
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr1211);    throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr1222);
            	    term();
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
        return sym;
    }
    // $ANTLR end expr


    // $ANTLR start term
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:591:2: term returns [Symbol sym] : e= unary_expr ( ( MULT | DIV ) unary_expr )* ;
    public final Symbol term() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:592:3: (e= unary_expr ( ( MULT | DIV ) unary_expr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:592:5: e= unary_expr ( ( MULT | DIV ) unary_expr )*
            {
            pushFollow(FOLLOW_unary_expr_in_term1248);
            e=unary_expr();
            _fsp--;

            sym = e;
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:593:3: ( ( MULT | DIV ) unary_expr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=MULT && LA29_0<=DIV)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:593:5: ( MULT | DIV ) unary_expr
            	    {
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term1259);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unary_expr_in_term1269);
            	    unary_expr();
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
        return sym;
    }
    // $ANTLR end term


    // $ANTLR start unary_expr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:596:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );
    public final Symbol unary_expr() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:597:3: (e= postfix_expression | '~' unary_expr )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==NUMBER||(LA30_0>=STRING && LA30_0<=CHAR)||LA30_0==28||LA30_0==30||LA30_0==40||(LA30_0>=82 && LA30_0<=84)||(LA30_0>=89 && LA30_0<=90)||LA30_0==93||(LA30_0>=95 && LA30_0<=96)) ) {
                alt30=1;
            }
            else if ( (LA30_0==59) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("596:2: unary_expr returns [Symbol sym] : (e= postfix_expression | '~' unary_expr );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:597:5: e= postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr1295);
                    e=postfix_expression();
                    _fsp--;

                    sym = e;

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:598:5: '~' unary_expr
                    {
                    match(input,59,FOLLOW_59_in_unary_expr1303); 
                    pushFollow(FOLLOW_unary_expr_in_unary_expr1305);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:603:2: postfix_expression returns [Symbol sym] : e= factor ( '.' ID )* ;
    public final Symbol postfix_expression() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:604:3: (e= factor ( '.' ID )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:604:5: e= factor ( '.' ID )*
            {
            pushFollow(FOLLOW_factor_in_postfix_expression1332);
            e=factor();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:604:14: ( '.' ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==DOT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:604:15: '.' ID
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression1335); 
            	    match(input,ID,FOLLOW_ID_in_postfix_expression1336); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:607:2: assignment_operator : ( '=' | '*=' | '/=' | '+=' | '-=' );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:608:3: ( '=' | '*=' | '/=' | '+=' | '-=' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            if ( input.LA(1)==EQUAL||(input.LA(1)>=60 && input.LA(1)<=63) ) {
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:615:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );
    public final Symbol factor() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:617:2: ( ID | e= literal | '(' expression ')' )
            int alt32=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt32=1;
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 28:
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
                alt32=2;
                }
                break;
            case 40:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("615:2: factor returns [Symbol sym] : ( ID | e= literal | '(' expression ')' );", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:617:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor1399); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:618:5: e= literal
                    {
                    pushFollow(FOLLOW_literal_in_factor1407);
                    e=literal();
                    _fsp--;

                    sym = e;

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:619:5: '(' expression ')'
                    {
                    match(input,40,FOLLOW_40_in_factor1416); 
                    pushFollow(FOLLOW_expression_in_factor1418);
                    expression();
                    _fsp--;

                    match(input,41,FOLLOW_41_in_factor1420); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:622:2: literal returns [Symbol sym] : e= object_values ;
    public final Symbol literal() throws RecognitionException {
        Symbol sym = null;

        Symbol e = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:623:3: (e= object_values )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:623:5: e= object_values
            {
            pushFollow(FOLLOW_object_values_in_literal1442);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:626:1: declr_stmt : type_name var_name= object_name ( ',' next_var= object_name )* ';' ;
    public final void declr_stmt() throws RecognitionException {
        object_name_return var_name = null;

        object_name_return next_var = null;

        type_name_return type_name2 = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:627:2: ( type_name var_name= object_name ( ',' next_var= object_name )* ';' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:628:2: type_name var_name= object_name ( ',' next_var= object_name )* ';'
            {
            int count_com = 0;
            pushFollow(FOLLOW_type_name_in_declr_stmt1460);
            type_name2=type_name();
            _fsp--;

            pushFollow(FOLLOW_object_name_in_declr_stmt1464);
            var_name=object_name();
            _fsp--;

            
            		System.out.println(" type : " + input.toString(type_name2.start,type_name2.stop) +" var : "+ input.toString(var_name.start,var_name.stop));
            		currentScope.defineSymbol(input.toString(var_name.start,var_name.stop), input.toString(type_name2.start,type_name2.stop));
            	
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:634:2: ( ',' next_var= object_name )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==64) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:634:3: ',' next_var= object_name
            	    {
            	    match(input,64,FOLLOW_64_in_declr_stmt1471); 
            	    count_com++;
            	    pushFollow(FOLLOW_object_name_in_declr_stmt1477);
            	    next_var=object_name();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            
            	//	System.out.println(" commas : "+ count_com);
            		
            		if(count_com > 0)			
                          		 currentScope.defineSymbol(input.toString(next_var.start,next_var.stop), input.toString(type_name2.start,type_name2.stop));
            	
            match(input,23,FOLLOW_23_in_declr_stmt1487); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:647:1: type_name : ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'context_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:648:2: ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'context_type_t' | 'policy_type_t' | 'route_type_t' | 'interface_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' )
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:661:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );
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


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:2: ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route )
            int alt34=12;
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
                            new NoViableAltException("661:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 34, 12, input);

                        throw nvae;
                    }
                }
                else if ( ((LA34_2>=PLUS && LA34_2<=DIV)||LA34_2==23||LA34_2==41||(LA34_2>=47 && LA34_2<=58)) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("661:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                alt34=3;
                }
                break;
            case 83:
            case 84:
                {
                alt34=5;
                }
                break;
            case 89:
                {
                alt34=6;
                }
                break;
            case 28:
                {
                alt34=7;
                }
                break;
            case 30:
                {
                int LA34_7 = input.LA(2);

                if ( (LA34_7==76) ) {
                    alt34=8;
                }
                else if ( (LA34_7==ID||LA34_7==30) ) {
                    alt34=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("661:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 34, 7, input);

                    throw nvae;
                }
                }
                break;
            case 82:
                {
                alt34=9;
                }
                break;
            case 96:
                {
                alt34=10;
                }
                break;
            case 90:
                {
                alt34=11;
                }
                break;
            case 93:
            case 95:
                {
                alt34=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("661:1: object_values returns [Symbol sym] : ( char_value | int_value | STRING | ip_addr | policy | host | context | host_group | topology | serv_group | interf | route );", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:662:4: char_value
                    {
                    pushFollow(FOLLOW_char_value_in_object_values1583);
                    char_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:663:4: int_value
                    {
                    pushFollow(FOLLOW_int_value_in_object_values1588);
                    int_value3=int_value();
                    _fsp--;

                     
                    		sym = int_value3;
                    	

                    }
                    break;
                case 3 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:667:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_object_values1597); 

                    }
                    break;
                case 4 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:668:4: ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_object_values1602);
                    ip_addr4=ip_addr();
                    _fsp--;

                    
                    	  sym = ip_addr4.sym;


                    }
                    break;
                case 5 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:672:4: policy
                    {
                    pushFollow(FOLLOW_policy_in_object_values1610);
                    policy5=policy();
                    _fsp--;

                     sym = policy5;

                    }
                    break;
                case 6 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:673:4: host
                    {
                    pushFollow(FOLLOW_host_in_object_values1619);
                    host6=host();
                    _fsp--;

                    
                    	sym = host6 ; 
                    	

                    }
                    break;
                case 7 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:676:4: context
                    {
                    pushFollow(FOLLOW_context_in_object_values1628);
                    context7=context();
                    _fsp--;

                    sym =context7;

                    }
                    break;
                case 8 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:677:4: host_group
                    {
                    pushFollow(FOLLOW_host_group_in_object_values1636);
                    host_group8=host_group();
                    _fsp--;

                     sym = host_group8;

                    }
                    break;
                case 9 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:678:4: topology
                    {
                    pushFollow(FOLLOW_topology_in_object_values1644);
                    topology9=topology();
                    _fsp--;

                    sym = topology9;

                    }
                    break;
                case 10 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:679:4: serv_group
                    {
                    pushFollow(FOLLOW_serv_group_in_object_values1651);
                    serv_group10=serv_group();
                    _fsp--;

                    sym = serv_group10;

                    }
                    break;
                case 11 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:680:4: interf
                    {
                    pushFollow(FOLLOW_interf_in_object_values1658);
                    interf11=interf();
                    _fsp--;

                     sym = interf11;

                    }
                    break;
                case 12 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:681:4: route
                    {
                    pushFollow(FOLLOW_route_in_object_values1665);
                    route12=route();
                    _fsp--;

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
        return sym;
    }
    // $ANTLR end object_values


    // $ANTLR start context
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:687:1: context returns [Symbol sym] : 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}' ;
    public final Symbol context() throws RecognitionException {
        Symbol sym = null;

        Symbol p_i = null;

        object_name_return var = null;

        Symbol p_j = null;

        object_name_return var2 = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:687:29: ( 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:688:2: 'context' '{' ( (p_i= policy ) | (var= object_name ) ) ( ',' ( (p_j= policy ) | (var2= object_name ) ) )* '}'
            {
             
            	      Vector <Policy> policies;
            	      policies = new Vector <Policy>() ;	     
            	 
            match(input,28,FOLLOW_28_in_context1689); 
            match(input,76,FOLLOW_76_in_context1691); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:16: ( (p_i= policy ) | (var= object_name ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=83 && LA35_0<=84)) ) {
                alt35=1;
            }
            else if ( (LA35_0==ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("692:16: ( (p_i= policy ) | (var= object_name ) )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:17: (p_i= policy )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:17: (p_i= policy )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:18: p_i= policy
                    {
                    pushFollow(FOLLOW_policy_in_context1697);
                    p_i=policy();
                    _fsp--;

                    policies.add((Policy)p_i.lookupValue());

                    }


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:73: (var= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:73: (var= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:692:74: var= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_context1705);
                    var=object_name();
                    _fsp--;

                    
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

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:5: ( ',' ( (p_j= policy ) | (var2= object_name ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==64) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:8: ',' ( (p_j= policy ) | (var2= object_name ) )
            	    {
            	    match(input,64,FOLLOW_64_in_context1724); 
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:13: ( (p_j= policy ) | (var2= object_name ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( ((LA36_0>=83 && LA36_0<=84)) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==ID) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("709:13: ( (p_j= policy ) | (var2= object_name ) )", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:14: (p_j= policy )
            	            {
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:14: (p_j= policy )
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:15: p_j= policy
            	            {
            	            pushFollow(FOLLOW_policy_in_context1731);
            	            p_j=policy();
            	            _fsp--;

            	            policies.add((Policy)p_j.lookupValue());

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:70: (var2= object_name )
            	            {
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:70: (var2= object_name )
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:709:71: var2= object_name
            	            {
            	            pushFollow(FOLLOW_object_name_in_context1739);
            	            var2=object_name();
            	            _fsp--;

            	            
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


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            match(input,77,FOLLOW_77_in_context1753); 
            
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
        return sym;
    }
    // $ANTLR end context


    // $ANTLR start policy
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:736:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );
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


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:736:29: (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=83 && LA52_0<=84)) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==85) ) {
                    int LA52_2 = input.LA(3);

                    if ( ((LA52_2>=87 && LA52_2<=88)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_2==ICMP_MESSAGE_TYPE) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("736:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 52, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA52_1==86) ) {
                    int LA52_3 = input.LA(3);

                    if ( ((LA52_3>=87 && LA52_3<=88)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_3==ICMP_MESSAGE_TYPE) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("736:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 52, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("736:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("736:1: policy returns [Symbol sym] : (dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )? | dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )? );", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:737:4: dir= direction verd= verdict protocol= proto ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )?
                    {
                    
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
                      	
                    pushFollow(FOLLOW_direction_in_policy1786);
                    dir=direction();
                    _fsp--;

                    pushFollow(FOLLOW_verdict_in_policy1790);
                    verd=verdict();
                    _fsp--;

                    pushFollow(FOLLOW_proto_in_policy1794);
                    protocol=proto();
                    _fsp--;

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:752:4: ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==78) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:752:5: 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) ( (dport= port ) | ( 'all' ) )
                            {
                            match(input,78,FOLLOW_78_in_policy1801); 
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:753:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==NUMBER) ) {
                                alt38=1;
                            }
                            else if ( (LA38_0==ID) ) {
                                alt38=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("753:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )", 38, 0, input);

                                throw nvae;
                            }
                            switch (alt38) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:753:7: (dst_ip= ip_addr )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:753:7: (dst_ip= ip_addr )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:753:8: dst_ip= ip_addr
                                    {
                                    pushFollow(FOLLOW_ip_addr_in_policy1815);
                                    dst_ip=ip_addr();
                                    _fsp--;

                                     dip = new Ipaddress(input.toString(dst_ip.start,dst_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:754:6: (dip_obj= object_name )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:754:6: (dip_obj= object_name )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:754:7: dip_obj= object_name
                                    {
                                    pushFollow(FOLLOW_object_name_in_policy1835);
                                    dip_obj=object_name();
                                    _fsp--;

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

                            match(input,79,FOLLOW_79_in_policy1856); 
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:773:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==NUMBER) ) {
                                alt39=1;
                            }
                            else if ( (LA39_0==ID) ) {
                                alt39=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("773:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )", 39, 0, input);

                                throw nvae;
                            }
                            switch (alt39) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:773:16: (dnetmask_ip= ip_addr )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:773:16: (dnetmask_ip= ip_addr )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:773:17: dnetmask_ip= ip_addr
                                    {
                                    pushFollow(FOLLOW_ip_addr_in_policy1862);
                                    dnetmask_ip=ip_addr();
                                    _fsp--;

                                    dnetmask = new Ipaddress(input.toString(dnetmask_ip.start,dnetmask_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:774:6: (dnetmask_ip_obj= object_name )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:774:6: (dnetmask_ip_obj= object_name )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:774:7: dnetmask_ip_obj= object_name
                                    {
                                    pushFollow(FOLLOW_object_name_in_policy1878);
                                    dnetmask_ip_obj=object_name();
                                    _fsp--;

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

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:8: ( (dport= port ) | ( 'all' ) )
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==NUMBER) ) {
                                alt40=1;
                            }
                            else if ( (LA40_0==80) ) {
                                alt40=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("797:8: ( (dport= port ) | ( 'all' ) )", 40, 0, input);

                                throw nvae;
                            }
                            switch (alt40) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:9: (dport= port )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:9: (dport= port )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:10: dport= port
                                    {
                                    pushFollow(FOLLOW_port_in_policy1907);
                                    dport=port();
                                    _fsp--;

                                    dp = new String(input.toString(dport.start,dport.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:57: ( 'all' )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:57: ( 'all' )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:797:58: 'all'
                                    {
                                    match(input,80,FOLLOW_80_in_policy1916); 

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:800:4: ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==81) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:800:5: 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) ( (sport= port ) | ( 'all' ) )
                            {
                            match(input,81,FOLLOW_81_in_policy1940); 
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:801:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )
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
                                    new NoViableAltException("801:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )", 42, 0, input);

                                throw nvae;
                            }
                            switch (alt42) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:801:5: (src_ip= ip_addr )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:801:5: (src_ip= ip_addr )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:801:6: src_ip= ip_addr
                                    {
                                    pushFollow(FOLLOW_ip_addr_in_policy1951);
                                    src_ip=ip_addr();
                                    _fsp--;

                                     sip = new Ipaddress(input.toString(src_ip.start,src_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:802:6: (sip_obj= object_name )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:802:6: (sip_obj= object_name )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:802:7: sip_obj= object_name
                                    {
                                    pushFollow(FOLLOW_object_name_in_policy1971);
                                    sip_obj=object_name();
                                    _fsp--;

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

                            match(input,79,FOLLOW_79_in_policy1992); 
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:821:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==NUMBER) ) {
                                alt43=1;
                            }
                            else if ( (LA43_0==ID) ) {
                                alt43=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("821:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )", 43, 0, input);

                                throw nvae;
                            }
                            switch (alt43) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:821:16: (snetmask_ip= ip_addr )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:821:16: (snetmask_ip= ip_addr )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:821:17: snetmask_ip= ip_addr
                                    {
                                    pushFollow(FOLLOW_ip_addr_in_policy1998);
                                    snetmask_ip=ip_addr();
                                    _fsp--;

                                    snetmask = new Ipaddress(input.toString(snetmask_ip.start,snetmask_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:822:6: (snetmask_ip_obj= object_name )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:822:6: (snetmask_ip_obj= object_name )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:822:7: snetmask_ip_obj= object_name
                                    {
                                    pushFollow(FOLLOW_object_name_in_policy2014);
                                    snetmask_ip_obj=object_name();
                                    _fsp--;

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

                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:840:6: ( (sport= port ) | ( 'all' ) )
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==NUMBER) ) {
                                alt44=1;
                            }
                            else if ( (LA44_0==80) ) {
                                alt44=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("840:6: ( (sport= port ) | ( 'all' ) )", 44, 0, input);

                                throw nvae;
                            }
                            switch (alt44) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:840:7: (sport= port )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:840:7: (sport= port )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:840:8: sport= port
                                    {
                                    pushFollow(FOLLOW_port_in_policy2039);
                                    sport=port();
                                    _fsp--;

                                    sp = new String(input.toString(sport.start,sport.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:840:55: ( 'all' )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:840:55: ( 'all' )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:840:56: 'all'
                                    {
                                    match(input,80,FOLLOW_80_in_policy2048); 

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    
                    	System.out.println (input.toString(dir.start,dir.stop)+input.toString(verd.start,verd.stop)+input.toString(protocol.start,protocol.stop)+sip.getString()+snetmask.getString()+
                    	                                      sp+dip.getString()+ dnetmask.getString()+dp);
                    	
                    	Policy pl = new Policy(input.toString(dir.start,dir.stop),input.toString(verd.start,verd.stop), input.toString(protocol.start,protocol.stop), sip.getString(),snetmask.getString(),
                    		              sp,dip.getString(),dnetmask.getString(),dp);		
                    
                    	 Symbol s = new Symbol("policy_tcp_udp","policy_type_t",pl);
                    	sym = s;
                    
                    	
                    


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:858:2: dir= direction verd= verdict icmp_mesg= icmp_cntrl_message ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )? ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )?
                    {
                    
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
                    	
                    pushFollow(FOLLOW_direction_in_policy2084);
                    dir=direction();
                    _fsp--;

                    pushFollow(FOLLOW_verdict_in_policy2088);
                    verd=verdict();
                    _fsp--;

                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy2092);
                    icmp_mesg=icmp_cntrl_message();
                    _fsp--;

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:2: ( 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==78) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:874:3: 'dst' ( (dst_ip= ip_addr ) | (dip_obj= object_name ) ) 'netmask' ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
                            {
                            match(input,78,FOLLOW_78_in_policy2098); 
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:875:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==NUMBER) ) {
                                alt46=1;
                            }
                            else if ( (LA46_0==ID) ) {
                                alt46=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("875:6: ( (dst_ip= ip_addr ) | (dip_obj= object_name ) )", 46, 0, input);

                                throw nvae;
                            }
                            switch (alt46) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:875:7: (dst_ip= ip_addr )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:875:7: (dst_ip= ip_addr )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:875:8: dst_ip= ip_addr
                                    {
                                    pushFollow(FOLLOW_ip_addr_in_policy2112);
                                    dst_ip=ip_addr();
                                    _fsp--;

                                     dip = new Ipaddress(input.toString(dst_ip.start,dst_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:876:6: (dip_obj= object_name )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:876:6: (dip_obj= object_name )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:876:7: dip_obj= object_name
                                    {
                                    pushFollow(FOLLOW_object_name_in_policy2132);
                                    dip_obj=object_name();
                                    _fsp--;

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

                            match(input,79,FOLLOW_79_in_policy2153); 
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:896:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==NUMBER) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==ID) ) {
                                alt47=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("896:15: ( (dnetmask_ip= ip_addr ) | (dnetmask_ip_obj= object_name ) )", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:896:16: (dnetmask_ip= ip_addr )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:896:16: (dnetmask_ip= ip_addr )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:896:17: dnetmask_ip= ip_addr
                                    {
                                    pushFollow(FOLLOW_ip_addr_in_policy2159);
                                    dnetmask_ip=ip_addr();
                                    _fsp--;

                                    dnetmask = new Ipaddress(input.toString(dnetmask_ip.start,dnetmask_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:897:6: (dnetmask_ip_obj= object_name )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:897:6: (dnetmask_ip_obj= object_name )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:897:7: dnetmask_ip_obj= object_name
                                    {
                                    pushFollow(FOLLOW_object_name_in_policy2175);
                                    dnetmask_ip_obj=object_name();
                                    _fsp--;

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


                            }
                            break;

                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:917:4: ( 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==81) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:917:5: 'src' ( (src_ip= ip_addr ) | (sip_obj= object_name ) ) 'netmask' ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
                            {
                            match(input,81,FOLLOW_81_in_policy2208); 
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:918:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )
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
                                    new NoViableAltException("918:4: ( (src_ip= ip_addr ) | (sip_obj= object_name ) )", 49, 0, input);

                                throw nvae;
                            }
                            switch (alt49) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:918:5: (src_ip= ip_addr )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:918:5: (src_ip= ip_addr )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:918:6: src_ip= ip_addr
                                    {
                                    pushFollow(FOLLOW_ip_addr_in_policy2219);
                                    src_ip=ip_addr();
                                    _fsp--;

                                     sip = new Ipaddress(input.toString(src_ip.start,src_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:919:6: (sip_obj= object_name )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:919:6: (sip_obj= object_name )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:919:7: sip_obj= object_name
                                    {
                                    pushFollow(FOLLOW_object_name_in_policy2239);
                                    sip_obj=object_name();
                                    _fsp--;

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

                            match(input,79,FOLLOW_79_in_policy2260); 
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:939:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )
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
                                    new NoViableAltException("939:15: ( (snetmask_ip= ip_addr ) | (snetmask_ip_obj= object_name ) )", 50, 0, input);

                                throw nvae;
                            }
                            switch (alt50) {
                                case 1 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:939:16: (snetmask_ip= ip_addr )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:939:16: (snetmask_ip= ip_addr )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:939:17: snetmask_ip= ip_addr
                                    {
                                    pushFollow(FOLLOW_ip_addr_in_policy2266);
                                    snetmask_ip=ip_addr();
                                    _fsp--;

                                    dnetmask = new Ipaddress(input.toString(snetmask_ip.start,snetmask_ip.stop));

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:940:6: (snetmask_ip_obj= object_name )
                                    {
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:940:6: (snetmask_ip_obj= object_name )
                                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:940:7: snetmask_ip_obj= object_name
                                    {
                                    pushFollow(FOLLOW_object_name_in_policy2282);
                                    snetmask_ip_obj=object_name();
                                    _fsp--;

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


                            }
                            break;

                    }

                    
                    	
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
        return sym;
    }
    // $ANTLR end policy


    // $ANTLR start topology
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:976:1: topology returns [Symbol sym] : ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) );
    public final Symbol topology() throws RecognitionException {
        Symbol sym = null;

        Symbol host_group_sym = null;

        object_name_return host_group_obj = null;

        Symbol cxt_sym = null;

        object_name_return cxt_obj = null;

        Symbol serv_group_sym = null;

        object_name_return serv_group_obj = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:978:2: ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==30) ) {
                alt57=1;
            }
            else if ( (LA57_0==82) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("976:1: topology returns [Symbol sym] : ( ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) | ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) ) );", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:980:2: ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    {
                    
                    	Hostgroup hg;
                    	Servicegroup sg;
                    	Context cxt;
                    	hg = null;
                    	sg = null;
                    	cxt =null;
                    	
                    	
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:990:2: ( ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:991:2: ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:991:2: ( 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) ) )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:991:3: 'host_group' ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )
                    {
                    match(input,30,FOLLOW_30_in_topology2344); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:991:16: ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==30) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==ID) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("991:16: ( (host_group_sym= host_group ) | (host_group_obj= object_name ) )", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:991:17: (host_group_sym= host_group )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:991:17: (host_group_sym= host_group )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:991:18: host_group_sym= host_group
                            {
                            pushFollow(FOLLOW_host_group_in_topology2350);
                            host_group_sym=host_group();
                            _fsp--;

                            hg = (Hostgroup)host_group_sym.lookupValue();

                            }


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:992:3: (host_group_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:992:3: (host_group_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:992:5: host_group_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_topology2362);
                            host_group_obj=object_name();
                            _fsp--;

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


                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1008:3: ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1008:4: 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    {
                    match(input,28,FOLLOW_28_in_topology2380); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1008:14: ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==28) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==ID) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1008:14: ( (cxt_sym= context ) | (cxt_obj= object_name ) )", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1008:15: (cxt_sym= context )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1008:15: (cxt_sym= context )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1008:16: cxt_sym= context
                            {
                            pushFollow(FOLLOW_context_in_topology2386);
                            cxt_sym=context();
                            _fsp--;

                            cxt = (Context) cxt_sym.lookupValue(); 

                            }


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1010:3: (cxt_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1010:3: (cxt_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1010:5: cxt_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_topology2404);
                            cxt_obj=object_name();
                            _fsp--;

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


                    }

                    
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
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1037:3: ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    {
                    
                    	Hostgroup hg;
                    	Servicegroup sg;
                    	Context cxt;
                    	hg = null;
                    	sg = null;
                    	cxt = null;
                    	
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1046:3: ( ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) ) )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1048:3: ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) ) ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1048:3: ( 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) ) )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1048:4: 'serv_group' ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )
                    {
                    match(input,82,FOLLOW_82_in_topology2441); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1048:17: ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==96) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==ID) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1048:17: ( (serv_group_sym= serv_group ) | (serv_group_obj= object_name ) )", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1048:18: (serv_group_sym= serv_group )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1048:18: (serv_group_sym= serv_group )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1048:19: serv_group_sym= serv_group
                            {
                            pushFollow(FOLLOW_serv_group_in_topology2447);
                            serv_group_sym=serv_group();
                            _fsp--;

                            sg = (Servicegroup)serv_group_sym.lookupValue();

                            }


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1049:4: (serv_group_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1049:4: (serv_group_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1049:6: serv_group_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_topology2460);
                            serv_group_obj=object_name();
                            _fsp--;

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


                    }

                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1063:3: ( 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) ) )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1063:4: 'context' ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    {
                    match(input,28,FOLLOW_28_in_topology2476); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1063:14: ( (cxt_sym= context ) | (cxt_obj= object_name ) )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==28) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==ID) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1063:14: ( (cxt_sym= context ) | (cxt_obj= object_name ) )", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1063:15: (cxt_sym= context )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1063:15: (cxt_sym= context )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1063:16: cxt_sym= context
                            {
                            pushFollow(FOLLOW_context_in_topology2482);
                            cxt_sym=context();
                            _fsp--;

                            cxt = (Context) cxt_sym.lookupValue(); 

                            }


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1064:3: (cxt_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1064:3: (cxt_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1064:5: cxt_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_topology2497);
                            cxt_obj=object_name();
                            _fsp--;

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


                    }


                    }

                    
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
        return sym;
    }
    // $ANTLR end topology


    // $ANTLR start int_value
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1086:1: int_value returns [Symbol sym] : e= NUMBER ;
    public final Symbol int_value() throws RecognitionException {
        Symbol sym = null;

        Token e=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1087:2: (e= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1087:4: e= NUMBER
            {
            e=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_int_value2531); 
            
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1114:1: char_value : CHAR ;
    public final void char_value() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1115:2: ( CHAR )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1115:11: CHAR
            {
            match(input,CHAR,FOLLOW_CHAR_in_char_value2556); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1127:1: direction : ( 'inbound' | 'outbound' );
    public final direction_return direction() throws RecognitionException {
        direction_return retval = new direction_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1128:2: ( 'inbound' | 'outbound' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            if ( (input.LA(1)>=83 && input.LA(1)<=84) ) {
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
        public String verd;
    };

    // $ANTLR start verdict
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1132:1: verdict returns [String verd] : ( 'allow' | 'deny' );
    public final verdict_return verdict() throws RecognitionException {
        verdict_return retval = new verdict_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1132:31: ( 'allow' | 'deny' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==85) ) {
                alt58=1;
            }
            else if ( (LA58_0==86) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1132:1: verdict returns [String verd] : ( 'allow' | 'deny' );", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1132:34: 'allow'
                    {
                    match(input,85,FOLLOW_85_in_verdict2602); 
                     retval.verd = new String("allow"); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1133:5: 'deny'
                    {
                    match(input,86,FOLLOW_86_in_verdict2610); 
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
        return retval;
    }
    // $ANTLR end verdict

    public static class proto_return extends ParserRuleReturnScope {
    };

    // $ANTLR start proto
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1136:1: proto : ( 'udp' | 'tcp' );
    public final proto_return proto() throws RecognitionException {
        proto_return retval = new proto_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1136:9: ( 'udp' | 'tcp' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:
            {
            if ( (input.LA(1)>=87 && input.LA(1)<=88) ) {
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1139:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final icmp_cntrl_message_return icmp_cntrl_message() throws RecognitionException {
        icmp_cntrl_message_return retval = new icmp_cntrl_message_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1140:2: ( ICMP_MESSAGE_TYPE )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1140:4: ICMP_MESSAGE_TYPE
            {
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message2642); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1143:1: port : NUMBER ;
    public final port_return port() throws RecognitionException {
        port_return retval = new port_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1143:6: ( NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1143:8: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_port2652); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1146:1: object_name returns [String obj_name] : ID ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        Token ID13=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1147:2: ( ID )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1147:5: ID
            {
            ID13=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_object_name2667); 
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
        return retval;
    }
    // $ANTLR end object_name

    public static class ip_addr_return extends ParserRuleReturnScope {
        public Symbol sym;
    };

    // $ANTLR start ip_addr
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:1: ip_addr returns [Symbol sym] : (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) ;
    public final ip_addr_return ip_addr() throws RecognitionException {
        ip_addr_return retval = new ip_addr_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token c=null;
        Token d=null;

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:32: ( (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER ) )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:35: (a= NUMBER ) DOT (b= NUMBER ) DOT (c= NUMBER ) DOT (d= NUMBER )
            {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:35: (a= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:36: a= NUMBER
            {
            a=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2704); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr2706); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:48: (b= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:49: b= NUMBER
            {
            b=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2710); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr2712); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:61: (c= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:62: c= NUMBER
            {
            c=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2716); 

            }

            match(input,DOT,FOLLOW_DOT_in_ip_addr2718); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:74: (d= NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1175:75: d= NUMBER
            {
            d=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr2722); 

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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1191:1: nmask : 'netmask' ip_addr ;
    public final void nmask() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1191:7: ( 'netmask' ip_addr )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1191:9: 'netmask' ip_addr
            {
            match(input,79,FOLLOW_79_in_nmask2742); 
            pushFollow(FOLLOW_ip_addr_in_nmask2744);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1196:1: host returns [Symbol sym] : 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) ;
    public final Symbol host() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return ip_string = null;

        object_name_return ip_obj = null;

        ip_addr_return netmask_string = null;

        object_name_return netmask_ip_obj = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1196:26: ( 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) ) )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1197:2: 'ip_addr' (ip_string= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            {
            boolean ip_object_used =false, netmask_object_used = false;
            match(input,89,FOLLOW_89_in_host2764); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1198:13: (ip_string= ip_addr | (ip_obj= object_name ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NUMBER) ) {
                alt59=1;
            }
            else if ( (LA59_0==ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1198:13: (ip_string= ip_addr | (ip_obj= object_name ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1198:14: ip_string= ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_host2769);
                    ip_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1198:32: (ip_obj= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1198:32: (ip_obj= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1198:33: ip_obj= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_host2774);
                    ip_obj=object_name();
                    _fsp--;

                    ip_object_used=true; 

                    }


                    }
                    break;

            }

            match(input,79,FOLLOW_79_in_host2781); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1198:89: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==NUMBER) ) {
                alt60=1;
            }
            else if ( (LA60_0==ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1198:89: (netmask_string= ip_addr | (netmask_ip_obj= object_name ) )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1198:90: netmask_string= ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_host2786);
                    netmask_string=ip_addr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1199:21: (netmask_ip_obj= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1199:21: (netmask_ip_obj= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1199:22: netmask_ip_obj= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_host2816);
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1293:1: dns_set : ip_addr ( ',' ip_addr )* ;
    public final void dns_set() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1293:9: ( ip_addr ( ',' ip_addr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1293:11: ip_addr ( ',' ip_addr )*
            {
            pushFollow(FOLLOW_ip_addr_in_dns_set2835);
            ip_addr();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1293:19: ( ',' ip_addr )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==64) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1293:20: ',' ip_addr
            	    {
            	    match(input,64,FOLLOW_64_in_dns_set2838); 
            	    pushFollow(FOLLOW_ip_addr_in_dns_set2841);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1295:1: gateway : ip_addr ( ',' ip_addr )* ;
    public final void gateway() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1295:9: ( ip_addr ( ',' ip_addr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1295:11: ip_addr ( ',' ip_addr )*
            {
            pushFollow(FOLLOW_ip_addr_in_gateway2851);
            ip_addr();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1295:19: ( ',' ip_addr )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==64) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1295:20: ',' ip_addr
            	    {
            	    match(input,64,FOLLOW_64_in_gateway2854); 
            	    pushFollow(FOLLOW_ip_addr_in_gateway2856);
            	    ip_addr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1298:1: host_group returns [Symbol sym] : 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}' ;
    public final Symbol host_group() throws RecognitionException {
        Symbol sym = null;

        Symbol i = null;

        object_name_return host_obj_i = null;

        Symbol j = null;

        object_name_return host_obj_j = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1299:2: ( 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1300:2: 'host_group' '{' (i= host | (host_obj_i= object_name ) ) ( ',' (j= host | (host_obj_j= object_name ) ) )* '}'
            {
            
            	Vector <Host> hosts;
            	hosts = new Vector <Host> ();
            	
            match(input,30,FOLLOW_30_in_host_group2877); 
            match(input,76,FOLLOW_76_in_host_group2880); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1304:19: (i= host | (host_obj_i= object_name ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==89) ) {
                alt63=1;
            }
            else if ( (LA63_0==ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1304:19: (i= host | (host_obj_i= object_name ) )", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1304:21: i= host
                    {
                    pushFollow(FOLLOW_host_in_host_group2885);
                    i=host();
                    _fsp--;

                    hosts.add((Host)i.lookupValue()); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1304:67: (host_obj_i= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1304:67: (host_obj_i= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1304:68: host_obj_i= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_host_group2894);
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

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1320:3: ( ',' (j= host | (host_obj_j= object_name ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==64) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1320:4: ',' (j= host | (host_obj_j= object_name ) )
            	    {
            	    match(input,64,FOLLOW_64_in_host_group2907); 
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1320:8: (j= host | (host_obj_j= object_name ) )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==89) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==ID) ) {
            	        alt64=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1320:8: (j= host | (host_obj_j= object_name ) )", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1320:9: j= host
            	            {
            	            pushFollow(FOLLOW_host_in_host_group2912);
            	            j=host();
            	            _fsp--;

            	            hosts.add((Host)j.lookupValue());

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1320:54: (host_obj_j= object_name )
            	            {
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1320:54: (host_obj_j= object_name )
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1320:55: host_obj_j= object_name
            	            {
            	            pushFollow(FOLLOW_object_name_in_host_group2923);
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
            	    break loop65;
                }
            } while (true);

            match(input,77,FOLLOW_77_in_host_group2934); 
            
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
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1342:1: interf returns [Symbol sym] : 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )* ;
    public final Symbol interf() throws RecognitionException {
        Symbol sym = null;

        Token interface_name=null;
        ip_addr_return interface_ip = null;

        ip_addr_return interface_netmask = null;

        ip_addr_return i = null;

        ip_addr_return j = null;

        ip_addr_return gw_ip = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1343:2: ( 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )* )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1343:4: 'ifname' (interface_name= ID ) interface_ip= ip_addr 'netmask' interface_netmask= ip_addr ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )* ( 'defgw' gw_ip= ip_addr )*
            {
             
            	     Vector <Ipaddress> dns_ip;
            	       dns_ip = new Vector <Ipaddress>() ;	     
            	       boolean dns_used = false;
            	       boolean defgw_used = false;
            	       Interface iface;
            	         
            match(input,90,FOLLOW_90_in_interf2965); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1350:12: (interface_name= ID )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1350:13: interface_name= ID
            {
            interface_name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_interf2970); 

            }

            System.out.println(interface_name.getText());
            pushFollow(FOLLOW_ip_addr_in_interf2978);
            interface_ip=ip_addr();
            _fsp--;

            match(input,79,FOLLOW_79_in_interf2980); 
            pushFollow(FOLLOW_ip_addr_in_interf2985);
            interface_netmask=ip_addr();
            _fsp--;

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:2: ( 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}' )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==91) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:4: 'dns' '{' i= ip_addr ( ',' j= ip_addr )* '}'
            	    {
            	    match(input,91,FOLLOW_91_in_interf2991); 
            	    match(input,76,FOLLOW_76_in_interf2994); 
            	    pushFollow(FOLLOW_ip_addr_in_interf2998);
            	    i=ip_addr();
            	    _fsp--;

            	    dns_ip.add(new Ipaddress(input.toString(i.start,i.stop)));
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:64: ( ',' j= ip_addr )*
            	    loop66:
            	    do {
            	        int alt66=2;
            	        int LA66_0 = input.LA(1);

            	        if ( (LA66_0==64) ) {
            	            alt66=1;
            	        }


            	        switch (alt66) {
            	    	case 1 :
            	    	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1351:66: ',' j= ip_addr
            	    	    {
            	    	    match(input,64,FOLLOW_64_in_interf3005); 
            	    	    pushFollow(FOLLOW_ip_addr_in_interf3010);
            	    	    j=ip_addr();
            	    	    _fsp--;

            	    	    dns_ip.add(new Ipaddress(input.toString(j.start,j.stop)));

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop66;
            	        }
            	    } while (true);

            	    match(input,77,FOLLOW_77_in_interf3016); 
            	    dns_used = true;

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1353:3: ( 'defgw' gw_ip= ip_addr )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==92) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1353:5: 'defgw' gw_ip= ip_addr
            	    {
            	    match(input,92,FOLLOW_92_in_interf3034); 
            	    pushFollow(FOLLOW_ip_addr_in_interf3039);
            	    gw_ip=ip_addr();
            	    _fsp--;

            	    defgw_used = true;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            
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
        return sym;
    }
    // $ANTLR end interf


    // $ANTLR start route
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1374:1: route returns [Symbol sym] : ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) );
    public final Symbol route() throws RecognitionException {
        Symbol sym = null;

        ip_addr_return dst = null;

        object_name_return ip_obj = null;

        ip_addr_return gw = null;

        object_name_return gw_ip_obj = null;

        ip_addr_return netmask_ip = null;

        object_name_return nm_ip_obj = null;


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1374:28: ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==93) ) {
                alt74=1;
            }
            else if ( (LA74_0==95) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1374:1: route returns [Symbol sym] : ( 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) | 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) ) );", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1375:1: 'host' (dst= ip_addr | (ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) )
                    {
                    
                       boolean ip_object_used , gw_object_used,nm_object_used ;
                       ip_object_used = false;
                       gw_object_used = false;
                       nm_object_used=false;

                    match(input,93,FOLLOW_93_in_route3064); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:8: (dst= ip_addr | (ip_obj= object_name ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NUMBER) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==ID) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1381:8: (dst= ip_addr | (ip_obj= object_name ) )", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:9: dst= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route3069);
                            dst=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:21: (ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:21: (ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:22: ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route3075);
                            ip_obj=object_name();
                            _fsp--;

                            ip_object_used=true;

                            }


                            }
                            break;

                    }

                    match(input,94,FOLLOW_94_in_route3081); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:72: (gw= ip_addr | (gw_ip_obj= object_name ) )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NUMBER) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==ID) ) {
                        alt70=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1381:72: (gw= ip_addr | (gw_ip_obj= object_name ) )", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:73: gw= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route3086);
                            gw=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:84: (gw_ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:84: (gw_ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1381:85: gw_ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route3093);
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
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1467:2: 'net' (dst= ip_addr | (ip_obj= object_name ) ) 'netmask' (netmask_ip= ip_addr | (nm_ip_obj= object_name ) ) 'gw' (gw= ip_addr | (gw_ip_obj= object_name ) )
                    {
                    
                    	 boolean  ip_object_used,nm_object_used , gw_object_used ;
                    	 ip_object_used = false;
                    	 nm_object_used = false;
                    	 gw_object_used = false;
                    	 
                    match(input,95,FOLLOW_95_in_route3115); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:9: (dst= ip_addr | (ip_obj= object_name ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NUMBER) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==ID) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1474:9: (dst= ip_addr | (ip_obj= object_name ) )", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:10: dst= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route3120);
                            dst=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:22: (ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:22: (ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:23: ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route3125);
                            ip_obj=object_name();
                            _fsp--;

                            ip_object_used=true;

                            }


                            }
                            break;

                    }

                    match(input,79,FOLLOW_79_in_route3130); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:76: (netmask_ip= ip_addr | (nm_ip_obj= object_name ) )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NUMBER) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==ID) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1474:76: (netmask_ip= ip_addr | (nm_ip_obj= object_name ) )", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:77: netmask_ip= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route3135);
                            netmask_ip=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:96: (nm_ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:96: (nm_ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1474:97: nm_ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route3140);
                            nm_ip_obj=object_name();
                            _fsp--;

                            nm_object_used=true;

                            }


                            }
                            break;

                    }

                    match(input,94,FOLLOW_94_in_route3148); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1475:8: (gw= ip_addr | (gw_ip_obj= object_name ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NUMBER) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==ID) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1475:8: (gw= ip_addr | (gw_ip_obj= object_name ) )", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1475:9: gw= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_route3154);
                            gw=ip_addr();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1475:21: (gw_ip_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1475:21: (gw_ip_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1475:22: gw_ip_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_route3159);
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
        return sym;
    }
    // $ANTLR end route


    // $ANTLR start serv_group
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1717:1: serv_group returns [Symbol sym] : 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}' ;
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


        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1718:2: ( 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}' )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1719:2: 'service_group' '{' ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) ) ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )? serv_port_str= serv_listen_port ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )* '}'
            {
            
            	 Ipaddress serviceIp;
            	 serviceIp = new Ipaddress ("0.0.0.0");
            	 Ipaddress serviceNetmask;
            	 serviceNetmask = new Ipaddress("0.0.0.0");
            	 String servicePort;
            	 servicePort = "0";
            	Vector <Servicedescriptor> sDesc;
            	sDesc = new Vector <Servicedescriptor> ();
            	
            match(input,96,FOLLOW_96_in_serv_group3198); 
            match(input,76,FOLLOW_76_in_serv_group3200); 
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1730:22: ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==NUMBER) ) {
                alt75=1;
            }
            else if ( (LA75_0==ID) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1730:22: ( (serv_ip_str= ip_addr ) | (serv_ip_obj= object_name ) )", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1730:23: (serv_ip_str= ip_addr )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1730:23: (serv_ip_str= ip_addr )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1730:24: serv_ip_str= ip_addr
                    {
                    pushFollow(FOLLOW_ip_addr_in_serv_group3209);
                    serv_ip_str=ip_addr();
                    _fsp--;

                     serviceIp = new Ipaddress(input.toString(serv_ip_str.start,serv_ip_str.stop));

                    }


                    }
                    break;
                case 2 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1731:5: (serv_ip_obj= object_name )
                    {
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1731:5: (serv_ip_obj= object_name )
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1731:6: serv_ip_obj= object_name
                    {
                    pushFollow(FOLLOW_object_name_in_serv_group3223);
                    serv_ip_obj=object_name();
                    _fsp--;

                     
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

            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1749:4: ( 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==79) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1749:5: 'netmask' ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )
                    {
                    match(input,79,FOLLOW_79_in_serv_group3245); 
                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1749:15: ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NUMBER) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==ID) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1749:15: ( (serv_netmask_str= ip_addr ) | (serv_netmask_obj= object_name ) )", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1749:16: (serv_netmask_str= ip_addr )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1749:16: (serv_netmask_str= ip_addr )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1749:17: serv_netmask_str= ip_addr
                            {
                            pushFollow(FOLLOW_ip_addr_in_serv_group3251);
                            serv_netmask_str=ip_addr();
                            _fsp--;

                            serviceNetmask = new Ipaddress(input.toString(serv_netmask_str.start,serv_netmask_str.stop));

                            }


                            }
                            break;
                        case 2 :
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1750:26: (serv_netmask_obj= object_name )
                            {
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1750:26: (serv_netmask_obj= object_name )
                            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1750:27: serv_netmask_obj= object_name
                            {
                            pushFollow(FOLLOW_object_name_in_serv_group3286);
                            serv_netmask_obj=object_name();
                            _fsp--;

                             
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


                    }
                    break;

            }

            pushFollow(FOLLOW_serv_listen_port_in_serv_group3306);
            serv_port_str=serv_listen_port();
            _fsp--;

             
            		      if(serviceIp.getString().equals("0.0.0.0")!=true)
            		     {
            		     serviceNetmask=new Ipaddress("255.255.255.255");
            		     }
            		      
            		      sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
            		      			         input.toString(serv_port_str.start,serv_port_str.stop))));
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1774:2: ( ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==97) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1774:3: ', ' ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) ) ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )? extra_serv_port_str= serv_listen_port
            	    {
            	    match(input,97,FOLLOW_97_in_serv_group3331); 
            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1774:9: ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) )
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==NUMBER) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==ID) ) {
            	        alt78=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1774:9: ( (extra_ip_str= ip_addr ) | (extra_ip_obj= object_name ) )", 78, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1774:10: (extra_ip_str= ip_addr )
            	            {
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1774:10: (extra_ip_str= ip_addr )
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1774:11: extra_ip_str= ip_addr
            	            {
            	            pushFollow(FOLLOW_ip_addr_in_serv_group3341);
            	            extra_ip_str=ip_addr();
            	            _fsp--;

            	             serviceIp = new Ipaddress(input.toString(extra_ip_str.start,extra_ip_str.stop));

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1775:5: (extra_ip_obj= object_name )
            	            {
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1775:5: (extra_ip_obj= object_name )
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1775:6: extra_ip_obj= object_name
            	            {
            	            pushFollow(FOLLOW_object_name_in_serv_group3355);
            	            extra_ip_obj=object_name();
            	            _fsp--;

            	             
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

            	    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1791:4: ( 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) ) )?
            	    int alt80=2;
            	    int LA80_0 = input.LA(1);

            	    if ( (LA80_0==79) ) {
            	        alt80=1;
            	    }
            	    switch (alt80) {
            	        case 1 :
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1791:5: 'netmask' ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )
            	            {
            	            match(input,79,FOLLOW_79_in_serv_group3373); 
            	            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1791:15: ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )
            	            int alt79=2;
            	            int LA79_0 = input.LA(1);

            	            if ( (LA79_0==NUMBER) ) {
            	                alt79=1;
            	            }
            	            else if ( (LA79_0==ID) ) {
            	                alt79=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("1791:15: ( (extra_serv_netmask_str= ip_addr ) | (extra_serv_netmask_obj= object_name ) )", 79, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt79) {
            	                case 1 :
            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1791:16: (extra_serv_netmask_str= ip_addr )
            	                    {
            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1791:16: (extra_serv_netmask_str= ip_addr )
            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1791:17: extra_serv_netmask_str= ip_addr
            	                    {
            	                    pushFollow(FOLLOW_ip_addr_in_serv_group3379);
            	                    extra_serv_netmask_str=ip_addr();
            	                    _fsp--;

            	                    serviceNetmask = new Ipaddress(input.toString(extra_serv_netmask_str.start,extra_serv_netmask_str.stop));

            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1792:26: (extra_serv_netmask_obj= object_name )
            	                    {
            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1792:26: (extra_serv_netmask_obj= object_name )
            	                    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1792:27: extra_serv_netmask_obj= object_name
            	                    {
            	                    pushFollow(FOLLOW_object_name_in_serv_group3414);
            	                    extra_serv_netmask_obj=object_name();
            	                    _fsp--;

            	                     
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


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_serv_listen_port_in_serv_group3434);
            	    extra_serv_port_str=serv_listen_port();
            	    _fsp--;

            	     
            	    		      if(serviceIp.getString().equals("0.0.0.0")!=true)
            	    		     {
            	    		     serviceNetmask=new Ipaddress("255.255.255.255");
            	    		     }
            	    		     sDesc.add ((new Servicedescriptor(serviceIp.getString(),serviceNetmask.getString(),
            	    		      			         input.toString(extra_serv_port_str.start,extra_serv_port_str.stop))));

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            match(input,77,FOLLOW_77_in_serv_group3451); 
            
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
        return sym;
    }
    // $ANTLR end serv_group

    public static class serv_listen_port_return extends ParserRuleReturnScope {
    };

    // $ANTLR start serv_listen_port
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1826:1: serv_listen_port : ( NUMBER ) ;
    public final serv_listen_port_return serv_listen_port() throws RecognitionException {
        serv_listen_port_return retval = new serv_listen_port_return();
        retval.start = input.LT(1);

        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1827:2: ( ( NUMBER ) )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1827:4: ( NUMBER )
            {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1827:4: ( NUMBER )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1827:5: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port3490); 

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
    // $ANTLR end serv_listen_port


    // $ANTLR start host_name
    // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1829:1: host_name : ID ;
    public final void host_name() throws RecognitionException {
        try {
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1830:2: ( ID )
            // D:\\Users\\arpi\\Desktop\\Assignments\\LANCOM\\plt_project\\chitra_lancom_3\\Block.g:1830:4: ID
            {
            match(input,ID,FOLLOW_ID_in_host_name3500); 

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
    public static final BitSet FOLLOW_25_in_config_statement304 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_config_statement306 = new BitSet(new long[]{0x0000000040000800L,0x0000000000040000L});
    public static final BitSet FOLLOW_object_name_in_config_statement312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_config_statement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_config_statement357 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_config_statement359 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_config_statement368 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_config_statement370 = new BitSet(new long[]{0x0000000040000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_topology_in_config_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement379 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_config_statement381 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement384 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_context_in_config_statement386 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_object_name_in_config_statement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement407 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_config_statement409 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_in_config_statement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_config_statement450 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_config_statement452 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_in_config_statement473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_config_statement502 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement504 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_object_name_in_config_statement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_config_statement565 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_config_statement567 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_object_name_in_config_statement572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_config_statement595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_oper_in_config_statement616 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_config_statement618 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_object_name_in_config_statement621 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000000L});
    public static final BitSet FOLLOW_host_group_in_config_statement624 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000000L});
    public static final BitSet FOLLOW_object_name_in_config_statement628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_config_statement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_display_in_config_statement637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_route_oper663 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_route_oper667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_route_oper676 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_route_oper680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_set_oper697 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_set_oper699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_set_oper704 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_set_oper706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_config_display725 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_display727 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_config_display734 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_display736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_config_display742 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_display744 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_config_display746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_config_display751 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_config_display753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_condition_statement775 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_condition_statement777 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_equality_expr_in_condition_statement779 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_condition_statement781 = new BitSet(new long[]{0x080051C3DB801D00L,0x00000001A61C0FFEL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement783 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_condition_statement786 = new BitSet(new long[]{0x080051C3DB801D00L,0x00000001A61C0FFEL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement788 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_condition_statement792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_iteration_statement808 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_iteration_statement810 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement812 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_iteration_statement814 = new BitSet(new long[]{0x080051C3DB801D00L,0x00000001A61C0FFEL});
    public static final BitSet FOLLOW_statement_list_in_iteration_statement816 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_iteration_statement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_print_statement834 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_print_statement836 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_print_statement840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr877 = new BitSet(new long[]{0xF000000000080000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr881 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr939 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_conditional_expr947 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_expression_in_conditional_expr949 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_conditional_expr951 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_conditional_expr_in_conditional_expr953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr977 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_logicalOR_expr985 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr987 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr1010 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_logicalAND_expr1018 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr1020 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr1044 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_bitwiseOR_expr1052 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr1054 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr1077 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_bitwiseAND_expr1085 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr1087 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr1112 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr1121 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr1129 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr1153 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr1164 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_expr_in_relational_expr1174 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_term_in_expr1200 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr1211 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_term_in_expr1222 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term1248 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term1259 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_unary_expr_in_term1269 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unary_expr1303 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression1332 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1335 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression1336 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_factor1416 = new BitSet(new long[]{0x0800010050001D00L,0x00000001A61C0000L});
    public static final BitSet FOLLOW_expression_in_factor1418 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_factor1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt1460 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1464 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_declr_stmt1471 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt1477 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23_in_declr_stmt1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_object_values1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_in_object_values1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interf_in_object_values1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_route_in_object_values1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_context1689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_context1691 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_policy_in_context1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_object_name_in_context1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_64_in_context1724 = new BitSet(new long[]{0x0000000000000800L,0x0000000000180000L});
    public static final BitSet FOLLOW_policy_in_context1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_object_name_in_context1739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_77_in_context1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_verdict_in_policy1790 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_proto_in_policy1794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000024000L});
    public static final BitSet FOLLOW_78_in_policy1801 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_policy1856 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1862 = new BitSet(new long[]{0x0000000000000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_object_name_in_policy1878 = new BitSet(new long[]{0x0000000000000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_port_in_policy1907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_80_in_policy1916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_policy1940 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_policy1992 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy1998 = new BitSet(new long[]{0x0000000000000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_object_name_in_policy2014 = new BitSet(new long[]{0x0000000000000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_port_in_policy2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_policy2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy2084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_verdict_in_policy2088 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy2092 = new BitSet(new long[]{0x0000000000000002L,0x0000000000024000L});
    public static final BitSet FOLLOW_78_in_policy2098 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_policy2153 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy2159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_object_name_in_policy2175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_policy2208 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_policy2239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_policy2260 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_policy2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_policy2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_topology2344 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_host_group_in_topology2350 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_object_name_in_topology2362 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_topology2380 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_context_in_topology2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_topology2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_topology2441 = new BitSet(new long[]{0x0000000000000800L,0x0000000100000000L});
    public static final BitSet FOLLOW_serv_group_in_topology2447 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_object_name_in_topology2460 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_topology2476 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_context_in_topology2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_topology2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_verdict2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_verdict2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object_name2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2704 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2706 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2710 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2712 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2716 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr2718 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_nmask2742 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_nmask2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_host2764 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_host2769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_host2774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_host2781 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_host2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_host2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_dns_set2838 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set2841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_gateway2854 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_gateway2856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_30_in_host_group2877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_host_group2880 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000000L});
    public static final BitSet FOLLOW_host_in_host_group2885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_object_name_in_host_group2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_64_in_host_group2907 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000000L});
    public static final BitSet FOLLOW_host_in_host_group2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_object_name_in_host_group2923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_77_in_host_group2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_interf2965 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_interf2970 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_interf2980 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2985 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_91_in_interf2991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_interf2994 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf2998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_64_in_interf3005 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf3010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_77_in_interf3016 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_92_in_interf3034 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_interf3039 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_93_in_route3064 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route3069 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_object_name_in_route3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_route3081 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_route3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_route3115 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route3120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_route3125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_route3130 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_object_name_in_route3140 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_route3148 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_route3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_route3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_serv_group3198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_serv_group3200 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3209 = new BitSet(new long[]{0x0000000000000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_serv_group3223 = new BitSet(new long[]{0x0000000000000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_serv_group3245 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3251 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_object_name_in_serv_group3286 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group3306 = new BitSet(new long[]{0x0000000000000000L,0x0000000200002000L});
    public static final BitSet FOLLOW_97_in_serv_group3331 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3341 = new BitSet(new long[]{0x0000000000000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_object_name_in_serv_group3355 = new BitSet(new long[]{0x0000000000000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_serv_group3373 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ip_addr_in_serv_group3379 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_object_name_in_serv_group3414 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_group3434 = new BitSet(new long[]{0x0000000000000000L,0x0000000200002000L});
    public static final BitSet FOLLOW_77_in_serv_group3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name3500 = new BitSet(new long[]{0x0000000000000002L});

}