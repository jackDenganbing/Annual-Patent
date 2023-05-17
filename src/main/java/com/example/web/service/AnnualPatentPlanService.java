package com.example.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.web.com.example.web.vo.AnnualPatentPlan;

import java.util.List;


/**
*
*/
public interface AnnualPatentPlanService extends IService<AnnualPatentPlan> {

    List<AnnualPatentPlan> getList();
}
