package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuangxinchuangyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuangxinchuangyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuangxinchuangyeView;


/**
 * 创新创业
 *
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
public interface ChuangxinchuangyeService extends IService<ChuangxinchuangyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuangxinchuangyeVO> selectListVO(Wrapper<ChuangxinchuangyeEntity> wrapper);
   	
   	ChuangxinchuangyeVO selectVO(@Param("ew") Wrapper<ChuangxinchuangyeEntity> wrapper);
   	
   	List<ChuangxinchuangyeView> selectListView(Wrapper<ChuangxinchuangyeEntity> wrapper);
   	
   	ChuangxinchuangyeView selectView(@Param("ew") Wrapper<ChuangxinchuangyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuangxinchuangyeEntity> wrapper);
   	

}

