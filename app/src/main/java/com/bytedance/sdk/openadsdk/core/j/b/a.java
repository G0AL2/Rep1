package com.bytedance.sdk.openadsdk.core.j.b;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastAbsoluteProgressTracker.java */
/* loaded from: classes.dex */
public class a extends c implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    public long f12420a;

    /* compiled from: VastAbsoluteProgressTracker.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0171a {

        /* renamed from: a  reason: collision with root package name */
        private String f12421a;

        /* renamed from: b  reason: collision with root package name */
        private long f12422b;

        /* renamed from: c  reason: collision with root package name */
        private c.b f12423c = c.b.TRACKING_URL;

        /* renamed from: d  reason: collision with root package name */
        private boolean f12424d = false;

        public C0171a(String str, long j10) {
            this.f12421a = str;
            this.f12422b = j10;
        }

        public a a() {
            return new a(this.f12422b, this.f12421a, this.f12423c, Boolean.valueOf(this.f12424d));
        }
    }

    protected a(long j10, String str, c.b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f12420a = j10;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Integer.parseInt(split[0]) * 60 * 60 * 1000) + (Integer.parseInt(split[1]) * 60 * 1000) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public boolean a(long j10) {
        return this.f12420a <= j10 && !e();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a aVar) {
        if (aVar != null) {
            long j10 = this.f12420a;
            long j11 = aVar.f12420a;
            if (j10 > j11) {
                return 1;
            }
            return j10 < j11 ? -1 : 0;
        }
        return 1;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, c());
        jSONObject.put("trackingMilliseconds", this.f12420a);
        return jSONObject;
    }
}
