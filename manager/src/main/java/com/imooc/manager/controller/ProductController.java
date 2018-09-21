package com.imooc.manager.controller;

import com.imooc.entity.Product;
import com.imooc.manager.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
@Api(tags = "product", description = "产品相关")
public class ProductController {

    private static Logger Log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService service;

    @ApiOperation(value = "创建产品", notes = "根据对应的业务规则添加相应的产品")
    @RequestMapping(value = "", method =RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) {
        Log.info("创建产品，参数：{}", product);
        Product result = service.addProduct(product);
        Log.info("创建产品，结果：{}", result);
        return result;
    }

    @RequestMapping(value = "/{id}", method =RequestMethod.GET)
    public Product findOne(@PathVariable String id) {
        Log.info("查询单个产品，id={}", id);
        Product product = service.findOne(id);
        Log.info("查询单个产品，结果={}", product);
        return product;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Page<Product> query(String ids, BigDecimal minRewardRate,
                         BigDecimal maxRewardRate, String status,
                         @RequestParam(defaultValue = "0") int pageNum,
                         @RequestParam(defaultValue = "10") int pageSize
    ) {
        Log.info("查询产品，ids={}, minRewardRate={}, maxRewardRate={}, status={}");

        List<String> idList = null, statusList = null;
        if(!StringUtils.isEmpty(ids)) {
            idList = Arrays.asList(ids.split(","));
        }
        if(!StringUtils.isEmpty(status)) {
            statusList = Arrays.asList(status.split(","));
        }

        Pageable pageable = new PageRequest(pageNum, pageSize);
        Page<Product> page = service.query(idList, minRewardRate, maxRewardRate, statusList, pageable);
        Log.info("查询产品，结果={}", page);
        return page;
    }

}
