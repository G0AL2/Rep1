package com.bytedance.sdk.openadsdk.b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AdEventRepertoryImpl.java */
/* loaded from: classes.dex */
public class g implements f<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11089a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.c f11090b = com.bytedance.sdk.openadsdk.core.c.a(c());

    public g(Context context) {
        this.f11089a = context;
    }

    private synchronized void b(int i10, long j10) {
        long currentTimeMillis = System.currentTimeMillis() - j10;
        Context c10 = c();
        String d10 = d();
        com.bytedance.sdk.openadsdk.multipro.a.a.a(c10, d10, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i10 + ""});
    }

    public static String e() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ,gen_time TEXT , retry INTEGER default 0)";
    }

    public Context c() {
        Context context = this.f11089a;
        return context == null ? com.bytedance.sdk.openadsdk.core.m.a() : context;
    }

    public String d() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized List<a> a(int i10, String str) {
        LinkedList linkedList;
        String str2 = null;
        if (i10 > 0) {
            if (!TextUtils.isEmpty(str)) {
                str2 = str + " DESC limit " + i10;
            }
        }
        linkedList = new LinkedList();
        com.bytedance.sdk.openadsdk.multipro.aidl.c cVar = new com.bytedance.sdk.openadsdk.multipro.aidl.c(com.bytedance.sdk.openadsdk.multipro.a.a.a(c(), d(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE}, null, null, null, null, str2));
        while (cVar.moveToNext()) {
            String string = cVar.getString(cVar.getColumnIndex("id"));
            String string2 = cVar.getString(cVar.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            if (string2 != null) {
                try {
                    linkedList.add(new a(string, new JSONObject(string2)));
                } catch (Throwable unused) {
                }
            }
        }
        cVar.close();
        return linkedList;
    }

    private synchronized void b(List<a> list) {
        LinkedList linkedList = new LinkedList();
        for (a aVar : list) {
            linkedList.add(aVar.f10976a);
        }
        com.bytedance.sdk.openadsdk.multipro.a.a.a(c(), "UPDATE " + d() + " SET retry = retry+1 WHERE " + a("id", linkedList, 1000, true));
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized void a(a aVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aVar.f10976a);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.b().toString());
            contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry", (Integer) 0);
            com.bytedance.sdk.openadsdk.multipro.a.a.a(c(), d(), contentValues);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public int b() {
        return this.f11090b.b("serverbusy_retrycount", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized void a(List<a> list) {
        if (com.bytedance.sdk.component.utils.j.a(list)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (a aVar : list) {
            linkedList.add(aVar.f10976a);
        }
        com.bytedance.sdk.openadsdk.multipro.a.a.a(c(), "DELETE FROM " + d() + " WHERE " + a("id", linkedList, 1000, true));
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized void a(int i10, long j10) {
        b(i10, j10);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized void a(List<a> list, int i10, long j10) {
        if (com.bytedance.sdk.component.utils.j.a(list)) {
            return;
        }
        try {
            b(list);
            b(i10, j10);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public void a(boolean z10) {
        this.f11090b.a("serverbusy_flag", z10);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public boolean a() {
        return this.f11090b.b("serverbusy_flag", false);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public void a(int i10) {
        this.f11090b.a("serverbusy_retrycount", i10);
    }

    private static String a(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int min = Math.min(i10, 1000);
        int size = list.size();
        if (size % min == 0) {
            i11 = size / min;
        } else {
            i11 = (size / min) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * min;
            String a10 = a(TextUtils.join("','", list.subList(i13, Math.min(i13 + min, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            sb2.append(str);
            sb2.append(str2);
            sb2.append("('");
            sb2.append(a10);
            sb2.append("')");
        }
        String sb3 = sb2.toString();
        return a(sb3, str + str2 + "('')");
    }

    private static String a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
