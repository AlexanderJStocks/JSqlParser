/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.statement.select;

import net.sf.jsqlparser.schema.Table;

@SuppressWarnings({ "PMD.UncommentedEmptyMethodBody" })
public class FromItemVisitorAdapter implements FromItemVisitor {

    @Override
    public void visit(Table table) {
    }

    @Override
    public void visit(ParenthesedSelect selectBody) {
    }

    @Override
    public void visit(LateralSubSelect lateralSubSelect) {
    }

    @Override
    public void visit(TableFunction valuesList) {
    }

    @Override
    public void visit(ParenthesedFromItem aThis) {
    }
}
