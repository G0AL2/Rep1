package com.inmobi.media;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.util.Map;

/* compiled from: AdSessionManager.java */
/* loaded from: classes3.dex */
public interface ek {
    void a();

    void a(int i10);

    void a(int i10, int i11, float f10, VastProperties vastProperties);

    void a(View view, Map<View, FriendlyObstructionPurpose> map, View view2);

    void a(AdSessionContext adSessionContext);
}
