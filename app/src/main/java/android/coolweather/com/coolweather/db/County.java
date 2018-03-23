package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/3/23.
 */

public class County extends DataSupport {
    private int id;   //每个实体类的固定字段
    private String countryName;  //记录县的名字
    private String weatherId;   //记录县对应的天气的id
    private int cityId;  //记录当前县所属市的id值

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setCityId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
