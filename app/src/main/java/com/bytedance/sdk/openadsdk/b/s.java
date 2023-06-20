package com.bytedance.sdk.openadsdk.b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.h.c.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: StatsEventRepertoryImpl.java */
/* loaded from: classes.dex */
public class s implements f<c.a> {

    /* renamed from: a  reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.core.c f11167a = com.bytedance.sdk.openadsdk.core.c.a(e());

    /* renamed from: b  reason: collision with root package name */
    private final Context f11168b;

    public s(Context context) {
        this.f11168b = context;
    }

    private synchronized void b(int i10, long j10) {
        long currentTimeMillis = System.currentTimeMillis() - j10;
        Context e10 = e();
        String c10 = c();
        com.bytedance.sdk.openadsdk.multipro.a.a.a(e10, c10, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i10 + ""});
    }

    public static String f() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ,gen_time TEXT , retry INTEGER default 0)";
    }

    public String c() {
        return "logstats";
    }

    public Context e() {
        Context context = this.f11168b;
        return context == null ? com.bytedance.sdk.openadsdk.core.m.a() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public List<c.a> a(int i10, String str) {
        String str2;
        if (i10 <= 0 || TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = str + " DESC limit " + i10;
        }
        String str3 = str2;
        LinkedList linkedList = new LinkedList();
        com.bytedance.sdk.openadsdk.multipro.aidl.c cVar = new com.bytedance.sdk.openadsdk.multipro.aidl.c(com.bytedance.sdk.openadsdk.multipro.a.a.a(e(), c(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE}, null, null, null, null, str3));
        while (cVar.moveToNext()) {
            try {
                String string = cVar.getString(cVar.getColumnIndex("id"));
                String string2 = cVar.getString(cVar.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    try {
                        linkedList.add(new c.a(string, new JSONObject(string2)));
                    } catch (Exception unused) {
                    }
                }
            } finally {
                cVar.close();
            }
        }
        return linkedList;
    }

    private synchronized void b(List<c.a> list) {
        LinkedList linkedList = new LinkedList();
        for (c.a aVar : list) {
            linkedList.add(aVar.f13320a);
        }
        com.bytedance.sdk.openadsdk.multipro.a.a.a(e(), "UPDATE " + c() + " SET retry = retry+1 WHERE " + a("id", linkedList, 1000, true));
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized void a(c.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", aVar.f13320a);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.f13321b.toString());
        contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry", (Integer) 0);
        com.bytedance.sdk.openadsdk.multipro.a.a.a(e(), c(), contentValues);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized void a(List<c.a> list) {
        if (com.bytedance.sdk.component.utils.j.a(list)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (c.a aVar : list) {
            linkedList.add(aVar.f13320a);
        }
        com.bytedance.sdk.openadsdk.multipro.a.a.a(e(), "DELETE FROM " + c() + " WHERE " + a("id", linkedList, 1000, true));
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public int b() {
        return this.f11167a.b("stats_serverbusy_retrycount", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized void a(int i10, long j10) {
        b(i10, j10);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public synchronized void a(List<c.a> list, int i10, long j10) {
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
        this.f11167a.a("stats_serverbusy_flag", z10);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public boolean a() {
        return this.f11167a.b("stats_serverbusy_flag", false);
    }

    @Override // com.bytedance.sdk.openadsdk.b.f
    public void a(int i10) {
        this.f11167a.a("stats_serverbusy_retrycount", i10);
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
