package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GudianwenxueDao;
import com.entity.GudianwenxueEntity;
import com.service.GudianwenxueService;
import com.entity.vo.GudianwenxueVO;
import com.entity.view.GudianwenxueView;

@Service("gudianwenxueService")
public class GudianwenxueServiceImpl extends ServiceImpl<GudianwenxueDao, GudianwenxueEntity> implements GudianwenxueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GudianwenxueEntity> page = this.selectPage(
                new Query<GudianwenxueEntity>(params).getPage(),
                new EntityWrapper<GudianwenxueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GudianwenxueEntity> wrapper) {
		  Page<GudianwenxueView> page =new Query<GudianwenxueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GudianwenxueVO> selectListVO(Wrapper<GudianwenxueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GudianwenxueVO selectVO(Wrapper<GudianwenxueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GudianwenxueView> selectListView(Wrapper<GudianwenxueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GudianwenxueView selectView(Wrapper<GudianwenxueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
