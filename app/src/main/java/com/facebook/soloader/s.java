package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UnpackingSoSource.java */
/* loaded from: classes.dex */
public abstract class s extends com.facebook.soloader.d {

    /* renamed from: d  reason: collision with root package name */
    protected final Context f16554d;

    /* renamed from: e  reason: collision with root package name */
    protected String f16555e;

    /* renamed from: f  reason: collision with root package name */
    protected k f16556f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f16557g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f16558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ byte[] f16559b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f16560c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ File f16561d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f16562e;

        a(File file, byte[] bArr, c cVar, File file2, k kVar) {
            this.f16558a = file;
            this.f16559b = bArr;
            this.f16560c = cVar;
            this.f16561d = file2;
            this.f16562e = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.v("fb-UnpackingSoSource", "starting syncer worker");
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f16558a, "rw");
                randomAccessFile.write(this.f16559b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(s.this.f16511a, "dso_manifest"), "rw");
                this.f16560c.b(randomAccessFile2);
                randomAccessFile2.close();
                SysUtil.f(s.this.f16511a);
                s.x(this.f16561d, (byte) 1);
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + s.this.f16511a + " (from syncer thread)");
                this.f16562e.close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16564a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16565b;

        public b(String str, String str2) {
            this.f16564a = str;
            this.f16565b = str2;
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final b[] f16566a;

        public c(b[] bVarArr) {
            this.f16566a = bVarArr;
        }

        static final c a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    b[] bVarArr = new b[readInt];
                    for (int i10 = 0; i10 < readInt; i10++) {
                        bVarArr[i10] = new b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void b(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f16566a.length);
            int i10 = 0;
            while (true) {
                b[] bVarArr = this.f16566a;
                if (i10 >= bVarArr.length) {
                    return;
                }
                dataOutput.writeUTF(bVarArr[i10].f16564a);
                dataOutput.writeUTF(this.f16566a[i10].f16565b);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public interface d extends Closeable {
        void L0(DataOutput dataOutput, byte[] bArr) throws IOException;

        String V();

        b W0();

        int available() throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static abstract class e implements Closeable {
        public abstract boolean a();

        public abstract d b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private final b f16567a;

        /* renamed from: b  reason: collision with root package name */
        private final InputStream f16568b;

        public f(b bVar, InputStream inputStream) {
            this.f16567a = bVar;
            this.f16568b = inputStream;
        }

        @Override // com.facebook.soloader.s.d
        public void L0(DataOutput dataOutput, byte[] bArr) throws IOException {
            SysUtil.a(dataOutput, this.f16568b, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
        }

        @Override // com.facebook.soloader.s.d
        public String V() {
            return this.f16567a.f16564a;
        }

        @Override // com.facebook.soloader.s.d
        public b W0() {
            return this.f16567a;
        }

        @Override // com.facebook.soloader.s.d
        public int available() throws IOException {
            return this.f16568b.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16568b.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static abstract class g implements Closeable {
        public abstract c a() throws IOException;

        public abstract e b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s(Context context, String str) {
        super(r(context, str), 1);
        this.f16557g = new HashMap();
        this.f16554d = context;
    }

    private void j(b[] bVarArr) throws IOException {
        String[] list = this.f16511a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z10 = false;
                    for (int i10 = 0; !z10 && i10 < bVarArr.length; i10++) {
                        if (bVarArr[i10].f16564a.equals(q(str))) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        File file = new File(this.f16511a, str);
                        Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                        SysUtil.c(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f16511a);
    }

    private void l(d dVar, byte[] bArr) throws IOException {
        boolean writable;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + dVar.W0().f16564a);
        try {
            if (this.f16511a.setWritable(true)) {
                m(dVar, bArr);
                if (writable) {
                    return;
                }
                return;
            }
            throw new IOException("cannot make directory writable for us: " + this.f16511a);
        } finally {
            if (!this.f16511a.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + this.f16511a.getCanonicalPath() + " write permission");
            }
        }
    }

    private void m(d dVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        File file = new File(this.f16511a, dVar.V());
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    Log.w("fb-UnpackingSoSource", "error adding write permission to: " + file);
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException e10) {
                    Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e10);
                    SysUtil.c(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int available = dVar.available();
                if (available > 1) {
                    SysUtil.d(randomAccessFile2.getFD(), available);
                }
                dVar.L0(randomAccessFile2, bArr);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (file.setExecutable(true, false)) {
                    if (!file.setWritable(false)) {
                        Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
                    }
                    randomAccessFile2.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e11) {
                SysUtil.c(file);
                throw e11;
            }
        } catch (Throwable th) {
            if (!file.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    private Object o(String str) {
        Object obj;
        synchronized (this.f16557g) {
            obj = this.f16557g.get(str);
            if (obj == null) {
                obj = new Object();
                this.f16557g.put(str, obj);
            }
        }
        return obj;
    }

    public static File r(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[Catch: all -> 0x0036, TryCatch #4 {all -> 0x0036, blocks: (B:4:0x0031, B:13:0x0043, B:14:0x004a, B:15:0x0054, B:17:0x005a, B:33:0x00a6, B:9:0x003a, B:20:0x0062, B:22:0x0067, B:24:0x0079, B:27:0x008c, B:28:0x008f, B:32:0x00a3), top: B:49:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #4 {all -> 0x0036, blocks: (B:4:0x0031, B:13:0x0043, B:14:0x004a, B:15:0x0054, B:17:0x005a, B:33:0x00a6, B:9:0x003a, B:20:0x0062, B:22:0x0067, B:24:0x0079, B:27:0x008c, B:28:0x008f, B:32:0x00a3), top: B:49:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v(byte r10, com.facebook.soloader.s.c r11, com.facebook.soloader.s.e r12) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fb-UnpackingSoSource"
            android.util.Log.v(r1, r0)
            java.io.File r0 = new java.io.File
            java.io.File r2 = r9.f16511a
            java.lang.String r3 = "dso_manifest"
            r0.<init>(r2, r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)
            r0 = 1
            if (r10 != r0) goto L3f
            com.facebook.soloader.s$c r10 = com.facebook.soloader.s.c.a(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            goto L40
        L36:
            r10 = move-exception
            goto Ld6
        L39:
            r10 = move-exception
            java.lang.String r3 = "error reading existing DSO manifest"
            android.util.Log.i(r1, r3, r10)     // Catch: java.lang.Throwable -> L36
        L3f:
            r10 = 0
        L40:
            r3 = 0
            if (r10 != 0) goto L4a
            com.facebook.soloader.s$c r10 = new com.facebook.soloader.s$c     // Catch: java.lang.Throwable -> L36
            com.facebook.soloader.s$b[] r4 = new com.facebook.soloader.s.b[r3]     // Catch: java.lang.Throwable -> L36
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L36
        L4a:
            com.facebook.soloader.s$b[] r11 = r11.f16566a     // Catch: java.lang.Throwable -> L36
            r9.j(r11)     // Catch: java.lang.Throwable -> L36
            r11 = 32768(0x8000, float:4.5918E-41)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L36
        L54:
            boolean r4 = r12.a()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto Lb6
            com.facebook.soloader.s$d r4 = r12.b()     // Catch: java.lang.Throwable -> L36
            r5 = 1
            r6 = 0
        L60:
            if (r5 == 0) goto L8f
            com.facebook.soloader.s$b[] r7 = r10.f16566a     // Catch: java.lang.Throwable -> Laa
            int r7 = r7.length     // Catch: java.lang.Throwable -> Laa
            if (r6 >= r7) goto L8f
            com.facebook.soloader.s$b r7 = r4.W0()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = r7.f16564a     // Catch: java.lang.Throwable -> Laa
            com.facebook.soloader.s$b[] r8 = r10.f16566a     // Catch: java.lang.Throwable -> Laa
            r8 = r8[r6]     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r8.f16564a     // Catch: java.lang.Throwable -> Laa
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L8c
            com.facebook.soloader.s$b[] r7 = r10.f16566a     // Catch: java.lang.Throwable -> Laa
            r7 = r7[r6]     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = r7.f16565b     // Catch: java.lang.Throwable -> Laa
            com.facebook.soloader.s$b r8 = r4.W0()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r8.f16565b     // Catch: java.lang.Throwable -> Laa
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L8c
            r5 = 0
        L8c:
            int r6 = r6 + 1
            goto L60
        L8f:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Laa
            java.io.File r7 = r9.f16511a     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r4.V()     // Catch: java.lang.Throwable -> Laa
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> Laa
            boolean r6 = r6.exists()     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto La1
            r5 = 1
        La1:
            if (r5 == 0) goto La6
            r9.l(r4, r11)     // Catch: java.lang.Throwable -> Laa
        La6:
            r4.close()     // Catch: java.lang.Throwable -> L36
            goto L54
        Laa:
            r10 = move-exception
            if (r4 == 0) goto Lb5
            r4.close()     // Catch: java.lang.Throwable -> Lb1
            goto Lb5
        Lb1:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.lang.Throwable -> L36
        Lb5:
            throw r10     // Catch: java.lang.Throwable -> L36
        Lb6:
            r2.close()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Finished regenerating DSO store "
            r10.append(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r1, r10)
            return
        Ld6:
            r2.close()     // Catch: java.lang.Throwable -> Lda
            goto Lde
        Lda:
            r11 = move-exception
            r10.addSuppressed(r11)
        Lde:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.s.v(byte, com.facebook.soloader.s$c, com.facebook.soloader.s$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(File file, byte b10) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.write(b10);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (SyncFailedException e10) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e10);
        }
    }

    @Override // com.facebook.soloader.d, com.facebook.soloader.q
    public int a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int h10;
        synchronized (o(str)) {
            h10 = h(str, i10, this.f16511a, threadPolicy);
        }
        return h10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.q
    public void b(int i10) throws IOException {
        SysUtil.n(this.f16511a);
        k p10 = p(new File(this.f16511a, "dso_lock"), true);
        if (this.f16556f == null) {
            this.f16556f = p(new File(this.f16511a, "dso_instance_lock"), false);
        }
        try {
            Log.v("fb-UnpackingSoSource", "locked dso store " + this.f16511a);
            if (u(p10, i10, n())) {
                p10 = null;
            } else {
                Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f16511a);
            }
        } finally {
            if (p10 != null) {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.f16511a);
                p10.close();
            } else {
                Log.v("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f16511a + " (syncer thread started)");
            }
        }
    }

    protected boolean k(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] n() throws IOException {
        Parcel obtain = Parcel.obtain();
        g s10 = s((byte) 1);
        try {
            b[] bVarArr = s10.a().f16566a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(bVarArr.length);
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                obtain.writeString(bVarArr[i10].f16564a);
                obtain.writeString(bVarArr[i10].f16565b);
            }
            s10.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            if (s10 != null) {
                try {
                    s10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected k p(File file, boolean z10) throws IOException {
        return SysUtil.i(this.f16511a, file, z10);
    }

    protected String q(String str) {
        return str;
    }

    protected abstract g s(byte b10) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void t(String str) throws IOException {
        synchronized (o(str)) {
            this.f16555e = str;
            b(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean u(com.facebook.soloader.k r12, int r13, byte[] r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.s.u(com.facebook.soloader.k, int, byte[]):boolean");
    }

    public void w(String[] strArr) {
    }
}
