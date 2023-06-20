package d8;

import e8.v;
import g8.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import w7.o;
import w7.t;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes2.dex */
public class c implements e {

    /* renamed from: f */
    private static final Logger f29102f = Logger.getLogger(t.class.getName());

    /* renamed from: a */
    private final v f29103a;

    /* renamed from: b */
    private final Executor f29104b;

    /* renamed from: c */
    private final x7.b f29105c;

    /* renamed from: d */
    private final f8.d f29106d;

    /* renamed from: e */
    private final g8.b f29107e;

    public c(Executor executor, x7.b bVar, v vVar, f8.d dVar, g8.b bVar2) {
        this.f29104b = executor;
        this.f29105c = bVar;
        this.f29103a = vVar;
        this.f29106d = dVar;
        this.f29107e = bVar2;
    }

    public static /* synthetic */ void b(c cVar, o oVar, u7.h hVar, w7.i iVar) {
        cVar.e(oVar, hVar, iVar);
    }

    public static /* synthetic */ Object c(c cVar, o oVar, w7.i iVar) {
        return cVar.d(oVar, iVar);
    }

    public /* synthetic */ Object d(o oVar, w7.i iVar) {
        this.f29106d.R0(oVar, iVar);
        this.f29103a.a(oVar, 1);
        return null;
    }

    public /* synthetic */ void e(final o oVar, u7.h hVar, w7.i iVar) {
        try {
            x7.g gVar = this.f29105c.get(oVar.b());
            if (gVar == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f29102f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            final w7.i a10 = gVar.a(iVar);
            this.f29107e.e(new b.a() { // from class: d8.a
                @Override // g8.b.a
                public final Object h() {
                    return c.c(c.this, oVar, a10);
                }
            });
            hVar.a(null);
        } catch (Exception e10) {
            Logger logger = f29102f;
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    @Override // d8.e
    public void a(final o oVar, final w7.i iVar, final u7.h hVar) {
        this.f29104b.execute(new Runnable() { // from class: d8.b
            @Override // java.lang.Runnable
            public final void run() {
                c.b(c.this, oVar, hVar, iVar);
            }
        });
    }
}
