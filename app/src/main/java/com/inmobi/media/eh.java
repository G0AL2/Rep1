package com.inmobi.media;

import com.inmobi.media.ei;
import com.inmobi.media.fq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PollingVisibilityTracker.java */
/* loaded from: classes3.dex */
public class eh extends ei {

    /* renamed from: a  reason: collision with root package name */
    fq.m f25238a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eh(ei.a aVar, fq.m mVar, byte b10) {
        super(aVar, b10);
        this.f25238a = mVar;
    }

    @Override // com.inmobi.media.ei
    protected int a() {
        fq.m mVar = this.f25238a;
        if (mVar == null) {
            return 100;
        }
        return mVar.visibilityThrottleMillis;
    }

    @Override // com.inmobi.media.ei
    protected final void b() {
        h();
    }
}
