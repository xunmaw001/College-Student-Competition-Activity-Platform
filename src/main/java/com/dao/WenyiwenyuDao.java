package com.dao;

import com.entity.WenyiwenyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenyiwenyuVO;
import com.entity.view.WenyiwenyuView;


/**
 * 文艺文娱
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface WenyiwenyuDao extends BaseMapper<WenyiwenyuEntity> {
	
	List<WenyiwenyuVO> selectListVO(@Param("ew") Wrapper<WenyiwenyuEntity> wrapper);
	
	WenyiwenyuVO selectVO(@Param("ew") Wrapper<WenyiwenyuEntity> wrapper);
	
	List<WenyiwenyuView> selectListView(@Param("ew") Wrapper<WenyiwenyuEntity> wrapper);

	List<WenyiwenyuView> selectListView(Pagination page,@Param("ew") Wrapper<WenyiwenyuEntity> wrapper);
	
	WenyiwenyuView selectView(@Param("ew") Wrapper<WenyiwenyuEntity> wrapper);
	

}
