package zb;

import com.inmobi.media.fq;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueueFile.java */
/* loaded from: classes3.dex */
public class e implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f40492g = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final RandomAccessFile f40493a;

    /* renamed from: b  reason: collision with root package name */
    int f40494b;

    /* renamed from: c  reason: collision with root package name */
    private int f40495c;

    /* renamed from: d  reason: collision with root package name */
    private b f40496d;

    /* renamed from: e  reason: collision with root package name */
    private b f40497e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f40498f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        boolean f40499a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f40500b;

        a(e eVar, StringBuilder sb2) {
            this.f40500b = sb2;
        }

        @Override // zb.e.d
        public void a(InputStream inputStream, int i10) throws IOException {
            if (this.f40499a) {
                this.f40499a = false;
            } else {
                this.f40500b.append(", ");
            }
            this.f40500b.append(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f40501c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        final int f40502a;

        /* renamed from: b  reason: collision with root package name */
        final int f40503b;

        b(int i10, int i11) {
            this.f40502a = i10;
            this.f40503b = i11;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.f40502a + ", length = " + this.f40503b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    public final class c extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private int f40504a;

        /* renamed from: b  reason: collision with root package name */
        private int f40505b;

        /* synthetic */ c(e eVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            e.C(bArr, "buffer");
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f40505b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    e.this.g0(this.f40504a, bArr, i10, i11);
                    this.f40504a = e.this.r0(this.f40504a + i11);
                    this.f40505b -= i11;
                    return i11;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private c(b bVar) {
            this.f40504a = e.this.r0(bVar.f40502a + 4);
            this.f40505b = bVar.f40503b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f40505b == 0) {
                return -1;
            }
            e.this.f40493a.seek(this.f40504a);
            int read = e.this.f40493a.read();
            this.f40504a = e.this.r0(this.f40504a + 1);
            this.f40505b--;
            return read;
        }
    }

    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    public interface d {
        void a(InputStream inputStream, int i10) throws IOException;
    }

    public e(File file) throws IOException {
        if (!file.exists()) {
            z(file);
        }
        this.f40493a = L(file);
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T C(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    private static void C0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            z0(bArr, i10, i11);
            i10 += 4;
        }
    }

    private static RandomAccessFile L(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private b O(int i10) throws IOException {
        if (i10 == 0) {
            return b.f40501c;
        }
        this.f40493a.seek(i10);
        return new b(i10, this.f40493a.readInt());
    }

    private void T() throws IOException {
        this.f40493a.seek(0L);
        this.f40493a.readFully(this.f40498f);
        int U = U(this.f40498f, 0);
        this.f40494b = U;
        if (U <= this.f40493a.length()) {
            this.f40495c = U(this.f40498f, 4);
            int U2 = U(this.f40498f, 8);
            int U3 = U(this.f40498f, 12);
            this.f40496d = O(U2);
            this.f40497e = O(U3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f40494b + ", Actual length: " + this.f40493a.length());
    }

    private static int U(byte[] bArr, int i10) {
        return ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) + ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private int Z() {
        return this.f40494b - q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int r02 = r0(i10);
        int i13 = r02 + i12;
        int i14 = this.f40494b;
        if (i13 <= i14) {
            this.f40493a.seek(r02);
            this.f40493a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - r02;
        this.f40493a.seek(r02);
        this.f40493a.readFully(bArr, i11, i15);
        this.f40493a.seek(16L);
        this.f40493a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void h0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int r02 = r0(i10);
        int i13 = r02 + i12;
        int i14 = this.f40494b;
        if (i13 <= i14) {
            this.f40493a.seek(r02);
            this.f40493a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - r02;
        this.f40493a.seek(r02);
        this.f40493a.write(bArr, i11, i15);
        this.f40493a.seek(16L);
        this.f40493a.write(bArr, i11 + i15, i12 - i15);
    }

    private void m0(int i10) throws IOException {
        this.f40493a.setLength(i10);
        this.f40493a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int r0(int i10) {
        int i11 = this.f40494b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void s0(int i10, int i11, int i12, int i13) throws IOException {
        C0(this.f40498f, i10, i11, i12, i13);
        this.f40493a.seek(0L);
        this.f40493a.write(this.f40498f);
    }

    private void w(int i10) throws IOException {
        int i11 = i10 + 4;
        int Z = Z();
        if (Z >= i11) {
            return;
        }
        int i12 = this.f40494b;
        do {
            Z += i12;
            i12 <<= 1;
        } while (Z < i11);
        m0(i12);
        b bVar = this.f40497e;
        int r02 = r0(bVar.f40502a + 4 + bVar.f40503b);
        if (r02 < this.f40496d.f40502a) {
            FileChannel channel = this.f40493a.getChannel();
            channel.position(this.f40494b);
            long j10 = r02 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f40497e.f40502a;
        int i14 = this.f40496d.f40502a;
        if (i13 < i14) {
            int i15 = (this.f40494b + i13) - 16;
            s0(i12, this.f40495c, i14, i15);
            this.f40497e = new b(i15, this.f40497e.f40503b);
        } else {
            s0(i12, this.f40495c, i14, i13);
        }
        this.f40494b = i12;
    }

    private static void z(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile L = L(file2);
        try {
            L.setLength(4096L);
            L.seek(0L);
            byte[] bArr = new byte[16];
            C0(bArr, 4096, 0, 0, 0);
            L.write(bArr);
            L.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            L.close();
            throw th;
        }
    }

    private static void z0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public synchronized boolean A() {
        return this.f40495c == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f40493a.close();
    }

    public synchronized void d0() throws IOException {
        if (!A()) {
            if (this.f40495c == 1) {
                q();
            } else {
                b bVar = this.f40496d;
                int r02 = r0(bVar.f40502a + 4 + bVar.f40503b);
                g0(r02, this.f40498f, 0, 4);
                int U = U(this.f40498f, 0);
                s0(this.f40494b, this.f40495c - 1, r02, this.f40497e.f40502a);
                this.f40495c--;
                this.f40496d = new b(r02, U);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public void h(byte[] bArr) throws IOException {
        l(bArr, 0, bArr.length);
    }

    public synchronized void l(byte[] bArr, int i10, int i11) throws IOException {
        int r02;
        C(bArr, "buffer");
        if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
            w(i11);
            boolean A = A();
            if (A) {
                r02 = 16;
            } else {
                b bVar = this.f40497e;
                r02 = r0(bVar.f40502a + 4 + bVar.f40503b);
            }
            b bVar2 = new b(r02, i11);
            z0(this.f40498f, 0, i11);
            h0(bVar2.f40502a, this.f40498f, 0, 4);
            h0(bVar2.f40502a + 4, bArr, i10, i11);
            s0(this.f40494b, this.f40495c + 1, A ? bVar2.f40502a : this.f40496d.f40502a, bVar2.f40502a);
            this.f40497e = bVar2;
            this.f40495c++;
            if (A) {
                this.f40496d = bVar2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void q() throws IOException {
        s0(4096, 0, 0, 0);
        this.f40495c = 0;
        b bVar = b.f40501c;
        this.f40496d = bVar;
        this.f40497e = bVar;
        if (this.f40494b > 4096) {
            m0(4096);
        }
        this.f40494b = 4096;
    }

    public int q0() {
        if (this.f40495c == 0) {
            return 16;
        }
        b bVar = this.f40497e;
        int i10 = bVar.f40502a;
        int i11 = this.f40496d.f40502a;
        if (i10 >= i11) {
            return (i10 - i11) + 4 + bVar.f40503b + 16;
        }
        return (((i10 + 4) + bVar.f40503b) + this.f40494b) - i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.class.getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f40494b);
        sb2.append(", size=");
        sb2.append(this.f40495c);
        sb2.append(", first=");
        sb2.append(this.f40496d);
        sb2.append(", last=");
        sb2.append(this.f40497e);
        sb2.append(", element lengths=[");
        try {
            y(new a(this, sb2));
        } catch (IOException e10) {
            f40492g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public synchronized void y(d dVar) throws IOException {
        int i10 = this.f40496d.f40502a;
        for (int i11 = 0; i11 < this.f40495c; i11++) {
            b O = O(i10);
            dVar.a(new c(this, O, null), O.f40503b);
            i10 = r0(O.f40502a + 4 + O.f40503b);
        }
    }
}
