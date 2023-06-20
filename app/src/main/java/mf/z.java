package mf;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Arrays;

/* compiled from: Segment.kt */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f34508a;

    /* renamed from: b  reason: collision with root package name */
    public int f34509b;

    /* renamed from: c  reason: collision with root package name */
    public int f34510c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f34511d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f34512e;

    /* renamed from: f  reason: collision with root package name */
    public z f34513f;

    /* renamed from: g  reason: collision with root package name */
    public z f34514g;

    /* compiled from: Segment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    public z() {
        this.f34508a = new byte[Constants.BUFFER_SIZE];
        this.f34512e = true;
        this.f34511d = false;
    }

    public final void a() {
        z zVar = this.f34514g;
        int i10 = 0;
        if (zVar != this) {
            qe.k.c(zVar);
            if (zVar.f34512e) {
                int i11 = this.f34510c - this.f34509b;
                z zVar2 = this.f34514g;
                qe.k.c(zVar2);
                int i12 = 8192 - zVar2.f34510c;
                z zVar3 = this.f34514g;
                qe.k.c(zVar3);
                if (!zVar3.f34511d) {
                    z zVar4 = this.f34514g;
                    qe.k.c(zVar4);
                    i10 = zVar4.f34509b;
                }
                if (i11 > i12 + i10) {
                    return;
                }
                z zVar5 = this.f34514g;
                qe.k.c(zVar5);
                g(zVar5, i11);
                b();
                a0.b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final z b() {
        z zVar = this.f34513f;
        if (zVar == this) {
            zVar = null;
        }
        z zVar2 = this.f34514g;
        qe.k.c(zVar2);
        zVar2.f34513f = this.f34513f;
        z zVar3 = this.f34513f;
        qe.k.c(zVar3);
        zVar3.f34514g = this.f34514g;
        this.f34513f = null;
        this.f34514g = null;
        return zVar;
    }

    public final z c(z zVar) {
        qe.k.f(zVar, "segment");
        zVar.f34514g = this;
        zVar.f34513f = this.f34513f;
        z zVar2 = this.f34513f;
        qe.k.c(zVar2);
        zVar2.f34514g = zVar;
        this.f34513f = zVar;
        return zVar;
    }

    public final z d() {
        this.f34511d = true;
        return new z(this.f34508a, this.f34509b, this.f34510c, true, false);
    }

    public final z e(int i10) {
        z c10;
        if (i10 > 0 && i10 <= this.f34510c - this.f34509b) {
            if (i10 >= 1024) {
                c10 = d();
            } else {
                c10 = a0.c();
                byte[] bArr = this.f34508a;
                byte[] bArr2 = c10.f34508a;
                int i11 = this.f34509b;
                fe.k.e(bArr, bArr2, 0, i11, i11 + i10, 2, null);
            }
            c10.f34510c = c10.f34509b + i10;
            this.f34509b += i10;
            z zVar = this.f34514g;
            qe.k.c(zVar);
            zVar.c(c10);
            return c10;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final z f() {
        byte[] bArr = this.f34508a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        qe.k.e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new z(copyOf, this.f34509b, this.f34510c, false, true);
    }

    public final void g(z zVar, int i10) {
        qe.k.f(zVar, "sink");
        if (zVar.f34512e) {
            int i11 = zVar.f34510c;
            if (i11 + i10 > 8192) {
                if (!zVar.f34511d) {
                    int i12 = zVar.f34509b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = zVar.f34508a;
                        fe.k.e(bArr, bArr, 0, i12, i11, 2, null);
                        zVar.f34510c -= zVar.f34509b;
                        zVar.f34509b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f34508a;
            byte[] bArr3 = zVar.f34508a;
            int i13 = zVar.f34510c;
            int i14 = this.f34509b;
            fe.k.c(bArr2, bArr3, i13, i14, i14 + i10);
            zVar.f34510c += i10;
            this.f34509b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public z(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        qe.k.f(bArr, "data");
        this.f34508a = bArr;
        this.f34509b = i10;
        this.f34510c = i11;
        this.f34511d = z10;
        this.f34512e = z11;
    }
}
