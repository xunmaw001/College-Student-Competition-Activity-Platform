package com.dao;

import com.entity.KejichuangxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KejichuangxinVO;
import com.entity.view.KejichuangxinView;


/**
 * 科技创新
 * 
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
public interface KejichuangxinDao extends BaseMapper<KejichuangxinEntity> {
	
	List<KejichuangxinVO> selectListVO(@Param("ew") Wrapper<KejichuangxinEntity> wrapper);
	
	KejichuangxinVO selectVO(@Param("ew") Wrapper<KejichuangxinEntity> wrapper);
	
	List<KejichuangxinView> selectListView(@Param("ew") Wrapper<KejichuangxinEntity> wrapper);

	List<KejichuangxinView> selectListView(Pagination page,@Param("ew") Wrapper<KejichuangxinEntity> wrapper);
	
	KejichuangxinView selectView(@Param("ew") Wrapper<KejichuangxinEntity> wrapper);
	

}
