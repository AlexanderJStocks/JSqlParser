/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.statement.create.view;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.StatementVisitor;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AlterView implements Statement {

    private Table view;

    private Select select;

    private boolean useReplace = false;

    private List<String> columnNames = null;

    @Override
    public void accept(StatementVisitor statementVisitor) {
        statementVisitor.visit(this);
    }

    public Table getView() {
        return view;
    }

    public void setView(Table view) {
        this.view = view;
    }

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    public boolean isUseReplace() {
        return useReplace;
    }

    public void setUseReplace(boolean useReplace) {
        this.useReplace = useReplace;
    }

    @Override
    public String toString() {
        StringBuilder sql;
        if (useReplace) {
            sql = new StringBuilder("REPLACE ");
        } else {
            sql = new StringBuilder("ALTER ");
        }
        sql.append("VIEW ");
        sql.append(view);
        if (columnNames != null) {
            sql.append(PlainSelect.getStringList(columnNames, true, true));
        }
        sql.append(" AS ").append(select);
        return sql.toString();
    }

    public AlterView withView(Table view) {
        this.setView(view);
        return this;
    }

    public AlterView withSelect(Select select) {
        this.setSelect(select);
        return this;
    }

    public AlterView withUseReplace(boolean useReplace) {
        this.setUseReplace(useReplace);
        return this;
    }

    public AlterView withColumnNames(List<String> columnNames) {
        this.setColumnNames(columnNames);
        return this;
    }

    public AlterView addColumnNames(String... columnNames) {
        List<String> collection = Optional.ofNullable(getColumnNames()).orElseGet(ArrayList::new);
        Collections.addAll(collection, columnNames);
        return this.withColumnNames(collection);
    }

    public AlterView addColumnNames(Collection<String> columnNames) {
        List<String> collection = Optional.ofNullable(getColumnNames()).orElseGet(ArrayList::new);
        collection.addAll(columnNames);
        return this.withColumnNames(collection);
    }

    public <E extends Select> E getSelectBody(Class<E> type) {
        return type.cast(getSelect());
    }
}
