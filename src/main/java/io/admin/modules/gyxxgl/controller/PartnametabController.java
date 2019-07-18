package io.admin.modules.gyxxgl.controller;

import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.gyxxgl.entity.PartnametabEntity;
import io.admin.modules.gyxxgl.service.PartnametabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 产品部件表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:57:13
 */
@RestController
@RequestMapping("gyxxgl/partnametab")
public class PartnametabController {
    @Autowired
    private PartnametabService partnametabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("gyxxgl:partnametab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = partnametabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("gyxxgl:partnametab:info")
    public R info(@PathVariable("id") String id){
			PartnametabEntity partnametab = partnametabService.selectById(id);

        return R.ok().put("partnametab", partnametab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("gyxxgl:partnametab:save")
    public R save(@RequestBody PartnametabEntity partnametab){
			partnametabService.insert(partnametab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("gyxxgl:partnametab:update")
    public R update(@RequestBody PartnametabEntity partnametab){
			partnametabService.updateById(partnametab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("gyxxgl:partnametab:delete")
    public R delete(@RequestBody String[] ids){
			partnametabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
