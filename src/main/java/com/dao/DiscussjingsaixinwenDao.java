package com.dao;

import com.entity.DiscussjingsaixinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingsaixinwenVO;
import com.entity.view.DiscussjingsaixinwenView;


/**
 * 竞赛新闻评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface DiscussjingsaixinwenDao extends BaseMapper<DiscussjingsaixinwenEntity> {
	
	List<DiscussjingsaixinwenVO> selectListVO(@Param("ew") Wrapper<DiscussjingsaixinwenEntity> wrapper);
	
	DiscussjingsaixinwenVO selectVO(@Param("ew") Wrapper<DiscussjingsaixinwenEntity> wrapper);
	
	List<DiscussjingsaixinwenView> selectListView(@Param("ew") Wrapper<DiscussjingsaixinwenEntity> wrapper);

	List<DiscussjingsaixinwenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingsaixinwenEntity> wrapper);
	
	DiscussjingsaixinwenView selectView(@Param("ew") Wrapper<DiscussjingsaixinwenEntity> wrapper);
	

}
