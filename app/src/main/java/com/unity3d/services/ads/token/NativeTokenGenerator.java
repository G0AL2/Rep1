package com.unity3d.services.ads.token;

import android.util.Base64;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class NativeTokenGenerator implements INativeTokenGenerator {
    private IDeviceInfoReader _deviceInfoReader;
    private ExecutorService _executorService;

    public NativeTokenGenerator(ExecutorService executorService, IDeviceInfoReader iDeviceInfoReader) {
        this._executorService = executorService;
        this._deviceInfoReader = iDeviceInfoReader;
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGenerator
    public void generateToken(final INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        this._executorService.execute(new Runnable() { // from class: com.unity3d.services.ads.token.NativeTokenGenerator.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String encodeToString = Base64.encodeToString(new DeviceInfoReaderCompressor(NativeTokenGenerator.this._deviceInfoReader).getDeviceData(), 2);
                    StringBuilder sb2 = new StringBuilder(encodeToString.length() + 2);
                    sb2.append("1:");
                    sb2.append(encodeToString);
                    iNativeTokenGeneratorListener.onReady(sb2.toString());
                } catch (Exception e10) {
                    DeviceLog.exception("Unity Ads failed to generate token.", e10);
                    iNativeTokenGeneratorListener.onReady(null);
                }
            }
        });
    }
}
