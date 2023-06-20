package y2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: RandomAccessFileWrapper.java */
/* loaded from: classes.dex */
class h {

    /* renamed from: a  reason: collision with root package name */
    private final RandomAccessFile f39230a;

    /* compiled from: RandomAccessFileWrapper.java */
    /* loaded from: classes.dex */
    static class a extends Exception {
        a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(File file, String str) throws a {
        try {
            this.f39230a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e10) {
            throw new a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(byte[] bArr) throws a {
        try {
            return this.f39230a.read(bArr);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        f3.a.n(this.f39230a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j10) throws a {
        try {
            this.f39230a.seek(j10);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(byte[] bArr, int i10, int i11) throws a {
        try {
            this.f39230a.write(bArr, i10, i11);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }
}
