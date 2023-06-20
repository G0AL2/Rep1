package qe;

import te.e;

/* compiled from: PropertyReference1.java */
/* loaded from: classes3.dex */
public abstract class n extends p implements te.e {
    public n(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // pe.l
    public Object b(Object obj) {
        return get(obj);
    }

    @Override // qe.c
    protected te.a d() {
        return t.d(this);
    }

    @Override // te.e
    public e.a h() {
        return ((te.e) k()).h();
    }
}
