package io.admin.modules.budget.contract.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.admin.modules.budget.contract.entity.BudgetMainContractEntity;
import io.admin.modules.budget.contract.service.BudgetMainContractService;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;



/**
 * 合同信息
 *
 * @author Wangcaner
 * @date 2018-06-27 17:25:21
 */
@RestController
@RequestMapping("budget/contract/mainContract")
public class BudgetMainContractController {
    @Autowired
    private BudgetMainContractService budgetMainContractService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("budget:mainContract:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = budgetMainContractService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{contractId}")
    @RequiresPermissions("budget:mainContract:info")
    public R info(@PathVariable("contractId") Long contractId){
		BudgetMainContractEntity budgetMainContract = budgetMainContractService.selectById(contractId);

        return R.ok().put("budgetMainContract", budgetMainContract);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("budget:mainContract:save")
    public R save(@RequestBody BudgetMainContractEntity budgetMainContract){
        budgetMainContract.setCreateTime(new Date());
		budgetMainContractService.insert(budgetMainContract);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("budget:mainContract:update")
    public R update(@RequestBody BudgetMainContractEntity budgetMainContract){
		budgetMainContractService.updateById(budgetMainContract);


        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("budget:mainContract:delete")
    public R delete(@RequestBody Long[] contractIds){
		budgetMainContractService.deleteBatchIds(Arrays.asList(contractIds));

        return R.ok();
    }

}
