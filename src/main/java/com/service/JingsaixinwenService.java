package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingsaixinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingsaixinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaixinwenView;


/**
 * 竞赛新闻
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
public interface JingsaixinwenService extends IService<JingsaixinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaixinwenVO> selectListVO(Wrapper<JingsaixinwenEntity> wrapper);
   	
   	JingsaixinwenVO selectVO(@Param("ew") Wrapper<JingsaixinwenEntity> wrapper);
   	
   	List<JingsaixinwenView> selectListView(Wrapper<JingsaixinwenEntity> wrapper);
   	
   	JingsaixinwenView selectView(@Param("ew") Wrapper<JingsaixinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaixinwenEntity> wrapper);
   	

}

