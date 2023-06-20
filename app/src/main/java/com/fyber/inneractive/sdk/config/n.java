package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.m0;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class n implements com.fyber.inneractive.sdk.network.u<IAConfigManager.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f17004a;

    public n(IAConfigManager iAConfigManager) {
        this.f17004a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(IAConfigManager.a aVar, Exception exc, boolean z10) {
        int i10;
        IAConfigManager.a aVar2 = aVar;
        boolean z11 = false;
        if (aVar2 != null) {
            if (aVar2.f16894d != null) {
                this.f17004a.getClass();
            }
            if (z10) {
                IAConfigManager iAConfigManager = this.f17004a;
                IAConfigManager iAConfigManager2 = IAConfigManager.J;
                iAConfigManager.getClass();
                iAConfigManager.f16869e = aVar2.f16893c;
                iAConfigManager.f16868d = aVar2.f16892b;
                iAConfigManager.f16865a = aVar2.f16895e;
                iAConfigManager.f16866b = aVar2.f16896f;
            } else {
                IAConfigManager.K = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f17004a;
                iAConfigManager3.getClass();
                IAlog.a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f16869e = aVar2.f16893c;
                iAConfigManager3.f16868d = aVar2.f16892b;
                iAConfigManager3.f16865a = aVar2.f16895e;
                iAConfigManager3.f16866b = aVar2.f16896f;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.f) {
            IAConfigManager.K = System.currentTimeMillis();
        }
        if (z10) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.f17004a;
        boolean f10 = IAConfigManager.f();
        iAConfigManager4.getClass();
        if (f10) {
            iAConfigManager4.a(null);
        } else {
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof n0) ? TextUtils.isEmpty(iAConfigManager4.f16867c.trim()) : !((i10 = ((n0) exc).f17624a) < 400 || i10 >= 500))) {
                z11 = true;
            }
            if (z11) {
                iAConfigManager4.a(new InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(exc);
            } else {
                iAConfigManager4.a(new IAConfigManager.b());
            }
        }
        if (IAConfigManager.f()) {
            IAConfigManager iAConfigManager5 = this.f17004a;
            if (iAConfigManager5.C == null) {
                iAConfigManager5.C = new f0(new p(iAConfigManager5), iAConfigManager5.f16870f, new com.fyber.inneractive.sdk.config.global.m());
            }
            m0 l10 = iAConfigManager5.C.l();
            if (l10 == m0.RUNNING || l10 == m0.QUEUED) {
                return;
            }
            iAConfigManager5.f16884t.c(iAConfigManager5.C);
        }
    }
}
