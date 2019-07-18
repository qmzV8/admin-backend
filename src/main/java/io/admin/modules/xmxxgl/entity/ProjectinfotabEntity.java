package io.admin.modules.xmxxgl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * 项目信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@TableName("projectinfotab")
public class ProjectinfotabEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号，项目ID，sys_guid()
	 */
	@TableId(value = "id",type = IdType.UUID)
	private String id;
	/**
	 * 项目名称
	 */
	private String projectname;
	/**
	 * 项目描述
	 */
	private String projectdescription;
	/**
	 * 产品ID
	 */
	private String productid;
	/**
	 * 产品名称，来自产品信息表
	 */
	private String productname;
	/**
	 * 产品描述
	 */
	private String techdescriprion;
	/**
	 * 应用目的
	 */
	private String goal;
	/**
	 * 系统边界
	 */
	private String systemboundary;
	/**
	 * 项目建模
	 */
	private String modeling;
	/**
	 * 分配方法
	 */
	private String allocation;
	/**
	 * 功能单位
	 */
	private String funcunit;
	/**
	 * 评价结果
	 */
	private String assessmentresult;
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
	 * 设置：项目描述
	 */
	public void setProjectdescription(String projectdescription) {
		this.projectdescription = projectdescription;
	}
	/**
	 * 获取：项目描述
	 */
	public String getProjectdescription() {
		return projectdescription;
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
	 * 设置：产品名称，来自产品信息表
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * 获取：产品名称，来自产品信息表
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * 设置：产品描述
	 */
	public void setTechdescriprion(String techdescriprion) {
		this.techdescriprion = techdescriprion;
	}
	/**
	 * 获取：产品描述
	 */
	public String getTechdescriprion() {
		return techdescriprion;
	}
	/**
	 * 设置：应用目的
	 */
	public void setGoal(String goal) {
		this.goal = goal;
	}
	/**
	 * 获取：应用目的
	 */
	public String getGoal() {
		return goal;
	}
	/**
	 * 设置：系统边界
	 */
	public void setSystemboundary(String systemboundary) {
		this.systemboundary = systemboundary;
	}
	/**
	 * 获取：系统边界
	 */
	public String getSystemboundary() {
		return systemboundary;
	}
	/**
	 * 设置：项目建模
	 */
	public void setModeling(String modeling) {
		this.modeling = modeling;
	}
	/**
	 * 获取：项目建模
	 */
	public String getModeling() {
		return modeling;
	}
	/**
	 * 设置：分配方法
	 */
	public void setAllocation(String allocation) {
		this.allocation = allocation;
	}
	/**
	 * 获取：分配方法
	 */
	public String getAllocation() {
		return allocation;
	}
	/**
	 * 设置：功能单位
	 */
	public void setFuncunit(String funcunit) {
		this.funcunit = funcunit;
	}
	/**
	 * 获取：功能单位
	 */
	public String getFuncunit() {
		return funcunit;
	}
	/**
	 * 设置：评价结果
	 */
	public void setAssessmentresult(String assessmentresult) {
		this.assessmentresult = assessmentresult;
	}
	/**
	 * 获取：评价结果
	 */
	public String getAssessmentresult() {
		return assessmentresult;
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
