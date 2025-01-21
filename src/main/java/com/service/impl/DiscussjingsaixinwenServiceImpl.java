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


import com.dao.DiscussjingsaixinwenDao;
import com.entity.DiscussjingsaixinwenEntity;
import com.service.DiscussjingsaixinwenService;
import com.entity.vo.DiscussjingsaixinwenVO;
import com.entity.view.DiscussjingsaixinwenView;

@Service("discussjingsaixinwenService")
public class DiscussjingsaixinwenServiceImpl extends ServiceImpl<DiscussjingsaixinwenDao, DiscussjingsaixinwenEntity> implements DiscussjingsaixinwenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingsaixinwenEntity> page = this.selectPage(
                new Query<DiscussjingsaixinwenEntity>(params).getPage(),
                new EntityWrapper<DiscussjingsaixinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingsaixinwenEntity> wrapper) {
		  Page<DiscussjingsaixinwenView> page =new Query<DiscussjingsaixinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingsaixinwenVO> selectListVO(Wrapper<DiscussjingsaixinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingsaixinwenVO selectVO(Wrapper<DiscussjingsaixinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingsaixinwenView> selectListView(Wrapper<DiscussjingsaixinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingsaixinwenView selectView(Wrapper<DiscussjingsaixinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
