package org.emberfeather.widget;

import org.antlr.gunit.gUnitBaseTest;

public class TestWidget extends gUnitBaseTest {
	
	public void setUp() {
		this.packagePath = "./org/emberfeather/widget";
		this.lexerPath = "org.emberfeather.widget.WidgetLexer";
		this.parserPath = "org.emberfeather.widget.WidgetParser";
	}

	public void testWidget1() throws Exception {
		// gunit test on line 9
		Object retval = execParser("widget", 9, "[plugin:func/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : func /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget2() throws Exception {
		// gunit test on line 12
		Object retval = execParser("widget", 12, "[plugin:widget /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget3() throws Exception {
		// gunit test on line 15
		Object retval = execParser("widget", 15, "[plugin:widget { test: 'ok' } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 'ok' } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget4() throws Exception {
		// gunit test on line 21
		Object retval = execParser("widget", 21, "[plugin:widget { test: 42 } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 42 } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget5() throws Exception {
		// gunit test on line 24
		Object retval = execParser("widget", 24, "[plugin:widget { test: 24.42 } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 24.42 } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget6() throws Exception {
		// gunit test on line 27
		Object retval = execParser("widget", 27, "[plugin:widget { test: false } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : false } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget7() throws Exception {
		// gunit test on line 30
		Object retval = execParser("widget", 30, "[plugin:widget { test: true } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget8() throws Exception {
		// gunit test on line 33
		Object retval = execParser("widget", 33, "[plugin:widget]testing[/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget ] testing [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget9() throws Exception {
		// gunit test on line 36
		Object retval = execParser("widget", 36, "[plugin:widget { test: true }]testing[/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } ] testing [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget10() throws Exception {
		// gunit test on line 39
		Object retval = execParser("widget", 39, "[plugin:widget { test: true }][plugin:widget/][/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } ] [ plugin : widget /] [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}



}