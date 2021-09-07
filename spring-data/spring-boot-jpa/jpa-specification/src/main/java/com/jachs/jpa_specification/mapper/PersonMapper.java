package com.jachs.jpa_specification.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/***
 * 
 * @author zhanchaohan
 *
 */
@Mapper
public interface PersonMapper {
	PersonMapper INSTANCE=Mappers.getMapper(PersonMapper.class);
	
	
}
