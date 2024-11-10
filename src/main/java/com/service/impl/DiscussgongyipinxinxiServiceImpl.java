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


import com.dao.DiscussgongyipinxinxiDao;
import com.entity.DiscussgongyipinxinxiEntity;
import com.service.DiscussgongyipinxinxiService;
import com.entity.vo.DiscussgongyipinxinxiVO;
import com.entity.view.DiscussgongyipinxinxiView;

@Service("discussgongyipinxinxiService")
public class DiscussgongyipinxinxiServiceImpl extends ServiceImpl<DiscussgongyipinxinxiDao, DiscussgongyipinxinxiEntity> implements DiscussgongyipinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgongyipinxinxiEntity> page = this.selectPage(
                new Query<DiscussgongyipinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgongyipinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgongyipinxinxiEntity> wrapper) {
		  Page<DiscussgongyipinxinxiView> page =new Query<DiscussgongyipinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgongyipinxinxiVO> selectListVO(Wrapper<DiscussgongyipinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgongyipinxinxiVO selectVO(Wrapper<DiscussgongyipinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgongyipinxinxiView> selectListView(Wrapper<DiscussgongyipinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgongyipinxinxiView selectView(Wrapper<DiscussgongyipinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
