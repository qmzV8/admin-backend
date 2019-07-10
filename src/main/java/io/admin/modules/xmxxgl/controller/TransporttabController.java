package io.admin.modules.xmxxgl.controller;

import java.util.Arrays;
import java.util.Map;

import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.xmxxgl.entity.TransporttabEntity;
import io.admin.modules.xmxxgl.service.TransporttabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




/**
 * 运输、使用阶段数据采集表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@RestController
@RequestMapping("generator/transporttab")
public class TransporttabController {
    @Autowired
    private TransporttabService transporttabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:transporttab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = transporttabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:transporttab:info")
    public R info(@PathVariable("id") Integer id){
			TransporttabEntity transporttab = transporttabService.selectById(id);

        return R.ok().put("transporttab", transporttab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:transporttab:save")
    public R save(@RequestBody TransporttabEntity transporttab){
			transporttabService.insert(transporttab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:transporttab:update")
    public R update(@RequestBody TransporttabEntity transporttab){
			transporttabService.updateById(transporttab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:transporttab:delete")
    public R delete(@RequestBody Integer[] ids){
			transporttabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
