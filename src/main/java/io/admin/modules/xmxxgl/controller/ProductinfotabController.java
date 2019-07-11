package io.admin.modules.xmxxgl.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import io.admin.common.base.AbstractController;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.sys.entity.SysUserEntity;
import io.admin.modules.xmxxgl.entity.ProductinfotabEntity;
import io.admin.modules.xmxxgl.service.ProductinfotabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 产品信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@RestController
@RequestMapping("xmxxgl/productinfotab")
public class ProductinfotabController extends AbstractController {
    @Autowired
    private ProductinfotabService productinfotabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("xmxxgl:productinfotab:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = productinfotabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("xmxxgl:productinfotab:info")
    public R info(@PathVariable("id") String id) {
        ProductinfotabEntity productinfotab = productinfotabService.selectById(id);

        return R.ok().put("productinfotab", productinfotab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("xmxxgl:productinfotab:save")
    public R save(@RequestBody ProductinfotabEntity productinfotab) {
//        String uuid = UUID.randomUUID().toString().replace("-","");
//        productinfotab.setId(uuid);
        SysUserEntity sysUserEntity = getUser();
        productinfotab.setCreatedate(new Date());
        productinfotab.setLastchange(new Date());
        productinfotab.setDatacreatorId(sysUserEntity.getUserId().toString());
        productinfotab.setDatacreatorName(sysUserEntity.getUsername());

        productinfotabService.insert(productinfotab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("xmxxgl:productinfotab:update")
    public R update(@RequestBody ProductinfotabEntity productinfotab) {
        productinfotab.setLastchange(new Date());//更新修改时间
        productinfotabService.updateById(productinfotab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("xmxxgl:productinfotab:delete")
    public R delete(@RequestBody String[] ids) {
        productinfotabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
