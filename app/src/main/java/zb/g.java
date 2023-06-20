package zb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import yb.h;

/* compiled from: UserMetadata.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final a f40515a = new a(this, false);

    /* renamed from: b  reason: collision with root package name */
    private final a f40516b = new a(this, true);

    /* renamed from: c  reason: collision with root package name */
    private final AtomicMarkableReference<String> f40517c = new AtomicMarkableReference<>(null, false);

    /* compiled from: UserMetadata.java */
    /* loaded from: classes3.dex */
    private class a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicMarkableReference<b> f40518a;

        public a(g gVar, boolean z10) {
            new AtomicReference(null);
            this.f40518a = new AtomicMarkableReference<>(new b(64, z10 ? Constants.BUFFER_SIZE : IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES), false);
        }

        public Map<String, String> a() {
            return this.f40518a.getReference().a();
        }
    }

    public g(String str, dc.f fVar, h hVar) {
        new d(fVar);
    }

    public static g c(String str, dc.f fVar, h hVar) {
        d dVar = new d(fVar);
        g gVar = new g(str, fVar, hVar);
        gVar.f40515a.f40518a.getReference().d(dVar.f(str, false));
        gVar.f40516b.f40518a.getReference().d(dVar.f(str, true));
        gVar.f40517c.set(dVar.g(str), false);
        return gVar;
    }

    public static String d(String str, dc.f fVar) {
        return new d(fVar).g(str);
    }

    public Map<String, String> a() {
        return this.f40515a.a();
    }

    public Map<String, String> b() {
        return this.f40516b.a();
    }
}
