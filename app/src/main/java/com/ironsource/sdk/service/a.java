package com.ironsource.sdk.service;

import java.util.HashMap;
import qe.k;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28229a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, Long> f28230b = new HashMap<>();

    private a() {
    }

    public static long a(String str) {
        k.f(str, "instance");
        Long l10 = f28230b.get(str);
        if (l10 != null) {
            k.e(l10, "it");
            return l10.longValue();
        }
        return -1L;
    }

    public static boolean a(String str, long j10) {
        k.f(str, "instance");
        if (!(str.length() == 0)) {
            HashMap<String, Long> hashMap = f28230b;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, Long.valueOf(j10));
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        k.f(str, "instance");
        HashMap<String, Long> hashMap = f28230b;
        if (hashMap.get(str) != null) {
            hashMap.remove(str);
            return true;
        }
        return false;
    }

    public static long c(String str) {
        k.f(str, "instance");
        Long l10 = f28230b.get(str);
        if (l10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            k.e(l10, "it");
            return currentTimeMillis - l10.longValue();
        }
        return -1L;
    }
}
