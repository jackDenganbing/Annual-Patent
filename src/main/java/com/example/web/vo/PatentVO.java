package com.example.web.vo;

import java.math.BigDecimal;

public class PatentVO {//专利实体类


 //专利号
 private String num;

 //应缴年度
 private String year;

 //减缓比例
 private String proportion;

 //滞纳时间
 private String late;

 //应缴年费
 private String yearcost;
 //滞纳金
 private String latecost;
 //总金额
 private String total;

 public String getNum() {
  return num;
 }

 public void setNum(String num) {
  this.num = num;
 }

 public String getYear() {
  return year;
 }

 public void setYear(String year) {
  this.year = year;
 }

 public String getProportion() {
  return proportion;
 }

 public void setProportion(String proportion) {
  this.proportion = proportion;
 }

 public String getLate() {
  return late;
 }

 public void setLate(String late) {
  this.late = late;
 }

 public String getYearcost() {
  return yearcost;
 }

 public void setYearcost(String yearcost) {
  this.yearcost = yearcost;
 }

 public String getLatecost() {
  return latecost;
 }

 public void setLatecost(String latecost) {
  this.latecost = latecost;
 }

 public String getTotal() {
  return total;
 }

 public void setTotal(String total) {
  this.total = total;
 }
}
