package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import java.util.List;

/* compiled from: OpenMeasurement.java */
/* loaded from: classes3.dex */
public abstract class er {

    /* compiled from: OpenMeasurement.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final er f25286a = new es();
    }

    public AdSessionContext a(WebView webView, String str, String str2) {
        return null;
    }

    public AdSessionContext a(List<VerificationScriptResource> list, String str, String str2) {
        return null;
    }

    public abstract void a(Context context, fq fqVar);

    public abstract boolean a();
}
