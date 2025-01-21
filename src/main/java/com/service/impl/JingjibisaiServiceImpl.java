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


import com.dao.JingjibisaiDao;
import com.entity.JingjibisaiEntity;
import com.service.JingjibisaiService;
import com.entity.vo.JingjibisaiVO;
import com.entity.view.JingjibisaiView;

@Service("jingjibisaiService")
public class JingjibisaiServiceImpl extends ServiceImpl<JingjibisaiDao, JingjibisaiEntity> implements JingjibisaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingjibisaiEntity> page = this.selectPage(
                new Query<JingjibisaiEntity>(params).getPage(),
                new EntityWrapper<JingjibisaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingjibisaiEntity> wrapper) {
		  Page<JingjibisaiView> page =new Query<JingjibisaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingjibisaiVO> selectListVO(Wrapper<JingjibisaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingjibisaiVO selectVO(Wrapper<JingjibisaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingjibisaiView> selectListView(Wrapper<JingjibisaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingjibisaiView selectView(Wrapper<JingjibisaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
