package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.h;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f6265a;

    /* renamed from: b  reason: collision with root package name */
    private com.apm.insight.e.b.b f6266b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f6267c;

    private a() {
    }

    public static a a() {
        if (f6265a == null) {
            synchronized (a.class) {
                if (f6265a == null) {
                    f6265a = new a();
                }
            }
        }
        return f6265a;
    }

    private void b() {
        if (this.f6266b == null) {
            a(h.g());
        }
    }

    public synchronized void a(Context context) {
        try {
            this.f6267c = new b(context).getWritableDatabase();
            this.f6266b = new com.apm.insight.e.b.b();
        }
    }

    public synchronized void a(com.apm.insight.e.a.a aVar) {
        b();
        com.apm.insight.e.b.b bVar = this.f6266b;
        if (bVar != null) {
            bVar.a(this.f6267c, aVar);
        }
    }

    public synchronized boolean a(String str) {
        b();
        com.apm.insight.e.b.b bVar = this.f6266b;
        if (bVar != null) {
            return bVar.a(this.f6267c, str);
        }
        return false;
    }
}
