package com.spring.mvc.mapper;

import com.spring.mvc.model.UserDTO;
import com.spring.mvc.model.UserDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDTOMapper {
    int countByExample(UserDTOExample example);

    int deleteByExample(UserDTOExample example);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    List<UserDTO> selectByExample(UserDTOExample example);

    int updateByExampleSelective(@Param("record") UserDTO record, @Param("example") UserDTOExample example);

    int updateByExample(@Param("record") UserDTO record, @Param("example") UserDTOExample example);
}