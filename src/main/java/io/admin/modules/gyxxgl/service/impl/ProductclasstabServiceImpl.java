package io.admin.modules.gyxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.gyxxgl.dao.ProductclasstabDao;
import io.admin.modules.gyxxgl.entity.ProductclasstabEntity;
import io.admin.modules.gyxxgl.service.ProductclasstabService;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service("productclasstabService")
public class ProductclasstabServiceImpl extends ServiceImpl<ProductclasstabDao, ProductclasstabEntity> implements ProductclasstabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ProductclasstabEntity> page = this.selectPage(
                new Query<ProductclasstabEntity>(params).getPage(),
                new EntityWrapper<ProductclasstabEntity>()
        );

        return new PageUtils(page);
    }

}
