// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/randy/Projects/widget.parser/classes/widget.g 2010-07-18 13:35:17

	package org.emberfeather.widget;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class widgetParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "STRING", "INT", "FLOAT", "'['", "':'", "'/]'", "']'", "'[/]'", "'{'", "', '", "'}'", "'{}'", "'true'", "'false'"
    };
    public static final int INT=7;
    public static final int FLOAT=8;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int WS=5;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int STRING=6;

    // delegates
    // delegators


        public widgetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public widgetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return widgetParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/randy/Projects/widget.parser/classes/widget.g"; }


    public static class document_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "document"
    // /Users/randy/Projects/widget.parser/classes/widget.g:15:1: document : anything widget anything ( widget anything )* ;
    public final widgetParser.document_return document() throws RecognitionException {
        widgetParser.document_return retval = new widgetParser.document_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        widgetParser.anything_return anything1 = null;

        widgetParser.widget_return widget2 = null;

        widgetParser.anything_return anything3 = null;

        widgetParser.widget_return widget4 = null;

        widgetParser.anything_return anything5 = null;



        try {
            // /Users/randy/Projects/widget.parser/classes/widget.g:15:9: ( anything widget anything ( widget anything )* )
            // /Users/randy/Projects/widget.parser/classes/widget.g:16:2: anything widget anything ( widget anything )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anything_in_document36);
            anything1=anything();

            state._fsp--;

            adaptor.addChild(root_0, anything1.getTree());
            pushFollow(FOLLOW_widget_in_document38);
            widget2=widget();

            state._fsp--;

            adaptor.addChild(root_0, widget2.getTree());
            pushFollow(FOLLOW_anything_in_document40);
            anything3=anything();

            state._fsp--;

            adaptor.addChild(root_0, anything3.getTree());
            // /Users/randy/Projects/widget.parser/classes/widget.g:16:27: ( widget anything )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/randy/Projects/widget.parser/classes/widget.g:16:28: widget anything
            	    {
            	    pushFollow(FOLLOW_widget_in_document43);
            	    widget4=widget();

            	    state._fsp--;

            	    adaptor.addChild(root_0, widget4.getTree());
            	    pushFollow(FOLLOW_anything_in_document45);
            	    anything5=anything();

            	    state._fsp--;

            	    adaptor.addChild(root_0, anything5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "document"

    public static class widget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "widget"
    // /Users/randy/Projects/widget.parser/classes/widget.g:19:1: widget : '[' ID ':' ID ( WS )? ( arguments ( WS )? )? '/]' '[' ID ':' ID ( WS )? ( arguments ( WS )? )? ']' content '[/]' ;
    public final widgetParser.widget_return widget() throws RecognitionException {
        widgetParser.widget_return retval = new widgetParser.widget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal6=null;
        Token ID7=null;
        Token char_literal8=null;
        Token ID9=null;
        Token WS10=null;
        Token WS12=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token ID15=null;
        Token char_literal16=null;
        Token ID17=null;
        Token WS18=null;
        Token WS20=null;
        Token char_literal21=null;
        Token string_literal23=null;
        widgetParser.arguments_return arguments11 = null;

        widgetParser.arguments_return arguments19 = null;

        widgetParser.content_return content22 = null;


        Object char_literal6_tree=null;
        Object ID7_tree=null;
        Object char_literal8_tree=null;
        Object ID9_tree=null;
        Object WS10_tree=null;
        Object WS12_tree=null;
        Object string_literal13_tree=null;
        Object char_literal14_tree=null;
        Object ID15_tree=null;
        Object char_literal16_tree=null;
        Object ID17_tree=null;
        Object WS18_tree=null;
        Object WS20_tree=null;
        Object char_literal21_tree=null;
        Object string_literal23_tree=null;

        try {
            // /Users/randy/Projects/widget.parser/classes/widget.g:19:7: ( '[' ID ':' ID ( WS )? ( arguments ( WS )? )? '/]' '[' ID ':' ID ( WS )? ( arguments ( WS )? )? ']' content '[/]' )
            // /Users/randy/Projects/widget.parser/classes/widget.g:20:2: '[' ID ':' ID ( WS )? ( arguments ( WS )? )? '/]' '[' ID ':' ID ( WS )? ( arguments ( WS )? )? ']' content '[/]'
            {
            root_0 = (Object)adaptor.nil();

            char_literal6=(Token)match(input,9,FOLLOW_9_in_widget57); 
            char_literal6_tree = (Object)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);

            ID7=(Token)match(input,ID,FOLLOW_ID_in_widget59); 
            ID7_tree = (Object)adaptor.create(ID7);
            adaptor.addChild(root_0, ID7_tree);

            char_literal8=(Token)match(input,10,FOLLOW_10_in_widget61); 
            char_literal8_tree = (Object)adaptor.create(char_literal8);
            adaptor.addChild(root_0, char_literal8_tree);

            ID9=(Token)match(input,ID,FOLLOW_ID_in_widget63); 
            ID9_tree = (Object)adaptor.create(ID9);
            adaptor.addChild(root_0, ID9_tree);

            // /Users/randy/Projects/widget.parser/classes/widget.g:20:16: ( WS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/randy/Projects/widget.parser/classes/widget.g:20:16: WS
                    {
                    WS10=(Token)match(input,WS,FOLLOW_WS_in_widget65); 
                    WS10_tree = (Object)adaptor.create(WS10);
                    adaptor.addChild(root_0, WS10_tree);


                    }
                    break;

            }

            // /Users/randy/Projects/widget.parser/classes/widget.g:20:20: ( arguments ( WS )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14||LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/randy/Projects/widget.parser/classes/widget.g:20:21: arguments ( WS )?
                    {
                    pushFollow(FOLLOW_arguments_in_widget69);
                    arguments11=arguments();

                    state._fsp--;

                    adaptor.addChild(root_0, arguments11.getTree());
                    // /Users/randy/Projects/widget.parser/classes/widget.g:20:31: ( WS )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==WS) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/randy/Projects/widget.parser/classes/widget.g:20:31: WS
                            {
                            WS12=(Token)match(input,WS,FOLLOW_WS_in_widget71); 
                            WS12_tree = (Object)adaptor.create(WS12);
                            adaptor.addChild(root_0, WS12_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            string_literal13=(Token)match(input,11,FOLLOW_11_in_widget76); 
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            adaptor.addChild(root_0, string_literal13_tree);

            char_literal14=(Token)match(input,9,FOLLOW_9_in_widget79); 
            char_literal14_tree = (Object)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);

            ID15=(Token)match(input,ID,FOLLOW_ID_in_widget81); 
            ID15_tree = (Object)adaptor.create(ID15);
            adaptor.addChild(root_0, ID15_tree);

            char_literal16=(Token)match(input,10,FOLLOW_10_in_widget83); 
            char_literal16_tree = (Object)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);

            ID17=(Token)match(input,ID,FOLLOW_ID_in_widget85); 
            ID17_tree = (Object)adaptor.create(ID17);
            adaptor.addChild(root_0, ID17_tree);

            // /Users/randy/Projects/widget.parser/classes/widget.g:21:16: ( WS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/randy/Projects/widget.parser/classes/widget.g:21:16: WS
                    {
                    WS18=(Token)match(input,WS,FOLLOW_WS_in_widget87); 
                    WS18_tree = (Object)adaptor.create(WS18);
                    adaptor.addChild(root_0, WS18_tree);


                    }
                    break;

            }

            // /Users/randy/Projects/widget.parser/classes/widget.g:21:20: ( arguments ( WS )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14||LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/randy/Projects/widget.parser/classes/widget.g:21:21: arguments ( WS )?
                    {
                    pushFollow(FOLLOW_arguments_in_widget91);
                    arguments19=arguments();

                    state._fsp--;

                    adaptor.addChild(root_0, arguments19.getTree());
                    // /Users/randy/Projects/widget.parser/classes/widget.g:21:31: ( WS )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==WS) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/randy/Projects/widget.parser/classes/widget.g:21:31: WS
                            {
                            WS20=(Token)match(input,WS,FOLLOW_WS_in_widget93); 
                            WS20_tree = (Object)adaptor.create(WS20);
                            adaptor.addChild(root_0, WS20_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal21=(Token)match(input,12,FOLLOW_12_in_widget98); 
            char_literal21_tree = (Object)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);

            pushFollow(FOLLOW_content_in_widget100);
            content22=content();

            state._fsp--;

            adaptor.addChild(root_0, content22.getTree());
            string_literal23=(Token)match(input,13,FOLLOW_13_in_widget102); 
            string_literal23_tree = (Object)adaptor.create(string_literal23);
            adaptor.addChild(root_0, string_literal23_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "widget"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Users/randy/Projects/widget.parser/classes/widget.g:24:1: arguments : ( '{' WS ( ( ', ' )? arg )* WS '}' | '{}' );
    public final widgetParser.arguments_return arguments() throws RecognitionException {
        widgetParser.arguments_return retval = new widgetParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal24=null;
        Token WS25=null;
        Token string_literal26=null;
        Token WS28=null;
        Token char_literal29=null;
        Token string_literal30=null;
        widgetParser.arg_return arg27 = null;


        Object char_literal24_tree=null;
        Object WS25_tree=null;
        Object string_literal26_tree=null;
        Object WS28_tree=null;
        Object char_literal29_tree=null;
        Object string_literal30_tree=null;

        try {
            // /Users/randy/Projects/widget.parser/classes/widget.g:24:10: ( '{' WS ( ( ', ' )? arg )* WS '}' | '{}' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/randy/Projects/widget.parser/classes/widget.g:25:2: '{' WS ( ( ', ' )? arg )* WS '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal24=(Token)match(input,14,FOLLOW_14_in_arguments112); 
                    char_literal24_tree = (Object)adaptor.create(char_literal24);
                    adaptor.addChild(root_0, char_literal24_tree);

                    WS25=(Token)match(input,WS,FOLLOW_WS_in_arguments114); 
                    WS25_tree = (Object)adaptor.create(WS25);
                    adaptor.addChild(root_0, WS25_tree);

                    // /Users/randy/Projects/widget.parser/classes/widget.g:25:9: ( ( ', ' )? arg )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID||LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/randy/Projects/widget.parser/classes/widget.g:25:11: ( ', ' )? arg
                    	    {
                    	    // /Users/randy/Projects/widget.parser/classes/widget.g:25:11: ( ', ' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==15) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // /Users/randy/Projects/widget.parser/classes/widget.g:25:11: ', '
                    	            {
                    	            string_literal26=(Token)match(input,15,FOLLOW_15_in_arguments118); 
                    	            string_literal26_tree = (Object)adaptor.create(string_literal26);
                    	            adaptor.addChild(root_0, string_literal26_tree);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_arg_in_arguments121);
                    	    arg27=arg();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, arg27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    WS28=(Token)match(input,WS,FOLLOW_WS_in_arguments126); 
                    WS28_tree = (Object)adaptor.create(WS28);
                    adaptor.addChild(root_0, WS28_tree);

                    char_literal29=(Token)match(input,16,FOLLOW_16_in_arguments128); 
                    char_literal29_tree = (Object)adaptor.create(char_literal29);
                    adaptor.addChild(root_0, char_literal29_tree);


                    }
                    break;
                case 2 :
                    // /Users/randy/Projects/widget.parser/classes/widget.g:26:4: '{}'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal30=(Token)match(input,17,FOLLOW_17_in_arguments133); 
                    string_literal30_tree = (Object)adaptor.create(string_literal30);
                    adaptor.addChild(root_0, string_literal30_tree);


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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg"
    // /Users/randy/Projects/widget.parser/classes/widget.g:29:1: arg : ID ':' WS value ;
    public final widgetParser.arg_return arg() throws RecognitionException {
        widgetParser.arg_return retval = new widgetParser.arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID31=null;
        Token char_literal32=null;
        Token WS33=null;
        widgetParser.value_return value34 = null;


        Object ID31_tree=null;
        Object char_literal32_tree=null;
        Object WS33_tree=null;

        try {
            // /Users/randy/Projects/widget.parser/classes/widget.g:29:4: ( ID ':' WS value )
            // /Users/randy/Projects/widget.parser/classes/widget.g:30:2: ID ':' WS value
            {
            root_0 = (Object)adaptor.nil();

            ID31=(Token)match(input,ID,FOLLOW_ID_in_arg143); 
            ID31_tree = (Object)adaptor.create(ID31);
            adaptor.addChild(root_0, ID31_tree);

            char_literal32=(Token)match(input,10,FOLLOW_10_in_arg145); 
            char_literal32_tree = (Object)adaptor.create(char_literal32);
            adaptor.addChild(root_0, char_literal32_tree);

            WS33=(Token)match(input,WS,FOLLOW_WS_in_arg147); 
            WS33_tree = (Object)adaptor.create(WS33);
            adaptor.addChild(root_0, WS33_tree);

            pushFollow(FOLLOW_value_in_arg149);
            value34=value();

            state._fsp--;

            adaptor.addChild(root_0, value34.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /Users/randy/Projects/widget.parser/classes/widget.g:33:1: value : ( STRING | INT | FLOAT | ( 'true' | 'false' ) );
    public final widgetParser.value_return value() throws RecognitionException {
        widgetParser.value_return retval = new widgetParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // /Users/randy/Projects/widget.parser/classes/widget.g:33:6: ( STRING | INT | FLOAT | ( 'true' | 'false' ) )
            // /Users/randy/Projects/widget.parser/classes/widget.g:
            {
            root_0 = (Object)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING && input.LA(1)<=FLOAT)||(input.LA(1)>=18 && input.LA(1)<=19) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set35));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class content_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "content"
    // /Users/randy/Projects/widget.parser/classes/widget.g:40:1: content : ( . )+ ;
    public final widgetParser.content_return content() throws RecognitionException {
        widgetParser.content_return retval = new widgetParser.content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token wildcard36=null;

        Object wildcard36_tree=null;

        try {
            // /Users/randy/Projects/widget.parser/classes/widget.g:40:8: ( ( . )+ )
            // /Users/randy/Projects/widget.parser/classes/widget.g:41:2: ( . )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/randy/Projects/widget.parser/classes/widget.g:41:2: ( . )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=2;
                }
                else if ( ((LA11_0>=ID && LA11_0<=12)||(LA11_0>=14 && LA11_0<=19)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/randy/Projects/widget.parser/classes/widget.g:41:2: .
            	    {
            	    wildcard36=(Token)input.LT(1);
            	    matchAny(input); 
            	    wildcard36_tree = (Object)adaptor.create(wildcard36);
            	    adaptor.addChild(root_0, wildcard36_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "content"

    public static class anything_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anything"
    // /Users/randy/Projects/widget.parser/classes/widget.g:44:1: anything : ( options {greedy=false; } : . )* ;
    public final widgetParser.anything_return anything() throws RecognitionException {
        widgetParser.anything_return retval = new widgetParser.anything_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token wildcard37=null;

        Object wildcard37_tree=null;

        try {
            // /Users/randy/Projects/widget.parser/classes/widget.g:44:9: ( ( options {greedy=false; } : . )* )
            // /Users/randy/Projects/widget.parser/classes/widget.g:45:2: ( options {greedy=false; } : . )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/randy/Projects/widget.parser/classes/widget.g:45:2: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // /Users/randy/Projects/widget.parser/classes/widget.g:45:30: .
            	    {
            	    wildcard37=(Token)input.LT(1);
            	    matchAny(input); 
            	    wildcard37_tree = (Object)adaptor.create(wildcard37);
            	    adaptor.addChild(root_0, wildcard37_tree);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "anything"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\111\uffff";
    static final String DFA12_eofS =
        "\1\2\1\3\2\uffff\40\3\1\uffff\32\3\1\uffff\11\3";
    static final String DFA12_minS =
        "\2\4\2\uffff\40\4\1\uffff\32\4\1\uffff\11\4";
    static final String DFA12_maxS =
        "\2\23\2\uffff\40\23\1\uffff\32\23\1\uffff\11\23";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1\40\uffff\1\2\32\uffff\1\2\11\uffff";
    static final String DFA12_specialS =
        "\111\uffff}>";
    static final String[] DFA12_transitionS = {
            "\5\3\1\1\12\3",
            "\1\4\17\3",
            "",
            "",
            "\6\3\1\5\11\3",
            "\1\6\17\3",
            "\1\3\1\7\5\3\1\12\2\3\1\10\2\3\1\11\2\3",
            "\7\3\1\12\2\3\1\10\2\3\1\11\2\3",
            "\1\3\1\13\16\3",
            "\1\3\1\14\5\3\1\12\10\3",
            "\5\3\1\15\12\3",
            "\1\17\1\20\11\3\1\16\4\3",
            "\7\3\1\12\10\3",
            "\1\21\17\3",
            "\1\17\17\3",
            "\6\3\1\22\11\3",
            "\14\3\1\23\3\3",
            "\6\3\1\24\11\3",
            "\1\3\1\25\16\3",
            "\1\3\1\14\5\3\1\12\10\3",
            "\1\26\17\3",
            "\2\3\3\27\11\3\2\27",
            "\1\3\1\30\6\3\1\33\1\3\1\31\2\3\1\32\2\3",
            "\1\17\1\20\11\3\1\16\4\3",
            "\10\3\1\33\1\3\1\31\2\3\1\32\2\3",
            "\1\3\1\34\16\3",
            "\1\3\1\35\6\3\1\33\7\3",
            "\5\37\1\36\12\37",
            "\1\41\1\42\11\3\1\40\4\3",
            "\10\3\1\33\7\3",
            "\1\43\4\37\1\36\3\37\1\44\6\37",
            "\5\37\1\36\3\37\1\44\6\37",
            "\1\41\17\3",
            "\6\3\1\45\11\3",
            "\14\3\1\46\3\3",
            "\5\37\1\36\1\47\2\37\1\44\6\37",
            "",
            "\1\3\1\50\16\3",
            "\1\3\1\35\6\3\1\33\7\3",
            "\1\51\4\37\1\36\3\37\1\44\6\37",
            "\2\3\3\52\11\3\2\52",
            "\1\37\1\53\3\37\1\36\1\37\1\56\1\37\1\44\1\54\2\37\1\55\2\37",
            "\1\41\1\42\11\3\1\40\4\3",
            "\5\37\1\36\1\37\1\56\1\37\1\44\1\54\2\37\1\55\2\37",
            "\1\37\1\57\3\37\1\36\3\37\1\44\6\37",
            "\1\37\1\60\3\37\1\36\1\37\1\56\1\37\1\44\6\37",
            "\5\37\1\61\3\37\1\44\6\37",
            "\1\63\1\64\3\37\1\36\3\37\1\44\1\37\1\62\4\37",
            "\5\37\1\36\1\37\1\56\1\37\1\44\6\37",
            "\1\65\4\37\1\36\3\37\1\44\6\37",
            "\1\63\4\37\1\36\3\37\1\44\6\37",
            "\5\37\1\36\1\66\2\37\1\44\6\37",
            "\5\37\1\36\3\37\1\44\2\37\1\67\3\37",
            "\5\37\1\36\1\70\2\37\1\44\6\37",
            "\1\37\1\71\3\37\1\36\3\37\1\44\6\37",
            "\1\37\1\60\3\37\1\36\1\37\1\56\1\37\1\44\6\37",
            "\1\72\4\37\1\36\3\37\1\44\6\37",
            "\2\37\3\73\1\36\3\37\1\44\4\37\2\73",
            "\1\37\1\74\3\37\1\36\1\37\1\56\1\77\1\44\1\75\2\37\1\76\2\37",
            "\1\63\1\64\3\37\1\36\3\37\1\44\1\37\1\62\4\37",
            "\5\37\1\36\1\37\1\56\1\77\1\44\1\75\2\37\1\76\2\37",
            "\1\37\1\100\3\37\1\36\3\37\1\44\6\37",
            "\1\37\1\101\3\37\1\36\1\37\1\56\1\77\1\44\6\37",
            "",
            "\1\103\1\104\3\37\1\36\3\37\1\44\1\37\1\102\4\37",
            "\5\37\1\36\1\37\1\56\1\77\1\44\6\37",
            "\1\103\4\37\1\36\3\37\1\44\6\37",
            "\5\37\1\36\1\105\2\37\1\44\6\37",
            "\5\37\1\36\3\37\1\44\2\37\1\106\3\37",
            "\1\37\1\107\3\37\1\36\3\37\1\44\6\37",
            "\1\37\1\101\3\37\1\36\1\37\1\56\1\77\1\44\6\37",
            "\2\37\3\110\1\36\3\37\1\44\4\37\2\110",
            "\1\103\1\104\3\37\1\36\3\37\1\44\1\37\1\102\4\37"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 45:2: ( options {greedy=false; } : . )*";
        }
    }
 

    public static final BitSet FOLLOW_anything_in_document36 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_widget_in_document38 = new BitSet(new long[]{0x00000000000FFFF0L});
    public static final BitSet FOLLOW_anything_in_document40 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_widget_in_document43 = new BitSet(new long[]{0x00000000000FFFF0L});
    public static final BitSet FOLLOW_anything_in_document45 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_widget57 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_widget59 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_widget61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_widget63 = new BitSet(new long[]{0x0000000000024820L});
    public static final BitSet FOLLOW_WS_in_widget65 = new BitSet(new long[]{0x0000000000024800L});
    public static final BitSet FOLLOW_arguments_in_widget69 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_WS_in_widget71 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_widget76 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_widget79 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_widget81 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_widget83 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_widget85 = new BitSet(new long[]{0x0000000000025020L});
    public static final BitSet FOLLOW_WS_in_widget87 = new BitSet(new long[]{0x0000000000025000L});
    public static final BitSet FOLLOW_arguments_in_widget91 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_WS_in_widget93 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_widget98 = new BitSet(new long[]{0x00000000000FFFF0L});
    public static final BitSet FOLLOW_content_in_widget100 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_widget102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_arguments112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_arguments114 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_15_in_arguments118 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_arg_in_arguments121 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_WS_in_arguments126 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_arguments128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arguments133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arg143 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arg145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_arg147 = new BitSet(new long[]{0x00000000000C01C0L});
    public static final BitSet FOLLOW_value_in_arg149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});

}