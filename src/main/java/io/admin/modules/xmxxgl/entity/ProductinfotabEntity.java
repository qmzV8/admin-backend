package io.admin.modules.xmxxgl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@TableName("productinfotab")
public class ProductinfotabEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号，项目ID，sys_guid()
	 */
	@TableId
	private String id;
	/**
	 * 产品名称
	 */
	private String productname;
	/**
	 * 产品描述
	 */
	private String productdescriprion;
	/**
	 * 产品规格
	 */
	private String productspec;
	/**
	 * 产品重量
	 */
	private String productweight;
	/**
	 * 产品体积
	 */
	private String productvolume;
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
	 * 设置：序号，项目ID，sys_guid()
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：序号，项目ID，sys_guid()
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：产品名称
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * 获取：产品名称
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * 设置：产品描述
	 */
	public void setProductdescriprion(String productdescriprion) {
		this.productdescriprion = productdescriprion;
	}
	/**
	 * 获取：产品描述
	 */
	public String getProductdescriprion() {
		return productdescriprion;
	}
	/**
	 * 设置：产品规格
	 */
	public void setProductspec(String productspec) {
		this.productspec = productspec;
	}
	/**
	 * 获取：产品规格
	 */
	public String getProductspec() {
		return productspec;
	}
	/**
	 * 设置：产品重量
	 */
	public void setProductweight(String productweight) {
		this.productweight = productweight;
	}
	/**
	 * 获取：产品重量
	 */
	public String getProductweight() {
		return productweight;
	}
	/**
	 * 设置：产品体积
	 */
	public void setProductvolume(String productvolume) {
		this.productvolume = productvolume;
	}
	/**
	 * 获取：产品体积
	 */
	public String getProductvolume() {
		return productvolume;
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
