package com.bytedance.sdk.component.d.c.a;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* compiled from: CacheConfig.java */
/* loaded from: classes.dex */
public class a implements com.bytedance.sdk.component.d.b, Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.d.b f10101f;

    /* renamed from: a  reason: collision with root package name */
    private long f10102a;

    /* renamed from: b  reason: collision with root package name */
    private int f10103b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10104c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10105d;

    /* renamed from: e  reason: collision with root package name */
    private File f10106e;

    public a(int i10, long j10, File file) {
        this(i10, j10, i10 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.d.b f() {
        return f10101f;
    }

    private static long g() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    @Override // com.bytedance.sdk.component.d.b
    public long a() {
        return this.f10102a;
    }

    @Override // com.bytedance.sdk.component.d.b
    public int b() {
        return this.f10103b;
    }

    @Override // com.bytedance.sdk.component.d.b
    public boolean c() {
        return this.f10104c;
    }

    @Override // com.bytedance.sdk.component.d.b
    public boolean d() {
        return this.f10105d;
    }

    @Override // com.bytedance.sdk.component.d.b
    public File e() {
        return this.f10106e;
    }

    public a(int i10, long j10, boolean z10, boolean z11, File file) {
        this.f10102a = j10;
        this.f10103b = i10;
        this.f10104c = z10;
        this.f10105d = z11;
        this.f10106e = file;
    }

    public static void a(Context context, com.bytedance.sdk.component.d.b bVar) {
        if (bVar != null) {
            f10101f = bVar;
        } else {
            f10101f = a(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.d.b a(File file) {
        int min;
        long min2;
        file.mkdirs();
        if (f10101f == null) {
            min = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            min2 = Math.min(g() / 16, 41943040L);
        } else {
            min = Math.min(f10101f.b() / 2, 31457280);
            min2 = Math.min(f10101f.a() / 2, 41943040L);
        }
        return new a(Math.max(min, 26214400), Math.max(min2, 20971520L), file);
    }
}
