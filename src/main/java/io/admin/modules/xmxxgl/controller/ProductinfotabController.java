package io.admin.modules.xmxxgl.controller;

import java.util.Arrays;
import java.util.Map;

import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
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
@RequestMapping("generator/productinfotab")
public class ProductinfotabController {
    @Autowired
    private ProductinfotabService productinfotabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:productinfotab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productinfotabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:productinfotab:info")
    public R info(@PathVariable("id") String id){
			ProductinfotabEntity productinfotab = productinfotabService.selectById(id);

        return R.ok().put("productinfotab", productinfotab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:productinfotab:save")
    public R save(@RequestBody ProductinfotabEntity productinfotab){
			productinfotabService.insert(productinfotab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:productinfotab:update")
    public R update(@RequestBody ProductinfotabEntity productinfotab){
			productinfotabService.updateById(productinfotab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:productinfotab:delete")
    public R delete(@RequestBody String[] ids){
			productinfotabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
