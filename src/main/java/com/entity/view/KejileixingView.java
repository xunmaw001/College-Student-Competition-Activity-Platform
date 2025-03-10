package com.entity.view;

import com.entity.KejileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科技类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
@TableName("kejileixing")
public class KejileixingView  extends KejileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KejileixingView(){
	}
 
 	public KejileixingView(KejileixingEntity kejileixingEntity){
 	try {
			BeanUtils.copyProperties(this, kejileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
