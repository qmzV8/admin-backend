package io.admin.modules.xmxxgl.service;



import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.xmxxgl.entity.ProductinfotabEntity;

import java.util.Map;

/**
 * 产品信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
public interface ProductinfotabService extends IService<ProductinfotabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

