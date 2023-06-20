package x8;

import ea.a0;
import java.io.IOException;
import java.util.Arrays;
import p8.l;

/* compiled from: OggPacket.java */
/* loaded from: classes2.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f38724a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final a0 f38725b = new a0(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f38726c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f38727d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f38728e;

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f38727d = 0;
        do {
            int i13 = this.f38727d;
            int i14 = i10 + i13;
            f fVar = this.f38724a;
            if (i14 >= fVar.f38732d) {
                break;
            }
            int[] iArr = fVar.f38735g;
            this.f38727d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f38724a;
    }

    public a0 c() {
        return this.f38725b;
    }

    public boolean d(p8.j jVar) throws IOException {
        int i10;
        ea.a.f(jVar != null);
        if (this.f38728e) {
            this.f38728e = false;
            this.f38725b.L(0);
        }
        while (!this.f38728e) {
            if (this.f38726c < 0) {
                if (!this.f38724a.c(jVar) || !this.f38724a.a(jVar, true)) {
                    return false;
                }
                f fVar = this.f38724a;
                int i11 = fVar.f38733e;
                if ((fVar.f38730b & 1) == 1 && this.f38725b.f() == 0) {
                    i11 += a(0);
                    i10 = this.f38727d + 0;
                } else {
                    i10 = 0;
                }
                if (!l.e(jVar, i11)) {
                    return false;
                }
                this.f38726c = i10;
            }
            int a10 = a(this.f38726c);
            int i12 = this.f38726c + this.f38727d;
            if (a10 > 0) {
                a0 a0Var = this.f38725b;
                a0Var.c(a0Var.f() + a10);
                if (!l.d(jVar, this.f38725b.d(), this.f38725b.f(), a10)) {
                    return false;
                }
                a0 a0Var2 = this.f38725b;
                a0Var2.O(a0Var2.f() + a10);
                this.f38728e = this.f38724a.f38735g[i12 + (-1)] != 255;
            }
            if (i12 == this.f38724a.f38732d) {
                i12 = -1;
            }
            this.f38726c = i12;
        }
        return true;
    }

    public void e() {
        this.f38724a.b();
        this.f38725b.L(0);
        this.f38726c = -1;
        this.f38728e = false;
    }

    public void f() {
        if (this.f38725b.d().length == 65025) {
            return;
        }
        a0 a0Var = this.f38725b;
        a0Var.N(Arrays.copyOf(a0Var.d(), Math.max(65025, this.f38725b.f())), this.f38725b.f());
    }
}
