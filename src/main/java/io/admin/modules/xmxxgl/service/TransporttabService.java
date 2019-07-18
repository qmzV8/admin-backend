package io.admin.modules.xmxxgl.service;



import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.xmxxgl.entity.TransporttabEntity;

import java.util.Map;

/**
 * 运输、使用阶段数据采集表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
public interface TransporttabService extends IService<TransporttabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

