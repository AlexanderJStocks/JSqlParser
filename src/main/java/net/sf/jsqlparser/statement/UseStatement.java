/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.statement;

public class UseStatement implements Statement {

    private String name;

    private boolean schemaKeyword;

    public UseStatement() {
        // empty constructor
    }

    public UseStatement(String name) {
        this.name = name;
    }

    public UseStatement(String name, boolean hasSchemaKeyword) {
        this.name = name;
        this.schemaKeyword = hasSchemaKeyword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasSchemaKeyword() {
        return schemaKeyword;
    }

    public void setSchemaKeyword(boolean schemaKeyword) {
        this.schemaKeyword = schemaKeyword;
    }

    @Override
    public String toString() {
        return "USE " + (schemaKeyword ? "SCHEMA " : "") + name;
    }

    @Override
    public void accept(StatementVisitor statementVisitor) {
        statementVisitor.visit(this);
    }

    public UseStatement withName(String name) {
        this.setName(name);
        return this;
    }
}
