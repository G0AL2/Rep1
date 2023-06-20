package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* compiled from: AdContainer.java */
/* loaded from: classes3.dex */
public interface j {

    /* compiled from: AdContainer.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(Object obj);

        void b(Object obj);
    }

    void a();

    void a(byte b10, Map<String, String> map);

    void b();

    boolean c();

    void destroy();

    fq getAdConfig();

    Object getDataModel();

    a getFullScreenEventsListener();

    String getMarkupType();

    byte getPlacementType();

    View getVideoContainerView();

    dw getViewableAd();

    void setFullScreenActivityContext(Activity activity);
}
