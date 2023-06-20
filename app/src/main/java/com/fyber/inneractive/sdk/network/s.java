package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f17697a = null;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static s f17698a = new s();
    }

    public static void a(Context context, String str, String str2, com.fyber.inneractive.sdk.flow.j<? extends com.fyber.inneractive.sdk.response.e> jVar) {
        int i10;
        if (context != null && str != null && jVar.c() != null) {
            s sVar = a.f17698a;
            if (sVar.f17697a == null) {
                sVar.f17697a = context.getSharedPreferences("AutoWebActionPrefs", 0);
            }
            IAlog.d("IAautoWebActionReporter: reporting action: %s", str);
            IAlog.d("IAautoWebActionReporter: url: %s", str2);
            IAConfigManager iAConfigManager = IAConfigManager.J;
            if (!iAConfigManager.f16873i.f17011d) {
                IAlog.a("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
                return;
            }
            o oVar = o.MRAID_AUTO_ACTION_DETECTED;
            InneractiveAdRequest inneractiveAdRequest = jVar.f17239a;
            com.fyber.inneractive.sdk.response.e c10 = jVar.c();
            JSONArray c11 = jVar.f17241c.c();
            q.a aVar = new q.a(c10);
            aVar.f17682b = oVar;
            aVar.f17681a = inneractiveAdRequest;
            aVar.f17684d = c11;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", str);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "action", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject.put(ImagesContract.URL, str2);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", ImagesContract.URL, str2);
                }
            }
            long j10 = sVar.f17697a.getLong("lastReportTS", 0L);
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            Calendar calendar = Calendar.getInstance(timeZone);
            Calendar calendar2 = Calendar.getInstance(timeZone);
            calendar2.setTimeInMillis(j10);
            if (j10 <= 0 || calendar.get(6) != calendar2.get(6)) {
                i10 = 0;
            } else {
                IAlog.d("IAautoWebActionReporter: encountered same date", new Object[0]);
                i10 = sVar.f17697a.getInt("numReportsToday", 0);
            }
            int i11 = iAConfigManager.f16873i.f17012e;
            int i12 = i10 + 1;
            IAlog.d("IAautoWebActionReporter: day counter: %d max: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            if (i10 < i11) {
                IAlog.d("IAautoWebActionReporter: adding ad data", new Object[0]);
                aVar.f17687g = true;
            } else {
                IAlog.d("IAautoWebActionReporter: not adding ad data", new Object[0]);
            }
            Integer valueOf = Integer.valueOf(i12);
            try {
                jSONObject.put("daily_count", valueOf);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", "daily_count", valueOf);
            }
            aVar.f17686f.put(jSONObject);
            aVar.a((String) null);
            SharedPreferences.Editor edit = sVar.f17697a.edit();
            edit.putLong("lastReportTS", calendar.getTimeInMillis());
            edit.putInt("numReportsToday", i12);
            edit.apply();
            return;
        }
        IAlog.a("Invalid report request parameters!", new Object[0]);
    }
}
