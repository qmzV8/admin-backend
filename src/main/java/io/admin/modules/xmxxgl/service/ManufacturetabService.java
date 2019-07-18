package io.admin.modules.xmxxgl.service;



import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.xmxxgl.entity.ManufacturetabEntity;

import java.util.Map;

/**
 * 生产阶段（原材料）清单表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
public interface ManufacturetabService extends IService<ManufacturetabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

