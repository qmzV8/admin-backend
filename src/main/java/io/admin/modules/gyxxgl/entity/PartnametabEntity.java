package io.admin.modules.gyxxgl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品部件表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:57:13
 */
@TableName("partnametab")
public class PartnametabEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号,项目ID,sys_guid()
	 */
	@TableId
	private String id;
	/**
	 * 产品名称
	 */
	private String productclassname;
	/**
	 * 产品描述
	 */
	private String productclassdesp;
	/**
	 * 创建时间
	 */
	private Date createdate;
	/**
	 * 最后更新时间
	 */
	private Date lastchange;
	/**
	 * 数据创建者ID
	 */
	private String datacreatorId;
	/**
	 * 数据创建者
	 */
	private String datacreatorName;

	/**
	 * 设置：序号,项目ID,sys_guid()
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：序号,项目ID,sys_guid()
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：产品名称
	 */
	public void setProductclassname(String productclassname) {
		this.productclassname = productclassname;
	}
	/**
	 * 获取：产品名称
	 */
	public String getProductclassname() {
		return productclassname;
	}
	/**
	 * 设置：产品描述
	 */
	public void setProductclassdesp(String productclassdesp) {
		this.productclassdesp = productclassdesp;
	}
	/**
	 * 获取：产品描述
	 */
	public String getProductclassdesp() {
		return productclassdesp;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatedate() {
		return createdate;
	}
	/**
	 * 设置：最后更新时间
	 */
	public void setLastchange(Date lastchange) {
		this.lastchange = lastchange;
	}
	/**
	 * 获取：最后更新时间
	 */
	public Date getLastchange() {
		return lastchange;
	}
	/**
	 * 设置：数据创建者ID
	 */
	public void setDatacreatorId(String datacreatorId) {
		this.datacreatorId = datacreatorId;
	}
	/**
	 * 获取：数据创建者ID
	 */
	public String getDatacreatorId() {
		return datacreatorId;
	}
	/**
	 * 设置：数据创建者
	 */
	public void setDatacreatorName(String datacreatorName) {
		this.datacreatorName = datacreatorName;
	}
	/**
	 * 获取：数据创建者
	 */
	public String getDatacreatorName() {
		return datacreatorName;
	}
}
