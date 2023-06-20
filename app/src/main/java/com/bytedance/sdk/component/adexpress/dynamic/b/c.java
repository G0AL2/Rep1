package com.bytedance.sdk.component.adexpress.dynamic.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicCreative.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Object> f9561a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f9562b;

    public c(JSONObject jSONObject) {
        this.f9562b = jSONObject;
    }

    public Object a(String str) {
        if (this.f9561a.containsKey(str)) {
            return this.f9561a.get(str);
        }
        return null;
    }

    public boolean b(String str) {
        return this.f9561a.containsKey(str);
    }

    public void a() {
        Iterator<String> keys = this.f9562b.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = this.f9562b.opt(next);
            int i10 = 0;
            if (TextUtils.equals("image", next)) {
                if (opt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (i10 < jSONArray.length()) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                            if (optJSONObject != null) {
                                Iterator<String> keys2 = optJSONObject.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    Object opt2 = optJSONObject.opt(next2);
                                    HashMap<String, Object> hashMap = this.f9561a;
                                    hashMap.put(next + "." + i10 + "." + next2, opt2);
                                }
                            }
                            i10++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (opt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            Object opt3 = jSONObject.opt(next3);
                            if ((opt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i11 = 0; i11 < ((JSONArray) opt3).length(); i11++) {
                                    HashMap<String, Object> hashMap2 = this.f9561a;
                                    hashMap2.put(next + "." + next3 + "." + i11, ((JSONArray) opt3).opt(i11));
                                }
                            } else {
                                HashMap<String, Object> hashMap3 = this.f9561a;
                                hashMap3.put(next + "." + next3, opt3);
                            }
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            } else if (!(opt instanceof JSONObject)) {
                this.f9561a.put(next, opt);
                if (opt instanceof String) {
                    this.f9561a.put(next, opt);
                }
            } else if (opt != null) {
                JSONObject jSONObject2 = (JSONObject) opt;
                Iterator<String> keys4 = jSONObject2.keys();
                while (keys4.hasNext()) {
                    String next4 = keys4.next();
                    Object opt4 = jSONObject2.opt(next4);
                    HashMap<String, Object> hashMap4 = this.f9561a;
                    hashMap4.put(next + "." + next4, opt4);
                }
            }
        }
    }
}
