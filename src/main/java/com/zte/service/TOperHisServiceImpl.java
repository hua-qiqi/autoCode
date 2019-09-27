package com.zte.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zte.mapper.TOperHisMapper;
import com.zte.model.TOperHis;
import com.zte.model.TOperHisExample;
import com.zte.param.PageInfo;

@Service
public class TOperHisServiceImpl {

	@Autowired
	private TOperHisMapper tOperHisMapper;

	/**
	 * 条件查询、满足所有条件组合查询
	 * @param pageNum 页码
	 * @param pageSize   分页大小
	 * @param item  查询条件对象
	 * @return 分页对象PageInfo
	 */
	public PageInfo selectList(int pageNum, int pageSize, TOperHis item) {
		TOperHisExample example = null;
		// 补充查询参数开始
		if (item != null) {
			example = new TOperHisExample();
			TOperHisExample.Criteria criteria = example.createCriteria();
			
        //操作历史ID
        if(item.getOperHisId()!=null){
           criteria.andOperHisIdEqualTo(item.getOperHisId());
        }
        //操作用户ID
        if(item.getOperUserId()!=null){
           criteria.andOperUserIdEqualTo(item.getOperUserId());
        }
        //功能ID
        if(item.getFunctionId()!=null){
           criteria.andFunctionIdEqualTo(item.getFunctionId());
        }
        //操作时间
        if(item.getOperTime()!=null){
           criteria.andOperTimeEqualTo(item.getOperTime());
        }
        //操作内容
        if(StringUtils.isNotEmpty(item.getOperContent())){
          criteria.andOperContentEqualTo("%"+item.getOperContent()+"%");
        }
        //备注
        if(StringUtils.isNotEmpty(item.getRemark())){
          criteria.andRemarkEqualTo("%"+item.getRemark()+"%");
        }
		}
		// 补充查询参数结束
		Page<List<TOperHis>> page = PageHelper.startPage(pageNum, pageSize);
		List<TOperHis> list = tOperHisMapper.selectByExample(example);
		PageInfo info = new PageInfo(page.getPageNum(), page.getPageSize(), page.getTotal(), page.getPages(), list);
		return info;
	}

	/**
	 * 通过主键查询
	 * @param id 主键id
	 * @return
	 */
	public TOperHis selectOne(Long id)

	{
		return  tOperHisMapper.selectByPrimaryKey(id);
	}

	/**
	 * 通过主键删除
	 * @param id 主键id
	 * @return
	 */
	public int delete(Long id) {
		return  tOperHisMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新对象
	 * @param item 
	 * @return
	 */
	public int update(TOperHis item)

	{
		return  tOperHisMapper.updateByPrimaryKeySelective(item);
	}

	/**
	 * 插入对象
	 * @param item
	 * @return
	 */
	public int insert(TOperHis item)

	{
		return  tOperHisMapper.insertSelective(item);
	}

}
