package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.hr;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: UnifiedSdk.java */
/* loaded from: classes3.dex */
public final class jf {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25843a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final String f25844b = "jf";

    /* renamed from: c  reason: collision with root package name */
    private static hr.c f25845c = new a((byte) 0);

    /* compiled from: UnifiedSdk.java */
    /* loaded from: classes3.dex */
    static class a implements hr.c {
        private a() {
        }

        @Override // com.inmobi.media.hr.c
        public final void a(final boolean z10) {
            ho.b(z10);
            ho.a(new Runnable() { // from class: com.inmobi.media.jf.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (z10) {
                        jf.d();
                    } else {
                        jf.b();
                    }
                }
            });
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    public static void a(jd jdVar) {
        ObjectOutputStream objectOutputStream;
        Context c10;
        FileOutputStream fileOutputStream = null;
        try {
            ho.l();
            c10 = ho.c();
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
            objectOutputStream = null;
        }
        if (c10 != null) {
            File file = new File(ho.c(c10), "asConfigs");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                try {
                    objectOutputStream.writeObject(jdVar);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    hv.a(fileOutputStream);
                    hv.a(objectOutputStream);
                    throw th;
                }
            } catch (IOException unused3) {
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
            }
            fileOutputStream = fileOutputStream2;
            hv.a(fileOutputStream);
            hv.a(objectOutputStream);
        }
        objectOutputStream = null;
        hv.a(fileOutputStream);
        hv.a(objectOutputStream);
    }

    public static boolean a() {
        return false;
    }

    public static void b(Context context) {
        hr a10 = hr.a();
        if (a10 != null) {
            a10.a(context, f25845c);
        }
    }

    public static void c(final Context context) {
        if (f25843a) {
            return;
        }
        fs.a();
        hh.a().b();
        iq.a().b();
        ho.a(new Runnable() { // from class: com.inmobi.media.jf.1
            @Override // java.lang.Runnable
            public final void run() {
                if (hp.b(context) && is.b(context).isEmpty()) {
                    hp.a(context, false);
                }
                ig.a();
                jk.c();
                ic.d();
                jf.d();
                try {
                    bg.a().b();
                    bg.a().d();
                } catch (Exception unused) {
                    String unused2 = jf.f25844b;
                }
                jf.f25843a = true;
            }
        });
    }

    static /* synthetic */ void d() {
        try {
            iq.a().b();
            fs.a();
            bk.a().b();
            gg a10 = gg.a();
            gg.f25529a.set(false);
            ga gaVar = (ga) fs.a("crashReporting", ho.f(), a10);
            a10.f25531b = gaVar;
            a10.f25533d = gaVar.url;
            if (a10.f25532c.a() > 0) {
                a10.b();
            }
            hh.a().b();
            iw.a().b();
            bg.a().b();
            hh.a().a("SessionStarted", new HashMap());
        } catch (Exception unused) {
            hu.a((byte) 2, f25844b, "SDK encountered unexpected error while starting internal components");
        }
    }

    public static void b() {
        try {
            fs.b();
            hh a10 = hh.a();
            hh.f25658a.set(true);
            gn gnVar = a10.f25662c;
            if (gnVar != null) {
                ScheduledExecutorService scheduledExecutorService = gnVar.f25568e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    gnVar.f25568e = null;
                }
                gnVar.f25564a.set(false);
                gnVar.f25565b.set(true);
                gnVar.f25567d.clear();
                gnVar.f25566c.clear();
                a10.f25662c = null;
            }
            iw.a().c();
            bg.a().c();
        } catch (Exception unused) {
            hu.a((byte) 1, f25844b, "SDK encountered unexpected error while stopping internal components");
        }
    }

    public static jd c() {
        FileInputStream fileInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        jd jdVar;
        FileInputStream fileInputStream2 = null;
        try {
            if (ho.c() != null) {
                File file = new File(ho.c(ho.c()), "asConfigs");
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            jdVar = (jd) objectInputStream.readObject();
                            fileInputStream2 = fileInputStream;
                            hv.a((Closeable) fileInputStream2);
                            hv.a((Closeable) objectInputStream);
                            return jdVar;
                        } catch (IOException | ClassNotFoundException unused) {
                            hv.a((Closeable) fileInputStream);
                            hv.a((Closeable) objectInputStream);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            hv.a((Closeable) fileInputStream);
                            hv.a((Closeable) objectInputStream);
                            throw th;
                        }
                    } catch (IOException | ClassNotFoundException unused2) {
                        objectInputStream = null;
                    } catch (Throwable th3) {
                        objectInputStream = null;
                        th = th3;
                    }
                }
            }
            objectInputStream = null;
            jdVar = null;
            hv.a((Closeable) fileInputStream2);
            hv.a((Closeable) objectInputStream);
            return jdVar;
        } catch (IOException | ClassNotFoundException unused3) {
            objectInputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            objectInputStream = null;
        }
    }

    public static void a(Context context) {
        if (hp.a(context) == null || !hp.a(context).equals(hp.b())) {
            hp.a(context, is.a(context));
            hp.a(context, hp.b());
            Context applicationContext = context.getApplicationContext();
            File b10 = ho.b(applicationContext);
            File c10 = ho.c(applicationContext);
            ho.a(b10, (String) null);
            ho.a(c10, (String) null);
            ho.d(applicationContext);
            if (!b10.mkdir()) {
                b10.isDirectory();
            }
            if (c10.mkdir()) {
                return;
            }
            c10.isDirectory();
        }
    }
}
