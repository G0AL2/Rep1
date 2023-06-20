package com.bytedance.sdk.component.e.d;

import android.util.Log;
import com.bytedance.sdk.component.e.d.b;

/* compiled from: DefaultLoggerDelegate.java */
/* loaded from: classes.dex */
public class a implements b.InterfaceC0159b {
    @Override // com.bytedance.sdk.component.e.d.b.InterfaceC0159b
    public void a(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.bytedance.sdk.component.e.d.b.InterfaceC0159b
    public void b(String str, String str2) {
        Log.d(str, str2);
    }
}
