package io.admin.modules.budget.contract.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 合同信息
 * 
 * @author Wangcaner
 * @date 2018-06-27 17:25:21
 */

@Data
@TableName("budget_main_contract")
public class BudgetMainContractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long contractId;
	/**
	 * 项目名称
	 */
	private String contractName;
	/**
	 * 项目类型
	 */
	private String contractCategory;
	/**
	 * 项目地点
	 */
	private String contactLocation;
	/**
	 * 项目截止日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date contractDeadline;
	/**
	 * 定额类型
	 */
	private String contractQuota;
	/**
	 * 创建时间
	 */
	@CreatedDate
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
