package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdBase implements com.applovin.impl.sdk.a.a {
    protected final JSONObject adObject;
    protected final Object adObjectLock;
    private final long createdAtMillis;
    protected final JSONObject fullResponse;
    protected final Object fullResponseLock;
    protected final m sdk;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.adObject = jSONObject;
        this.fullResponse = jSONObject2;
        this.sdk = mVar;
        this.adObjectLock = new Object();
        this.fullResponseLock = new Object();
        this.createdAtMillis = System.currentTimeMillis();
    }

    protected boolean containsKeyForAdObject(String str) {
        boolean has;
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public abstract long getAdIdNumber();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        synchronized (this.adObjectLock) {
            booleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return booleanValue;
    }

    protected boolean getBooleanFromFullResponse(String str, boolean z10) {
        boolean booleanValue;
        synchronized (this.fullResponseLock) {
            booleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z10)).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getColorFromAdObject(String str, int i10) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i10;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getFloatFromAdObject(String str, float f10) {
        float f11;
        synchronized (this.adObjectLock) {
            f11 = JsonUtils.getFloat(this.adObject, str, f10);
        }
        return f11;
    }

    protected float getFloatFromFullResponse(String str, float f10) {
        float f11;
        synchronized (this.fullResponseLock) {
            f11 = JsonUtils.getFloat(this.fullResponse, str, f10);
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getIntFromAdObject(String str, int i10) {
        int i11;
        synchronized (this.adObjectLock) {
            i11 = JsonUtils.getInt(this.adObject, str, i10);
        }
        return i11;
    }

    protected int getIntFromFullResponse(String str, int i10) {
        int i11;
        synchronized (this.fullResponseLock) {
            i11 = JsonUtils.getInt(this.fullResponse, str, i10);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    protected JSONObject getJsonObjectFromFullResponse(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.fullResponseLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.fullResponse, str, jSONObject);
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long getLongFromAdObject(String str, long j10) {
        long j11;
        synchronized (this.adObjectLock) {
            j11 = JsonUtils.getLong(this.adObject, str, j10);
        }
        return j11;
    }

    protected long getLongFromFullResponse(String str, long j10) {
        long j11;
        synchronized (this.fullResponseLock) {
            j11 = JsonUtils.getLong(this.fullResponse, str, j10);
        }
        return j11;
    }

    public String getPrimaryKey() {
        return getStringFromAdObject("pk", "NA");
    }

    public m getSdk() {
        return this.sdk;
    }

    public String getSecondaryKey1() {
        return getStringFromAdObject("sk1", null);
    }

    public String getSecondaryKey2() {
        return getStringFromAdObject("sk2", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getStringFromAdObject(String str, String str2) {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getStringFromFullResponse(String str, String str2) {
        String string;
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }
}
