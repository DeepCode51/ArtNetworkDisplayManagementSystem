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


import com.dao.GongyipinfenleiDao;
import com.entity.GongyipinfenleiEntity;
import com.service.GongyipinfenleiService;
import com.entity.vo.GongyipinfenleiVO;
import com.entity.view.GongyipinfenleiView;

@Service("gongyipinfenleiService")
public class GongyipinfenleiServiceImpl extends ServiceImpl<GongyipinfenleiDao, GongyipinfenleiEntity> implements GongyipinfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyipinfenleiEntity> page = this.selectPage(
                new Query<GongyipinfenleiEntity>(params).getPage(),
                new EntityWrapper<GongyipinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyipinfenleiEntity> wrapper) {
		  Page<GongyipinfenleiView> page =new Query<GongyipinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyipinfenleiVO> selectListVO(Wrapper<GongyipinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyipinfenleiVO selectVO(Wrapper<GongyipinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyipinfenleiView> selectListView(Wrapper<GongyipinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyipinfenleiView selectView(Wrapper<GongyipinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
