package com.opvita.activity.dto;

public class EsOrderItemsDTOWithBLOBs extends EsOrderItemsDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.ES_ORDER_ITEMS.IMAGE
     *
     * @mbggenerated
     */
    private String image;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.ES_ORDER_ITEMS.ADDON
     *
     * @mbggenerated
     */
    private String addon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.ES_ORDER_ITEMS.IMAGE
     *
     * @return the value of CULSITE.ES_ORDER_ITEMS.IMAGE
     *
     * @mbggenerated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.ES_ORDER_ITEMS.IMAGE
     *
     * @param image the value for CULSITE.ES_ORDER_ITEMS.IMAGE
     *
     * @mbggenerated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.ES_ORDER_ITEMS.ADDON
     *
     * @return the value of CULSITE.ES_ORDER_ITEMS.ADDON
     *
     * @mbggenerated
     */
    public String getAddon() {
        return addon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.ES_ORDER_ITEMS.ADDON
     *
     * @param addon the value for CULSITE.ES_ORDER_ITEMS.ADDON
     *
     * @mbggenerated
     */
    public void setAddon(String addon) {
        this.addon = addon == null ? null : addon.trim();
    }
}