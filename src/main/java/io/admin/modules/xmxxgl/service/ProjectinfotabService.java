package io.admin.modules.xmxxgl.service;


import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.xmxxgl.entity.ProjectinfotabEntity;

import java.util.Map;

/**
 * 项目信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
public interface ProjectinfotabService extends IService<ProjectinfotabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

