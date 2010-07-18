package org.emberfeather.widget;

import org.antlr.gunit.gUnitBaseTest;

public class Testwidget extends gUnitBaseTest {
	
	public void setUp() {
		this.packagePath = "./org/emberfeather/widget";
		this.lexerPath = "org.emberfeather.widget.widgetLexer";
		this.parserPath = "org.emberfeather.widget.widgetParser";
	}

	public void testWidget1() throws Exception {
		// test input: "[plugin:widget/]"
		Object retval = execParser("widget", "[plugin:widget/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget2() throws Exception {
		// test input: "[plugin:widget /]"
		Object retval = execParser("widget", "[plugin:widget /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget3() throws Exception {
		// test input: "[plugin:widget { test: 'ok' } /]"
		Object retval = execParser("widget", "[plugin:widget { test: 'ok' } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget4() throws Exception {
		// test input: "[plugin:widget { test: \"ok\" } /]"
		Object retval = execParser("widget", "[plugin:widget { test: \"ok\" } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget5() throws Exception {
		// test input: "[plugin:widget { test: 42 } /]"
		Object retval = execParser("widget", "[plugin:widget { test: 42 } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget6() throws Exception {
		// test input: "[plugin:widget { test: 24.42 } /]"
		Object retval = execParser("widget", "[plugin:widget { test: 24.42 } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget7() throws Exception {
		// test input: "[plugin:widget { test: false } /]"
		Object retval = execParser("widget", "[plugin:widget { test: false } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget8() throws Exception {
		// test input: "[plugin:widget { test: true } /]"
		Object retval = execParser("widget", "[plugin:widget { test: true } /]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget9() throws Exception {
		// test input: "[plugin:widget]content[/]"
		Object retval = execParser("widget", "[plugin:widget]content[/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}

	public void testWidget10() throws Exception {
		// test input: "[plugin:widget { test: true }]content[/]"
		Object retval = execParser("widget", "[plugin:widget { test: true }]content[/]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"widget", expecting, actual);
	}



}