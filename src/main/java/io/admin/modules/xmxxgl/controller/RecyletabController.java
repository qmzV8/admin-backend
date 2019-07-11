package io.admin.modules.xmxxgl.controller;

import java.util.Arrays;
import java.util.Map;

import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.xmxxgl.entity.RecyletabEntity;
import io.admin.modules.xmxxgl.service.RecyletabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





/**
 * 回收阶段数据采集表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@RestController
@RequestMapping("xmxxgl/recyletab")
public class RecyletabController {
    @Autowired
    private RecyletabService recyletabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("xmxxgl:recyletab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = recyletabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("xmxxgl:recyletab:info")
    public R info(@PathVariable("id") Integer id){
			RecyletabEntity recyletab = recyletabService.selectById(id);

        return R.ok().put("recyletab", recyletab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("xmxxgl:recyletab:save")
    public R save(@RequestBody RecyletabEntity recyletab){
			recyletabService.insert(recyletab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("xmxxgl:recyletab:update")
    public R update(@RequestBody RecyletabEntity recyletab){
			recyletabService.updateById(recyletab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("xmxxgl:recyletab:delete")
    public R delete(@RequestBody Integer[] ids){
			recyletabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
