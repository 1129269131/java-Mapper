package com.example.demo.mine_mapper;

import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/* 37.创建用于功能扩展的接口和实现类.avi */

public interface MyBatchUpdateDay04Mapper<T> {

    @UpdateProvider(type=MyBatchUpdateDay04Provider.class, method="dynamicSQL")
    void batchUpdate(List<T> list);

}
