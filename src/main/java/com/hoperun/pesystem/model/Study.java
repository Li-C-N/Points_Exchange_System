package com.hoperun.pesystem.model;

import java.io.Serializable;
import java.util.Date;

public class Study  implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_id
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private Integer stuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_title
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private String stuTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_introduce
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private String stuIntroduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_type_id
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private Integer stuTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_browse_number
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private Integer stuBrowseNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_praise_number
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private Integer stuPraiseNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_photo_index_big_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private String stuPhotoIndexBigUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_photo_index_sm_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private String stuPhotoIndexSmUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_photo_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private String stuPhotoUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_start_time
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private Date stuStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_end_time
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private Date stuEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_flag
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private Integer stuFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_study.stu_information
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    private String stuInformation;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_id
     *
     * @return the value of t_study.stu_id
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_id
     *
     * @param stuId the value for t_study.stu_id
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_title
     *
     * @return the value of t_study.stu_title
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public String getStuTitle() {
        return stuTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_title
     *
     * @param stuTitle the value for t_study.stu_title
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuTitle(String stuTitle) {
        this.stuTitle = stuTitle == null ? null : stuTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_introduce
     *
     * @return the value of t_study.stu_introduce
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public String getStuIntroduce() {
        return stuIntroduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_introduce
     *
     * @param stuIntroduce the value for t_study.stu_introduce
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuIntroduce(String stuIntroduce) {
        this.stuIntroduce = stuIntroduce == null ? null : stuIntroduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_type_id
     *
     * @return the value of t_study.stu_type_id
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public Integer getStuTypeId() {
        return stuTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_type_id
     *
     * @param stuTypeId the value for t_study.stu_type_id
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuTypeId(Integer stuTypeId) {
        this.stuTypeId = stuTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_browse_number
     *
     * @return the value of t_study.stu_browse_number
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public Integer getStuBrowseNumber() {
        return stuBrowseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_browse_number
     *
     * @param stuBrowseNumber the value for t_study.stu_browse_number
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuBrowseNumber(Integer stuBrowseNumber) {
        this.stuBrowseNumber = stuBrowseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_praise_number
     *
     * @return the value of t_study.stu_praise_number
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public Integer getStuPraiseNumber() {
        return stuPraiseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_praise_number
     *
     * @param stuPraiseNumber the value for t_study.stu_praise_number
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuPraiseNumber(Integer stuPraiseNumber) {
        this.stuPraiseNumber = stuPraiseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_photo_index_big_url
     *
     * @return the value of t_study.stu_photo_index_big_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public String getStuPhotoIndexBigUrl() {
        return stuPhotoIndexBigUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_photo_index_big_url
     *
     * @param stuPhotoIndexBigUrl the value for t_study.stu_photo_index_big_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuPhotoIndexBigUrl(String stuPhotoIndexBigUrl) {
        this.stuPhotoIndexBigUrl = stuPhotoIndexBigUrl == null ? null : stuPhotoIndexBigUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_photo_index_sm_url
     *
     * @return the value of t_study.stu_photo_index_sm_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public String getStuPhotoIndexSmUrl() {
        return stuPhotoIndexSmUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_photo_index_sm_url
     *
     * @param stuPhotoIndexSmUrl the value for t_study.stu_photo_index_sm_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuPhotoIndexSmUrl(String stuPhotoIndexSmUrl) {
        this.stuPhotoIndexSmUrl = stuPhotoIndexSmUrl == null ? null : stuPhotoIndexSmUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_photo_url
     *
     * @return the value of t_study.stu_photo_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public String getStuPhotoUrl() {
        return stuPhotoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_photo_url
     *
     * @param stuPhotoUrl the value for t_study.stu_photo_url
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuPhotoUrl(String stuPhotoUrl) {
        this.stuPhotoUrl = stuPhotoUrl == null ? null : stuPhotoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_start_time
     *
     * @return the value of t_study.stu_start_time
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public Date getStuStartTime() {
        return stuStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_start_time
     *
     * @param stuStartTime the value for t_study.stu_start_time
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuStartTime(Date stuStartTime) {
        this.stuStartTime = stuStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_end_time
     *
     * @return the value of t_study.stu_end_time
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public Date getStuEndTime() {
        return stuEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_end_time
     *
     * @param stuEndTime the value for t_study.stu_end_time
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuEndTime(Date stuEndTime) {
        this.stuEndTime = stuEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_flag
     *
     * @return the value of t_study.stu_flag
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public Integer getStuFlag() {
        return stuFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_flag
     *
     * @param stuFlag the value for t_study.stu_flag
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuFlag(Integer stuFlag) {
        this.stuFlag = stuFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_study.stu_information
     *
     * @return the value of t_study.stu_information
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public String getStuInformation() {
        return stuInformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_study.stu_information
     *
     * @param stuInformation the value for t_study.stu_information
     *
     * @mbg.generated Sun Feb 07 11:32:39 CST 2021
     */
    public void setStuInformation(String stuInformation) {
        this.stuInformation = stuInformation == null ? null : stuInformation.trim();
    }
}