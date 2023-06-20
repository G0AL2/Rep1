package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigStorageClient.java */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, n> f23690c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Context f23691a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23692b;

    private n(Context context, String str) {
        this.f23691a = context;
        this.f23692b = str;
    }

    public static synchronized n c(Context context, String str) {
        n nVar;
        synchronized (n.class) {
            Map<String, n> map = f23690c;
            if (!map.containsKey(str)) {
                map.put(str, new n(context, str));
            }
            nVar = map.get(str);
        }
        return nVar;
    }

    public synchronized Void a() {
        this.f23691a.deleteFile(this.f23692b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f23692b;
    }

    public synchronized e d() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f23691a.openFileInput(this.f23692b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            e b10 = e.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return b10;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public synchronized Void e(e eVar) throws IOException {
        FileOutputStream openFileOutput = this.f23691a.openFileOutput(this.f23692b, 0);
        openFileOutput.write(eVar.toString().getBytes("UTF-8"));
        openFileOutput.close();
        return null;
    }
}
