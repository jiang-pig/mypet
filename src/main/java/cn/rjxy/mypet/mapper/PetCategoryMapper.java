package cn.rjxy.mypet.mapper;

import cn.rjxy.mypet.pojo.PetCategory;
import cn.rjxy.mypet.pojo.PetCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetCategoryMapper {
    long countByExample(PetCategoryExample example);

    int deleteByExample(PetCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PetCategory record);

    int insertSelective(PetCategory record);

    List<PetCategory> selectByExample(PetCategoryExample example);

    PetCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PetCategory record, @Param("example") PetCategoryExample example);

    int updateByExample(@Param("record") PetCategory record, @Param("example") PetCategoryExample example);

    int updateByPrimaryKeySelective(PetCategory record);

    int updateByPrimaryKey(PetCategory record);
}