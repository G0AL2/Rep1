package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class f extends cb.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f22815b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f22816c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f22817d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f22818e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ gb.p f22819f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p f22820g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, gb.p pVar2, int i10, String str, String str2, int i11, gb.p pVar3) {
        super(pVar2);
        this.f22820g = pVar;
        this.f22815b = i10;
        this.f22816c = str;
        this.f22817d = str2;
        this.f22818e = i11;
        this.f22819f = pVar3;
    }

    @Override // cb.f
    protected final void a() {
        cb.e eVar;
        cb.o oVar;
        String str;
        Bundle s10;
        try {
            oVar = this.f22820g.f22964c;
            str = this.f22820g.f22962a;
            Bundle o10 = p.o(this.f22815b, this.f22816c, this.f22817d, this.f22818e);
            s10 = p.s();
            ((cb.n0) oVar.f()).R(str, o10, s10, new k(this.f22820g, this.f22819f, (char[]) null));
        } catch (RemoteException e10) {
            eVar = p.f22960f;
            eVar.d(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
