package com.entity.view;

import com.entity.WenyileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文艺类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
@TableName("wenyileixing")
public class WenyileixingView  extends WenyileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenyileixingView(){
	}
 
 	public WenyileixingView(WenyileixingEntity wenyileixingEntity){
 	try {
			BeanUtils.copyProperties(this, wenyileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
