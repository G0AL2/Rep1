package zb;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetaDataStore.java */
/* loaded from: classes3.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final dc.f f40491a;

    static {
        Charset.forName("UTF-8");
    }

    public d(dc.f fVar) {
        this.f40491a = fVar;
    }

    private static Map<String, String> d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, h(jSONObject, next));
        }
        return hashMap;
    }

    private String e(String str) throws JSONException {
        return h(new JSONObject(str), DataKeys.USER_ID);
    }

    private static String h(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f40491a.n(str, "internal-keys");
    }

    public File b(String str) {
        return this.f40491a.n(str, "keys");
    }

    public File c(String str) {
        return this.f40491a.n(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> f(String str, boolean z10) {
        File a10 = z10 ? a(str) : b(str);
        if (!a10.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(a10);
                try {
                    Map<String, String> d10 = d(yb.g.A(fileInputStream2));
                    yb.g.e(fileInputStream2, "Failed to close user metadata file.");
                    return d10;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    vb.f.f().e("Error deserializing user metadata.", e);
                    yb.g.e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    yb.g.e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String g(String str) {
        FileInputStream fileInputStream;
        File c10 = c(str);
        FileInputStream fileInputStream2 = null;
        if (!c10.exists()) {
            vb.f.f().b("No userId set for session " + str);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c10);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            yb.g.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String e11 = e(yb.g.A(fileInputStream));
                vb.f.f().b("Loaded userId " + e11 + " for session " + str);
                yb.g.e(fileInputStream, "Failed to close user metadata file.");
                return e11;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                yb.g.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            vb.f.f().e("Error deserializing user metadata.", e);
            yb.g.e(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }
}
