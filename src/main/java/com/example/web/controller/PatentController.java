package com.example.web.controller;

import com.example.web.com.example.web.vo.AnnualPatentPlan;
import com.example.web.domain.Patent;
import com.example.web.service.AnnualPatentPlanService;
import com.example.web.service.PatentService;
import com.example.web.util.CommonResult;
import com.example.web.vo.PatentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patent")
public class PatentController {

    @Autowired
    PatentService patentService;

    @Autowired
    AnnualPatentPlanService annualPatentPlanService;

    @PostMapping("/cal")
    public CommonResult calAmount(@RequestBody Patent patent){

        PatentVO patent1 = patentService.calAmout(patent);
        return CommonResult.success(patent1);
    }

    @PostMapping("getList")
    public CommonResult getList(){

        List<AnnualPatentPlan> annualPatentPlanList = annualPatentPlanService.getList();
        return CommonResult.success(annualPatentPlanList);

    }

}
