package com.dao;

import com.entity.JingjileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingjileixingVO;
import com.entity.view.JingjileixingView;


/**
 * 竞技类型
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface JingjileixingDao extends BaseMapper<JingjileixingEntity> {
	
	List<JingjileixingVO> selectListVO(@Param("ew") Wrapper<JingjileixingEntity> wrapper);
	
	JingjileixingVO selectVO(@Param("ew") Wrapper<JingjileixingEntity> wrapper);
	
	List<JingjileixingView> selectListView(@Param("ew") Wrapper<JingjileixingEntity> wrapper);

	List<JingjileixingView> selectListView(Pagination page,@Param("ew") Wrapper<JingjileixingEntity> wrapper);
	
	JingjileixingView selectView(@Param("ew") Wrapper<JingjileixingEntity> wrapper);
	

}
