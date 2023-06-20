package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* compiled from: IdentityInfo.java */
/* renamed from: com.inmobi.media.if  reason: invalid class name */
/* loaded from: classes3.dex */
public class Cif {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25753a = "if";

    public static Map<String, String> a() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", hp.a());
            Boolean g10 = iq.a().g();
            if (g10 != null) {
                hashMap.put("u-id-adt", String.valueOf(g10.booleanValue() ? 1 : 0));
            }
            hashMap.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(calendar.get(15) + calendar.get(16)));
            ih a10 = ih.a();
            HashMap hashMap2 = new HashMap();
            if (a10.f25772d && (str = a10.f25769a) != null) {
                hashMap2.put("u-s-id", str);
            }
            hashMap.putAll(hashMap2);
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
