package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class v0 extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final w1 f23067a = new w1();

    /* renamed from: b  reason: collision with root package name */
    private final File f23068b;

    /* renamed from: c  reason: collision with root package name */
    private final k2 f23069c;

    /* renamed from: d  reason: collision with root package name */
    private long f23070d;

    /* renamed from: e  reason: collision with root package name */
    private long f23071e;

    /* renamed from: f  reason: collision with root package name */
    private FileOutputStream f23072f;

    /* renamed from: g  reason: collision with root package name */
    private q2 f23073g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(File file, k2 k2Var) {
        this.f23068b = file;
        this.f23069c = k2Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        while (i11 > 0) {
            if (this.f23070d == 0 && this.f23071e == 0) {
                int b10 = this.f23067a.b(bArr, i10, i11);
                if (b10 == -1) {
                    return;
                }
                i10 += b10;
                i11 -= b10;
                q2 c10 = this.f23067a.c();
                this.f23073g = c10;
                if (c10.h()) {
                    this.f23070d = 0L;
                    this.f23069c.k(this.f23073g.i(), this.f23073g.i().length);
                    this.f23071e = this.f23073g.i().length;
                } else if (!this.f23073g.c() || this.f23073g.b()) {
                    byte[] i12 = this.f23073g.i();
                    this.f23069c.k(i12, i12.length);
                    this.f23070d = this.f23073g.e();
                } else {
                    this.f23069c.f(this.f23073g.i());
                    File file = new File(this.f23068b, this.f23073g.d());
                    file.getParentFile().mkdirs();
                    this.f23070d = this.f23073g.e();
                    this.f23072f = new FileOutputStream(file);
                }
            }
            if (!this.f23073g.b()) {
                if (this.f23073g.h()) {
                    this.f23069c.c(this.f23071e, bArr, i10, i11);
                    this.f23071e += i11;
                    min = i11;
                } else if (this.f23073g.c()) {
                    min = (int) Math.min(i11, this.f23070d);
                    this.f23072f.write(bArr, i10, min);
                    long j10 = this.f23070d - min;
                    this.f23070d = j10;
                    if (j10 == 0) {
                        this.f23072f.close();
                    }
                } else {
                    min = (int) Math.min(i11, this.f23070d);
                    this.f23069c.c((this.f23073g.i().length + this.f23073g.e()) - this.f23070d, bArr, i10, min);
                    this.f23070d -= min;
                }
                i10 += min;
                i11 -= min;
            }
        }
    }
}
