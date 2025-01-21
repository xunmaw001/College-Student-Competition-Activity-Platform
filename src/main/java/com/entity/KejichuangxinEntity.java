package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 科技创新
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
@TableName("kejichuangxin")
public class KejichuangxinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KejichuangxinEntity() {
		
	}
	
	public KejichuangxinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 比赛名称
	 */
					
	private String bisaimingcheng;
	
	/**
	 * 科技类型
	 */
					
	private String kejileixing;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：比赛名称
	 */
	public void setBisaimingcheng(String bisaimingcheng) {
		this.bisaimingcheng = bisaimingcheng;
	}
	/**
	 * 获取：比赛名称
	 */
	public String getBisaimingcheng() {
		return bisaimingcheng;
	}
	/**
	 * 设置：科技类型
	 */
	public void setKejileixing(String kejileixing) {
		this.kejileixing = kejileixing;
	}
	/**
	 * 获取：科技类型
	 */
	public String getKejileixing() {
		return kejileixing;
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
