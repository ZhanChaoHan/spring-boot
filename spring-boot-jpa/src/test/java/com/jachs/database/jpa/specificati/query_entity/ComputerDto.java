package com.jachs.database.jpa.specificati.query_entity;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.jachs.database.jpa.utill.Query;

import lombok.Data;

/***
 * 查询条件实体对象
 * @author zhanchaohan
 *
 */
@Data
public class ComputerDto {
	/** 模糊 */
    @Query(type = Query.Type.INNER_LIKE)
    private String computerName;

    @Query(type = Query.Type.EQUAL)
    private Long computerPrice;

    @Query(type = Query.Type.BETWEEN)
    private List<String> madeTime;

//    @Query(propName = "id", type = Query.Type.IN, joinName = "dept")
//    private Set<Long> deptIds = new HashSet<>();
}
