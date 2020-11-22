package cn.rjxy.mypet.mapper;

import cn.rjxy.mypet.pojo.DictProvinces;
import cn.rjxy.mypet.pojo.DictProvincesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictProvincesMapper {
    long countByExample(DictProvincesExample example);

    int deleteByExample(DictProvincesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictProvinces record);

    int insertSelective(DictProvinces record);

    List<DictProvinces> selectByExample(DictProvincesExample example);

    DictProvinces selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictProvinces record, @Param("example") DictProvincesExample example);

    int updateByExample(@Param("record") DictProvinces record, @Param("example") DictProvincesExample example);

    int updateByPrimaryKeySelective(DictProvinces record);

    int updateByPrimaryKey(DictProvinces record);
}