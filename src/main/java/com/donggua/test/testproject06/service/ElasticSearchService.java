package com.donggua.test.testproject06.service;


import com.donggua.test.testproject06.domain.ElasticSearch;
import org.springframework.data.elasticsearch.core.SearchHit;
import java.util.List;

public interface ElasticSearchService {

    //保存和修改
    void save(ElasticSearch article);
    //查询id
    ElasticSearch findById(Integer id);
    //删除指定ID数据
    void deleteById(Integer id);

    long count();

    boolean existsById(Integer id);

    List<SearchHit<ElasticSearch>> findByTitleOrContent(String title, String content);

}

