package com.google.android.play.core.assetpacks;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* loaded from: classes3.dex */
final class k2 {

    /* renamed from: h  reason: collision with root package name */
    private static final cb.e f22898h = new cb.e("SliceMetadataManager");

    /* renamed from: b  reason: collision with root package name */
    private final a0 f22900b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22901c;

    /* renamed from: d  reason: collision with root package name */
    private final int f22902d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22903e;

    /* renamed from: f  reason: collision with root package name */
    private final String f22904f;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f22899a = new byte[Constants.BUFFER_SIZE];

    /* renamed from: g  reason: collision with root package name */
    private int f22905g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2(a0 a0Var, String str, int i10, long j10, String str2) {
        this.f22900b = a0Var;
        this.f22901c = str;
        this.f22902d = i10;
        this.f22903e = j10;
        this.f22904f = str2;
    }

    private final File n() {
        File y10 = this.f22900b.y(this.f22901c, this.f22902d, this.f22903e, this.f22904f);
        if (!y10.exists()) {
            y10.mkdirs();
        }
        return y10;
    }

    private final File o() throws IOException {
        File n10 = this.f22900b.n(this.f22901c, this.f22902d, this.f22903e, this.f22904f);
        n10.getParentFile().mkdirs();
        n10.createNewFile();
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j2 a() throws IOException {
        File n10 = this.f22900b.n(this.f22901c, this.f22902d, this.f22903e, this.f22904f);
        if (n10.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(n10);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new s0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f22905g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new j2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e10) {
                    throw new s0("Slice checkpoint file corrupt.", e10);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    cb.c0.a(th, th2);
                }
                throw th;
            }
        }
        throw new s0("Slice checkpoint file does not exist.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(i().length()));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f22905g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                cb.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j10, byte[] bArr, int i10, int i11) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i10, i11);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                cb.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(InputStream inputStream, long j10) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j10);
            do {
                read = inputStream.read(this.f22899a);
                if (read > 0) {
                    randomAccessFile.write(this.f22899a, 0, read);
                }
            } while (read == this.f22899a.length);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                cb.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str, long j10, long j11, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f22905g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                cb.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(byte[] bArr) throws IOException {
        this.f22905g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.f22905g))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e10) {
            throw new s0("Could not write metadata file.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(byte[] bArr, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f22905g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File s10 = this.f22900b.s(this.f22901c, this.f22902d, this.f22903e, this.f22904f);
            if (s10.exists()) {
                s10.delete();
            }
            fileOutputStream = new FileOutputStream(s10);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    cb.c0.a(th, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f22905g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f22899a);
            while (read > 0) {
                fileOutputStream.write(this.f22899a, 0, read);
                read = inputStream.read(this.f22899a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                cb.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File i() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.f22905g)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f22905g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                cb.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(byte[] bArr, int i10) throws IOException {
        this.f22905g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr, 0, i10);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                cb.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l() throws IOException {
        File n10 = this.f22900b.n(this.f22901c, this.f22902d, this.f22903e, this.f22904f);
        if (n10.exists()) {
            FileInputStream fileInputStream = new FileInputStream(n10);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                    return -1;
                }
                if (properties.getProperty("previousChunk") != null) {
                    return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                }
                throw new s0("Slice checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    cb.c0.a(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        File n10 = this.f22900b.n(this.f22901c, this.f22902d, this.f22903e, this.f22904f);
        if (n10.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(n10);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f22898h.e("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (IOException e10) {
                f22898h.e("Could not read checkpoint while checking if extraction finished. %s", e10);
                return false;
            }
        }
        return false;
    }
}
