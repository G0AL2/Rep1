package com.RNFetchBlob;

/* compiled from: RNFetchBlobProgressConfig.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private long f5616a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f5617b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f5618c;

    /* renamed from: d  reason: collision with root package name */
    private int f5619d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5620e;

    /* compiled from: RNFetchBlobProgressConfig.java */
    /* loaded from: classes.dex */
    enum a {
        Upload,
        Download
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(boolean z10, int i10, int i11, a aVar) {
        this.f5618c = -1;
        this.f5619d = -1;
        this.f5620e = false;
        a aVar2 = a.Download;
        this.f5620e = z10;
        this.f5619d = i10;
        this.f5618c = i11;
    }

    public boolean a(float f10) {
        int i10 = this.f5618c;
        boolean z10 = false;
        boolean z11 = i10 <= 0 || f10 <= 0.0f || Math.floor((double) (f10 * ((float) i10))) > ((double) this.f5617b);
        if (System.currentTimeMillis() - this.f5616a > this.f5619d && this.f5620e && z11) {
            z10 = true;
        }
        if (z10) {
            this.f5617b++;
            this.f5616a = System.currentTimeMillis();
        }
        return z10;
    }
}
