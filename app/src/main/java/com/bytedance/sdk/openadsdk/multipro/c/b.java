package com.bytedance.sdk.openadsdk.multipro.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.e;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* compiled from: FrequentCallProviderImpl.java */
/* loaded from: classes.dex */
public class b implements com.bytedance.sdk.openadsdk.multipro.a {
    public static boolean a(String str) {
        if (m.a() == null) {
            return false;
        }
        try {
            IListenerManager e10 = e();
            if (e10 != null) {
                return InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(e10.getType(Uri.parse(f() + "checkFrequency?rit=" + String.valueOf(str))));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean c() {
        if (m.a() == null) {
            return false;
        }
        try {
            IListenerManager e10 = e();
            if (e10 != null) {
                return InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(e10.getType(Uri.parse(f() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String d() {
        if (m.a() == null) {
            return null;
        }
        try {
            IListenerManager e10 = e();
            if (e10 != null) {
                return e10.getType(Uri.parse(f() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static IListenerManager e() {
        try {
            if (m.a() != null) {
                return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String f() {
        return e.f13532b + "/t_frequent/";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public int a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public Uri a(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public String a() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public void b() {
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public String a(Uri uri) {
        l.b("FrequentCallProviderImpl", "get type uri: " + String.valueOf(uri));
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.d.a.a().a(uri.getQueryParameter("rit")) ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false";
        } else if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.d.a.a().b() ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false";
        } else if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.d.a.a().c();
        } else {
            return null;
        }
    }
}
