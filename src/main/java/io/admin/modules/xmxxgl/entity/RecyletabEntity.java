package io.admin.modules.xmxxgl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 回收阶段数据采集表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@TableName("recyletab")
public class RecyletabEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	private Integer id;
	/**
	 * LCA阶段编码
	 */
	private String phaseid;
	/**
	 * LCA阶段名称
	 */
	private String phasename;
	/**
	 * 过程ID,卡车运输
	 */
	private String processid;
	/**
	 * 过程名称
	 */
	private String processname;
	/**
	 * 数量,消耗量 159.8
	 */
	private String amount;
	/**
	 * 单位,公里
	 */
	private String unit;
	/**
	 * 项目ID
	 */
	private String projectid;
	/**
	 * 项目名称
	 */
	private String projectname;
	/**
	 * 产品ID
	 */
	private String productid;
	/**
	 * 产品名称,来自产品信息表
	 */
	private String productname;
	/**
	 * 创建时间
	 */
	private Date createtime;
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
	 * 数据拥有者ID
	 */
	private String dataownerId;
	/**
	 * 数据拥有者
	 */
	private String dataownerName;

	/**
	 * 设置：序号
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：序号
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：LCA阶段编码
	 */
	public void setPhaseid(String phaseid) {
		this.phaseid = phaseid;
	}
	/**
	 * 获取：LCA阶段编码
	 */
	public String getPhaseid() {
		return phaseid;
	}
	/**
	 * 设置：LCA阶段名称
	 */
	public void setPhasename(String phasename) {
		this.phasename = phasename;
	}
	/**
	 * 获取：LCA阶段名称
	 */
	public String getPhasename() {
		return phasename;
	}
	/**
	 * 设置：过程ID,卡车运输
	 */
	public void setProcessid(String processid) {
		this.processid = processid;
	}
	/**
	 * 获取：过程ID,卡车运输
	 */
	public String getProcessid() {
		return processid;
	}
	/**
	 * 设置：过程名称
	 */
	public void setProcessname(String processname) {
		this.processname = processname;
	}
	/**
	 * 获取：过程名称
	 */
	public String getProcessname() {
		return processname;
	}
	/**
	 * 设置：数量,消耗量 159.8
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * 获取：数量,消耗量 159.8
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * 设置：单位,公里
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位,公里
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置：项目ID
	 */
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	/**
	 * 获取：项目ID
	 */
	public String getProjectid() {
		return projectid;
	}
	/**
	 * 设置：项目名称
	 */
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	/**
	 * 获取：项目名称
	 */
	public String getProjectname() {
		return projectname;
	}
	/**
	 * 设置：产品ID
	 */
	public void setProductid(String productid) {
		this.productid = productid;
	}
	/**
	 * 获取：产品ID
	 */
	public String getProductid() {
		return productid;
	}
	/**
	 * 设置：产品名称,来自产品信息表
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * 获取：产品名称,来自产品信息表
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatetime() {
		return createtime;
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
	/**
	 * 设置：数据拥有者ID
	 */
	public void setDataownerId(String dataownerId) {
		this.dataownerId = dataownerId;
	}
	/**
	 * 获取：数据拥有者ID
	 */
	public String getDataownerId() {
		return dataownerId;
	}
	/**
	 * 设置：数据拥有者
	 */
	public void setDataownerName(String dataownerName) {
		this.dataownerName = dataownerName;
	}
	/**
	 * 获取：数据拥有者
	 */
	public String getDataownerName() {
		return dataownerName;
	}
}
