package io.admin.modules.mkxxgl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * 模块信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:59:17
 */
@TableName("moduleinfotab")
public class ModuleinfotabEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号,项目ID,sys_guid()
	 */
	@TableId(value = "id",type = IdType.UUID)
	private String id;
	/**
	 * 产品模块编码,产品编码M001
	 */
	private String modulecode;
	/**
	 * 产品模块名称
	 */
	private String modulename;
	/**
	 * 模块分类
	 */
	private String modulecategory;
	/**
	 * 产品ID
	 */
	private String productid;
	/**
	 * 产品名称
	 */
	private String productname;
	/**
	 * 模块功能描述
	 */
	private String modulefunction;
	/**
	 * 模块划分方法
	 */
	private String modulemethod;
	/**
	 * 产品系统描述
	 */
	private String modulesystem;
	/**
	 * 功能单元
	 */
	private String modulefununit;
	/**
	 * 时限
	 */
	private String modulephase;
	/**
	 * 地理
	 */
	private String modulegeography;
	/**
	 * 技术代表性
	 */
	private String modulerepresentative;
	/**
	 * 数据来源描述
	 */
	private String moduledatasource;
	/**
	 * 截断准则
	 */
	private String modulecutoff;
	/**
	 * 分配原则
	 */
	private String moduleallocation;
	/**
	 * 适用范围
	 */
	private String scopeapplication;
	/**
	 * 数据质量
	 */
	private String dataqaulity;
	/**
	 * 版本号
	 */
	private String version;
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
	 * 设置：产品模块编码,产品编码M001
	 */
	public void setModulecode(String modulecode) {
		this.modulecode = modulecode;
	}
	/**
	 * 获取：产品模块编码,产品编码M001
	 */
	public String getModulecode() {
		return modulecode;
	}
	/**
	 * 设置：产品模块名称
	 */
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	/**
	 * 获取：产品模块名称
	 */
	public String getModulename() {
		return modulename;
	}
	/**
	 * 设置：模块分类
	 */
	public void setModulecategory(String modulecategory) {
		this.modulecategory = modulecategory;
	}
	/**
	 * 获取：模块分类
	 */
	public String getModulecategory() {
		return modulecategory;
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
	 * 设置：模块功能描述
	 */
	public void setModulefunction(String modulefunction) {
		this.modulefunction = modulefunction;
	}
	/**
	 * 获取：模块功能描述
	 */
	public String getModulefunction() {
		return modulefunction;
	}
	/**
	 * 设置：模块划分方法
	 */
	public void setModulemethod(String modulemethod) {
		this.modulemethod = modulemethod;
	}
	/**
	 * 获取：模块划分方法
	 */
	public String getModulemethod() {
		return modulemethod;
	}
	/**
	 * 设置：产品系统描述
	 */
	public void setModulesystem(String modulesystem) {
		this.modulesystem = modulesystem;
	}
	/**
	 * 获取：产品系统描述
	 */
	public String getModulesystem() {
		return modulesystem;
	}
	/**
	 * 设置：功能单元
	 */
	public void setModulefununit(String modulefununit) {
		this.modulefununit = modulefununit;
	}
	/**
	 * 获取：功能单元
	 */
	public String getModulefununit() {
		return modulefununit;
	}
	/**
	 * 设置：时限
	 */
	public void setModulephase(String modulephase) {
		this.modulephase = modulephase;
	}
	/**
	 * 获取：时限
	 */
	public String getModulephase() {
		return modulephase;
	}
	/**
	 * 设置：地理
	 */
	public void setModulegeography(String modulegeography) {
		this.modulegeography = modulegeography;
	}
	/**
	 * 获取：地理
	 */
	public String getModulegeography() {
		return modulegeography;
	}
	/**
	 * 设置：技术代表性
	 */
	public void setModulerepresentative(String modulerepresentative) {
		this.modulerepresentative = modulerepresentative;
	}
	/**
	 * 获取：技术代表性
	 */
	public String getModulerepresentative() {
		return modulerepresentative;
	}
	/**
	 * 设置：数据来源描述
	 */
	public void setModuledatasource(String moduledatasource) {
		this.moduledatasource = moduledatasource;
	}
	/**
	 * 获取：数据来源描述
	 */
	public String getModuledatasource() {
		return moduledatasource;
	}
	/**
	 * 设置：截断准则
	 */
	public void setModulecutoff(String modulecutoff) {
		this.modulecutoff = modulecutoff;
	}
	/**
	 * 获取：截断准则
	 */
	public String getModulecutoff() {
		return modulecutoff;
	}
	/**
	 * 设置：分配原则
	 */
	public void setModuleallocation(String moduleallocation) {
		this.moduleallocation = moduleallocation;
	}
	/**
	 * 获取：分配原则
	 */
	public String getModuleallocation() {
		return moduleallocation;
	}
	/**
	 * 设置：适用范围
	 */
	public void setScopeapplication(String scopeapplication) {
		this.scopeapplication = scopeapplication;
	}
	/**
	 * 获取：适用范围
	 */
	public String getScopeapplication() {
		return scopeapplication;
	}
	/**
	 * 设置：数据质量
	 */
	public void setDataqaulity(String dataqaulity) {
		this.dataqaulity = dataqaulity;
	}
	/**
	 * 获取：数据质量
	 */
	public String getDataqaulity() {
		return dataqaulity;
	}
	/**
	 * 设置：版本号
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * 获取：版本号
	 */
	public String getVersion() {
		return version;
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
