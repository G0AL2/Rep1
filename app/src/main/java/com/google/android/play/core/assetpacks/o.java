package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class o extends k<Void> {

    /* renamed from: c  reason: collision with root package name */
    final int f22926c;

    /* renamed from: d  reason: collision with root package name */
    final String f22927d;

    /* renamed from: e  reason: collision with root package name */
    final int f22928e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p f22929f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gb.p<Void> pVar2, int i10, String str, int i11) {
        super(pVar, pVar2);
        this.f22929f = pVar;
        this.f22926c = i10;
        this.f22927d = str;
        this.f22928e = i11;
    }

    @Override // com.google.android.play.core.assetpacks.k, cb.p0
    public final void a(Bundle bundle) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22929f.f22964c;
        oVar.b();
        int i10 = bundle.getInt("error_code");
        eVar = p.f22960f;
        eVar.e("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i10));
        int i11 = this.f22928e;
        if (i11 > 0) {
            this.f22929f.f(this.f22926c, this.f22927d, i11 - 1);
        }
    }
}
