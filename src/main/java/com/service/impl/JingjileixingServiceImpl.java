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


import com.dao.JingjileixingDao;
import com.entity.JingjileixingEntity;
import com.service.JingjileixingService;
import com.entity.vo.JingjileixingVO;
import com.entity.view.JingjileixingView;

@Service("jingjileixingService")
public class JingjileixingServiceImpl extends ServiceImpl<JingjileixingDao, JingjileixingEntity> implements JingjileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingjileixingEntity> page = this.selectPage(
                new Query<JingjileixingEntity>(params).getPage(),
                new EntityWrapper<JingjileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingjileixingEntity> wrapper) {
		  Page<JingjileixingView> page =new Query<JingjileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingjileixingVO> selectListVO(Wrapper<JingjileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingjileixingVO selectVO(Wrapper<JingjileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingjileixingView> selectListView(Wrapper<JingjileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingjileixingView selectView(Wrapper<JingjileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
