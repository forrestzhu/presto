package com.facebook.presto.odps;

import com.facebook.presto.spi.Plugin;

import java.util.List;
import java.util.Map;

/**
 * @author chengzhi on 16/1/29.
 */
public class OdpsPlugin implements Plugin
{

    @Override
    public void setOptionalConfig(Map<String, String> optionalConfig)
    {

    }

    @Override
    public <T> List<T> getServices(Class<T> type)
    {
        return null;
    }
}
