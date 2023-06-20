package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdSdk;

/* compiled from: Logger.java */
/* loaded from: classes3.dex */
public final class hu {

    /* renamed from: a  reason: collision with root package name */
    private static byte f25705a;

    public static void a(byte b10, String str, String str2) {
        if (b10 == 1) {
            byte b11 = f25705a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                Log.e("[InMobi]", str2);
            }
        } else if (b10 == 2) {
            byte b12 = f25705a;
            if (2 == b12 || 3 == b12) {
                Log.d("[InMobi]", str2);
            }
        } else if (b10 != 3) {
        } else {
            if (str2.length() > 4000) {
                while (str2.length() > 4000) {
                    Log.d(str, str2.substring(0, TTAdSdk.INIT_LOCAL_FAIL_CODE));
                    str2 = str2.substring(TTAdSdk.INIT_LOCAL_FAIL_CODE);
                }
                Log.d(str, str2);
                return;
            }
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2) {
        a((byte) 3, str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        a((byte) 3, str, str2, th);
    }

    public static void a(byte b10, String str, String str2, Throwable th) {
        if (b10 == 1) {
            byte b11 = f25705a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                Log.e("[InMobi]", str2, th);
            }
        } else if (b10 != 2) {
            if (b10 != 3) {
                return;
            }
            Log.d(str, str2, th);
        } else {
            byte b12 = f25705a;
            if (2 == b12 || 3 == b12) {
                Log.d("[InMobi]", str2, th);
            }
        }
    }

    public static void a(byte b10) {
        f25705a = b10;
    }
}
