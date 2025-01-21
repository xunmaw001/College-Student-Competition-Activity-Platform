package com.entity.vo;

import com.entity.JingsaixinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 竞赛新闻
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
public class JingsaixinwenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 新闻简述
	 */
	
	private String xinwenjianshu;
		
	/**
	 * 竞赛内容
	 */
	
	private String jingsaineirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 来源
	 */
	
	private String laiyuan;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：新闻简述
	 */
	 
	public void setXinwenjianshu(String xinwenjianshu) {
		this.xinwenjianshu = xinwenjianshu;
	}
	
	/**
	 * 获取：新闻简述
	 */
	public String getXinwenjianshu() {
		return xinwenjianshu;
	}
				
	
	/**
	 * 设置：竞赛内容
	 */
	 
	public void setJingsaineirong(String jingsaineirong) {
		this.jingsaineirong = jingsaineirong;
	}
	
	/**
	 * 获取：竞赛内容
	 */
	public String getJingsaineirong() {
		return jingsaineirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：来源
	 */
	 
	public void setLaiyuan(String laiyuan) {
		this.laiyuan = laiyuan;
	}
	
	/**
	 * 获取：来源
	 */
	public String getLaiyuan() {
		return laiyuan;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
