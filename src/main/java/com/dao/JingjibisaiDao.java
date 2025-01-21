package com.dao;

import com.entity.JingjibisaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingjibisaiVO;
import com.entity.view.JingjibisaiView;


/**
 * 竞技比赛
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface JingjibisaiDao extends BaseMapper<JingjibisaiEntity> {
	
	List<JingjibisaiVO> selectListVO(@Param("ew") Wrapper<JingjibisaiEntity> wrapper);
	
	JingjibisaiVO selectVO(@Param("ew") Wrapper<JingjibisaiEntity> wrapper);
	
	List<JingjibisaiView> selectListView(@Param("ew") Wrapper<JingjibisaiEntity> wrapper);

	List<JingjibisaiView> selectListView(Pagination page,@Param("ew") Wrapper<JingjibisaiEntity> wrapper);
	
	JingjibisaiView selectView(@Param("ew") Wrapper<JingjibisaiEntity> wrapper);
	

}
