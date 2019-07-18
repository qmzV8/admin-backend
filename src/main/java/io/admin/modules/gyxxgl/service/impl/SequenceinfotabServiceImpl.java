package io.admin.modules.gyxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.gyxxgl.dao.SequenceinfotabDao;
import io.admin.modules.gyxxgl.entity.SequenceinfotabEntity;
import io.admin.modules.gyxxgl.service.SequenceinfotabService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sequenceinfotabService")
public class SequenceinfotabServiceImpl extends ServiceImpl<SequenceinfotabDao, SequenceinfotabEntity> implements SequenceinfotabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SequenceinfotabEntity> page = this.selectPage(
                new Query<SequenceinfotabEntity>(params).getPage(),
                new EntityWrapper<SequenceinfotabEntity>()
        );

        return new PageUtils(page);
    }

}
