package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenxueleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenxueleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenxueleixingView;


/**
 * 文学类型
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface WenxueleixingService extends IService<WenxueleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenxueleixingVO> selectListVO(Wrapper<WenxueleixingEntity> wrapper);
   	
   	WenxueleixingVO selectVO(@Param("ew") Wrapper<WenxueleixingEntity> wrapper);
   	
   	List<WenxueleixingView> selectListView(Wrapper<WenxueleixingEntity> wrapper);
   	
   	WenxueleixingView selectView(@Param("ew") Wrapper<WenxueleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenxueleixingEntity> wrapper);
   	

}

