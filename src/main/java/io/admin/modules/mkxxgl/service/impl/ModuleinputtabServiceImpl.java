package io.admin.modules.mkxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.mkxxgl.dao.ModuleinputtabDao;
import io.admin.modules.mkxxgl.entity.ModuleinputtabEntity;
import io.admin.modules.mkxxgl.service.ModuleinputtabService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("moduleinputtabService")
public class ModuleinputtabServiceImpl extends ServiceImpl<ModuleinputtabDao, ModuleinputtabEntity> implements ModuleinputtabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ModuleinputtabEntity> page = this.selectPage(
                new Query<ModuleinputtabEntity>(params).getPage(),
                new EntityWrapper<ModuleinputtabEntity>()
        );

        return new PageUtils(page);
    }

}
