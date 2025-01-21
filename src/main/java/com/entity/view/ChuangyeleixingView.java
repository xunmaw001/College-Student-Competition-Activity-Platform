package com.entity.view;

import com.entity.ChuangyeleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 创业类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
@TableName("chuangyeleixing")
public class ChuangyeleixingView  extends ChuangyeleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuangyeleixingView(){
	}
 
 	public ChuangyeleixingView(ChuangyeleixingEntity chuangyeleixingEntity){
 	try {
			BeanUtils.copyProperties(this, chuangyeleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
