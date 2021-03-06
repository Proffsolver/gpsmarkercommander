package mobi.gpsmarker.gpsmarkercommander.data.network.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import static android.R.attr.data;

public class M180SettingsDeviceRes {

    @SerializedName("error")
    @Expose
    public String error;
    @SerializedName("data")
    @Expose
    public Datum data = null;

    public Datum getSettingsDevice() {
        return data;
    }

    public class Datum {

        @SerializedName("error")
        @Expose
        public String error;
        @SerializedName("mode_device")
        @Expose
        public int modeDevice;
        @SerializedName("language_device")
        @Expose
        public int languageDevice;
        @SerializedName("name_device")
        @Expose
        public String nameDevice;
        @SerializedName("name_device_on")
        @Expose
        public int nameDeviceOn;
        @SerializedName("gps_url_device")
        @Expose
        public int gpsUrlDevice;
        @SerializedName("gps_device_on")
        @Expose
        public int gpsDeviceOn;
        @SerializedName("unsleep_sms_device")
        @Expose
        public int unsleepSmsDevice;
        @SerializedName("worry_call_device")
        @Expose
        public int worryCallDevice;
        @SerializedName("time_park_device")
        @Expose
        public String timeParkDevice;
        @SerializedName("utc_device")
        @Expose
        public String utcDevice;
        @SerializedName("lbs_device_on")
        @Expose
        public int lbsDeviceOn;
        @SerializedName("phone_1_device")
        @Expose
        public String phone1Device;
        @SerializedName("phone_1_device_on")
        @Expose
        public int phone1DeviceOn;
        @SerializedName("phone_2_device")
        @Expose
        public String phone2Device;
        @SerializedName("phone_2_device_on")
        @Expose
        public int phone2DeviceOn;
        @SerializedName("phone_3_device")
        @Expose
        public String phone3Device;
        @SerializedName("phone_3_device_on")
        @Expose
        public int phone3DeviceOn;
        @SerializedName("phone_4_device")
        @Expose
        public String phone4Device;
        @SerializedName("phone_4_device_on")
        @Expose
        public int phone4DeviceOn;
        @SerializedName("phone_5_device")
        @Expose
        public String phone5Device;
        @SerializedName("phone_5_device_on")
        @Expose
        public int phone5DeviceOn;
        @SerializedName("phone_6_device")
        @Expose
        public String phone6Device;
        @SerializedName("phone_6_device_on")
        @Expose
        public int phone6DeviceOn;
        @SerializedName("phone_7_device")
        @Expose
        public String phone7Device;
        @SerializedName("phone_7_device_on")
        @Expose
        public int phone7DeviceOn;
        @SerializedName("phone_8_device")
        @Expose
        public String phone8Device;
        @SerializedName("phone_8_device_on")
        @Expose
        public int phone8DeviceOn;
        @SerializedName("phone_9_device")
        @Expose
        public String phone9Device;
        @SerializedName("phone_9_device_on")
        @Expose
        public int phone9DeviceOn;
        @SerializedName("unsleep_alarm_device")
        @Expose
        public String unsleepAlarmDevice;
        @SerializedName("alarm_1_device")
        @Expose
        public String alarm1Device;
        @SerializedName("alarm_1_device_on")
        @Expose
        public int alarm1DeviceOn;
        @SerializedName("alarm_2_device")
        @Expose
        public String alarm2Device;
        @SerializedName("alarm_2_device_on")
        @Expose
        public int alarm2DeviceOn;
        @SerializedName("alarm_3_device")
        @Expose
        public String alarm3Device;
        @SerializedName("alarm_3_device_on")
        @Expose
        public int alarm3DeviceOn;
        @SerializedName("alarm_4_device")
        @Expose
        public String alarm4Device;
        @SerializedName("alarm_4_device_on")
        @Expose
        public int alarm4DeviceOn;
        @SerializedName("alarm_5_device")
        @Expose
        public String alarm5Device;
        @SerializedName("alarm_5_device_on")
        @Expose
        public int alarm5DeviceOn;
        @SerializedName("alarm_6_device")
        @Expose
        public String alarm6Device;
        @SerializedName("alarm_6_device_on")
        @Expose
        public int alarm6DeviceOn;
        @SerializedName("alarm_7_device")
        @Expose
        public String alarm7Device;
        @SerializedName("alarm_7_device_on")
        @Expose
        public int alarm7DeviceOn;
        @SerializedName("alarm_8_device")
        @Expose
        public String alarm8Device;
        @SerializedName("alarm_8_device_on")
        @Expose
        public int alarm8DeviceOn;
        @SerializedName("alarm_9_device")
        @Expose
        public String alarm9Device;
        @SerializedName("alarm_9_device_on")
        @Expose
        public int alarm9DeviceOn;
        @SerializedName("balance_device_on")
        @Expose
        public int balanceDeviceOn;
        @SerializedName("min_balance_device")
        @Expose
        public String minBalanceDevice;
        @SerializedName("ussd_balance_device")
        @Expose
        public String ussdBalanceDevice;
        @SerializedName("button_device_on")
        @Expose
        public int buttonDeviceOn;
        @SerializedName("move_device")
        @Expose
        public int moveDevice;
        @SerializedName("move_device_on")
        @Expose
        public int moveDeviceOn;
        @SerializedName("unmove_device")
        @Expose
        public int unmoveDevice;
        @SerializedName("unmove_device_on")
        @Expose
        public int unmoveDeviceOn;
        @SerializedName("speed_device")
        @Expose
        public int speedDevice;
        @SerializedName("speed_device_on")
        @Expose
        public int speedDeviceOn;
        @SerializedName("jack_device_on")
        @Expose
        public int jackDeviceOn;
        @SerializedName("temp_device_on")
        @Expose
        public int tempDeviceOn;
        @SerializedName("temp_device_1")
        @Expose
        public String tempDevice1;
        @SerializedName("temp_device_2")
        @Expose
        public String tempDevice2;
        @SerializedName("temp_relay_device")
        @Expose
        public int tempRelayDevice;
        @SerializedName("temp_relay_sms_device")
        @Expose
        public int tempRelaySmsDevice;
        @SerializedName("temp_imp_device")
        @Expose
        public int tempImpDevice;
        @SerializedName("internet_device_on")
        @Expose
        public int internetDeviceOn;
        @SerializedName("url_server_device")
        @Expose
        public String urlServerDevice;
        @SerializedName("port_sever_device")
        @Expose
        public int portSeverDevice;
        @SerializedName("url_apn_device")
        @Expose
        public String urlApnDevice;
        @SerializedName("login_apn_device")
        @Expose
        public String loginApnDevice;
        @SerializedName("password_apn_device")
        @Expose
        public String passwordApnDevice;
        @SerializedName("time_send_message_device")
        @Expose
        public int timeSendMessageDevice;
        @SerializedName("adtrack_device_on")
        @Expose
        public int adtrackDeviceOn;
        @SerializedName("date_device_data")
        @Expose
        public String dateDeviceData;
        @SerializedName("battery_device")
        @Expose
        public String batteryDevice;
        @SerializedName("longitube_device_gps")
        @Expose
        public int longitubeDeviceGps;
        @SerializedName("latitube_device_gps")
        @Expose
        public int latitubeDeviceGps;
        @SerializedName("date_device_gps")
        @Expose
        public String dateDeviceGps;
        @SerializedName("count_device_gps")
        @Expose
        public String countDeviceGps;
        @SerializedName("longitube_device_lbs")
        @Expose
        public int longitubeDeviceLbs;
        @SerializedName("latitube_device_lbs")
        @Expose
        public int latitubeDeviceLbs;
        @SerializedName("date_device_lbs")
        @Expose
        public String dateDeviceLbs;
        @SerializedName("count_device_lbs")
        @Expose
        public String countDeviceLbs;
        @SerializedName("balance_device")
        @Expose
        public String balanceDevice;
        @SerializedName("temp_device")
        @Expose
        public String tempDevice;
        @SerializedName("longitube_device")
        @Expose
        public int longitubeDevice;
        @SerializedName("latitube_device")
        @Expose
        public int latitubeDevice;
        @SerializedName("radius_device")
        @Expose
        public int radiusDevice;



        public String getTempDevice() { return tempDevice; }

        public int getLanguageDevice() {
            return languageDevice;
        }

        public String getNameDevice() {   return nameDevice;    }

        public int getNameDeviceOn() {
            return nameDeviceOn;
        }

        public int getGpsUrlDevice() {
            return gpsUrlDevice;
        }

        public int getGpsDeviceOn() {
            return gpsDeviceOn;
        }

        public int getUnsleepSmsDevice() {
            return unsleepSmsDevice;
        }

        public int getWorryCallDevice() {
            return worryCallDevice;
        }

        public String getTimeParkDevice() {
            return timeParkDevice;
        }

        public String getUtcDevice() {
            return utcDevice;
        }

        public int getLbsDeviceOn() {
            return lbsDeviceOn;
        }

        public String getPhone1Device() {
            return phone1Device;
        }

        public int getPhone1DeviceOn() {
            return phone1DeviceOn;
        }

        public String getPhone2Device() {
            return phone2Device;
        }

        public int getPhone2DeviceOn() {
            return phone2DeviceOn;
        }

        public String getPhone3Device() {
            return phone3Device;
        }

        public int getPhone3DeviceOn() {
            return phone3DeviceOn;
        }

        public String getPhone4Device() {
            return phone4Device;
        }

        public int getPhone4DeviceOn() {
            return phone4DeviceOn;
        }

        public String getPhone5Device() {
            return phone5Device;
        }

        public int getPhone5DeviceOn() {
            return phone5DeviceOn;
        }

        public String getPhone6Device() {
            return phone6Device;
        }

        public int getPhone6DeviceOn() {
            return phone6DeviceOn;
        }

        public String getPhone7Device() {
            return phone7Device;
        }

        public int getPhone7DeviceOn() {
            return phone7DeviceOn;
        }

        public String getPhone8Device() {
            return phone8Device;
        }

        public int getPhone8DeviceOn() {
            return phone8DeviceOn;
        }

        public String getPhone9Device() {
            return phone9Device;
        }

        public int getPhone9DeviceOn() {
            return phone9DeviceOn;
        }

        public String getUnsleepAlarmDevice() {
            return unsleepAlarmDevice;
        }

        public String getAlarm1Device() {
            return alarm1Device;
        }

        public int getAlarm1DeviceOn() {
            return alarm1DeviceOn;
        }

        public String getAlarm2Device() {
            return alarm2Device;
        }

        public int getAlarm2DeviceOn() {
            return alarm2DeviceOn;
        }

        public String getAlarm3Device() {
            return alarm3Device;
        }

        public int getAlarm3DeviceOn() {
            return alarm3DeviceOn;
        }

        public String getAlarm4Device() {
            return alarm4Device;
        }

        public int getAlarm4DeviceOn() {
            return alarm4DeviceOn;
        }

        public String getAlarm5Device() {
            return alarm5Device;
        }

        public int getAlarm5DeviceOn() {
            return alarm5DeviceOn;
        }

        public String getAlarm6Device() {
            return alarm6Device;
        }

        public int getAlarm6DeviceOn() {
            return alarm6DeviceOn;
        }

        public String getAlarm7Device() {
            return alarm7Device;
        }

        public int getAlarm7DeviceOn() {
            return alarm7DeviceOn;
        }

        public String getAlarm8Device() {
            return alarm8Device;
        }

        public int getAlarm8DeviceOn() {
            return alarm8DeviceOn;
        }

        public String getAlarm9Device() {
            return alarm9Device;
        }

        public int getAlarm9DeviceOn() {
            return alarm9DeviceOn;
        }

        public int getBalanceDeviceOn() {
            return balanceDeviceOn;
        }

        public String getMinBalanceDevice() {
            return minBalanceDevice;
        }

        public String getUssdBalanceDevice() {
            return ussdBalanceDevice;
        }

        public int getButtonDeviceOn() {
            return buttonDeviceOn;
        }

        public int getMoveDevice() {
            return moveDevice;
        }

        public int getMoveDeviceOn() {
            return moveDeviceOn;
        }

        public int getUnmoveDevice() {
            return unmoveDevice;
        }

        public int getUnmoveDeviceOn() {
            return unmoveDeviceOn;
        }

        public int getSpeedDevice() {
            return speedDevice;
        }

        public int getSpeedDeviceOn() {
            return speedDeviceOn;
        }

        public int getJackDeviceOn() {
            return jackDeviceOn;
        }

        public int getTempDeviceOn() {
            return tempDeviceOn;
        }

        public String getTempDevice1() {
            return tempDevice1;
        }

        public String getTempDevice2() {
            return tempDevice2;
        }

        public int getTempRelayDevice() {
            return tempRelayDevice;
        }

        public int getTempRelaySmsDevice() {
            return tempRelaySmsDevice;
        }

        public int getTempImpDevice() {
            return tempImpDevice;
        }

        public int getInternetDeviceOn() {
            return internetDeviceOn;
        }

        public String getUrlServerDevice() {
            return urlServerDevice;
        }

        public int getPortSeverDevice() {
            return portSeverDevice;
        }

        public String getUrlApnDevice() {
            return urlApnDevice;
        }

        public String getLoginApnDevice() {
            return loginApnDevice;
        }

        public String getPasswordApnDevice() {
            return passwordApnDevice;
        }

        public int getTimeSendMessageDevice() {
            return timeSendMessageDevice;
        }

        public int getAdtrackDeviceOn() {
            return adtrackDeviceOn;
        }

        public String getDateDeviceData() {
            return dateDeviceData;
        }

        public String getBatteryDevice() {
            return batteryDevice;
        }

        public int getLongitubeDeviceGps() {
            return longitubeDeviceGps;
        }

        public int getLatitubeDeviceGps() {
            return latitubeDeviceGps;
        }

        public String getDateDeviceGps() {
            return dateDeviceGps;
        }

        public String getCountDeviceGps() {
            return countDeviceGps;
        }

        public int getLongitubeDeviceLbs() {
            return longitubeDeviceLbs;
        }

        public int getLatitubeDeviceLbs() {
            return latitubeDeviceLbs;
        }

        public String getDateDeviceLbs() {
            return dateDeviceLbs;
        }

        public String getCountDeviceLbs() {
            return countDeviceLbs;
        }

        public String getBalanceDevice() {
            return balanceDevice;
        }

        public int getModeDevice() {
            return modeDevice;
        }

        public int getLongitubeDevice() {
            return longitubeDevice;
        }

        public int getLatitubeDevice() {
            return latitubeDevice;
        }

        public int getRadiusDevice() {
            return radiusDevice;
        }

    }
}
