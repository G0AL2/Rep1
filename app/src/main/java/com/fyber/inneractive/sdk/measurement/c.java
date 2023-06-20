package com.fyber.inneractive.sdk.measurement;

import com.fyber.inneractive.sdk.network.u;

/* loaded from: classes.dex */
public class c implements u<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f17329a;

    public c(d dVar) {
        this.f17329a = dVar;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(String str, Exception exc, boolean z10) {
        String str2 = str;
        if (str2 != null) {
            this.f17329a.f17330b = str2;
        }
    }
}
