package com.dao;

import com.entity.WenxueleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenxueleixingVO;
import com.entity.view.WenxueleixingView;


/**
 * 文学类型
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface WenxueleixingDao extends BaseMapper<WenxueleixingEntity> {
	
	List<WenxueleixingVO> selectListVO(@Param("ew") Wrapper<WenxueleixingEntity> wrapper);
	
	WenxueleixingVO selectVO(@Param("ew") Wrapper<WenxueleixingEntity> wrapper);
	
	List<WenxueleixingView> selectListView(@Param("ew") Wrapper<WenxueleixingEntity> wrapper);

	List<WenxueleixingView> selectListView(Pagination page,@Param("ew") Wrapper<WenxueleixingEntity> wrapper);
	
	WenxueleixingView selectView(@Param("ew") Wrapper<WenxueleixingEntity> wrapper);
	

}
