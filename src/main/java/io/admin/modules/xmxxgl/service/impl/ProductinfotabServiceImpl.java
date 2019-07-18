package io.admin.modules.xmxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.xmxxgl.dao.ProductinfotabDao;
import io.admin.modules.xmxxgl.entity.ProductinfotabEntity;
import io.admin.modules.xmxxgl.service.ProductinfotabService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("productinfotabService")
public class ProductinfotabServiceImpl extends ServiceImpl<ProductinfotabDao, ProductinfotabEntity> implements ProductinfotabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ProductinfotabEntity> page = this.selectPage(
                new Query<ProductinfotabEntity>(params).getPage(),
                new EntityWrapper<ProductinfotabEntity>()
        );

        return new PageUtils(page);
    }

}
