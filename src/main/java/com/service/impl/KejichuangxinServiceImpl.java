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


import com.dao.KejichuangxinDao;
import com.entity.KejichuangxinEntity;
import com.service.KejichuangxinService;
import com.entity.vo.KejichuangxinVO;
import com.entity.view.KejichuangxinView;

@Service("kejichuangxinService")
public class KejichuangxinServiceImpl extends ServiceImpl<KejichuangxinDao, KejichuangxinEntity> implements KejichuangxinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KejichuangxinEntity> page = this.selectPage(
                new Query<KejichuangxinEntity>(params).getPage(),
                new EntityWrapper<KejichuangxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KejichuangxinEntity> wrapper) {
		  Page<KejichuangxinView> page =new Query<KejichuangxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KejichuangxinVO> selectListVO(Wrapper<KejichuangxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KejichuangxinVO selectVO(Wrapper<KejichuangxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KejichuangxinView> selectListView(Wrapper<KejichuangxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KejichuangxinView selectView(Wrapper<KejichuangxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
