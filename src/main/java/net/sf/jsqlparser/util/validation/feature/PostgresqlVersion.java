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
 *      "https://www.postgresql.org/docs/current">https://www.postgresql.org/docs/current</a>
 */
public enum PostgresqlVersion implements Version {

    V10("10", // supported if used with jdbc
    EnumSet.// supported if used with jdbc
    of(// expressions
    Feature.jdbcParameter, // expressions
    Feature.jdbcNamedParameter, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.exprLike, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.exprSimilarTo, // https://www.postgresql.org/docs/current/queries-table-expressions.html#QUERIES-GROUPING-SETS
    Feature.select, // https://www.postgresql.org/docs/current/queries-table-expressions.html#QUERIES-GROUPING-SETS
    Feature.selectGroupBy, // https://www.postgresql.org/docs/current/queries-table-expressions.html#QUERIES-GROUPING-SETS
    Feature.function, // https://www.postgresql.org/docs/current/queries-table-expressions.html#QUERIES-GROUPING-SETS
    Feature.tableFunction, // https://www.postgresql.org/docs/current/queries-table-expressions.html#QUERIES-GROUPING-SETS
    Feature.lateralSubSelect, // https://www.postgresql.org/docs/current/queries-table-expressions.html#QUERIES-GROUPING-SETS
    Feature.selectHaving, // https://www.postgresql.org/docs/current/sql-select.html#join_type
    Feature.selectGroupByGroupingSets, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.join, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.joinSimple, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.joinRight, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.joinFull, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.joinLeft, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.joinCross, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.joinOuter, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.joinInner, // https://www.postgresql.org/docs/current/queries-with.html
    Feature.joinUsingColumns, // https://www.postgresql.org/docs/current/queries-limit.html
    Feature.withItem, // https://www.postgresql.org/docs/current/queries-limit.html
    Feature.withItemRecursive, // https://www.postgresql.org/docs/current/sql-select.html#SQL-LIMIT
    //
    Feature.limit, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.limitAll, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.limitNull, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.offset, //
    Feature.fetch, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.fetchFirst, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.fetchNext, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.distinct, // https://www.postgresql.org/docs/current/sql-select.html
    Feature.distinctOn, // https://www.postgresql.org/docs/current/queries-union.html
    Feature.orderBy, // https://www.postgresql.org/docs/current/queries-union.html
    Feature.orderByNullOrdering, // https://www.postgresql.org/docs/current/queries-union.html
    Feature.selectForUpdate, // https://www.postgresql.org/docs/current/queries-union.html
    Feature.selectForUpdateOfTable, // https://www.postgresql.org/docs/current/queries-union.html
    Feature.selectForUpdateNoWait, // https://www.postgresql.org/docs/current/queries-union.html
    Feature.selectForUpdateSkipLocked, // https://www.postgresql.org/docs/current/sql-comment.html
    Feature.setOperation, // https://www.postgresql.org/docs/current/sql-comment.html
    Feature.setOperationUnion, // https://www.postgresql.org/docs/current/sql-comment.html
    Feature.setOperationIntersect, // https://www.postgresql.org/docs/current/sql-comment.html
    Feature.setOperationExcept, // https://www.postgresql.org/docs/current/sql-createsequence.html
    Feature.comment, // https://www.postgresql.org/docs/current/sql-createsequence.html
    Feature.commentOnTable, // https://www.postgresql.org/docs/current/sql-createsequence.html
    Feature.commentOnColumn, // https://www.postgresql.org/docs/current/sql-createsequence.html
    Feature.commentOnView, // https://www.postgresql.org/docs/current/sql-altersequence.html
    Feature.createSequence, // https://www.postgresql.org/docs/current/sql-createschema.html
    Feature.alterSequence, // https://www.postgresql.org/docs/current/sql-createindex.html
    Feature.createSchema, // https://www.postgresql.org/docs/current/sql-createtable.html
    Feature.createIndex, // https://www.postgresql.org/docs/current/sql-createview.html
    Feature.createTable, // https://www.postgresql.org/docs/current/sql-createview.html
    Feature.createTableUnlogged, // https://www.postgresql.org/docs/current/sql-createview.html
    Feature.createTableCreateOptionStrings, // https://www.postgresql.org/docs/current/sql-createview.html
    Feature.createTableTableOptionStrings, // https://www.postgresql.org/docs/current/sql-createview.html
    Feature.createTableFromSelect, // https://www.postgresql.org/docs/current/sql-createview.html
    Feature.createTableIfNotExists, // https://www.postgresql.org/docs/current/sql-alterview.html
    Feature.createView, // https://www.postgresql.org/docs/current/sql-alterview.html
    Feature.createViewTemporary, // https://www.postgresql.org/docs/current/sql-alterview.html
    Feature.createOrReplaceView, // Feature.alterView,
    // https://www.postgresql.org/docs/current/sql-insert.html
    // https://www.postgresql.org/docs/current/sql-update.html
    Feature.insert, // https://www.postgresql.org/docs/current/sql-update.html
    Feature.insertValues, // https://www.postgresql.org/docs/current/sql-update.html
    Feature.values, // https://www.postgresql.org/docs/current/sql-update.html
    Feature.insertFromSelect, // https://www.postgresql.org/docs/current/sql-update.html
    Feature.insertReturningAll, // https://www.postgresql.org/docs/current/sql-update.html
    Feature.insertReturningExpressionList, // https://www.postgresql.org/docs/current/sql-delete.html
    Feature.update, // https://www.postgresql.org/docs/current/sql-delete.html
    Feature.updateReturning, // https://www.postgresql.org/docs/current/sql-truncate.html
    Feature.delete, // https://www.postgresql.org/docs/current/sql-truncate.html
    Feature.deleteReturningExpressionList, // https://www.postgresql.org/docs/current/sql-call.html
    Feature.truncate, // https://www.postgresql.org/docs/current/sql-droptable.html
    Feature.execute, // https://www.postgresql.org/docs/current/sql-droptable.html
    Feature.executeCall, // https://www.postgresql.org/docs/current/sql-droptable.html
    Feature.drop, // https://www.postgresql.org/docs/current/sql-dropindex.html
    Feature.dropTable, // https://www.postgresql.org/docs/current/sql-dropview.html
    Feature.dropIndex, // https://www.postgresql.org/docs/current/sql-dropschema.html
    Feature.dropView, // https://www.postgresql.org/docs/current/sql-dropsequence.html
    Feature.dropSchema, // https://www.postgresql.org/docs/current/sql-altertable.html
    Feature.dropSequence, // https://www.postgresql.org/docs/current/sql-altertable.html
    Feature.dropTableIfExists, // https://www.postgresql.org/docs/current/sql-altertable.html
    Feature.dropIndexIfExists, // https://www.postgresql.org/docs/current/sql-altertable.html
    Feature.dropViewIfExists, // https://www.postgresql.org/docs/current/sql-altertable.html
    Feature.dropSchemaIfExists, // https://www.postgresql.org/docs/current/sql-altertable.html
    Feature.dropSequenceIfExists, // https://www.postgresql.org/docs/current/using-explain.html
    Feature.alterTable, // https://www.postgresql.org/docs/current/sql-grant.html
    Feature.explain, // https://www.postgresql.org/docs/current/sql-set.html
    Feature.grant, // https://www.postgresql.org/docs/current/sql-reset.html
    Feature.set, // https://www.postgresql.org/docs/current/sql-commit.html
    Feature.reset, Feature.commit)), V11("11", V10.copy().getFeatures()), V12("12", V11.copy().getFeatures()), V13("13", V12.copy().getFeatures()), V14("14", V13.copy().getFeatures());

    private Set<Feature> features;

    private String versionString;

    /**
     * @param versionString
     * @param featuresSupported
     * @see #copy() to copy from previous version
     */
    PostgresqlVersion(String versionString, Set<Feature> featuresSupported) {
        this(versionString, featuresSupported, Collections.emptySet());
    }

    /**
     * @param versionString
     * @param featuresSupported
     * @param unsupported
     * @see #copy() to copy from previous version
     */
    PostgresqlVersion(String versionString, Set<Feature> featuresSupported, Set<Feature> unsupported) {
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
        return DatabaseType.POSTGRESQL.getName() + " " + getVersionString();
    }
}
