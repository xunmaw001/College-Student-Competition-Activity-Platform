package com.entity.view;

import com.entity.WenxueleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文学类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
@TableName("wenxueleixing")
public class WenxueleixingView  extends WenxueleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenxueleixingView(){
	}
 
 	public WenxueleixingView(WenxueleixingEntity wenxueleixingEntity){
 	try {
			BeanUtils.copyProperties(this, wenxueleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
