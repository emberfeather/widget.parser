package org.emberfeather.widget;

import org.antlr.gunit.gUnitBaseTest;

public class Testwidget extends gUnitBaseTest {
	
	public void setUp() {
		this.packagePath = "./org/emberfeather/widget";
		this.lexerPath = "org.emberfeather.widget.widgetLexer";
		this.parserPath = "org.emberfeather.widget.widgetParser";
	}

	public void testWidget1() throws Exception {
		// test input: "[plugin:func/]"
		Object retval = execParser("widget", "[plugin:func/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : func /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget2() throws Exception {
		// test input: "[plugin:widget /]"
		Object retval = execParser("widget", "[plugin:widget /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget3() throws Exception {
		// test input: "[plugin:widget { test: 'ok' } /]"
		Object retval = execParser("widget", "[plugin:widget { test: 'ok' } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 'ok' } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget4() throws Exception {
		// test input: "[plugin:widget { test: \"ok\" } /]"
		Object retval = execParser("widget", "[plugin:widget { test: \"ok\" } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : \"ok\" } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget5() throws Exception {
		// test input: "[plugin:widget { test: 42 } /]"
		Object retval = execParser("widget", "[plugin:widget { test: 42 } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 42 } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget6() throws Exception {
		// test input: "[plugin:widget { test: 24.42 } /]"
		Object retval = execParser("widget", "[plugin:widget { test: 24.42 } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : 24.42 } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget7() throws Exception {
		// test input: "[plugin:widget { test: false } /]"
		Object retval = execParser("widget", "[plugin:widget { test: false } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : false } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget8() throws Exception {
		// test input: "[plugin:widget { test: true } /]"
		Object retval = execParser("widget", "[plugin:widget { test: true } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } /]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget9() throws Exception {
		// test input: "[plugin:widget]testing[/]"
		Object retval = execParser("widget", "[plugin:widget]testing[/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget ] testing [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget10() throws Exception {
		// test input: "[plugin:widget { test: true }]testing[/]"
		Object retval = execParser("widget", "[plugin:widget { test: true }]testing[/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } ] testing [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget11() throws Exception {
		// test input: "[plugin:widget { test: true }][plugin:widget/][/]"
		Object retval = execParser("widget", "[plugin:widget { test: true }][plugin:widget/][/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "[ plugin : widget { test : true } ] [ plugin : widget /] [/]";

		assertEquals("testing rule "+"widget", expecting, actual);
	}



}