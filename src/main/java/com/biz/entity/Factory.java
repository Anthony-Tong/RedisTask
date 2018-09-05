package com.biz.entity;

import java.sql.Date;
import java.sql.Time;

/**
 * 工厂/门店实体类
 *
 * @author wanghb
 */
public class Factory {
    private static final long serialVersionUID = -8467422108837895278L;

    /**
     * 工厂代码
     */
    private String code;
    /**
     * 名称
     */
    private String name;

    /**
     * 所属公司
     */
    private String companyCode;

    /**
     * 工厂性质(公司性质)
     */
    private String nature;

    /**
     * 住宅号及街道
     */
    private String houseNoAndStreet;

    /**
     * 邮政信箱
     */
    private String postalMailbox;
    /**
     * 邮政编码
     */
    private String postalCode;
    /**
     * 城市
     */
    private String city;
    /**
     * 地区（省/自治区/直辖市、市、县）
     */
    private String region;

    /**
     * 县代码
     */
    private String countyCode;

    /**
     * 城市代码
     */
    private String cityCode;

    /**
     * 销售地区
     */
    private String saleArea;

    /**
     * 门店类型
     */
    private String storeCategory;
    /**
     * 门店级别
     */
    private String storeGrade;
    /**
     * 门店补货额度
     */
    private Long replenishmentQuota;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * 门店店长
     */
    private String storeManager;
    /**
     * 店长电话
     */
    private String storeTel;
    /**
     * 房东姓名
     */
    private String landlord;
    /**
     * 房东电话
     */
    private String landlordTel;
    /**
     * 门店部署SKU数
     */
    private Integer skuNumber;
    /**
     * 门店人员配置数量
     */
    private Integer allocation;
    /**
     * 门店销售规模
     */
    private Integer salesScale;
    /**
     * 日结日期
     */
    private Date dayEnd;
    /**
     * 门店开店日期
     */
    private Date openShopDate;
    /**
     * 门店关店日期
     */
    private Date closedShopDate;
    /**
     * 是否关店
     */
    private Boolean closedShop;
    /**
     * 门店所属商圈
     */
    private String storeBusinessCircle;
    /**
     * 门店建筑面积
     */
    private Double buildArea;
    /**
     * 门店实用面积
     */
    private Double practicalArea;
    /**
     * 门店仓库面积
     */
    private Double depotArea;
    /**
     * 显示屏数量
     */
    private Integer displayNumber;
    /**
     * 楼层
     */
    private String storey;
    /**
     * 会所
     */
    private String clubHouse;
    /**
     * 灯箱数量
     */
    private Integer lightBoxNumber;
    /**
     * 车位数量
     */
    private Integer parkingLotNumber;
    /**
     * 货架数量
     */
    private Integer goodsShelvesNumber;
    /**
     * 橱柜数量
     */
    private Integer cupboardNumber;
    /**
     * 地理区域
     */
    private String geographicArea;
    /**
     * 高背柜
     */
    private Integer gbCounter;
    /**
     * 中岛柜
     */
    private Integer zdCounter;
    /**
     * 中岛柜端架
     */
    private Integer zdCounterEndBracket;
    /**
     * 临窗柜
     */
    private Integer lcCounter;
    /**
     * 白酒促销台
     */
    private Integer liquorPromotionDesk;
    /**
     * 红酒促销台
     */
    private Integer redWinePromotionDesk;
    /**
     * 通用促销台
     */
    private Integer generalPromotionDesk;
    /**
     * 冰柜
     */
    private Integer freezer;
    /**
     * 促销堆头
     */
    private Integer duitou;
    /**
     * 统收标志
     */
    private String unifiedLogo;
    /**
     * 统收公司号
     */
    private String companyNumber;
    /**
     * 是否独立核算
     */
    private Boolean adjustAccounts;
    /**
     * 是否可发物流
     */
    private Boolean logistics;
    /**
     * 是否电子票
     */
    private Boolean eInvoice;
    /**
     * 不可开增票
     */
    private String increaseTicket;
    /**
     * 是否为中心店
     */
    private Boolean mainStore;
    /**
     * 原JDE编码
     */
    private String jdeCode;
    /**
     * 开店时间
     */
    private Time openShopTime;
    /**
     * 关店时间
     */
    private Time closeShopTime;

    @Override
    public String toString() {
        return "Factory{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", nature='" + nature + '\'' +
                ", houseNoAndStreet='" + houseNoAndStreet + '\'' +
                ", postalMailbox='" + postalMailbox + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", countyCode='" + countyCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", saleArea='" + saleArea + '\'' +
                ", storeCategory='" + storeCategory + '\'' +
                ", storeGrade='" + storeGrade + '\'' +
                ", replenishmentQuota=" + replenishmentQuota +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", storeManager='" + storeManager + '\'' +
                ", storeTel='" + storeTel + '\'' +
                ", landlord='" + landlord + '\'' +
                ", landlordTel='" + landlordTel + '\'' +
                ", skuNumber=" + skuNumber +
                ", allocation=" + allocation +
                ", salesScale=" + salesScale +
                ", dayEnd=" + dayEnd +
                ", openShopDate=" + openShopDate +
                ", closedShopDate=" + closedShopDate +
                ", closedShop=" + closedShop +
                ", storeBusinessCircle='" + storeBusinessCircle + '\'' +
                ", buildArea=" + buildArea +
                ", practicalArea=" + practicalArea +
                ", depotArea=" + depotArea +
                ", displayNumber=" + displayNumber +
                ", storey='" + storey + '\'' +
                ", clubHouse='" + clubHouse + '\'' +
                ", lightBoxNumber=" + lightBoxNumber +
                ", parkingLotNumber=" + parkingLotNumber +
                ", goodsShelvesNumber=" + goodsShelvesNumber +
                ", cupboardNumber=" + cupboardNumber +
                ", geographicArea='" + geographicArea + '\'' +
                ", gbCounter=" + gbCounter +
                ", zdCounter=" + zdCounter +
                ", zdCounterEndBracket=" + zdCounterEndBracket +
                ", lcCounter=" + lcCounter +
                ", liquorPromotionDesk=" + liquorPromotionDesk +
                ", redWinePromotionDesk=" + redWinePromotionDesk +
                ", generalPromotionDesk=" + generalPromotionDesk +
                ", freezer=" + freezer +
                ", duitou=" + duitou +
                ", unifiedLogo='" + unifiedLogo + '\'' +
                ", companyNumber='" + companyNumber + '\'' +
                ", adjustAccounts=" + adjustAccounts +
                ", logistics=" + logistics +
                ", eInvoice=" + eInvoice +
                ", increaseTicket='" + increaseTicket + '\'' +
                ", mainStore=" + mainStore +
                ", jdeCode='" + jdeCode + '\'' +
                ", openShopTime=" + openShopTime +
                ", closeShopTime=" + closeShopTime +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getHouseNoAndStreet() {
        return houseNoAndStreet;
    }

    public void setHouseNoAndStreet(String houseNoAndStreet) {
        this.houseNoAndStreet = houseNoAndStreet;
    }

    public String getPostalMailbox() {
        return postalMailbox;
    }

    public void setPostalMailbox(String postalMailbox) {
        this.postalMailbox = postalMailbox;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getSaleArea() {
        return saleArea;
    }

    public void setSaleArea(String saleArea) {
        this.saleArea = saleArea;
    }

    public String getStoreCategory() {
        return storeCategory;
    }

    public void setStoreCategory(String storeCategory) {
        this.storeCategory = storeCategory;
    }

    public String getStoreGrade() {
        return storeGrade;
    }

    public void setStoreGrade(String storeGrade) {
        this.storeGrade = storeGrade;
    }

    public Long getReplenishmentQuota() {
        return replenishmentQuota;
    }

    public void setReplenishmentQuota(Long replenishmentQuota) {
        this.replenishmentQuota = replenishmentQuota;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getStoreManager() {
        return storeManager;
    }

    public void setStoreManager(String storeManager) {
        this.storeManager = storeManager;
    }

    public String getStoreTel() {
        return storeTel;
    }

    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel;
    }

    public String getLandlord() {
        return landlord;
    }

    public void setLandlord(String landlord) {
        this.landlord = landlord;
    }

    public String getLandlordTel() {
        return landlordTel;
    }

    public void setLandlordTel(String landlordTel) {
        this.landlordTel = landlordTel;
    }

    public Integer getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(Integer skuNumber) {
        this.skuNumber = skuNumber;
    }

    public Integer getAllocation() {
        return allocation;
    }

    public void setAllocation(Integer allocation) {
        this.allocation = allocation;
    }

    public Integer getSalesScale() {
        return salesScale;
    }

    public void setSalesScale(Integer salesScale) {
        this.salesScale = salesScale;
    }

    public Date getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(Date dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Date getOpenShopDate() {
        return openShopDate;
    }

    public void setOpenShopDate(Date openShopDate) {
        this.openShopDate = openShopDate;
    }

    public Date getClosedShopDate() {
        return closedShopDate;
    }

    public void setClosedShopDate(Date closedShopDate) {
        this.closedShopDate = closedShopDate;
    }

    public Boolean getClosedShop() {
        return closedShop;
    }

    public void setClosedShop(Boolean closedShop) {
        this.closedShop = closedShop;
    }

    public String getStoreBusinessCircle() {
        return storeBusinessCircle;
    }

    public void setStoreBusinessCircle(String storeBusinessCircle) {
        this.storeBusinessCircle = storeBusinessCircle;
    }

    public Double getBuildArea() {
        return buildArea;
    }

    public void setBuildArea(Double buildArea) {
        this.buildArea = buildArea;
    }

    public Double getPracticalArea() {
        return practicalArea;
    }

    public void setPracticalArea(Double practicalArea) {
        this.practicalArea = practicalArea;
    }

    public Double getDepotArea() {
        return depotArea;
    }

    public void setDepotArea(Double depotArea) {
        this.depotArea = depotArea;
    }

    public Integer getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(Integer displayNumber) {
        this.displayNumber = displayNumber;
    }

    public String getStorey() {
        return storey;
    }

    public void setStorey(String storey) {
        this.storey = storey;
    }

    public String getClubHouse() {
        return clubHouse;
    }

    public void setClubHouse(String clubHouse) {
        this.clubHouse = clubHouse;
    }

    public Integer getLightBoxNumber() {
        return lightBoxNumber;
    }

    public void setLightBoxNumber(Integer lightBoxNumber) {
        this.lightBoxNumber = lightBoxNumber;
    }

    public Integer getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(Integer parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public Integer getGoodsShelvesNumber() {
        return goodsShelvesNumber;
    }

    public void setGoodsShelvesNumber(Integer goodsShelvesNumber) {
        this.goodsShelvesNumber = goodsShelvesNumber;
    }

    public Integer getCupboardNumber() {
        return cupboardNumber;
    }

    public void setCupboardNumber(Integer cupboardNumber) {
        this.cupboardNumber = cupboardNumber;
    }

    public String getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(String geographicArea) {
        this.geographicArea = geographicArea;
    }

    public Integer getGbCounter() {
        return gbCounter;
    }

    public void setGbCounter(Integer gbCounter) {
        this.gbCounter = gbCounter;
    }

    public Integer getZdCounter() {
        return zdCounter;
    }

    public void setZdCounter(Integer zdCounter) {
        this.zdCounter = zdCounter;
    }

    public Integer getZdCounterEndBracket() {
        return zdCounterEndBracket;
    }

    public void setZdCounterEndBracket(Integer zdCounterEndBracket) {
        this.zdCounterEndBracket = zdCounterEndBracket;
    }

    public Integer getLcCounter() {
        return lcCounter;
    }

    public void setLcCounter(Integer lcCounter) {
        this.lcCounter = lcCounter;
    }

    public Integer getLiquorPromotionDesk() {
        return liquorPromotionDesk;
    }

    public void setLiquorPromotionDesk(Integer liquorPromotionDesk) {
        this.liquorPromotionDesk = liquorPromotionDesk;
    }

    public Integer getRedWinePromotionDesk() {
        return redWinePromotionDesk;
    }

    public void setRedWinePromotionDesk(Integer redWinePromotionDesk) {
        this.redWinePromotionDesk = redWinePromotionDesk;
    }

    public Integer getGeneralPromotionDesk() {
        return generalPromotionDesk;
    }

    public void setGeneralPromotionDesk(Integer generalPromotionDesk) {
        this.generalPromotionDesk = generalPromotionDesk;
    }

    public Integer getFreezer() {
        return freezer;
    }

    public void setFreezer(Integer freezer) {
        this.freezer = freezer;
    }

    public Integer getDuitou() {
        return duitou;
    }

    public void setDuitou(Integer duitou) {
        this.duitou = duitou;
    }

    public String getUnifiedLogo() {
        return unifiedLogo;
    }

    public void setUnifiedLogo(String unifiedLogo) {
        this.unifiedLogo = unifiedLogo;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public Boolean getAdjustAccounts() {
        return adjustAccounts;
    }

    public void setAdjustAccounts(Boolean adjustAccounts) {
        this.adjustAccounts = adjustAccounts;
    }

    public Boolean getLogistics() {
        return logistics;
    }

    public void setLogistics(Boolean logistics) {
        this.logistics = logistics;
    }

    public Boolean geteInvoice() {
        return eInvoice;
    }

    public void seteInvoice(Boolean eInvoice) {
        this.eInvoice = eInvoice;
    }

    public String getIncreaseTicket() {
        return increaseTicket;
    }

    public void setIncreaseTicket(String increaseTicket) {
        this.increaseTicket = increaseTicket;
    }

    public Boolean getMainStore() {
        return mainStore;
    }

    public void setMainStore(Boolean mainStore) {
        this.mainStore = mainStore;
    }

    public String getJdeCode() {
        return jdeCode;
    }

    public void setJdeCode(String jdeCode) {
        this.jdeCode = jdeCode;
    }

    public Time getOpenShopTime() {
        return openShopTime;
    }

    public void setOpenShopTime(Time openShopTime) {
        this.openShopTime = openShopTime;
    }

    public Time getCloseShopTime() {
        return closeShopTime;
    }

    public void setCloseShopTime(Time closeShopTime) {
        this.closeShopTime = closeShopTime;
    }
}
