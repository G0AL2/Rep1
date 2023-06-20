package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class n extends k<Void> {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p f22916c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gb.p<Void> pVar2) {
        super(pVar, pVar2);
        this.f22916c = pVar;
    }

    @Override // com.google.android.play.core.assetpacks.k, cb.p0
    public final void b(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        cb.e eVar;
        super.b(bundle, bundle2);
        atomicBoolean = this.f22916c.f22966e;
        if (!atomicBoolean.compareAndSet(true, false)) {
            eVar = p.f22960f;
            eVar.g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f22916c.a();
        }
    }
}
