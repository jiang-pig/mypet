package cn.rjxy.mypet.mapper;

import cn.rjxy.mypet.pojo.PetImage;
import cn.rjxy.mypet.pojo.PetImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetImageMapper {
    long countByExample(PetImageExample example);

    int deleteByExample(PetImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PetImage record);

    int insertSelective(PetImage record);

    List<PetImage> selectByExample(PetImageExample example);

    PetImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PetImage record, @Param("example") PetImageExample example);

    int updateByExample(@Param("record") PetImage record, @Param("example") PetImageExample example);

    int updateByPrimaryKeySelective(PetImage record);

    int updateByPrimaryKey(PetImage record);
}