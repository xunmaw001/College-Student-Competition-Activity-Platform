package com.dao;

import com.entity.WenyileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenyileixingVO;
import com.entity.view.WenyileixingView;


/**
 * 文艺类型
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface WenyileixingDao extends BaseMapper<WenyileixingEntity> {
	
	List<WenyileixingVO> selectListVO(@Param("ew") Wrapper<WenyileixingEntity> wrapper);
	
	WenyileixingVO selectVO(@Param("ew") Wrapper<WenyileixingEntity> wrapper);
	
	List<WenyileixingView> selectListView(@Param("ew") Wrapper<WenyileixingEntity> wrapper);

	List<WenyileixingView> selectListView(Pagination page,@Param("ew") Wrapper<WenyileixingEntity> wrapper);
	
	WenyileixingView selectView(@Param("ew") Wrapper<WenyileixingEntity> wrapper);
	

}
