package s1;

import s1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnobservedErrorNotifier.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private f<?> f36712a;

    public h(f<?> fVar) {
        this.f36712a = fVar;
    }

    public void a() {
        this.f36712a = null;
    }

    protected void finalize() throws Throwable {
        f.d k10;
        try {
            f<?> fVar = this.f36712a;
            if (fVar != null && (k10 = f.k()) != null) {
                k10.a(fVar, new i(fVar.i()));
            }
        } finally {
            super.finalize();
        }
    }
}
