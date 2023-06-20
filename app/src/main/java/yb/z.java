package yb;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* compiled from: NativeSessionFileGzipper.java */
/* loaded from: classes3.dex */
class z {
    private static void a(InputStream inputStream, File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        g.f(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    g.f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(File file, List<y> list) {
        for (y yVar : list) {
            InputStream inputStream = null;
            try {
                inputStream = yVar.f();
                if (inputStream != null) {
                    a(inputStream, new File(file, yVar.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                g.f(null);
                throw th;
            }
            g.f(inputStream);
        }
    }
}
