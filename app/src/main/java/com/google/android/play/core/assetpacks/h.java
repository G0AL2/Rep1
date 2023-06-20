package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class h extends cb.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f22850b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ gb.p f22851c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p f22852d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, gb.p pVar2, int i10, gb.p pVar3) {
        super(pVar2);
        this.f22852d = pVar;
        this.f22850b = i10;
        this.f22851c = pVar3;
    }

    @Override // cb.f
    protected final void a() {
        cb.e eVar;
        cb.o oVar;
        String str;
        Bundle m10;
        Bundle s10;
        try {
            oVar = this.f22852d.f22964c;
            str = this.f22852d.f22962a;
            m10 = p.m(this.f22850b);
            s10 = p.s();
            ((cb.n0) oVar.f()).B(str, m10, s10, new k(this.f22852d, this.f22851c, (int[]) null));
        } catch (RemoteException e10) {
            eVar = p.f22960f;
            eVar.d(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
