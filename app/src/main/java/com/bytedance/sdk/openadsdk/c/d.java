package com.bytedance.sdk.openadsdk.c;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.s;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

/* compiled from: NetHook.java */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public static c f11229a;

    public static String a(com.bytedance.sdk.component.e.b.c cVar, String str) {
        c a10;
        Map map;
        if (!s.c() || (a10 = b.a("net")) == null || (map = (Map) a10.a(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get(ImagesContract.URL);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                cVar.b(str3, (String) map2.get(str3));
            }
        }
        return str;
    }

    @Override // com.bytedance.sdk.openadsdk.c.a
    public String a() {
        return "net";
    }
}
