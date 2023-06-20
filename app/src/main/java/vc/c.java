package vc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import ob.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private File f38063a;

    /* renamed from: b  reason: collision with root package name */
    private final e f38064b;

    /* compiled from: PersistedInstallation.java */
    /* loaded from: classes3.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(e eVar) {
        this.f38064b = eVar;
    }

    private File a() {
        if (this.f38063a == null) {
            synchronized (this) {
                if (this.f38063a == null) {
                    File filesDir = this.f38064b.l().getFilesDir();
                    this.f38063a = new File(filesDir, "PersistedInstallation." + this.f38064b.r() + ".json");
                }
            }
        }
        return this.f38063a;
    }

    private JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public d b(d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f38064b.l().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(a())) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public d d() {
        JSONObject c10 = c();
        String optString = c10.optString("Fid", null);
        int optInt = c10.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c10.optString("AuthToken", null);
        String optString3 = c10.optString("RefreshToken", null);
        long optLong = c10.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = c10.optLong("ExpiresInSecs", 0L);
        return d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c10.optString("FisError", null)).a();
    }
}
