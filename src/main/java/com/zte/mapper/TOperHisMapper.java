package com.zte.mapper;

import com.zte.model.TOperHis;
import com.zte.model.TOperHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOperHisMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	long countByExample(TOperHisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	int deleteByExample(TOperHisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	int deleteByPrimaryKey(Long operHisId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	int insert(TOperHis record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	int insertSelective(TOperHis record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	List<TOperHis> selectByExample(TOperHisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	TOperHis selectByPrimaryKey(Long operHisId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	int updateByExampleSelective(@Param("record") TOperHis record, @Param("example") TOperHisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	int updateByExample(@Param("record") TOperHis record, @Param("example") TOperHisExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	int updateByPrimaryKeySelective(TOperHis record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_oper_his
	 * @mbg.generated  Fri Sep 27 17:14:17 CST 2019
	 */
	int updateByPrimaryKey(TOperHis record);
}