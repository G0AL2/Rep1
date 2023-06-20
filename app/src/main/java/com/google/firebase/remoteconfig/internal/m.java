package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.b;
import java.util.Date;

/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: d  reason: collision with root package name */
    static final Date f23683d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    static final Date f23684e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f23685a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f23686b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f23687c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigMetadataClient.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f23688a;

        /* renamed from: b  reason: collision with root package name */
        private Date f23689b;

        a(int i10, Date date) {
            this.f23688a = i10;
            this.f23689b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.f23689b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f23688a;
        }
    }

    public m(SharedPreferences sharedPreferences) {
        this.f23685a = sharedPreferences;
    }

    public void a() {
        synchronized (this.f23686b) {
            this.f23685a.edit().clear().commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b() {
        a aVar;
        synchronized (this.f23687c) {
            aVar = new a(this.f23685a.getInt("num_failed_fetches", 0), new Date(this.f23685a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long c() {
        return this.f23685a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public dd.n d() {
        p a10;
        synchronized (this.f23686b) {
            long j10 = this.f23685a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f23685a.getInt("last_fetch_status", 0);
            a10 = p.d().c(i10).d(j10).b(new b.C0309b().d(this.f23685a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f23685a.getLong("minimum_fetch_interval_in_seconds", j.f23662j)).c()).a();
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f23685a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Date f() {
        return new Date(this.f23685a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long g() {
        return this.f23685a.getLong("minimum_fetch_interval_in_seconds", j.f23662j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        i(0, f23684e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i10, Date date) {
        synchronized (this.f23687c) {
            this.f23685a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void j(com.google.firebase.remoteconfig.b bVar) {
        synchronized (this.f23686b) {
            this.f23685a.edit().putLong("fetch_timeout_in_seconds", bVar.a()).putLong("minimum_fetch_interval_in_seconds", bVar.b()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(String str) {
        synchronized (this.f23686b) {
            this.f23685a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        synchronized (this.f23686b) {
            this.f23685a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Date date) {
        synchronized (this.f23686b) {
            this.f23685a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        synchronized (this.f23686b) {
            this.f23685a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
