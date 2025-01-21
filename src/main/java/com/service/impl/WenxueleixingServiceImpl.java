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


import com.dao.WenxueleixingDao;
import com.entity.WenxueleixingEntity;
import com.service.WenxueleixingService;
import com.entity.vo.WenxueleixingVO;
import com.entity.view.WenxueleixingView;

@Service("wenxueleixingService")
public class WenxueleixingServiceImpl extends ServiceImpl<WenxueleixingDao, WenxueleixingEntity> implements WenxueleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenxueleixingEntity> page = this.selectPage(
                new Query<WenxueleixingEntity>(params).getPage(),
                new EntityWrapper<WenxueleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenxueleixingEntity> wrapper) {
		  Page<WenxueleixingView> page =new Query<WenxueleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenxueleixingVO> selectListVO(Wrapper<WenxueleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenxueleixingVO selectVO(Wrapper<WenxueleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenxueleixingView> selectListView(Wrapper<WenxueleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenxueleixingView selectView(Wrapper<WenxueleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
