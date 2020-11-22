package cn.rjxy.mypet.mapper;

import cn.rjxy.mypet.pojo.DictAreas;
import cn.rjxy.mypet.pojo.DictAreasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictAreasMapper {
    long countByExample(DictAreasExample example);

    int deleteByExample(DictAreasExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictAreas record);

    int insertSelective(DictAreas record);

    List<DictAreas> selectByExample(DictAreasExample example);

    DictAreas selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictAreas record, @Param("example") DictAreasExample example);

    int updateByExample(@Param("record") DictAreas record, @Param("example") DictAreasExample example);

    int updateByPrimaryKeySelective(DictAreas record);

    int updateByPrimaryKey(DictAreas record);
}