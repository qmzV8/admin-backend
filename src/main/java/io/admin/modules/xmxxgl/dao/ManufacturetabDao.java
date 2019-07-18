package io.admin.modules.xmxxgl.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.admin.modules.xmxxgl.entity.ManufacturetabEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 生产阶段（原材料）清单表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 10:04:18
 */
@Mapper
public interface ManufacturetabDao extends BaseMapper<ManufacturetabEntity> {
	
}
