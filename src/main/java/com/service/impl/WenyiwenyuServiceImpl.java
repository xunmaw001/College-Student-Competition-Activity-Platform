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


import com.dao.WenyiwenyuDao;
import com.entity.WenyiwenyuEntity;
import com.service.WenyiwenyuService;
import com.entity.vo.WenyiwenyuVO;
import com.entity.view.WenyiwenyuView;

@Service("wenyiwenyuService")
public class WenyiwenyuServiceImpl extends ServiceImpl<WenyiwenyuDao, WenyiwenyuEntity> implements WenyiwenyuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenyiwenyuEntity> page = this.selectPage(
                new Query<WenyiwenyuEntity>(params).getPage(),
                new EntityWrapper<WenyiwenyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenyiwenyuEntity> wrapper) {
		  Page<WenyiwenyuView> page =new Query<WenyiwenyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenyiwenyuVO> selectListVO(Wrapper<WenyiwenyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenyiwenyuVO selectVO(Wrapper<WenyiwenyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenyiwenyuView> selectListView(Wrapper<WenyiwenyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenyiwenyuView selectView(Wrapper<WenyiwenyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
