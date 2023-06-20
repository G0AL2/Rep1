package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: FullSegmentEncryptionKeyCache.java */
/* loaded from: classes2.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f21445a;

    /* compiled from: FullSegmentEncryptionKeyCache.java */
    /* loaded from: classes2.dex */
    class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f21446a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f21446a = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f21446a;
        }
    }

    public d(int i10) {
        this.f21445a = new a(this, i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f21445a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f21445a.put((Uri) ea.a.e(uri), (byte[]) ea.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f21445a.remove(ea.a.e(uri));
    }
}
