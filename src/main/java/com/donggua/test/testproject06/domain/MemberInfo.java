package com.donggua.test.testproject06.domain;

import lombok.*;


import java.io.Serializable;
import java.sql.Timestamp;

import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Document(indexName = "t_member")
public class MemberInfo implements Serializable {

    /**
     * uid
     */
    @Field(name = "uid")
    private String uid;

    /**
     * 姓名
     */
    @Field(name = "name")
    private String name;

    /**
     * 年龄
     */
    @Field(name = "age")
    private Integer age;

    /**
     * 创建时间
     */
    @Field(name = "create_time")
    private String createTime;


}

