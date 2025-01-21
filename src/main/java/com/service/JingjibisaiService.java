package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingjibisaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingjibisaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingjibisaiView;


/**
 * 竞技比赛
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface JingjibisaiService extends IService<JingjibisaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingjibisaiVO> selectListVO(Wrapper<JingjibisaiEntity> wrapper);
   	
   	JingjibisaiVO selectVO(@Param("ew") Wrapper<JingjibisaiEntity> wrapper);
   	
   	List<JingjibisaiView> selectListView(Wrapper<JingjibisaiEntity> wrapper);
   	
   	JingjibisaiView selectView(@Param("ew") Wrapper<JingjibisaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingjibisaiEntity> wrapper);
   	

}

