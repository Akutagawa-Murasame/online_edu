package com.hubu.online.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hubu.online.entity.PageParam;
import com.hubu.online.entity.PageResult;
import com.hubu.online.entity.Carousel;
import java.util.List;
import java.util.Map;

/**
 * 服务类
 */
public interface CarouselService extends IService<Carousel> {

    /**
     * 分页查询
     */
    PageResult<Carousel> listPage(PageParam<Carousel> page);

    /**
     * 查询所有
     */
    List<Carousel> listAll(Map<String, Object> page);

}
