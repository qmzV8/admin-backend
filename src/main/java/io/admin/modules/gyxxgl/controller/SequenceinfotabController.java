package io.admin.modules.gyxxgl.controller;

import io.admin.common.base.AbstractController;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.gyxxgl.entity.SequenceinfotabEntity;
import io.admin.modules.gyxxgl.service.RouteinfotabService;
import io.admin.modules.gyxxgl.service.SequenceinfotabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;


/**
 * 工序信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:58:44
 */
@RestController
@RequestMapping("gyxxgl/sequenceinfotab")
public class SequenceinfotabController extends AbstractController {
    @Autowired
    private SequenceinfotabService sequenceinfotabService;
    @Autowired
    private RouteinfotabService routeinfotabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("gyxxgl:sequenceinfotab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sequenceinfotabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("gyxxgl:sequenceinfotab:info")
    public R info(@PathVariable("id") String id){
			SequenceinfotabEntity sequenceinfotab = sequenceinfotabService.selectById(id);

        return R.ok().put("sequenceinfotab", sequenceinfotab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("gyxxgl:sequenceinfotab:save")
    public R save(@RequestBody SequenceinfotabEntity sequenceinfotab){
        sequenceinfotab.setDatacreatorId(getUserId().toString());
        sequenceinfotab.setDatacreatorName(getUser().getUsername());
        if (sequenceinfotab.getCreatetime()==null){//首次创建
            Date date1 = new Date();
            sequenceinfotab.setCreatetime(date1);
        }
        if (sequenceinfotab.getLastchange()==null){//未修改过
            Date date2 = new Date();
            sequenceinfotab.setLastchange(date2);
        }
        sequenceinfotab.setDataownerId(getUserId().toString());
        sequenceinfotab.setDataownerName(getUser().getUsername());
			sequenceinfotabService.insert(sequenceinfotab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("gyxxgl:sequenceinfotab:update")
    public R update(@RequestBody SequenceinfotabEntity sequenceinfotab){
			sequenceinfotabService.updateById(sequenceinfotab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("gyxxgl:sequenceinfotab:delete")
    public R delete(@RequestBody String[] ids){
			sequenceinfotabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

    /**
     * 选择工艺
     */
    @RequestMapping("/xzgy")
    public R xzgy(@RequestParam Map<String, Object> params){

        PageUtils page = routeinfotabService.queryPage(params);

        return R.ok().put("page",page);
    }

    /**
     * 选择工序
     */
    @RequestMapping("/xzgx")
    public R xzgx(@RequestParam Map<String, Object> params){

        PageUtils page = sequenceinfotabService.queryPage(params);

        return R.ok().put("page",page);
    }
}
