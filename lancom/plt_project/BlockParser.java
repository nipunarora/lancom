// $ANTLR 3.0.1 /home/sambuddho/plt_project/Block.g 2008-04-18 18:33:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class BlockParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "NUMBER", "NM", "PROG_BEGIN", "PROG_END", "STRING", "ID", "COMMA", "CHAR", "ICMP_MESSAGE_TYPE", "WHITESPACE", "EQUAL", "OBJECT_NAME", "LETTER", "DIGIT", "DOT", "DNS", "GATEWAY", "CHARS", "EscapeSequence", "DELIMITER", "LINE_COMMENT", "IPADDR_BYTE", "'prog'", "'endprog'", "'if'", "'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'echo'", "'?'", "':'", "'||'", "'&&'", "'|'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'~'", "'*='", "'/='", "'+='", "'-='", "'topology_type_t'", "'host_type_t'", "'host_group_type_t'", "'serv_group_type_t'", "'role_type_t'", "'policy_type_t'", "'ipaddr_t'", "'int_type_t'", "'char_type_t'", "'inbound'", "'outbound'", "'allow'", "'deny'", "'udp'", "'tcp'", "'ifname'", "'card_id'", "'netmask'", "'host_group'", "'{'", "'}'", "'DNS'", "'GATEWAY'", "'service_set'"
    };
    public static final int LINE_COMMENT=28;
    public static final int LETTER=20;
    public static final int NUMBER=8;
    public static final int CHAR=15;
    public static final int WHITESPACE=17;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int ID=13;
    public static final int EOF=-1;
    public static final int DNS=23;
    public static final int OBJECT_NAME=19;
    public static final int IPADDR_BYTE=29;
    public static final int COMMA=14;
    public static final int EQUAL=18;
    public static final int GATEWAY=24;
    public static final int PROG_BEGIN=10;
    public static final int CHARS=25;
    public static final int PLUS=4;
    public static final int PROG_END=11;
    public static final int DIGIT=21;
    public static final int DIV=7;
    public static final int NM=9;
    public static final int DOT=22;
    public static final int EscapeSequence=26;
    public static final int ICMP_MESSAGE_TYPE=16;
    public static final int DELIMITER=27;
    public static final int STRING=12;
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
        "gateway", "host_group", "serv_descr", "serv_group", "serv_listen_port", 
        "host_name"
    };

    public int ruleLevel = 0;
    public BlockParser(TokenStream input, int port) {
            super(input, port);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, adaptor);
            setDebugListener(proxy);
            adaptor.setDebugEventListener(proxy);
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
        adaptor.setDebugEventListener(dbg);
    }

    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor =
    	  new DebugTreeAdaptor(null,new CommonTreeAdaptor());
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/sambuddho/plt_project/Block.g"; }


        public static void main(String[] args) throws Exception {
            BlockLexer lex = new BlockLexer(new ANTLRFileStream(args[0]));
           	CommonTokenStream tokens = new CommonTokenStream(lex);

            BlockParser parser = new BlockParser(tokens);

            try {
                parser.prog();
            } catch (RecognitionException e)  {
                e.printStackTrace();
            }
        }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start prog
    // /home/sambuddho/plt_project/Block.g:31:1: prog : 'prog' ( statement_list )+ 'endprog' -> ^( 'prog_begin' ( statement_list )+ 'prog_end' ) ;
    public final prog_return prog() throws RecognitionException {
        prog_return retval = new prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token string_literal3=null;
        statement_list_return statement_list2 = null;


        Object string_literal1_tree=null;
        Object string_literal3_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try { dbg.enterRule("prog");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(31, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:32:2: ( 'prog' ( statement_list )+ 'endprog' -> ^( 'prog_begin' ( statement_list )+ 'prog_end' ) )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:32:4: 'prog' ( statement_list )+ 'endprog'
            {
            dbg.location(32,4);
            string_literal1=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_prog103); 
            stream_30.add(string_literal1);

            dbg.location(32,11);
            // /home/sambuddho/plt_project/Block.g:32:11: ( statement_list )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER||LA1_0==STRING||(LA1_0>=COMMA && LA1_0<=CHAR)||LA1_0==OBJECT_NAME||LA1_0==DELIMITER||LA1_0==32||LA1_0==37||LA1_0==39||LA1_0==52||(LA1_0>=57 && LA1_0<=67)||LA1_0==72||LA1_0==75||LA1_0==80) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:32:11: statement_list
            	    {
            	    dbg.location(32,11);
            	    pushFollow(FOLLOW_statement_list_in_prog105);
            	    statement_list2=statement_list();
            	    _fsp--;

            	    stream_statement_list.add(statement_list2.getTree());

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

            dbg.location(32,27);
            string_literal3=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_prog108); 
            stream_31.add(string_literal3);

            dbg.location(32,37);

            // AST REWRITE
            // elements: PROG_BEGIN, statement_list, PROG_END
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:37: -> ^( 'prog_begin' ( statement_list )+ 'prog_end' )
            {
                dbg.location(32,40);
                // /home/sambuddho/plt_project/Block.g:32:40: ^( 'prog_begin' ( statement_list )+ 'prog_end' )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(32,42);
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(PROG_BEGIN, "PROG_BEGIN"), root_1);

                dbg.location(32,55);
                if ( !(stream_statement_list.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement_list.hasNext() ) {
                    dbg.location(32,55);
                    adaptor.addChild(root_1, stream_statement_list.next());

                }
                stream_statement_list.reset();
                dbg.location(32,71);
                adaptor.addChild(root_1, adaptor.create(PROG_END, "PROG_END"));

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(32, 83);

        }
        finally {
            dbg.exitRule("prog");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end prog

    public static class statement_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement_list
    // /home/sambuddho/plt_project/Block.g:34:2: statement_list : ( statement | declr_stmt );
    public final statement_list_return statement_list() throws RecognitionException {
        statement_list_return retval = new statement_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_return statement4 = null;

        declr_stmt_return declr_stmt5 = null;



        try { dbg.enterRule("statement_list");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(34, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:35:3: ( statement | declr_stmt )
            int alt2=2;
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==NUMBER||LA2_0==STRING||(LA2_0>=COMMA && LA2_0<=CHAR)||LA2_0==OBJECT_NAME||LA2_0==DELIMITER||LA2_0==32||LA2_0==37||LA2_0==39||LA2_0==52||(LA2_0>=66 && LA2_0<=67)||LA2_0==72||LA2_0==75||LA2_0==80) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=57 && LA2_0<=65)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("34:2: statement_list : ( statement | declr_stmt );", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:35:5: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(35,5);
                    pushFollow(FOLLOW_statement_in_statement_list133);
                    statement4=statement();
                    _fsp--;

                    adaptor.addChild(root_0, statement4.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:36:5: declr_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(36,5);
                    pushFollow(FOLLOW_declr_stmt_in_statement_list139);
                    declr_stmt5=declr_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, declr_stmt5.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(37, 3);

        }
        finally {
            dbg.exitRule("statement_list");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end statement_list

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // /home/sambuddho/plt_project/Block.g:39:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        condition_statement_return condition_statement6 = null;

        iteration_statement_return iteration_statement7 = null;

        statement_expr_return statement_expr8 = null;

        print_statement_return print_statement9 = null;



        try { dbg.enterRule("statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(39, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:40:3: ( condition_statement | iteration_statement | statement_expr | print_statement )
            int alt3=4;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case NUMBER:
            case STRING:
            case COMMA:
            case CHAR:
            case OBJECT_NAME:
            case DELIMITER:
            case 52:
            case 66:
            case 67:
            case 72:
            case 75:
            case 80:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("39:2: statement : ( condition_statement | iteration_statement | statement_expr | print_statement );", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:40:5: condition_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(40,5);
                    pushFollow(FOLLOW_condition_statement_in_statement154);
                    condition_statement6=condition_statement();
                    _fsp--;

                    adaptor.addChild(root_0, condition_statement6.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:41:5: iteration_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(41,5);
                    pushFollow(FOLLOW_iteration_statement_in_statement160);
                    iteration_statement7=iteration_statement();
                    _fsp--;

                    adaptor.addChild(root_0, iteration_statement7.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/plt_project/Block.g:42:5: statement_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,5);
                    pushFollow(FOLLOW_statement_expr_in_statement166);
                    statement_expr8=statement_expr();
                    _fsp--;

                    adaptor.addChild(root_0, statement_expr8.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sambuddho/plt_project/Block.g:43:5: print_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,5);
                    pushFollow(FOLLOW_print_statement_in_statement172);
                    print_statement9=print_statement();
                    _fsp--;

                    adaptor.addChild(root_0, print_statement9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(44, 3);

        }
        finally {
            dbg.exitRule("statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end statement

    public static class statement_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement_expr
    // /home/sambuddho/plt_project/Block.g:46:2: statement_expr : ( ';' | expression ';' );
    public final statement_expr_return statement_expr() throws RecognitionException {
        statement_expr_return retval = new statement_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        expression_return expression11 = null;


        Object char_literal10_tree=null;
        Object char_literal12_tree=null;

        try { dbg.enterRule("statement_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(46, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:47:3: ( ';' | expression ';' )
            int alt4=2;
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==DELIMITER) ) {
                alt4=1;
            }
            else if ( (LA4_0==NUMBER||LA4_0==STRING||(LA4_0>=COMMA && LA4_0<=CHAR)||LA4_0==OBJECT_NAME||LA4_0==52||(LA4_0>=66 && LA4_0<=67)||LA4_0==72||LA4_0==75||LA4_0==80) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("46:2: statement_expr : ( ';' | expression ';' );", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:47:5: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,5);
                    char_literal10=(Token)input.LT(1);
                    match(input,DELIMITER,FOLLOW_DELIMITER_in_statement_expr188); 
                    char_literal10_tree = (Object)adaptor.create(char_literal10);
                    adaptor.addChild(root_0, char_literal10_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:48:5: expression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,5);
                    pushFollow(FOLLOW_expression_in_statement_expr194);
                    expression11=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression11.getTree());
                    dbg.location(48,16);
                    char_literal12=(Token)input.LT(1);
                    match(input,DELIMITER,FOLLOW_DELIMITER_in_statement_expr196); 
                    char_literal12_tree = (Object)adaptor.create(char_literal12);
                    adaptor.addChild(root_0, char_literal12_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(49, 3);

        }
        finally {
            dbg.exitRule("statement_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end statement_expr

    public static class condition_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start condition_statement
    // /home/sambuddho/plt_project/Block.g:51:2: condition_statement : 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' ;
    public final condition_statement_return condition_statement() throws RecognitionException {
        condition_statement_return retval = new condition_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal13=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Token string_literal18=null;
        Token string_literal20=null;
        equality_expr_return equality_expr15 = null;

        statement_list_return statement_list17 = null;

        statement_list_return statement_list19 = null;


        Object string_literal13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        Object string_literal18_tree=null;
        Object string_literal20_tree=null;

        try { dbg.enterRule("condition_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(51, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:52:3: ( 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:52:5: 'if' '(' equality_expr ')' statement_list ( 'else' statement_list )? 'endif'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(52,5);
            string_literal13=(Token)input.LT(1);
            match(input,32,FOLLOW_32_in_condition_statement212); 
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            adaptor.addChild(root_0, string_literal13_tree);

            dbg.location(52,10);
            char_literal14=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_condition_statement214); 
            char_literal14_tree = (Object)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);

            dbg.location(52,14);
            pushFollow(FOLLOW_equality_expr_in_condition_statement216);
            equality_expr15=equality_expr();
            _fsp--;

            adaptor.addChild(root_0, equality_expr15.getTree());
            dbg.location(52,28);
            char_literal16=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_condition_statement218); 
            char_literal16_tree = (Object)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);

            dbg.location(52,32);
            pushFollow(FOLLOW_statement_list_in_condition_statement220);
            statement_list17=statement_list();
            _fsp--;

            adaptor.addChild(root_0, statement_list17.getTree());
            dbg.location(52,47);
            // /home/sambuddho/plt_project/Block.g:52:47: ( 'else' statement_list )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:52:48: 'else' statement_list
                    {
                    dbg.location(52,48);
                    string_literal18=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_condition_statement223); 
                    string_literal18_tree = (Object)adaptor.create(string_literal18);
                    adaptor.addChild(root_0, string_literal18_tree);

                    dbg.location(52,55);
                    pushFollow(FOLLOW_statement_list_in_condition_statement225);
                    statement_list19=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list19.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(52,72);
            string_literal20=(Token)input.LT(1);
            match(input,36,FOLLOW_36_in_condition_statement229); 
            string_literal20_tree = (Object)adaptor.create(string_literal20);
            adaptor.addChild(root_0, string_literal20_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(53, 3);

        }
        finally {
            dbg.exitRule("condition_statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end condition_statement

    public static class iteration_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start iteration_statement
    // /home/sambuddho/plt_project/Block.g:55:2: iteration_statement : 'while' '(' equality_expr ')' statement_list 'endwhile' ;
    public final iteration_statement_return iteration_statement() throws RecognitionException {
        iteration_statement_return retval = new iteration_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token string_literal26=null;
        equality_expr_return equality_expr23 = null;

        statement_list_return statement_list25 = null;


        Object string_literal21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        Object string_literal26_tree=null;

        try { dbg.enterRule("iteration_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(55, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:56:3: ( 'while' '(' equality_expr ')' statement_list 'endwhile' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:56:5: 'while' '(' equality_expr ')' statement_list 'endwhile'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(56,5);
            string_literal21=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_iteration_statement245); 
            string_literal21_tree = (Object)adaptor.create(string_literal21);
            adaptor.addChild(root_0, string_literal21_tree);

            dbg.location(56,13);
            char_literal22=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_iteration_statement247); 
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);

            dbg.location(56,17);
            pushFollow(FOLLOW_equality_expr_in_iteration_statement249);
            equality_expr23=equality_expr();
            _fsp--;

            adaptor.addChild(root_0, equality_expr23.getTree());
            dbg.location(56,31);
            char_literal24=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_iteration_statement251); 
            char_literal24_tree = (Object)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);

            dbg.location(56,35);
            pushFollow(FOLLOW_statement_list_in_iteration_statement253);
            statement_list25=statement_list();
            _fsp--;

            adaptor.addChild(root_0, statement_list25.getTree());
            dbg.location(56,50);
            string_literal26=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_iteration_statement255); 
            string_literal26_tree = (Object)adaptor.create(string_literal26);
            adaptor.addChild(root_0, string_literal26_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
            dbg.exitRule("iteration_statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end iteration_statement

    public static class print_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start print_statement
    // /home/sambuddho/plt_project/Block.g:59:2: print_statement : 'echo' STRING ';' ;
    public final print_statement_return print_statement() throws RecognitionException {
        print_statement_return retval = new print_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal27=null;
        Token STRING28=null;
        Token char_literal29=null;

        Object string_literal27_tree=null;
        Object STRING28_tree=null;
        Object char_literal29_tree=null;

        try { dbg.enterRule("print_statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(59, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:60:3: ( 'echo' STRING ';' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:60:5: 'echo' STRING ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(60,5);
            string_literal27=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_print_statement271); 
            string_literal27_tree = (Object)adaptor.create(string_literal27);
            adaptor.addChild(root_0, string_literal27_tree);

            dbg.location(60,12);
            STRING28=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_print_statement273); 
            STRING28_tree = (Object)adaptor.create(STRING28);
            adaptor.addChild(root_0, STRING28_tree);

            dbg.location(60,19);
            char_literal29=(Token)input.LT(1);
            match(input,DELIMITER,FOLLOW_DELIMITER_in_print_statement275); 
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(61, 3);

        }
        finally {
            dbg.exitRule("print_statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end print_statement

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression
    // /home/sambuddho/plt_project/Block.g:63:2: expression : assignment_expr ( ',' assignment_expr )* ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        assignment_expr_return assignment_expr30 = null;

        assignment_expr_return assignment_expr32 = null;


        Object char_literal31_tree=null;

        try { dbg.enterRule("expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(63, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:64:3: ( assignment_expr ( ',' assignment_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:64:5: assignment_expr ( ',' assignment_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(64,5);
            pushFollow(FOLLOW_assignment_expr_in_expression291);
            assignment_expr30=assignment_expr();
            _fsp--;

            adaptor.addChild(root_0, assignment_expr30.getTree());
            dbg.location(64,21);
            // /home/sambuddho/plt_project/Block.g:64:21: ( ',' assignment_expr )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:64:22: ',' assignment_expr
            	    {
            	    dbg.location(64,22);
            	    char_literal31=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression294); 
            	    char_literal31_tree = (Object)adaptor.create(char_literal31);
            	    adaptor.addChild(root_0, char_literal31_tree);

            	    dbg.location(64,26);
            	    pushFollow(FOLLOW_assignment_expr_in_expression296);
            	    assignment_expr32=assignment_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, assignment_expr32.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(65, 3);

        }
        finally {
            dbg.exitRule("expression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end expression

    public static class assignment_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignment_expr
    // /home/sambuddho/plt_project/Block.g:67:2: assignment_expr : ( | object_name assignment_operator assignment_expr ( ',' assignment_expr )* | conditional_expr );
    public final assignment_expr_return assignment_expr() throws RecognitionException {
        assignment_expr_return retval = new assignment_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal36=null;
        object_name_return object_name33 = null;

        assignment_operator_return assignment_operator34 = null;

        assignment_expr_return assignment_expr35 = null;

        assignment_expr_return assignment_expr37 = null;

        conditional_expr_return conditional_expr38 = null;


        Object char_literal36_tree=null;

        try { dbg.enterRule("assignment_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(67, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:68:3: ( | object_name assignment_operator assignment_expr ( ',' assignment_expr )* | conditional_expr )
            int alt8=3;
            try { dbg.enterDecision(8);

            switch ( input.LA(1) ) {
            case COMMA:
            case DELIMITER:
            case 41:
                {
                alt8=1;
                }
                break;
            case OBJECT_NAME:
                {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=PLUS && LA8_2<=DIV)||LA8_2==COMMA||LA8_2==OBJECT_NAME||LA8_2==DOT||LA8_2==DELIMITER||(LA8_2>=40 && LA8_2<=51)||(LA8_2>=66 && LA8_2<=67)||LA8_2==80) ) {
                    alt8=3;
                }
                else if ( (LA8_2==EQUAL||(LA8_2>=53 && LA8_2<=56)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("67:2: assignment_expr : ( | object_name assignment_operator assignment_expr ( ',' assignment_expr )* | conditional_expr );", 8, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case STRING:
            case CHAR:
            case 52:
            case 66:
            case 67:
            case 72:
            case 75:
            case 80:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("67:2: assignment_expr : ( | object_name assignment_operator assignment_expr ( ',' assignment_expr )* | conditional_expr );", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:71:3: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:71:4: object_name assignment_operator assignment_expr ( ',' assignment_expr )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,4);
                    pushFollow(FOLLOW_object_name_in_assignment_expr322);
                    object_name33=object_name();
                    _fsp--;

                    adaptor.addChild(root_0, object_name33.getTree());
                    dbg.location(71,16);
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expr324);
                    assignment_operator34=assignment_operator();
                    _fsp--;

                    adaptor.addChild(root_0, assignment_operator34.getTree());
                    dbg.location(71,36);
                    pushFollow(FOLLOW_assignment_expr_in_assignment_expr326);
                    assignment_expr35=assignment_expr();
                    _fsp--;

                    adaptor.addChild(root_0, assignment_expr35.getTree());
                    dbg.location(71,52);
                    // /home/sambuddho/plt_project/Block.g:71:52: ( ',' assignment_expr )*
                    try { dbg.enterSubRule(7);

                    loop7:
                    do {
                        int alt7=2;
                        try { dbg.enterDecision(7);

                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        } finally {dbg.exitDecision(7);}

                        switch (alt7) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sambuddho/plt_project/Block.g:71:53: ',' assignment_expr
                    	    {
                    	    dbg.location(71,53);
                    	    char_literal36=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_assignment_expr329); 
                    	    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    	    adaptor.addChild(root_0, char_literal36_tree);

                    	    dbg.location(71,57);
                    	    pushFollow(FOLLOW_assignment_expr_in_assignment_expr331);
                    	    assignment_expr37=assignment_expr();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, assignment_expr37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(7);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/plt_project/Block.g:73:6: conditional_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(73,6);
                    pushFollow(FOLLOW_conditional_expr_in_assignment_expr341);
                    conditional_expr38=conditional_expr();
                    _fsp--;

                    adaptor.addChild(root_0, conditional_expr38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
            dbg.exitRule("assignment_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end assignment_expr

    public static class conditional_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start conditional_expr
    // /home/sambuddho/plt_project/Block.g:78:2: conditional_expr : logicalOR_expr ( '?' expression ':' conditional_expr )? ;
    public final conditional_expr_return conditional_expr() throws RecognitionException {
        conditional_expr_return retval = new conditional_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal40=null;
        Token char_literal42=null;
        logicalOR_expr_return logicalOR_expr39 = null;

        expression_return expression41 = null;

        conditional_expr_return conditional_expr43 = null;


        Object char_literal40_tree=null;
        Object char_literal42_tree=null;

        try { dbg.enterRule("conditional_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(78, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:79:3: ( logicalOR_expr ( '?' expression ':' conditional_expr )? )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:79:5: logicalOR_expr ( '?' expression ':' conditional_expr )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(79,5);
            pushFollow(FOLLOW_logicalOR_expr_in_conditional_expr362);
            logicalOR_expr39=logicalOR_expr();
            _fsp--;

            adaptor.addChild(root_0, logicalOR_expr39.getTree());
            dbg.location(79,19);
            // /home/sambuddho/plt_project/Block.g:79:19: ( '?' expression ':' conditional_expr )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:79:21: '?' expression ':' conditional_expr
                    {
                    dbg.location(79,21);
                    char_literal40=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_conditional_expr365); 
                    char_literal40_tree = (Object)adaptor.create(char_literal40);
                    adaptor.addChild(root_0, char_literal40_tree);

                    dbg.location(79,25);
                    pushFollow(FOLLOW_expression_in_conditional_expr367);
                    expression41=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression41.getTree());
                    dbg.location(79,36);
                    char_literal42=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_conditional_expr369); 
                    char_literal42_tree = (Object)adaptor.create(char_literal42);
                    adaptor.addChild(root_0, char_literal42_tree);

                    dbg.location(79,40);
                    pushFollow(FOLLOW_conditional_expr_in_conditional_expr371);
                    conditional_expr43=conditional_expr();
                    _fsp--;

                    adaptor.addChild(root_0, conditional_expr43.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(80, 3);

        }
        finally {
            dbg.exitRule("conditional_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end conditional_expr

    public static class logicalOR_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalOR_expr
    // /home/sambuddho/plt_project/Block.g:82:2: logicalOR_expr : logicalAND_expr ( '||' logicalAND_expr )* ;
    public final logicalOR_expr_return logicalOR_expr() throws RecognitionException {
        logicalOR_expr_return retval = new logicalOR_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45=null;
        logicalAND_expr_return logicalAND_expr44 = null;

        logicalAND_expr_return logicalAND_expr46 = null;


        Object string_literal45_tree=null;

        try { dbg.enterRule("logicalOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(82, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:83:3: ( logicalAND_expr ( '||' logicalAND_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:83:5: logicalAND_expr ( '||' logicalAND_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(83,5);
            pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr389);
            logicalAND_expr44=logicalAND_expr();
            _fsp--;

            adaptor.addChild(root_0, logicalAND_expr44.getTree());
            dbg.location(83,21);
            // /home/sambuddho/plt_project/Block.g:83:21: ( '||' logicalAND_expr )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:83:22: '||' logicalAND_expr
            	    {
            	    dbg.location(83,22);
            	    string_literal45=(Token)input.LT(1);
            	    match(input,42,FOLLOW_42_in_logicalOR_expr392); 
            	    string_literal45_tree = (Object)adaptor.create(string_literal45);
            	    adaptor.addChild(root_0, string_literal45_tree);

            	    dbg.location(83,27);
            	    pushFollow(FOLLOW_logicalAND_expr_in_logicalOR_expr394);
            	    logicalAND_expr46=logicalAND_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAND_expr46.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(84, 3);

        }
        finally {
            dbg.exitRule("logicalOR_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end logicalOR_expr

    public static class logicalAND_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalAND_expr
    // /home/sambuddho/plt_project/Block.g:86:2: logicalAND_expr : bitwiseOR_expr ( '&&' bitwiseOR_expr )* ;
    public final logicalAND_expr_return logicalAND_expr() throws RecognitionException {
        logicalAND_expr_return retval = new logicalAND_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal48=null;
        bitwiseOR_expr_return bitwiseOR_expr47 = null;

        bitwiseOR_expr_return bitwiseOR_expr49 = null;


        Object string_literal48_tree=null;

        try { dbg.enterRule("logicalAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(86, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:87:3: ( bitwiseOR_expr ( '&&' bitwiseOR_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:87:5: bitwiseOR_expr ( '&&' bitwiseOR_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(87,5);
            pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr411);
            bitwiseOR_expr47=bitwiseOR_expr();
            _fsp--;

            adaptor.addChild(root_0, bitwiseOR_expr47.getTree());
            dbg.location(87,20);
            // /home/sambuddho/plt_project/Block.g:87:20: ( '&&' bitwiseOR_expr )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:87:21: '&&' bitwiseOR_expr
            	    {
            	    dbg.location(87,21);
            	    string_literal48=(Token)input.LT(1);
            	    match(input,43,FOLLOW_43_in_logicalAND_expr414); 
            	    string_literal48_tree = (Object)adaptor.create(string_literal48);
            	    adaptor.addChild(root_0, string_literal48_tree);

            	    dbg.location(87,26);
            	    pushFollow(FOLLOW_bitwiseOR_expr_in_logicalAND_expr416);
            	    bitwiseOR_expr49=bitwiseOR_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseOR_expr49.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(88, 3);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseOR_expr
    // /home/sambuddho/plt_project/Block.g:90:2: bitwiseOR_expr : bitwiseAND_expr ( '|' bitwiseAND_expr )* ;
    public final bitwiseOR_expr_return bitwiseOR_expr() throws RecognitionException {
        bitwiseOR_expr_return retval = new bitwiseOR_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal51=null;
        bitwiseAND_expr_return bitwiseAND_expr50 = null;

        bitwiseAND_expr_return bitwiseAND_expr52 = null;


        Object char_literal51_tree=null;

        try { dbg.enterRule("bitwiseOR_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(90, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:91:3: ( bitwiseAND_expr ( '|' bitwiseAND_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:91:5: bitwiseAND_expr ( '|' bitwiseAND_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(91,5);
            pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr434);
            bitwiseAND_expr50=bitwiseAND_expr();
            _fsp--;

            adaptor.addChild(root_0, bitwiseAND_expr50.getTree());
            dbg.location(91,21);
            // /home/sambuddho/plt_project/Block.g:91:21: ( '|' bitwiseAND_expr )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==44) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:91:22: '|' bitwiseAND_expr
            	    {
            	    dbg.location(91,22);
            	    char_literal51=(Token)input.LT(1);
            	    match(input,44,FOLLOW_44_in_bitwiseOR_expr437); 
            	    char_literal51_tree = (Object)adaptor.create(char_literal51);
            	    adaptor.addChild(root_0, char_literal51_tree);

            	    dbg.location(91,26);
            	    pushFollow(FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr439);
            	    bitwiseAND_expr52=bitwiseAND_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, bitwiseAND_expr52.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(92, 3);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitwiseAND_expr
    // /home/sambuddho/plt_project/Block.g:94:2: bitwiseAND_expr : equality_expr ( '&' equality_expr )* ;
    public final bitwiseAND_expr_return bitwiseAND_expr() throws RecognitionException {
        bitwiseAND_expr_return retval = new bitwiseAND_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54=null;
        equality_expr_return equality_expr53 = null;

        equality_expr_return equality_expr55 = null;


        Object char_literal54_tree=null;

        try { dbg.enterRule("bitwiseAND_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(94, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:95:3: ( equality_expr ( '&' equality_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:95:5: equality_expr ( '&' equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(95,5);
            pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr456);
            equality_expr53=equality_expr();
            _fsp--;

            adaptor.addChild(root_0, equality_expr53.getTree());
            dbg.location(95,19);
            // /home/sambuddho/plt_project/Block.g:95:19: ( '&' equality_expr )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==45) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:95:20: '&' equality_expr
            	    {
            	    dbg.location(95,20);
            	    char_literal54=(Token)input.LT(1);
            	    match(input,45,FOLLOW_45_in_bitwiseAND_expr459); 
            	    char_literal54_tree = (Object)adaptor.create(char_literal54);
            	    adaptor.addChild(root_0, char_literal54_tree);

            	    dbg.location(95,24);
            	    pushFollow(FOLLOW_equality_expr_in_bitwiseAND_expr461);
            	    equality_expr55=equality_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, equality_expr55.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(96, 3);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equality_expr
    // /home/sambuddho/plt_project/Block.g:98:2: equality_expr : relational_expr ( ( '==' | '!=' ) relational_expr )* ;
    public final equality_expr_return equality_expr() throws RecognitionException {
        equality_expr_return retval = new equality_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set57=null;
        relational_expr_return relational_expr56 = null;

        relational_expr_return relational_expr58 = null;


        Object set57_tree=null;

        try { dbg.enterRule("equality_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(98, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:99:3: ( relational_expr ( ( '==' | '!=' ) relational_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:99:5: relational_expr ( ( '==' | '!=' ) relational_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(99,5);
            pushFollow(FOLLOW_relational_expr_in_equality_expr479);
            relational_expr56=relational_expr();
            _fsp--;

            adaptor.addChild(root_0, relational_expr56.getTree());
            dbg.location(99,21);
            // /home/sambuddho/plt_project/Block.g:99:21: ( ( '==' | '!=' ) relational_expr )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=46 && LA14_0<=47)) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:99:23: ( '==' | '!=' ) relational_expr
            	    {
            	    dbg.location(99,23);
            	    set57=(Token)input.LT(1);
            	    if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, adaptor.create(set57));
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expr483);    throw mse;
            	    }

            	    dbg.location(99,37);
            	    pushFollow(FOLLOW_relational_expr_in_equality_expr491);
            	    relational_expr58=relational_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, relational_expr58.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(100, 3);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relational_expr
    // /home/sambuddho/plt_project/Block.g:102:2: relational_expr : expr ( ( '<' | '>' | '<=' | '>=' ) expr )* ;
    public final relational_expr_return relational_expr() throws RecognitionException {
        relational_expr_return retval = new relational_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set60=null;
        expr_return expr59 = null;

        expr_return expr61 = null;


        Object set60_tree=null;

        try { dbg.enterRule("relational_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(102, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:103:3: ( expr ( ( '<' | '>' | '<=' | '>=' ) expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:103:5: expr ( ( '<' | '>' | '<=' | '>=' ) expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,5);
            pushFollow(FOLLOW_expr_in_relational_expr510);
            expr59=expr();
            _fsp--;

            adaptor.addChild(root_0, expr59.getTree());
            dbg.location(103,10);
            // /home/sambuddho/plt_project/Block.g:103:10: ( ( '<' | '>' | '<=' | '>=' ) expr )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=48 && LA15_0<=51)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:103:12: ( '<' | '>' | '<=' | '>=' ) expr
            	    {
            	    dbg.location(103,12);
            	    set60=(Token)input.LT(1);
            	    if ( (input.LA(1)>=48 && input.LA(1)<=51) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, adaptor.create(set60));
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expr514);    throw mse;
            	    }

            	    dbg.location(103,32);
            	    pushFollow(FOLLOW_expr_in_relational_expr524);
            	    expr61=expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, expr61.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(104, 3);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expr
    // /home/sambuddho/plt_project/Block.g:107:2: expr : term ( ( PLUS | MINUS ) term )* ;
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set63=null;
        term_return term62 = null;

        term_return term64 = null;


        Object set63_tree=null;

        try { dbg.enterRule("expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(107, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:107:7: ( term ( ( PLUS | MINUS ) term )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:107:9: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(107,9);
            pushFollow(FOLLOW_term_in_expr542);
            term62=term();
            _fsp--;

            adaptor.addChild(root_0, term62.getTree());
            dbg.location(107,14);
            // /home/sambuddho/plt_project/Block.g:107:14: ( ( PLUS | MINUS ) term )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=PLUS && LA16_0<=MINUS)) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:107:16: ( PLUS | MINUS ) term
            	    {
            	    dbg.location(107,16);
            	    set63=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, adaptor.create(set63));
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr546);    throw mse;
            	    }

            	    dbg.location(107,34);
            	    pushFollow(FOLLOW_term_in_expr557);
            	    term64=term();
            	    _fsp--;

            	    adaptor.addChild(root_0, term64.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(107, 42);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start term
    // /home/sambuddho/plt_project/Block.g:109:2: term : unary_expr ( ( MULT | DIV ) unary_expr )* ;
    public final term_return term() throws RecognitionException {
        term_return retval = new term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set66=null;
        unary_expr_return unary_expr65 = null;

        unary_expr_return unary_expr67 = null;


        Object set66_tree=null;

        try { dbg.enterRule("term");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(109, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:109:7: ( unary_expr ( ( MULT | DIV ) unary_expr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:109:9: unary_expr ( ( MULT | DIV ) unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(109,9);
            pushFollow(FOLLOW_unary_expr_in_term571);
            unary_expr65=unary_expr();
            _fsp--;

            adaptor.addChild(root_0, unary_expr65.getTree());
            dbg.location(109,20);
            // /home/sambuddho/plt_project/Block.g:109:20: ( ( MULT | DIV ) unary_expr )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=MULT && LA17_0<=DIV)) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:109:22: ( MULT | DIV ) unary_expr
            	    {
            	    dbg.location(109,22);
            	    set66=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, adaptor.create(set66));
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_term575);    throw mse;
            	    }

            	    dbg.location(109,37);
            	    pushFollow(FOLLOW_unary_expr_in_term585);
            	    unary_expr67=unary_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, unary_expr67.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(109, 51);

        }
        finally {
            dbg.exitRule("term");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end term

    public static class unary_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unary_expr
    // /home/sambuddho/plt_project/Block.g:111:2: unary_expr : ( postfix_expression | '~' unary_expr );
    public final unary_expr_return unary_expr() throws RecognitionException {
        unary_expr_return retval = new unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        postfix_expression_return postfix_expression68 = null;

        unary_expr_return unary_expr70 = null;


        Object char_literal69_tree=null;

        try { dbg.enterRule("unary_expr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(111, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:112:3: ( postfix_expression | '~' unary_expr )
            int alt18=2;
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==NUMBER||LA18_0==STRING||LA18_0==CHAR||LA18_0==OBJECT_NAME||(LA18_0>=66 && LA18_0<=67)||LA18_0==72||LA18_0==75||LA18_0==80) ) {
                alt18=1;
            }
            else if ( (LA18_0==52) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("111:2: unary_expr : ( postfix_expression | '~' unary_expr );", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:112:5: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(112,5);
                    pushFollow(FOLLOW_postfix_expression_in_unary_expr601);
                    postfix_expression68=postfix_expression();
                    _fsp--;

                    adaptor.addChild(root_0, postfix_expression68.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:113:5: '~' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,5);
                    char_literal69=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_unary_expr607); 
                    char_literal69_tree = (Object)adaptor.create(char_literal69);
                    adaptor.addChild(root_0, char_literal69_tree);

                    dbg.location(113,9);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr609);
                    unary_expr70=unary_expr();
                    _fsp--;

                    adaptor.addChild(root_0, unary_expr70.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(116, 3);

        }
        finally {
            dbg.exitRule("unary_expr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end unary_expr

    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start postfix_expression
    // /home/sambuddho/plt_project/Block.g:118:2: postfix_expression : factor ( '.' ID )* ;
    public final postfix_expression_return postfix_expression() throws RecognitionException {
        postfix_expression_return retval = new postfix_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal72=null;
        Token ID73=null;
        factor_return factor71 = null;


        Object char_literal72_tree=null;
        Object ID73_tree=null;

        try { dbg.enterRule("postfix_expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(118, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:119:3: ( factor ( '.' ID )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:119:5: factor ( '.' ID )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,5);
            pushFollow(FOLLOW_factor_in_postfix_expression630);
            factor71=factor();
            _fsp--;

            adaptor.addChild(root_0, factor71.getTree());
            dbg.location(119,12);
            // /home/sambuddho/plt_project/Block.g:119:12: ( '.' ID )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==DOT) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:119:13: '.' ID
            	    {
            	    dbg.location(119,13);
            	    char_literal72=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_postfix_expression633); 
            	    char_literal72_tree = (Object)adaptor.create(char_literal72);
            	    adaptor.addChild(root_0, char_literal72_tree);

            	    dbg.location(119,16);
            	    ID73=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_postfix_expression634); 
            	    ID73_tree = (Object)adaptor.create(ID73);
            	    adaptor.addChild(root_0, ID73_tree);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(120, 3);

        }
        finally {
            dbg.exitRule("postfix_expression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end postfix_expression

    public static class assignment_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignment_operator
    // /home/sambuddho/plt_project/Block.g:122:2: assignment_operator : ( '=' | '*=' | '/=' | '+=' | '-=' );
    public final assignment_operator_return assignment_operator() throws RecognitionException {
        assignment_operator_return retval = new assignment_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try { dbg.enterRule("assignment_operator");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(122, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:123:3: ( '=' | '*=' | '/=' | '+=' | '-=' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(123,3);
            set74=(Token)input.LT(1);
            if ( input.LA(1)==EQUAL||(input.LA(1)>=53 && input.LA(1)<=56) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set74));
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

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(128, 3);

        }
        finally {
            dbg.exitRule("assignment_operator");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end assignment_operator

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start factor
    // /home/sambuddho/plt_project/Block.g:130:2: factor : ( object_name | literal );
    public final factor_return factor() throws RecognitionException {
        factor_return retval = new factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        object_name_return object_name75 = null;

        literal_return literal76 = null;



        try { dbg.enterRule("factor");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(130, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:130:9: ( object_name | literal )
            int alt20=2;
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==OBJECT_NAME) ) {
                alt20=1;
            }
            else if ( (LA20_0==NUMBER||LA20_0==STRING||LA20_0==CHAR||(LA20_0>=66 && LA20_0<=67)||LA20_0==72||LA20_0==75||LA20_0==80) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("130:2: factor : ( object_name | literal );", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:130:11: object_name
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(130,11);
                    pushFollow(FOLLOW_object_name_in_factor688);
                    object_name75=object_name();
                    _fsp--;

                    adaptor.addChild(root_0, object_name75.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:131:5: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(131,5);
                    pushFollow(FOLLOW_literal_in_factor694);
                    literal76=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal76.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(133, 3);

        }
        finally {
            dbg.exitRule("factor");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end factor

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start literal
    // /home/sambuddho/plt_project/Block.g:135:2: literal : object_values ;
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        object_values_return object_values77 = null;



        try { dbg.enterRule("literal");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(135, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:135:9: ( object_values )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:135:11: object_values
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,11);
            pushFollow(FOLLOW_object_values_in_literal710);
            object_values77=object_values();
            _fsp--;

            adaptor.addChild(root_0, object_values77.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(136, 3);

        }
        finally {
            dbg.exitRule("literal");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end literal

    public static class declr_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start declr_stmt
    // /home/sambuddho/plt_project/Block.g:138:1: declr_stmt : type_name object_name ( COMMA object_name )* ';' ;
    public final declr_stmt_return declr_stmt() throws RecognitionException {
        declr_stmt_return retval = new declr_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA80=null;
        Token char_literal82=null;
        type_name_return type_name78 = null;

        object_name_return object_name79 = null;

        object_name_return object_name81 = null;


        Object COMMA80_tree=null;
        Object char_literal82_tree=null;

        try { dbg.enterRule("declr_stmt");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(138, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:139:2: ( type_name object_name ( COMMA object_name )* ';' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:140:1: type_name object_name ( COMMA object_name )* ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(140,1);
            pushFollow(FOLLOW_type_name_in_declr_stmt722);
            type_name78=type_name();
            _fsp--;

            adaptor.addChild(root_0, type_name78.getTree());
            dbg.location(140,11);
            pushFollow(FOLLOW_object_name_in_declr_stmt724);
            object_name79=object_name();
            _fsp--;

            adaptor.addChild(root_0, object_name79.getTree());
            dbg.location(140,22);
            // /home/sambuddho/plt_project/Block.g:140:22: ( COMMA object_name )*
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

            	    // /home/sambuddho/plt_project/Block.g:140:23: COMMA object_name
            	    {
            	    dbg.location(140,23);
            	    COMMA80=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_declr_stmt726); 
            	    COMMA80_tree = (Object)adaptor.create(COMMA80);
            	    adaptor.addChild(root_0, COMMA80_tree);

            	    dbg.location(140,29);
            	    pushFollow(FOLLOW_object_name_in_declr_stmt728);
            	    object_name81=object_name();
            	    _fsp--;

            	    adaptor.addChild(root_0, object_name81.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(140,43);
            char_literal82=(Token)input.LT(1);
            match(input,DELIMITER,FOLLOW_DELIMITER_in_declr_stmt732); 
            char_literal82_tree = (Object)adaptor.create(char_literal82);
            adaptor.addChild(root_0, char_literal82_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(140, 46);

        }
        finally {
            dbg.exitRule("declr_stmt");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end declr_stmt

    public static class object_values_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start object_values
    // /home/sambuddho/plt_project/Block.g:144:2: object_values : ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | object_name );
    public final object_values_return object_values() throws RecognitionException {
        object_values_return retval = new object_values_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING85=null;
        char_value_return char_value83 = null;

        int_value_return int_value84 = null;

        ip_addr_return ip_addr86 = null;

        policy_return policy87 = null;

        host_return host88 = null;

        role_return role89 = null;

        host_group_return host_group90 = null;

        topology_return topology91 = null;

        serv_group_return serv_group92 = null;

        object_name_return object_name93 = null;


        Object STRING85_tree=null;

        try { dbg.enterRule("object_values");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(144, 2);

        try {
            // /home/sambuddho/plt_project/Block.g:144:15: ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | object_name )
            int alt22=11;
            try { dbg.enterDecision(22);

            try {
                isCyclicDecision = true;
                alt22 = dfa22.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:144:17: char_value
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,17);
                    pushFollow(FOLLOW_char_value_in_object_values755);
                    char_value83=char_value();
                    _fsp--;

                    adaptor.addChild(root_0, char_value83.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:144:28: int_value
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,28);
                    pushFollow(FOLLOW_int_value_in_object_values757);
                    int_value84=int_value();
                    _fsp--;

                    adaptor.addChild(root_0, int_value84.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sambuddho/plt_project/Block.g:144:38: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,38);
                    STRING85=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_object_values759); 
                    STRING85_tree = (Object)adaptor.create(STRING85);
                    adaptor.addChild(root_0, STRING85_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sambuddho/plt_project/Block.g:144:45: ip_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,45);
                    pushFollow(FOLLOW_ip_addr_in_object_values761);
                    ip_addr86=ip_addr();
                    _fsp--;

                    adaptor.addChild(root_0, ip_addr86.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/sambuddho/plt_project/Block.g:144:53: policy
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,53);
                    pushFollow(FOLLOW_policy_in_object_values763);
                    policy87=policy();
                    _fsp--;

                    adaptor.addChild(root_0, policy87.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/sambuddho/plt_project/Block.g:144:60: host
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,60);
                    pushFollow(FOLLOW_host_in_object_values765);
                    host88=host();
                    _fsp--;

                    adaptor.addChild(root_0, host88.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/sambuddho/plt_project/Block.g:144:65: role
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,65);
                    pushFollow(FOLLOW_role_in_object_values767);
                    role89=role();
                    _fsp--;

                    adaptor.addChild(root_0, role89.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/sambuddho/plt_project/Block.g:144:70: host_group
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,70);
                    pushFollow(FOLLOW_host_group_in_object_values769);
                    host_group90=host_group();
                    _fsp--;

                    adaptor.addChild(root_0, host_group90.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/sambuddho/plt_project/Block.g:144:81: topology
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,81);
                    pushFollow(FOLLOW_topology_in_object_values771);
                    topology91=topology();
                    _fsp--;

                    adaptor.addChild(root_0, topology91.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/sambuddho/plt_project/Block.g:144:90: serv_group
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,90);
                    pushFollow(FOLLOW_serv_group_in_object_values773);
                    serv_group92=serv_group();
                    _fsp--;

                    adaptor.addChild(root_0, serv_group92.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/sambuddho/plt_project/Block.g:144:101: object_name
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,101);
                    pushFollow(FOLLOW_object_name_in_object_values775);
                    object_name93=object_name();
                    _fsp--;

                    adaptor.addChild(root_0, object_name93.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(144, 112);

        }
        finally {
            dbg.exitRule("object_values");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end object_values

    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start type_name
    // /home/sambuddho/plt_project/Block.g:146:1: type_name : ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' );
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set94=null;

        Object set94_tree=null;

        try { dbg.enterRule("type_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(146, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:147:2: ( 'topology_type_t' | 'host_type_t' | 'host_group_type_t' | 'serv_group_type_t' | 'role_type_t' | 'policy_type_t' | 'ipaddr_t' | 'int_type_t' | 'char_type_t' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,2);
            set94=(Token)input.LT(1);
            if ( (input.LA(1)>=57 && input.LA(1)<=65) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set94));
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

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(147, 143);

        }
        finally {
            dbg.exitRule("type_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end type_name

    public static class role_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start role
    // /home/sambuddho/plt_project/Block.g:148:1: role : policy ( COMMA policy )* ;
    public final role_return role() throws RecognitionException {
        role_return retval = new role_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA96=null;
        policy_return policy95 = null;

        policy_return policy97 = null;


        Object COMMA96_tree=null;

        try { dbg.enterRule("role");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(148, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:148:7: ( policy ( COMMA policy )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:148:9: policy ( COMMA policy )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(148,9);
            pushFollow(FOLLOW_policy_in_role809);
            policy95=policy();
            _fsp--;

            adaptor.addChild(root_0, policy95.getTree());
            dbg.location(148,16);
            // /home/sambuddho/plt_project/Block.g:148:16: ( COMMA policy )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    int LA23_2 = input.LA(2);

                    if ( ((LA23_2>=66 && LA23_2<=67)) ) {
                        int LA23_3 = input.LA(3);

                        if ( ((LA23_3>=68 && LA23_3<=69)) ) {
                            int LA23_4 = input.LA(4);

                            if ( ((LA23_4>=70 && LA23_4<=71)) ) {
                                int LA23_5 = input.LA(5);

                                if ( (LA23_5==NUMBER) ) {
                                    int LA23_6 = input.LA(6);

                                    if ( (LA23_6==NUMBER) ) {
                                        alt23=1;
                                    }


                                }
                                else if ( (LA23_5==ICMP_MESSAGE_TYPE) ) {
                                    alt23=1;
                                }


                            }


                        }


                    }


                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:148:17: COMMA policy
            	    {
            	    dbg.location(148,17);
            	    COMMA96=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_role812); 
            	    COMMA96_tree = (Object)adaptor.create(COMMA96);
            	    adaptor.addChild(root_0, COMMA96_tree);

            	    dbg.location(148,23);
            	    pushFollow(FOLLOW_policy_in_role814);
            	    policy97=policy();
            	    _fsp--;

            	    adaptor.addChild(root_0, policy97.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(148, 31);

        }
        finally {
            dbg.exitRule("role");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end role

    public static class policy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start policy
    // /home/sambuddho/plt_project/Block.g:149:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );
    public final policy_return policy() throws RecognitionException {
        policy_return retval = new policy_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        direction_return direction98 = null;

        verdict_return verdict99 = null;

        proto_return proto100 = null;

        port_return port101 = null;

        port_return port102 = null;

        direction_return direction103 = null;

        verdict_return verdict104 = null;

        proto_return proto105 = null;

        icmp_cntrl_message_return icmp_cntrl_message106 = null;



        try { dbg.enterRule("policy");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(149, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:149:9: ( direction verdict proto port port | direction verdict proto icmp_cntrl_message )
            int alt24=2;
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=66 && LA24_0<=67)) ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>=68 && LA24_1<=69)) ) {
                    int LA24_2 = input.LA(3);

                    if ( ((LA24_2>=70 && LA24_2<=71)) ) {
                        int LA24_3 = input.LA(4);

                        if ( (LA24_3==NUMBER) ) {
                            alt24=1;
                        }
                        else if ( (LA24_3==ICMP_MESSAGE_TYPE) ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("149:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 24, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("149:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 24, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("149:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 24, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("149:1: policy : ( direction verdict proto port port | direction verdict proto icmp_cntrl_message );", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:149:11: direction verdict proto port port
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(149,11);
                    pushFollow(FOLLOW_direction_in_policy824);
                    direction98=direction();
                    _fsp--;

                    adaptor.addChild(root_0, direction98.getTree());
                    dbg.location(149,21);
                    pushFollow(FOLLOW_verdict_in_policy826);
                    verdict99=verdict();
                    _fsp--;

                    adaptor.addChild(root_0, verdict99.getTree());
                    dbg.location(149,29);
                    pushFollow(FOLLOW_proto_in_policy828);
                    proto100=proto();
                    _fsp--;

                    adaptor.addChild(root_0, proto100.getTree());
                    dbg.location(149,35);
                    pushFollow(FOLLOW_port_in_policy830);
                    port101=port();
                    _fsp--;

                    adaptor.addChild(root_0, port101.getTree());
                    dbg.location(149,40);
                    pushFollow(FOLLOW_port_in_policy832);
                    port102=port();
                    _fsp--;

                    adaptor.addChild(root_0, port102.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:150:3: direction verdict proto icmp_cntrl_message
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(150,3);
                    pushFollow(FOLLOW_direction_in_policy836);
                    direction103=direction();
                    _fsp--;

                    adaptor.addChild(root_0, direction103.getTree());
                    dbg.location(150,13);
                    pushFollow(FOLLOW_verdict_in_policy838);
                    verdict104=verdict();
                    _fsp--;

                    adaptor.addChild(root_0, verdict104.getTree());
                    dbg.location(150,21);
                    pushFollow(FOLLOW_proto_in_policy840);
                    proto105=proto();
                    _fsp--;

                    adaptor.addChild(root_0, proto105.getTree());
                    dbg.location(150,27);
                    pushFollow(FOLLOW_icmp_cntrl_message_in_policy842);
                    icmp_cntrl_message106=icmp_cntrl_message();
                    _fsp--;

                    adaptor.addChild(root_0, icmp_cntrl_message106.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(150, 45);

        }
        finally {
            dbg.exitRule("policy");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end policy

    public static class topology_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start topology
    // /home/sambuddho/plt_project/Block.g:151:1: topology : ( ( host_group )+ role | ( serv_group )+ role );
    public final topology_return topology() throws RecognitionException {
        topology_return retval = new topology_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        host_group_return host_group107 = null;

        role_return role108 = null;

        serv_group_return serv_group109 = null;

        role_return role110 = null;



        try { dbg.enterRule("topology");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(151, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:151:9: ( ( host_group )+ role | ( serv_group )+ role )
            int alt27=2;
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==75) ) {
                alt27=1;
            }
            else if ( (LA27_0==OBJECT_NAME||LA27_0==80) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("151:1: topology : ( ( host_group )+ role | ( serv_group )+ role );", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:151:11: ( host_group )+ role
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(151,11);
                    // /home/sambuddho/plt_project/Block.g:151:11: ( host_group )+
                    int cnt25=0;
                    try { dbg.enterSubRule(25);

                    loop25:
                    do {
                        int alt25=2;
                        try { dbg.enterDecision(25);

                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==75) ) {
                            alt25=1;
                        }


                        } finally {dbg.exitDecision(25);}

                        switch (alt25) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sambuddho/plt_project/Block.g:151:12: host_group
                    	    {
                    	    dbg.location(151,12);
                    	    pushFollow(FOLLOW_host_group_in_topology849);
                    	    host_group107=host_group();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, host_group107.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt25++;
                    } while (true);
                    } finally {dbg.exitSubRule(25);}

                    dbg.location(151,25);
                    pushFollow(FOLLOW_role_in_topology853);
                    role108=role();
                    _fsp--;

                    adaptor.addChild(root_0, role108.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:152:3: ( serv_group )+ role
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(152,3);
                    // /home/sambuddho/plt_project/Block.g:152:3: ( serv_group )+
                    int cnt26=0;
                    try { dbg.enterSubRule(26);

                    loop26:
                    do {
                        int alt26=2;
                        try { dbg.enterDecision(26);

                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==OBJECT_NAME||LA26_0==80) ) {
                            alt26=1;
                        }


                        } finally {dbg.exitDecision(26);}

                        switch (alt26) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sambuddho/plt_project/Block.g:152:4: serv_group
                    	    {
                    	    dbg.location(152,4);
                    	    pushFollow(FOLLOW_serv_group_in_topology858);
                    	    serv_group109=serv_group();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, serv_group109.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt26++;
                    } while (true);
                    } finally {dbg.exitSubRule(26);}

                    dbg.location(152,17);
                    pushFollow(FOLLOW_role_in_topology862);
                    role110=role();
                    _fsp--;

                    adaptor.addChild(root_0, role110.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
            dbg.exitRule("topology");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end topology

    public static class int_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start int_value
    // /home/sambuddho/plt_project/Block.g:156:1: int_value : ( NUMBER | object_name );
    public final int_value_return int_value() throws RecognitionException {
        int_value_return retval = new int_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER111=null;
        object_name_return object_name112 = null;


        Object NUMBER111_tree=null;

        try { dbg.enterRule("int_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(156, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:157:2: ( NUMBER | object_name )
            int alt28=2;
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==NUMBER) ) {
                alt28=1;
            }
            else if ( (LA28_0==OBJECT_NAME) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("156:1: int_value : ( NUMBER | object_name );", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:157:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(157,4);
                    NUMBER111=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_int_value877); 
                    NUMBER111_tree = (Object)adaptor.create(NUMBER111);
                    adaptor.addChild(root_0, NUMBER111_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:157:13: object_name
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(157,13);
                    pushFollow(FOLLOW_object_name_in_int_value881);
                    object_name112=object_name();
                    _fsp--;

                    adaptor.addChild(root_0, object_name112.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(157, 24);

        }
        finally {
            dbg.exitRule("int_value");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end int_value

    public static class char_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start char_value
    // /home/sambuddho/plt_project/Block.g:158:1: char_value : CHAR ;
    public final char_value_return char_value() throws RecognitionException {
        char_value_return retval = new char_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHAR113=null;

        Object CHAR113_tree=null;

        try { dbg.enterRule("char_value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(158, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:159:2: ( CHAR )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:159:4: CHAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(159,4);
            CHAR113=(Token)input.LT(1);
            match(input,CHAR,FOLLOW_CHAR_in_char_value889); 
            CHAR113_tree = (Object)adaptor.create(CHAR113);
            adaptor.addChild(root_0, CHAR113_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(159, 9);

        }
        finally {
            dbg.exitRule("char_value");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end char_value

    public static class direction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start direction
    // /home/sambuddho/plt_project/Block.g:162:1: direction : ( 'inbound' | 'outbound' );
    public final direction_return direction() throws RecognitionException {
        direction_return retval = new direction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set114=null;

        Object set114_tree=null;

        try { dbg.enterRule("direction");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(162, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:162:12: ( 'inbound' | 'outbound' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(162,12);
            set114=(Token)input.LT(1);
            if ( (input.LA(1)>=66 && input.LA(1)<=67) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set114));
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

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(162, 36);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start verdict
    // /home/sambuddho/plt_project/Block.g:163:1: verdict : ( 'allow' | 'deny' );
    public final verdict_return verdict() throws RecognitionException {
        verdict_return retval = new verdict_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set115=null;

        Object set115_tree=null;

        try { dbg.enterRule("verdict");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(163, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:163:9: ( 'allow' | 'deny' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(163,9);
            set115=(Token)input.LT(1);
            if ( (input.LA(1)>=68 && input.LA(1)<=69) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set115));
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

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(163, 27);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start proto
    // /home/sambuddho/plt_project/Block.g:164:1: proto : ( 'udp' | 'tcp' );
    public final proto_return proto() throws RecognitionException {
        proto_return retval = new proto_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set116=null;

        Object set116_tree=null;

        try { dbg.enterRule("proto");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(164, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:164:9: ( 'udp' | 'tcp' )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(164,9);
            set116=(Token)input.LT(1);
            if ( (input.LA(1)>=70 && input.LA(1)<=71) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set116));
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

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(164, 24);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start icmp_cntrl_message
    // /home/sambuddho/plt_project/Block.g:165:1: icmp_cntrl_message : ICMP_MESSAGE_TYPE ;
    public final icmp_cntrl_message_return icmp_cntrl_message() throws RecognitionException {
        icmp_cntrl_message_return retval = new icmp_cntrl_message_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ICMP_MESSAGE_TYPE117=null;

        Object ICMP_MESSAGE_TYPE117_tree=null;

        try { dbg.enterRule("icmp_cntrl_message");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(165, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:165:21: ( ICMP_MESSAGE_TYPE )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:165:23: ICMP_MESSAGE_TYPE
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(165,23);
            ICMP_MESSAGE_TYPE117=(Token)input.LT(1);
            match(input,ICMP_MESSAGE_TYPE,FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message937); 
            ICMP_MESSAGE_TYPE117_tree = (Object)adaptor.create(ICMP_MESSAGE_TYPE117);
            adaptor.addChild(root_0, ICMP_MESSAGE_TYPE117_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(165, 40);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start port
    // /home/sambuddho/plt_project/Block.g:166:1: port : NUMBER ;
    public final port_return port() throws RecognitionException {
        port_return retval = new port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER118=null;

        Object NUMBER118_tree=null;

        try { dbg.enterRule("port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(166, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:166:6: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:166:8: NUMBER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(166,8);
            NUMBER118=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_port944); 
            NUMBER118_tree = (Object)adaptor.create(NUMBER118);
            adaptor.addChild(root_0, NUMBER118_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(166, 14);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start object_name
    // /home/sambuddho/plt_project/Block.g:170:1: object_name : OBJECT_NAME ;
    public final object_name_return object_name() throws RecognitionException {
        object_name_return retval = new object_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OBJECT_NAME119=null;

        Object OBJECT_NAME119_tree=null;

        try { dbg.enterRule("object_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(170, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:171:2: ( OBJECT_NAME )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:171:4: OBJECT_NAME
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,4);
            OBJECT_NAME119=(Token)input.LT(1);
            match(input,OBJECT_NAME,FOLLOW_OBJECT_NAME_in_object_name989); 
            OBJECT_NAME119_tree = (Object)adaptor.create(OBJECT_NAME119);
            adaptor.addChild(root_0, OBJECT_NAME119_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(171, 15);

        }
        finally {
            dbg.exitRule("object_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end object_name

    public static class interface_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start interface_name
    // /home/sambuddho/plt_project/Block.g:184:1: interface_name : 'ifname' ( OBJECT_NAME ) 'card_id' NUMBER ( '/' NUMBER )? ;
    public final interface_name_return interface_name() throws RecognitionException {
        interface_name_return retval = new interface_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal120=null;
        Token OBJECT_NAME121=null;
        Token string_literal122=null;
        Token NUMBER123=null;
        Token char_literal124=null;
        Token NUMBER125=null;

        Object string_literal120_tree=null;
        Object OBJECT_NAME121_tree=null;
        Object string_literal122_tree=null;
        Object NUMBER123_tree=null;
        Object char_literal124_tree=null;
        Object NUMBER125_tree=null;

        try { dbg.enterRule("interface_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(184, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:184:16: ( 'ifname' ( OBJECT_NAME ) 'card_id' NUMBER ( '/' NUMBER )? )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:184:20: 'ifname' ( OBJECT_NAME ) 'card_id' NUMBER ( '/' NUMBER )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(184,20);
            string_literal120=(Token)input.LT(1);
            match(input,72,FOLLOW_72_in_interface_name1083); 
            string_literal120_tree = (Object)adaptor.create(string_literal120);
            adaptor.addChild(root_0, string_literal120_tree);

            dbg.location(184,29);
            // /home/sambuddho/plt_project/Block.g:184:29: ( OBJECT_NAME )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:184:30: OBJECT_NAME
            {
            dbg.location(184,30);
            OBJECT_NAME121=(Token)input.LT(1);
            match(input,OBJECT_NAME,FOLLOW_OBJECT_NAME_in_interface_name1086); 
            OBJECT_NAME121_tree = (Object)adaptor.create(OBJECT_NAME121);
            adaptor.addChild(root_0, OBJECT_NAME121_tree);


            }

            dbg.location(184,43);
            string_literal122=(Token)input.LT(1);
            match(input,73,FOLLOW_73_in_interface_name1089); 
            string_literal122_tree = (Object)adaptor.create(string_literal122);
            adaptor.addChild(root_0, string_literal122_tree);

            dbg.location(184,54);
            NUMBER123=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_interface_name1092); 
            NUMBER123_tree = (Object)adaptor.create(NUMBER123);
            adaptor.addChild(root_0, NUMBER123_tree);

            dbg.location(184,61);
            // /home/sambuddho/plt_project/Block.g:184:61: ( '/' NUMBER )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==DIV) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:184:62: '/' NUMBER
                    {
                    dbg.location(184,62);
                    char_literal124=(Token)input.LT(1);
                    match(input,DIV,FOLLOW_DIV_in_interface_name1095); 
                    char_literal124_tree = (Object)adaptor.create(char_literal124);
                    adaptor.addChild(root_0, char_literal124_tree);

                    dbg.location(184,66);
                    NUMBER125=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_interface_name1097); 
                    NUMBER125_tree = (Object)adaptor.create(NUMBER125);
                    adaptor.addChild(root_0, NUMBER125_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(184, 74);

        }
        finally {
            dbg.exitRule("interface_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end interface_name

    public static class ip_addr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ip_addr
    // /home/sambuddho/plt_project/Block.g:186:1: ip_addr : ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) ;
    public final ip_addr_return ip_addr() throws RecognitionException {
        ip_addr_return retval = new ip_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER126=null;
        Token DOT127=null;
        Token NUMBER128=null;
        Token DOT129=null;
        Token NUMBER130=null;
        Token DOT131=null;
        Token NUMBER132=null;

        Object NUMBER126_tree=null;
        Object DOT127_tree=null;
        Object NUMBER128_tree=null;
        Object DOT129_tree=null;
        Object NUMBER130_tree=null;
        Object DOT131_tree=null;
        Object NUMBER132_tree=null;

        try { dbg.enterRule("ip_addr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(186, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:186:9: ( ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:186:10: ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER ) DOT ( NUMBER )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,10);
            // /home/sambuddho/plt_project/Block.g:186:10: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:186:11: NUMBER
            {
            dbg.location(186,11);
            NUMBER126=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1107); 
            NUMBER126_tree = (Object)adaptor.create(NUMBER126);
            adaptor.addChild(root_0, NUMBER126_tree);


            }

            dbg.location(186,18);
            DOT127=(Token)input.LT(1);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1109); 
            DOT127_tree = (Object)adaptor.create(DOT127);
            adaptor.addChild(root_0, DOT127_tree);

            dbg.location(186,21);
            // /home/sambuddho/plt_project/Block.g:186:21: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:186:22: NUMBER
            {
            dbg.location(186,22);
            NUMBER128=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1111); 
            NUMBER128_tree = (Object)adaptor.create(NUMBER128);
            adaptor.addChild(root_0, NUMBER128_tree);


            }

            dbg.location(186,29);
            DOT129=(Token)input.LT(1);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1113); 
            DOT129_tree = (Object)adaptor.create(DOT129);
            adaptor.addChild(root_0, DOT129_tree);

            dbg.location(186,32);
            // /home/sambuddho/plt_project/Block.g:186:32: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:186:33: NUMBER
            {
            dbg.location(186,33);
            NUMBER130=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1115); 
            NUMBER130_tree = (Object)adaptor.create(NUMBER130);
            adaptor.addChild(root_0, NUMBER130_tree);


            }

            dbg.location(186,40);
            DOT131=(Token)input.LT(1);
            match(input,DOT,FOLLOW_DOT_in_ip_addr1117); 
            DOT131_tree = (Object)adaptor.create(DOT131);
            adaptor.addChild(root_0, DOT131_tree);

            dbg.location(186,43);
            // /home/sambuddho/plt_project/Block.g:186:43: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:186:44: NUMBER
            {
            dbg.location(186,44);
            NUMBER132=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_ip_addr1119); 
            NUMBER132_tree = (Object)adaptor.create(NUMBER132);
            adaptor.addChild(root_0, NUMBER132_tree);


            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(186, 52);

        }
        finally {
            dbg.exitRule("ip_addr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end ip_addr

    public static class nmask_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nmask
    // /home/sambuddho/plt_project/Block.g:188:1: nmask : 'netmask' ip_addr ;
    public final nmask_return nmask() throws RecognitionException {
        nmask_return retval = new nmask_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal133=null;
        ip_addr_return ip_addr134 = null;


        Object string_literal133_tree=null;

        try { dbg.enterRule("nmask");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(188, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:188:7: ( 'netmask' ip_addr )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:188:9: 'netmask' ip_addr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(188,9);
            string_literal133=(Token)input.LT(1);
            match(input,74,FOLLOW_74_in_nmask1129); 
            string_literal133_tree = (Object)adaptor.create(string_literal133);
            adaptor.addChild(root_0, string_literal133_tree);

            dbg.location(188,19);
            pushFollow(FOLLOW_ip_addr_in_nmask1131);
            ip_addr134=ip_addr();
            _fsp--;

            adaptor.addChild(root_0, ip_addr134.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(188, 26);

        }
        finally {
            dbg.exitRule("nmask");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end nmask

    public static class host_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start host
    // /home/sambuddho/plt_project/Block.g:189:1: host : ( interface_name ip_addr 'netmask' ip_addr | object_name );
    public final host_return host() throws RecognitionException {
        host_return retval = new host_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal137=null;
        interface_name_return interface_name135 = null;

        ip_addr_return ip_addr136 = null;

        ip_addr_return ip_addr138 = null;

        object_name_return object_name139 = null;


        Object string_literal137_tree=null;

        try { dbg.enterRule("host");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(189, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:189:6: ( interface_name ip_addr 'netmask' ip_addr | object_name )
            int alt30=2;
            try { dbg.enterDecision(30);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==72) ) {
                alt30=1;
            }
            else if ( (LA30_0==OBJECT_NAME) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("189:1: host : ( interface_name ip_addr 'netmask' ip_addr | object_name );", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:189:8: interface_name ip_addr 'netmask' ip_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(189,8);
                    pushFollow(FOLLOW_interface_name_in_host1138);
                    interface_name135=interface_name();
                    _fsp--;

                    adaptor.addChild(root_0, interface_name135.getTree());
                    dbg.location(189,23);
                    pushFollow(FOLLOW_ip_addr_in_host1140);
                    ip_addr136=ip_addr();
                    _fsp--;

                    adaptor.addChild(root_0, ip_addr136.getTree());
                    dbg.location(189,31);
                    string_literal137=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_host1142); 
                    string_literal137_tree = (Object)adaptor.create(string_literal137);
                    adaptor.addChild(root_0, string_literal137_tree);

                    dbg.location(189,41);
                    pushFollow(FOLLOW_ip_addr_in_host1144);
                    ip_addr138=ip_addr();
                    _fsp--;

                    adaptor.addChild(root_0, ip_addr138.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:189:51: object_name
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(189,51);
                    pushFollow(FOLLOW_object_name_in_host1148);
                    object_name139=object_name();
                    _fsp--;

                    adaptor.addChild(root_0, object_name139.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(189, 62);

        }
        finally {
            dbg.exitRule("host");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end host

    public static class host_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start host_set
    // /home/sambuddho/plt_project/Block.g:190:1: host_set : host ( ',' host )* ;
    public final host_set_return host_set() throws RecognitionException {
        host_set_return retval = new host_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal141=null;
        host_return host140 = null;

        host_return host142 = null;


        Object char_literal141_tree=null;

        try { dbg.enterRule("host_set");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(190, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:190:10: ( host ( ',' host )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:190:11: host ( ',' host )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(190,11);
            pushFollow(FOLLOW_host_in_host_set1154);
            host140=host();
            _fsp--;

            adaptor.addChild(root_0, host140.getTree());
            dbg.location(190,16);
            // /home/sambuddho/plt_project/Block.g:190:16: ( ',' host )*
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

            	    // /home/sambuddho/plt_project/Block.g:190:17: ',' host
            	    {
            	    dbg.location(190,17);
            	    char_literal141=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_host_set1157); 
            	    char_literal141_tree = (Object)adaptor.create(char_literal141);
            	    adaptor.addChild(root_0, char_literal141_tree);

            	    dbg.location(190,21);
            	    pushFollow(FOLLOW_host_in_host_set1159);
            	    host142=host();
            	    _fsp--;

            	    adaptor.addChild(root_0, host142.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);
            } finally {dbg.exitSubRule(31);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(191, 2);

        }
        finally {
            dbg.exitRule("host_set");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end host_set

    public static class dns_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dns_set
    // /home/sambuddho/plt_project/Block.g:193:1: dns_set : ip_addr ( ',' ip_addr )* ;
    public final dns_set_return dns_set() throws RecognitionException {
        dns_set_return retval = new dns_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal144=null;
        ip_addr_return ip_addr143 = null;

        ip_addr_return ip_addr145 = null;


        Object char_literal144_tree=null;

        try { dbg.enterRule("dns_set");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(193, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:193:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:193:11: ip_addr ( ',' ip_addr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(193,11);
            pushFollow(FOLLOW_ip_addr_in_dns_set1171);
            ip_addr143=ip_addr();
            _fsp--;

            adaptor.addChild(root_0, ip_addr143.getTree());
            dbg.location(193,19);
            // /home/sambuddho/plt_project/Block.g:193:19: ( ',' ip_addr )*
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

            	    // /home/sambuddho/plt_project/Block.g:193:20: ',' ip_addr
            	    {
            	    dbg.location(193,20);
            	    char_literal144=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_dns_set1174); 
            	    char_literal144_tree = (Object)adaptor.create(char_literal144);
            	    adaptor.addChild(root_0, char_literal144_tree);

            	    dbg.location(193,25);
            	    pushFollow(FOLLOW_ip_addr_in_dns_set1177);
            	    ip_addr145=ip_addr();
            	    _fsp--;

            	    adaptor.addChild(root_0, ip_addr145.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(193, 34);

        }
        finally {
            dbg.exitRule("dns_set");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end dns_set

    public static class gateway_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start gateway
    // /home/sambuddho/plt_project/Block.g:194:1: gateway : ip_addr ( ',' ip_addr )* ;
    public final gateway_return gateway() throws RecognitionException {
        gateway_return retval = new gateway_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal147=null;
        ip_addr_return ip_addr146 = null;

        ip_addr_return ip_addr148 = null;


        Object char_literal147_tree=null;

        try { dbg.enterRule("gateway");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(194, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:194:9: ( ip_addr ( ',' ip_addr )* )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:194:11: ip_addr ( ',' ip_addr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(194,11);
            pushFollow(FOLLOW_ip_addr_in_gateway1186);
            ip_addr146=ip_addr();
            _fsp--;

            adaptor.addChild(root_0, ip_addr146.getTree());
            dbg.location(194,19);
            // /home/sambuddho/plt_project/Block.g:194:19: ( ',' ip_addr )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=2;
                try { dbg.enterDecision(33);

                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sambuddho/plt_project/Block.g:194:20: ',' ip_addr
            	    {
            	    dbg.location(194,20);
            	    char_literal147=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_gateway1189); 
            	    char_literal147_tree = (Object)adaptor.create(char_literal147);
            	    adaptor.addChild(root_0, char_literal147_tree);

            	    dbg.location(194,24);
            	    pushFollow(FOLLOW_ip_addr_in_gateway1191);
            	    ip_addr148=ip_addr();
            	    _fsp--;

            	    adaptor.addChild(root_0, ip_addr148.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(194, 33);

        }
        finally {
            dbg.exitRule("gateway");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end gateway

    public static class host_group_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start host_group
    // /home/sambuddho/plt_project/Block.g:195:1: host_group : 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )? ;
    public final host_group_return host_group() throws RecognitionException {
        host_group_return retval = new host_group_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal149=null;
        Token char_literal150=null;
        Token char_literal152=null;
        Token string_literal153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        Token string_literal157=null;
        Token char_literal158=null;
        Token char_literal160=null;
        host_set_return host_set151 = null;

        dns_set_return dns_set155 = null;

        gateway_return gateway159 = null;


        Object string_literal149_tree=null;
        Object char_literal150_tree=null;
        Object char_literal152_tree=null;
        Object string_literal153_tree=null;
        Object char_literal154_tree=null;
        Object char_literal156_tree=null;
        Object string_literal157_tree=null;
        Object char_literal158_tree=null;
        Object char_literal160_tree=null;

        try { dbg.enterRule("host_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(195, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:195:12: ( 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )? )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:195:14: 'host_group' '{' host_set '}' ( 'DNS' '{' dns_set '}' )? ( 'GATEWAY' '{' gateway '}' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(195,14);
            string_literal149=(Token)input.LT(1);
            match(input,75,FOLLOW_75_in_host_group1200); 
            string_literal149_tree = (Object)adaptor.create(string_literal149);
            adaptor.addChild(root_0, string_literal149_tree);

            dbg.location(195,28);
            char_literal150=(Token)input.LT(1);
            match(input,76,FOLLOW_76_in_host_group1203); 
            char_literal150_tree = (Object)adaptor.create(char_literal150);
            adaptor.addChild(root_0, char_literal150_tree);

            dbg.location(195,32);
            pushFollow(FOLLOW_host_set_in_host_group1205);
            host_set151=host_set();
            _fsp--;

            adaptor.addChild(root_0, host_set151.getTree());
            dbg.location(195,41);
            char_literal152=(Token)input.LT(1);
            match(input,77,FOLLOW_77_in_host_group1207); 
            char_literal152_tree = (Object)adaptor.create(char_literal152);
            adaptor.addChild(root_0, char_literal152_tree);

            dbg.location(195,46);
            // /home/sambuddho/plt_project/Block.g:195:46: ( 'DNS' '{' dns_set '}' )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==78) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:195:48: 'DNS' '{' dns_set '}'
                    {
                    dbg.location(195,48);
                    string_literal153=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_host_group1212); 
                    string_literal153_tree = (Object)adaptor.create(string_literal153);
                    adaptor.addChild(root_0, string_literal153_tree);

                    dbg.location(195,55);
                    char_literal154=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_host_group1215); 
                    char_literal154_tree = (Object)adaptor.create(char_literal154);
                    adaptor.addChild(root_0, char_literal154_tree);

                    dbg.location(195,59);
                    pushFollow(FOLLOW_dns_set_in_host_group1217);
                    dns_set155=dns_set();
                    _fsp--;

                    adaptor.addChild(root_0, dns_set155.getTree());
                    dbg.location(195,67);
                    char_literal156=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_host_group1219); 
                    char_literal156_tree = (Object)adaptor.create(char_literal156);
                    adaptor.addChild(root_0, char_literal156_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}

            dbg.location(195,75);
            // /home/sambuddho/plt_project/Block.g:195:75: ( 'GATEWAY' '{' gateway '}' )?
            int alt35=2;
            try { dbg.enterSubRule(35);
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==79) ) {
                alt35=1;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:195:77: 'GATEWAY' '{' gateway '}'
                    {
                    dbg.location(195,77);
                    string_literal157=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_host_group1227); 
                    string_literal157_tree = (Object)adaptor.create(string_literal157);
                    adaptor.addChild(root_0, string_literal157_tree);

                    dbg.location(195,87);
                    char_literal158=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_host_group1229); 
                    char_literal158_tree = (Object)adaptor.create(char_literal158);
                    adaptor.addChild(root_0, char_literal158_tree);

                    dbg.location(195,91);
                    pushFollow(FOLLOW_gateway_in_host_group1231);
                    gateway159=gateway();
                    _fsp--;

                    adaptor.addChild(root_0, gateway159.getTree());
                    dbg.location(195,99);
                    char_literal160=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_host_group1233); 
                    char_literal160_tree = (Object)adaptor.create(char_literal160);
                    adaptor.addChild(root_0, char_literal160_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(196, 7);

        }
        finally {
            dbg.exitRule("host_group");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end host_group

    public static class serv_descr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start serv_descr
    // /home/sambuddho/plt_project/Block.g:198:1: serv_descr : ip_addr ( nmask )? serv_listen_port ;
    public final serv_descr_return serv_descr() throws RecognitionException {
        serv_descr_return retval = new serv_descr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ip_addr_return ip_addr161 = null;

        nmask_return nmask162 = null;

        serv_listen_port_return serv_listen_port163 = null;



        try { dbg.enterRule("serv_descr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(198, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:198:12: ( ip_addr ( nmask )? serv_listen_port )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:198:14: ip_addr ( nmask )? serv_listen_port
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(198,14);
            pushFollow(FOLLOW_ip_addr_in_serv_descr1255);
            ip_addr161=ip_addr();
            _fsp--;

            adaptor.addChild(root_0, ip_addr161.getTree());
            dbg.location(198,22);
            // /home/sambuddho/plt_project/Block.g:198:22: ( nmask )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==74) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:198:23: nmask
                    {
                    dbg.location(198,23);
                    pushFollow(FOLLOW_nmask_in_serv_descr1258);
                    nmask162=nmask();
                    _fsp--;

                    adaptor.addChild(root_0, nmask162.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}

            dbg.location(198,31);
            pushFollow(FOLLOW_serv_listen_port_in_serv_descr1262);
            serv_listen_port163=serv_listen_port();
            _fsp--;

            adaptor.addChild(root_0, serv_listen_port163.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(198, 47);

        }
        finally {
            dbg.exitRule("serv_descr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end serv_descr

    public static class serv_group_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start serv_group
    // /home/sambuddho/plt_project/Block.g:199:1: serv_group : ( 'service_set' '{' serv_descr ( ',' serv_descr )* '}' | object_name );
    public final serv_group_return serv_group() throws RecognitionException {
        serv_group_return retval = new serv_group_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal164=null;
        Token char_literal165=null;
        Token char_literal167=null;
        Token char_literal169=null;
        serv_descr_return serv_descr166 = null;

        serv_descr_return serv_descr168 = null;

        object_name_return object_name170 = null;


        Object string_literal164_tree=null;
        Object char_literal165_tree=null;
        Object char_literal167_tree=null;
        Object char_literal169_tree=null;

        try { dbg.enterRule("serv_group");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(199, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:200:2: ( 'service_set' '{' serv_descr ( ',' serv_descr )* '}' | object_name )
            int alt38=2;
            try { dbg.enterDecision(38);

            int LA38_0 = input.LA(1);

            if ( (LA38_0==80) ) {
                alt38=1;
            }
            else if ( (LA38_0==OBJECT_NAME) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("199:1: serv_group : ( 'service_set' '{' serv_descr ( ',' serv_descr )* '}' | object_name );", 38, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sambuddho/plt_project/Block.g:200:4: 'service_set' '{' serv_descr ( ',' serv_descr )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(200,4);
                    string_literal164=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_serv_group1270); 
                    string_literal164_tree = (Object)adaptor.create(string_literal164);
                    adaptor.addChild(root_0, string_literal164_tree);

                    dbg.location(200,18);
                    char_literal165=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_serv_group1272); 
                    char_literal165_tree = (Object)adaptor.create(char_literal165);
                    adaptor.addChild(root_0, char_literal165_tree);

                    dbg.location(200,22);
                    pushFollow(FOLLOW_serv_descr_in_serv_group1274);
                    serv_descr166=serv_descr();
                    _fsp--;

                    adaptor.addChild(root_0, serv_descr166.getTree());
                    dbg.location(200,33);
                    // /home/sambuddho/plt_project/Block.g:200:33: ( ',' serv_descr )*
                    try { dbg.enterSubRule(37);

                    loop37:
                    do {
                        int alt37=2;
                        try { dbg.enterDecision(37);

                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==COMMA) ) {
                            alt37=1;
                        }


                        } finally {dbg.exitDecision(37);}

                        switch (alt37) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sambuddho/plt_project/Block.g:200:34: ',' serv_descr
                    	    {
                    	    dbg.location(200,34);
                    	    char_literal167=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_serv_group1277); 
                    	    char_literal167_tree = (Object)adaptor.create(char_literal167);
                    	    adaptor.addChild(root_0, char_literal167_tree);

                    	    dbg.location(200,38);
                    	    pushFollow(FOLLOW_serv_descr_in_serv_group1279);
                    	    serv_descr168=serv_descr();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, serv_descr168.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(200,51);
                    char_literal169=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_serv_group1283); 
                    char_literal169_tree = (Object)adaptor.create(char_literal169);
                    adaptor.addChild(root_0, char_literal169_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sambuddho/plt_project/Block.g:200:58: object_name
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(200,58);
                    pushFollow(FOLLOW_object_name_in_serv_group1288);
                    object_name170=object_name();
                    _fsp--;

                    adaptor.addChild(root_0, object_name170.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(201, 2);

        }
        finally {
            dbg.exitRule("serv_group");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end serv_group

    public static class serv_listen_port_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start serv_listen_port
    // /home/sambuddho/plt_project/Block.g:202:1: serv_listen_port : ( NUMBER ) ;
    public final serv_listen_port_return serv_listen_port() throws RecognitionException {
        serv_listen_port_return retval = new serv_listen_port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER171=null;

        Object NUMBER171_tree=null;

        try { dbg.enterRule("serv_listen_port");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(202, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:203:2: ( ( NUMBER ) )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:203:4: ( NUMBER )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(203,4);
            // /home/sambuddho/plt_project/Block.g:203:4: ( NUMBER )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:203:5: NUMBER
            {
            dbg.location(203,5);
            NUMBER171=(Token)input.LT(1);
            match(input,NUMBER,FOLLOW_NUMBER_in_serv_listen_port1301); 
            NUMBER171_tree = (Object)adaptor.create(NUMBER171);
            adaptor.addChild(root_0, NUMBER171_tree);


            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(203, 12);

        }
        finally {
            dbg.exitRule("serv_listen_port");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end serv_listen_port

    public static class host_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start host_name
    // /home/sambuddho/plt_project/Block.g:205:1: host_name : ID ;
    public final host_name_return host_name() throws RecognitionException {
        host_name_return retval = new host_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID172=null;

        Object ID172_tree=null;

        try { dbg.enterRule("host_name");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(205, 1);

        try {
            // /home/sambuddho/plt_project/Block.g:206:2: ( ID )
            dbg.enterAlt(1);

            // /home/sambuddho/plt_project/Block.g:206:4: ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(206,4);
            ID172=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_host_name1311); 
            ID172_tree = (Object)adaptor.create(ID172);
            adaptor.addChild(root_0, ID172_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(206, 6);

        }
        finally {
            dbg.exitRule("host_name");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end host_name


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\u008a\uffff";
    static final String DFA22_eofS =
        "\u008a\uffff";
    static final String DFA22_minS =
        "\1\10\1\uffff\2\4\1\uffff\1\104\1\uffff\2\114\1\10\2\uffff\1\106"+
        "\1\23\1\10\1\uffff\1\10\1\23\1\16\1\26\1\uffff\1\10\1\111\1\23\1"+
        "\4\1\10\1\uffff\1\10\1\23\1\16\2\114\1\uffff\1\26\1\7\1\111\4\10"+
        "\1\26\1\10\3\26\2\10\1\7\3\10\1\26\1\10\3\26\7\10\1\16\5\26\1\10"+
        "\1\4\5\10\1\26\1\uffff\1\112\1\26\2\16\1\26\4\10\1\4\1\10\1\4\1"+
        "\10\2\26\1\112\3\26\6\10\5\26\7\10\4\26\1\10\1\16\4\10\1\26\1\16"+
        "\1\26\2\16\2\10\1\26\1\16\1\10\1\26\2\10";
    static final String DFA22_maxS =
        "\1\120\1\uffff\1\63\1\120\1\uffff\1\105\1\uffff\2\114\1\15\2\uffff"+
        "\1\107\1\110\1\10\1\uffff\1\20\1\23\1\115\1\26\1\uffff\1\10\1\111"+
        "\1\110\1\117\1\10\1\uffff\1\10\1\23\1\115\2\114\1\uffff\1\26\1\10"+
        "\1\111\4\10\1\26\1\10\3\26\6\10\1\26\1\10\3\26\1\112\6\10\1\115"+
        "\5\26\1\10\1\120\5\10\1\26\1\uffff\1\112\1\26\2\115\1\26\4\10\1"+
        "\117\1\10\1\113\1\10\2\26\1\112\3\26\6\10\5\26\6\10\1\112\4\26\1"+
        "\10\1\115\4\10\1\26\1\115\1\26\2\115\2\10\1\26\1\115\1\10\1\26\2"+
        "\10";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\uffff\1\6\3\uffff\1\2\1\11\3\uffff\1"+
        "\4\4\uffff\1\5\5\uffff\1\5\5\uffff\1\10\54\uffff\1\12\74\uffff";
    static final String DFA22_specialS =
        "\u008a\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\3\uffff\1\4\2\uffff\1\1\3\uffff\1\3\56\uffff\2\5\4\uffff"+
            "\1\6\2\uffff\1\7\4\uffff\1\10",
            "",
            "\4\12\6\uffff\1\12\7\uffff\1\11\4\uffff\1\12\6\uffff\1\12\5"+
            "\uffff\14\12",
            "\4\12\6\uffff\1\12\4\uffff\1\13\2\uffff\1\12\4\uffff\1\12\6"+
            "\uffff\1\12\5\uffff\14\12\16\uffff\2\13\14\uffff\1\13",
            "",
            "\2\14",
            "",
            "\1\15",
            "\1\16",
            "\1\17\4\uffff\1\12",
            "",
            "",
            "\2\20",
            "\1\22\64\uffff\1\21",
            "\1\23",
            "",
            "\1\25\7\uffff\1\24",
            "\1\26",
            "\1\27\76\uffff\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\33",
            "\1\35\64\uffff\1\34",
            "\4\40\6\uffff\1\40\7\uffff\1\40\4\uffff\1\40\6\uffff\1\40\5"+
            "\uffff\14\40\16\uffff\2\13\7\uffff\1\13\2\uffff\1\36\1\37",
            "\1\41",
            "",
            "\1\42",
            "\1\43",
            "\1\27\76\uffff\1\30",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "\1\47\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\50",
            "\1\63",
            "\1\64\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77\101\uffff\1\76",
            "\1\100",
            "\1\65",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\76\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\4\115\6\uffff\1\115\4\uffff\1\13\2\uffff\1\115\4\uffff\1\115"+
            "\6\uffff\1\115\5\uffff\14\115\16\uffff\2\13\14\uffff\1\13",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126\76\uffff\1\127",
            "\1\130\76\uffff\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\4\40\6\uffff\1\40\7\uffff\1\40\4\uffff\1\40\6\uffff\1\40\5"+
            "\uffff\14\40\16\uffff\2\13\7\uffff\1\13\3\uffff\1\37",
            "\1\137",
            "\4\40\6\uffff\1\40\7\uffff\1\40\4\uffff\1\40\6\uffff\1\40\5"+
            "\uffff\14\40\16\uffff\2\13\7\uffff\1\13",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\77",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\170\101\uffff\1\167",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\105\76\uffff\1\106",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\27\76\uffff\1\30",
            "\1\u0083",
            "\1\126\76\uffff\1\127",
            "\1\130\76\uffff\1\131",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\27\76\uffff\1\30",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\170"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "144:2: object_values : ( char_value | int_value | STRING | ip_addr | policy | host | role | host_group | topology | serv_group | object_name );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_30_in_prog103 = new BitSet(new long[]{0xFE1000A10808D100L,0x000000000001090FL});
    public static final BitSet FOLLOW_statement_list_in_prog105 = new BitSet(new long[]{0xFE1000A18808D100L,0x000000000001090FL});
    public static final BitSet FOLLOW_31_in_prog108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declr_stmt_in_statement_list139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_statement_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_expr_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_statement_in_statement172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER_in_statement_expr188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement_expr194 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DELIMITER_in_statement_expr196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_condition_statement212 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_condition_statement214 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_equality_expr_in_condition_statement216 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_condition_statement218 = new BitSet(new long[]{0xFE1000A10808D100L,0x000000000001090FL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement220 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_condition_statement223 = new BitSet(new long[]{0xFE1000A10808D100L,0x000000000001090FL});
    public static final BitSet FOLLOW_statement_list_in_condition_statement225 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_condition_statement229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_iteration_statement245 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_iteration_statement247 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_equality_expr_in_iteration_statement249 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_iteration_statement251 = new BitSet(new long[]{0xFE1000A10808D100L,0x000000000001090FL});
    public static final BitSet FOLLOW_statement_list_in_iteration_statement253 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_iteration_statement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_print_statement271 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_print_statement273 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DELIMITER_in_print_statement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expression291 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_expression294 = new BitSet(new long[]{0x001000000008D102L,0x000000000001090CL});
    public static final BitSet FOLLOW_assignment_expr_in_expression296 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_object_name_in_assignment_expr322 = new BitSet(new long[]{0x01E0000000040000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr324 = new BitSet(new long[]{0x001000000008D100L,0x000000000001090CL});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr326 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_assignment_expr329 = new BitSet(new long[]{0x001000000008D100L,0x000000000001090CL});
    public static final BitSet FOLLOW_assignment_expr_in_assignment_expr331 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOR_expr_in_conditional_expr362 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_conditional_expr365 = new BitSet(new long[]{0x001002000008D100L,0x000000000001090CL});
    public static final BitSet FOLLOW_expression_in_conditional_expr367 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_conditional_expr369 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_conditional_expr_in_conditional_expr371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr389 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_logicalOR_expr392 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_logicalAND_expr_in_logicalOR_expr394 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr411 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_logicalAND_expr414 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_bitwiseOR_expr_in_logicalAND_expr416 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr434 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_bitwiseOR_expr437 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_bitwiseAND_expr_in_bitwiseOR_expr439 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr456 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_bitwiseAND_expr459 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_equality_expr_in_bitwiseAND_expr461 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr479 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_set_in_equality_expr483 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr491 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_expr_in_relational_expr510 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expr514 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_expr_in_relational_expr524 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_term_in_expr542 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr546 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_term_in_expr557 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_unary_expr_in_term571 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term575 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_unary_expr_in_term585 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expr601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_unary_expr607 = new BitSet(new long[]{0x0010000000089100L,0x000000000001090CL});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_postfix_expression630 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression633 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_postfix_expression634 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_factor688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_values_in_literal710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_declr_stmt722 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt724 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_COMMA_in_declr_stmt726 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_object_name_in_declr_stmt728 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_DELIMITER_in_declr_stmt732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_value_in_object_values755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_object_values757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_object_values759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_object_values761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_object_values763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_object_values765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_role_in_object_values767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_object_values769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topology_in_object_values771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_object_values773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_object_values775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_policy_in_role809 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_role812 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_policy_in_role814 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_direction_in_policy824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_verdict_in_policy826 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_proto_in_policy828 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_port_in_policy830 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_port_in_policy832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_policy836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_verdict_in_policy838 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_proto_in_policy840 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_icmp_cntrl_message_in_policy842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_group_in_topology849 = new BitSet(new long[]{0x0000000000000000L,0x000000000000080CL});
    public static final BitSet FOLLOW_role_in_topology853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serv_group_in_topology858 = new BitSet(new long[]{0x0000000000080000L,0x000000000001000CL});
    public static final BitSet FOLLOW_role_in_topology862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_int_value877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_int_value881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_char_value889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_verdict0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_proto0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICMP_MESSAGE_TYPE_in_icmp_cntrl_message937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_port944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_NAME_in_object_name989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_interface_name1083 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_OBJECT_NAME_in_interface_name1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_interface_name1089 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_interface_name1092 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DIV_in_interface_name1095 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_interface_name1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1107 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1109 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1111 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1113 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1115 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_ip_addr1117 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_ip_addr1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_nmask1129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_nmask1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_name_in_host1138 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_host1140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_host1142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_host1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_host1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_in_host_set1154 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_host_set1157 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_host_in_host_set1159 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set1171 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_dns_set1174 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_dns_set1177 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ip_addr_in_gateway1186 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_gateway1189 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ip_addr_in_gateway1191 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_75_in_host_group1200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_host_group1203 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_host_set_in_host_group1205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_host_group1207 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_host_group1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_host_group1215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_dns_set_in_host_group1217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_host_group1219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_host_group1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_host_group1229 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_gateway_in_host_group1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_host_group1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip_addr_in_serv_descr1255 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_nmask_in_serv_descr1258 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_listen_port_in_serv_descr1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_serv_group1270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_serv_group1272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_descr_in_serv_group1274 = new BitSet(new long[]{0x0000000000004000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_serv_group1277 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_serv_descr_in_serv_group1279 = new BitSet(new long[]{0x0000000000004000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_serv_group1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_name_in_serv_group1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_serv_listen_port1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_host_name1311 = new BitSet(new long[]{0x0000000000000002L});

}