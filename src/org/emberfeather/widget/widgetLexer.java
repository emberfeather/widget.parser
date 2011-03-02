// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/randy/Projects/widget.parser/classes/widget.g 2011-03-02 09:55:27

	package org.emberfeather.widget;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class widgetLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int ID=4;
    public static final int WS=5;
    public static final int STRING=6;
    public static final int INT=7;
    public static final int FLOAT=8;

    // delegates
    // delegators

    public widgetLexer() {;} 
    public widgetLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public widgetLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/randy/Projects/widget.parser/classes/widget.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:7:6: ( '[' )
            // /home/randy/Projects/widget.parser/classes/widget.g:7:8: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:8:7: ( ':' )
            // /home/randy/Projects/widget.parser/classes/widget.g:8:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:9:7: ( '/]' )
            // /home/randy/Projects/widget.parser/classes/widget.g:9:9: '/]'
            {
            match("/]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:10:7: ( ']' )
            // /home/randy/Projects/widget.parser/classes/widget.g:10:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:11:7: ( '[/]' )
            // /home/randy/Projects/widget.parser/classes/widget.g:11:9: '[/]'
            {
            match("[/]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:12:7: ( '{' )
            // /home/randy/Projects/widget.parser/classes/widget.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:13:7: ( ',' )
            // /home/randy/Projects/widget.parser/classes/widget.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:14:7: ( '}' )
            // /home/randy/Projects/widget.parser/classes/widget.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:15:7: ( 'true' )
            // /home/randy/Projects/widget.parser/classes/widget.g:15:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:16:7: ( 'false' )
            // /home/randy/Projects/widget.parser/classes/widget.g:16:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:47:7: ( '\\'' ( options {greedy=false; } : . )* '\\'' | '\"' ( options {greedy=false; } : . )* '\"' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\'') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\"') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/randy/Projects/widget.parser/classes/widget.g:48:2: '\\'' ( options {greedy=false; } : . )* '\\''
                    {
                    match('\''); 
                    // /home/randy/Projects/widget.parser/classes/widget.g:48:7: ( options {greedy=false; } : . )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\'') ) {
                            alt1=2;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/randy/Projects/widget.parser/classes/widget.g:48:32: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // /home/randy/Projects/widget.parser/classes/widget.g:49:4: '\"' ( options {greedy=false; } : . )* '\"'
                    {
                    match('\"'); 
                    // /home/randy/Projects/widget.parser/classes/widget.g:49:8: ( options {greedy=false; } : . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\"') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/randy/Projects/widget.parser/classes/widget.g:49:33: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:52:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/randy/Projects/widget.parser/classes/widget.g:53:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/randy/Projects/widget.parser/classes/widget.g:53:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/randy/Projects/widget.parser/classes/widget.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:56:3: ( ( ' ' | '\\t' | '\\r' | '\\u000C' | '\\n' ) )
            // /home/randy/Projects/widget.parser/classes/widget.g:57:2: ( ' ' | '\\t' | '\\r' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:65:4: ( ( '0' .. '9' )+ )
            // /home/randy/Projects/widget.parser/classes/widget.g:66:2: ( '0' .. '9' )+
            {
            // /home/randy/Projects/widget.parser/classes/widget.g:66:2: ( '0' .. '9' )+
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
            	    // /home/randy/Projects/widget.parser/classes/widget.g:66:2: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/randy/Projects/widget.parser/classes/widget.g:69:6: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /home/randy/Projects/widget.parser/classes/widget.g:70:2: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // /home/randy/Projects/widget.parser/classes/widget.g:70:2: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/randy/Projects/widget.parser/classes/widget.g:70:3: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    match('.'); 
                    // /home/randy/Projects/widget.parser/classes/widget.g:70:18: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/randy/Projects/widget.parser/classes/widget.g:70:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/randy/Projects/widget.parser/classes/widget.g:71:4: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // /home/randy/Projects/widget.parser/classes/widget.g:71:8: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/randy/Projects/widget.parser/classes/widget.g:71:9: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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


                    }
                    break;
                case 3 :
                    // /home/randy/Projects/widget.parser/classes/widget.g:72:4: ( '0' .. '9' )+
                    {
                    // /home/randy/Projects/widget.parser/classes/widget.g:72:4: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/randy/Projects/widget.parser/classes/widget.g:72:5: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    public void mTokens() throws RecognitionException {
        // /home/randy/Projects/widget.parser/classes/widget.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | STRING | ID | WS | INT | FLOAT )
        int alt11=15;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:69: STRING
                {
                mSTRING(); 

                }
                break;
            case 12 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:76: ID
                {
                mID(); 

                }
                break;
            case 13 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:79: WS
                {
                mWS(); 

                }
                break;
            case 14 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:82: INT
                {
                mINT(); 

                }
                break;
            case 15 :
                // /home/randy/Projects/widget.parser/classes/widget.g:1:86: FLOAT
                {
                mFLOAT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA10_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\2\71\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "69:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA11_eotS =
        "\1\uffff\1\20\6\uffff\2\13\3\uffff\1\23\3\uffff\2\13\1\uffff\2\13"+
        "\1\30\1\13\1\uffff\1\32\1\uffff";
    static final String DFA11_eofS =
        "\33\uffff";
    static final String DFA11_minS =
        "\1\11\1\57\6\uffff\1\162\1\141\3\uffff\1\56\3\uffff\1\165\1\154"+
        "\1\uffff\1\145\1\163\1\60\1\145\1\uffff\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\57\6\uffff\1\162\1\141\3\uffff\1\71\3\uffff\1\165\1\154"+
        "\1\uffff\1\145\1\163\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\6\1\7\1\10\2\uffff\1\13\1\14\1\15\1\uffff"+
        "\1\17\1\5\1\1\2\uffff\1\16\4\uffff\1\11\1\uffff\1\12";
    static final String DFA11_specialS =
        "\33\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\14\1\uffff\2\14\22\uffff\1\14\1\uffff\1\12\4\uffff\1\12\4"+
            "\uffff\1\6\1\uffff\1\16\1\3\12\15\1\2\6\uffff\32\13\1\1\1\uffff"+
            "\1\4\1\uffff\1\13\1\uffff\5\13\1\11\15\13\1\10\6\13\1\5\1\uffff"+
            "\1\7",
            "\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "\1\22",
            "",
            "",
            "",
            "\1\16\1\uffff\12\15",
            "",
            "",
            "",
            "\1\24",
            "\1\25",
            "",
            "\1\26",
            "\1\27",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\31",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | STRING | ID | WS | INT | FLOAT );";
        }
    }
 

}