package br.com.automacao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {
	@Builder.Default
	private String Email = "email";
	@Builder.Default
	private String City = "Boston"; 
	@Builder.Default
	private String State = "MA";
	@Builder.Default
	private String TempF = "41.0";
	@Builder.Default
	private String TempC = "5.0";
	@Builder.Default
	private String Weather = "Partly Cloudy";
	@Builder.Default
	private String WindMPH ="18.4";
	@Builder.Default
	private String WindDir = "Southwest";
	@Builder.Default
	private String RelativeHumidity = "53";
	@Builder.Default
	private String VisibilityMiles = "10.00";
	@Builder.Default
	private String AirQualityIndex = "32";
	@Builder.Default
	private String AirQualityCode = "1";
	@Builder.Default
	private String AirQuality = "Good";
	@Builder.Default
	private String Sunrise = "05:56";
	@Builder.Default
	private String Sunset = "20:16";
	@Builder.Default
	private String DaylightHours = "14";
	@Builder.Default
	private String DaylightMinutes = "19";
	@Builder.Default
	private String Code = "Success";
	@Builder.Default
	private int Credits = 74223;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getTempF() {
		return TempF;
	}
	public void setTempF(String tempF) {
		TempF = tempF;
	}
	public String getTempC() {
		return TempC;
	}
	public void setTempC(String tempC) {
		TempC = tempC;
	}
	public String getWeather() {
		return Weather;
	}
	public void setWeather(String weather) {
		Weather = weather;
	}
	public String getWindMPH() {
		return WindMPH;
	}
	public void setWindMPH(String windMPH) {
		WindMPH = windMPH;
	}
	public String getWindDir() {
		return WindDir;
	}
	public void setWindDir(String windDir) {
		WindDir = windDir;
	}
	public String getRelativeHumidity() {
		return RelativeHumidity;
	}
	public void setRelativeHumidity(String relativeHumidity) {
		RelativeHumidity = relativeHumidity;
	}
	public String getVisibilityMiles() {
		return VisibilityMiles;
	}
	public void setVisibilityMiles(String visibilityMiles) {
		VisibilityMiles = visibilityMiles;
	}
	public String getAirQualityIndex() {
		return AirQualityIndex;
	}
	public void setAirQualityIndex(String airQualityIndex) {
		AirQualityIndex = airQualityIndex;
	}
	public String getAirQualityCode() {
		return AirQualityCode;
	}
	public void setAirQualityCode(String airQualityCode) {
		AirQualityCode = airQualityCode;
	}
	public String getAirQuality() {
		return AirQuality;
	}
	public void setAirQuality(String airQuality) {
		AirQuality = airQuality;
	}
	public String getSunrise() {
		return Sunrise;
	}
	public void setSunrise(String sunrise) {
		Sunrise = sunrise;
	}
	public String getSunset() {
		return Sunset;
	}
	public void setSunset(String sunset) {
		Sunset = sunset;
	}
	public String getDaylightHours() {
		return DaylightHours;
	}
	public void setDaylightHours(String daylightHours) {
		DaylightHours = daylightHours;
	}
	public String getDaylightMinutes() {
		return DaylightMinutes;
	}
	public void setDaylightMinutes(String daylightMinutes) {
		DaylightMinutes = daylightMinutes;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int credits) {
		Credits = credits;
	}
}
