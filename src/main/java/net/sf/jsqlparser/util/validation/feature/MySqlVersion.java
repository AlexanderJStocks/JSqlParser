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

import net.sf.jsqlparser.parser.feature.Feature;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/**
 * Please add Features supported and place a link to public documentation
 *
 * @author gitmotte
 * @see <a href=
 *      "https://dev.mysql.com/doc/refman/8.0/en/">https://dev.mysql.com/doc/refman/8.0/en/</a>
 */
public enum MySqlVersion implements Version {

    V8_0("8.0", // supported if used with jdbc
    EnumSet.// supported if used with jdbc
    of(// expressions
    Feature.jdbcParameter, // expressions
    Feature.jdbcNamedParameter, // https://dev.mysql.com/doc/refman/8.0/en/select.html
    Feature.exprLike, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.select, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.selectGroupBy, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.selectHaving, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.limit, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.limitOffset, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.offset, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.offsetParam, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.orderBy, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.selectForUpdate, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.selectForUpdateOfTable, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.selectForUpdateNoWait, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.selectForUpdateSkipLocked, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.distinct, // https://dev.mysql.com/doc/refman/8.0/en/union.html
    Feature.setOperation, // https://dev.mysql.com/doc/refman/8.0/en/with.html#common-table-expressions
    Feature.setOperationUnion, // https://dev.mysql.com/doc/refman/8.0/en/sql-function-reference.html
    Feature.withItem, // https://dev.mysql.com/doc/refman/8.0/en/sql-function-reference.html
    Feature.withItemRecursive, // https://dev.mysql.com/doc/refman/8.0/en/join.html
    Feature.function, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.join, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinSimple, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinLeft, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinRight, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinOuter, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinNatural, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinInner, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinCross, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinStraight, // https://dev.mysql.com/doc/refman/8.0/en/insert.html
    Feature.joinUsingColumns, // https://dev.mysql.com/doc/refman/8.0/en/update.html
    Feature.insert, // https://dev.mysql.com/doc/refman/8.0/en/update.html
    Feature.insertValues, // https://dev.mysql.com/doc/refman/8.0/en/update.html
    Feature.values, // https://dev.mysql.com/doc/refman/8.0/en/update.html
    Feature.insertFromSelect, // https://dev.mysql.com/doc/refman/8.0/en/update.html
    Feature.insertUseSet, // https://dev.mysql.com/doc/refman/8.0/en/update.html
    Feature.insertModifierPriority, // https://dev.mysql.com/doc/refman/8.0/en/update.html
    Feature.insertModifierIgnore, // https://dev.mysql.com/doc/refman/8.0/en/update.html
    Feature.insertUseDuplicateKeyUpdate, // https://dev.mysql.com/doc/refman/8.0/en/replace.html
    Feature.update, // https://dev.mysql.com/doc/refman/8.0/en/replace.html
    Feature.updateJoins, // https://dev.mysql.com/doc/refman/8.0/en/replace.html
    Feature.updateOrderBy, // https://dev.mysql.com/doc/refman/8.0/en/replace.html
    Feature.updateLimit, // https://dev.mysql.com/doc/refman/8.0/en/delete.html
    Feature.upsert, // https://dev.mysql.com/doc/refman/8.0/en/truncate-table.html
    Feature.delete, // https://dev.mysql.com/doc/refman/8.0/en/truncate-table.html
    Feature.deleteJoin, // https://dev.mysql.com/doc/refman/8.0/en/truncate-table.html
    Feature.deleteTables, // https://dev.mysql.com/doc/refman/8.0/en/truncate-table.html
    Feature.deleteLimit, // https://dev.mysql.com/doc/refman/8.0/en/truncate-table.html
    Feature.deleteOrderBy, // https://dev.mysql.com/doc/refman/8.0/en/call.html
    Feature.truncate, // https://dev.mysql.com/doc/refman/8.0/en/drop-table.html
    Feature.execute, // https://dev.mysql.com/doc/refman/8.0/en/drop-table.html
    Feature.executeCall, // https://dev.mysql.com/doc/refman/8.0/en/drop-table.html
    Feature.drop, // https://dev.mysql.com/doc/refman/8.0/en/drop-index.html
    Feature.dropTable, // https://dev.mysql.com/doc/refman/8.0/en/drop-view.html
    Feature.dropIndex, // https://dev.mysql.com/doc/refman/8.0/en/drop-database.html
    Feature.dropView, // https://dev.mysql.com/doc/refman/8.0/en/alter-table.html
    Feature.dropSchema, // https://dev.mysql.com/doc/refman/8.0/en/alter-table.html
    Feature.dropTableIfExists, // https://dev.mysql.com/doc/refman/8.0/en/alter-table.html
    Feature.dropViewIfExists, // https://dev.mysql.com/doc/refman/8.0/en/alter-table.html
    Feature.dropSchemaIfExists, // https://dev.mysql.com/doc/refman/8.0/en/alter-table.html
    Feature.dropSequenceIfExists, // https://dev.mysql.com/doc/refman/8.0/en/alter-view.html
    Feature.alterTable, // https://dev.mysql.com/doc/refman/8.0/en/create-database.html
    Feature.alterView, // https://dev.mysql.com/doc/refman/8.0/en/create-view.html
    Feature.createSchema, // https://dev.mysql.com/doc/refman/8.0/en/create-table.html
    Feature.createView, // https://dev.mysql.com/doc/refman/8.0/en/create-table.html
    Feature.createOrReplaceView, // https://dev.mysql.com/doc/refman/8.0/en/create-index.html
    Feature.createTable, // https://dev.mysql.com/doc/refman/8.0/en/create-index.html
    Feature.createTableCreateOptionStrings, // https://dev.mysql.com/doc/refman/8.0/en/create-index.html
    Feature.createTableTableOptionStrings, // https://dev.mysql.com/doc/refman/8.0/en/create-index.html
    Feature.createTableFromSelect, // https://dev.mysql.com/doc/refman/8.0/en/create-index.html
    Feature.createTableIfNotExists, // https://dev.mysql.com/doc/refman/8.0/en/create-trigger.html
    Feature.createIndex, // https://dev.mysql.com/doc/refman/8.0/en/describe.html
    Feature.createTrigger, // https://dev.mysql.com/doc/refman/8.0/en/explain.html
    Feature.describe, // https://dev.mysql.com/doc/refman/8.0/en/show.html
    Feature.explain, // https://dev.mysql.com/doc/refman/8.0/en/show-tables.html
    Feature.show, // https://dev.mysql.com/doc/refman/8.0/en/show-columns.html
    Feature.showTables, // https://dev.mysql.com/doc/refman/8.0/en/show-index.html
    Feature.showColumns, // https://dev.mysql.com/doc/refman/8.0/en/grant.html
    Feature.showIndex, // https://dev.mysql.com/doc/refman/8.0/en/use.html
    Feature.grant, // https://dev.mysql.com/doc/refman/8.0/en/commit.html
    Feature.use, //
    Feature.commit, Feature.mySqlHintStraightJoin, Feature.mysqlSqlCacheFlag, Feature.mysqlCalcFoundRows));

    private Set<Feature> features;

    private String versionString;

    /**
     * @param versionString
     * @param featuresSupported
     * @see #copy() to copy from previous version
     */
    MySqlVersion(String versionString, Set<Feature> featuresSupported) {
        this(versionString, featuresSupported, Collections.emptySet());
    }

    /**
     * @param versionString
     * @param featuresSupported
     * @param unsupported
     * @see #copy() to copy from previous version
     */
    MySqlVersion(String versionString, Set<Feature> featuresSupported, Set<Feature> unsupported) {
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
        return DatabaseType.MYSQL.getName() + " " + name();
    }
}
