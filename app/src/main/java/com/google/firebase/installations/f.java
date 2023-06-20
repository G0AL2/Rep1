package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetIdListener.java */
/* loaded from: classes3.dex */
public class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource<String> f23409a;

    public f(TaskCompletionSource<String> taskCompletionSource) {
        this.f23409a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(vc.d dVar) {
        if (dVar.l() || dVar.k() || dVar.i()) {
            this.f23409a.trySetResult(dVar.d());
            return true;
        }
        return false;
    }
}
