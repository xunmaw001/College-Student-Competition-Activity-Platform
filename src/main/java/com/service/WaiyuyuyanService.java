package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaiyuyuyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaiyuyuyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaiyuyuyanView;


/**
 * 外语语言
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface WaiyuyuyanService extends IService<WaiyuyuyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaiyuyuyanVO> selectListVO(Wrapper<WaiyuyuyanEntity> wrapper);
   	
   	WaiyuyuyanVO selectVO(@Param("ew") Wrapper<WaiyuyuyanEntity> wrapper);
   	
   	List<WaiyuyuyanView> selectListView(Wrapper<WaiyuyuyanEntity> wrapper);
   	
   	WaiyuyuyanView selectView(@Param("ew") Wrapper<WaiyuyuyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaiyuyuyanEntity> wrapper);
   	

}

