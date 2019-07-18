package io.admin.modules.gyxxgl.service;

import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.gyxxgl.entity.PartnametabEntity;

import java.util.Map;

/**
 * 产品部件表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:57:13
 */
public interface PartnametabService extends IService<PartnametabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

