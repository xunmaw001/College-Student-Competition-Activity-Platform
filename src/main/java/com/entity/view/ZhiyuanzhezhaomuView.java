package com.entity.view;

import com.entity.ZhiyuanzhezhaomuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 志愿者招募
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
@TableName("zhiyuanzhezhaomu")
public class ZhiyuanzhezhaomuView  extends ZhiyuanzhezhaomuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuanzhezhaomuView(){
	}
 
 	public ZhiyuanzhezhaomuView(ZhiyuanzhezhaomuEntity zhiyuanzhezhaomuEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuanzhezhaomuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
