package com.dao;

import com.entity.JingsaixinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingsaixinwenVO;
import com.entity.view.JingsaixinwenView;


/**
 * 竞赛新闻
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
public interface JingsaixinwenDao extends BaseMapper<JingsaixinwenEntity> {
	
	List<JingsaixinwenVO> selectListVO(@Param("ew") Wrapper<JingsaixinwenEntity> wrapper);
	
	JingsaixinwenVO selectVO(@Param("ew") Wrapper<JingsaixinwenEntity> wrapper);
	
	List<JingsaixinwenView> selectListView(@Param("ew") Wrapper<JingsaixinwenEntity> wrapper);

	List<JingsaixinwenView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaixinwenEntity> wrapper);
	
	JingsaixinwenView selectView(@Param("ew") Wrapper<JingsaixinwenEntity> wrapper);
	

}
