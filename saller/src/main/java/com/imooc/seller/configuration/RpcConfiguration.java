package com.imooc.seller.configuration;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import com.imooc.api.ProductRpc;
import com.imooc.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;


@Configuration
@ComponentScan(basePackageClasses = {ProductRpc.class})
public class RpcConfiguration {
    private static Logger LOG = LoggerFactory.getLogger(RpcConfiguration.class);

 
}
