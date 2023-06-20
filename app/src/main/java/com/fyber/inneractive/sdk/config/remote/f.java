package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Track;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public Set<Track> f17036a = null;

    public static f a(JSONObject jSONObject) {
        Track fromValue;
        f fVar = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track");
        if (optJSONArray != null) {
            fVar = new f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                String optString = optJSONArray.optString(i10);
                if (!TextUtils.isEmpty(optString) && (fromValue = Track.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            fVar.f17036a = linkedHashSet;
        }
        return fVar;
    }
}
