package com.google.android.ads.mediationtestsuite.utils;

import com.google.android.ads.mediationtestsuite.dataobjects.AdFormat;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class AdFormatSerializer implements o<AdFormat>, com.google.gson.g<AdFormat> {
    @Override // com.google.gson.g
    /* renamed from: a */
    public AdFormat deserialize(com.google.gson.h hVar, Type type, com.google.gson.f fVar) {
        String h10 = hVar.h();
        AdFormat from = AdFormat.from(h10);
        if (from != null) {
            return from;
        }
        throw new com.google.gson.l("Can't parse ad format for key: " + h10);
    }

    @Override // com.google.gson.o
    /* renamed from: b */
    public com.google.gson.h serialize(AdFormat adFormat, Type type, n nVar) {
        return new m(adFormat.getFormatString());
    }
}
