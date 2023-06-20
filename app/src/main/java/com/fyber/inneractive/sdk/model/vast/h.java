package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum h {
    /* JADX INFO: Fake field, exist only in values array */
    Jpeg("image/jpeg"),
    /* JADX INFO: Fake field, exist only in values array */
    Jpg("image/jpg"),
    Gif("image/gif"),
    /* JADX INFO: Fake field, exist only in values array */
    Png("image/png");
    

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, h> f17425c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public String f17427a;

    static {
        h[] values;
        for (h hVar : values()) {
            ((HashMap) f17425c).put(hVar.f17427a, hVar);
        }
    }

    h(String str) {
        this.f17427a = str;
    }
}
