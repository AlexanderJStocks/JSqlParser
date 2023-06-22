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
 *      "https://mariadb.com/kb/en/sql-statements-structure/">https://mariadb.com/kb/en/sql-statements-structure/</a>
 */
public enum MariaDbVersion implements Version {

    // supported if used with jdbc
    V10_5_4(// supported if used with jdbc
    "10.5.4", // supported if used with jdbc
    EnumSet.// expressions
    of(// expressions
    Feature.jdbcParameter, // expressions
    Feature.jdbcNamedParameter, // https://mariadb.com/kb/en/select/
    Feature.exprLike, // https://mariadb.com/kb/en/join-syntax/
    Feature.select, // https://mariadb.com/kb/en/join-syntax/
    Feature.selectGroupBy, // https://mariadb.com/kb/en/join-syntax/
    Feature.function, // https://mariadb.com/kb/en/join-syntax/
    Feature.selectHaving, // https://mariadb.com/kb/en/join-syntax/
    Feature.limit, // https://mariadb.com/kb/en/join-syntax/
    Feature.limitOffset, // https://mariadb.com/kb/en/join-syntax/
    Feature.offset, // https://mariadb.com/kb/en/join-syntax/
    Feature.offsetParam, // https://mariadb.com/kb/en/join-syntax/
    Feature.orderBy, // https://mariadb.com/kb/en/join-syntax/
    Feature.selectForUpdate, // https://mariadb.com/kb/en/join-syntax/
    Feature.selectForUpdateWait, // https://mariadb.com/kb/en/join-syntax/
    Feature.selectForUpdateNoWait, // https://mariadb.com/kb/en/join-syntax/
    Feature.selectForUpdateSkipLocked, // https://mariadb.com/kb/en/select/#distinct
    Feature.join, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinSimple, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinRight, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinNatural, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinLeft, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinCross, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinOuter, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinInner, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinStraight, // https://mariadb.com/kb/en/select/#distinct
    Feature.joinUsingColumns, // https://mariadb.com/kb/en/union/
    Feature.distinct, // https://mariadb.com/kb/en/union/
    Feature.setOperation, // https://mariadb.com/kb/en/intersect/
    Feature.setOperationUnion, // https://mariadb.com/kb/en/except/
    Feature.setOperationIntersect, // https://mariadb.com/kb/en/common-table-expressions/
    Feature.setOperationExcept, // https://mariadb.com/kb/en/with/
    // https://mariadb.com/kb/en/non-recursive-common-table-expressions-overview/
    // https://mariadb.com/kb/en/recursive-common-table-expressions-overview/
    // https://mariadb.com/kb/en/insert/
    Feature.withItem, // https://mariadb.com/kb/en/insert/
    Feature.withItemRecursive, // https://mariadb.com/kb/en/update/
    Feature.insert, // https://mariadb.com/kb/en/update/
    Feature.insertValues, // https://mariadb.com/kb/en/update/
    Feature.values, // https://mariadb.com/kb/en/update/
    Feature.insertFromSelect, // https://mariadb.com/kb/en/update/
    Feature.insertModifierPriority, // https://mariadb.com/kb/en/update/
    Feature.insertModifierIgnore, // https://mariadb.com/kb/en/update/
    Feature.insertUseSet, // https://mariadb.com/kb/en/update/
    Feature.insertUseDuplicateKeyUpdate, // https://mariadb.com/kb/en/update/
    Feature.insertReturningExpressionList, // https://mariadb.com/kb/en/delete/
    Feature.update, // https://mariadb.com/kb/en/delete/
    Feature.updateJoins, // https://mariadb.com/kb/en/delete/
    Feature.updateOrderBy, // https://mariadb.com/kb/en/delete/
    Feature.updateLimit, // https://mariadb.com/kb/en/truncate-table/
    Feature.delete, // https://mariadb.com/kb/en/truncate-table/
    Feature.deleteJoin, // https://mariadb.com/kb/en/truncate-table/
    Feature.deleteTables, // https://mariadb.com/kb/en/truncate-table/
    Feature.deleteLimit, // https://mariadb.com/kb/en/truncate-table/
    Feature.deleteOrderBy, // https://mariadb.com/kb/en/call/
    Feature.truncate, // https://mariadb.com/kb/en/drop/
    Feature.execute, // https://mariadb.com/kb/en/drop/
    Feature.executeCall, // https://mariadb.com/kb/en/drop-index/
    Feature.drop, // https://mariadb.com/kb/en/drop-table/
    Feature.dropIndex, // https://mariadb.com/kb/en/drop-database/
    Feature.dropTable, // SCHEMA = DATABASE
    // https://mariadb.com/kb/en/drop-view/
    Feature.dropSchema, // https://mariadb.com/kb/en/drop-sequence/
    Feature.dropView, // https://mariadb.com/kb/en/replace/
    Feature.dropSequence, // https://mariadb.com/kb/en/replace/
    Feature.dropTableIfExists, // https://mariadb.com/kb/en/replace/
    Feature.dropIndexIfExists, // https://mariadb.com/kb/en/replace/
    Feature.dropViewIfExists, // https://mariadb.com/kb/en/replace/
    Feature.dropSchemaIfExists, // https://mariadb.com/kb/en/replace/
    Feature.dropSequenceIfExists, // https://mariadb.com/kb/en/alter/
    Feature.upsert, // https://mariadb.com/kb/en/alter-sequence/
    Feature.alterTable, // https://mariadb.com/kb/en/alter-view/
    Feature.alterSequence, // https://mariadb.com/kb/en/create-view/
    Feature.alterView, // https://mariadb.com/kb/en/create-table/
    Feature.createView, // https://mariadb.com/kb/en/create-table/
    Feature.createOrReplaceView, // https://mariadb.com/kb/en/create-index/
    Feature.createTable, // https://mariadb.com/kb/en/create-index/
    Feature.createTableCreateOptionStrings, // https://mariadb.com/kb/en/create-index/
    Feature.createTableTableOptionStrings, // https://mariadb.com/kb/en/create-index/
    Feature.createTableFromSelect, // https://mariadb.com/kb/en/create-index/
    Feature.createTableIfNotExists, // https://mariadb.com/kb/en/create-sequence/
    Feature.createIndex, // https://mariadb.com/kb/en/create-database/
    Feature.createSequence, // https://mariadb.com/kb/en/create-trigger/
    Feature.createSchema, // https://mariadb.com/kb/en/describe/
    Feature.createTrigger, // https://mariadb.com/kb/en/explain/
    Feature.describe, // https://mariadb.com/kb/en/show/
    Feature.explain, // https://mariadb.com/kb/en/show-tables/
    Feature.show, // https://mariadb.com/kb/en/show-columns/
    Feature.showTables, // https://mariadb.com/kb/en/show-index/
    Feature.showColumns, // https://mariadb.com/kb/en/use/
    Feature.showIndex, // https://mariadb.com/kb/en/grant/
    Feature.use, // https://mariadb.com/kb/en/commit/
    Feature.grant, // https://mariadb.com/kb/en/optimizer-hints/
    Feature.commit, Feature.mySqlHintStraightJoin, Feature.mysqlCalcFoundRows, Feature.mysqlSqlCacheFlag)), ORACLE_MODE("oracle_mode", V10_5_4.copy().add(Feature.selectUnique).getFeatures());

    private Set<Feature> features;

    private String versionString;

    /**
     * @param versionString
     * @param featuresSupported
     * @see #copy() to copy from previous version
     */
    MariaDbVersion(String versionString, Set<Feature> featuresSupported) {
        this(versionString, featuresSupported, Collections.emptySet());
    }

    /**
     * @param versionString
     * @param featuresSupported
     * @param unsupported
     * @see #copy() to copy from previous version
     */
    MariaDbVersion(String versionString, Set<Feature> featuresSupported, Set<Feature> unsupported) {
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
        return DatabaseType.MARIADB.getName() + " " + getVersionString();
    }
}
