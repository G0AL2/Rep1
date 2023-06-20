package com.bytedance.sdk.component.d.c.a.a;

import android.util.Log;
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
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f10107a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: c  reason: collision with root package name */
    public static final OutputStream f10108c = new OutputStream() { // from class: com.bytedance.sdk.component.d.c.a.a.a.2
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    };

    /* renamed from: b  reason: collision with root package name */
    final ExecutorService f10109b;

    /* renamed from: d  reason: collision with root package name */
    private final File f10110d;

    /* renamed from: e  reason: collision with root package name */
    private final File f10111e;

    /* renamed from: f  reason: collision with root package name */
    private final File f10112f;

    /* renamed from: g  reason: collision with root package name */
    private final File f10113g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10114h;

    /* renamed from: i  reason: collision with root package name */
    private long f10115i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10116j;

    /* renamed from: l  reason: collision with root package name */
    private Writer f10118l;

    /* renamed from: n  reason: collision with root package name */
    private int f10120n;

    /* renamed from: k  reason: collision with root package name */
    private long f10117k = 0;

    /* renamed from: m  reason: collision with root package name */
    private final LinkedHashMap<String, b> f10119m = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o  reason: collision with root package name */
    private long f10121o = -1;

    /* renamed from: p  reason: collision with root package name */
    private long f10122p = 0;

    /* renamed from: q  reason: collision with root package name */
    private final Callable<Void> f10123q = new Callable<Void>() { // from class: com.bytedance.sdk.component.d.c.a.a.a.1
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.f10118l == null) {
                    return null;
                }
                a.this.h();
                if (a.this.f()) {
                    a.this.e();
                    a.this.f10120n = 0;
                }
                return null;
            }
        }
    };

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0156a {

        /* renamed from: b  reason: collision with root package name */
        private final b f10126b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean[] f10127c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10128d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f10129e;

        /* compiled from: DiskLruCache.java */
        /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0157a extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0156a.this.f10128d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0156a.this.f10128d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0156a.this.f10128d = true;
                }
            }

            private C0157a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0156a.this.f10128d = true;
                }
            }
        }

        private C0156a(b bVar) {
            this.f10126b = bVar;
            this.f10127c = bVar.f10134d ? null : new boolean[a.this.f10116j];
        }

        public void b() throws IOException {
            a.this.a(this, false);
        }

        public OutputStream a(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0157a c0157a;
            if (i10 < 0 || i10 >= a.this.f10116j) {
                throw new IllegalArgumentException("Expected index " + i10 + " to be greater than 0 and less than the maximum value count of " + a.this.f10116j);
            }
            synchronized (a.this) {
                if (this.f10126b.f10135e == this) {
                    if (!this.f10126b.f10134d) {
                        this.f10127c[i10] = true;
                    }
                    File b10 = this.f10126b.b(i10);
                    try {
                        fileOutputStream = new FileOutputStream(b10);
                    } catch (FileNotFoundException unused) {
                        a.this.f10110d.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(b10);
                        } catch (FileNotFoundException unused2) {
                            return a.f10108c;
                        }
                    }
                    c0157a = new C0157a(fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c0157a;
        }

        public void a() throws IOException {
            if (this.f10128d) {
                a.this.a(this, false);
                a.this.c(this.f10126b.f10132b);
            } else {
                a.this.a(this, true);
            }
            this.f10129e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class b {

        /* renamed from: b  reason: collision with root package name */
        private final String f10132b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f10133c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10134d;

        /* renamed from: e  reason: collision with root package name */
        private C0156a f10135e;

        /* renamed from: f  reason: collision with root package name */
        private long f10136f;

        private b(String str) {
            this.f10132b = str;
            this.f10133c = new long[a.this.f10116j];
        }

        private IOException b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File b(int i10) {
            File file = a.this.f10110d;
            return new File(file, this.f10132b + "." + i10 + ".tmp");
        }

        public String a() throws IOException {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f10133c) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String[] strArr) throws IOException {
            if (strArr.length == a.this.f10116j) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f10133c[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        public File a(int i10) {
            File file = a.this.f10110d;
            return new File(file, this.f10132b + "." + i10);
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class c implements Closeable {

        /* renamed from: b  reason: collision with root package name */
        private final String f10138b;

        /* renamed from: c  reason: collision with root package name */
        private final long f10139c;

        /* renamed from: d  reason: collision with root package name */
        private final InputStream[] f10140d;

        /* renamed from: e  reason: collision with root package name */
        private final long[] f10141e;

        public InputStream a(int i10) {
            return this.f10140d[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f10140d) {
                com.bytedance.sdk.component.d.c.c.b.a(inputStream);
            }
        }

        private c(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f10138b = str;
            this.f10139c = j10;
            this.f10140d = inputStreamArr;
            this.f10141e = jArr;
        }
    }

    private a(File file, int i10, int i11, long j10, ExecutorService executorService) {
        this.f10110d = file;
        this.f10114h = i10;
        this.f10111e = new File(file, "journal");
        this.f10112f = new File(file, "journal.tmp");
        this.f10113g = new File(file, "journal.bkp");
        this.f10116j = i11;
        this.f10115i = j10;
        this.f10109b = executorService;
    }

    private void g() {
        if (this.f10118l == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() throws IOException {
        long j10 = this.f10115i;
        long j11 = this.f10121o;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.f10117k > j10) {
            c(this.f10119m.entrySet().iterator().next().getKey());
        }
        this.f10121o = -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f10118l == null) {
            return;
        }
        Iterator it = new ArrayList(this.f10119m.values()).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f10135e != null) {
                bVar.f10135e.b();
            }
        }
        h();
        this.f10118l.close();
        this.f10118l = null;
    }

    private void c() throws IOException {
        com.bytedance.sdk.component.d.c.a.a.c cVar = new com.bytedance.sdk.component.d.c.a.a.c(new FileInputStream(this.f10111e), d.f10150a);
        try {
            String a10 = cVar.a();
            String a11 = cVar.a();
            String a12 = cVar.a();
            String a13 = cVar.a();
            String a14 = cVar.a();
            if (!"libcore.io.DiskLruCache".equals(a10) || !"1".equals(a11) || !Integer.toString(this.f10114h).equals(a12) || !Integer.toString(this.f10116j).equals(a13) || !"".equals(a14)) {
                throw new IOException("unexpected journal header: [" + a10 + ", " + a11 + ", " + a13 + ", " + a14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    d(cVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f10120n = i10 - this.f10119m.size();
                    if (cVar.b()) {
                        e();
                    } else {
                        this.f10118l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10111e, true), d.f10150a));
                    }
                    com.bytedance.sdk.component.d.c.c.b.a(cVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.d.c.c.b.a(cVar);
            throw th;
        }
    }

    private void d(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f10119m.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            b bVar = this.f10119m.get(substring);
            if (bVar == null) {
                bVar = new b(substring);
                this.f10119m.put(substring, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f10134d = true;
                bVar.f10135e = null;
                bVar.a(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f10135e = new C0156a(bVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() throws IOException {
        Writer writer = this.f10118l;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10112f), d.f10150a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f10114h));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f10116j));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.f10119m.values()) {
            if (bVar.f10135e != null) {
                bufferedWriter.write("DIRTY " + bVar.f10132b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.f10132b + bVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f10111e.exists()) {
            a(this.f10111e, this.f10113g, true);
        }
        a(this.f10112f, this.f10111e, false);
        this.f10113g.delete();
        this.f10118l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10111e, true), d.f10150a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        int i10 = this.f10120n;
        return i10 >= 2000 && i10 >= this.f10119m.size();
    }

    public C0156a b(String str) throws IOException {
        return a(str, -1L);
    }

    public void b() throws IOException {
        close();
        d.a(this.f10110d);
    }

    public static a a(File file, int i10, int i11, long j10, ExecutorService executorService) throws IOException {
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
                a aVar = new a(file, i10, i11, j10, executorService);
                if (aVar.f10111e.exists()) {
                    try {
                        aVar.c();
                        aVar.d();
                        return aVar;
                    } catch (IOException e10) {
                        Log.w("DiskLruCache ", file + " is corrupt: " + e10.getMessage() + ", removing");
                        aVar.b();
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i10, i11, j10, executorService);
                aVar2.e();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void d() throws IOException {
        a(this.f10112f);
        Iterator<b> it = this.f10119m.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i10 = 0;
            if (next.f10135e != null) {
                next.f10135e = null;
                while (i10 < this.f10116j) {
                    a(next.a(i10));
                    a(next.b(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.f10116j) {
                    this.f10117k += next.f10133c[i10];
                    i10++;
                }
            }
        }
    }

    public synchronized boolean c(String str) throws IOException {
        g();
        e(str);
        b bVar = this.f10119m.get(str);
        if (bVar != null && bVar.f10135e == null) {
            for (int i10 = 0; i10 < this.f10116j; i10++) {
                File a10 = bVar.a(i10);
                if (a10.exists() && !a10.delete()) {
                    throw new IOException("failed to delete " + a10);
                }
                this.f10117k -= bVar.f10133c[i10];
                bVar.f10133c[i10] = 0;
            }
            this.f10120n++;
            this.f10118l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f10119m.remove(str);
            if (f()) {
                this.f10109b.submit(this.f10123q);
            }
            return true;
        }
        return false;
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void e(String str) {
        if (f10107a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public synchronized c a(String str) throws IOException {
        g();
        e(str);
        b bVar = this.f10119m.get(str);
        if (bVar == null) {
            return null;
        }
        if (bVar.f10134d) {
            InputStream[] inputStreamArr = new InputStream[this.f10116j];
            for (int i10 = 0; i10 < this.f10116j; i10++) {
                try {
                    inputStreamArr[i10] = new FileInputStream(bVar.a(i10));
                } catch (FileNotFoundException unused) {
                    for (int i11 = 0; i11 < this.f10116j && inputStreamArr[i11] != null; i11++) {
                        com.bytedance.sdk.component.d.c.c.b.a(inputStreamArr[i11]);
                    }
                    return null;
                }
            }
            this.f10120n++;
            this.f10118l.append((CharSequence) ("READ " + str + '\n'));
            if (f()) {
                this.f10109b.submit(this.f10123q);
            }
            return new c(str, bVar.f10136f, inputStreamArr, bVar.f10133c);
        }
        return null;
    }

    private synchronized C0156a a(String str, long j10) throws IOException {
        g();
        e(str);
        b bVar = this.f10119m.get(str);
        if (j10 == -1 || (bVar != null && bVar.f10136f == j10)) {
            if (bVar != null) {
                if (bVar.f10135e != null) {
                    return null;
                }
            } else {
                bVar = new b(str);
                this.f10119m.put(str, bVar);
            }
            C0156a c0156a = new C0156a(bVar);
            bVar.f10135e = c0156a;
            Writer writer = this.f10118l;
            writer.write("DIRTY " + str + '\n');
            this.f10118l.flush();
            return c0156a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0156a c0156a, boolean z10) throws IOException {
        b bVar = c0156a.f10126b;
        if (bVar.f10135e == c0156a) {
            if (z10 && !bVar.f10134d) {
                for (int i10 = 0; i10 < this.f10116j; i10++) {
                    if (c0156a.f10127c[i10]) {
                        if (!bVar.b(i10).exists()) {
                            c0156a.b();
                            return;
                        }
                    } else {
                        c0156a.b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f10116j; i11++) {
                File b10 = bVar.b(i11);
                if (z10) {
                    if (b10.exists()) {
                        File a10 = bVar.a(i11);
                        b10.renameTo(a10);
                        long j10 = bVar.f10133c[i11];
                        long length = a10.length();
                        bVar.f10133c[i11] = length;
                        this.f10117k = (this.f10117k - j10) + length;
                    }
                } else {
                    a(b10);
                }
            }
            this.f10120n++;
            bVar.f10135e = null;
            if (!(bVar.f10134d | z10)) {
                this.f10119m.remove(bVar.f10132b);
                this.f10118l.write("REMOVE " + bVar.f10132b + '\n');
            } else {
                bVar.f10134d = true;
                this.f10118l.write("CLEAN " + bVar.f10132b + bVar.a() + '\n');
                if (z10) {
                    long j11 = this.f10122p;
                    this.f10122p = 1 + j11;
                    bVar.f10136f = j11;
                }
            }
            this.f10118l.flush();
            if (this.f10117k > this.f10115i || f()) {
                this.f10109b.submit(this.f10123q);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void a() throws IOException {
        g();
        h();
        this.f10118l.flush();
    }
}
