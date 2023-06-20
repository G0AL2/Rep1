package com.inmobi.media;

import android.content.Context;

/* compiled from: PermissionUtils.java */
/* loaded from: classes3.dex */
public class hw {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25707a = "hw";

    public static boolean a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
