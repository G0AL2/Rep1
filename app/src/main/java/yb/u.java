package yb;

import ac.a0;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: FileBackedNativeSessionFile.java */
/* loaded from: classes3.dex */
class u implements y {

    /* renamed from: a  reason: collision with root package name */
    private final File f39502a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39503b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39504c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(String str, String str2, File file) {
        this.f39503b = str;
        this.f39504c = str2;
        this.f39502a = file;
    }

    private byte[] c() {
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        try {
            InputStream f10 = f();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (f10 == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (f10 != null) {
                    f10.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = f10.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        f10.close();
                        return byteArray;
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // yb.y
    public a0.d.b a() {
        byte[] c10 = c();
        if (c10 != null) {
            return a0.d.b.a().b(c10).c(this.f39503b).a();
        }
        return null;
    }

    @Override // yb.y
    public String b() {
        return this.f39504c;
    }

    @Override // yb.y
    public InputStream f() {
        if (this.f39502a.exists() && this.f39502a.isFile()) {
            try {
                return new FileInputStream(this.f39502a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
