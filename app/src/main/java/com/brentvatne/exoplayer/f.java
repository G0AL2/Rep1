package com.brentvatne.exoplayer;

import com.google.android.gms.common.api.Api;
import com.inmobi.media.jh;
import da.a0;
import da.d0;
import da.y;
import java.io.IOException;

/* compiled from: ReactExoplayerLoadErrorHandlingPolicy.java */
/* loaded from: classes.dex */
public final class f extends y {

    /* renamed from: b  reason: collision with root package name */
    private int f9120b;

    public f(int i10) {
        super(i10);
        this.f9120b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f9120b = i10;
    }

    @Override // da.y, da.d0
    public long b(d0.c cVar) {
        IOException iOException = cVar.f29137a;
        if ((iOException instanceof a0.c) && (iOException.getMessage() == "Unable to connect" || cVar.f29137a.getMessage() == "Software caused connection abort")) {
            return 1000L;
        }
        int i10 = cVar.f29138b;
        if (i10 < this.f9120b) {
            return Math.min((i10 - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT);
        }
        return -9223372036854775807L;
    }

    @Override // da.y, da.d0
    public int c(int i10) {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
