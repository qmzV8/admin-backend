package io.admin.modules.mkxxgl.service;


import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.mkxxgl.entity.ModuleinfotabEntity;

import java.util.Map;

/**
 * 模块信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:59:17
 */
public interface ModuleinfotabService extends IService<ModuleinfotabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

