package com.inmobi.media;

/* compiled from: NetworkType.java */
@ik
/* loaded from: classes3.dex */
public final class gc {
    public a others;
    public a wifi;

    /* compiled from: NetworkType.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class a {
        public int maxBatchSize;
        public int minBatchSize;
        public long retryInterval;

        public final boolean a(int i10) {
            int i11;
            int i12 = this.maxBatchSize;
            return i12 <= i10 && this.retryInterval > 0 && i12 > 0 && (i11 = this.minBatchSize) > 0 && i11 <= i12;
        }
    }

    public final boolean a(int i10) {
        return this.wifi.a(i10) && this.others.a(i10);
    }
}
