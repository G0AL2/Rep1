package f5;

import com.facebook.common.internal.VisibleForTesting;
import y4.d;

/* compiled from: DropFramesFrameScheduler.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final d f30094a;

    /* renamed from: b  reason: collision with root package name */
    private long f30095b = -1;

    public a(d dVar) {
        this.f30094a = dVar;
    }

    @Override // f5.b
    public long a(long j10) {
        long d10 = d();
        long j11 = 0;
        if (d10 == 0) {
            return -1L;
        }
        if (e() || j10 / d() < this.f30094a.b()) {
            long j12 = j10 % d10;
            int a10 = this.f30094a.a();
            for (int i10 = 0; i10 < a10 && j11 <= j12; i10++) {
                j11 += this.f30094a.i(i10);
            }
            return j10 + (j11 - j12);
        }
        return -1L;
    }

    @Override // f5.b
    public int b(long j10, long j11) {
        if (e() || j10 / d() < this.f30094a.b()) {
            return c(j10 % d());
        }
        return -1;
    }

    @VisibleForTesting
    int c(long j10) {
        int i10 = 0;
        long j11 = 0;
        do {
            j11 += this.f30094a.i(i10);
            i10++;
        } while (j10 >= j11);
        return i10 - 1;
    }

    public long d() {
        long j10 = this.f30095b;
        if (j10 != -1) {
            return j10;
        }
        this.f30095b = 0L;
        int a10 = this.f30094a.a();
        for (int i10 = 0; i10 < a10; i10++) {
            this.f30095b += this.f30094a.i(i10);
        }
        return this.f30095b;
    }

    public boolean e() {
        return this.f30094a.b() == 0;
    }
}
