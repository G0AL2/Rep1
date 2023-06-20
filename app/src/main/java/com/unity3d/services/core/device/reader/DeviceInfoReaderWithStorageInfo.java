package com.unity3d.services.core.device.reader;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import com.unity3d.services.core.misc.Utilities;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class DeviceInfoReaderWithStorageInfo implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final List<IJsonStorageReader> _storageReaders;
    private static final List<String> _includedKeys = Arrays.asList("privacy", "gdpr", "framework", "adapter", "mediation", "unity", "pipl", "configuration", "user", JsonStorageKeyNames.UNIFIED_CONFIG_KEY);
    private static final List<String> _blackListOfKeys = Arrays.asList("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral");

    public DeviceInfoReaderWithStorageInfo(IDeviceInfoReader iDeviceInfoReader, IJsonStorageReader... iJsonStorageReaderArr) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._storageReaders = Arrays.asList(iJsonStorageReaderArr);
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        return deviceInfoData != null ? Utilities.combineJsonIntoMap(deviceInfoData, new JsonFlattener(new JsonStorageAggregator(this._storageReaders).getData()).flattenJson(".", _includedKeys, Collections.singletonList(AppMeasurementSdk.ConditionalUserProperty.VALUE), _blackListOfKeys)) : deviceInfoData;
    }
}
