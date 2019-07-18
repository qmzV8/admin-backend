package io.admin.modules.gyxxgl.controller;

import io.admin.common.utils.PageUtils;
import io.admin.common.utils.R;
import io.admin.modules.gyxxgl.entity.ProductclasstabEntity;
import io.admin.modules.gyxxgl.service.ProductclasstabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 产品类别表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:58:10
 */
@RestController
@RequestMapping("gyxxgl/productclasstab")
public class ProductclasstabController {
    @Autowired
    private ProductclasstabService productclasstabService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("gyxxgl:productclasstab:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productclasstabService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("gyxxgl:productclasstab:info")
    public R info(@PathVariable("id") String id){
			ProductclasstabEntity productclasstab = productclasstabService.selectById(id);

        return R.ok().put("productclasstab", productclasstab);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("gyxxgl:productclasstab:save")
    public R save(@RequestBody ProductclasstabEntity productclasstab){
			productclasstabService.insert(productclasstab);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("gyxxgl:productclasstab:update")
    public R update(@RequestBody ProductclasstabEntity productclasstab){
			productclasstabService.updateById(productclasstab);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("gyxxgl:productclasstab:delete")
    public R delete(@RequestBody String[] ids){
			productclasstabService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
