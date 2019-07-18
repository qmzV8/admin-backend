package io.admin.modules.gyxxgl.service;

import com.baomidou.mybatisplus.service.IService;
import io.admin.common.utils.PageUtils;
import io.admin.modules.gyxxgl.entity.SequenceinfotabEntity;

import java.util.Map;

/**
 * 工序信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 09:58:44
 */
public interface SequenceinfotabService extends IService<SequenceinfotabEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

