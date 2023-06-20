package com.applovin.impl.mediation.a;

import android.os.Bundle;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f7215a;

    /* renamed from: b  reason: collision with root package name */
    protected final m f7216b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f7217c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f7218d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f7219e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Object f7220f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private String f7221g;

    /* renamed from: h  reason: collision with root package name */
    private String f7222h;

    public f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f7216b = mVar;
        this.f7215a = jSONObject2;
        this.f7217c = jSONObject;
        this.f7218d = map;
    }

    private int a() {
        return b("mute_state", a("mute_state", ((Integer) this.f7216b.a(com.applovin.impl.sdk.c.a.K)).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject I() {
        JSONObject jSONObject;
        synchronized (this.f7220f) {
            jSONObject = this.f7215a;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject J() {
        JSONObject jSONObject;
        synchronized (this.f7219e) {
            jSONObject = this.f7217c;
        }
        return jSONObject;
    }

    public String K() {
        return b("class", (String) null);
    }

    public String L() {
        return b("name", (String) null);
    }

    public String M() {
        return L().split("_")[0];
    }

    public boolean N() {
        return b("is_testing", Boolean.FALSE).booleanValue();
    }

    public Boolean O() {
        String str = this.f7216b.p().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : b("huc") ? b("huc", Boolean.FALSE) : a("huc", (Boolean) null);
    }

    public Boolean P() {
        String str = this.f7216b.p().getExtraParameters().get("aru");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : b("aru") ? b("aru", Boolean.FALSE) : a("aru", (Boolean) null);
    }

    public Boolean Q() {
        String str = this.f7216b.p().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : b("dns") ? b("dns", Boolean.FALSE) : a("dns", (Boolean) null);
    }

    public String R() {
        return b("consent_string") ? b("consent_string", (String) null) : a("consent_string", (String) null);
    }

    public boolean S() {
        return b("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public Map<String, Object> T() {
        return this.f7218d;
    }

    public Bundle U() {
        Bundle bundle = c("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(a("server_parameters", (JSONObject) null)) : new Bundle();
        int a10 = a();
        if (a10 != -1) {
            bundle.putBoolean("is_muted", a10 == 2 ? this.f7216b.p().isMuted() : a10 == 0);
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, a(AppLovinEventParameters.REVENUE_AMOUNT, 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", a("currency", ""));
        }
        return bundle;
    }

    public Bundle V() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), U());
    }

    public long W() {
        return b("adapter_timeout_ms", ((Long) this.f7216b.a(com.applovin.impl.sdk.c.a.f8176l)).longValue());
    }

    public long X() {
        return b("init_completion_delay_ms", -1L);
    }

    public long Y() {
        return b("auto_init_delay_ms", 0L);
    }

    public String Z() {
        return this.f7222h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float a(String str, float f10) {
        float f11;
        synchronized (this.f7219e) {
            f11 = JsonUtils.getFloat(this.f7217c, str, f10);
        }
        return f11;
    }

    protected int a(String str, int i10) {
        int i11;
        synchronized (this.f7220f) {
            i11 = JsonUtils.getInt(this.f7215a, str, i10);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long a(String str, long j10) {
        long j11;
        synchronized (this.f7220f) {
            j11 = JsonUtils.getLong(this.f7215a, str, j10);
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f7220f) {
            bool2 = JsonUtils.getBoolean(this.f7215a, str, bool);
        }
        return bool2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str, String str2) {
        String string;
        synchronized (this.f7220f) {
            string = JsonUtils.getString(this.f7215a, str, str2);
        }
        return string;
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f7220f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f7215a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f7219e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f7217c, str, jSONObject);
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Object obj) {
        synchronized (this.f7219e) {
            JsonUtils.putObject(this.f7217c, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(String str, int i10) {
        int i11;
        synchronized (this.f7219e) {
            i11 = JsonUtils.getInt(this.f7217c, str, i10);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b(String str, long j10) {
        long j11;
        synchronized (this.f7219e) {
            j11 = JsonUtils.getLong(this.f7217c, str, j10);
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f7219e) {
            bool2 = JsonUtils.getBoolean(this.f7217c, str, bool);
        }
        return bool2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(String str, String str2) {
        String string;
        synchronized (this.f7219e) {
            string = JsonUtils.getString(this.f7217c, str, str2);
        }
        return string;
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f7219e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f7217c, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(String str) {
        boolean has;
        synchronized (this.f7219e) {
            has = this.f7217c.has(str);
        }
        return has;
    }

    protected Object c(String str) {
        Object opt;
        synchronized (this.f7219e) {
            opt = this.f7217c.opt(str);
        }
        return opt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, int i10) {
        synchronized (this.f7219e) {
            JsonUtils.putInt(this.f7217c, str, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, long j10) {
        synchronized (this.f7219e) {
            JsonUtils.putLong(this.f7217c, str, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, String str2) {
        synchronized (this.f7219e) {
            JsonUtils.putString(this.f7217c, str, str2);
        }
    }

    public void d(String str) {
        this.f7221g = str;
    }

    public void e(String str) {
        this.f7222h = str;
    }

    public List<String> f(String str) {
        if (str != null) {
            JSONArray a10 = a(str, new JSONArray());
            List list = Collections.EMPTY_LIST;
            List optList = JsonUtils.optList(a10, list);
            List optList2 = JsonUtils.optList(b(str, new JSONArray()), list);
            ArrayList arrayList = new ArrayList(optList.size() + optList2.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public String g(String str) {
        String b10 = b(str, "");
        return StringUtils.isValidString(b10) ? b10 : a(str, "");
    }

    public String getAdUnitId() {
        return a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f7221g;
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + K() + "', adapterName='" + L() + "', isTesting=" + N() + '}';
    }
}
