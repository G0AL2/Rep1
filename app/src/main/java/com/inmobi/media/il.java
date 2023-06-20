package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;

/* compiled from: ListRule.java */
/* loaded from: classes3.dex */
public final class il<E> extends in<List<E>> {

    /* renamed from: a  reason: collision with root package name */
    private Class<E> f25777a;

    public il(Constructor<List<E>> constructor, Class<E> cls) {
        super(constructor);
        this.f25777a = cls;
    }

    public final List<E> a() {
        return (List) this.f25779b.construct();
    }

    public final Class<E> b() {
        return this.f25777a;
    }
}
