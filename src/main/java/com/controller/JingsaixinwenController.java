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

import com.entity.JingsaixinwenEntity;
import com.entity.view.JingsaixinwenView;

import com.service.JingsaixinwenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 竞赛新闻
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-26 15:06:58
 */
@RestController
@RequestMapping("/jingsaixinwen")
public class JingsaixinwenController {
    @Autowired
    private JingsaixinwenService jingsaixinwenService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JingsaixinwenEntity jingsaixinwen, 
		HttpServletRequest request){

        EntityWrapper<JingsaixinwenEntity> ew = new EntityWrapper<JingsaixinwenEntity>();
		PageUtils page = jingsaixinwenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingsaixinwen), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JingsaixinwenEntity jingsaixinwen, 
		HttpServletRequest request){
        EntityWrapper<JingsaixinwenEntity> ew = new EntityWrapper<JingsaixinwenEntity>();
		PageUtils page = jingsaixinwenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingsaixinwen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JingsaixinwenEntity jingsaixinwen){
       	EntityWrapper<JingsaixinwenEntity> ew = new EntityWrapper<JingsaixinwenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jingsaixinwen, "jingsaixinwen")); 
        return R.ok().put("data", jingsaixinwenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JingsaixinwenEntity jingsaixinwen){
        EntityWrapper< JingsaixinwenEntity> ew = new EntityWrapper< JingsaixinwenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jingsaixinwen, "jingsaixinwen")); 
		JingsaixinwenView jingsaixinwenView =  jingsaixinwenService.selectView(ew);
		return R.ok("查询竞赛新闻成功").put("data", jingsaixinwenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JingsaixinwenEntity jingsaixinwen = jingsaixinwenService.selectById(id);
        return R.ok().put("data", jingsaixinwen);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JingsaixinwenEntity jingsaixinwen = jingsaixinwenService.selectById(id);
        return R.ok().put("data", jingsaixinwen);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        JingsaixinwenEntity jingsaixinwen = jingsaixinwenService.selectById(id);
        if(type.equals("1")) {
        	jingsaixinwen.setThumbsupnum(jingsaixinwen.getThumbsupnum()+1);
        } else {
        	jingsaixinwen.setCrazilynum(jingsaixinwen.getCrazilynum()+1);
        }
        jingsaixinwenService.updateById(jingsaixinwen);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JingsaixinwenEntity jingsaixinwen, HttpServletRequest request){
    	jingsaixinwen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingsaixinwen);

        jingsaixinwenService.insert(jingsaixinwen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JingsaixinwenEntity jingsaixinwen, HttpServletRequest request){
    	jingsaixinwen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingsaixinwen);

        jingsaixinwenService.insert(jingsaixinwen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JingsaixinwenEntity jingsaixinwen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jingsaixinwen);
        jingsaixinwenService.updateById(jingsaixinwen);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jingsaixinwenService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JingsaixinwenEntity> wrapper = new EntityWrapper<JingsaixinwenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jingsaixinwenService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
