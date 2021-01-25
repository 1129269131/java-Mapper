package com.example.demo.mine_mapper;

import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

public interface MyMapper<T> extends SelectAllMapper<T>,SelectByExampleMapper<T>,MyBatchUpdateDay04Mapper<T> {
}
