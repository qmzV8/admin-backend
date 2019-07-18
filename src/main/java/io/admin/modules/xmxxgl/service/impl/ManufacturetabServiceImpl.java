package io.admin.modules.xmxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.xmxxgl.dao.ManufacturetabDao;
import io.admin.modules.xmxxgl.entity.ManufacturetabEntity;
import io.admin.modules.xmxxgl.service.ManufacturetabService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("manufacturetabService")
public class ManufacturetabServiceImpl extends ServiceImpl<ManufacturetabDao, ManufacturetabEntity> implements ManufacturetabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ManufacturetabEntity> page = this.selectPage(
                new Query<ManufacturetabEntity>(params).getPage(),
                new EntityWrapper<ManufacturetabEntity>()
        );

        return new PageUtils(page);
    }

}
