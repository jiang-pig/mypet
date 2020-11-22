package cn.rjxy.mypet.mapper;

import cn.rjxy.mypet.pojo.Adopt;
import cn.rjxy.mypet.pojo.AdoptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdoptMapper {
    long countByExample(AdoptExample example);

    int deleteByExample(AdoptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Adopt record);

    int insertSelective(Adopt record);

    List<Adopt> selectByExample(AdoptExample example);

    Adopt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Adopt record, @Param("example") AdoptExample example);

    int updateByExample(@Param("record") Adopt record, @Param("example") AdoptExample example);

    int updateByPrimaryKeySelective(Adopt record);

    int updateByPrimaryKey(Adopt record);
}