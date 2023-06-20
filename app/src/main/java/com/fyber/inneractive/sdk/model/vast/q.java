package com.fyber.inneractive.sdk.model.vast;

import com.inmobi.media.au;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum q {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_FINAL_RETURN("finalReturn"),
    EVENT_IMPRESSION("impression"),
    EVENT_START("start"),
    EVENT_FIRSTQ("firstQuartile"),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ("thirdQuartile"),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE("mute"),
    EVENT_UNMUTE("unmute"),
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_PAUSE("pause"),
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_RESUME("resume"),
    EVENT_FULLSCREEN("fullscreen"),
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_EXIT_FULLSCREEN("exitFullscreen"),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK(au.CLICK_BEACON),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_VERIFICATION_NOT_EXECUTED("verificationNotExecuted"),
    EVENT_EXPAND("expand"),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    UNKNOWN("UnkownEvent");
    

    /* renamed from: u  reason: collision with root package name */
    public static final Map<String, q> f17474u = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f17476a;

    static {
        q[] values;
        for (q qVar : values()) {
            ((HashMap) f17474u).put(qVar.f17476a, qVar);
        }
    }

    q(String str) {
        this.f17476a = str;
    }

    public static q a(String str) {
        HashMap hashMap = (HashMap) f17474u;
        return hashMap.containsKey(str) ? (q) hashMap.get(str) : UNKNOWN;
    }
}
