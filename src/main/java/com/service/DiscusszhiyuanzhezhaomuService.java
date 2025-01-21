package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhiyuanzhezhaomuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhiyuanzhezhaomuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhiyuanzhezhaomuView;


/**
 * 志愿者招募评论表
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface DiscusszhiyuanzhezhaomuService extends IService<DiscusszhiyuanzhezhaomuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhiyuanzhezhaomuVO> selectListVO(Wrapper<DiscusszhiyuanzhezhaomuEntity> wrapper);
   	
   	DiscusszhiyuanzhezhaomuVO selectVO(@Param("ew") Wrapper<DiscusszhiyuanzhezhaomuEntity> wrapper);
   	
   	List<DiscusszhiyuanzhezhaomuView> selectListView(Wrapper<DiscusszhiyuanzhezhaomuEntity> wrapper);
   	
   	DiscusszhiyuanzhezhaomuView selectView(@Param("ew") Wrapper<DiscusszhiyuanzhezhaomuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhiyuanzhezhaomuEntity> wrapper);
   	

}

