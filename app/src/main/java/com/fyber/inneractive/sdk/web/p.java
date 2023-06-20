package com.fyber.inneractive.sdk.web;

import android.util.LruCache;

/* loaded from: classes2.dex */
public class p<K> extends LruCache<K, s> {
    public p(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public int sizeOf(Object obj, s sVar) {
        String str;
        s sVar2 = sVar;
        int i10 = 0;
        for (String str2 : sVar2.f20452b.keySet()) {
            if (str2 != null && (str = sVar2.f20452b.get(str2)) != null) {
                i10 += str2.length() + str.length();
            }
        }
        return i10 + sVar2.f20451a.length;
    }
}
