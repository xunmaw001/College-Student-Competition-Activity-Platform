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


import com.dao.ChuangyeleixingDao;
import com.entity.ChuangyeleixingEntity;
import com.service.ChuangyeleixingService;
import com.entity.vo.ChuangyeleixingVO;
import com.entity.view.ChuangyeleixingView;

@Service("chuangyeleixingService")
public class ChuangyeleixingServiceImpl extends ServiceImpl<ChuangyeleixingDao, ChuangyeleixingEntity> implements ChuangyeleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuangyeleixingEntity> page = this.selectPage(
                new Query<ChuangyeleixingEntity>(params).getPage(),
                new EntityWrapper<ChuangyeleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuangyeleixingEntity> wrapper) {
		  Page<ChuangyeleixingView> page =new Query<ChuangyeleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuangyeleixingVO> selectListVO(Wrapper<ChuangyeleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuangyeleixingVO selectVO(Wrapper<ChuangyeleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuangyeleixingView> selectListView(Wrapper<ChuangyeleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuangyeleixingView selectView(Wrapper<ChuangyeleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
