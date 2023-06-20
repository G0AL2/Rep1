package com.inmobi.media;

import android.content.Context;
import android.content.Intent;

/* compiled from: DebugBroadcastManager.java */
/* loaded from: classes3.dex */
public class gs {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25592a = "com.inmobi.media.gs";

    /* compiled from: DebugBroadcastManager.java */
    /* loaded from: classes3.dex */
    public enum a {
        NETWORK_REQUEST_RESPONSE,
        PRE_INIT_INSERTED,
        APP_FOCUS_CHANGE,
        JAVASCRIPT_CALL
    }

    public static void a(Intent intent) {
        intent.getAction();
        Context c10 = ho.c();
        if (c10 != null) {
            v0.a.b(c10).d(intent);
        }
    }
}
