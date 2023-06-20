package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.f;

/* compiled from: DBAdapter.java */
/* loaded from: classes.dex */
public class e extends f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f12008a;

    private e(Context context) {
        super(context);
    }

    public static e a(Context context) {
        if (f12008a == null) {
            synchronized (e.class) {
                if (f12008a == null) {
                    f12008a = new e(context);
                }
            }
        }
        return f12008a;
    }

    @Override // com.bytedance.sdk.openadsdk.core.f
    public /* bridge */ /* synthetic */ f.c a() {
        return super.a();
    }
}
