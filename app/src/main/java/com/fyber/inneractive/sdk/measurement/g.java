package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.network.r;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public AdSession f17339a;

    /* renamed from: b  reason: collision with root package name */
    public AdEvents f17340b;

    /* renamed from: c  reason: collision with root package name */
    public MediaEvents f17341c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17342d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17343e = false;

    /* renamed from: f  reason: collision with root package name */
    public y f17344f;

    public final void a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", "OpenMeasurementNativeVideoTracker", th.getMessage());
        y yVar = this.f17344f;
        r.a(simpleName, format, yVar != null ? yVar.f17239a : null, yVar != null ? (com.fyber.inneractive.sdk.response.g) yVar.f17240b : null);
    }

    public final List<VerificationScriptResource> a(List<i> list) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        for (i iVar : list) {
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (iVar.f17347a != null) {
                    if (!TextUtils.isEmpty(iVar.f17351e) && !TextUtils.isEmpty(iVar.f17350d)) {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(iVar.f17351e, iVar.f17347a, iVar.f17350d);
                    } else {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(iVar.f17347a);
                    }
                    verificationScriptResource = createVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th) {
                a(th);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }
}
