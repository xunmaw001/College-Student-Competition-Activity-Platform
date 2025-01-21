package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GudianwenxueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GudianwenxueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GudianwenxueView;


/**
 * 古典文学
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface GudianwenxueService extends IService<GudianwenxueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GudianwenxueVO> selectListVO(Wrapper<GudianwenxueEntity> wrapper);
   	
   	GudianwenxueVO selectVO(@Param("ew") Wrapper<GudianwenxueEntity> wrapper);
   	
   	List<GudianwenxueView> selectListView(Wrapper<GudianwenxueEntity> wrapper);
   	
   	GudianwenxueView selectView(@Param("ew") Wrapper<GudianwenxueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GudianwenxueEntity> wrapper);
   	

}

