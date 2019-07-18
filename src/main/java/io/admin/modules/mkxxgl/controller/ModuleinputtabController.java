package io.admin.modules.mkxxgl.controller;

import io.admin.common.base.AbstractController;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.mkxxgl.entity.ModuleinputtabEntity;
import io.admin.modules.mkxxgl.service.ModuleinputtabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * 模块输入表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:59:17
 */
@RestController
@RequestMapping("mkxxgl/moduleinputtab")
public class ModuleinputtabController extends AbstractController {
    @Autowired
    private ModuleinputtabService moduleinputtabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mkxxgl:moduleinputtab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = moduleinputtabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("mkxxgl:moduleinputtab:info")
    public R info(@PathVariable("id") String id){
			ModuleinputtabEntity moduleinputtab = moduleinputtabService.selectById(id);

        return R.ok().put("moduleinputtab", moduleinputtab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mkxxgl:moduleinputtab:save")
    public R save(@RequestBody ModuleinputtabEntity moduleinputtab){
        moduleinputtab.setDatacreatorId(getUserId().toString());
        moduleinputtab.setDatacreatorName(getUser().getUsername());
        if (moduleinputtab.getCreatedate()==null){//首次创建
            Date date1 = new Date();
            moduleinputtab.setCreatedate(date1);
        }
        if (moduleinputtab.getLastchange()==null){//未修改过
            Date date2 = new Date();
            moduleinputtab.setLastchange(date2);
        }

			moduleinputtabService.insert(moduleinputtab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mkxxgl:moduleinputtab:update")
    public R update(@RequestBody ModuleinputtabEntity moduleinputtab){
			moduleinputtabService.updateById(moduleinputtab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mkxxgl:moduleinputtab:delete")
    public R delete(@RequestBody String[] ids){
			moduleinputtabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
