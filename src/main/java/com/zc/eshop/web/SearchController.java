package com.zc.eshop.web;

import com.zc.eshop.service.SearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 说明 . <br>
 * \
 * <p>
 * Copyright: Copyright (c) 2018/01/05 23:07
 * <p>
 * Company: 百趣
 * <p>
 *
 * @author zhongcheng_m@yeah.net
 * @version 1.0.0
 */
@RestController
public class SearchController {

    @Resource
    private SearchService searchService;


    @GetMapping("/search/{id}")
    public Map<String, Object> search(@PathVariable String id) {
        return searchService.search(id);
    }


}
