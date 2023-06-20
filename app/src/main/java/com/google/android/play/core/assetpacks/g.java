package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends cb.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f22830b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f22831c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ gb.p f22832d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f22833e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p f22834f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, gb.p pVar2, int i10, String str, gb.p pVar3, int i11) {
        super(pVar2);
        this.f22834f = pVar;
        this.f22830b = i10;
        this.f22831c = str;
        this.f22832d = pVar3;
        this.f22833e = i11;
    }

    @Override // cb.f
    protected final void a() {
        cb.e eVar;
        cb.o oVar;
        String str;
        Bundle n10;
        Bundle s10;
        try {
            oVar = this.f22834f.f22964c;
            str = this.f22834f.f22962a;
            n10 = p.n(this.f22830b, this.f22831c);
            s10 = p.s();
            ((cb.n0) oVar.f()).p(str, n10, s10, new o(this.f22834f, this.f22832d, this.f22830b, this.f22831c, this.f22833e));
        } catch (RemoteException e10) {
            eVar = p.f22960f;
            eVar.d(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
