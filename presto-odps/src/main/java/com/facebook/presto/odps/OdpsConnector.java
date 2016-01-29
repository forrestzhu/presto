package com.facebook.presto.odps;

import com.facebook.presto.spi.connector.Connector;
import com.facebook.presto.spi.connector.ConnectorMetadata;
import com.facebook.presto.spi.connector.ConnectorSplitManager;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import com.facebook.presto.spi.transaction.IsolationLevel;

/**
 * @author chengzhi on 16/1/29.
 */
public class OdpsConnector implements Connector
{

    @Override
    public ConnectorTransactionHandle beginTransaction(IsolationLevel isolationLevel, boolean readOnly)
    {
        return null;
    }

    /**
     * Guaranteed to be called at most once per transaction.
     *
     * @param transactionHandle
     */
    @Override
    public OdpsConnectorMetadata getMetadata(ConnectorTransactionHandle transactionHandle)
    {
        return null;
    }

    @Override
    public ConnectorSplitManager getSplitManager()
    {
        return null;
    }
}
