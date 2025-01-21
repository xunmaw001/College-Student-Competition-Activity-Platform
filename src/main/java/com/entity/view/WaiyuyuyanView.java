package com.entity.view;

import com.entity.WaiyuyuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外语语言
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
@TableName("waiyuyuyan")
public class WaiyuyuyanView  extends WaiyuyuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WaiyuyuyanView(){
	}
 
 	public WaiyuyuyanView(WaiyuyuyanEntity waiyuyuyanEntity){
 	try {
			BeanUtils.copyProperties(this, waiyuyuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
