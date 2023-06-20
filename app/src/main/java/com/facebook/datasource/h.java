package com.facebook.datasource;

import y3.k;

/* compiled from: SimpleDataSource.java */
/* loaded from: classes.dex */
public class h<T> extends a<T> {
    private h() {
    }

    public static <T> h<T> x() {
        return new h<>();
    }

    @Override // com.facebook.datasource.a
    public boolean p(Throwable th) {
        return super.p((Throwable) k.g(th));
    }
}
