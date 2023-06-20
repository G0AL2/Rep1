package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class d extends cb.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f22790b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ gb.p f22791c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p f22792d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, gb.p pVar2, List list, gb.p pVar3) {
        super(pVar2);
        this.f22792d = pVar;
        this.f22790b = list;
        this.f22791c = pVar3;
    }

    @Override // cb.f
    protected final void a() {
        cb.e eVar;
        cb.o oVar;
        String str;
        Bundle s10;
        ArrayList d10 = p.d(this.f22790b);
        try {
            oVar = this.f22792d.f22964c;
            str = this.f22792d.f22962a;
            s10 = p.s();
            ((cb.n0) oVar.f()).g(str, d10, s10, new k(this.f22792d, this.f22791c, (byte[]) null));
        } catch (RemoteException e10) {
            eVar = p.f22960f;
            eVar.d(e10, "cancelDownloads(%s)", this.f22790b);
        }
    }
}
