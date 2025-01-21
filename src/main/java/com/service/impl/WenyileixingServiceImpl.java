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


import com.dao.WenyileixingDao;
import com.entity.WenyileixingEntity;
import com.service.WenyileixingService;
import com.entity.vo.WenyileixingVO;
import com.entity.view.WenyileixingView;

@Service("wenyileixingService")
public class WenyileixingServiceImpl extends ServiceImpl<WenyileixingDao, WenyileixingEntity> implements WenyileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenyileixingEntity> page = this.selectPage(
                new Query<WenyileixingEntity>(params).getPage(),
                new EntityWrapper<WenyileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenyileixingEntity> wrapper) {
		  Page<WenyileixingView> page =new Query<WenyileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenyileixingVO> selectListVO(Wrapper<WenyileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenyileixingVO selectVO(Wrapper<WenyileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenyileixingView> selectListView(Wrapper<WenyileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenyileixingView selectView(Wrapper<WenyileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
