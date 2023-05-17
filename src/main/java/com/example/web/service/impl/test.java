package com.example.web.service.impl;

import com.example.web.com.example.web.vo.AnnualPatentPlan;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;


public class test {


        public static void main(String[] args) {



            List<AnnualPatentPlan> list = new ArrayList<>();

            AnnualPatentPlan annualPatentPlan1 = new AnnualPatentPlan();
            annualPatentPlan1.setApplyNo("12");
            annualPatentPlan1.setProgramNo("34");
            AnnualPatentPlan annualPatentPlan2 = new AnnualPatentPlan();
            annualPatentPlan2.setApplyNo("12");
            annualPatentPlan2.setProgramNo("34");
            list.add(annualPatentPlan2);
            list.add(annualPatentPlan1);
            Set<MysqlxDatatypes.Scalar.String> companyCodesSet = list.stream().map(node -> node.getApplyNo()+node.getProgramNo()).collect(Collectors.toSet());
            System.out.println(companyCodesSet.toString());
            if (list.size() != companyCodesSet.size()){
                System.out.println("重复1");
            }


            // TODO Auto-generated method stub
//           String str = "20220422111";
//            int i = 2;
//            int i2 = 3;
//            Double double1 = Double.parseDouble("0.1");
//            Double double2 = Double.parseDouble("0.3");
//
//            Double double3 = i * double1;
//            Double double4 = i2 * double2*10/10;
//            Double double5 = double3 + double4;
//            System.out.println(double3);
//            System.out.println(double4);
//            System.out.println(double5);
//           int  i = Integer.parseInt(str.substring(8,11))+1;
//           Double d1 =  Double.parseDouble(str1);
//           System.out.println(d1 > d2);
        }


}
