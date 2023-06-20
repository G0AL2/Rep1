package df;

import java.io.IOException;
import ye.d0;
import ye.v;

/* compiled from: ConnectInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29371a = new a();

    private a() {
    }

    @Override // ye.v
    public d0 intercept(v.a aVar) throws IOException {
        qe.k.f(aVar, "chain");
        ef.g gVar = (ef.g) aVar;
        return ef.g.c(gVar, 0, gVar.d().s(gVar), null, 0, 0, 0, 61, null).a(gVar.h());
    }
}
