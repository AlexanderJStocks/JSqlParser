/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.expression;

public enum AnyType {

    ANY, SOME, ALL;

    public static AnyType from(String type) {
        return Enum.valueOf(AnyType.class, type.toUpperCase());
    }
}
