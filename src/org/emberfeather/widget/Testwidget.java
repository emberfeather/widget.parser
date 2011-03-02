package org.emberfeather.widget;

import org.antlr.gunit.gUnitBaseTest;

public class Testwidget extends gUnitBaseTest {
	
	public void setUp() {
		this.packagePath = "./org/emberfeather/widget";
		this.lexerPath = "org.emberfeather.widget.widgetLexer";
		this.parserPath = "org.emberfeather.widget.widgetParser";
	}

	public void testWidget1() throws Exception {
		// gunit test on line 10
		Object retval = execParser("widget", 10, "[plugin:func/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : func /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget2() throws Exception {
		// gunit test on line 13
		Object retval = execParser("widget", 13, "[plugin:widget /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget3() throws Exception {
		// gunit test on line 16
		Object retval = execParser("widget", 16, "[plugin:widget { test: 'ok' } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 'ok' } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget4() throws Exception {
		// gunit test on line 22
		Object retval = execParser("widget", 22, "[plugin:widget { test: 42 } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 42 } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget5() throws Exception {
		// gunit test on line 25
		Object retval = execParser("widget", 25, "[plugin:widget { test: 24.42 } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 24.42 } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget6() throws Exception {
		// gunit test on line 28
		Object retval = execParser("widget", 28, "[plugin:widget { test: false } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : false } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget7() throws Exception {
		// gunit test on line 31
		Object retval = execParser("widget", 31, "[plugin:widget { test: true } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget8() throws Exception {
		// gunit test on line 34
		Object retval = execParser("widget", 34, "[plugin:widget]testing[/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget ] testing [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget9() throws Exception {
		// gunit test on line 37
		Object retval = execParser("widget", 37, "[plugin:widget { test: true }]testing[/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } ] testing [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget10() throws Exception {
		// gunit test on line 40
		Object retval = execParser("widget", 40, "[plugin:widget { test: true }][plugin:widget/][/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } ] [ plugin : widget /] [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}



}