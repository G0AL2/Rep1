package f2;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkCache.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final e f30087a;

    public g(e eVar) {
        this.f30087a = eVar;
    }

    private static String b(String str, c cVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? cVar.f() : cVar.f30086a);
        return sb2.toString();
    }

    private File c(String str) throws FileNotFoundException {
        File file = new File(d(), b(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(d(), b(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File d() {
        File a10 = this.f30087a.a();
        if (a10.isFile()) {
            a10.delete();
        }
        if (!a10.exists()) {
            a10.mkdirs();
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Pair<c, InputStream> a(String str) {
        c cVar;
        try {
            File c10 = c(str);
            if (c10 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(c10);
            if (c10.getAbsolutePath().endsWith(".zip")) {
                cVar = c.ZIP;
            } else {
                cVar = c.JSON;
            }
            i2.d.a("Cache hit for " + str + " at " + c10.getAbsolutePath());
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, c cVar) {
        File file = new File(d(), b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        i2.d.a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        i2.d.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File f(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(d(), b(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
