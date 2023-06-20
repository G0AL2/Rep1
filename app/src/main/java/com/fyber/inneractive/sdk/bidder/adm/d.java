package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.m;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.a f16784a;

    public d(e eVar, e.a aVar) {
        this.f16784a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e.a aVar = this.f16784a;
        if (aVar != null) {
            ((m.a) aVar).a(new Exception("adm payload must contain ad url"), InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
