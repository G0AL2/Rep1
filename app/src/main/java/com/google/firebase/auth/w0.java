package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23332a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ yc.b f23333b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(FirebaseAuth firebaseAuth, yc.b bVar) {
        this.f23332a = firebaseAuth;
        this.f23333b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<sb.a> list;
        List<FirebaseAuth.b> list2;
        list = this.f23332a.f23212c;
        for (sb.a aVar : list) {
            aVar.a(this.f23333b);
        }
        list2 = this.f23332a.f23211b;
        for (FirebaseAuth.b bVar : list2) {
            bVar.a(this.f23332a);
        }
    }
}
