/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2020 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.util.validation.validator;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import net.sf.jsqlparser.parser.feature.Feature;
import net.sf.jsqlparser.util.validation.ValidationTestAsserts;
import net.sf.jsqlparser.util.validation.feature.DatabaseType;
import net.sf.jsqlparser.util.validation.feature.FeaturesAllowed;

/**
 * @author Jayant Kumar Yadav
 */
public class ShowIndexStatementValidatorTest extends ValidationTestAsserts {

    @Test
    public void testValidationShowIndex() throws Exception {
        for (String sql : Arrays.asList("SHOW INDEX FROM mydatabase")) {
            validateNoErrors(sql, 1, DatabaseType.MARIADB, DatabaseType.MYSQL);
        }
    }

    @Test
    public void testValidationShowIndexNotAllowed() throws Exception {
        for (String sql : Arrays.asList("SHOW INDEX FROM mydatabase")) {
            validateNotAllowed(sql, 1, 1, FeaturesAllowed.DML, Feature.showIndex);
        }
    }
}
