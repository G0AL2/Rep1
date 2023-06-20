package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes3.dex */
final class m extends k<List<String>> {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p f22912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gb.p<List<String>> pVar2) {
        super(pVar, pVar2);
        this.f22912c = pVar;
    }

    @Override // com.google.android.play.core.assetpacks.k, cb.p0
    public final void a(List<Bundle> list) {
        super.a(list);
        this.f22889a.e(p.e(this.f22912c, list));
    }
}
