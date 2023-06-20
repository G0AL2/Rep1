package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;

/* compiled from: SlotUtils.java */
/* loaded from: classes.dex */
public class o {
    public static boolean a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        int e10;
        return (nVar == null || (e10 = u.e(nVar)) == 8 || e10 == 7 || nVar.G() == null || Build.VERSION.SDK_INT > 27) ? false : true;
    }
}
