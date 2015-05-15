package com.opvita.activity.dao;

import com.opvita.activity.dto.MProductParticipationDTO;
import com.opvita.activity.dto.MProductParticipationDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MProductParticipationDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int countByExample(MProductParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int deleteByExample(MProductParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int insert(MProductParticipationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int insertSelective(MProductParticipationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    List<MProductParticipationDTO> selectByExample(MProductParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    MProductParticipationDTO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MProductParticipationDTO record, @Param("example") MProductParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MProductParticipationDTO record, @Param("example") MProductParticipationDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MProductParticipationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_PRODUCT_PARTICIPATION
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MProductParticipationDTO record);
}