package com.facebook.presto.odps;

import com.facebook.presto.spi.ColumnHandle;
import com.facebook.presto.spi.ConnectorHandleResolver;
import com.facebook.presto.spi.ConnectorSplit;
import com.facebook.presto.spi.ConnectorTableHandle;
import com.facebook.presto.spi.ConnectorTableLayoutHandle;

/**
 * @author chengzhi on 16/1/29.
 */
public class OdpsConnectorHandleResolver implements ConnectorHandleResolver
{

    @Override
    public Class<? extends ConnectorTableHandle> getTableHandleClass()
    {
        return null;
    }

    @Override
    public Class<? extends ConnectorTableLayoutHandle> getTableLayoutHandleClass()
    {
        return null;
    }

    @Override
    public Class<? extends ColumnHandle> getColumnHandleClass()
    {
        return null;
    }

    @Override
    public Class<? extends ConnectorSplit> getSplitClass()
    {
        return null;
    }
}
