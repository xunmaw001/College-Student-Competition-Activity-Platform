package com.dao;

import com.entity.WaiyuyuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaiyuyuyanVO;
import com.entity.view.WaiyuyuyanView;


/**
 * 外语语言
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface WaiyuyuyanDao extends BaseMapper<WaiyuyuyanEntity> {
	
	List<WaiyuyuyanVO> selectListVO(@Param("ew") Wrapper<WaiyuyuyanEntity> wrapper);
	
	WaiyuyuyanVO selectVO(@Param("ew") Wrapper<WaiyuyuyanEntity> wrapper);
	
	List<WaiyuyuyanView> selectListView(@Param("ew") Wrapper<WaiyuyuyanEntity> wrapper);

	List<WaiyuyuyanView> selectListView(Pagination page,@Param("ew") Wrapper<WaiyuyuyanEntity> wrapper);
	
	WaiyuyuyanView selectView(@Param("ew") Wrapper<WaiyuyuyanEntity> wrapper);
	

}
