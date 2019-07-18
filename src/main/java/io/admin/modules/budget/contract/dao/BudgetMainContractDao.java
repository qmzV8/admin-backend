package io.admin.modules.budget.contract.dao;

import io.admin.modules.budget.contract.entity.BudgetMainContractEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 合同信息
 * 
 * @author Wangcaner
 * @date 2018-06-27 17:25:21
 */
@Mapper
public interface BudgetMainContractDao extends BaseMapper<BudgetMainContractEntity> {
	
}
