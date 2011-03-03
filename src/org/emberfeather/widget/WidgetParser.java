// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/randy/Projects/widget.parser/Widget.g 2011-03-02 16:22:20

	package org.emberfeather.widget;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class WidgetParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "STRING", "INT", "FLOAT", "'['", "':'", "'/]'", "']'", "'[/]'", "'{'", "','", "'}'", "'true'", "'false'"
    };
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


        public WidgetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public WidgetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return WidgetParser.tokenNames; }
    public String getGrammarFileName() { return "/home/randy/Projects/widget.parser/Widget.g"; }


    public static class document_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "document"
    // /home/randy/Projects/widget.parser/Widget.g:15:1: document : widget ;
    public final WidgetParser.document_return document() throws RecognitionException {
        WidgetParser.document_return retval = new WidgetParser.document_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WidgetParser.widget_return widget1 = null;



        try {
            // /home/randy/Projects/widget.parser/Widget.g:15:9: ( widget )
            // /home/randy/Projects/widget.parser/Widget.g:16:2: widget
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_widget_in_document36);
            widget1=widget();

            state._fsp--;

            adaptor.addChild(root_0, widget1.getTree());

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
    // /home/randy/Projects/widget.parser/Widget.g:19:1: widget : ( '[' ID ':' ID ( WS )? ( arguments ( WS )? )? '/]' | '[' ID ':' ID ( WS )? ( arguments ( WS )? )? ']' content '[/]' );
    public final WidgetParser.widget_return widget() throws RecognitionException {
        WidgetParser.widget_return retval = new WidgetParser.widget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        Token ID3=null;
        Token char_literal4=null;
        Token ID5=null;
        Token WS6=null;
        Token WS8=null;
        Token string_literal9=null;
        Token char_literal10=null;
        Token ID11=null;
        Token char_literal12=null;
        Token ID13=null;
        Token WS14=null;
        Token WS16=null;
        Token char_literal17=null;
        Token string_literal19=null;
        WidgetParser.arguments_return arguments7 = null;

        WidgetParser.arguments_return arguments15 = null;

        WidgetParser.content_return content18 = null;


        Object char_literal2_tree=null;
        Object ID3_tree=null;
        Object char_literal4_tree=null;
        Object ID5_tree=null;
        Object WS6_tree=null;
        Object WS8_tree=null;
        Object string_literal9_tree=null;
        Object char_literal10_tree=null;
        Object ID11_tree=null;
        Object char_literal12_tree=null;
        Object ID13_tree=null;
        Object WS14_tree=null;
        Object WS16_tree=null;
        Object char_literal17_tree=null;
        Object string_literal19_tree=null;

        try {
            // /home/randy/Projects/widget.parser/Widget.g:19:7: ( '[' ID ':' ID ( WS )? ( arguments ( WS )? )? '/]' | '[' ID ':' ID ( WS )? ( arguments ( WS )? )? ']' content '[/]' )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/randy/Projects/widget.parser/Widget.g:20:2: '[' ID ':' ID ( WS )? ( arguments ( WS )? )? '/]'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal2=(Token)match(input,9,FOLLOW_9_in_widget46); 
                    char_literal2_tree = (Object)adaptor.create(char_literal2);
                    adaptor.addChild(root_0, char_literal2_tree);

                    ID3=(Token)match(input,ID,FOLLOW_ID_in_widget48); 
                    ID3_tree = (Object)adaptor.create(ID3);
                    adaptor.addChild(root_0, ID3_tree);

                    char_literal4=(Token)match(input,10,FOLLOW_10_in_widget50); 
                    char_literal4_tree = (Object)adaptor.create(char_literal4);
                    adaptor.addChild(root_0, char_literal4_tree);

                    ID5=(Token)match(input,ID,FOLLOW_ID_in_widget52); 
                    ID5_tree = (Object)adaptor.create(ID5);
                    adaptor.addChild(root_0, ID5_tree);

                    // /home/randy/Projects/widget.parser/Widget.g:20:16: ( WS )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==WS) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /home/randy/Projects/widget.parser/Widget.g:20:17: WS
                            {
                            WS6=(Token)match(input,WS,FOLLOW_WS_in_widget55); 
                            WS6_tree = (Object)adaptor.create(WS6);
                            adaptor.addChild(root_0, WS6_tree);


                            }
                            break;

                    }

                    // /home/randy/Projects/widget.parser/Widget.g:20:22: ( arguments ( WS )? )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/randy/Projects/widget.parser/Widget.g:20:23: arguments ( WS )?
                            {
                            pushFollow(FOLLOW_arguments_in_widget60);
                            arguments7=arguments();

                            state._fsp--;

                            adaptor.addChild(root_0, arguments7.getTree());
                            // /home/randy/Projects/widget.parser/Widget.g:20:33: ( WS )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==WS) ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // /home/randy/Projects/widget.parser/Widget.g:20:34: WS
                                    {
                                    WS8=(Token)match(input,WS,FOLLOW_WS_in_widget63); 
                                    WS8_tree = (Object)adaptor.create(WS8);
                                    adaptor.addChild(root_0, WS8_tree);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    string_literal9=(Token)match(input,11,FOLLOW_11_in_widget69); 
                    string_literal9_tree = (Object)adaptor.create(string_literal9);
                    adaptor.addChild(root_0, string_literal9_tree);


                    }
                    break;
                case 2 :
                    // /home/randy/Projects/widget.parser/Widget.g:21:4: '[' ID ':' ID ( WS )? ( arguments ( WS )? )? ']' content '[/]'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal10=(Token)match(input,9,FOLLOW_9_in_widget74); 
                    char_literal10_tree = (Object)adaptor.create(char_literal10);
                    adaptor.addChild(root_0, char_literal10_tree);

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_widget76); 
                    ID11_tree = (Object)adaptor.create(ID11);
                    adaptor.addChild(root_0, ID11_tree);

                    char_literal12=(Token)match(input,10,FOLLOW_10_in_widget78); 
                    char_literal12_tree = (Object)adaptor.create(char_literal12);
                    adaptor.addChild(root_0, char_literal12_tree);

                    ID13=(Token)match(input,ID,FOLLOW_ID_in_widget80); 
                    ID13_tree = (Object)adaptor.create(ID13);
                    adaptor.addChild(root_0, ID13_tree);

                    // /home/randy/Projects/widget.parser/Widget.g:21:18: ( WS )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==WS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/randy/Projects/widget.parser/Widget.g:21:19: WS
                            {
                            WS14=(Token)match(input,WS,FOLLOW_WS_in_widget83); 
                            WS14_tree = (Object)adaptor.create(WS14);
                            adaptor.addChild(root_0, WS14_tree);


                            }
                            break;

                    }

                    // /home/randy/Projects/widget.parser/Widget.g:21:24: ( arguments ( WS )? )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==14) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/randy/Projects/widget.parser/Widget.g:21:25: arguments ( WS )?
                            {
                            pushFollow(FOLLOW_arguments_in_widget88);
                            arguments15=arguments();

                            state._fsp--;

                            adaptor.addChild(root_0, arguments15.getTree());
                            // /home/randy/Projects/widget.parser/Widget.g:21:35: ( WS )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==WS) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // /home/randy/Projects/widget.parser/Widget.g:21:36: WS
                                    {
                                    WS16=(Token)match(input,WS,FOLLOW_WS_in_widget91); 
                                    WS16_tree = (Object)adaptor.create(WS16);
                                    adaptor.addChild(root_0, WS16_tree);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal17=(Token)match(input,12,FOLLOW_12_in_widget97); 
                    char_literal17_tree = (Object)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);

                    pushFollow(FOLLOW_content_in_widget99);
                    content18=content();

                    state._fsp--;

                    adaptor.addChild(root_0, content18.getTree());
                    string_literal19=(Token)match(input,13,FOLLOW_13_in_widget101); 
                    string_literal19_tree = (Object)adaptor.create(string_literal19);
                    adaptor.addChild(root_0, string_literal19_tree);


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
    // $ANTLR end "widget"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /home/randy/Projects/widget.parser/Widget.g:24:1: arguments : '{' ( WS )? ( ( ',' )? ( WS )? arg )* ( WS )? '}' ;
    public final WidgetParser.arguments_return arguments() throws RecognitionException {
        WidgetParser.arguments_return retval = new WidgetParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        Token WS21=null;
        Token char_literal22=null;
        Token WS23=null;
        Token WS25=null;
        Token char_literal26=null;
        WidgetParser.arg_return arg24 = null;


        Object char_literal20_tree=null;
        Object WS21_tree=null;
        Object char_literal22_tree=null;
        Object WS23_tree=null;
        Object WS25_tree=null;
        Object char_literal26_tree=null;

        try {
            // /home/randy/Projects/widget.parser/Widget.g:24:10: ( '{' ( WS )? ( ( ',' )? ( WS )? arg )* ( WS )? '}' )
            // /home/randy/Projects/widget.parser/Widget.g:25:2: '{' ( WS )? ( ( ',' )? ( WS )? arg )* ( WS )? '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal20=(Token)match(input,14,FOLLOW_14_in_arguments111); 
            char_literal20_tree = (Object)adaptor.create(char_literal20);
            adaptor.addChild(root_0, char_literal20_tree);

            // /home/randy/Projects/widget.parser/Widget.g:25:6: ( WS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==WS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/randy/Projects/widget.parser/Widget.g:25:7: WS
                    {
                    WS21=(Token)match(input,WS,FOLLOW_WS_in_arguments114); 
                    WS21_tree = (Object)adaptor.create(WS21);
                    adaptor.addChild(root_0, WS21_tree);


                    }
                    break;

            }

            // /home/randy/Projects/widget.parser/Widget.g:25:12: ( ( ',' )? ( WS )? arg )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==ID) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==ID||LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/randy/Projects/widget.parser/Widget.g:25:13: ( ',' )? ( WS )? arg
            	    {
            	    // /home/randy/Projects/widget.parser/Widget.g:25:13: ( ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==15) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /home/randy/Projects/widget.parser/Widget.g:25:14: ','
            	            {
            	            char_literal22=(Token)match(input,15,FOLLOW_15_in_arguments120); 
            	            char_literal22_tree = (Object)adaptor.create(char_literal22);
            	            adaptor.addChild(root_0, char_literal22_tree);


            	            }
            	            break;

            	    }

            	    // /home/randy/Projects/widget.parser/Widget.g:25:20: ( WS )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==WS) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /home/randy/Projects/widget.parser/Widget.g:25:21: WS
            	            {
            	            WS23=(Token)match(input,WS,FOLLOW_WS_in_arguments125); 
            	            WS23_tree = (Object)adaptor.create(WS23);
            	            adaptor.addChild(root_0, WS23_tree);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arg_in_arguments129);
            	    arg24=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg24.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // /home/randy/Projects/widget.parser/Widget.g:25:33: ( WS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==WS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/randy/Projects/widget.parser/Widget.g:25:34: WS
                    {
                    WS25=(Token)match(input,WS,FOLLOW_WS_in_arguments135); 
                    WS25_tree = (Object)adaptor.create(WS25);
                    adaptor.addChild(root_0, WS25_tree);


                    }
                    break;

            }

            char_literal26=(Token)match(input,16,FOLLOW_16_in_arguments139); 
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);


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
    // /home/randy/Projects/widget.parser/Widget.g:28:1: arg : ID ':' ( WS )? value ;
    public final WidgetParser.arg_return arg() throws RecognitionException {
        WidgetParser.arg_return retval = new WidgetParser.arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID27=null;
        Token char_literal28=null;
        Token WS29=null;
        WidgetParser.value_return value30 = null;


        Object ID27_tree=null;
        Object char_literal28_tree=null;
        Object WS29_tree=null;

        try {
            // /home/randy/Projects/widget.parser/Widget.g:28:4: ( ID ':' ( WS )? value )
            // /home/randy/Projects/widget.parser/Widget.g:29:2: ID ':' ( WS )? value
            {
            root_0 = (Object)adaptor.nil();

            ID27=(Token)match(input,ID,FOLLOW_ID_in_arg149); 
            ID27_tree = (Object)adaptor.create(ID27);
            adaptor.addChild(root_0, ID27_tree);

            char_literal28=(Token)match(input,10,FOLLOW_10_in_arg151); 
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);

            // /home/randy/Projects/widget.parser/Widget.g:29:9: ( WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/randy/Projects/widget.parser/Widget.g:29:10: WS
                    {
                    WS29=(Token)match(input,WS,FOLLOW_WS_in_arg154); 
                    WS29_tree = (Object)adaptor.create(WS29);
                    adaptor.addChild(root_0, WS29_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_value_in_arg158);
            value30=value();

            state._fsp--;

            adaptor.addChild(root_0, value30.getTree());

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
    // /home/randy/Projects/widget.parser/Widget.g:32:1: value : ( STRING | INT | FLOAT | ( 'true' | 'false' ) );
    public final WidgetParser.value_return value() throws RecognitionException {
        WidgetParser.value_return retval = new WidgetParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            // /home/randy/Projects/widget.parser/Widget.g:32:6: ( STRING | INT | FLOAT | ( 'true' | 'false' ) )
            // /home/randy/Projects/widget.parser/Widget.g:
            {
            root_0 = (Object)adaptor.nil();

            set31=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING && input.LA(1)<=FLOAT)||(input.LA(1)>=17 && input.LA(1)<=18) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set31));
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
    // /home/randy/Projects/widget.parser/Widget.g:39:1: content : ( widget | ( . )* );
    public final WidgetParser.content_return content() throws RecognitionException {
        WidgetParser.content_return retval = new WidgetParser.content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token wildcard33=null;
        WidgetParser.widget_return widget32 = null;


        Object wildcard33_tree=null;

        try {
            // /home/randy/Projects/widget.parser/Widget.g:39:8: ( widget | ( . )* )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /home/randy/Projects/widget.parser/Widget.g:40:2: widget
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_widget_in_content199);
                    widget32=widget();

                    state._fsp--;

                    adaptor.addChild(root_0, widget32.getTree());

                    }
                    break;
                case 2 :
                    // /home/randy/Projects/widget.parser/Widget.g:41:4: ( . )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/randy/Projects/widget.parser/Widget.g:41:4: ( . )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=2;
                        }
                        else if ( ((LA14_0>=ID && LA14_0<=12)||(LA14_0>=14 && LA14_0<=18)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/randy/Projects/widget.parser/Widget.g:41:4: .
                    	    {
                    	    wildcard33=(Token)input.LT(1);
                    	    matchAny(input); 
                    	    wildcard33_tree = (Object)adaptor.create(wildcard33);
                    	    adaptor.addChild(root_0, wildcard33_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


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
    // $ANTLR end "content"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA7_eotS =
        "\23\uffff";
    static final String DFA7_eofS =
        "\23\uffff";
    static final String DFA7_minS =
        "\1\11\1\4\1\12\1\4\1\5\1\13\1\4\2\uffff\2\4\1\12\1\5\2\4\1\5\1\13"+
        "\1\6\1\4";
    static final String DFA7_maxS =
        "\1\11\1\4\1\12\1\4\2\16\1\20\2\uffff\1\20\1\5\1\12\1\14\1\20\1\4"+
        "\1\22\1\14\1\22\1\20";
    static final String DFA7_acceptS =
        "\7\uffff\1\1\1\2\12\uffff";
    static final String DFA7_specialS =
        "\23\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\5\uffff\1\7\1\10\1\uffff\1\6",
            "\1\7\1\10\1\uffff\1\6",
            "\1\13\1\11\11\uffff\1\12\1\14",
            "",
            "",
            "\1\13\1\15\11\uffff\1\12\1\14",
            "\1\13\1\16",
            "\1\17",
            "\1\20\5\uffff\1\7\1\10",
            "\1\13\13\uffff\1\14",
            "\1\13",
            "\1\21\3\22\10\uffff\2\22",
            "\1\7\1\10",
            "\3\22\10\uffff\2\22",
            "\1\13\1\15\11\uffff\1\12\1\14"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "19:1: widget : ( '[' ID ':' ID ( WS )? ( arguments ( WS )? )? '/]' | '[' ID ':' ID ( WS )? ( arguments ( WS )? )? ']' content '[/]' );";
        }
    }
    static final String DFA15_eotS =
        "\24\uffff";
    static final String DFA15_eofS =
        "\24\uffff";
    static final String DFA15_minS =
        "\2\4\1\uffff\5\4\2\uffff\12\4";
    static final String DFA15_maxS =
        "\2\22\1\uffff\5\22\2\uffff\12\22";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\5\uffff\2\1\12\uffff";
    static final String DFA15_specialS =
        "\24\uffff}>";
    static final String[] DFA15_transitionS = {
            "\5\2\1\1\11\2",
            "\1\3\16\2",
            "",
            "\6\2\1\4\10\2",
            "\1\5\16\2",
            "\1\2\1\6\5\2\1\10\1\11\1\2\1\7\4\2",
            "\7\2\1\10\1\11\1\2\1\7\4\2",
            "\1\14\1\12\11\2\1\13\1\15\2\2",
            "",
            "",
            "\1\14\1\16\11\2\1\13\1\15\2\2",
            "\1\14\1\17\15\2",
            "\6\2\1\20\10\2",
            "\1\2\1\21\5\2\1\10\1\11\6\2",
            "\1\14\13\2\1\15\2\2",
            "\1\14\16\2",
            "\1\2\1\22\3\23\10\2\2\23",
            "\7\2\1\10\1\11\6\2",
            "\2\2\3\23\10\2\2\23",
            "\1\14\1\16\11\2\1\13\1\15\2\2"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "39:1: content : ( widget | ( . )* );";
        }
    }
 

    public static final BitSet FOLLOW_widget_in_document36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_widget46 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_widget48 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_widget50 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_widget52 = new BitSet(new long[]{0x0000000000004820L});
    public static final BitSet FOLLOW_WS_in_widget55 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_arguments_in_widget60 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_WS_in_widget63 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_widget69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_widget74 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_widget76 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_widget78 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_widget80 = new BitSet(new long[]{0x0000000000005020L});
    public static final BitSet FOLLOW_WS_in_widget83 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_arguments_in_widget88 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_WS_in_widget91 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_widget97 = new BitSet(new long[]{0x000000000007FFF0L});
    public static final BitSet FOLLOW_content_in_widget99 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_widget101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_arguments111 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_WS_in_arguments114 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_15_in_arguments120 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_WS_in_arguments125 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_arg_in_arguments129 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_WS_in_arguments135 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_arguments139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arg149 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arg151 = new BitSet(new long[]{0x00000000000601E0L});
    public static final BitSet FOLLOW_WS_in_arg154 = new BitSet(new long[]{0x00000000000601E0L});
    public static final BitSet FOLLOW_value_in_arg158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_widget_in_content199 = new BitSet(new long[]{0x0000000000000002L});

}