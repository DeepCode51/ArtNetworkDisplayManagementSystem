package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgongyipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgongyipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgongyipinxinxiView;


/**
 * 工艺品信息评论表
 *
 * @author 
 * @email 
 * @date 2022-02-12 23:52:48
 */
public interface DiscussgongyipinxinxiService extends IService<DiscussgongyipinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgongyipinxinxiVO> selectListVO(Wrapper<DiscussgongyipinxinxiEntity> wrapper);
   	
   	DiscussgongyipinxinxiVO selectVO(@Param("ew") Wrapper<DiscussgongyipinxinxiEntity> wrapper);
   	
   	List<DiscussgongyipinxinxiView> selectListView(Wrapper<DiscussgongyipinxinxiEntity> wrapper);
   	
   	DiscussgongyipinxinxiView selectView(@Param("ew") Wrapper<DiscussgongyipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgongyipinxinxiEntity> wrapper);
   	

}

