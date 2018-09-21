package com.imooc.api;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.imooc.api.domain.ProductRpcRequest;
import com.imooc.entity.Product;
import org.apache.tomcat.util.modeler.ParameterInfo;
import org.springframework.data.domain.Page;

import java.util.List;

@JsonRpcService
public interface ProductRpc {

    /**
     * 查询多个产品
     */
    List<Product> query(ProductRpcRequest req); // 如果参数不确定只需要接收请求参数对象

    Product findOne(String id);
}
