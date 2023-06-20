package com.google.android.play.core.review;

import android.os.RemoteException;
import gb.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends cb.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f23122b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j f23123c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, p pVar, p pVar2) {
        super(pVar);
        this.f23123c = jVar;
        this.f23122b = pVar2;
    }

    @Override // cb.f
    protected final void a() {
        cb.e eVar;
        String str;
        String str2;
        try {
            str2 = this.f23123c.f23129b;
            this.f23123c.f23128a.f().m(str2, bb.b.a(), new i(this.f23123c, this.f23122b));
        } catch (RemoteException e10) {
            eVar = j.f23127c;
            str = this.f23123c.f23129b;
            eVar.d(e10, "error requesting in-app review for %s", str);
            this.f23122b.d(new RuntimeException(e10));
        }
    }
}
