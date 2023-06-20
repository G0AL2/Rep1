package r2;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q2.b;
import q2.v;

/* compiled from: DiskBasedCache.java */
/* loaded from: classes.dex */
public class e implements q2.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f36132a;

    /* renamed from: b  reason: collision with root package name */
    private long f36133b;

    /* renamed from: c  reason: collision with root package name */
    private final c f36134c;

    /* renamed from: d  reason: collision with root package name */
    private final int f36135d;

    /* compiled from: DiskBasedCache.java */
    /* loaded from: classes.dex */
    public interface c {
        File get();
    }

    public e(c cVar, int i10) {
        this.f36132a = new LinkedHashMap(16, 0.75f, true);
        this.f36133b = 0L;
        this.f36134c = cVar;
        this.f36135d = i10;
    }

    private String f(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    private void g() {
        if (this.f36134c.get().exists()) {
            return;
        }
        v.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f36132a.clear();
        this.f36133b = 0L;
        initialize();
    }

    private void h() {
        if (this.f36133b < this.f36135d) {
            return;
        }
        if (v.f35853b) {
            v.e("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f36133b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.f36132a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (e(value.f36137b).delete()) {
                this.f36133b -= value.f36136a;
            } else {
                String str = value.f36137b;
                v.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
            }
            it.remove();
            i10++;
            if (((float) this.f36133b) < this.f36135d * 0.9f) {
                break;
            }
        }
        if (v.f35853b) {
            v.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f36133b - j10), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void i(String str, a aVar) {
        if (!this.f36132a.containsKey(str)) {
            this.f36133b += aVar.f36136a;
        } else {
            this.f36133b += aVar.f36136a - this.f36132a.get(str).f36136a;
        }
        this.f36132a.put(str, aVar);
    }

    private static int j(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static List<q2.g> k(b bVar) throws IOException {
        int l10 = l(bVar);
        if (l10 >= 0) {
            List<q2.g> emptyList = l10 == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i10 = 0; i10 < l10; i10++) {
                emptyList.add(new q2.g(n(bVar).intern(), n(bVar).intern()));
            }
            return emptyList;
        }
        throw new IOException("readHeaderList size=" + l10);
    }

    static int l(InputStream inputStream) throws IOException {
        return (j(inputStream) << 24) | (j(inputStream) << 0) | 0 | (j(inputStream) << 8) | (j(inputStream) << 16);
    }

    static long m(InputStream inputStream) throws IOException {
        return ((j(inputStream) & 255) << 0) | 0 | ((j(inputStream) & 255) << 8) | ((j(inputStream) & 255) << 16) | ((j(inputStream) & 255) << 24) | ((j(inputStream) & 255) << 32) | ((j(inputStream) & 255) << 40) | ((j(inputStream) & 255) << 48) | ((255 & j(inputStream)) << 56);
    }

    static String n(b bVar) throws IOException {
        return new String(q(bVar, m(bVar)), "UTF-8");
    }

    private void p(String str) {
        a remove = this.f36132a.remove(str);
        if (remove != null) {
            this.f36133b -= remove.f36136a;
        }
    }

    static byte[] q(b bVar, long j10) throws IOException {
        long a10 = bVar.a();
        if (j10 >= 0 && j10 <= a10) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + a10);
    }

    static void r(List<q2.g> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            s(outputStream, list.size());
            for (q2.g gVar : list) {
                u(outputStream, gVar.a());
                u(outputStream, gVar.b());
            }
            return;
        }
        s(outputStream, 0);
    }

    static void s(OutputStream outputStream, int i10) throws IOException {
        outputStream.write((i10 >> 0) & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void t(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) (j10 >>> 0));
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // q2.b
    public synchronized void a(String str, boolean z10) {
        b.a aVar = get(str);
        if (aVar != null) {
            aVar.f35781f = 0L;
            if (z10) {
                aVar.f35780e = 0L;
            }
            b(str, aVar);
        }
    }

    @Override // q2.b
    public synchronized void b(String str, b.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        a aVar2;
        long j10 = this.f36133b;
        byte[] bArr = aVar.f35776a;
        long length = j10 + bArr.length;
        int i10 = this.f36135d;
        if (length <= i10 || bArr.length <= i10 * 0.9f) {
            File e10 = e(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(d(e10));
                aVar2 = new a(str, aVar);
            } catch (IOException unused) {
                if (!e10.delete()) {
                    v.b("Could not clean up file %s", e10.getAbsolutePath());
                }
                g();
            }
            if (aVar2.d(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f35776a);
                bufferedOutputStream.close();
                aVar2.f36136a = e10.length();
                i(str, aVar2);
                h();
                return;
            }
            bufferedOutputStream.close();
            v.b("Failed to write header for %s", e10.getAbsolutePath());
            throw new IOException();
        }
    }

    InputStream c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    OutputStream d(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    public File e(String str) {
        return new File(this.f36134c.get(), f(str));
    }

    @Override // q2.b
    public synchronized b.a get(String str) {
        a aVar = this.f36132a.get(str);
        if (aVar == null) {
            return null;
        }
        File e10 = e(str);
        try {
            b bVar = new b(new BufferedInputStream(c(e10)), e10.length());
            try {
                a b10 = a.b(bVar);
                if (!TextUtils.equals(str, b10.f36137b)) {
                    v.b("%s: key=%s, found=%s", e10.getAbsolutePath(), str, b10.f36137b);
                    p(str);
                    return null;
                }
                return aVar.c(q(bVar, bVar.a()));
            } finally {
                bVar.close();
            }
        } catch (IOException e11) {
            v.b("%s: %s", e10.getAbsolutePath(), e11.toString());
            o(str);
            return null;
        }
    }

    @Override // q2.b
    public synchronized void initialize() {
        long length;
        b bVar;
        File file = this.f36134c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                v.c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                length = file2.length();
                bVar = new b(new BufferedInputStream(c(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            }
            try {
                a b10 = a.b(bVar);
                b10.f36136a = length;
                i(b10.f36137b, b10);
                bVar.close();
            } catch (Throwable th) {
                bVar.close();
                throw th;
                break;
            }
        }
    }

    public synchronized void o(String str) {
        boolean delete = e(str).delete();
        p(str);
        if (!delete) {
            v.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskBasedCache.java */
    /* loaded from: classes.dex */
    public static class b extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final long f36144a;

        /* renamed from: b  reason: collision with root package name */
        private long f36145b;

        b(InputStream inputStream, long j10) {
            super(inputStream);
            this.f36144a = j10;
        }

        long a() {
            return this.f36144a - this.f36145b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f36145b++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = super.read(bArr, i10, i11);
            if (read != -1) {
                this.f36145b += read;
            }
            return read;
        }
    }

    public e(c cVar) {
        this(cVar, 5242880);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskBasedCache.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f36136a;

        /* renamed from: b  reason: collision with root package name */
        final String f36137b;

        /* renamed from: c  reason: collision with root package name */
        final String f36138c;

        /* renamed from: d  reason: collision with root package name */
        final long f36139d;

        /* renamed from: e  reason: collision with root package name */
        final long f36140e;

        /* renamed from: f  reason: collision with root package name */
        final long f36141f;

        /* renamed from: g  reason: collision with root package name */
        final long f36142g;

        /* renamed from: h  reason: collision with root package name */
        final List<q2.g> f36143h;

        private a(String str, String str2, long j10, long j11, long j12, long j13, List<q2.g> list) {
            this.f36137b = str;
            this.f36138c = "".equals(str2) ? null : str2;
            this.f36139d = j10;
            this.f36140e = j11;
            this.f36141f = j12;
            this.f36142g = j13;
            this.f36143h = list;
        }

        private static List<q2.g> a(b.a aVar) {
            List<q2.g> list = aVar.f35783h;
            return list != null ? list : g.i(aVar.f35782g);
        }

        static a b(b bVar) throws IOException {
            if (e.l(bVar) == 538247942) {
                return new a(e.n(bVar), e.n(bVar), e.m(bVar), e.m(bVar), e.m(bVar), e.m(bVar), e.k(bVar));
            }
            throw new IOException();
        }

        b.a c(byte[] bArr) {
            b.a aVar = new b.a();
            aVar.f35776a = bArr;
            aVar.f35777b = this.f36138c;
            aVar.f35778c = this.f36139d;
            aVar.f35779d = this.f36140e;
            aVar.f35780e = this.f36141f;
            aVar.f35781f = this.f36142g;
            aVar.f35782g = g.j(this.f36143h);
            aVar.f35783h = Collections.unmodifiableList(this.f36143h);
            return aVar;
        }

        boolean d(OutputStream outputStream) {
            try {
                e.s(outputStream, 538247942);
                e.u(outputStream, this.f36137b);
                String str = this.f36138c;
                if (str == null) {
                    str = "";
                }
                e.u(outputStream, str);
                e.t(outputStream, this.f36139d);
                e.t(outputStream, this.f36140e);
                e.t(outputStream, this.f36141f);
                e.t(outputStream, this.f36142g);
                e.r(this.f36143h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e10) {
                v.b("%s", e10.toString());
                return false;
            }
        }

        a(String str, b.a aVar) {
            this(str, aVar.f35777b, aVar.f35778c, aVar.f35779d, aVar.f35780e, aVar.f35781f, a(aVar));
        }
    }
}
