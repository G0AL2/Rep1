package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.u;

/* loaded from: classes.dex */
public class d implements u<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f16822a;

    public d(g gVar) {
        this.f16822a = gVar;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(String str, Exception exc, boolean z10) {
        String str2 = str;
        if (str2 != null) {
            this.f16822a.f16826b = str2;
        }
    }
}
