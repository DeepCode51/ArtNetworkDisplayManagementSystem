package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyipinxinxiView;


/**
 * 工艺品信息
 *
 * @author 
 * @email 
 * @date 2022-02-12 23:52:48
 */
public interface GongyipinxinxiService extends IService<GongyipinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyipinxinxiVO> selectListVO(Wrapper<GongyipinxinxiEntity> wrapper);
   	
   	GongyipinxinxiVO selectVO(@Param("ew") Wrapper<GongyipinxinxiEntity> wrapper);
   	
   	List<GongyipinxinxiView> selectListView(Wrapper<GongyipinxinxiEntity> wrapper);
   	
   	GongyipinxinxiView selectView(@Param("ew") Wrapper<GongyipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyipinxinxiEntity> wrapper);
   	

}

