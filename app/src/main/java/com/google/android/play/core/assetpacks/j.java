package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class j extends cb.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ gb.p f22877b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p f22878c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, gb.p pVar2, gb.p pVar3) {
        super(pVar2);
        this.f22878c = pVar;
        this.f22877b = pVar3;
    }

    @Override // cb.f
    protected final void a() {
        cb.e eVar;
        cb.o oVar;
        String str;
        Bundle s10;
        try {
            oVar = this.f22878c.f22965d;
            str = this.f22878c.f22962a;
            s10 = p.s();
            ((cb.n0) oVar.f()).z(str, s10, new n(this.f22878c, this.f22877b));
        } catch (RemoteException e10) {
            eVar = p.f22960f;
            eVar.d(e10, "keepAlive", new Object[0]);
        }
    }
}
