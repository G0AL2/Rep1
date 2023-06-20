package com.bytedance.sdk.component.d.c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.d.c.c;
import com.bytedance.sdk.component.d.i;
import com.bytedance.sdk.component.d.l;
import com.bytedance.sdk.component.d.m;
import com.bytedance.sdk.component.d.q;
import com.facebook.react.modules.image.ImageLoaderModule;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

/* compiled from: ImageLoader.java */
/* loaded from: classes.dex */
public class b implements m {

    /* renamed from: a  reason: collision with root package name */
    private volatile f f10172a;

    private b() {
    }

    public static m a(Context context, l lVar) {
        b bVar = new b();
        bVar.b(context, lVar);
        return bVar;
    }

    private void b(Context context, l lVar) {
        if (this.f10172a != null) {
            Log.w(ImageLoaderModule.NAME, "already init!");
        }
        if (lVar == null) {
            lVar = e.a(context);
        }
        this.f10172a = new f(context, lVar);
    }

    @Override // com.bytedance.sdk.component.d.m
    public i a(String str) {
        return new c.b(this.f10172a).c(str);
    }

    @Override // com.bytedance.sdk.component.d.m
    public InputStream a(String str, String str2) {
        if (this.f10172a != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.d.c.c.c.a(str);
            }
            Collection<q> a10 = this.f10172a.a();
            if (a10 != null) {
                for (q qVar : a10) {
                    byte[] a11 = qVar.a(str2);
                    if (a11 != null) {
                        return new ByteArrayInputStream(a11);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.d.c> b10 = this.f10172a.b();
            if (b10 != null) {
                for (com.bytedance.sdk.component.d.c cVar : b10) {
                    InputStream a12 = cVar.a(str2);
                    if (a12 != null) {
                        return a12;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.d.m
    public boolean a(String str, String str2, String str3) {
        if (this.f10172a == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.d.c.c.c.a(str);
        }
        com.bytedance.sdk.component.d.c a10 = this.f10172a.a(str3);
        if (a10 != null) {
            return a10.b(str2);
        }
        return false;
    }
}
