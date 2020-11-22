package cn.rjxy.mypet.mapper;

import cn.rjxy.mypet.pojo.Pet;
import cn.rjxy.mypet.pojo.PetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetMapper {
    long countByExample(PetExample example);

    int deleteByExample(PetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pet record);

    int insertSelective(Pet record);

    List<Pet> selectByExample(PetExample example);

    Pet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pet record, @Param("example") PetExample example);

    int updateByExample(@Param("record") Pet record, @Param("example") PetExample example);

    int updateByPrimaryKeySelective(Pet record);

    int updateByPrimaryKey(Pet record);
}