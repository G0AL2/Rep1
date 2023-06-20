package com.fyber.inneractive.sdk.network;

import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i0 extends e0<String> {

    /* renamed from: g  reason: collision with root package name */
    public final String f17568g;

    public i0(u<String> uVar, String str) {
        super(uVar, v.b().a());
        this.f17568g = str;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public String a() {
        return this.f17568g;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public l0 f() {
        return l0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public boolean j() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public y n() {
        return y.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public int p() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.network.b0
    public a0 a(InputStream inputStream, Map<String, List<String>> map, int i10) throws Exception {
        FileOutputStream fileOutputStream;
        T t10;
        a0 a0Var = new a0();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(Environment.getExternalStorageDirectory(), "Pictures");
                file.mkdirs();
                String a10 = a(URI.create(this.f17568g), map);
                if (TextUtils.isEmpty(a10)) {
                    t10 = 0;
                } else {
                    File file2 = new File(file, a10);
                    String file3 = file2.toString();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        com.fyber.inneractive.sdk.util.s.a(inputStream, fileOutputStream);
                        fileOutputStream2 = fileOutputStream;
                        t10 = file3;
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        IAlog.a("failed to download and save the image file.", new Object[0]);
                        com.fyber.inneractive.sdk.util.s.b(fileOutputStream2);
                        return a0Var;
                    } catch (Throwable th) {
                        th = th;
                        com.fyber.inneractive.sdk.util.s.b(fileOutputStream);
                        throw th;
                    }
                }
                a0Var.f17523a = t10;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception unused2) {
        }
        com.fyber.inneractive.sdk.util.s.b(fileOutputStream2);
        return a0Var;
    }

    public final String a(URI uri, Map<String, List<String>> map) {
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        String name = new File(path).getName();
        List<String> list = map != null ? map.get("text/html") : null;
        String str = list != null ? list.get(0) : null;
        if (str != null) {
            for (String str2 : str.split(";")) {
                if (str2.contains("image/")) {
                    String str3 = "." + str2.split("/")[1];
                    if (name.endsWith(str3)) {
                        return name;
                    }
                    return name + str3;
                }
            }
            return name;
        }
        return name;
    }
}
