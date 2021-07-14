package com.jachs.database.jpa.specificati.query_entity;


import java.util.List;

import com.jachs.database.jpa.entity.otn.SoftWare;
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

    private String cId;
    @Query(propName = "cId", type = Query.Type.EQUAL, joinName = "computerId")
    private List<SoftWare> swList;
}
