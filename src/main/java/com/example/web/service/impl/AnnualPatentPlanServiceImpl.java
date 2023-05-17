package com.example.web.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.web.com.example.web.vo.AnnualPatentPlan;
import com.example.web.service.AnnualPatentPlanService;
import com.example.web.mapper.AnnualPatentPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
@Component
public class AnnualPatentPlanServiceImpl extends ServiceImpl<AnnualPatentPlanMapper, AnnualPatentPlan>
implements AnnualPatentPlanService{

    @Autowired
    AnnualPatentPlanMapper annualPatentPlanMapper;

    @Override
    public List<AnnualPatentPlan> getList() {

        QueryWrapper<AnnualPatentPlan> queryWrapper = new QueryWrapper<>();
        queryWrapper.ne("is_deleted","1");
        List<AnnualPatentPlan> annualPatentPlans = annualPatentPlanMapper.selectList(queryWrapper);
        return annualPatentPlans;

    }
}
