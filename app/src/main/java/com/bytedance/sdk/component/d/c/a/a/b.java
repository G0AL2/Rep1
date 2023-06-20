package com.bytedance.sdk.component.d.c.a.a;

import android.util.Log;
import com.bytedance.sdk.component.d.c.a.a.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: LruCountDiskCache.java */
/* loaded from: classes.dex */
public class b implements com.bytedance.sdk.component.d.c {

    /* renamed from: a  reason: collision with root package name */
    private long f10142a;

    /* renamed from: b  reason: collision with root package name */
    private a f10143b;

    public b(File file, long j10, ExecutorService executorService) {
        this.f10142a = j10;
        try {
            this.f10143b = a.a(file, 20210302, 1, j10, executorService);
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.d.a
    /* renamed from: c */
    public boolean b(String str) {
        try {
            try {
                a.c a10 = this.f10143b.a(str);
                boolean z10 = a10 != null;
                com.bytedance.sdk.component.d.c.c.b.a(a10);
                return z10;
            } catch (IOException e10) {
                Log.w("LruCountDiskCache", e10.getMessage());
                com.bytedance.sdk.component.d.c.c.b.a(null);
                return false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.d.c.c.b.a(null);
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.d.a
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        a aVar = this.f10143b;
        InputStream inputStream2 = null;
        if (aVar == null || str == null) {
            return null;
        }
        try {
            a.c a10 = aVar.a(str);
            if (a10 == null) {
                com.bytedance.sdk.component.d.c.c.b.a(null);
                com.bytedance.sdk.component.d.c.c.b.a(null);
                return null;
            }
            inputStream = a10.a(0);
            if (inputStream != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException e10) {
                    e = e10;
                    byteArrayOutputStream = null;
                    Log.w("LruCountDiskCache", e.toString());
                    com.bytedance.sdk.component.d.c.c.b.a(inputStream);
                    com.bytedance.sdk.component.d.c.c.b.a(byteArrayOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    com.bytedance.sdk.component.d.c.c.b.a(inputStream2);
                    com.bytedance.sdk.component.d.c.c.b.a(byteArrayOutputStream);
                    throw th;
                }
                try {
                    try {
                        byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        com.bytedance.sdk.component.d.c.c.b.a(inputStream2);
                        com.bytedance.sdk.component.d.c.c.b.a(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    Log.w("LruCountDiskCache", e.toString());
                    com.bytedance.sdk.component.d.c.c.b.a(inputStream);
                    com.bytedance.sdk.component.d.c.c.b.a(byteArrayOutputStream);
                    return null;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            com.bytedance.sdk.component.d.c.c.b.a(inputStream);
            com.bytedance.sdk.component.d.c.c.b.a(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e12) {
            e = e12;
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            com.bytedance.sdk.component.d.c.c.b.a(inputStream2);
            com.bytedance.sdk.component.d.c.c.b.a(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.d.c
    public InputStream a(String str) {
        a aVar = this.f10143b;
        if (aVar == null) {
            return null;
        }
        try {
            a.c a10 = aVar.a(str);
            if (a10 != null) {
                return a10.a(0);
            }
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.d.a
    public boolean a(String str, byte[] bArr) {
        Closeable closeable;
        a aVar = this.f10143b;
        if (aVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        a.C0156a c0156a = null;
        try {
            try {
                a.C0156a b10 = aVar.b(str);
                try {
                    if (b10 == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        com.bytedance.sdk.component.d.c.c.b.a(null);
                        return false;
                    }
                    OutputStream a10 = b10.a(0);
                    if (a10 == a.f10108c) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        com.bytedance.sdk.component.d.c.c.b.a(a10);
                        return false;
                    }
                    a10.write(bArr);
                    b10.a();
                    this.f10143b.a();
                    com.bytedance.sdk.component.d.c.c.b.a(a10);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    closeable = null;
                    c0156a = b10;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0156a != null) {
                            try {
                                c0156a.b();
                            } catch (IOException unused) {
                            }
                        }
                        com.bytedance.sdk.component.d.c.c.b.a(closeable);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeable2 = closeable;
                        com.bytedance.sdk.component.d.c.c.b.a(closeable2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                com.bytedance.sdk.component.d.c.c.b.a(closeable2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            closeable = null;
        }
    }
}
