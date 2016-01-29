package com.facebook.presto.odps;

import com.facebook.presto.spi.ColumnHandle;
import com.facebook.presto.spi.ColumnMetadata;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.ConnectorTableHandle;
import com.facebook.presto.spi.ConnectorTableLayout;
import com.facebook.presto.spi.ConnectorTableLayoutHandle;
import com.facebook.presto.spi.ConnectorTableLayoutResult;
import com.facebook.presto.spi.ConnectorTableMetadata;
import com.facebook.presto.spi.Constraint;
import com.facebook.presto.spi.SchemaTableName;
import com.facebook.presto.spi.SchemaTablePrefix;
import com.facebook.presto.spi.connector.ConnectorMetadata;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @author chengzhi on 16/1/29.
 */
public class OdpsConnectorMetadata implements ConnectorMetadata
{
    /**
     * Returns the schemas provided by this connector.
     *
     * @param session
     */
    @Override
    public List<String> listSchemaNames(ConnectorSession session)
    {
        return null;
    }

    /**
     * Returns a table handle for the specified table name, or null if the connector does not contain the table.
     *
     * @param session
     * @param tableName
     */
    @Override
    public ConnectorTableHandle getTableHandle(ConnectorSession session, SchemaTableName tableName)
    {
        return null;
    }

    /**
     * Return a list of table layouts that satisfy the given constraint.
     * <p>
     * For each layout, connectors must return an "unenforced constraint" representing the part of the constraint
     * summary that isn't guaranteed by the layout.
     *
     * @param session
     * @param table
     * @param constraint
     * @param desiredColumns
     */
    @Override
    public List<ConnectorTableLayoutResult> getTableLayouts(ConnectorSession session, ConnectorTableHandle table,
        Constraint<ColumnHandle> constraint, Optional<Set<ColumnHandle>> desiredColumns)
    {
        return null;
    }

    @Override
    public ConnectorTableLayout getTableLayout(ConnectorSession session, ConnectorTableLayoutHandle handle)
    {
        return null;
    }

    /**
     * Return the metadata for the specified table handle.
     *
     * @param session
     * @param table
     * @throws RuntimeException if table handle is no longer valid
     */
    @Override
    public ConnectorTableMetadata getTableMetadata(ConnectorSession session, ConnectorTableHandle table)
    {
        return null;
    }

    /**
     * List table names, possibly filtered by schema. An empty list is returned if none match.
     *
     * @param session
     * @param schemaNameOrNull
     */
    @Override
    public List<SchemaTableName> listTables(ConnectorSession session, String schemaNameOrNull)
    {
        return null;
    }

    /**
     * Gets all of the columns on the specified table, or an empty map if the columns can not be enumerated.
     *
     * @param session
     * @param tableHandle
     * @throws RuntimeException if table handle is no longer valid
     */
    @Override
    public Map<String, ColumnHandle> getColumnHandles(ConnectorSession session, ConnectorTableHandle tableHandle)
    {
        return null;
    }

    /**
     * Gets the metadata for the specified table column.
     *
     * @param session
     * @param tableHandle
     * @param columnHandle
     * @throws RuntimeException if table or column handles are no longer valid
     */
    @Override
    public ColumnMetadata getColumnMetadata(ConnectorSession session, ConnectorTableHandle tableHandle,
        ColumnHandle columnHandle)
    {
        return null;
    }

    /**
     * Gets the metadata for all columns that match the specified table prefix.
     *
     * @param session
     * @param prefix
     */
    @Override
    public Map<SchemaTableName, List<ColumnMetadata>> listTableColumns(ConnectorSession session,
        SchemaTablePrefix prefix)
    {
        return null;
    }
}
