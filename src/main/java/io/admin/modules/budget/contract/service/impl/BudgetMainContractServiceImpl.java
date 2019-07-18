package io.admin.modules.budget.contract.service.impl;

import com.alibaba.fastjson.JSONObject;
import io.admin.common.utils.JsonUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;

import io.admin.modules.budget.contract.dao.BudgetMainContractDao;
import io.admin.modules.budget.contract.entity.BudgetMainContractEntity;
import io.admin.modules.budget.contract.service.BudgetMainContractService;


@Service("budgetMainContractService")
public class BudgetMainContractServiceImpl extends ServiceImpl<BudgetMainContractDao, BudgetMainContractEntity> implements BudgetMainContractService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String contractName =  (String)params.get("contractName");

        Page<BudgetMainContractEntity> page = this.selectPage(
                new Query<BudgetMainContractEntity>(params).getPage(),
                new EntityWrapper<BudgetMainContractEntity>()
                    .like(StringUtils.isNotBlank(contractName),"contract_name", contractName)
        );

        return new PageUtils(page);
    }

}
