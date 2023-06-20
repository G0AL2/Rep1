package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class j0 extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final w1 f22879a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f22880b;

    /* renamed from: c  reason: collision with root package name */
    private long f22881c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f22882d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22883e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(InputStream inputStream) {
        super(inputStream);
        this.f22879a = new w1();
        this.f22880b = new byte[4096];
        this.f22882d = false;
        this.f22883e = false;
    }

    private final int a(byte[] bArr, int i10, int i11) throws IOException {
        return Math.max(0, super.read(bArr, i10, i11));
    }

    private final boolean d(int i10) throws IOException {
        int a10 = a(this.f22880b, 0, i10);
        if (a10 != i10) {
            int i11 = i10 - a10;
            if (a(this.f22880b, a10, i11) != i11) {
                this.f22879a.b(this.f22880b, 0, a10);
                return false;
            }
        }
        this.f22879a.b(this.f22880b, 0, i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final q2 b() throws IOException {
        byte[] bArr;
        if (this.f22881c <= 0) {
            if (this.f22882d) {
            }
            return new q2(null, -1L, -1, false, false, null);
        }
        do {
            bArr = this.f22880b;
        } while (read(bArr, 0, bArr.length) != -1);
        if (!this.f22882d || this.f22883e) {
            return new q2(null, -1L, -1, false, false, null);
        }
        if (!d(30)) {
            this.f22882d = true;
            return this.f22879a.c();
        }
        q2 c10 = this.f22879a.c();
        if (c10.h()) {
            this.f22883e = true;
            return c10;
        } else if (c10.e() != 4294967295L) {
            int d10 = this.f22879a.d() - 30;
            long j10 = d10;
            int length = this.f22880b.length;
            if (j10 > length) {
                do {
                    length += length;
                } while (length < j10);
                this.f22880b = Arrays.copyOf(this.f22880b, length);
            }
            if (!d(d10)) {
                this.f22882d = true;
                return this.f22879a.c();
            }
            q2 c11 = this.f22879a.c();
            this.f22881c = c11.e();
            return c11;
        } else {
            throw new s0("Files bigger than 4GiB are not supported.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.f22882d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.f22883e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long l() {
        return this.f22881c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f22881c;
        if (j10 <= 0 || this.f22882d) {
            return -1;
        }
        int a10 = a(bArr, i10, (int) Math.min(j10, i11));
        this.f22881c -= a10;
        if (a10 == 0) {
            this.f22882d = true;
            return 0;
        }
        return a10;
    }
}
