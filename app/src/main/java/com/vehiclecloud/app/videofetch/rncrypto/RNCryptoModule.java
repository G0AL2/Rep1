package com.vehiclecloud.app.videofetch.rncrypto;

import android.util.Log;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.inmobi.media.fq;
import fm.castbox.mediation.BuildConfig;
import java.security.MessageDigest;
import java.util.UUID;

/* loaded from: classes3.dex */
public class RNCryptoModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNCrypto";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    public String md5(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("md5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
                if (hexString.length() < 2) {
                    sb2.append("0");
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Exception e10) {
            Log.e(TAG, "md5 get ex:", e10);
            return null;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
