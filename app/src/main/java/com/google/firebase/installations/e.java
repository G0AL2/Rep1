package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes3.dex */
public class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f23407a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<g> f23408b;

    public e(i iVar, TaskCompletionSource<g> taskCompletionSource) {
        this.f23407a = iVar;
        this.f23408b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        this.f23408b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(vc.d dVar) {
        if (!dVar.k() || this.f23407a.f(dVar)) {
            return false;
        }
        this.f23408b.setResult(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
