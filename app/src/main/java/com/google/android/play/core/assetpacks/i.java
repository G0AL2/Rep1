package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class i extends cb.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f22861b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f22862c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f22863d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f22864e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ gb.p f22865f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p f22866g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, gb.p pVar2, int i10, String str, String str2, int i11, gb.p pVar3) {
        super(pVar2);
        this.f22866g = pVar;
        this.f22861b = i10;
        this.f22862c = str;
        this.f22863d = str2;
        this.f22864e = i11;
        this.f22865f = pVar3;
    }

    @Override // cb.f
    protected final void a() {
        cb.e eVar;
        cb.o oVar;
        String str;
        Bundle s10;
        try {
            oVar = this.f22866g.f22964c;
            str = this.f22866g.f22962a;
            Bundle o10 = p.o(this.f22861b, this.f22862c, this.f22863d, this.f22864e);
            s10 = p.s();
            ((cb.n0) oVar.f()).F(str, o10, s10, new l(this.f22866g, this.f22865f));
        } catch (RemoteException e10) {
            eVar = p.f22960f;
            eVar.e("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f22862c, this.f22863d, Integer.valueOf(this.f22864e), Integer.valueOf(this.f22861b));
            this.f22865f.d(new RuntimeException(e10));
        }
    }
}
