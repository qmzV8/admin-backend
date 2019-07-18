package io.admin.modules.gyxxgl.controller;

import io.admin.common.base.AbstractController;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.gyxxgl.entity.RouteinfotabEntity;
import io.admin.modules.gyxxgl.service.RouteinfotabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;



/**
 * 工艺信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:58:43
 */
@RestController
@RequestMapping("gyxxgl/routeinfotab")
public class RouteinfotabController extends AbstractController {
    @Autowired
    private RouteinfotabService routeinfotabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("gyxxgl:routeinfotab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = routeinfotabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("gyxxgl:routeinfotab:info")
    public R info(@PathVariable("id") String id){
			RouteinfotabEntity routeinfotab = routeinfotabService.selectById(id);

        return R.ok().put("routeinfotab", routeinfotab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("gyxxgl:routeinfotab:save")
    public R save(@RequestBody RouteinfotabEntity routeinfotab){
        routeinfotab.setDatacreatorId(getUserId().toString());
        routeinfotab.setDatacreatorName(getUser().getUsername());
        if (routeinfotab.getCreatetime()==null){//首次创建
            Date date1 = new Date();
            routeinfotab.setCreatetime(date1);
        }
        if (routeinfotab.getLastchange()==null){//未修改过
            Date date2 = new Date();
            routeinfotab.setLastchange(date2);
        }
        routeinfotab.setDataownerId(getUserId().toString());
        routeinfotab.setDataownerName(getUser().getUsername());
			routeinfotabService.insert(routeinfotab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("gyxxgl:routeinfotab:update")
    public R update(@RequestBody RouteinfotabEntity routeinfotab){
			routeinfotabService.updateById(routeinfotab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("gyxxgl:routeinfotab:delete")
    public R delete(@RequestBody String[] ids){
			routeinfotabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
