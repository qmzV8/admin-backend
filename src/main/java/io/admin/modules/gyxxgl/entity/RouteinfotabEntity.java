package io.admin.modules.gyxxgl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * 工艺信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:58:43
 */
@TableName("routeinfotab")
public class RouteinfotabEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号,项目ID,sys_guid()
	 */
	@TableId(value = "id",type = IdType.UUID)
	private String id;
	/**
	 * 工艺名称
	 */
	private String routename;
	/**
	 * 工艺描述
	 */
	private String routedescription;
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
	 * 设置：工艺描述
	 */
	public void setRoutedescription(String routedescription) {
		this.routedescription = routedescription;
	}
	/**
	 * 获取：工艺描述
	 */
	public String getRoutedescription() {
		return routedescription;
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
