package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: TTProviderManager.java */
/* loaded from: classes.dex */
public class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f13533a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<Context> f13534b;

    /* renamed from: c  reason: collision with root package name */
    private static List<a> f13535c;

    static {
        List<a> synchronizedList = Collections.synchronizedList(new ArrayList());
        f13535c = synchronizedList;
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.d.c());
        f13535c.add(new com.bytedance.sdk.openadsdk.multipro.a.b());
        f13535c.add(new com.bytedance.sdk.openadsdk.multipro.c.b());
        f13535c.add(new com.bytedance.sdk.openadsdk.multipro.c.a());
        for (a aVar : f13535c) {
            aVar.b();
        }
    }

    private f() {
    }

    public static f a(Context context) {
        if (context != null) {
            f13534b = new WeakReference<>(context.getApplicationContext());
        }
        if (f13533a == null) {
            synchronized (f.class) {
                if (f13533a == null) {
                    f13533a = new f();
                }
            }
        }
        return f13533a;
    }

    private a b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!c(uri)) {
            l.b("TTProviderManager", "uri is error1");
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            l.b("TTProviderManager", "uri is error2");
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            l.b("TTProviderManager", "uri is error3");
            return null;
        }
        for (a aVar : f13535c) {
            if (str.equals(aVar.a())) {
                return aVar;
            }
        }
        l.b("TTProviderManager", "uri is error4");
        return null;
    }

    private boolean c(Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public String a() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public void b() {
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            a b10 = b(uri);
            if (b10 != null) {
                return b10.a(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider query error==", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public String a(Uri uri) {
        try {
            a b10 = b(uri);
            if (b10 != null) {
                return b10.a(uri);
            }
            return null;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider getType error==", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public Uri a(Uri uri, ContentValues contentValues) {
        try {
            a b10 = b(uri);
            if (b10 != null) {
                return b10.a(uri, contentValues);
            }
            return null;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider insert error==", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public int a(Uri uri, String str, String[] strArr) {
        try {
            a b10 = b(uri);
            if (b10 != null) {
                return b10.a(uri, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider delete error==", th);
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            a b10 = b(uri);
            if (b10 != null) {
                return b10.a(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider update error==", th);
            return 0;
        }
    }
}
