/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.expression.operators.relational;

import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.ExpressionVisitor;

public class LikeExpression extends BinaryExpression {

    public enum KeyWord {

        LIKE, ILIKE, RLIKE, REGEXP;

        public static KeyWord from(String keyword) {
            return Enum.valueOf(KeyWord.class, keyword.toUpperCase());
        }
    }

    private boolean not = false;

    private boolean useBinary = false;

    private Expression escapeExpression = null;

    private KeyWord likeKeyWord = KeyWord.LIKE;

    public boolean isNot() {
        return not;
    }

    public void setNot(boolean b) {
        not = b;
    }

    public boolean isUseBinary() {
        return useBinary;
    }

    public LikeExpression setUseBinary(boolean useBinary) {
        this.useBinary = useBinary;
        return this;
    }

    @Override
    public void accept(ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Deprecated
    @Override
    public String getStringExpression() {
        return likeKeyWord.toString();
    }

    @Override
    public String toString() {
        String retval = getLeftExpression() + " " + (not ? "NOT " : "") + likeKeyWord + " " + (useBinary ? "BINARY " : "") + getRightExpression();
        if (escapeExpression != null) {
            retval += " ESCAPE " + escapeExpression;
        }
        return retval;
    }

    public Expression getEscape() {
        return escapeExpression;
    }

    public void setEscape(Expression escapeExpression) {
        this.escapeExpression = escapeExpression;
    }

    @Deprecated
    public boolean isCaseInsensitive() {
        return likeKeyWord == KeyWord.ILIKE;
    }

    @Deprecated
    public void setCaseInsensitive(boolean caseInsensitive) {
        this.likeKeyWord = KeyWord.ILIKE;
    }

    public KeyWord getLikeKeyWord() {
        return likeKeyWord;
    }

    public LikeExpression setLikeKeyWord(KeyWord likeKeyWord) {
        this.likeKeyWord = likeKeyWord;
        return this;
    }

    public LikeExpression setLikeKeyWord(String likeKeyWord) {
        this.likeKeyWord = KeyWord.from(likeKeyWord);
        return this;
    }

    public LikeExpression withEscape(Expression escape) {
        this.setEscape(escape);
        return this;
    }

    @Deprecated
    public LikeExpression withCaseInsensitive(boolean caseInsensitive) {
        this.setCaseInsensitive(caseInsensitive);
        return this;
    }

    public LikeExpression withNot(boolean not) {
        this.setNot(not);
        return this;
    }

    @Override
    public LikeExpression withLeftExpression(Expression arg0) {
        return (LikeExpression) super.withLeftExpression(arg0);
    }

    @Override
    public LikeExpression withRightExpression(Expression arg0) {
        return (LikeExpression) super.withRightExpression(arg0);
    }
}
