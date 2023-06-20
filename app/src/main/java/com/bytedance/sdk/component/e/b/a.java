package com.bytedance.sdk.component.e.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.inmobi.unification.sdk.InitializationStatus;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: DownloadExecutor.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public File f10307a;

    /* renamed from: b  reason: collision with root package name */
    public File f10308b;

    public a(i iVar) {
        super(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f10307a.delete();
        } catch (Throwable unused) {
        }
        try {
            this.f10308b.delete();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long g(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    public void a(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f10307a = new File(str, str2);
        this.f10308b = new File(str, str2 + ".temp");
    }

    public void a(final com.bytedance.sdk.component.e.a.a aVar) {
        File file = this.f10307a;
        if (file == null || this.f10308b == null) {
            if (aVar != null) {
                aVar.a(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.f10307a.length() != 0 && aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.e.b bVar = new com.bytedance.sdk.component.e.b(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
            bVar.a(this.f10307a);
            aVar.a(this, bVar);
            return;
        }
        long length = this.f10308b.length();
        final long j10 = length >= 0 ? length : 0L;
        k.a aVar2 = new k.a();
        aVar2.a((Object) b());
        b("Range", "bytes=" + j10 + Constants.FILENAME_SEQUENCE_SEPARATOR);
        if (TextUtils.isEmpty(this.f10322f)) {
            aVar.a(this, new IOException("Url is Empty"));
            return;
        }
        try {
            aVar2.a(this.f10322f);
            a(aVar2);
            this.f10319c.a(aVar2.a().b()).a(new com.bytedance.sdk.component.b.a.c() { // from class: com.bytedance.sdk.component.e.b.a.1
                @Override // com.bytedance.sdk.component.b.a.c
                public void a(com.bytedance.sdk.component.b.a.b bVar2, IOException iOException) {
                    com.bytedance.sdk.component.e.a.a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.a(a.this, iOException);
                    }
                    a.this.d();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:141:0x01bb A[EDGE_INSN: B:141:0x01bb->B:64:0x01bb ?: BREAK  , SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0170 A[Catch: all -> 0x025f, TRY_LEAVE, TryCatch #11 {all -> 0x025f, blocks: (B:44:0x014f, B:46:0x0155, B:48:0x0159, B:49:0x015f, B:50:0x0166, B:52:0x0170), top: B:138:0x014f }] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x01c2 A[Catch: all -> 0x01cd, TryCatch #9 {all -> 0x01cd, blocks: (B:56:0x0182, B:62:0x0192, B:63:0x019c, B:66:0x01c2, B:72:0x01d8, B:74:0x01e2, B:76:0x01ee, B:78:0x01fa, B:79:0x0217, B:80:0x0224, B:84:0x0243), top: B:135:0x0182 }] */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0240  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0242  */
                /* JADX WARN: Type inference failed for: r13v1 */
                @Override // com.bytedance.sdk.component.b.a.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void a(com.bytedance.sdk.component.b.a.b r29, com.bytedance.sdk.component.b.a.m r30) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 690
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.b.a.AnonymousClass1.a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
                }
            });
        } catch (IllegalArgumentException unused) {
            aVar.a(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f8, code lost:
        r5.seek(r14);
        r5.write(r0, 0, r9);
        r14 = r14 + r9;
        r9 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0209 A[EDGE_INSN: B:169:0x0209->B:82:0x0209 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dd A[Catch: all -> 0x029a, TryCatch #10 {all -> 0x029a, blocks: (B:64:0x01b9, B:66:0x01bf, B:68:0x01c3, B:69:0x01c9, B:70:0x01d0, B:72:0x01dd, B:74:0x01ed, B:79:0x01f8, B:84:0x020e, B:86:0x0216, B:90:0x0225, B:92:0x022d, B:94:0x0237, B:96:0x0241, B:112:0x0266, B:116:0x027d), top: B:163:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020e A[Catch: all -> 0x029a, TryCatch #10 {all -> 0x029a, blocks: (B:64:0x01b9, B:66:0x01bf, B:68:0x01c3, B:69:0x01c9, B:70:0x01d0, B:72:0x01dd, B:74:0x01ed, B:79:0x01f8, B:84:0x020e, B:86:0x0216, B:90:0x0225, B:92:0x022d, B:94:0x0237, B:96:0x0241, B:112:0x0266, B:116:0x027d), top: B:163:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216 A[Catch: all -> 0x029a, TryCatch #10 {all -> 0x029a, blocks: (B:64:0x01b9, B:66:0x01bf, B:68:0x01c3, B:69:0x01c9, B:70:0x01d0, B:72:0x01dd, B:74:0x01ed, B:79:0x01f8, B:84:0x020e, B:86:0x0216, B:90:0x0225, B:92:0x022d, B:94:0x0237, B:96:0x0241, B:112:0x0266, B:116:0x027d), top: B:163:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.e.b a() {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.b.a.a():com.bytedance.sdk.component.e.b");
    }

    protected void a(long j10, long j11, com.bytedance.sdk.component.e.a.a aVar) {
        if (aVar != null) {
            aVar.a(this, j10, j11);
        }
    }
}
