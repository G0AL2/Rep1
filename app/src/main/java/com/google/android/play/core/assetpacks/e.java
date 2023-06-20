package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes3.dex */
final class e extends cb.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f22803b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ gb.p f22804c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p f22805d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar, gb.p pVar2, Map map, gb.p pVar3) {
        super(pVar2);
        this.f22805d = pVar;
        this.f22803b = map;
        this.f22804c = pVar3;
    }

    @Override // cb.f
    protected final void a() {
        cb.e eVar;
        cb.o oVar;
        String str;
        try {
            oVar = this.f22805d.f22964c;
            str = this.f22805d.f22962a;
            ((cb.n0) oVar.f()).P(str, p.j(this.f22803b), new m(this.f22805d, this.f22804c));
        } catch (RemoteException e10) {
            eVar = p.f22960f;
            eVar.d(e10, "syncPacks", new Object[0]);
            this.f22804c.d(new RuntimeException(e10));
        }
    }
}
