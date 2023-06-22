/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2020 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.util.validation.feature;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import net.sf.jsqlparser.parser.feature.Feature;

/**
 * Please add Features supported and place a link to public documentation
 *
 * @author gitmotte
 * @see <a href=
 *      "http://www.h2database.com/html/commands.html">http://www.h2database.com/html/commands.html</a>
 */
public enum H2Version implements Version {

    V_1_4_200("1.4.200", // supported if used with jdbc
    EnumSet.// supported if used with jdbc
    of(// expressions
    Feature.jdbcParameter, // expressions
    Feature.jdbcNamedParameter, // http://h2database.com/html/commands.html#select
    Feature.exprLike, // https://h2database.com/html/grammar.html?#table_expression
    Feature.select, // https://h2database.com/html/grammar.html?#table_expression
    Feature.selectGroupBy, // https://h2database.com/html/grammar.html?#table_expression
    Feature.function, // https://h2database.com/html/grammar.html?#table_expression
    Feature.selectHaving, // https://h2database.com/html/grammar.html?#join_specification
    // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.join, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinSimple, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinRight, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinFull, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinLeft, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinCross, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinOuter, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinInner, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinNatural, // http://www.h2database.com/html/commands.html?highlight=ORDER%20BY&search=SELECT#firstFound
    Feature.joinUsingColumns, // http://www.h2database.com/html/grammar.html#order
    // http://www.h2database.com/html/commands.html?highlight=select&search=SELECT#with
    Feature.orderBy, // http://www.h2database.com/html/commands.html?highlight=select&search=SELECT#with
    Feature.orderByNullOrdering, // http://h2database.com/html/commands.html#comment
    Feature.withItem, // http://h2database.com/html/commands.html#comment
    Feature.withItemRecursive, // http://h2database.com/html/functions.html#table
    Feature.comment, // http://h2database.com/html/functions.html#table
    Feature.commentOnTable, // http://h2database.com/html/functions.html#table
    Feature.commentOnColumn, // http://h2database.com/html/functions.html#table
    Feature.commentOnView, // http://h2database.com/html/commands.html#select
    Feature.tableFunction, // http://h2database.com/html/commands.html#create_sequence
    Feature.setOperation, // http://h2database.com/html/commands.html#create_sequence
    Feature.setOperationUnion, // http://h2database.com/html/commands.html#create_sequence
    Feature.setOperationIntersect, // http://h2database.com/html/commands.html#create_sequence
    Feature.setOperationExcept, // http://h2database.com/html/commands.html#create_sequence
    Feature.setOperationMinus, // http://h2database.com/html/commands.html#alter_sequence
    Feature.createSequence, // http://h2database.com/html/commands.html#create_schema
    Feature.alterSequence, // http://h2database.com/html/commands.html#create_index
    Feature.createSchema, // http://h2database.com/html/commands.html#create_table
    Feature.createIndex, // http://h2database.com/html/commands.html#create_view
    Feature.createTable, // http://h2database.com/html/commands.html#create_view
    Feature.createTableCreateOptionStrings, // http://h2database.com/html/commands.html#create_view
    Feature.createTableTableOptionStrings, // http://h2database.com/html/commands.html#create_view
    Feature.createTableFromSelect, // http://h2database.com/html/commands.html#create_view
    Feature.createTableIfNotExists, // http://h2database.com/html/commands.html#alter_view_rename
    Feature.createView, // http://h2database.com/html/commands.html#alter_view_rename
    Feature.createViewForce, // http://h2database.com/html/commands.html#alter_view_rename
    Feature.createOrReplaceView, // Feature.alterView,
    // http://www.h2database.com/html/advanced.html?search=limit#result_sets
    Feature.top, // http://www.h2database.com/html/commands.html?highlight=DISTINCT&search=SELECT#firstFound
    Feature.fetch, // http://www.h2database.com/html/commands.html?highlight=DISTINCT&search=SELECT#firstFound
    Feature.fetchFirst, // http://www.h2database.com/html/commands.html?highlight=DISTINCT%20ON&search=SELECT#firstFound
    Feature.distinct, // http://h2database.com/html/commands.html#insert
    Feature.distinctOn, // http://h2database.com/html/commands.html#update
    Feature.insert, // http://h2database.com/html/commands.html#update
    Feature.insertValues, // http://h2database.com/html/commands.html#update
    Feature.values, // http://h2database.com/html/commands.html#update
    Feature.insertFromSelect, // http://h2database.com/html/commands.html#delete
    Feature.update, // http://h2database.com/html/commands.html#truncate_table
    Feature.delete, // http://www.h2database.com/html/commands.html#execute_immediate
    Feature.truncate, // http://h2database.com/html/commands.html#drop_table
    Feature.executeStatementImmediate, // http://h2database.com/html/commands.html#drop_table
    Feature.drop, // http://h2database.com/html/commands.html#drop_index
    Feature.dropTable, // http://h2database.com/html/commands.html#drop_view
    Feature.dropIndex, // http://h2database.com/html/commands.html#drop_schema
    Feature.dropView, // http://h2database.com/html/commands.html#drop_sequence
    Feature.dropSchema, // http://h2database.com/html/commands.html#alter_table_add
    Feature.dropSequence, // http://h2database.com/html/commands.html#alter_table_add
    Feature.dropTableIfExists, // http://h2database.com/html/commands.html#alter_table_add
    Feature.dropIndexIfExists, // http://h2database.com/html/commands.html#alter_table_add
    Feature.dropViewIfExists, // http://h2database.com/html/commands.html#alter_table_add
    Feature.dropSchemaIfExists, // http://h2database.com/html/commands.html#alter_table_add
    Feature.dropSequenceIfExists, // http://h2database.com/html/commands.html#alter_table_add_constraint
    // ...
    // http://www.h2database.com/html/commands.html#explain
    Feature.alterTable, // http://www.h2database.com/html/commands.html#grant_right
    Feature.explain, // http://www.h2database.com/html/commands.html#grant_role
    // http://h2database.com/html/commands.html#commit
    Feature.grant, Feature.commit));

    private Set<Feature> features;

    private String versionString;

    /**
     * @param versionString
     * @param featuresSupported
     * @see #copy() to copy from previous version
     */
    H2Version(String versionString, Set<Feature> featuresSupported) {
        this(versionString, featuresSupported, Collections.emptySet());
    }

    /**
     * @param versionString
     * @param featuresSupported
     * @param unsupported
     * @see #copy() to copy from previous version
     */
    H2Version(String versionString, Set<Feature> featuresSupported, Set<Feature> unsupported) {
        this.versionString = versionString;
        this.features = featuresSupported;
        this.features.removeAll(unsupported);
    }

    @Override
    public String getVersionString() {
        return versionString;
    }

    @Override
    public Set<Feature> getFeatures() {
        return features;
    }

    @Override
    public String getName() {
        return DatabaseType.H2.getName() + " " + getVersionString();
    }
}
