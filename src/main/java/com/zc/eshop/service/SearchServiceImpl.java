package com.zc.eshop.service;

import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.get.GetRequestBuilder;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.IdsQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 说明 . <br>
 * <p>
 * <p>
 * Copyright: Copyright (c) 2018/01/05 23:02
 * <p>
 * Company: 百趣
 * <p>
 *
 * @author zhongcheng_m@yeah.net
 * @version 1.0.0
 */
@Component
public class SearchServiceImpl implements SearchService {

    @Resource
    private TransportClient esClient;

    @Override
    public Map<String, Object> search(String id) {

        GetRequestBuilder getRequestBuilder = esClient.prepareGet("forum", "article", id);

        return getRequestBuilder.get().getSource();
    }
}
