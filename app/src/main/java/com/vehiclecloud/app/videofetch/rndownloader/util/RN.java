package com.vehiclecloud.app.videofetch.rndownloader.util;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public final class RN {
    public static int i(ReadableMap readableMap, String str, int i10) {
        if (readableMap != null && readableMap.hasKey(str)) {
            try {
                return readableMap.getInt(str);
            } catch (Exception unused) {
                return i10;
            }
        }
        return i10;
    }

    public static long l(ReadableMap readableMap, String str, long j10) {
        if (readableMap != null && readableMap.hasKey(str)) {
            try {
                return (long) readableMap.getDouble(str);
            } catch (Exception unused) {
                return j10;
            }
        }
        return j10;
    }

    public static String str(ReadableMap readableMap, String str, String str2) {
        String string;
        return (readableMap == null || !readableMap.hasKey(str) || (string = readableMap.getString(str)) == null) ? str2 : string;
    }

    public static void i(WritableMap writableMap, String str, int i10) {
        writableMap.putInt(str, i10);
    }

    public static void l(WritableMap writableMap, String str, long j10) {
        writableMap.putDouble(str, j10);
    }

    public static void str(WritableMap writableMap, String str, String str2) {
        if (str2 != null) {
            writableMap.putString(str, str2);
        }
    }
}
