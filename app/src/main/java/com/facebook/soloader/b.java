package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: ApplicationSoSource.java */
/* loaded from: classes.dex */
public class b extends q {

    /* renamed from: a  reason: collision with root package name */
    private Context f16505a;

    /* renamed from: b  reason: collision with root package name */
    private int f16506b;

    /* renamed from: c  reason: collision with root package name */
    private d f16507c;

    public b(Context context, int i10) {
        Context applicationContext = context.getApplicationContext();
        this.f16505a = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
            this.f16505a = context;
        }
        this.f16506b = i10;
        this.f16507c = new d(new File(this.f16505a.getApplicationInfo().nativeLibraryDir), i10);
    }

    public static File e(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.q
    public int a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.f16507c.a(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.q
    public void b(int i10) throws IOException {
        this.f16507c.b(i10);
    }

    @Override // com.facebook.soloader.q
    public File c(String str) throws IOException {
        return this.f16507c.c(str);
    }

    public boolean d() throws IOException {
        File file = this.f16507c.f16511a;
        Context f10 = f();
        File e10 = e(f10);
        if (file.equals(e10)) {
            return false;
        }
        Log.d("SoLoader", "Native library directory updated from " + file + " to " + e10);
        int i10 = this.f16506b | 1;
        this.f16506b = i10;
        d dVar = new d(e10, i10);
        this.f16507c = dVar;
        dVar.b(this.f16506b);
        this.f16505a = f10;
        return true;
    }

    public Context f() {
        try {
            Context context = this.f16505a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.q
    public String toString() {
        return this.f16507c.toString();
    }
}
