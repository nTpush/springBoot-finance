package com.imooc.api.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import java.math.BigDecimal;
import java.util.List;

/**
 * 产品相关rpc请求对象
 */
public class ProductRpcRequest {
    private List<String> idList;
    private BigDecimal minRewardRate;

    private BigDecimal maxRewardRate;
    private List<String> statusList;

//    private int page;
//    private int pageSize;
//    private Sort.Direction direction;
//    private String orderBy;

//    private Pageable pageable;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public BigDecimal getMinRewardRate() {
        return minRewardRate;
    }

    public void setMinRewardRate(BigDecimal minRewardRate) {
        this.minRewardRate = minRewardRate;
    }

    public BigDecimal getMaxRewardRate() {
        return maxRewardRate;
    }

    public void setMaxRewardRate(BigDecimal maxRewardRate) {
        this.maxRewardRate = maxRewardRate;
    }

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

//    public int getPage() {
//        return page;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }
//
//    public int getPageSize() {
//        return pageSize;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public Sort.Direction getDirection() {
//        return direction;
//    }
//
//    public void setDirection(Sort.Direction direction) {
//        this.direction = direction;
//    }
//
//    public String getOrderBy() {
//        return orderBy;
//    }
//
//    public void setOrderBy(String orderBy) {
//        this.orderBy = orderBy;
//    }

    //    public Pageable getPageable() {
//        return pageable;
//    }
//
//    public void setPageable(Pageable pageable) {
//        this.pageable = pageable;
//    }
}
