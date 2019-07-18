package io.admin.modules.xmxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.xmxxgl.dao.TransporttabDao;
import io.admin.modules.xmxxgl.entity.TransporttabEntity;
import io.admin.modules.xmxxgl.service.TransporttabService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("transporttabService")
public class TransporttabServiceImpl extends ServiceImpl<TransporttabDao, TransporttabEntity> implements TransporttabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TransporttabEntity> page = this.selectPage(
                new Query<TransporttabEntity>(params).getPage(),
                new EntityWrapper<TransporttabEntity>()
        );

        return new PageUtils(page);
    }

}
