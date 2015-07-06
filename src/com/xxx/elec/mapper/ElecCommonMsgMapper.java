package com.xxx.elec.mapper;

import com.xxx.elec.po.ElecCommonMsg;
import java.util.List;

public interface ElecCommonMsgMapper {
    int deleteByPrimaryKey(String id);

    int insert(ElecCommonMsg record);

    ElecCommonMsg selectByPrimaryKey(String id);

    List<ElecCommonMsg> selectAll();

    int updateByPrimaryKey(ElecCommonMsg record);
}