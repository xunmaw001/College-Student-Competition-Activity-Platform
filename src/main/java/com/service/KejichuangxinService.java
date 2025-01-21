package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KejichuangxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KejichuangxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KejichuangxinView;


/**
 * 科技创新
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface KejichuangxinService extends IService<KejichuangxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KejichuangxinVO> selectListVO(Wrapper<KejichuangxinEntity> wrapper);
   	
   	KejichuangxinVO selectVO(@Param("ew") Wrapper<KejichuangxinEntity> wrapper);
   	
   	List<KejichuangxinView> selectListView(Wrapper<KejichuangxinEntity> wrapper);
   	
   	KejichuangxinView selectView(@Param("ew") Wrapper<KejichuangxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KejichuangxinEntity> wrapper);
   	

}

