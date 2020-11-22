package cn.rjxy.mypet.mapper;

import cn.rjxy.mypet.pojo.DictCities;
import cn.rjxy.mypet.pojo.DictCitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictCitiesMapper {
    long countByExample(DictCitiesExample example);

    int deleteByExample(DictCitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictCities record);

    int insertSelective(DictCities record);

    List<DictCities> selectByExample(DictCitiesExample example);

    DictCities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictCities record, @Param("example") DictCitiesExample example);

    int updateByExample(@Param("record") DictCities record, @Param("example") DictCitiesExample example);

    int updateByPrimaryKeySelective(DictCities record);

    int updateByPrimaryKey(DictCities record);
}