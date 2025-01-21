package com.entity.vo;

import com.entity.JingjibisaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 竞技比赛
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public class JingjibisaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 竞技类型
	 */
	
	private String jingjileixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 人数
	 */
	
	private Integer renshu;
		
	/**
	 * 开始日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishiriqi;
		
	/**
	 * 比赛要求
	 */
	
	private String bisaiyaoqiu;
		
	/**
	 * 比赛内容
	 */
	
	private String bisaineirong;
				
	
	/**
	 * 设置：竞技类型
	 */
	 
	public void setJingjileixing(String jingjileixing) {
		this.jingjileixing = jingjileixing;
	}
	
	/**
	 * 获取：竞技类型
	 */
	public String getJingjileixing() {
		return jingjileixing;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：人数
	 */
	 
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
				
	
	/**
	 * 设置：开始日期
	 */
	 
	public void setKaishiriqi(Date kaishiriqi) {
		this.kaishiriqi = kaishiriqi;
	}
	
	/**
	 * 获取：开始日期
	 */
	public Date getKaishiriqi() {
		return kaishiriqi;
	}
				
	
	/**
	 * 设置：比赛要求
	 */
	 
	public void setBisaiyaoqiu(String bisaiyaoqiu) {
		this.bisaiyaoqiu = bisaiyaoqiu;
	}
	
	/**
	 * 获取：比赛要求
	 */
	public String getBisaiyaoqiu() {
		return bisaiyaoqiu;
	}
				
	
	/**
	 * 设置：比赛内容
	 */
	 
	public void setBisaineirong(String bisaineirong) {
		this.bisaineirong = bisaineirong;
	}
	
	/**
	 * 获取：比赛内容
	 */
	public String getBisaineirong() {
		return bisaineirong;
	}
			
}
