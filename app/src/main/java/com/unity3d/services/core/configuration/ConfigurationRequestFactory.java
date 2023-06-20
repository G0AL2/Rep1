package com.unity3d.services.core.configuration;

import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressorWithMetrics;
import com.unity3d.services.core.device.reader.DeviceInfoReaderUrlEncoder;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequest;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ConfigurationRequestFactory {
    private final String _configUrl;
    private final Configuration _configuration;
    private final IDeviceInfoReader _deviceInfoReader;

    public ConfigurationRequestFactory(Configuration configuration, IDeviceInfoReader iDeviceInfoReader, String str) {
        this._configuration = configuration;
        this._deviceInfoReader = iDeviceInfoReader;
        this._configUrl = str;
    }

    private String buildCompressedQueryStringIfNeeded() {
        Experiments experiments = this._configuration.getExperiments();
        if (experiments == null || !experiments.isTwoStageInitializationEnabled() || experiments.isPOSTMethodInConfigRequestEnabled()) {
            return "";
        }
        String urlEncodedData = new DeviceInfoReaderUrlEncoder(new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(this._deviceInfoReader), experiments)).getUrlEncodedData();
        return "c=" + urlEncodedData;
    }

    private String buildQueryString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("?");
        Experiments experiments = this._configuration.getExperiments();
        if (experiments != null && experiments.isTwoStageInitializationEnabled()) {
            sb2.append(buildCompressedQueryStringIfNeeded());
        } else {
            sb2.append("ts=");
            sb2.append(System.currentTimeMillis());
            sb2.append("&sdkVersion=");
            sb2.append(SdkProperties.getVersionCode());
            sb2.append("&sdkVersionName=");
            sb2.append(SdkProperties.getVersionName());
            sb2.append("&gameId=");
            sb2.append(ClientProperties.getGameId());
        }
        return sb2.toString();
    }

    public WebRequest getWebRequest() throws MalformedURLException {
        String str = this._configUrl + buildQueryString();
        DeviceLog.debug("Requesting configuration with: " + str);
        Experiments experiments = this._configuration.getExperiments();
        if (experiments != null && experiments.isTwoStageInitializationEnabled() && experiments.isPOSTMethodInConfigRequestEnabled()) {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Encoding", Collections.singletonList("gzip"));
            WebRequest webRequest = new WebRequest(str, "POST", hashMap);
            webRequest.setBody(new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(this._deviceInfoReader), experiments).getDeviceData());
            return webRequest;
        }
        return new WebRequest(str, "GET");
    }
}
