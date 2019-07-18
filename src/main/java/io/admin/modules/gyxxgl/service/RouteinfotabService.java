package io.admin.modules.gyxxgl.service;

import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.gyxxgl.entity.RouteinfotabEntity;

import java.util.Map;

/**
 * 工艺信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:58:43
 */
public interface RouteinfotabService extends IService<RouteinfotabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

