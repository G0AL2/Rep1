package com.ironsource.a;

import android.net.Uri;
import android.util.Log;
import com.ironsource.d.b;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private c f26070a;

    /* renamed from: b  reason: collision with root package name */
    com.ironsource.a.a f26071b;

    /* renamed from: c  reason: collision with root package name */
    private d f26072c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f26073d;

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f26074a;

        a(String str) {
            this.f26074a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.ironsource.d.c cVar = new com.ironsource.d.c();
                ArrayList arrayList = new ArrayList(b.this.f26071b.f26063f);
                if ("POST".equals(b.this.f26071b.f26060c)) {
                    cVar = com.ironsource.d.b.a(b.this.f26071b.f26058a, this.f26074a, arrayList);
                } else if ("GET".equals(b.this.f26071b.f26060c)) {
                    String str = b.this.f26071b.f26058a;
                    String str2 = this.f26074a;
                    Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                    b.a.C0335a c0335a = new b.a.C0335a();
                    c0335a.f26090b = build.toString();
                    c0335a.f26092d = str2;
                    c0335a.f26091c = "GET";
                    c0335a.a(arrayList);
                    cVar = com.ironsource.d.b.a(c0335a.a());
                }
                b bVar = b.this;
                bVar.a("response status code: " + cVar.f26096a);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public b(com.ironsource.a.a aVar, c cVar) {
        if (aVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        d dVar = aVar.f26061d;
        if (dVar == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f26071b = aVar;
        this.f26070a = cVar;
        this.f26072c = dVar;
        this.f26073d = Executors.newSingleThreadExecutor();
    }

    private static void b(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    void a(String str) {
        if (this.f26071b.f26062e) {
            Log.d("EventsTracker", str);
        }
    }

    public final void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f26071b.f26059b && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            b(hashMap, this.f26070a.a());
            b(hashMap, map);
            this.f26073d.submit(new a(this.f26072c.a(hashMap)));
        }
    }
}
