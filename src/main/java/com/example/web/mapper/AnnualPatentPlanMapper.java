package com.example.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.web.com.example.web.vo.AnnualPatentPlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
* @Entity com.example.web.com.example.web.vo.AnnualPatentPlan
*/
@Mapper
public interface AnnualPatentPlanMapper extends BaseMapper<AnnualPatentPlan> {

      List<AnnualPatentPlan> getList();

}
