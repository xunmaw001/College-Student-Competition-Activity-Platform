package com.dao;

import com.entity.ChuangyeleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuangyeleixingVO;
import com.entity.view.ChuangyeleixingView;


/**
 * 创业类型
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
public interface ChuangyeleixingDao extends BaseMapper<ChuangyeleixingEntity> {
	
	List<ChuangyeleixingVO> selectListVO(@Param("ew") Wrapper<ChuangyeleixingEntity> wrapper);
	
	ChuangyeleixingVO selectVO(@Param("ew") Wrapper<ChuangyeleixingEntity> wrapper);
	
	List<ChuangyeleixingView> selectListView(@Param("ew") Wrapper<ChuangyeleixingEntity> wrapper);

	List<ChuangyeleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ChuangyeleixingEntity> wrapper);
	
	ChuangyeleixingView selectView(@Param("ew") Wrapper<ChuangyeleixingEntity> wrapper);
	

}
