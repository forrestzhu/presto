package com.facebook.presto.odps.connector;

import com.facebook.presto.odps.constants.Constants;
import com.facebook.presto.spi.connector.ConnectorFactory;

import java.util.Map;

/**
 * @author chengzhi on 16/1/29.
 */
public class OdpsConnectorFactory implements ConnectorFactory
{
    private String name = Constants.CONNECTOR_FACTORY;

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public OdpsHandleResolver getHandleResolver()
    {
        return null;
    }

    @Override
    public OdpsConnector create(String connectorId, Map<String, String> config)
    {
        return null;
    }
}
