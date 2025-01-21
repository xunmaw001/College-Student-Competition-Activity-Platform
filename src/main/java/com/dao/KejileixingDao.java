package com.dao;

import com.entity.KejileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KejileixingVO;
import com.entity.view.KejileixingView;


/**
 * 科技类型
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
public interface KejileixingDao extends BaseMapper<KejileixingEntity> {
	
	List<KejileixingVO> selectListVO(@Param("ew") Wrapper<KejileixingEntity> wrapper);
	
	KejileixingVO selectVO(@Param("ew") Wrapper<KejileixingEntity> wrapper);
	
	List<KejileixingView> selectListView(@Param("ew") Wrapper<KejileixingEntity> wrapper);

	List<KejileixingView> selectListView(Pagination page,@Param("ew") Wrapper<KejileixingEntity> wrapper);
	
	KejileixingView selectView(@Param("ew") Wrapper<KejileixingEntity> wrapper);
	

}
