package io.admin.modules.mkxxgl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * 模块输入表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:59:17
 */
@TableName("moduleinputtab")
public class ModuleinputtabEntity implements Serializable {
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
	 * 工艺ID
	 */
	private String routeid;
	/**
	 * 工艺名称
	 */
	private String routesname;
	/**
	 * 工序编号,从1开始编号
	 */
	private Integer sequenceid;
	/**
	 * 工序名称
	 */
	private String sequencename;
	/**
	 * 设备名称
	 */
	private String devicename;
	/**
	 * 输入类型 : 原材料消耗/能源消耗
	 */
	private String inputtype;
	/**
	 * 过程ID
	 */
	private String processid;
	/**
	 * 过程名称=原材料名称
	 */
	private String processname;
	/**
	 * 数量
	 */
	private String amount;
	/**
	 * 单位
	 */
	private String unit;
	/**
	 * 不确定性
	 */
	private String uncertaintytype;
	/**
	 * 最小值
	 */
	private String minvalue;
	/**
	 * 最大值
	 */
	private String maxvalue;
	/**
	 * 备注
	 */
	private String commnets;
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
	public void setRoutesname(String routesname) {
		this.routesname = routesname;
	}
	/**
	 * 获取：工艺名称
	 */
	public String getRoutesname() {
		return routesname;
	}
	/**
	 * 设置：工序编号,从1开始编号
	 */
	public void setSequenceid(Integer sequenceid) {
		this.sequenceid = sequenceid;
	}
	/**
	 * 获取：工序编号,从1开始编号
	 */
	public Integer getSequenceid() {
		return sequenceid;
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
	 * 设置：设备名称
	 */
	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}
	/**
	 * 获取：设备名称
	 */
	public String getDevicename() {
		return devicename;
	}
	/**
	 * 设置：输入类型 : 原材料消耗/能源消耗
	 */
	public void setInputtype(String inputtype) {
		this.inputtype = inputtype;
	}
	/**
	 * 获取：输入类型 : 原材料消耗/能源消耗
	 */
	public String getInputtype() {
		return inputtype;
	}
	/**
	 * 设置：过程ID
	 */
	public void setProcessid(String processid) {
		this.processid = processid;
	}
	/**
	 * 获取：过程ID
	 */
	public String getProcessid() {
		return processid;
	}
	/**
	 * 设置：过程名称=原材料名称
	 */
	public void setProcessname(String processname) {
		this.processname = processname;
	}
	/**
	 * 获取：过程名称=原材料名称
	 */
	public String getProcessname() {
		return processname;
	}
	/**
	 * 设置：数量
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * 获取：数量
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * 设置：单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置：不确定性
	 */
	public void setUncertaintytype(String uncertaintytype) {
		this.uncertaintytype = uncertaintytype;
	}
	/**
	 * 获取：不确定性
	 */
	public String getUncertaintytype() {
		return uncertaintytype;
	}
	/**
	 * 设置：最小值
	 */
	public void setMinvalue(String minvalue) {
		this.minvalue = minvalue;
	}
	/**
	 * 获取：最小值
	 */
	public String getMinvalue() {
		return minvalue;
	}
	/**
	 * 设置：最大值
	 */
	public void setMaxvalue(String maxvalue) {
		this.maxvalue = maxvalue;
	}
	/**
	 * 获取：最大值
	 */
	public String getMaxvalue() {
		return maxvalue;
	}
	/**
	 * 设置：备注
	 */
	public void setCommnets(String commnets) {
		this.commnets = commnets;
	}
	/**
	 * 获取：备注
	 */
	public String getCommnets() {
		return commnets;
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
