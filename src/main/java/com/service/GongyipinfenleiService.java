package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyipinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyipinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyipinfenleiView;


/**
 * 工艺品分类
 *
 * @author 
 * @email 
 * @date 2022-02-12 23:52:48
 */
public interface GongyipinfenleiService extends IService<GongyipinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyipinfenleiVO> selectListVO(Wrapper<GongyipinfenleiEntity> wrapper);
   	
   	GongyipinfenleiVO selectVO(@Param("ew") Wrapper<GongyipinfenleiEntity> wrapper);
   	
   	List<GongyipinfenleiView> selectListView(Wrapper<GongyipinfenleiEntity> wrapper);
   	
   	GongyipinfenleiView selectView(@Param("ew") Wrapper<GongyipinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyipinfenleiEntity> wrapper);
   	

}

