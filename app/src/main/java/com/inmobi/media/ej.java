package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;

/* compiled from: AdEventHandler.java */
/* loaded from: classes3.dex */
final class ej {

    /* renamed from: a  reason: collision with root package name */
    AdEvents f25257a;

    /* renamed from: b  reason: collision with root package name */
    MediaEvents f25258b;

    public ej(AdSession adSession, String str) {
        str.hashCode();
        if (str.equals("native_video_ad")) {
            this.f25258b = MediaEvents.createMediaEvents(adSession);
        }
        this.f25257a = AdEvents.createAdEvents(adSession);
    }

    public final void a() {
        AdEvents adEvents = this.f25257a;
        if (adEvents == null) {
            return;
        }
        adEvents.impressionOccurred();
    }
}
