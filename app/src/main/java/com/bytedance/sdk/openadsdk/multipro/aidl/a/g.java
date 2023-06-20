package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: ProviderListenerManagerImpl.java */
/* loaded from: classes.dex */
public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f13474a;

    public static g a() {
        if (f13474a == null) {
            synchronized (g.class) {
                if (f13474a == null) {
                    f13474a = new g();
                }
            }
        }
        return f13474a;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public int delete(Uri uri, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return com.bytedance.sdk.openadsdk.multipro.f.a(m.a()).a(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public String getType(Uri uri) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return com.bytedance.sdk.openadsdk.multipro.f.a(m.a()).a(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public String insert(Uri uri, ContentValues contentValues) {
        Uri a10;
        if (com.bytedance.sdk.openadsdk.core.i.e.a() && (a10 = com.bytedance.sdk.openadsdk.multipro.f.a(m.a()).a(uri, contentValues)) != null) {
            return a10.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            try {
                HashMap hashMap = new HashMap();
                Cursor a10 = com.bytedance.sdk.openadsdk.multipro.f.a(m.a()).a(uri, strArr, str, strArr2, str2);
                if (a10 != null) {
                    String[] columnNames = a10.getColumnNames();
                    while (a10.getCount() > 0 && a10.moveToNext()) {
                        for (String str3 : columnNames) {
                            if (!hashMap.containsKey(str3)) {
                                hashMap.put(str3, new LinkedList());
                            }
                            ((List) hashMap.get(str3)).add(a10.getString(a10.getColumnIndex(str3)));
                        }
                    }
                    a10.close();
                }
                return hashMap;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.a.a, com.bytedance.sdk.openadsdk.IListenerManager
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return com.bytedance.sdk.openadsdk.multipro.f.a(m.a()).a(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
