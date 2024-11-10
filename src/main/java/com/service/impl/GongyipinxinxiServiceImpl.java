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


import com.dao.GongyipinxinxiDao;
import com.entity.GongyipinxinxiEntity;
import com.service.GongyipinxinxiService;
import com.entity.vo.GongyipinxinxiVO;
import com.entity.view.GongyipinxinxiView;

@Service("gongyipinxinxiService")
public class GongyipinxinxiServiceImpl extends ServiceImpl<GongyipinxinxiDao, GongyipinxinxiEntity> implements GongyipinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyipinxinxiEntity> page = this.selectPage(
                new Query<GongyipinxinxiEntity>(params).getPage(),
                new EntityWrapper<GongyipinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyipinxinxiEntity> wrapper) {
		  Page<GongyipinxinxiView> page =new Query<GongyipinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyipinxinxiVO> selectListVO(Wrapper<GongyipinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyipinxinxiVO selectVO(Wrapper<GongyipinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyipinxinxiView> selectListView(Wrapper<GongyipinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyipinxinxiView selectView(Wrapper<GongyipinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
