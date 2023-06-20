package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ResizeProperties.java */
@ik
/* loaded from: classes3.dex */
public class de {
    public static final String DEFAULT_POSITION = "top-right";
    private static final String TAG = "de";
    Boolean allowOffscreen;
    String customClosePosition;
    int height;
    int offsetX = 0;
    int offsetY = 0;
    int width;

    public de(String str, Boolean bool) {
        this.customClosePosition = str;
        this.allowOffscreen = bool;
    }

    public static de a(String str, de deVar) {
        try {
            de deVar2 = (de) new ij().a(new JSONObject(str), (Class<Object>) de.class);
            if (deVar2 != null) {
                if (deVar2.customClosePosition == null) {
                    deVar2.customClosePosition = deVar == null ? DEFAULT_POSITION : deVar.customClosePosition;
                }
                if (deVar2.allowOffscreen == null) {
                    deVar2.allowOffscreen = Boolean.valueOf(deVar == null ? true : deVar.allowOffscreen.booleanValue());
                }
                return deVar2;
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
