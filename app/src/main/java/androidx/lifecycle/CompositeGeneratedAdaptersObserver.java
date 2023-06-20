package androidx.lifecycle;

import androidx.lifecycle.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final h[] f3311a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(h[] hVarArr) {
        this.f3311a = hVarArr;
    }

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        v vVar = new v();
        for (h hVar : this.f3311a) {
            hVar.a(pVar, bVar, false, vVar);
        }
        for (h hVar2 : this.f3311a) {
            hVar2.a(pVar, bVar, true, vVar);
        }
    }
}
