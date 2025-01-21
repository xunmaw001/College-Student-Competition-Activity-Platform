package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenyileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenyileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenyileixingView;


/**
 * 文艺类型
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface WenyileixingService extends IService<WenyileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenyileixingVO> selectListVO(Wrapper<WenyileixingEntity> wrapper);
   	
   	WenyileixingVO selectVO(@Param("ew") Wrapper<WenyileixingEntity> wrapper);
   	
   	List<WenyileixingView> selectListView(Wrapper<WenyileixingEntity> wrapper);
   	
   	WenyileixingView selectView(@Param("ew") Wrapper<WenyileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenyileixingEntity> wrapper);
   	

}

