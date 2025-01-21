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


import com.dao.WaiyuyuyanDao;
import com.entity.WaiyuyuyanEntity;
import com.service.WaiyuyuyanService;
import com.entity.vo.WaiyuyuyanVO;
import com.entity.view.WaiyuyuyanView;

@Service("waiyuyuyanService")
public class WaiyuyuyanServiceImpl extends ServiceImpl<WaiyuyuyanDao, WaiyuyuyanEntity> implements WaiyuyuyanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaiyuyuyanEntity> page = this.selectPage(
                new Query<WaiyuyuyanEntity>(params).getPage(),
                new EntityWrapper<WaiyuyuyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaiyuyuyanEntity> wrapper) {
		  Page<WaiyuyuyanView> page =new Query<WaiyuyuyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaiyuyuyanVO> selectListVO(Wrapper<WaiyuyuyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaiyuyuyanVO selectVO(Wrapper<WaiyuyuyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaiyuyuyanView> selectListView(Wrapper<WaiyuyuyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaiyuyuyanView selectView(Wrapper<WaiyuyuyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
