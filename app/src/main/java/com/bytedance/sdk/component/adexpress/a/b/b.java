package com.bytedance.sdk.component.adexpress.a.b;

import android.os.Environment;
import com.bytedance.sdk.component.adexpress.a.c.a;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TemplateManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static File f9327a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f9328b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f9329c = new AtomicBoolean(true);

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f9330d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private boolean f9331e = false;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f9332f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private AtomicInteger f9333g = new AtomicInteger(0);

    /* renamed from: h  reason: collision with root package name */
    private AtomicLong f9334h = new AtomicLong();

    private b() {
        h();
    }

    public static File f() {
        File externalCacheDir;
        if (f9327a == null) {
            try {
                if (com.bytedance.sdk.component.adexpress.c.b()) {
                    externalCacheDir = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b().getCacheDir();
                } else if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && com.bytedance.sdk.component.adexpress.a.a.a.a().c().b().getExternalCacheDir() != null) {
                    externalCacheDir = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b().getExternalCacheDir();
                } else {
                    externalCacheDir = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b().getCacheDir();
                }
                File file = new File(new File(externalCacheDir, "tt_tmpl_pkg"), "template");
                file.mkdirs();
                f9327a = file;
            } catch (Throwable th) {
                l.c("TemplateManager", "getTemplateDir error", th);
            }
        }
        return f9327a;
    }

    private void h() {
        com.bytedance.sdk.component.f.e.a(new g("init") { // from class: com.bytedance.sdk.component.adexpress.a.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                e.a();
                b.this.f9329c.set(false);
                b.this.i();
                b.this.e();
                if (com.bytedance.sdk.component.adexpress.a.a.a.a().c() == null || !r.a(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b())) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.a.a.a.a().c().c().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.a.b.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.adexpress.a.a.a.a().c() != null) {
                            com.bytedance.sdk.component.adexpress.a.a.a.a().c().d();
                        }
                    }
                });
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r8 = this;
            java.lang.String r0 = "TemplateManager"
            java.lang.String r1 = "check template usable1"
            com.bytedance.sdk.component.utils.l.b(r0, r1)
            com.bytedance.sdk.component.adexpress.a.c.a r1 = com.bytedance.sdk.component.adexpress.a.b.e.b()
            if (r1 == 0) goto L98
            boolean r2 = r1.f()
            if (r2 != 0) goto L15
            goto L98
        L15:
            r2 = 1
            java.util.List r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r1.next()
            com.bytedance.sdk.component.adexpress.a.c.a$a r3 = (com.bytedance.sdk.component.adexpress.a.c.a.C0145a) r3
            java.lang.String r4 = r3.a()
            java.lang.String r5 = com.bytedance.sdk.component.utils.e.a(r4)
            java.io.File r6 = new java.io.File
            java.io.File r7 = f()
            r6.<init>(r7, r5)
            java.lang.String r5 = com.bytedance.sdk.component.utils.e.a(r6)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L5b
            boolean r7 = r6.isFile()
            if (r7 == 0) goto L5b
            java.lang.String r7 = r3.b()
            if (r7 == 0) goto L5b
            java.lang.String r3 = r3.b()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L1e
        L5b:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "check template usable3: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ","
            r1.append(r3)
            java.lang.String r3 = r6.getAbsolutePath()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.l.b(r0, r1)
        L7c:
            if (r2 != 0) goto L81
            com.bytedance.sdk.component.adexpress.a.b.e.d()
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "check template usable4: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.l.b(r0, r1)
            r8.f9331e = r2
            return
        L98:
            java.lang.String r1 = "check template usable2"
            com.bytedance.sdk.component.utils.l.b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.a.b.b.i():void");
    }

    private void j() {
        if (this.f9333g.getAndSet(0) <= 0 || System.currentTimeMillis() - this.f9334h.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        e();
    }

    public boolean c() {
        return this.f9331e;
    }

    public com.bytedance.sdk.component.adexpress.a.c.a d() {
        return e.b();
    }

    public void e() {
        a(false);
    }

    public void g() {
        this.f9332f.set(true);
        this.f9331e = false;
        this.f9330d.set(false);
    }

    public static b a() {
        if (f9328b == null) {
            synchronized (b.class) {
                if (f9328b == null) {
                    f9328b = new b();
                }
            }
        }
        return f9328b;
    }

    public void b() {
        h();
    }

    public void b(boolean z10) {
        this.f9332f.set(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0147 A[Catch: all -> 0x0262, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0262, blocks: (B:6:0x0010, B:9:0x001a, B:10:0x001f, B:12:0x0034, B:14:0x004d, B:17:0x0055, B:19:0x005f, B:22:0x0075, B:24:0x007f, B:25:0x0093, B:27:0x009f, B:30:0x00ab, B:32:0x00b5, B:54:0x013b, B:55:0x013f, B:58:0x0147, B:61:0x017b, B:64:0x0184, B:66:0x01a4, B:68:0x01aa, B:70:0x01b0, B:73:0x01bb, B:74:0x01c2, B:76:0x01d0, B:77:0x01db, B:79:0x01e1, B:82:0x0215, B:86:0x021f, B:33:0x00c3, B:34:0x00cb, B:36:0x00d1, B:38:0x00e1, B:39:0x00e5, B:41:0x00ef, B:43:0x00f5, B:45:0x0103, B:46:0x0107, B:47:0x010f, B:49:0x0115, B:51:0x0125, B:52:0x0129, B:53:0x012f, B:87:0x0252), top: B:96:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e1 A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #0 {all -> 0x0262, blocks: (B:6:0x0010, B:9:0x001a, B:10:0x001f, B:12:0x0034, B:14:0x004d, B:17:0x0055, B:19:0x005f, B:22:0x0075, B:24:0x007f, B:25:0x0093, B:27:0x009f, B:30:0x00ab, B:32:0x00b5, B:54:0x013b, B:55:0x013f, B:58:0x0147, B:61:0x017b, B:64:0x0184, B:66:0x01a4, B:68:0x01aa, B:70:0x01b0, B:73:0x01bb, B:74:0x01c2, B:76:0x01d0, B:77:0x01db, B:79:0x01e1, B:82:0x0215, B:86:0x021f, B:33:0x00c3, B:34:0x00cb, B:36:0x00d1, B:38:0x00e1, B:39:0x00e5, B:41:0x00ef, B:43:0x00f5, B:45:0x0103, B:46:0x0107, B:47:0x010f, B:49:0x0115, B:51:0x0125, B:52:0x0129, B:53:0x012f, B:87:0x0252), top: B:96:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r12) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.a.b.b.a(boolean):void");
    }

    private void a(String str) {
        String a10 = com.bytedance.sdk.component.utils.e.a(str);
        com.bytedance.sdk.component.e.b.a f10 = com.bytedance.sdk.component.adexpress.a.a.a.a().c().f();
        f10.a(str);
        f10.a(f().getAbsolutePath(), a10);
        com.bytedance.sdk.component.e.b a11 = f10.a();
        if (a11 == null || !a11.f() || a11.e() == null || !a11.e().exists()) {
            File file = new File(f(), a10);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private void a(int i10) {
        if (com.bytedance.sdk.component.adexpress.a.a.a.a().d() != null) {
            com.bytedance.sdk.component.adexpress.a.a.a.a().d().a(i10);
        }
    }

    private void a(List<a.C0145a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (a.C0145a c0145a : list) {
            File file = new File(f(), com.bytedance.sdk.component.utils.e.a(c0145a.a()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
