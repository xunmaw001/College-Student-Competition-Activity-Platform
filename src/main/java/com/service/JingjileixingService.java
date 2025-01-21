package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingjileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingjileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingjileixingView;


/**
 * 竞技类型
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface JingjileixingService extends IService<JingjileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingjileixingVO> selectListVO(Wrapper<JingjileixingEntity> wrapper);
   	
   	JingjileixingVO selectVO(@Param("ew") Wrapper<JingjileixingEntity> wrapper);
   	
   	List<JingjileixingView> selectListView(Wrapper<JingjileixingEntity> wrapper);
   	
   	JingjileixingView selectView(@Param("ew") Wrapper<JingjileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingjileixingEntity> wrapper);
   	

}

