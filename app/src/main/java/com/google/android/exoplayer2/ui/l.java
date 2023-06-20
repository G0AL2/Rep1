package com.google.android.exoplayer2.ui;

/* compiled from: TimeBar.java */
/* loaded from: classes2.dex */
public interface l {

    /* compiled from: TimeBar.java */
    /* loaded from: classes2.dex */
    public interface a {
        void A(l lVar, long j10, boolean z10);

        void F(l lVar, long j10);

        void h(l lVar, long j10);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
