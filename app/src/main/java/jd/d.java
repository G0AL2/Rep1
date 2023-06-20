package jd;

import android.content.Context;

/* compiled from: NetInfoUtils.java */
/* loaded from: classes3.dex */
public class d {
    public static boolean a(Context context) {
        return androidx.core.content.b.a(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    public static void b(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - i10) - 1];
            bArr[(bArr.length - i10) - 1] = b10;
        }
    }
}
