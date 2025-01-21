package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingsaixinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingsaixinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingsaixinwenView;


/**
 * 竞赛新闻评论表
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface DiscussjingsaixinwenService extends IService<DiscussjingsaixinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingsaixinwenVO> selectListVO(Wrapper<DiscussjingsaixinwenEntity> wrapper);
   	
   	DiscussjingsaixinwenVO selectVO(@Param("ew") Wrapper<DiscussjingsaixinwenEntity> wrapper);
   	
   	List<DiscussjingsaixinwenView> selectListView(Wrapper<DiscussjingsaixinwenEntity> wrapper);
   	
   	DiscussjingsaixinwenView selectView(@Param("ew") Wrapper<DiscussjingsaixinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingsaixinwenEntity> wrapper);
   	

}

