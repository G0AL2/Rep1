package x8;

import ea.n0;
import java.io.EOFException;
import java.io.IOException;
import p8.l;
import p8.x;
import p8.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f38701a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38702b;

    /* renamed from: c  reason: collision with root package name */
    private final long f38703c;

    /* renamed from: d  reason: collision with root package name */
    private final i f38704d;

    /* renamed from: e  reason: collision with root package name */
    private int f38705e;

    /* renamed from: f  reason: collision with root package name */
    private long f38706f;

    /* renamed from: g  reason: collision with root package name */
    private long f38707g;

    /* renamed from: h  reason: collision with root package name */
    private long f38708h;

    /* renamed from: i  reason: collision with root package name */
    private long f38709i;

    /* renamed from: j  reason: collision with root package name */
    private long f38710j;

    /* renamed from: k  reason: collision with root package name */
    private long f38711k;

    /* renamed from: l  reason: collision with root package name */
    private long f38712l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultOggSeeker.java */
    /* loaded from: classes2.dex */
    public final class b implements x {
        private b() {
        }

        @Override // p8.x
        public x.a d(long j10) {
            return new x.a(new y(j10, n0.r((a.this.f38702b + ((a.this.f38704d.c(j10) * (a.this.f38703c - a.this.f38702b)) / a.this.f38706f)) - 30000, a.this.f38702b, a.this.f38703c - 1)));
        }

        @Override // p8.x
        public boolean f() {
            return true;
        }

        @Override // p8.x
        public long i() {
            return a.this.f38704d.b(a.this.f38706f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        ea.a.a(j10 >= 0 && j11 > j10);
        this.f38704d = iVar;
        this.f38702b = j10;
        this.f38703c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f38705e = 0;
        } else {
            this.f38706f = j13;
            this.f38705e = 4;
        }
        this.f38701a = new f();
    }

    private long i(p8.j jVar) throws IOException {
        if (this.f38709i == this.f38710j) {
            return -1L;
        }
        long position = jVar.getPosition();
        if (!this.f38701a.d(jVar, this.f38710j)) {
            long j10 = this.f38709i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f38701a.a(jVar, false);
        jVar.f();
        long j11 = this.f38708h;
        f fVar = this.f38701a;
        long j12 = fVar.f38731c;
        long j13 = j11 - j12;
        int i10 = fVar.f38733e + fVar.f38734f;
        if (0 > j13 || j13 >= 72000) {
            int i11 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
            if (i11 < 0) {
                this.f38710j = position;
                this.f38712l = j12;
            } else {
                this.f38709i = jVar.getPosition() + i10;
                this.f38711k = this.f38701a.f38731c;
            }
            long j14 = this.f38710j;
            long j15 = this.f38709i;
            if (j14 - j15 < 100000) {
                this.f38710j = j15;
                return j15;
            }
            long j16 = i10 * (i11 <= 0 ? 2L : 1L);
            long j17 = this.f38710j;
            long j18 = this.f38709i;
            return n0.r((jVar.getPosition() - j16) + ((j13 * (j17 - j18)) / (this.f38712l - this.f38711k)), j18, j17 - 1);
        }
        return -1L;
    }

    private void k(p8.j jVar) throws IOException {
        while (true) {
            this.f38701a.c(jVar);
            this.f38701a.a(jVar, false);
            f fVar = this.f38701a;
            if (fVar.f38731c > this.f38708h) {
                jVar.f();
                return;
            }
            jVar.m(fVar.f38733e + fVar.f38734f);
            this.f38709i = jVar.getPosition();
            this.f38711k = this.f38701a.f38731c;
        }
    }

    @Override // x8.g
    public long a(p8.j jVar) throws IOException {
        int i10 = this.f38705e;
        if (i10 == 0) {
            long position = jVar.getPosition();
            this.f38707g = position;
            this.f38705e = 1;
            long j10 = this.f38703c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(jVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f38705e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(jVar);
            this.f38705e = 4;
            return -(this.f38711k + 2);
        }
        this.f38706f = j(jVar);
        this.f38705e = 4;
        return this.f38707g;
    }

    @Override // x8.g
    public void c(long j10) {
        this.f38708h = n0.r(j10, 0L, this.f38706f - 1);
        this.f38705e = 2;
        this.f38709i = this.f38702b;
        this.f38710j = this.f38703c;
        this.f38711k = 0L;
        this.f38712l = this.f38706f;
    }

    @Override // x8.g
    /* renamed from: h */
    public b b() {
        if (this.f38706f != 0) {
            return new b();
        }
        return null;
    }

    long j(p8.j jVar) throws IOException {
        this.f38701a.b();
        if (this.f38701a.c(jVar)) {
            this.f38701a.a(jVar, false);
            f fVar = this.f38701a;
            jVar.m(fVar.f38733e + fVar.f38734f);
            long j10 = this.f38701a.f38731c;
            while (true) {
                f fVar2 = this.f38701a;
                if ((fVar2.f38730b & 4) == 4 || !fVar2.c(jVar) || jVar.getPosition() >= this.f38703c || !this.f38701a.a(jVar, true)) {
                    break;
                }
                f fVar3 = this.f38701a;
                if (!l.e(jVar, fVar3.f38733e + fVar3.f38734f)) {
                    break;
                }
                j10 = this.f38701a.f38731c;
            }
            return j10;
        }
        throw new EOFException();
    }
}
