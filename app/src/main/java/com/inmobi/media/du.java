package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* compiled from: TrackerAttr.java */
/* loaded from: classes3.dex */
public final class du {

    /* renamed from: a  reason: collision with root package name */
    public byte f25178a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Object> f25179b = new HashMap();

    public du(byte b10) {
        this.f25178a = b10;
    }

    public final <T> T a(String str, Class<T> cls) {
        Object obj = this.f25179b.get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }
}
