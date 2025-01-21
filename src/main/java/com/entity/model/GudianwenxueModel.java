package com.entity.model;

import com.entity.GudianwenxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 古典文学
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public class GudianwenxueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文学类型
	 */
	
	private String wenxueleixing;
		
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
	 * 设置：文学类型
	 */
	 
	public void setWenxueleixing(String wenxueleixing) {
		this.wenxueleixing = wenxueleixing;
	}
	
	/**
	 * 获取：文学类型
	 */
	public String getWenxueleixing() {
		return wenxueleixing;
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
