package com.dao;

import com.entity.GudianwenxueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GudianwenxueVO;
import com.entity.view.GudianwenxueView;


/**
 * 古典文学
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface GudianwenxueDao extends BaseMapper<GudianwenxueEntity> {
	
	List<GudianwenxueVO> selectListVO(@Param("ew") Wrapper<GudianwenxueEntity> wrapper);
	
	GudianwenxueVO selectVO(@Param("ew") Wrapper<GudianwenxueEntity> wrapper);
	
	List<GudianwenxueView> selectListView(@Param("ew") Wrapper<GudianwenxueEntity> wrapper);

	List<GudianwenxueView> selectListView(Pagination page,@Param("ew") Wrapper<GudianwenxueEntity> wrapper);
	
	GudianwenxueView selectView(@Param("ew") Wrapper<GudianwenxueEntity> wrapper);
	

}
