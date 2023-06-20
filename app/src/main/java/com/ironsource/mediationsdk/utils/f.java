package com.ironsource.mediationsdk.utils;

import java.util.Date;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private long f27435a = new Date().getTime();

    public static long a(f fVar) {
        if (fVar == null) {
            return 0L;
        }
        return new Date().getTime() - fVar.f27435a;
    }
}
