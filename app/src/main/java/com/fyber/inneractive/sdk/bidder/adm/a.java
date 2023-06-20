package com.fyber.inneractive.sdk.bidder.adm;

import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.adm.e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.n;

/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.a f16777a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f16778b;

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0226a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Exception f16779a;

        public RunnableC0226a(Exception exc) {
            this.f16779a = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.a aVar = a.this.f16777a;
            if (aVar != null) {
                ((m.a) aVar).a(this.f16779a, InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
            }
        }
    }

    public a(e eVar, e.a aVar) {
        this.f16778b = eVar;
        this.f16777a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16778b.f16785a = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.f16778b.f16786b, 0));
            e.a(this.f16778b, this.f16777a);
        } catch (Exception e10) {
            IAlog.e("failed to parse ad markup payload %s", e10.getMessage());
            n.f20310b.post(new RunnableC0226a(e10));
        }
    }
}
