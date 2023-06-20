package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import java.util.Map;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final InneractiveAdRequest f17543a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f17544b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f17545c;

    public d0(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.serverapi.c cVar) {
        this.f17543a = inneractiveAdRequest;
        this.f17544b = cVar;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f17545c.put(str, str2);
    }
}
