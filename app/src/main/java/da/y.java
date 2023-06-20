package da;

import com.inmobi.media.jh;
import da.a0;
import da.d0;
import da.e0;
import j8.j2;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: DefaultLoadErrorHandlingPolicy.java */
/* loaded from: classes2.dex */
public class y implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f29325a;

    public y() {
        this(-1);
    }

    @Override // da.d0
    public d0.b a(d0.a aVar, d0.c cVar) {
        if (e(cVar.f29137a)) {
            if (aVar.a(1)) {
                return new d0.b(1, 300000L);
            }
            if (aVar.a(2)) {
                return new d0.b(2, 60000L);
            }
            return null;
        }
        return null;
    }

    @Override // da.d0
    public long b(d0.c cVar) {
        IOException iOException = cVar.f29137a;
        if ((iOException instanceof j2) || (iOException instanceof FileNotFoundException) || (iOException instanceof a0.a) || (iOException instanceof e0.h) || m.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f29138b - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT);
    }

    @Override // da.d0
    public int c(int i10) {
        int i11 = this.f29325a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // da.d0
    public /* synthetic */ void d(long j10) {
        c0.a(this, j10);
    }

    protected boolean e(IOException iOException) {
        if (iOException instanceof a0.e) {
            int i10 = ((a0.e) iOException).f29120b;
            return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
        }
        return false;
    }

    public y(int i10) {
        this.f29325a = i10;
    }
}
