package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class t<ResultData> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17699a;

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.cache.a<ResultData> f17700b;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f17701c;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public t(Context context, com.fyber.inneractive.sdk.cache.a<ResultData> aVar) {
        this.f17699a = context;
        this.f17700b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public boolean a(String str, String str2) {
        boolean z10;
        int i10 = 1;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.f17699a.openFileOutput(str, 0);
                fileOutputStream.write(str2.getBytes());
                try {
                    IAlog.a("File cached successfully", new Object[0]);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (Exception e10) {
                        IAlog.e("Failed closing cache file: %s", e10.getMessage());
                        return true;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                    IAlog.e("Failed caching file: %s", e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e12) {
                            IAlog.e("Failed closing cache file: %s", e12.getMessage());
                        }
                    }
                    i10 = z10;
                    return i10;
                }
            } catch (Exception e13) {
                e = e13;
                z10 = false;
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e14) {
                    Object[] objArr = new Object[i10];
                    objArr[0] = e14.getMessage();
                    IAlog.e("Failed closing cache file: %s", objArr);
                }
            }
            throw th;
        }
    }

    public final String a(String str) throws FileNotFoundException {
        FileInputStream fileInputStream;
        IAlog.a("reading local file: %s", str);
        FileInputStream fileInputStream2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        try {
            fileInputStream = this.f17699a.openFileInput(str);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String str3 = new String(bArr, "UTF-8");
                try {
                    fileInputStream.close();
                } catch (Exception e11) {
                    IAlog.e("Failed closing local file: %s", e11.getMessage());
                }
                str2 = str3;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e12) {
                        IAlog.e("Failed closing local file: %s", e12.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            if (!(e instanceof FileNotFoundException)) {
                IAlog.a("Failed reading local file: %s", e.getMessage());
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e14) {
                        IAlog.e("Failed closing local file: %s", e14.getMessage());
                    }
                }
                IAlog.a("local file %s read successfully", str);
                return str2;
            }
            throw new FileNotFoundException();
        }
        IAlog.a("local file %s read successfully", str);
        return str2;
    }
}
