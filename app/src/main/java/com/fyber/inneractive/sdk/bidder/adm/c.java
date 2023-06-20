package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.network.b0;

/* loaded from: classes.dex */
public class c implements b0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f16783a;

    public c(e eVar) {
        this.f16783a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.b0.a
    public void a(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1392135285:
                if (str.equals("sdkInitNetworkRequest")) {
                    c10 = 0;
                    break;
                }
                break;
            case 740780854:
                if (str.equals("sdkGotServerResponse")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1745989196:
                if (str.equals("sdkParsedResponse")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                com.fyber.inneractive.sdk.metrics.c.f17371c.a(this.f16783a.f16788d).f();
                return;
            case 1:
                com.fyber.inneractive.sdk.metrics.c.f17371c.a(this.f16783a.f16788d).h();
                return;
            case 2:
                com.fyber.inneractive.sdk.metrics.c.f17371c.a(this.f16783a.f16788d).d();
                return;
            default:
                return;
        }
    }
}
