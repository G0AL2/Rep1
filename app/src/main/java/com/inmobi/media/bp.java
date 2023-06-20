package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: AdFetchFailureException.java */
/* loaded from: classes3.dex */
public final class bp extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final InMobiAdRequestStatus f24804a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f24805b;

    public bp(InMobiAdRequestStatus inMobiAdRequestStatus, byte b10) {
        this.f24804a = inMobiAdRequestStatus;
        this.f24805b = b10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f24804a.getMessage();
    }
}
