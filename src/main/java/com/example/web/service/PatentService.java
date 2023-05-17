package com.example.web.service;

import com.example.web.domain.Patent;
import com.example.web.util.NumEnum;
import com.example.web.vo.PatentVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PatentService {



    public PatentVO calAmout(Patent patent){
        BigDecimal yearcost = calYearcost(patent);
        if(NumEnum.FM.getCode().equals(patent.getNum())&& patent.getYear() > 10){
            patent.setProportion(new BigDecimal(1));
        }
        BigDecimal yearbook = calYearcost(patent).multiply(patent.getProportion());
        patent.setYearcost(yearbook);
        patent.setLatecost(yearcost.multiply( patent.getLate()));
        patent.setTotal(patent.getLatecost().add(patent.getYearcost()));
        PatentVO patentVO = exchangeVO(patent);
        return  patentVO;

    }

    public BigDecimal calYearcost(Patent patent){
        BigDecimal yearcost  = new BigDecimal(0); ;
        if(NumEnum.FM.getCode().equals(patent.getNum())){
            if(patent.getYear() <=3 ){
                yearcost = new BigDecimal(900);
                return yearcost;
            }else if(patent.getYear() <=6 && patent.getYear() >4){
                yearcost = new BigDecimal(1200);
                return yearcost;
            }else if(patent.getYear() <=9 && patent.getYear() >7){
                yearcost = new BigDecimal(2000);
                return yearcost;
            }else if(patent.getYear() <=12 && patent.getYear() >10){
                yearcost = new BigDecimal(4000);
                return yearcost;
            }else if(patent.getYear() <=15 && patent.getYear() >13){
                yearcost = new BigDecimal(6000);
                return yearcost;
            }else if(patent.getYear() <=20 && patent.getYear() >16){
                yearcost = new BigDecimal(8000);
                return yearcost;
            }

        }else{
            if(patent.getYear() <=3 ){
                yearcost = new BigDecimal(600);
                return yearcost;
            }else if(patent.getYear() <=5 && patent.getYear() >4){
                yearcost = new BigDecimal(900);
                return yearcost;
            }else if(patent.getYear() <=8 && patent.getYear() >6){
                yearcost = new BigDecimal(1200);
                return yearcost;
            }else if(patent.getYear() <=10 && patent.getYear() >8){
                yearcost = new BigDecimal(2000);
                return yearcost;
            }
        }
        return yearcost;

    };

    public PatentVO exchangeVO(Patent patent){
        PatentVO patentVO = new PatentVO();
        patentVO.setLate(patent.getLate().toString());
        patentVO.setLatecost(patent.getLatecost().toString());
        patentVO.setNum(patent.getNum());
        patentVO.setProportion(patent.getProportion().toString());
        patentVO.setTotal(patent.getTotal().toString());
        patentVO.setYear(String.valueOf(patent.getYear()));
        patentVO.setYearcost(patent.getYearcost().toString());
        return patentVO;
    }
}
