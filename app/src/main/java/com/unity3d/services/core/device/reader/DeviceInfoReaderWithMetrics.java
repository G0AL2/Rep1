package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.Map;

/* loaded from: classes3.dex */
public class DeviceInfoReaderWithMetrics implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final Map<String, String> _metricTags;

    public DeviceInfoReaderWithMetrics(IDeviceInfoReader iDeviceInfoReader, Map<String, String> map) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._metricTags = map;
    }

    private void sendMetrics(Map<String, Object> map) {
        if (map == null || this._metricTags == null) {
            return;
        }
        Object obj = map.get("unifiedconfig.data.gameSessionId");
        if ((obj instanceof Long) && ((Long) obj).longValue() == 0) {
            SDKMetrics.getInstance().sendMetric(TSIMetric.newMissingGameSessionId(this._metricTags));
        }
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        IDeviceInfoReader iDeviceInfoReader = this._deviceInfoReader;
        if (iDeviceInfoReader == null) {
            return null;
        }
        Map<String, Object> deviceInfoData = iDeviceInfoReader.getDeviceInfoData();
        sendMetrics(deviceInfoData);
        return deviceInfoData;
    }
}
