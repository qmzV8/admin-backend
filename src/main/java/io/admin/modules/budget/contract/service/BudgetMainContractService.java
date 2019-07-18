package io.admin.modules.budget.contract.service;

import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.budget.contract.entity.BudgetMainContractEntity;

import java.util.Map;

/**
 * 合同信息
 *
 * @author Wangcaner
 * @date 2018-06-27 17:25:21
 */
public interface BudgetMainContractService extends IService<BudgetMainContractEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

