package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.w0;

/* loaded from: classes.dex */
public class t implements w0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f17296a;

    public t(s sVar) {
        this.f17296a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.util.w0.b
    public void a(w0 w0Var) {
        Runnable runnable = this.f17296a.f17285n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.n.f20310b.post(runnable);
        }
        s sVar = this.f17296a;
        w0 w0Var2 = sVar.f17286o;
        if (w0Var2 != null) {
            w0Var2.f20351e = null;
            sVar.f17286o = null;
        }
    }
}
