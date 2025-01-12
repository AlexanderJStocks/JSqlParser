/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.statement.delete;

public enum DeleteModifierPriority {

    LOW_PRIORITY;

    public static DeleteModifierPriority from(String priority) {
        return Enum.valueOf(DeleteModifierPriority.class, priority.toUpperCase());
    }
}
