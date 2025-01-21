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


import com.dao.KejileixingDao;
import com.entity.KejileixingEntity;
import com.service.KejileixingService;
import com.entity.vo.KejileixingVO;
import com.entity.view.KejileixingView;

@Service("kejileixingService")
public class KejileixingServiceImpl extends ServiceImpl<KejileixingDao, KejileixingEntity> implements KejileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KejileixingEntity> page = this.selectPage(
                new Query<KejileixingEntity>(params).getPage(),
                new EntityWrapper<KejileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KejileixingEntity> wrapper) {
		  Page<KejileixingView> page =new Query<KejileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KejileixingVO> selectListVO(Wrapper<KejileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KejileixingVO selectVO(Wrapper<KejileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KejileixingView> selectListView(Wrapper<KejileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KejileixingView selectView(Wrapper<KejileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
