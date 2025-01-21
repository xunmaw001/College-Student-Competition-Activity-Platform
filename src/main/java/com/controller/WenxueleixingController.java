package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WenxueleixingEntity;
import com.entity.view.WenxueleixingView;

import com.service.WenxueleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 文学类型
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-26 15:06:59
 */
@RestController
@RequestMapping("/wenxueleixing")
public class WenxueleixingController {
    @Autowired
    private WenxueleixingService wenxueleixingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenxueleixingEntity wenxueleixing, 
		HttpServletRequest request){

        EntityWrapper<WenxueleixingEntity> ew = new EntityWrapper<WenxueleixingEntity>();
		PageUtils page = wenxueleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenxueleixing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenxueleixingEntity wenxueleixing, 
		HttpServletRequest request){
        EntityWrapper<WenxueleixingEntity> ew = new EntityWrapper<WenxueleixingEntity>();
		PageUtils page = wenxueleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenxueleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenxueleixingEntity wenxueleixing){
       	EntityWrapper<WenxueleixingEntity> ew = new EntityWrapper<WenxueleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenxueleixing, "wenxueleixing")); 
        return R.ok().put("data", wenxueleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenxueleixingEntity wenxueleixing){
        EntityWrapper< WenxueleixingEntity> ew = new EntityWrapper< WenxueleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenxueleixing, "wenxueleixing")); 
		WenxueleixingView wenxueleixingView =  wenxueleixingService.selectView(ew);
		return R.ok("查询文学类型成功").put("data", wenxueleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenxueleixingEntity wenxueleixing = wenxueleixingService.selectById(id);
        return R.ok().put("data", wenxueleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenxueleixingEntity wenxueleixing = wenxueleixingService.selectById(id);
        return R.ok().put("data", wenxueleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenxueleixingEntity wenxueleixing, HttpServletRequest request){
    	wenxueleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenxueleixing);

        wenxueleixingService.insert(wenxueleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenxueleixingEntity wenxueleixing, HttpServletRequest request){
    	wenxueleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenxueleixing);

        wenxueleixingService.insert(wenxueleixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenxueleixingEntity wenxueleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenxueleixing);
        wenxueleixingService.updateById(wenxueleixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenxueleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WenxueleixingEntity> wrapper = new EntityWrapper<WenxueleixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = wenxueleixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
