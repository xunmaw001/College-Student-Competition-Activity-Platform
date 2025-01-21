package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuangyeleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuangyeleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuangyeleixingView;


/**
 * 创业类型
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
public interface ChuangyeleixingService extends IService<ChuangyeleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuangyeleixingVO> selectListVO(Wrapper<ChuangyeleixingEntity> wrapper);
   	
   	ChuangyeleixingVO selectVO(@Param("ew") Wrapper<ChuangyeleixingEntity> wrapper);
   	
   	List<ChuangyeleixingView> selectListView(Wrapper<ChuangyeleixingEntity> wrapper);
   	
   	ChuangyeleixingView selectView(@Param("ew") Wrapper<ChuangyeleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuangyeleixingEntity> wrapper);
   	

}

