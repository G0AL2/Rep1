package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static b f28201d;

    /* renamed from: a  reason: collision with root package name */
    public com.ironsource.sdk.k.a f28202a = new com.ironsource.sdk.k.a(com.ironsource.environment.e.a.a());

    /* renamed from: b  reason: collision with root package name */
    public final String f28203b;

    /* renamed from: c  reason: collision with root package name */
    private Thread f28204c;

    /* loaded from: classes3.dex */
    static class a implements Callable<C0355b> {

        /* renamed from: a  reason: collision with root package name */
        private String f28205a;

        /* renamed from: b  reason: collision with root package name */
        private String f28206b;

        /* renamed from: c  reason: collision with root package name */
        private String f28207c;

        /* renamed from: d  reason: collision with root package name */
        private long f28208d;

        /* renamed from: e  reason: collision with root package name */
        private String f28209e;

        a(String str, String str2, String str3, long j10, String str4) {
            this.f28205a = str;
            this.f28206b = str2;
            this.f28207c = str3;
            this.f28208d = j10;
            this.f28209e = str4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:125:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00d4 A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #2 {all -> 0x00f2, blocks: (B:55:0x00ca, B:57:0x00d4, B:40:0x009f, B:42:0x00a9), top: B:129:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00e5 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:59:0x00dd, B:63:0x00e5), top: B:125:0x00dd }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00ff A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #8 {all -> 0x00fb, blocks: (B:70:0x00f7, B:74:0x00ff), top: B:134:0x00f7 }] */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.net.HttpURLConnection] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.ironsource.sdk.k.b.C0355b b(java.lang.String r9, int r10) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.k.b.a.b(java.lang.String, int):com.ironsource.sdk.k.b$b");
        }

        private static byte[] c(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[Constants.BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr, 0, Constants.BUFFER_SIZE);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public final C0355b call() {
            int i10;
            int i11;
            if (this.f28208d == 0) {
                this.f28208d = 1L;
            }
            C0355b c0355b = null;
            for (int i12 = 0; i12 < this.f28208d && ((i11 = (c0355b = b(this.f28205a, i12)).f28211b) == 1008 || i11 == 1009); i12++) {
            }
            if (c0355b != null && c0355b.f28212c != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f28206b);
                String str = File.separator;
                sb2.append(str);
                sb2.append(this.f28207c);
                String sb3 = sb2.toString();
                String str2 = this.f28209e + str + "tmp_" + this.f28207c;
                try {
                    if (IronSourceStorageUtils.saveFile(c0355b.f28212c, str2) == 0) {
                        c0355b.f28211b = 1006;
                    } else if (!IronSourceStorageUtils.renameFile(str2, sb3)) {
                        c0355b.f28211b = IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT;
                    }
                } catch (FileNotFoundException unused) {
                    i10 = 1018;
                    c0355b.f28211b = i10;
                } catch (Error e10) {
                    if (!TextUtils.isEmpty(e10.getMessage())) {
                        Logger.i("DownloadManager", e10.getMessage());
                    }
                    i10 = 1019;
                    c0355b.f28211b = i10;
                } catch (Exception e11) {
                    if (!TextUtils.isEmpty(e11.getMessage())) {
                        Logger.i("DownloadManager", e11.getMessage());
                    }
                    c0355b.f28211b = 1009;
                }
            }
            return c0355b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.k.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0355b {

        /* renamed from: a  reason: collision with root package name */
        public String f28210a;

        /* renamed from: b  reason: collision with root package name */
        int f28211b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f28212c;

        C0355b() {
        }
    }

    /* loaded from: classes3.dex */
    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final String f28213a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f28214b;

        /* renamed from: c  reason: collision with root package name */
        private String f28215c;

        /* renamed from: d  reason: collision with root package name */
        private String f28216d;

        /* renamed from: e  reason: collision with root package name */
        private String f28217e;

        /* renamed from: f  reason: collision with root package name */
        private long f28218f = 3;

        c(com.ironsource.sdk.h.c cVar, String str, Handler handler, String str2) {
            this.f28215c = str;
            this.f28216d = cVar.getParent();
            this.f28217e = cVar.getName();
            this.f28214b = handler;
            this.f28213a = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(this.f28216d, this.f28217e);
            Message message = new Message();
            message.obj = cVar;
            String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
            if (makeDir == null) {
                i10 = IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT;
            } else {
                i10 = new a(this.f28215c, makeDir, cVar.getName(), this.f28218f, this.f28213a).call().f28211b;
                if (i10 == 200) {
                    i10 = 1016;
                }
            }
            message.what = i10;
            this.f28214b.sendMessage(message);
        }
    }

    private b(String str, com.ironsource.environment.e.a aVar) {
        this.f28203b = str;
        IronSourceStorageUtils.deleteFolder(c());
        IronSourceStorageUtils.makeDir(c());
    }

    public static synchronized b a(String str, com.ironsource.environment.e.a aVar) {
        b bVar;
        synchronized (b.class) {
            if (f28201d == null) {
                f28201d = new b(str, aVar);
            }
            bVar = f28201d;
        }
        return bVar;
    }

    private String c() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f28203b, "temp");
    }

    public final synchronized void a() {
        f28201d = null;
        com.ironsource.sdk.k.a aVar = this.f28202a;
        if (aVar != null) {
            aVar.f28200a = null;
            this.f28202a = null;
        }
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str) {
        Thread thread = new Thread(new c(cVar, str, this.f28202a, c()));
        this.f28204c = thread;
        thread.start();
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str, Handler handler) {
        new Thread(new c(cVar, str, handler, c())).start();
    }

    public final boolean b() {
        Thread thread = this.f28204c;
        return thread != null && thread.isAlive();
    }
}
