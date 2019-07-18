package io.admin.modules.mkxxgl.service;


import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.mkxxgl.entity.ModuleinputtabEntity;

import java.util.Map;

/**
 * 模块输入表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:59:17
 */
public interface ModuleinputtabService extends IService<ModuleinputtabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

