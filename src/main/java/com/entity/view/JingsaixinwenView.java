package com.entity.view;

import com.entity.JingsaixinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞赛新闻
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
@TableName("jingsaixinwen")
public class JingsaixinwenView  extends JingsaixinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingsaixinwenView(){
	}
 
 	public JingsaixinwenView(JingsaixinwenEntity jingsaixinwenEntity){
 	try {
			BeanUtils.copyProperties(this, jingsaixinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
