package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;
import j8.b2;
import j8.p1;

/* loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: a  reason: collision with root package name */
    public final String f21198a;

    public Id3Frame(String str) {
        this.f21198a = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void Z0(b2.b bVar) {
        c9.a.c(this, bVar);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] c1() {
        return c9.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f21198a;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }
}
