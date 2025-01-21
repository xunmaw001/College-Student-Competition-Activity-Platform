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


import com.dao.JingsaixinwenDao;
import com.entity.JingsaixinwenEntity;
import com.service.JingsaixinwenService;
import com.entity.vo.JingsaixinwenVO;
import com.entity.view.JingsaixinwenView;

@Service("jingsaixinwenService")
public class JingsaixinwenServiceImpl extends ServiceImpl<JingsaixinwenDao, JingsaixinwenEntity> implements JingsaixinwenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaixinwenEntity> page = this.selectPage(
                new Query<JingsaixinwenEntity>(params).getPage(),
                new EntityWrapper<JingsaixinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaixinwenEntity> wrapper) {
		  Page<JingsaixinwenView> page =new Query<JingsaixinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaixinwenVO> selectListVO(Wrapper<JingsaixinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaixinwenVO selectVO(Wrapper<JingsaixinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaixinwenView> selectListView(Wrapper<JingsaixinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaixinwenView selectView(Wrapper<JingsaixinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
