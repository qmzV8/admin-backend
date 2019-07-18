package io.admin.modules.gyxxgl.service;

import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.gyxxgl.entity.ProductclasstabEntity;

import java.util.Map;

/**
 * 产品类别表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:58:10
 */
public interface ProductclasstabService extends IService<ProductclasstabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

