// $ANTLR 3.0.1 C:\\Antlr\\LANCOM\\Block.g 2008-04-15 22:04:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BlockLexer extends Lexer {
    public static final int T73=73;
    public static final int LETTER=16;
    public static final int CHAR=13;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int ID=11;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int COMMA=12;
    public static final int EQUAL=20;
    public static final int PLUS=4;
    public static final int T38=38;
    public static final int T37=37;
    public static final int DIGIT=17;
    public static final int NM=9;
    public static final int T39=39;
    public static final int DOT=15;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int LINE_COMMENT=19;
    public static final int NUMBER=8;
    public static final int T49=49;
    public static final int WHITESPACE=21;
    public static final int T48=48;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int T43=43;
    public static final int Tokens=74;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int T44=44;
    public static final int T50=50;
    public static final int T59=59;
    public static final int DIV=7;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int EscapeSequence=18;
    public static final int T56=56;
    public static final int ICMP_MESSAGE_TYPE=14;
    public static final int T55=55;
    public static final int T58=58;
    public static final int STRING=10;
    public static final int T57=57;
    public BlockLexer() {;} 
    public BlockLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Antlr\\LANCOM\\Block.g"; }

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // C:\\Antlr\\LANCOM\\Block.g:3:6: ( '+' )
            // C:\\Antlr\\LANCOM\\Block.g:3:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // C:\\Antlr\\LANCOM\\Block.g:4:7: ( '-' )
            // C:\\Antlr\\LANCOM\\Block.g:4:9: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start MULT
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            // C:\\Antlr\\LANCOM\\Block.g:5:6: ( '*' )
            // C:\\Antlr\\LANCOM\\Block.g:5:8: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULT

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // C:\\Antlr\\LANCOM\\Block.g:6:5: ( '/' )
            // C:\\Antlr\\LANCOM\\Block.g:6:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // C:\\Antlr\\LANCOM\\Block.g:7:5: ( 'prog' )
            // C:\\Antlr\\LANCOM\\Block.g:7:7: 'prog'
            {
            match("prog"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // C:\\Antlr\\LANCOM\\Block.g:8:5: ( 'endprog' )
            // C:\\Antlr\\LANCOM\\Block.g:8:7: 'endprog'
            {
            match("endprog"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // C:\\Antlr\\LANCOM\\Block.g:9:5: ( ';' )
            // C:\\Antlr\\LANCOM\\Block.g:9:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // C:\\Antlr\\LANCOM\\Block.g:10:5: ( 'if' )
            // C:\\Antlr\\LANCOM\\Block.g:10:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // C:\\Antlr\\LANCOM\\Block.g:11:5: ( '(' )
            // C:\\Antlr\\LANCOM\\Block.g:11:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // C:\\Antlr\\LANCOM\\Block.g:12:5: ( ')' )
            // C:\\Antlr\\LANCOM\\Block.g:12:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // C:\\Antlr\\LANCOM\\Block.g:13:5: ( 'else' )
            // C:\\Antlr\\LANCOM\\Block.g:13:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // C:\\Antlr\\LANCOM\\Block.g:14:5: ( 'endif' )
            // C:\\Antlr\\LANCOM\\Block.g:14:7: 'endif'
            {
            match("endif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // C:\\Antlr\\LANCOM\\Block.g:15:5: ( 'while' )
            // C:\\Antlr\\LANCOM\\Block.g:15:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // C:\\Antlr\\LANCOM\\Block.g:16:5: ( 'endwhile' )
            // C:\\Antlr\\LANCOM\\Block.g:16:7: 'endwhile'
            {
            match("endwhile"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // C:\\Antlr\\LANCOM\\Block.g:17:5: ( 'echo' )
            // C:\\Antlr\\LANCOM\\Block.g:17:7: 'echo'
            {
            match("echo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // C:\\Antlr\\LANCOM\\Block.g:18:5: ( '?' )
            // C:\\Antlr\\LANCOM\\Block.g:18:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // C:\\Antlr\\LANCOM\\Block.g:19:5: ( ':' )
            // C:\\Antlr\\LANCOM\\Block.g:19:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // C:\\Antlr\\LANCOM\\Block.g:20:5: ( '||' )
            // C:\\Antlr\\LANCOM\\Block.g:20:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // C:\\Antlr\\LANCOM\\Block.g:21:5: ( '&&' )
            // C:\\Antlr\\LANCOM\\Block.g:21:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // C:\\Antlr\\LANCOM\\Block.g:22:5: ( '|' )
            // C:\\Antlr\\LANCOM\\Block.g:22:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // C:\\Antlr\\LANCOM\\Block.g:23:5: ( '&' )
            // C:\\Antlr\\LANCOM\\Block.g:23:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // C:\\Antlr\\LANCOM\\Block.g:24:5: ( '==' )
            // C:\\Antlr\\LANCOM\\Block.g:24:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // C:\\Antlr\\LANCOM\\Block.g:25:5: ( '!=' )
            // C:\\Antlr\\LANCOM\\Block.g:25:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // C:\\Antlr\\LANCOM\\Block.g:26:5: ( '<' )
            // C:\\Antlr\\LANCOM\\Block.g:26:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // C:\\Antlr\\LANCOM\\Block.g:27:5: ( '>' )
            // C:\\Antlr\\LANCOM\\Block.g:27:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // C:\\Antlr\\LANCOM\\Block.g:28:5: ( '<=' )
            // C:\\Antlr\\LANCOM\\Block.g:28:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // C:\\Antlr\\LANCOM\\Block.g:29:5: ( '>=' )
            // C:\\Antlr\\LANCOM\\Block.g:29:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // C:\\Antlr\\LANCOM\\Block.g:30:5: ( '~' )
            // C:\\Antlr\\LANCOM\\Block.g:30:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // C:\\Antlr\\LANCOM\\Block.g:31:5: ( '*=' )
            // C:\\Antlr\\LANCOM\\Block.g:31:7: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // C:\\Antlr\\LANCOM\\Block.g:32:5: ( '/=' )
            // C:\\Antlr\\LANCOM\\Block.g:32:7: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // C:\\Antlr\\LANCOM\\Block.g:33:5: ( '+=' )
            // C:\\Antlr\\LANCOM\\Block.g:33:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // C:\\Antlr\\LANCOM\\Block.g:34:5: ( '-=' )
            // C:\\Antlr\\LANCOM\\Block.g:34:7: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // C:\\Antlr\\LANCOM\\Block.g:35:5: ( 'topology_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:35:7: 'topology_type_t'
            {
            match("topology_type_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // C:\\Antlr\\LANCOM\\Block.g:36:5: ( 'host_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:36:7: 'host_type_t'
            {
            match("host_type_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // C:\\Antlr\\LANCOM\\Block.g:37:5: ( 'host_group_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:37:7: 'host_group_type_t'
            {
            match("host_group_type_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // C:\\Antlr\\LANCOM\\Block.g:38:5: ( 'serv_group_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:38:7: 'serv_group_type_t'
            {
            match("serv_group_type_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // C:\\Antlr\\LANCOM\\Block.g:39:5: ( 'role_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:39:7: 'role_type_t'
            {
            match("role_type_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // C:\\Antlr\\LANCOM\\Block.g:40:5: ( 'policy_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:40:7: 'policy_type_t'
            {
            match("policy_type_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // C:\\Antlr\\LANCOM\\Block.g:41:5: ( 'ipaddr_t' )
            // C:\\Antlr\\LANCOM\\Block.g:41:7: 'ipaddr_t'
            {
            match("ipaddr_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // C:\\Antlr\\LANCOM\\Block.g:42:5: ( 'int_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:42:7: 'int_type_t'
            {
            match("int_type_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // C:\\Antlr\\LANCOM\\Block.g:43:5: ( 'char_type_t' )
            // C:\\Antlr\\LANCOM\\Block.g:43:7: 'char_type_t'
            {
            match("char_type_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // C:\\Antlr\\LANCOM\\Block.g:44:5: ( 'inbound' )
            // C:\\Antlr\\LANCOM\\Block.g:44:7: 'inbound'
            {
            match("inbound"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // C:\\Antlr\\LANCOM\\Block.g:45:5: ( 'outbound' )
            // C:\\Antlr\\LANCOM\\Block.g:45:7: 'outbound'
            {
            match("outbound"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // C:\\Antlr\\LANCOM\\Block.g:46:5: ( 'allow' )
            // C:\\Antlr\\LANCOM\\Block.g:46:7: 'allow'
            {
            match("allow"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // C:\\Antlr\\LANCOM\\Block.g:47:5: ( 'deny' )
            // C:\\Antlr\\LANCOM\\Block.g:47:7: 'deny'
            {
            match("deny"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // C:\\Antlr\\LANCOM\\Block.g:48:5: ( 'udp' )
            // C:\\Antlr\\LANCOM\\Block.g:48:7: 'udp'
            {
            match("udp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // C:\\Antlr\\LANCOM\\Block.g:49:5: ( 'tcp' )
            // C:\\Antlr\\LANCOM\\Block.g:49:7: 'tcp'
            {
            match("tcp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // C:\\Antlr\\LANCOM\\Block.g:50:5: ( 'ifname' )
            // C:\\Antlr\\LANCOM\\Block.g:50:7: 'ifname'
            {
            match("ifname"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // C:\\Antlr\\LANCOM\\Block.g:51:5: ( 'card_id' )
            // C:\\Antlr\\LANCOM\\Block.g:51:7: 'card_id'
            {
            match("card_id"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // C:\\Antlr\\LANCOM\\Block.g:52:5: ( 'netmask' )
            // C:\\Antlr\\LANCOM\\Block.g:52:7: 'netmask'
            {
            match("netmask"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // C:\\Antlr\\LANCOM\\Block.g:53:5: ( 'host_group' )
            // C:\\Antlr\\LANCOM\\Block.g:53:7: 'host_group'
            {
            match("host_group"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // C:\\Antlr\\LANCOM\\Block.g:54:5: ( '{' )
            // C:\\Antlr\\LANCOM\\Block.g:54:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // C:\\Antlr\\LANCOM\\Block.g:55:5: ( '}' )
            // C:\\Antlr\\LANCOM\\Block.g:55:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // C:\\Antlr\\LANCOM\\Block.g:56:5: ( 'DNS' )
            // C:\\Antlr\\LANCOM\\Block.g:56:7: 'DNS'
            {
            match("DNS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // C:\\Antlr\\LANCOM\\Block.g:57:5: ( 'GATEWAY' )
            // C:\\Antlr\\LANCOM\\Block.g:57:7: 'GATEWAY'
            {
            match("GATEWAY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // C:\\Antlr\\LANCOM\\Block.g:58:5: ( 'service_set' )
            // C:\\Antlr\\LANCOM\\Block.g:58:7: 'service_set'
            {
            match("service_set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\Antlr\\LANCOM\\Block.g:357:4: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Antlr\\LANCOM\\Block.g:357:6: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // C:\\Antlr\\LANCOM\\Block.g:357:13: ( LETTER | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start LETTER
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:360:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // C:\\Antlr\\LANCOM\\Block.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // C:\\Antlr\\LANCOM\\Block.g:365:6: ( '.' )
            // C:\\Antlr\\LANCOM\\Block.g:365:8: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start ICMP_MESSAGE_TYPE
    public final void mICMP_MESSAGE_TYPE() throws RecognitionException {
        try {
            int _type = ICMP_MESSAGE_TYPE;
            // C:\\Antlr\\LANCOM\\Block.g:369:2: ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 'E':
                {
                alt2=1;
                }
                break;
            case 'R':
                {
                alt2=2;
                }
                break;
            case 'T':
                {
                alt2=3;
                }
                break;
            case 'A':
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4=='D') ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5=='D') ) {
                        int LA2_6 = input.LA(4);

                        if ( (LA2_6=='R') ) {
                            int LA2_7 = input.LA(5);

                            if ( (LA2_7=='E') ) {
                                int LA2_8 = input.LA(6);

                                if ( (LA2_8=='S') ) {
                                    int LA2_9 = input.LA(7);

                                    if ( (LA2_9=='S') ) {
                                        int LA2_10 = input.LA(8);

                                        if ( (LA2_10==' ') ) {
                                            int LA2_11 = input.LA(9);

                                            if ( (LA2_11=='M') ) {
                                                int LA2_12 = input.LA(10);

                                                if ( (LA2_12=='A') ) {
                                                    int LA2_13 = input.LA(11);

                                                    if ( (LA2_13=='S') ) {
                                                        int LA2_14 = input.LA(12);

                                                        if ( (LA2_14=='K') ) {
                                                            int LA2_15 = input.LA(13);

                                                            if ( (LA2_15==' ') ) {
                                                                int LA2_16 = input.LA(14);

                                                                if ( (LA2_16=='R') ) {
                                                                    int LA2_17 = input.LA(15);

                                                                    if ( (LA2_17=='E') ) {
                                                                        int LA2_18 = input.LA(16);

                                                                        if ( (LA2_18=='Q') ) {
                                                                            alt2=4;
                                                                        }
                                                                        else if ( (LA2_18=='P') ) {
                                                                            alt2=5;
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 18, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 17, input);

                                                                        throw nvae;
                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 16, input);

                                                                    throw nvae;
                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 15, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 14, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 13, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 12, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 11, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 10, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 9, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 8, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("368:1: ICMP_MESSAGE_TYPE : ( 'ECHO REPLY' | 'REDIRECT MESSAGE' | 'TIME EXCEEDED' | 'ADDRESS MASK REQUEST' | 'ADDRESS MASK REPLY' );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:369:4: 'ECHO REPLY'
                    {
                    match("ECHO REPLY"); 


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:370:4: 'REDIRECT MESSAGE'
                    {
                    match("REDIRECT MESSAGE"); 


                    }
                    break;
                case 3 :
                    // C:\\Antlr\\LANCOM\\Block.g:371:4: 'TIME EXCEEDED'
                    {
                    match("TIME EXCEEDED"); 


                    }
                    break;
                case 4 :
                    // C:\\Antlr\\LANCOM\\Block.g:372:4: 'ADDRESS MASK REQUEST'
                    {
                    match("ADDRESS MASK REQUEST"); 


                    }
                    break;
                case 5 :
                    // C:\\Antlr\\LANCOM\\Block.g:373:4: 'ADDRESS MASK REPLY'
                    {
                    match("ADDRESS MASK REPLY"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ICMP_MESSAGE_TYPE

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // C:\\Antlr\\LANCOM\\Block.g:376:7: ( ',' )
            // C:\\Antlr\\LANCOM\\Block.g:376:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start CHAR
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            // C:\\Antlr\\LANCOM\\Block.g:378:6: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Antlr\\LANCOM\\Block.g:378:8: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // C:\\Antlr\\LANCOM\\Block.g:378:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("378:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:378:15: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\LANCOM\\Block.g:378:32: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHAR

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // C:\\Antlr\\LANCOM\\Block.g:380:8: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Antlr\\LANCOM\\Block.g:380:10: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Antlr\\LANCOM\\Block.g:380:14: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:380:16: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Antlr\\LANCOM\\Block.g:380:33: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start EscapeSequence
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:383:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Antlr\\LANCOM\\Block.g:383:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end EscapeSequence

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // C:\\Antlr\\LANCOM\\Block.g:386:8: ( ( DIGIT )+ )
            // C:\\Antlr\\LANCOM\\Block.g:386:10: ( DIGIT )+
            {
            // C:\\Antlr\\LANCOM\\Block.g:386:10: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:386:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Antlr\\LANCOM\\Block.g:389:2: ( '0' .. '9' )
            // C:\\Antlr\\LANCOM\\Block.g:389:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // C:\\Antlr\\LANCOM\\Block.g:395:2: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Antlr\\LANCOM\\Block.g:395:4: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 
            // C:\\Antlr\\LANCOM\\Block.g:395:8: (~ ( '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:395:8: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // C:\\Antlr\\LANCOM\\Block.g:395:22: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Antlr\\LANCOM\\Block.g:395:22: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // C:\\Antlr\\LANCOM\\Block.g:398:7: ( '=' )
            // C:\\Antlr\\LANCOM\\Block.g:398:9: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start WHITESPACE
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            // C:\\Antlr\\LANCOM\\Block.g:401:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Antlr\\LANCOM\\Block.g:401:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Antlr\\LANCOM\\Block.g:401:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||(LA8_0>='\f' && LA8_0<='\r')||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Antlr\\LANCOM\\Block.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHITESPACE

    public void mTokens() throws RecognitionException {
        // C:\\Antlr\\LANCOM\\Block.g:1:8: ( PLUS | MINUS | MULT | DIV | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | ID | DOT | ICMP_MESSAGE_TYPE | COMMA | CHAR | STRING | NUMBER | LINE_COMMENT | EQUAL | WHITESPACE )
        int alt9=66;
        switch ( input.LA(1) ) {
        case '+':
            {
            int LA9_1 = input.LA(2);

            if ( (LA9_1=='=') ) {
                alt9=31;
            }
            else {
                alt9=1;}
            }
            break;
        case '-':
            {
            int LA9_2 = input.LA(2);

            if ( (LA9_2=='=') ) {
                alt9=32;
            }
            else {
                alt9=2;}
            }
            break;
        case '*':
            {
            int LA9_3 = input.LA(2);

            if ( (LA9_3=='=') ) {
                alt9=29;
            }
            else {
                alt9=3;}
            }
            break;
        case '/':
            {
            int LA9_4 = input.LA(2);

            if ( (LA9_4=='=') ) {
                alt9=30;
            }
            else {
                alt9=4;}
            }
            break;
        case 'p':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA9_55 = input.LA(3);

                if ( (LA9_55=='l') ) {
                    int LA9_92 = input.LA(4);

                    if ( (LA9_92=='i') ) {
                        int LA9_121 = input.LA(5);

                        if ( (LA9_121=='c') ) {
                            int LA9_151 = input.LA(6);

                            if ( (LA9_151=='y') ) {
                                int LA9_178 = input.LA(7);

                                if ( (LA9_178=='_') ) {
                                    int LA9_201 = input.LA(8);

                                    if ( (LA9_201=='t') ) {
                                        int LA9_221 = input.LA(9);

                                        if ( (LA9_221=='y') ) {
                                            int LA9_239 = input.LA(10);

                                            if ( (LA9_239=='p') ) {
                                                int LA9_251 = input.LA(11);

                                                if ( (LA9_251=='e') ) {
                                                    int LA9_260 = input.LA(12);

                                                    if ( (LA9_260=='_') ) {
                                                        int LA9_270 = input.LA(13);

                                                        if ( (LA9_270=='t') ) {
                                                            int LA9_278 = input.LA(14);

                                                            if ( ((LA9_278>='0' && LA9_278<='9')||(LA9_278>='A' && LA9_278<='Z')||LA9_278=='_'||(LA9_278>='a' && LA9_278<='z')) ) {
                                                                alt9=57;
                                                            }
                                                            else {
                                                                alt9=38;}
                                                        }
                                                        else {
                                                            alt9=57;}
                                                    }
                                                    else {
                                                        alt9=57;}
                                                }
                                                else {
                                                    alt9=57;}
                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
                }
                break;
            case 'r':
                {
                int LA9_56 = input.LA(3);

                if ( (LA9_56=='o') ) {
                    int LA9_93 = input.LA(4);

                    if ( (LA9_93=='g') ) {
                        int LA9_122 = input.LA(5);

                        if ( ((LA9_122>='0' && LA9_122<='9')||(LA9_122>='A' && LA9_122<='Z')||LA9_122=='_'||(LA9_122>='a' && LA9_122<='z')) ) {
                            alt9=57;
                        }
                        else {
                            alt9=5;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
                }
                break;
            default:
                alt9=57;}

            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA9_57 = input.LA(3);

                if ( (LA9_57=='d') ) {
                    switch ( input.LA(4) ) {
                    case 'w':
                        {
                        int LA9_123 = input.LA(5);

                        if ( (LA9_123=='h') ) {
                            int LA9_153 = input.LA(6);

                            if ( (LA9_153=='i') ) {
                                int LA9_179 = input.LA(7);

                                if ( (LA9_179=='l') ) {
                                    int LA9_202 = input.LA(8);

                                    if ( (LA9_202=='e') ) {
                                        int LA9_222 = input.LA(9);

                                        if ( ((LA9_222>='0' && LA9_222<='9')||(LA9_222>='A' && LA9_222<='Z')||LA9_222=='_'||(LA9_222>='a' && LA9_222<='z')) ) {
                                            alt9=57;
                                        }
                                        else {
                                            alt9=14;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                        }
                        break;
                    case 'i':
                        {
                        int LA9_124 = input.LA(5);

                        if ( (LA9_124=='f') ) {
                            int LA9_154 = input.LA(6);

                            if ( ((LA9_154>='0' && LA9_154<='9')||(LA9_154>='A' && LA9_154<='Z')||LA9_154=='_'||(LA9_154>='a' && LA9_154<='z')) ) {
                                alt9=57;
                            }
                            else {
                                alt9=12;}
                        }
                        else {
                            alt9=57;}
                        }
                        break;
                    case 'p':
                        {
                        int LA9_125 = input.LA(5);

                        if ( (LA9_125=='r') ) {
                            int LA9_155 = input.LA(6);

                            if ( (LA9_155=='o') ) {
                                int LA9_181 = input.LA(7);

                                if ( (LA9_181=='g') ) {
                                    int LA9_203 = input.LA(8);

                                    if ( ((LA9_203>='0' && LA9_203<='9')||(LA9_203>='A' && LA9_203<='Z')||LA9_203=='_'||(LA9_203>='a' && LA9_203<='z')) ) {
                                        alt9=57;
                                    }
                                    else {
                                        alt9=6;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                        }
                        break;
                    default:
                        alt9=57;}

                }
                else {
                    alt9=57;}
                }
                break;
            case 'c':
                {
                int LA9_58 = input.LA(3);

                if ( (LA9_58=='h') ) {
                    int LA9_95 = input.LA(4);

                    if ( (LA9_95=='o') ) {
                        int LA9_126 = input.LA(5);

                        if ( ((LA9_126>='0' && LA9_126<='9')||(LA9_126>='A' && LA9_126<='Z')||LA9_126=='_'||(LA9_126>='a' && LA9_126<='z')) ) {
                            alt9=57;
                        }
                        else {
                            alt9=15;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
                }
                break;
            case 'l':
                {
                int LA9_59 = input.LA(3);

                if ( (LA9_59=='s') ) {
                    int LA9_96 = input.LA(4);

                    if ( (LA9_96=='e') ) {
                        int LA9_127 = input.LA(5);

                        if ( ((LA9_127>='0' && LA9_127<='9')||(LA9_127>='A' && LA9_127<='Z')||LA9_127=='_'||(LA9_127>='a' && LA9_127<='z')) ) {
                            alt9=57;
                        }
                        else {
                            alt9=11;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
                }
                break;
            default:
                alt9=57;}

            }
            break;
        case ';':
            {
            alt9=7;
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA9_97 = input.LA(4);

                    if ( (LA9_97=='_') ) {
                        int LA9_128 = input.LA(5);

                        if ( (LA9_128=='t') ) {
                            int LA9_158 = input.LA(6);

                            if ( (LA9_158=='y') ) {
                                int LA9_182 = input.LA(7);

                                if ( (LA9_182=='p') ) {
                                    int LA9_204 = input.LA(8);

                                    if ( (LA9_204=='e') ) {
                                        int LA9_224 = input.LA(9);

                                        if ( (LA9_224=='_') ) {
                                            int LA9_241 = input.LA(10);

                                            if ( (LA9_241=='t') ) {
                                                int LA9_252 = input.LA(11);

                                                if ( ((LA9_252>='0' && LA9_252<='9')||(LA9_252>='A' && LA9_252<='Z')||LA9_252=='_'||(LA9_252>='a' && LA9_252<='z')) ) {
                                                    alt9=57;
                                                }
                                                else {
                                                    alt9=40;}
                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                    }
                    break;
                case 'b':
                    {
                    int LA9_98 = input.LA(4);

                    if ( (LA9_98=='o') ) {
                        int LA9_129 = input.LA(5);

                        if ( (LA9_129=='u') ) {
                            int LA9_159 = input.LA(6);

                            if ( (LA9_159=='n') ) {
                                int LA9_183 = input.LA(7);

                                if ( (LA9_183=='d') ) {
                                    int LA9_205 = input.LA(8);

                                    if ( ((LA9_205>='0' && LA9_205<='9')||(LA9_205>='A' && LA9_205<='Z')||LA9_205=='_'||(LA9_205>='a' && LA9_205<='z')) ) {
                                        alt9=57;
                                    }
                                    else {
                                        alt9=42;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                    }
                    break;
                default:
                    alt9=57;}

                }
                break;
            case 'p':
                {
                int LA9_61 = input.LA(3);

                if ( (LA9_61=='a') ) {
                    int LA9_99 = input.LA(4);

                    if ( (LA9_99=='d') ) {
                        int LA9_130 = input.LA(5);

                        if ( (LA9_130=='d') ) {
                            int LA9_160 = input.LA(6);

                            if ( (LA9_160=='r') ) {
                                int LA9_184 = input.LA(7);

                                if ( (LA9_184=='_') ) {
                                    int LA9_206 = input.LA(8);

                                    if ( (LA9_206=='t') ) {
                                        int LA9_226 = input.LA(9);

                                        if ( ((LA9_226>='0' && LA9_226<='9')||(LA9_226>='A' && LA9_226<='Z')||LA9_226=='_'||(LA9_226>='a' && LA9_226<='z')) ) {
                                            alt9=57;
                                        }
                                        else {
                                            alt9=39;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
                }
                break;
            case 'f':
                {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA9_100 = input.LA(4);

                    if ( (LA9_100=='a') ) {
                        int LA9_131 = input.LA(5);

                        if ( (LA9_131=='m') ) {
                            int LA9_161 = input.LA(6);

                            if ( (LA9_161=='e') ) {
                                int LA9_185 = input.LA(7);

                                if ( ((LA9_185>='0' && LA9_185<='9')||(LA9_185>='A' && LA9_185<='Z')||LA9_185=='_'||(LA9_185>='a' && LA9_185<='z')) ) {
                                    alt9=57;
                                }
                                else {
                                    alt9=48;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt9=57;
                    }
                    break;
                default:
                    alt9=8;}

                }
                break;
            default:
                alt9=57;}

            }
            break;
        case '(':
            {
            alt9=9;
            }
            break;
        case ')':
            {
            alt9=10;
            }
            break;
        case 'w':
            {
            int LA9_11 = input.LA(2);

            if ( (LA9_11=='h') ) {
                int LA9_63 = input.LA(3);

                if ( (LA9_63=='i') ) {
                    int LA9_102 = input.LA(4);

                    if ( (LA9_102=='l') ) {
                        int LA9_132 = input.LA(5);

                        if ( (LA9_132=='e') ) {
                            int LA9_162 = input.LA(6);

                            if ( ((LA9_162>='0' && LA9_162<='9')||(LA9_162>='A' && LA9_162<='Z')||LA9_162=='_'||(LA9_162>='a' && LA9_162<='z')) ) {
                                alt9=57;
                            }
                            else {
                                alt9=13;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case '?':
            {
            alt9=16;
            }
            break;
        case ':':
            {
            alt9=17;
            }
            break;
        case '|':
            {
            int LA9_14 = input.LA(2);

            if ( (LA9_14=='|') ) {
                alt9=18;
            }
            else {
                alt9=20;}
            }
            break;
        case '&':
            {
            int LA9_15 = input.LA(2);

            if ( (LA9_15=='&') ) {
                alt9=19;
            }
            else {
                alt9=21;}
            }
            break;
        case '=':
            {
            int LA9_16 = input.LA(2);

            if ( (LA9_16=='=') ) {
                alt9=22;
            }
            else {
                alt9=65;}
            }
            break;
        case '!':
            {
            alt9=23;
            }
            break;
        case '<':
            {
            int LA9_18 = input.LA(2);

            if ( (LA9_18=='=') ) {
                alt9=26;
            }
            else {
                alt9=24;}
            }
            break;
        case '>':
            {
            int LA9_19 = input.LA(2);

            if ( (LA9_19=='=') ) {
                alt9=27;
            }
            else {
                alt9=25;}
            }
            break;
        case '~':
            {
            alt9=28;
            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA9_74 = input.LA(3);

                if ( (LA9_74=='p') ) {
                    int LA9_103 = input.LA(4);

                    if ( (LA9_103=='o') ) {
                        int LA9_133 = input.LA(5);

                        if ( (LA9_133=='l') ) {
                            int LA9_163 = input.LA(6);

                            if ( (LA9_163=='o') ) {
                                int LA9_187 = input.LA(7);

                                if ( (LA9_187=='g') ) {
                                    int LA9_208 = input.LA(8);

                                    if ( (LA9_208=='y') ) {
                                        int LA9_227 = input.LA(9);

                                        if ( (LA9_227=='_') ) {
                                            int LA9_243 = input.LA(10);

                                            if ( (LA9_243=='t') ) {
                                                int LA9_253 = input.LA(11);

                                                if ( (LA9_253=='y') ) {
                                                    int LA9_262 = input.LA(12);

                                                    if ( (LA9_262=='p') ) {
                                                        int LA9_271 = input.LA(13);

                                                        if ( (LA9_271=='e') ) {
                                                            int LA9_279 = input.LA(14);

                                                            if ( (LA9_279=='_') ) {
                                                                int LA9_283 = input.LA(15);

                                                                if ( (LA9_283=='t') ) {
                                                                    int LA9_286 = input.LA(16);

                                                                    if ( ((LA9_286>='0' && LA9_286<='9')||(LA9_286>='A' && LA9_286<='Z')||LA9_286=='_'||(LA9_286>='a' && LA9_286<='z')) ) {
                                                                        alt9=57;
                                                                    }
                                                                    else {
                                                                        alt9=33;}
                                                                }
                                                                else {
                                                                    alt9=57;}
                                                            }
                                                            else {
                                                                alt9=57;}
                                                        }
                                                        else {
                                                            alt9=57;}
                                                    }
                                                    else {
                                                        alt9=57;}
                                                }
                                                else {
                                                    alt9=57;}
                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
                }
                break;
            case 'c':
                {
                int LA9_75 = input.LA(3);

                if ( (LA9_75=='p') ) {
                    int LA9_104 = input.LA(4);

                    if ( ((LA9_104>='0' && LA9_104<='9')||(LA9_104>='A' && LA9_104<='Z')||LA9_104=='_'||(LA9_104>='a' && LA9_104<='z')) ) {
                        alt9=57;
                    }
                    else {
                        alt9=47;}
                }
                else {
                    alt9=57;}
                }
                break;
            default:
                alt9=57;}

            }
            break;
        case 'h':
            {
            int LA9_22 = input.LA(2);

            if ( (LA9_22=='o') ) {
                int LA9_76 = input.LA(3);

                if ( (LA9_76=='s') ) {
                    int LA9_105 = input.LA(4);

                    if ( (LA9_105=='t') ) {
                        int LA9_135 = input.LA(5);

                        if ( (LA9_135=='_') ) {
                            switch ( input.LA(6) ) {
                            case 'g':
                                {
                                int LA9_188 = input.LA(7);

                                if ( (LA9_188=='r') ) {
                                    int LA9_209 = input.LA(8);

                                    if ( (LA9_209=='o') ) {
                                        int LA9_228 = input.LA(9);

                                        if ( (LA9_228=='u') ) {
                                            int LA9_244 = input.LA(10);

                                            if ( (LA9_244=='p') ) {
                                                switch ( input.LA(11) ) {
                                                case '_':
                                                    {
                                                    int LA9_263 = input.LA(12);

                                                    if ( (LA9_263=='t') ) {
                                                        int LA9_272 = input.LA(13);

                                                        if ( (LA9_272=='y') ) {
                                                            int LA9_280 = input.LA(14);

                                                            if ( (LA9_280=='p') ) {
                                                                int LA9_284 = input.LA(15);

                                                                if ( (LA9_284=='e') ) {
                                                                    int LA9_287 = input.LA(16);

                                                                    if ( (LA9_287=='_') ) {
                                                                        int LA9_290 = input.LA(17);

                                                                        if ( (LA9_290=='t') ) {
                                                                            int LA9_292 = input.LA(18);

                                                                            if ( ((LA9_292>='0' && LA9_292<='9')||(LA9_292>='A' && LA9_292<='Z')||LA9_292=='_'||(LA9_292>='a' && LA9_292<='z')) ) {
                                                                                alt9=57;
                                                                            }
                                                                            else {
                                                                                alt9=35;}
                                                                        }
                                                                        else {
                                                                            alt9=57;}
                                                                    }
                                                                    else {
                                                                        alt9=57;}
                                                                }
                                                                else {
                                                                    alt9=57;}
                                                            }
                                                            else {
                                                                alt9=57;}
                                                        }
                                                        else {
                                                            alt9=57;}
                                                    }
                                                    else {
                                                        alt9=57;}
                                                    }
                                                    break;
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                case 'A':
                                                case 'B':
                                                case 'C':
                                                case 'D':
                                                case 'E':
                                                case 'F':
                                                case 'G':
                                                case 'H':
                                                case 'I':
                                                case 'J':
                                                case 'K':
                                                case 'L':
                                                case 'M':
                                                case 'N':
                                                case 'O':
                                                case 'P':
                                                case 'Q':
                                                case 'R':
                                                case 'S':
                                                case 'T':
                                                case 'U':
                                                case 'V':
                                                case 'W':
                                                case 'X':
                                                case 'Y':
                                                case 'Z':
                                                case 'a':
                                                case 'b':
                                                case 'c':
                                                case 'd':
                                                case 'e':
                                                case 'f':
                                                case 'g':
                                                case 'h':
                                                case 'i':
                                                case 'j':
                                                case 'k':
                                                case 'l':
                                                case 'm':
                                                case 'n':
                                                case 'o':
                                                case 'p':
                                                case 'q':
                                                case 'r':
                                                case 's':
                                                case 't':
                                                case 'u':
                                                case 'v':
                                                case 'w':
                                                case 'x':
                                                case 'y':
                                                case 'z':
                                                    {
                                                    alt9=57;
                                                    }
                                                    break;
                                                default:
                                                    alt9=51;}

                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                                }
                                break;
                            case 't':
                                {
                                int LA9_189 = input.LA(7);

                                if ( (LA9_189=='y') ) {
                                    int LA9_210 = input.LA(8);

                                    if ( (LA9_210=='p') ) {
                                        int LA9_229 = input.LA(9);

                                        if ( (LA9_229=='e') ) {
                                            int LA9_245 = input.LA(10);

                                            if ( (LA9_245=='_') ) {
                                                int LA9_255 = input.LA(11);

                                                if ( (LA9_255=='t') ) {
                                                    int LA9_265 = input.LA(12);

                                                    if ( ((LA9_265>='0' && LA9_265<='9')||(LA9_265>='A' && LA9_265<='Z')||LA9_265=='_'||(LA9_265>='a' && LA9_265<='z')) ) {
                                                        alt9=57;
                                                    }
                                                    else {
                                                        alt9=34;}
                                                }
                                                else {
                                                    alt9=57;}
                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                                }
                                break;
                            default:
                                alt9=57;}

                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 's':
            {
            int LA9_23 = input.LA(2);

            if ( (LA9_23=='e') ) {
                int LA9_77 = input.LA(3);

                if ( (LA9_77=='r') ) {
                    int LA9_106 = input.LA(4);

                    if ( (LA9_106=='v') ) {
                        switch ( input.LA(5) ) {
                        case '_':
                            {
                            int LA9_165 = input.LA(6);

                            if ( (LA9_165=='g') ) {
                                int LA9_190 = input.LA(7);

                                if ( (LA9_190=='r') ) {
                                    int LA9_211 = input.LA(8);

                                    if ( (LA9_211=='o') ) {
                                        int LA9_230 = input.LA(9);

                                        if ( (LA9_230=='u') ) {
                                            int LA9_246 = input.LA(10);

                                            if ( (LA9_246=='p') ) {
                                                int LA9_256 = input.LA(11);

                                                if ( (LA9_256=='_') ) {
                                                    int LA9_266 = input.LA(12);

                                                    if ( (LA9_266=='t') ) {
                                                        int LA9_274 = input.LA(13);

                                                        if ( (LA9_274=='y') ) {
                                                            int LA9_281 = input.LA(14);

                                                            if ( (LA9_281=='p') ) {
                                                                int LA9_285 = input.LA(15);

                                                                if ( (LA9_285=='e') ) {
                                                                    int LA9_288 = input.LA(16);

                                                                    if ( (LA9_288=='_') ) {
                                                                        int LA9_291 = input.LA(17);

                                                                        if ( (LA9_291=='t') ) {
                                                                            int LA9_293 = input.LA(18);

                                                                            if ( ((LA9_293>='0' && LA9_293<='9')||(LA9_293>='A' && LA9_293<='Z')||LA9_293=='_'||(LA9_293>='a' && LA9_293<='z')) ) {
                                                                                alt9=57;
                                                                            }
                                                                            else {
                                                                                alt9=36;}
                                                                        }
                                                                        else {
                                                                            alt9=57;}
                                                                    }
                                                                    else {
                                                                        alt9=57;}
                                                                }
                                                                else {
                                                                    alt9=57;}
                                                            }
                                                            else {
                                                                alt9=57;}
                                                        }
                                                        else {
                                                            alt9=57;}
                                                    }
                                                    else {
                                                        alt9=57;}
                                                }
                                                else {
                                                    alt9=57;}
                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                            }
                            break;
                        case 'i':
                            {
                            int LA9_166 = input.LA(6);

                            if ( (LA9_166=='c') ) {
                                int LA9_191 = input.LA(7);

                                if ( (LA9_191=='e') ) {
                                    int LA9_212 = input.LA(8);

                                    if ( (LA9_212=='_') ) {
                                        int LA9_231 = input.LA(9);

                                        if ( (LA9_231=='s') ) {
                                            int LA9_247 = input.LA(10);

                                            if ( (LA9_247=='e') ) {
                                                int LA9_257 = input.LA(11);

                                                if ( (LA9_257=='t') ) {
                                                    int LA9_267 = input.LA(12);

                                                    if ( ((LA9_267>='0' && LA9_267<='9')||(LA9_267>='A' && LA9_267<='Z')||LA9_267=='_'||(LA9_267>='a' && LA9_267<='z')) ) {
                                                        alt9=57;
                                                    }
                                                    else {
                                                        alt9=56;}
                                                }
                                                else {
                                                    alt9=57;}
                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                            }
                            break;
                        default:
                            alt9=57;}

                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'r':
            {
            int LA9_24 = input.LA(2);

            if ( (LA9_24=='o') ) {
                int LA9_78 = input.LA(3);

                if ( (LA9_78=='l') ) {
                    int LA9_107 = input.LA(4);

                    if ( (LA9_107=='e') ) {
                        int LA9_137 = input.LA(5);

                        if ( (LA9_137=='_') ) {
                            int LA9_167 = input.LA(6);

                            if ( (LA9_167=='t') ) {
                                int LA9_192 = input.LA(7);

                                if ( (LA9_192=='y') ) {
                                    int LA9_213 = input.LA(8);

                                    if ( (LA9_213=='p') ) {
                                        int LA9_232 = input.LA(9);

                                        if ( (LA9_232=='e') ) {
                                            int LA9_248 = input.LA(10);

                                            if ( (LA9_248=='_') ) {
                                                int LA9_258 = input.LA(11);

                                                if ( (LA9_258=='t') ) {
                                                    int LA9_268 = input.LA(12);

                                                    if ( ((LA9_268>='0' && LA9_268<='9')||(LA9_268>='A' && LA9_268<='Z')||LA9_268=='_'||(LA9_268>='a' && LA9_268<='z')) ) {
                                                        alt9=57;
                                                    }
                                                    else {
                                                        alt9=37;}
                                                }
                                                else {
                                                    alt9=57;}
                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA9_79 = input.LA(3);

                if ( (LA9_79=='a') ) {
                    int LA9_108 = input.LA(4);

                    if ( (LA9_108=='r') ) {
                        int LA9_138 = input.LA(5);

                        if ( (LA9_138=='_') ) {
                            int LA9_168 = input.LA(6);

                            if ( (LA9_168=='t') ) {
                                int LA9_193 = input.LA(7);

                                if ( (LA9_193=='y') ) {
                                    int LA9_214 = input.LA(8);

                                    if ( (LA9_214=='p') ) {
                                        int LA9_233 = input.LA(9);

                                        if ( (LA9_233=='e') ) {
                                            int LA9_249 = input.LA(10);

                                            if ( (LA9_249=='_') ) {
                                                int LA9_259 = input.LA(11);

                                                if ( (LA9_259=='t') ) {
                                                    int LA9_269 = input.LA(12);

                                                    if ( ((LA9_269>='0' && LA9_269<='9')||(LA9_269>='A' && LA9_269<='Z')||LA9_269=='_'||(LA9_269>='a' && LA9_269<='z')) ) {
                                                        alt9=57;
                                                    }
                                                    else {
                                                        alt9=41;}
                                                }
                                                else {
                                                    alt9=57;}
                                            }
                                            else {
                                                alt9=57;}
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
                }
                break;
            case 'a':
                {
                int LA9_80 = input.LA(3);

                if ( (LA9_80=='r') ) {
                    int LA9_109 = input.LA(4);

                    if ( (LA9_109=='d') ) {
                        int LA9_139 = input.LA(5);

                        if ( (LA9_139=='_') ) {
                            int LA9_169 = input.LA(6);

                            if ( (LA9_169=='i') ) {
                                int LA9_194 = input.LA(7);

                                if ( (LA9_194=='d') ) {
                                    int LA9_215 = input.LA(8);

                                    if ( ((LA9_215>='0' && LA9_215<='9')||(LA9_215>='A' && LA9_215<='Z')||LA9_215=='_'||(LA9_215>='a' && LA9_215<='z')) ) {
                                        alt9=57;
                                    }
                                    else {
                                        alt9=49;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
                }
                break;
            default:
                alt9=57;}

            }
            break;
        case 'o':
            {
            int LA9_26 = input.LA(2);

            if ( (LA9_26=='u') ) {
                int LA9_81 = input.LA(3);

                if ( (LA9_81=='t') ) {
                    int LA9_110 = input.LA(4);

                    if ( (LA9_110=='b') ) {
                        int LA9_140 = input.LA(5);

                        if ( (LA9_140=='o') ) {
                            int LA9_170 = input.LA(6);

                            if ( (LA9_170=='u') ) {
                                int LA9_195 = input.LA(7);

                                if ( (LA9_195=='n') ) {
                                    int LA9_216 = input.LA(8);

                                    if ( (LA9_216=='d') ) {
                                        int LA9_235 = input.LA(9);

                                        if ( ((LA9_235>='0' && LA9_235<='9')||(LA9_235>='A' && LA9_235<='Z')||LA9_235=='_'||(LA9_235>='a' && LA9_235<='z')) ) {
                                            alt9=57;
                                        }
                                        else {
                                            alt9=43;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'a':
            {
            int LA9_27 = input.LA(2);

            if ( (LA9_27=='l') ) {
                int LA9_82 = input.LA(3);

                if ( (LA9_82=='l') ) {
                    int LA9_111 = input.LA(4);

                    if ( (LA9_111=='o') ) {
                        int LA9_141 = input.LA(5);

                        if ( (LA9_141=='w') ) {
                            int LA9_171 = input.LA(6);

                            if ( ((LA9_171>='0' && LA9_171<='9')||(LA9_171>='A' && LA9_171<='Z')||LA9_171=='_'||(LA9_171>='a' && LA9_171<='z')) ) {
                                alt9=57;
                            }
                            else {
                                alt9=44;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'd':
            {
            int LA9_28 = input.LA(2);

            if ( (LA9_28=='e') ) {
                int LA9_83 = input.LA(3);

                if ( (LA9_83=='n') ) {
                    int LA9_112 = input.LA(4);

                    if ( (LA9_112=='y') ) {
                        int LA9_142 = input.LA(5);

                        if ( ((LA9_142>='0' && LA9_142<='9')||(LA9_142>='A' && LA9_142<='Z')||LA9_142=='_'||(LA9_142>='a' && LA9_142<='z')) ) {
                            alt9=57;
                        }
                        else {
                            alt9=45;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'u':
            {
            int LA9_29 = input.LA(2);

            if ( (LA9_29=='d') ) {
                int LA9_84 = input.LA(3);

                if ( (LA9_84=='p') ) {
                    int LA9_113 = input.LA(4);

                    if ( ((LA9_113>='0' && LA9_113<='9')||(LA9_113>='A' && LA9_113<='Z')||LA9_113=='_'||(LA9_113>='a' && LA9_113<='z')) ) {
                        alt9=57;
                    }
                    else {
                        alt9=46;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'n':
            {
            int LA9_30 = input.LA(2);

            if ( (LA9_30=='e') ) {
                int LA9_85 = input.LA(3);

                if ( (LA9_85=='t') ) {
                    int LA9_114 = input.LA(4);

                    if ( (LA9_114=='m') ) {
                        int LA9_144 = input.LA(5);

                        if ( (LA9_144=='a') ) {
                            int LA9_173 = input.LA(6);

                            if ( (LA9_173=='s') ) {
                                int LA9_197 = input.LA(7);

                                if ( (LA9_197=='k') ) {
                                    int LA9_217 = input.LA(8);

                                    if ( ((LA9_217>='0' && LA9_217<='9')||(LA9_217>='A' && LA9_217<='Z')||LA9_217=='_'||(LA9_217>='a' && LA9_217<='z')) ) {
                                        alt9=57;
                                    }
                                    else {
                                        alt9=50;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case '{':
            {
            alt9=52;
            }
            break;
        case '}':
            {
            alt9=53;
            }
            break;
        case 'D':
            {
            int LA9_33 = input.LA(2);

            if ( (LA9_33=='N') ) {
                int LA9_86 = input.LA(3);

                if ( (LA9_86=='S') ) {
                    int LA9_115 = input.LA(4);

                    if ( ((LA9_115>='0' && LA9_115<='9')||(LA9_115>='A' && LA9_115<='Z')||LA9_115=='_'||(LA9_115>='a' && LA9_115<='z')) ) {
                        alt9=57;
                    }
                    else {
                        alt9=54;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'G':
            {
            int LA9_34 = input.LA(2);

            if ( (LA9_34=='A') ) {
                int LA9_87 = input.LA(3);

                if ( (LA9_87=='T') ) {
                    int LA9_116 = input.LA(4);

                    if ( (LA9_116=='E') ) {
                        int LA9_146 = input.LA(5);

                        if ( (LA9_146=='W') ) {
                            int LA9_174 = input.LA(6);

                            if ( (LA9_174=='A') ) {
                                int LA9_198 = input.LA(7);

                                if ( (LA9_198=='Y') ) {
                                    int LA9_218 = input.LA(8);

                                    if ( ((LA9_218>='0' && LA9_218<='9')||(LA9_218>='A' && LA9_218<='Z')||LA9_218=='_'||(LA9_218>='a' && LA9_218<='z')) ) {
                                        alt9=57;
                                    }
                                    else {
                                        alt9=55;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'E':
            {
            int LA9_35 = input.LA(2);

            if ( (LA9_35=='C') ) {
                int LA9_88 = input.LA(3);

                if ( (LA9_88=='H') ) {
                    int LA9_117 = input.LA(4);

                    if ( (LA9_117=='O') ) {
                        int LA9_147 = input.LA(5);

                        if ( (LA9_147==' ') ) {
                            alt9=59;
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case '.':
            {
            alt9=58;
            }
            break;
        case 'R':
            {
            int LA9_37 = input.LA(2);

            if ( (LA9_37=='E') ) {
                int LA9_89 = input.LA(3);

                if ( (LA9_89=='D') ) {
                    int LA9_118 = input.LA(4);

                    if ( (LA9_118=='I') ) {
                        int LA9_148 = input.LA(5);

                        if ( (LA9_148=='R') ) {
                            int LA9_176 = input.LA(6);

                            if ( (LA9_176=='E') ) {
                                int LA9_199 = input.LA(7);

                                if ( (LA9_199=='C') ) {
                                    int LA9_219 = input.LA(8);

                                    if ( (LA9_219=='T') ) {
                                        int LA9_238 = input.LA(9);

                                        if ( (LA9_238==' ') ) {
                                            alt9=59;
                                        }
                                        else {
                                            alt9=57;}
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'T':
            {
            int LA9_38 = input.LA(2);

            if ( (LA9_38=='I') ) {
                int LA9_90 = input.LA(3);

                if ( (LA9_90=='M') ) {
                    int LA9_119 = input.LA(4);

                    if ( (LA9_119=='E') ) {
                        int LA9_149 = input.LA(5);

                        if ( (LA9_149==' ') ) {
                            alt9=59;
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'A':
            {
            int LA9_39 = input.LA(2);

            if ( (LA9_39=='D') ) {
                int LA9_91 = input.LA(3);

                if ( (LA9_91=='D') ) {
                    int LA9_120 = input.LA(4);

                    if ( (LA9_120=='R') ) {
                        int LA9_150 = input.LA(5);

                        if ( (LA9_150=='E') ) {
                            int LA9_177 = input.LA(6);

                            if ( (LA9_177=='S') ) {
                                int LA9_200 = input.LA(7);

                                if ( (LA9_200=='S') ) {
                                    int LA9_220 = input.LA(8);

                                    if ( (LA9_220==' ') ) {
                                        alt9=59;
                                    }
                                    else {
                                        alt9=57;}
                                }
                                else {
                                    alt9=57;}
                            }
                            else {
                                alt9=57;}
                        }
                        else {
                            alt9=57;}
                    }
                    else {
                        alt9=57;}
                }
                else {
                    alt9=57;}
            }
            else {
                alt9=57;}
            }
            break;
        case 'B':
        case 'C':
        case 'F':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'S':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'b':
        case 'f':
        case 'g':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'q':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt9=57;
            }
            break;
        case ',':
            {
            alt9=60;
            }
            break;
        case '\'':
            {
            alt9=61;
            }
            break;
        case '\"':
            {
            alt9=62;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt9=63;
            }
            break;
        case '#':
            {
            alt9=64;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt9=66;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( PLUS | MINUS | MULT | DIV | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | ID | DOT | ICMP_MESSAGE_TYPE | COMMA | CHAR | STRING | NUMBER | LINE_COMMENT | EQUAL | WHITESPACE );", 9, 0, input);

            throw nvae;
        }

        switch (alt9) {
            case 1 :
                // C:\\Antlr\\LANCOM\\Block.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // C:\\Antlr\\LANCOM\\Block.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // C:\\Antlr\\LANCOM\\Block.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // C:\\Antlr\\LANCOM\\Block.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // C:\\Antlr\\LANCOM\\Block.g:1:30: T22
                {
                mT22(); 

                }
                break;
            case 6 :
                // C:\\Antlr\\LANCOM\\Block.g:1:34: T23
                {
                mT23(); 

                }
                break;
            case 7 :
                // C:\\Antlr\\LANCOM\\Block.g:1:38: T24
                {
                mT24(); 

                }
                break;
            case 8 :
                // C:\\Antlr\\LANCOM\\Block.g:1:42: T25
                {
                mT25(); 

                }
                break;
            case 9 :
                // C:\\Antlr\\LANCOM\\Block.g:1:46: T26
                {
                mT26(); 

                }
                break;
            case 10 :
                // C:\\Antlr\\LANCOM\\Block.g:1:50: T27
                {
                mT27(); 

                }
                break;
            case 11 :
                // C:\\Antlr\\LANCOM\\Block.g:1:54: T28
                {
                mT28(); 

                }
                break;
            case 12 :
                // C:\\Antlr\\LANCOM\\Block.g:1:58: T29
                {
                mT29(); 

                }
                break;
            case 13 :
                // C:\\Antlr\\LANCOM\\Block.g:1:62: T30
                {
                mT30(); 

                }
                break;
            case 14 :
                // C:\\Antlr\\LANCOM\\Block.g:1:66: T31
                {
                mT31(); 

                }
                break;
            case 15 :
                // C:\\Antlr\\LANCOM\\Block.g:1:70: T32
                {
                mT32(); 

                }
                break;
            case 16 :
                // C:\\Antlr\\LANCOM\\Block.g:1:74: T33
                {
                mT33(); 

                }
                break;
            case 17 :
                // C:\\Antlr\\LANCOM\\Block.g:1:78: T34
                {
                mT34(); 

                }
                break;
            case 18 :
                // C:\\Antlr\\LANCOM\\Block.g:1:82: T35
                {
                mT35(); 

                }
                break;
            case 19 :
                // C:\\Antlr\\LANCOM\\Block.g:1:86: T36
                {
                mT36(); 

                }
                break;
            case 20 :
                // C:\\Antlr\\LANCOM\\Block.g:1:90: T37
                {
                mT37(); 

                }
                break;
            case 21 :
                // C:\\Antlr\\LANCOM\\Block.g:1:94: T38
                {
                mT38(); 

                }
                break;
            case 22 :
                // C:\\Antlr\\LANCOM\\Block.g:1:98: T39
                {
                mT39(); 

                }
                break;
            case 23 :
                // C:\\Antlr\\LANCOM\\Block.g:1:102: T40
                {
                mT40(); 

                }
                break;
            case 24 :
                // C:\\Antlr\\LANCOM\\Block.g:1:106: T41
                {
                mT41(); 

                }
                break;
            case 25 :
                // C:\\Antlr\\LANCOM\\Block.g:1:110: T42
                {
                mT42(); 

                }
                break;
            case 26 :
                // C:\\Antlr\\LANCOM\\Block.g:1:114: T43
                {
                mT43(); 

                }
                break;
            case 27 :
                // C:\\Antlr\\LANCOM\\Block.g:1:118: T44
                {
                mT44(); 

                }
                break;
            case 28 :
                // C:\\Antlr\\LANCOM\\Block.g:1:122: T45
                {
                mT45(); 

                }
                break;
            case 29 :
                // C:\\Antlr\\LANCOM\\Block.g:1:126: T46
                {
                mT46(); 

                }
                break;
            case 30 :
                // C:\\Antlr\\LANCOM\\Block.g:1:130: T47
                {
                mT47(); 

                }
                break;
            case 31 :
                // C:\\Antlr\\LANCOM\\Block.g:1:134: T48
                {
                mT48(); 

                }
                break;
            case 32 :
                // C:\\Antlr\\LANCOM\\Block.g:1:138: T49
                {
                mT49(); 

                }
                break;
            case 33 :
                // C:\\Antlr\\LANCOM\\Block.g:1:142: T50
                {
                mT50(); 

                }
                break;
            case 34 :
                // C:\\Antlr\\LANCOM\\Block.g:1:146: T51
                {
                mT51(); 

                }
                break;
            case 35 :
                // C:\\Antlr\\LANCOM\\Block.g:1:150: T52
                {
                mT52(); 

                }
                break;
            case 36 :
                // C:\\Antlr\\LANCOM\\Block.g:1:154: T53
                {
                mT53(); 

                }
                break;
            case 37 :
                // C:\\Antlr\\LANCOM\\Block.g:1:158: T54
                {
                mT54(); 

                }
                break;
            case 38 :
                // C:\\Antlr\\LANCOM\\Block.g:1:162: T55
                {
                mT55(); 

                }
                break;
            case 39 :
                // C:\\Antlr\\LANCOM\\Block.g:1:166: T56
                {
                mT56(); 

                }
                break;
            case 40 :
                // C:\\Antlr\\LANCOM\\Block.g:1:170: T57
                {
                mT57(); 

                }
                break;
            case 41 :
                // C:\\Antlr\\LANCOM\\Block.g:1:174: T58
                {
                mT58(); 

                }
                break;
            case 42 :
                // C:\\Antlr\\LANCOM\\Block.g:1:178: T59
                {
                mT59(); 

                }
                break;
            case 43 :
                // C:\\Antlr\\LANCOM\\Block.g:1:182: T60
                {
                mT60(); 

                }
                break;
            case 44 :
                // C:\\Antlr\\LANCOM\\Block.g:1:186: T61
                {
                mT61(); 

                }
                break;
            case 45 :
                // C:\\Antlr\\LANCOM\\Block.g:1:190: T62
                {
                mT62(); 

                }
                break;
            case 46 :
                // C:\\Antlr\\LANCOM\\Block.g:1:194: T63
                {
                mT63(); 

                }
                break;
            case 47 :
                // C:\\Antlr\\LANCOM\\Block.g:1:198: T64
                {
                mT64(); 

                }
                break;
            case 48 :
                // C:\\Antlr\\LANCOM\\Block.g:1:202: T65
                {
                mT65(); 

                }
                break;
            case 49 :
                // C:\\Antlr\\LANCOM\\Block.g:1:206: T66
                {
                mT66(); 

                }
                break;
            case 50 :
                // C:\\Antlr\\LANCOM\\Block.g:1:210: T67
                {
                mT67(); 

                }
                break;
            case 51 :
                // C:\\Antlr\\LANCOM\\Block.g:1:214: T68
                {
                mT68(); 

                }
                break;
            case 52 :
                // C:\\Antlr\\LANCOM\\Block.g:1:218: T69
                {
                mT69(); 

                }
                break;
            case 53 :
                // C:\\Antlr\\LANCOM\\Block.g:1:222: T70
                {
                mT70(); 

                }
                break;
            case 54 :
                // C:\\Antlr\\LANCOM\\Block.g:1:226: T71
                {
                mT71(); 

                }
                break;
            case 55 :
                // C:\\Antlr\\LANCOM\\Block.g:1:230: T72
                {
                mT72(); 

                }
                break;
            case 56 :
                // C:\\Antlr\\LANCOM\\Block.g:1:234: T73
                {
                mT73(); 

                }
                break;
            case 57 :
                // C:\\Antlr\\LANCOM\\Block.g:1:238: ID
                {
                mID(); 

                }
                break;
            case 58 :
                // C:\\Antlr\\LANCOM\\Block.g:1:241: DOT
                {
                mDOT(); 

                }
                break;
            case 59 :
                // C:\\Antlr\\LANCOM\\Block.g:1:245: ICMP_MESSAGE_TYPE
                {
                mICMP_MESSAGE_TYPE(); 

                }
                break;
            case 60 :
                // C:\\Antlr\\LANCOM\\Block.g:1:263: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 61 :
                // C:\\Antlr\\LANCOM\\Block.g:1:269: CHAR
                {
                mCHAR(); 

                }
                break;
            case 62 :
                // C:\\Antlr\\LANCOM\\Block.g:1:274: STRING
                {
                mSTRING(); 

                }
                break;
            case 63 :
                // C:\\Antlr\\LANCOM\\Block.g:1:281: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 64 :
                // C:\\Antlr\\LANCOM\\Block.g:1:288: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 65 :
                // C:\\Antlr\\LANCOM\\Block.g:1:301: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 66 :
                // C:\\Antlr\\LANCOM\\Block.g:1:307: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


 

}