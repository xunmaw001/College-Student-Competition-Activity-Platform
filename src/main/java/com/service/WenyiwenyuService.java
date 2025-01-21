package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenyiwenyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenyiwenyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenyiwenyuView;


/**
 * 文艺文娱
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface WenyiwenyuService extends IService<WenyiwenyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenyiwenyuVO> selectListVO(Wrapper<WenyiwenyuEntity> wrapper);
   	
   	WenyiwenyuVO selectVO(@Param("ew") Wrapper<WenyiwenyuEntity> wrapper);
   	
   	List<WenyiwenyuView> selectListView(Wrapper<WenyiwenyuEntity> wrapper);
   	
   	WenyiwenyuView selectView(@Param("ew") Wrapper<WenyiwenyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenyiwenyuEntity> wrapper);
   	

}

