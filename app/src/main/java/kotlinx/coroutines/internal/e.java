package kotlinx.coroutines.internal;

import we.e0;

/* compiled from: Scopes.kt */
/* loaded from: classes3.dex */
public final class e implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final ie.g f33498a;

    public e(ie.g gVar) {
        qe.k.g(gVar, "context");
        this.f33498a = gVar;
    }

    @Override // we.e0
    public ie.g g() {
        return this.f33498a;
    }
}
