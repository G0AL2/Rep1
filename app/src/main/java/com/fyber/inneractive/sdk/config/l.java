package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import com.fyber.inneractive.sdk.config.i;

/* loaded from: classes.dex */
public class l implements i.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f16999a;

    public l(IAConfigManager iAConfigManager) {
        this.f16999a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.config.i.b
    public void onGlobalConfigChanged(i iVar, h hVar) {
        this.f16999a.F.a();
        com.fyber.inneractive.sdk.network.c cVar = this.f16999a.G;
        cVar.getClass();
        int a10 = IAConfigManager.J.f16886v.f16987b.a("send_events_batch_interval", 30, -1);
        int i10 = a10 >= 0 ? a10 : 30;
        cVar.f17530f = true;
        cVar.f17529e = i10;
        Handler handler = cVar.f17528d;
        if (handler != null && handler.hasMessages(12312329)) {
            cVar.f17528d.removeMessages(12312329);
        }
        cVar.a(12312329, cVar.f17529e * 1000);
    }
}
