package io.admin.modules.gyxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.gyxxgl.dao.PartnametabDao;
import io.admin.modules.gyxxgl.entity.PartnametabEntity;
import io.admin.modules.gyxxgl.service.PartnametabService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("partnametabService")
public class PartnametabServiceImpl extends ServiceImpl<PartnametabDao, PartnametabEntity> implements PartnametabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PartnametabEntity> page = this.selectPage(
                new Query<PartnametabEntity>(params).getPage(),
                new EntityWrapper<PartnametabEntity>()
        );

        return new PageUtils(page);
    }

}
