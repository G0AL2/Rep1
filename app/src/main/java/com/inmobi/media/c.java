package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;

/* compiled from: BannerRefreshHandler.java */
/* loaded from: classes3.dex */
public final class c extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24882a = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private InMobiBanner f24883b;

    public c(InMobiBanner inMobiBanner) {
        this.f24883b = inMobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        InMobiBanner inMobiBanner = this.f24883b;
        inMobiBanner.a((PublisherCallbacks) inMobiBanner.f24370e, true);
    }
}
