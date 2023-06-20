package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiDataSelector;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class DeviceInfoReaderBuilder {
    private ConfigurationReader _configurationReader;

    public DeviceInfoReaderBuilder(ConfigurationReader configurationReader) {
        this._configurationReader = configurationReader;
    }

    private Experiments getCurrentExperiments() {
        ConfigurationReader configurationReader = this._configurationReader;
        if (configurationReader != null && configurationReader.getCurrentConfiguration() != null) {
            return this._configurationReader.getCurrentConfiguration().getExperiments();
        }
        return new Experiments();
    }

    private Map<String, String> getCurrentMetricTags() {
        ConfigurationReader configurationReader = this._configurationReader;
        if (configurationReader != null && configurationReader.getCurrentConfiguration() != null) {
            return this._configurationReader.getCurrentConfiguration().getMetricTags();
        }
        return new HashMap();
    }

    public IDeviceInfoReader build() {
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        Storage storage2 = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        return new DeviceInfoReaderWithMetrics(new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithPII(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithLifecycle(new DeviceInfoReader(), CachedLifecycle.getLifecycleListener()), storage, storage2), new PiiDataSelector(new PiiTrackingStatusReader(new JsonStorageAggregator(Arrays.asList(storage2, storage))), storage, getCurrentExperiments()), new PiiDataProvider()), new DeviceInfoReaderFilterProvider(storage).getFilterList()), getCurrentMetricTags());
    }
}
