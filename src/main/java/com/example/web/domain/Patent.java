package com.example.web.domain;

import java.math.BigDecimal;

public class Patent {//专利实体类


 //专利号
 private String num;

 //应缴年度
 private int year;

 //减缓比例
 private BigDecimal proportion;

 //滞纳时间
 private BigDecimal late;

 //应缴年费
 private BigDecimal yearcost;
 //滞纳金
 private BigDecimal latecost;
 //总金额
 private BigDecimal total;

 public String getNum() {
  return num;
 }

 public void setNum(String num) {
  this.num = num;
 }

 public int getYear() {
  return year;
 }

 public void setYear(int year) {
  this.year = year;
 }

 public BigDecimal getProportion() {
  return proportion;
 }

 public void setProportion(BigDecimal proportion) {
  this.proportion = proportion;
 }

 public BigDecimal getLate() {
  return late;
 }

 public void setLate(BigDecimal late) {
  this.late = late;
 }

 public BigDecimal getYearcost() {
  return yearcost;
 }

 public void setYearcost(BigDecimal yearcost) {
  this.yearcost = yearcost;
 }

 public BigDecimal getLatecost() {
  return latecost;
 }

 public void setLatecost(BigDecimal latecost) {
  this.latecost = latecost;
 }

 public BigDecimal getTotal() {
  return total;
 }

 public void setTotal(BigDecimal total) {
  this.total = total;
 }
}
