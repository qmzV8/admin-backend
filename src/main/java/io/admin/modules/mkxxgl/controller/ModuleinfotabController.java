package io.admin.modules.mkxxgl.controller;

import io.admin.common.base.AbstractController;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.mkxxgl.entity.ModuleinfotabEntity;
import io.admin.modules.mkxxgl.service.ModuleinfotabService;
import io.admin.modules.xmxxgl.service.ProductinfotabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * 模块信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:59:17
 */
@RestController
@RequestMapping("mkxxgl/moduleinfotab")
public class ModuleinfotabController extends AbstractController {
    @Autowired
    private ModuleinfotabService moduleinfotabService;
    @Autowired
    private ProductinfotabService productinfotabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mkxxgl:moduleinfotab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = moduleinfotabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("mkxxgl:moduleinfotab:info")
    public R info(@PathVariable("id") String id){
			ModuleinfotabEntity moduleinfotab = moduleinfotabService.selectById(id);

        return R.ok().put("moduleinfotab", moduleinfotab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mkxxgl:moduleinfotab:save")
    public R save(@RequestBody ModuleinfotabEntity moduleinfotab){
        moduleinfotab.setDatacreatorId(getUserId().toString());
        moduleinfotab.setDatacreatorName(getUser().getUsername());
        if (moduleinfotab.getCreatedate()==null){//首次创建
            Date date1 = new Date();
            moduleinfotab.setCreatedate(date1);
        }
        if (moduleinfotab.getLastchange()==null){//未修改过
            Date date2 = new Date();
            moduleinfotab.setLastchange(date2);
        }

			moduleinfotabService.insert(moduleinfotab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mkxxgl:moduleinfotab:update")
    public R update(@RequestBody ModuleinfotabEntity moduleinfotab){
			moduleinfotabService.updateById(moduleinfotab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mkxxgl:moduleinfotab:delete")
    public R delete(@RequestBody String[] ids){
			moduleinfotabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

    /**
     * 选择产品
     */
    @RequestMapping("/xzcp")
    public R xzcpbz(@RequestParam Map<String, Object> params){

        PageUtils page = productinfotabService.queryPage(params);

        return R.ok().put("page",page);
    }
}
