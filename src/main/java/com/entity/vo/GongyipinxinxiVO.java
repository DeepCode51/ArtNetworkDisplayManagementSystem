package com.entity.vo;

import com.entity.GongyipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工艺品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-12 23:52:48
 */
public class GongyipinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工艺品类型
	 */
	
	private String gongyipinleixing;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 材质
	 */
	
	private String caizhi;
		
	/**
	 * 制作人
	 */
	
	private String zhizuoren;
		
	/**
	 * 上架时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangjiashijian;
		
	/**
	 * 详情描述
	 */
	
	private String xiangqingmiaoshu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：工艺品类型
	 */
	 
	public void setGongyipinleixing(String gongyipinleixing) {
		this.gongyipinleixing = gongyipinleixing;
	}
	
	/**
	 * 获取：工艺品类型
	 */
	public String getGongyipinleixing() {
		return gongyipinleixing;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：材质
	 */
	 
	public void setCaizhi(String caizhi) {
		this.caizhi = caizhi;
	}
	
	/**
	 * 获取：材质
	 */
	public String getCaizhi() {
		return caizhi;
	}
				
	
	/**
	 * 设置：制作人
	 */
	 
	public void setZhizuoren(String zhizuoren) {
		this.zhizuoren = zhizuoren;
	}
	
	/**
	 * 获取：制作人
	 */
	public String getZhizuoren() {
		return zhizuoren;
	}
				
	
	/**
	 * 设置：上架时间
	 */
	 
	public void setShangjiashijian(Date shangjiashijian) {
		this.shangjiashijian = shangjiashijian;
	}
	
	/**
	 * 获取：上架时间
	 */
	public Date getShangjiashijian() {
		return shangjiashijian;
	}
				
	
	/**
	 * 设置：详情描述
	 */
	 
	public void setXiangqingmiaoshu(String xiangqingmiaoshu) {
		this.xiangqingmiaoshu = xiangqingmiaoshu;
	}
	
	/**
	 * 获取：详情描述
	 */
	public String getXiangqingmiaoshu() {
		return xiangqingmiaoshu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
