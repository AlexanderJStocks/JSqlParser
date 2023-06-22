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
 *      "https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/index.html">https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/index.html</a>
 */
public enum OracleVersion implements Version {

    V19C("19c", // supported if used with jdbc
    EnumSet.// supported if used with jdbc
    of(// expressions
    Feature.jdbcParameter, // expressions
    Feature.jdbcNamedParameter, // common features
    Feature.exprLike, // https://www.oracletutorial.com/oracle-basics/oracle-group-by/
    Feature.select, // https://www.oracletutorial.com/oracle-basics/oracle-grouping-sets/
    Feature.selectGroupBy, // https://www.oracletutorial.com/oracle-basics/oracle-grouping-sets/
    Feature.function, // https://www.oracletutorial.com/oracle-basics/oracle-having/
    Feature.selectGroupByGroupingSets, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.selectHaving, // see "join_clause"
    // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.join, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinSimple, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinLeft, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinRight, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinFull, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinCross, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinNatural, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinOuter, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinInner, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinApply, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.joinUsingColumns, // see "row_limiting_clause"
    // https://www.oracletutorial.com/oracle-basics/oracle-select-distinct/
    Feature.offset, // https://www.oracletutorial.com/oracle-basics/oracle-select-distinct/
    Feature.offsetParam, // https://www.oracletutorial.com/oracle-basics/oracle-select-distinct/
    Feature.fetch, // https://www.oracletutorial.com/oracle-basics/oracle-select-distinct/
    Feature.fetchFirst, // https://www.oracletutorial.com/oracle-basics/oracle-select-distinct/
    Feature.fetchNext, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.distinct, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.selectUnique, // see "order_by_clause"
    // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.orderBy, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.orderByNullOrdering, // see "with_clause"
    // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.withItem, // see "pivot_clause"
    // see "unpivot_clause"
    // see "LATERAL"
    // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/Set-Operators.html
    Feature.lateralSubSelect, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.setOperation, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.setOperationUnion, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.setOperationIntersect, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/SELECT.html
    Feature.setOperationMinus, // see "for_update_clause"
    // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/INSERT.html
    Feature.selectForUpdate, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/INSERT.html
    Feature.selectForUpdateWait, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/INSERT.html
    Feature.selectForUpdateNoWait, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/INSERT.html
    Feature.selectForUpdateSkipLocked, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/INSERT.html
    Feature.insert, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/INSERT.html
    Feature.insertValues, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/INSERT.html
    Feature.values, // see "single_table_insert"
    // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/UPDATE.html
    Feature.insertFromSelect, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/DELETE.html
    Feature.update, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/DELETE.html
    Feature.updateReturning, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/DELETE.html
    Feature.updateUseSelect, // https://www.oracletutorial.com/oracle-basics/oracle-truncate-table/
    Feature.delete, // https://www.oracletutorial.com/oracle-basics/oracle-truncate-table/
    Feature.deleteReturningExpressionList, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/DROP-TABLE.html
    Feature.truncate, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/DROP-TABLE.html
    Feature.drop, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/DROP-INDEX.html
    Feature.dropTable, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/DROP-VIEW.html
    Feature.dropIndex, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/DROP-SEQUENCE.html
    Feature.dropView, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/ALTER-TABLE.html
    Feature.dropSequence, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/ALTER-SEQUENCE.html
    Feature.alterTable, // https://docs.oracle.com/en/database/oracle/oracle-database/19/lnpls/EXECUTE-IMMEDIATE-statement.html
    Feature.alterSequence, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-VIEW.html
    Feature.executeStatementImmediate, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-MATERIALIZED-VIEW.htm
    Feature.createView, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-MATERIALIZED-VIEW.htm
    Feature.createViewForce, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-MATERIALIZED-VIEW.htm
    Feature.createOrReplaceView, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-TABLE.html
    Feature.createViewMaterialized, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-INDEX.html
    Feature.createTable, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-INDEX.html
    Feature.createTableCreateOptionStrings, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-INDEX.html
    Feature.createTableTableOptionStrings, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-INDEX.html
    Feature.createTableFromSelect, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-INDEX.html
    Feature.createTableRowMovement, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-SEQUENCE.html
    Feature.createIndex, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-TRIGGER.html
    Feature.createSequence, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/CREATE-SCHEMA.html
    Feature.createTrigger, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/COMMENT.html
    Feature.createSchema, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/COMMENT.html
    Feature.commit, // https://docs.oracle.com/en/database/oracle/oracle-database/19/rcmrf/DESCRIBE.html
    Feature.comment, // https://docs.oracle.com/en/database/oracle/oracle-database/19/rcmrf/DESCRIBE.html
    Feature.commentOnTable, // https://docs.oracle.com/en/database/oracle/oracle-database/19/rcmrf/DESCRIBE.html
    Feature.commentOnColumn, // https://docs.oracle.com/en/database/oracle/oracle-database/19/rcmrf/DESCRIBE.html
    Feature.commentOnView, // https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/GRANT.htm
    Feature.describe, // https://www.oracletutorial.com/oracle-basics/oracle-merge/
    Feature.grant, // special oracle features
    Feature.merge, // special oracle features
    Feature.createFunction, // special oracle features
    Feature.createProcedure, // special oracle features
    Feature.functionalStatement, // special oracle features
    Feature.block, // special oracle features
    Feature.declare, Feature.oracleOldJoinSyntax, Feature.oraclePriorPosition, Feature.oracleHint, Feature.oracleHierarchicalExpression, Feature.oracleOrderBySiblings));

    private Set<Feature> features;

    private String versionString;

    /**
     * @param versionString
     * @param featuresSupported
     * @see #copy() to copy from previous version
     */
    OracleVersion(String versionString, Set<Feature> featuresSupported) {
        this(versionString, featuresSupported, Collections.emptySet());
    }

    /**
     * @param versionString
     * @param featuresSupported
     * @param unsupported
     * @see #copy() to copy from previous version
     */
    OracleVersion(String versionString, Set<Feature> featuresSupported, Set<Feature> unsupported) {
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
        return DatabaseType.ORACLE.getName() + " " + getVersionString();
    }
}
