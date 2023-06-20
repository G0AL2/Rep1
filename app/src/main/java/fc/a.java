package fc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final File f30298a;

    public a(dc.f fVar) {
        this.f30298a = fVar.d("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f30298a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        vb.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a10 = a();
                if (a10.exists()) {
                    fileInputStream = new FileInputStream(a10);
                    try {
                        jSONObject = new JSONObject(yb.g.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        vb.f.f().e("Failed to fetch cached settings", e);
                        yb.g.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    vb.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                yb.g.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                yb.g.e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            yb.g.e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j10, JSONObject jSONObject) {
        vb.f.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    yb.g.e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    vb.f.f().e("Failed to cache settings", e);
                    yb.g.e(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    yb.g.e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
