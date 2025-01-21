package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KejileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KejileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KejileixingView;


/**
 * 科技类型
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
public interface KejileixingService extends IService<KejileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KejileixingVO> selectListVO(Wrapper<KejileixingEntity> wrapper);
   	
   	KejileixingVO selectVO(@Param("ew") Wrapper<KejileixingEntity> wrapper);
   	
   	List<KejileixingView> selectListView(Wrapper<KejileixingEntity> wrapper);
   	
   	KejileixingView selectView(@Param("ew") Wrapper<KejileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KejileixingEntity> wrapper);
   	

}

