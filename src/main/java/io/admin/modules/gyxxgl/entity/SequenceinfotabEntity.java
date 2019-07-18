package io.admin.modules.gyxxgl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * 工序信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:58:44
 */
@TableName("sequenceinfotab")
public class SequenceinfotabEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号,项目ID,sys_guid()
	 */
	@TableId(value = "id",type = IdType.UUID)
	private String id;
	/**
	 * 工序名称
	 */
	private String sequencename;
	/**
	 * 工序描述
	 */
	private String sequencedescription;
	/**
	 * 工序号
	 */
	private Integer sequencenumber;
	/**
	 * 工艺ID
	 */
	private String routeid;
	/**
	 * 工艺名称
	 */
	private String routename;
	/**
	 * 产品ID
	 */
	private String productid;
	/**
	 * 产品名称
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
	 * 设置：工序名称
	 */
	public void setSequencename(String sequencename) {
		this.sequencename = sequencename;
	}
	/**
	 * 获取：工序名称
	 */
	public String getSequencename() {
		return sequencename;
	}
	/**
	 * 设置：工序描述
	 */
	public void setSequencedescription(String sequencedescription) {
		this.sequencedescription = sequencedescription;
	}
	/**
	 * 获取：工序描述
	 */
	public String getSequencedescription() {
		return sequencedescription;
	}
	/**
	 * 设置：工序号
	 */
	public void setSequencenumber(Integer sequencenumber) {
		this.sequencenumber = sequencenumber;
	}
	/**
	 * 获取：工序号
	 */
	public Integer getSequencenumber() {
		return sequencenumber;
	}
	/**
	 * 设置：工艺ID
	 */
	public void setRouteid(String routeid) {
		this.routeid = routeid;
	}
	/**
	 * 获取：工艺ID
	 */
	public String getRouteid() {
		return routeid;
	}
	/**
	 * 设置：工艺名称
	 */
	public void setRoutename(String routename) {
		this.routename = routename;
	}
	/**
	 * 获取：工艺名称
	 */
	public String getRoutename() {
		return routename;
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
