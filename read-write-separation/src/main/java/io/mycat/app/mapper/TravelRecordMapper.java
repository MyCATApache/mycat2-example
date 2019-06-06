package io.mycat.app.mapper;

import io.mycat.app.pojo.TravelRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TravelRecordMapper {
  @Select("SELECT * FROM travelrecord WHERE id = #{id}")
  TravelRecord findById(@Param("id") int state);

}