package com.iab.omid.library.ironsrc.d;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public final class c {
    public static void a(String str) {
        if (!com.iab.omid.library.ironsrc.a.f24246a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void a(String str, Exception exc) {
        if ((!com.iab.omid.library.ironsrc.a.f24246a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
