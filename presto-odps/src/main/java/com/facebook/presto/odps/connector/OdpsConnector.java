package com.facebook.presto.odps.connector;

import com.facebook.presto.odps.metadata.OdpsMetadata;
import com.facebook.presto.spi.connector.Connector;
import com.facebook.presto.spi.connector.ConnectorSplitManager;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import com.facebook.presto.spi.transaction.IsolationLevel;
import com.google.inject.Inject;

/**
 * @author chengzhi on 16/1/29.
 */
public class OdpsConnector implements Connector
{

    private final OdpsMetadata metadata;

    @Inject
    public OdpsConnector(OdpsMetadata metadata)
    {
        this.metadata = metadata;
    }

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
    public OdpsMetadata getMetadata(ConnectorTransactionHandle transactionHandle)
    {
        return metadata;
    }

    @Override
    public ConnectorSplitManager getSplitManager()
    {
        return null;
    }
}
