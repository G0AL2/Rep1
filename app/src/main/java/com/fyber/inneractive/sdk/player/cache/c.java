package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f17759p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: q  reason: collision with root package name */
    public static final OutputStream f17760q = new b();

    /* renamed from: a  reason: collision with root package name */
    public final File f17761a;

    /* renamed from: b  reason: collision with root package name */
    public final File f17762b;

    /* renamed from: c  reason: collision with root package name */
    public final File f17763c;

    /* renamed from: d  reason: collision with root package name */
    public final File f17764d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17765e;

    /* renamed from: f  reason: collision with root package name */
    public long f17766f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17767g;

    /* renamed from: i  reason: collision with root package name */
    public Writer f17769i;

    /* renamed from: k  reason: collision with root package name */
    public int f17771k;

    /* renamed from: l  reason: collision with root package name */
    public e f17772l;

    /* renamed from: h  reason: collision with root package name */
    public long f17768h = 0;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap<String, d> f17770j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m  reason: collision with root package name */
    public long f17773m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final ThreadPoolExecutor f17774n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o  reason: collision with root package name */
    public final Callable<Void> f17775o = new a();

    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (c.this) {
                c cVar = c.this;
                if (cVar.f17769i == null) {
                    return null;
                }
                cVar.f();
                if (c.this.b()) {
                    c.this.e();
                    c.this.f17771k = 0;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0241c {

        /* renamed from: a  reason: collision with root package name */
        public final d f17777a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f17778b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17779c;

        public C0241c(d dVar) {
            this.f17777a = dVar;
            this.f17778b = dVar.f17784c ? null : new boolean[c.this.f17767g];
        }

        /* renamed from: com.fyber.inneractive.sdk.player.cache.c$c$a */
        /* loaded from: classes.dex */
        public class a extends FilterOutputStream {
            public a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0241c.this.f17779c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0241c.this.f17779c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0241c.this.f17779c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0241c.this.f17779c = true;
                }
            }
        }

        public OutputStream a(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i10 >= 0) {
                c cVar = c.this;
                if (i10 < cVar.f17767g) {
                    synchronized (cVar) {
                        d dVar = this.f17777a;
                        if (dVar.f17785d == this) {
                            if (!dVar.f17784c) {
                                this.f17778b[i10] = true;
                            }
                            File b10 = dVar.b(i10);
                            try {
                                fileOutputStream = new FileOutputStream(b10);
                            } catch (FileNotFoundException unused) {
                                c.this.f17761a.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(b10);
                                } catch (FileNotFoundException unused2) {
                                    return c.f17760q;
                                }
                            }
                            aVar = new a(fileOutputStream);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    return aVar;
                }
            }
            throw new IllegalArgumentException("Expected index " + i10 + " to be greater than 0 and less than the maximum value count of " + c.this.f17767g);
        }

        public void a() throws IOException {
            c.a(c.this, this, false);
        }
    }

    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f17782a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f17783b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17784c;

        /* renamed from: d  reason: collision with root package name */
        public C0241c f17785d;

        /* renamed from: e  reason: collision with root package name */
        public long f17786e;

        public d(String str) {
            this.f17782a = str;
            this.f17783b = new long[c.this.f17767g];
        }

        public File b(int i10) {
            File file = c.this.f17761a;
            return new File(file, this.f17782a + "." + i10 + ".tmp");
        }

        public String a() throws IOException {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f17783b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public File a(int i10) {
            File file = c.this.f17761a;
            return new File(file, this.f17782a + "." + i10);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public final class f implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream[] f17788a;

        public f(c cVar, String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f17788a = inputStreamArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f17788a) {
                m.a(inputStream);
            }
        }
    }

    public c(File file, int i10, int i11, long j10) {
        this.f17761a = file;
        this.f17765e = i10;
        this.f17762b = new File(file, "journal");
        this.f17763c = new File(file, "journal.tmp");
        this.f17764d = new File(file, "journal.bkp");
        this.f17767g = i11;
        this.f17766f = j10;
    }

    public synchronized f b(String str) throws IOException {
        a();
        e(str);
        d dVar = this.f17770j.get(str);
        if (dVar == null) {
            return null;
        }
        if (dVar.f17784c) {
            InputStream[] inputStreamArr = new InputStream[this.f17767g];
            for (int i10 = 0; i10 < this.f17767g; i10++) {
                try {
                    inputStreamArr[i10] = new FileInputStream(dVar.a(i10));
                } catch (FileNotFoundException unused) {
                    for (int i11 = 0; i11 < this.f17767g && inputStreamArr[i11] != null; i11++) {
                        m.a(inputStreamArr[i11]);
                    }
                    return null;
                }
            }
            this.f17771k++;
            this.f17769i.append((CharSequence) ("READ " + str + '\n'));
            if (b()) {
                this.f17774n.submit(this.f17775o);
            }
            return new f(this, str, dVar.f17786e, inputStreamArr, dVar.f17783b);
        }
        return null;
    }

    public final void c(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f17770j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d dVar = this.f17770j.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                this.f17770j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f17784c = true;
                dVar.f17785d = null;
                if (split.length == c.this.f17767g) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            dVar.f17783b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f17785d = new C0241c(dVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f17769i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f17770j.values()).iterator();
        while (it.hasNext()) {
            C0241c c0241c = ((d) it.next()).f17785d;
            if (c0241c != null) {
                c0241c.a();
            }
        }
        f();
        this.f17769i.close();
        this.f17769i = null;
    }

    public final void d() throws IOException {
        l lVar = new l(new FileInputStream(this.f17762b), Constants.BUFFER_SIZE, m.f17851a);
        try {
            String b10 = lVar.b();
            String b11 = lVar.b();
            String b12 = lVar.b();
            String b13 = lVar.b();
            String b14 = lVar.b();
            if (!"libcore.io.DiskLruCache".equals(b10) || !"1".equals(b11) || !Integer.toString(this.f17765e).equals(b12) || !Integer.toString(this.f17767g).equals(b13) || !"".equals(b14)) {
                throw new IOException("unexpected journal header: [" + b10 + ", " + b11 + ", " + b13 + ", " + b14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    c(lVar.b());
                    i10++;
                } catch (EOFException unused) {
                    this.f17771k = i10 - this.f17770j.size();
                    if (lVar.f17849e == -1) {
                        e();
                    } else {
                        this.f17769i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17762b, true), m.f17851a));
                    }
                    m.a(lVar);
                    return;
                }
            }
        } catch (Throwable th) {
            m.a(lVar);
            throw th;
        }
    }

    public final synchronized void e() throws IOException {
        Writer writer = this.f17769i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17763c), m.f17851a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f17765e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f17767g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (d dVar : this.f17770j.values()) {
            if (dVar.f17785d != null) {
                bufferedWriter.write("DIRTY " + dVar.f17782a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + dVar.f17782a + dVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f17762b.exists()) {
            a(this.f17762b, this.f17764d, true);
        }
        a(this.f17763c, this.f17762b, false);
        this.f17764d.delete();
        this.f17769i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17762b, true), m.f17851a));
    }

    public final void f() throws IOException {
        while (this.f17768h > this.f17766f) {
            String key = this.f17770j.entrySet().iterator().next().getKey();
            e eVar = this.f17772l;
            if (eVar != null) {
                if (((n) eVar).a(this, key)) {
                    d(key);
                } else {
                    boolean z10 = false;
                    for (String str : this.f17770j.keySet()) {
                        if (((n) this.f17772l).a(this, str)) {
                            z10 |= d(str);
                        }
                    }
                    if (!z10) {
                        return;
                    }
                }
            } else {
                d(key);
            }
        }
    }

    public static void a(c cVar, C0241c c0241c, boolean z10) throws IOException {
        synchronized (cVar) {
            d dVar = c0241c.f17777a;
            if (dVar.f17785d == c0241c) {
                if (z10 && !dVar.f17784c) {
                    for (int i10 = 0; i10 < cVar.f17767g; i10++) {
                        if (c0241c.f17778b[i10]) {
                            if (!dVar.b(i10).exists()) {
                                c0241c.a();
                                return;
                            }
                        } else {
                            c0241c.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < cVar.f17767g; i11++) {
                    File b10 = dVar.b(i11);
                    if (z10) {
                        if (b10.exists()) {
                            File a10 = dVar.a(i11);
                            b10.renameTo(a10);
                            long j10 = dVar.f17783b[i11];
                            long length = a10.length();
                            dVar.f17783b[i11] = length;
                            cVar.f17768h = (cVar.f17768h - j10) + length;
                        }
                    } else {
                        a(b10);
                    }
                }
                cVar.f17771k++;
                dVar.f17785d = null;
                if (dVar.f17784c | z10) {
                    dVar.f17784c = true;
                    cVar.f17769i.write("CLEAN " + dVar.f17782a + dVar.a() + '\n');
                    if (z10) {
                        long j11 = cVar.f17773m;
                        cVar.f17773m = 1 + j11;
                        dVar.f17786e = j11;
                    }
                } else {
                    cVar.f17770j.remove(dVar.f17782a);
                    cVar.f17769i.write("REMOVE " + dVar.f17782a + '\n');
                }
                cVar.f17769i.flush();
                if (cVar.f17768h > cVar.f17766f || cVar.b()) {
                    cVar.f17774n.submit(cVar.f17775o);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final boolean b() {
        int i10 = this.f17771k;
        return i10 >= 2000 && i10 >= this.f17770j.size();
    }

    public synchronized boolean d(String str) throws IOException {
        IAlog.d("DiskLruCache remove %s", str);
        a();
        e(str);
        d dVar = this.f17770j.get(str);
        if (dVar != null && dVar.f17785d == null) {
            for (int i10 = 0; i10 < this.f17767g; i10++) {
                File a10 = dVar.a(i10);
                if (a10.exists() && !a10.delete()) {
                    throw new IOException("failed to delete " + a10);
                }
                long j10 = this.f17768h;
                long[] jArr = dVar.f17783b;
                this.f17768h = j10 - jArr[i10];
                jArr[i10] = 0;
            }
            this.f17771k++;
            this.f17769i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f17770j.remove(str);
            if (b()) {
                this.f17774n.submit(this.f17775o);
            }
            return true;
        }
        return false;
    }

    public final void c() throws IOException {
        a(this.f17763c);
        Iterator<d> it = this.f17770j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f17785d == null) {
                while (i10 < this.f17767g) {
                    this.f17768h += next.f17783b[i10];
                    i10++;
                }
            } else {
                next.f17785d = null;
                while (i10 < this.f17767g) {
                    a(next.a(i10));
                    a(next.b(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void e(String str) {
        if (f17759p.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public static c a(File file, int i10, int i11, long j10) throws IOException {
        if (j10 > 0) {
            if (i11 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        a(file2, file3, false);
                    }
                }
                c cVar = new c(file, i10, i11, j10);
                if (cVar.f17762b.exists()) {
                    try {
                        cVar.d();
                        cVar.c();
                        return cVar;
                    } catch (IOException e10) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                        IAlog.d("DiskLruCache delete cache", new Object[0]);
                        cVar.close();
                        m.a(cVar.f17761a);
                    }
                }
                file.mkdirs();
                c cVar2 = new c(file, i10, i11, j10);
                cVar2.e();
                return cVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(File file) throws IOException {
        IAlog.d("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void a(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public File a(String str, int i10) {
        a();
        e(str);
        d dVar = this.f17770j.get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.a(i10);
    }

    public C0241c a(String str) throws IOException {
        synchronized (this) {
            a();
            e(str);
            d dVar = this.f17770j.get(str);
            if (dVar == null) {
                dVar = new d(str);
                this.f17770j.put(str, dVar);
            } else if (dVar.f17785d != null) {
                return null;
            }
            C0241c c0241c = new C0241c(dVar);
            dVar.f17785d = c0241c;
            Writer writer = this.f17769i;
            writer.write("DIRTY " + str + '\n');
            this.f17769i.flush();
            return c0241c;
        }
    }

    public final void a() {
        if (this.f17769i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }
}
