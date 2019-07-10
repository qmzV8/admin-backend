package io.admin.modules.xmxxgl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.admin.common.utils.PageUtils;
import io.admin.common.utils.Query;
import io.admin.modules.xmxxgl.dao.ProjectinfotabDao;
import io.admin.modules.xmxxgl.entity.ProjectinfotabEntity;
import io.admin.modules.xmxxgl.service.ProjectinfotabService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("projectinfotabService")
public class ProjectinfotabServiceImpl extends ServiceImpl<ProjectinfotabDao, ProjectinfotabEntity> implements ProjectinfotabService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ProjectinfotabEntity> page = this.selectPage(
                new Query<ProjectinfotabEntity>(params).getPage(),
                new EntityWrapper<ProjectinfotabEntity>()
        );

        return new PageUtils(page);
    }

}
