package r2;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import q2.u;

/* compiled from: BasicNetwork.java */
/* loaded from: classes.dex */
public class c implements q2.h {

    /* renamed from: a  reason: collision with root package name */
    private final b f36125a;

    /* renamed from: b  reason: collision with root package name */
    protected final d f36126b;

    @Deprecated
    public c(i iVar) {
        this(iVar, new d(4096));
    }

    @Override // q2.h
    public q2.k a(q2.n<?> nVar) throws u {
        IOException iOException;
        h hVar;
        byte[] bArr;
        h b10;
        int d10;
        List<q2.g> c10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                b10 = this.f36125a.b(nVar, g.c(nVar.k()));
                try {
                    d10 = b10.d();
                    c10 = b10.c();
                    break;
                } catch (IOException e10) {
                    bArr = null;
                    hVar = b10;
                    iOException = e10;
                }
            } catch (IOException e11) {
                iOException = e11;
                hVar = null;
                bArr = null;
            }
            m.a(nVar, m.e(nVar, iOException, elapsedRealtime, hVar, bArr));
        }
        if (d10 == 304) {
            return m.b(nVar, SystemClock.elapsedRealtime() - elapsedRealtime, c10);
        }
        InputStream a10 = b10.a();
        byte[] c11 = a10 != null ? m.c(a10, b10.b(), this.f36126b) : new byte[0];
        m.d(SystemClock.elapsedRealtime() - elapsedRealtime, nVar, c11, d10);
        if (d10 >= 200 && d10 <= 299) {
            return new q2.k(d10, c11, false, SystemClock.elapsedRealtime() - elapsedRealtime, c10);
        }
        throw new IOException();
    }

    @Deprecated
    public c(i iVar, d dVar) {
        this.f36125a = new a(iVar);
        this.f36126b = dVar;
    }

    public c(b bVar) {
        this(bVar, new d(4096));
    }

    public c(b bVar, d dVar) {
        this.f36125a = bVar;
        this.f36126b = dVar;
    }
}
