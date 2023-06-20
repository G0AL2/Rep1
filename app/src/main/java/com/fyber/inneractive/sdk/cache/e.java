package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.u;

/* loaded from: classes.dex */
public class e implements u<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f16823a;

    public e(g gVar) {
        this.f16823a = gVar;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(String str, Exception exc, boolean z10) {
        String str2 = str;
        if (str2 != null) {
            this.f16823a.f16827c = str2;
        }
    }
}
