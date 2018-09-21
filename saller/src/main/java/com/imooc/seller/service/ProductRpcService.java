package com.imooc.seller.service;

import com.imooc.api.ProductRpc;
import com.imooc.api.domain.ProductRpcRequest;
import com.imooc.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;



/**
 * 产品相关服务
 */
@Service
public class ProductRpcService {

    @Autowired
    private ProductRpc productRpc;

    private static Logger LOG = LoggerFactory.getLogger(ProductRpcService.class);

    /**
     * 查询产品
     * @return
     */
    public List<Product> findAll() {
        ProductRpcRequest req = new ProductRpcRequest();
//        List<String> status = new ArrayList<>();
//        status.add(ProductStatus.IN_SELL.name());
//        req.setStatusList(status);
        BigDecimal min = new BigDecimal(3);
        BigDecimal max = new BigDecimal(5);
        req.setMaxRewardRate(max);
        req.setMinRewardRate(min);

        // TODO
        LOG.info("rpc查询全部产品,请求{}", req);
        List<Product> result = productRpc.query(req);
        LOG.info("rpc查询全部产品,结果{}:", result);
        return result;
    }

    @PostConstruct
    public void testFindAll() {
        findAll();
    }
}
