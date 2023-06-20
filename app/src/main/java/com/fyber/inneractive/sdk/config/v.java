package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.m0;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v implements m0.a {

    /* renamed from: a  reason: collision with root package name */
    public Set<Track> f17068a = null;

    @Override // com.fyber.inneractive.sdk.util.m0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<Track> set = this.f17068a;
        if (set != null) {
            for (Track track : set) {
                jSONArray.put(track);
            }
        }
        m0.a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
