/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.statement.execute;

import net.sf.jsqlparser.JSQLParserException;
import static net.sf.jsqlparser.test.TestUtils.*;
import org.junit.jupiter.api.Test;

/**
 * @author toben
 */
public class ExecuteTest {

    @Test
    public void testAcceptExecute() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("EXECUTE myproc 'a', 2, 'b'");
    }

    @Test
    public void testAcceptExec() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("EXEC myproc 'a', 2, 'b'");
    }

    @Test
    public void testAcceptCall() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("CALL myproc 'a', 2, 'b'");
    }

    @Test
    public void testCallWithMultiname() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("CALL BAR.FOO");
    }

    @Test
    public void testAcceptCallWithParenthesis() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("CALL myproc ('a', 2, 'b')");
    }

    @Test
    public void testAcceptExecNamesParameters() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("EXEC procedure @param");
    }

    @Test
    public void testAcceptExecNamesParameters2() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("EXEC procedure @param = 1");
    }

    @Test
    public void testAcceptExecNamesParameters3() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("EXEC procedure @param = 'foo'");
    }

    @Test
    public void testAcceptExecNamesParameters4() throws JSQLParserException {
        assertSqlCanBeParsedAndDeparsed("EXEC procedure @param = 'foo', @param2 = 'foo2'");
    }
}
