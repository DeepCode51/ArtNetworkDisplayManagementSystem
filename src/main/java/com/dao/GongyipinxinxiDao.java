package com.dao;

import com.entity.GongyipinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyipinxinxiVO;
import com.entity.view.GongyipinxinxiView;


/**
 * 工艺品信息
 * 
 * @author 
 * @email 
 * @date 2022-02-12 23:52:48
 */
public interface GongyipinxinxiDao extends BaseMapper<GongyipinxinxiEntity> {
	
	List<GongyipinxinxiVO> selectListVO(@Param("ew") Wrapper<GongyipinxinxiEntity> wrapper);
	
	GongyipinxinxiVO selectVO(@Param("ew") Wrapper<GongyipinxinxiEntity> wrapper);
	
	List<GongyipinxinxiView> selectListView(@Param("ew") Wrapper<GongyipinxinxiEntity> wrapper);

	List<GongyipinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongyipinxinxiEntity> wrapper);
	
	GongyipinxinxiView selectView(@Param("ew") Wrapper<GongyipinxinxiEntity> wrapper);
	

}
