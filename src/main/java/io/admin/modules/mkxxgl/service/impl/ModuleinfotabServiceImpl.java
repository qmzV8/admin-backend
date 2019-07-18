package io.admin.modules.mkxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.mkxxgl.dao.ModuleinfotabDao;
import io.admin.modules.mkxxgl.entity.ModuleinfotabEntity;
import io.admin.modules.mkxxgl.service.ModuleinfotabService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("moduleinfotabService")
public class ModuleinfotabServiceImpl extends ServiceImpl<ModuleinfotabDao, ModuleinfotabEntity> implements ModuleinfotabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ModuleinfotabEntity> page = this.selectPage(
                new Query<ModuleinfotabEntity>(params).getPage(),
                new EntityWrapper<ModuleinfotabEntity>()
        );

        return new PageUtils(page);
    }

}
