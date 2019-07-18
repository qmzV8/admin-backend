package io.admin.modules.gyxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.gyxxgl.dao.RouteinfotabDao;
import io.admin.modules.gyxxgl.entity.RouteinfotabEntity;
import io.admin.modules.gyxxgl.service.RouteinfotabService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("routeinfotabService")
public class RouteinfotabServiceImpl extends ServiceImpl<RouteinfotabDao, RouteinfotabEntity> implements RouteinfotabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RouteinfotabEntity> page = this.selectPage(
                new Query<RouteinfotabEntity>(params).getPage(),
                new EntityWrapper<RouteinfotabEntity>()
        );

        return new PageUtils(page);
    }

}
