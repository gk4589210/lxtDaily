package com.mbyte.easy.admin.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mbyte.easy.admin.entity.Apply;
import com.mbyte.easy.admin.mapper.ApplyMapper;
import com.mbyte.easy.admin.service.IApplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-04-14
 */
@Service
public class ApplyServiceImpl extends ServiceImpl<ApplyMapper, Apply> implements IApplyService {

    @Override
    public Page<Apply> listPage(Apply apply, Page<Apply> page) {
        return page.setRecords(this.baseMapper.listPage(apply,page));
    }
}