package io.admin.modules.xmxxgl.service;



import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.xmxxgl.entity.RecyletabEntity;

import java.util.Map;

/**
 * 回收阶段数据采集表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
public interface RecyletabService extends IService<RecyletabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

