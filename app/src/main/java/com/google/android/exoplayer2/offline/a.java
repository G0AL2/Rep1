package com.google.android.exoplayer2.offline;

import android.net.Uri;
import da.g0;
import h9.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: FilteringManifestParser.java */
/* loaded from: classes2.dex */
public final class a<T extends h9.a<T>> implements g0.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g0.a<? extends T> f21274a;

    /* renamed from: b  reason: collision with root package name */
    private final List<StreamKey> f21275b;

    public a(g0.a<? extends T> aVar, List<StreamKey> list) {
        this.f21274a = aVar;
        this.f21275b = list;
    }

    @Override // da.g0.a
    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T a10 = this.f21274a.a(uri, inputStream);
        List<StreamKey> list = this.f21275b;
        return (list == null || list.isEmpty()) ? a10 : (T) a10.a(this.f21275b);
    }
}
