package io.admin.modules.xmxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.xmxxgl.dao.RecyletabDao;
import io.admin.modules.xmxxgl.entity.RecyletabEntity;
import io.admin.modules.xmxxgl.service.RecyletabService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("recyletabService")
public class RecyletabServiceImpl extends ServiceImpl<RecyletabDao, RecyletabEntity> implements RecyletabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RecyletabEntity> page = this.selectPage(
                new Query<RecyletabEntity>(params).getPage(),
                new EntityWrapper<RecyletabEntity>()
        );

        return new PageUtils(page);
    }

}
