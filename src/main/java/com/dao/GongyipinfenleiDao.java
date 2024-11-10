package com.dao;

import com.entity.GongyipinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyipinfenleiVO;
import com.entity.view.GongyipinfenleiView;


/**
 * 工艺品分类
 * 
 * @author 
 * @email 
 * @date 2022-02-12 23:52:48
 */
public interface GongyipinfenleiDao extends BaseMapper<GongyipinfenleiEntity> {
	
	List<GongyipinfenleiVO> selectListVO(@Param("ew") Wrapper<GongyipinfenleiEntity> wrapper);
	
	GongyipinfenleiVO selectVO(@Param("ew") Wrapper<GongyipinfenleiEntity> wrapper);
	
	List<GongyipinfenleiView> selectListView(@Param("ew") Wrapper<GongyipinfenleiEntity> wrapper);

	List<GongyipinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<GongyipinfenleiEntity> wrapper);
	
	GongyipinfenleiView selectView(@Param("ew") Wrapper<GongyipinfenleiEntity> wrapper);
	

}
