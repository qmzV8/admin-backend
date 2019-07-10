package io.admin.modules.xmxxgl.controller;

import java.util.Arrays;
import java.util.Map;

import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.xmxxgl.entity.ManufacturetabEntity;
import io.admin.modules.xmxxgl.service.ManufacturetabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





/**
 * 生产阶段（原材料）清单表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@RestController
@RequestMapping("generator/manufacturetab")
public class ManufacturetabController {
    @Autowired
    private ManufacturetabService manufacturetabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:manufacturetab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = manufacturetabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:manufacturetab:info")
    public R info(@PathVariable("id") Integer id){
			ManufacturetabEntity manufacturetab = manufacturetabService.selectById(id);

        return R.ok().put("manufacturetab", manufacturetab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:manufacturetab:save")
    public R save(@RequestBody ManufacturetabEntity manufacturetab){
			manufacturetabService.insert(manufacturetab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:manufacturetab:update")
    public R update(@RequestBody ManufacturetabEntity manufacturetab){
			manufacturetabService.updateById(manufacturetab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:manufacturetab:delete")
    public R delete(@RequestBody Integer[] ids){
			manufacturetabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
