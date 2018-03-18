package com.dao;


import com.entity.ErmMistake;
import org.apache.ibatis.annotations.Param;


import java.sql.Date;
import java.util.List;

public interface ErmMistakeDao {

    public List<ErmMistake> selsctErmMistake(@Param("waybill_no")String waybill_no , @Param("code")String code , @Param("type")Integer type ,@Param("report_start_time")String report_start_time , @Param("report_end_time")String report_end_time);

    public ErmMistake getErmMistakeById(Integer mistake_id);

}
