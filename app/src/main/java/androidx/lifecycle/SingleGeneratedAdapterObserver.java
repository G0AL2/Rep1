package androidx.lifecycle;

import androidx.lifecycle.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final h f3348a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleGeneratedAdapterObserver(h hVar) {
        this.f3348a = hVar;
    }

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        this.f3348a.a(pVar, bVar, false, null);
        this.f3348a.a(pVar, bVar, true, null);
    }
}
