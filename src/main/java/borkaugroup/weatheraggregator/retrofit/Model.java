package borkaugroup.weatheraggregator.retrofit;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "temp",
        "feels_like",
        "temp_min",
        "temp_max",
        "pressure",
        "humidity"
})
public class Model {

    @JsonProperty("temp")
    private float temp;
    @JsonProperty("feels_like")
    private float feelsLike;
    @JsonProperty("temp_min")
    private float tempMin;
    @JsonProperty("temp_max")
    private float tempMax;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("temp")
    public float getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(float temp) {
        this.temp = temp;
    }

    @JsonProperty("feels_like")
    public float getFeelsLike() {
        return feelsLike;
    }

    @JsonProperty("feels_like")
    public void setFeelsLike(float feelsLike) {
        this.feelsLike = feelsLike;
    }

    @JsonProperty("temp_min")
    public float getTempMin() {
        return tempMin;
    }

    @JsonProperty("temp_min")
    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    @JsonProperty("temp_max")
    public float getTempMax() {
        return tempMax;
    }

    @JsonProperty("temp_max")
    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    @JsonProperty("pressure")
    public int getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}