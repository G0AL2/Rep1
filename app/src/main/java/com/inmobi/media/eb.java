package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ei;
import com.inmobi.media.fq;

/* compiled from: HtmlPollingVisibilityTracker.java */
/* loaded from: classes3.dex */
public final class eb extends eh {

    /* compiled from: HtmlPollingVisibilityTracker.java */
    /* loaded from: classes3.dex */
    public interface a extends ei.a {
        boolean a(View view);
    }

    public eb(ei.a aVar, fq.m mVar, byte b10) {
        super(aVar, mVar, b10);
    }

    @Override // com.inmobi.media.eh, com.inmobi.media.ei
    protected final int a() {
        fq.m mVar = this.f25238a;
        if (mVar == null) {
            return 1000;
        }
        return mVar.web.impressionPollIntervalMillis;
    }
}
