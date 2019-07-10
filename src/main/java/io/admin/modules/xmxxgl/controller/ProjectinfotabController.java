package io.admin.modules.xmxxgl.controller;

import java.util.Arrays;
import java.util.Map;

import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.xmxxgl.entity.ProjectinfotabEntity;
import io.admin.modules.xmxxgl.service.ProjectinfotabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





/**
 * 项目信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@RestController
@RequestMapping("generator/projectinfotab")
public class ProjectinfotabController {
    @Autowired
    private ProjectinfotabService projectinfotabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:projectinfotab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = projectinfotabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:projectinfotab:info")
    public R info(@PathVariable("id") String id){
			ProjectinfotabEntity projectinfotab = projectinfotabService.selectById(id);

        return R.ok().put("projectinfotab", projectinfotab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:projectinfotab:save")
    public R save(@RequestBody ProjectinfotabEntity projectinfotab){
			projectinfotabService.insert(projectinfotab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:projectinfotab:update")
    public R update(@RequestBody ProjectinfotabEntity projectinfotab){
			projectinfotabService.updateById(projectinfotab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:projectinfotab:delete")
    public R delete(@RequestBody String[] ids){
			projectinfotabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
