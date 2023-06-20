package p4;

import o4.g;
import o4.i;

/* compiled from: ImagePerfImageOriginListener.java */
/* loaded from: classes.dex */
public class b implements o4.b {

    /* renamed from: a  reason: collision with root package name */
    private final i f35509a;

    /* renamed from: b  reason: collision with root package name */
    private final g f35510b;

    public b(i iVar, g gVar) {
        this.f35509a = iVar;
        this.f35510b = gVar;
    }

    @Override // o4.b
    public void a(String str, int i10, boolean z10, String str2) {
        this.f35509a.p(i10);
        this.f35509a.y(str2);
        this.f35510b.a(this.f35509a, 1);
    }
}
